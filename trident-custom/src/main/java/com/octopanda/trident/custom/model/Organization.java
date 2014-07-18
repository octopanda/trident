package com.octopanda.trident.custom.model;

public class Organization {
	public Organization() {}
	
	public Organization(Long id) {
		this.id = id;
	}
	
	public Organization(Long id, Long parentId, String name, String comments, Integer status) {
		this.id = id;
		this.parentId = parentId;
		this.name = name;
		this.comments = comments;
		this.status = status;
	}
	
	private Long id;
	private Long parentId;
	private String name;
	private String comments;
	private Integer status;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
