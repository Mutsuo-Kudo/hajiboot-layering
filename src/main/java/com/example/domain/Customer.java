/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author mukudo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private Integer id;
    private String firstName;
    private String lastName;
}
