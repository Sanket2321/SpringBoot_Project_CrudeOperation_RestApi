package com.tka.SpringFirst;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
   @Autowired
   SubjectRepo repo;
	public List<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		ArrayList<Subject> subjects=new ArrayList<>();
		repo.findAll().forEach(subjects::add);
		return subjects;
	}
	public void addSubjects(Subject subject) {
		 repo.save(subject);
		// TODO Auto-generated method stub
		
	}
	public void updateSubject(int sid, Subject subject) {
		subject.setSid(sid);
		repo.save(subject);// TODO Auto-generated method stub
		
		
	}
	
	public void DeleteSubject(int id)
	{


		repo.deleteById(id);
		
	}





}
