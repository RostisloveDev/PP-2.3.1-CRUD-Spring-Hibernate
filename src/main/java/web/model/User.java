package web.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="users")
public class User {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="telephone_number")
    @NotEmpty(message = "enter telephone number")
    private String telephoneNumber;

    @Column(name="email")
    @Email(message = "invalid email")
    @NotEmpty(message = "enter email")
    private String email;

    @Column(name="nickname")
    @NotEmpty(message = "enter nickname")
    private String nickname;

    @Column(name="first_name")
    @NotEmpty(message = "enter first name")
    private String firstName;

    @Column(name="last_name")
    @NotEmpty(message = "enter last name")
    private String lastName;

    @Column(name = "year_of_birth")
    @Min(1900)
    @NotNull(message = "enter year of birth")
    private Integer yearOfBirth;

    public User() {}

    public User(Long id, String telephoneNumber, String email, String nickname, String firstName, String lastName, int yearOfBirth) {
        this.id = id;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.nickname = nickname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
