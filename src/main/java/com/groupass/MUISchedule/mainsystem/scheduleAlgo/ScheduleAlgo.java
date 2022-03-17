package com.groupass.MUISchedule.mainsystem.scheduleAlgo;

import com.groupass.MUISchedule.mainsystem.entities.Priority;
import com.groupass.MUISchedule.mainsystem.entities.StudentSchedule;
import com.groupass.MUISchedule.mainsystem.services.IPriorityService;
import com.groupass.MUISchedule.mainsystem.services.IStudentScheduleService;
import com.groupass.MUISchedule.subsystem.entities.*;
import com.groupass.MUISchedule.subsystem.facade.ICourseRegSubSystem;
import com.groupass.MUISchedule.subsystem.services.ISectionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@AllArgsConstructor
public class ScheduleAlgo {

    @Autowired
    private static ICourseRegSubSystem subSystem;

    @Autowired
    private static IPriorityService priorityService;

    @Autowired
    private static ISectionService service;

    @Autowired
    private static IStudentScheduleService studentScheduleService;


    public static void start(Long id){
        Random random = new Random();

        Entry entry = subSystem.getEntryById(id);

        List<Block> blocks = entry.getBlockSet();

//        if error happened this might be the reason.
        List<Student> students = subSystem.getStudentByEntry(entry);


        for (Block blk: blocks) {

            int rand = random.nextInt(students.size());

            Student student = students.get(rand);

            List<Priority> priorities = priorityService.getAllPriority();
            List<Priority> specPrio = priorities.stream().filter(data-> data.getId().equals(student.getId()))
                    .collect(Collectors.toList());

            for (Priority p: specPrio) {
                Section sec = subSystem.getSection(p.getSectionId());
                if(sec.getBlockCourse().getBlock().equals(blk)){
                    Course course = sec.getBlockCourse().getCourse();
                    if(sec.getBlockCourse().getCapacity() > 0){
                        if(course.getPrerequisite().isEmpty()){
                            //save the course on the scheduleService

                            studentScheduleService.save(new StudentSchedule(null,student.getId(), sec.getId()));
                        }else {
                            int i=0;
                            List<StudentSchedule> studentSchedules = studentScheduleService.getAllStudentSchedule();
                            List<StudentSchedule> specStudentSched = studentSchedules.stream().filter(data-> data.getId().equals(student.getId()))
                                    .collect(Collectors.toList());
                            for(Course c: course.getPrerequisite()){
                                for (StudentSchedule ss: specStudentSched) {
                                    if (subSystem.getSection(ss.getSectionId()).getBlockCourse().getCourse().equals(c)){
                                        studentScheduleService.save(new StudentSchedule(null,student.getId(), sec.getId()));
                                        i=1;
                                        return;
                                    }
                                }
                                if (i==1)return;
                            }
                        }
                    }
                }
            }
        }
    }


}
