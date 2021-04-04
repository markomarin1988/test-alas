package com.alasdoo.developercourseassignment.dto;

import java.io.Serializable;

public class TeacherDeveloperCourseDTO implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
    private Integer developerCourseId;
    private Integer teacherId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeveloperCourseId() {
        return developerCourseId;
    }

    public void setDeveloperCourseId(Integer developerCourseId) {
        this.developerCourseId = developerCourseId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer developerCourseTeacherId) {
        this.teacherId = developerCourseTeacherId;
    }
}
