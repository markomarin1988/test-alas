package com.alasdoo.developercourseassignment.service;

import java.util.List;

import com.alasdoo.developercourseassignment.dto.TeacherDeveloperCourseDTO;

public interface TeacherDeveloperCourseService extends CrudService<TeacherDeveloperCourseDTO> {

	List<TeacherDeveloperCourseDTO> findByDeveloperCourseId(Integer developerCourseId);
	TeacherDeveloperCourseDTO findByTeacherId(Integer teacherId);
}
