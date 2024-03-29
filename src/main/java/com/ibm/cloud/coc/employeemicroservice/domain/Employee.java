/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibm.cloud.coc.employeemicroservice.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;


/**
 *
 * @author PravinDeshmukh
 */

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Employee implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;    
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String department;
}
