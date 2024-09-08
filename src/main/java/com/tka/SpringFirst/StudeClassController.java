package com.tka.SpringFirst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class StudeClassController {
	@GetMapping("welcome1")
	public String getWelcomeMessage(){
		return "i am in controller class";
		
	}
	@Autowired
	SubjectService s;
	@GetMapping("getsubjects1")
	   public List<Subject> getAllSubjects() {
		return s.getAllSubjects();
	}
	@PostMapping("addsubject")
	public void addSubjects(@RequestBody Subject subject)
	{
		s.addSubjects(subject);
	}
	

   // @GetMapping("fetchClassroomDetailsById/{clsId}")
    
    //public Classroom ClassroomDetailsById(@PathVariable("clsId")  int clsId)
	@PutMapping("updatesubject/{sid}")
	public void updateSubject(@PathVariable("sid") int sid,@RequestBody Subject subject)
	{
		subject.setSid(sid);
		s.updateSubject(sid,subject);
	}
	@DeleteMapping("/deletesubject/{sid}")
	public void deleteSubject(@PathVariable("sid") Integer sid) {
	    if (sid != null) {
	        s.DeleteSubject(sid);
	    } else {
	        // Handle the case where sid is null
	        throw new IllegalArgumentException("Subject ID cannot be null");
	    }
	}


}
