package tech.codeblack.models;

import javax.persistence.*;

@Entity
@Table(name = "leads")
public class Lead {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private long phone;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "website_url")
    private String website;

    @Column(name = "budget")
    private long budget;
}
