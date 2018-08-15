
package com.sj.spring.jpa.springJpa.model;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
//import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Data
public class UserMaster extends AuditModel{
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @Size(min = 3, max = 80)
    private String name;

    @NotBlank
    @Size(min = 10, max = 10)
    private String mobile;
    
    @NotBlank
    @Size(min = 5, max = 100)
    @Email
    private String email;
    
    @NotBlank
    @Size(min = 6, max = 100)
    private String password;
    
      
    @Transient
    //@NotBlank
    @Size(min = 6, max = 100)
    private String mPassword;
    
    private Long entityId;
    
    @NotBlank
    @Size(min = 6, max = 6)
    private String pin;
    
    @Column(name="country", columnDefinition="Varchar(20) default 'IN'")
    private String country;
    
    private String state;
    private String district;
    private String town;
    private String address;
    
    
    @Past
    private Date dob;
    
    @Enumerated
    @Column(columnDefinition = "smallint default 0")
    private UserStatusEnum status;
    
    @Enumerated
    @Column(columnDefinition = "smallint default 0")
    private FirstLoginFlagEnum firstLoginFlag;

    @Column(columnDefinition = "smallint default 0")
    private int incorrectAttemptCount;

    private Timestamp lastAccessDateTime;

    
    
    
    


	

}
