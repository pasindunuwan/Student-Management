
package com.sms.StudentManagementSystem.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity


@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String bod;
    @Column
    private int nic;
    @Column
    private String address;
}
