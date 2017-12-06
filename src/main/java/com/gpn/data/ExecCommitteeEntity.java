/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation,
 * or translation without prior written permission is prohibited except as allowed under the
 * copyright laws.
 */

package com.gpn.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <code>SideEntity</code> The POJO entity class which holds the Road Side data in REST API of Gopal Nagar Colony.
 *
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ExecCommittee")
@XmlType(propOrder = {"id", "name", "role"})
@JsonInclude(Include.NON_NULL)
@Entity
@Table(name = "gpn_exec_committee")
public class ExecCommitteeEntity implements Gpn, Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @XmlElement(name = "id")
  @Column(name = "id")
  private long id = 0L;

  @XmlElement(name = "name")
  @Column(name = "name")
  private String name = null;

  @XmlElement(name = "role")
  @Column(name = "role")
  private String role = null;

  @XmlElement(name = "startDate")
  @Column(name = "start_date")
  private String startDate;

  @XmlElement(name = "endDate")
  @Column(name = "end_date")
  private String endDate;

  @XmlElement(name = "status")
  @Column(name = "status")
  private String status;

  /**
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * @param id
   *             the id to set
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * @return the name
   */
  public String getName() {
    return getStr(name);
  }

  /**
   * @param name
   *             the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ExecCommitteeEntity() {
    super();
  }

  public ExecCommitteeEntity(long id, String name) {
    super();
    this.id = id;
    this.name = name;
  }

  public ExecCommitteeEntity(long id, String name, String role) {
    super();
    this.id = id;
    this.name = name;
    this.role = role;
  }
}