package com.hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@Data
@Entity
@Table(name="staff_users")
public class Staff extends User {

	
			@Id
			@Column(name="name")
			private String name;
			
			@Column(name="surname")
			private String surname;
			
			

}