package com.groupass.MUISchedule.mainsystem.scheduleAlgo;

import com.groupass.MUISchedule.mainsystem.entities.Priority;
import com.groupass.MUISchedule.mainsystem.services.IPriorityService;
import com.groupass.MUISchedule.subsystem.entities.Block;
import com.groupass.MUISchedule.subsystem.entities.Entry;
import com.groupass.MUISchedule.subsystem.entities.Section;
import com.groupass.MUISchedule.subsystem.entities.Student;
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


    public static void start(Long id){
        Random random = new Random();

        Entry entry = subSystem.getEntryById(id);

        List<Block> blocks = entry.getBlockSet();

//        if error happened this might be the reason.
        List<Student> students = subSystem.getStudentByEntry(entry);

//        blocks.stream().map(data->{
//
//            int rand = random.nextInt(students.size());
//
//            Student student = students.get(rand);
//
//            return data;
//        }
//        ).collect(Collectors.toList());

        for (Block blk: blocks) {

            int rand = random.nextInt(students.size());

            Student student = students.get(rand);

            List<Section> sections = findSectionForStudent(student,blk);



        }


    }

    private static List<Section> findSectionForStudent(Student student, Block blk) {



            List<Priority> priorities = priorityService.findByIdList(student.getId());

            priorities.stream().map(data->{
               Section section =  service.findById(data.getSectionId());
               if (section.getBlockCourse().getBlock().equals(blk)){
                   return data;
               }
               return null;
            }).collect(Collectors.toList());

        return null;
    }


}
