package TestData;

public class RegistrationTestUserData {
    /* This class is just the template for user's dataset as object*/

    public String firstname;
    public String lastname;
    public String email;
    public String gender;
    public String mobile;
    public String birthDate;
    public String subjects;
    public String hobbies;
    public String picture;
    public String address;
    public String state;
    public String city;

    public RegistrationTestUserData(String firstname, String lastname, String email, String gender, String mobile,
                                    String birthDate, String subjects, String hobbies, String picture, String address, String state,
                                    String city){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.mobile = mobile;
        this.birthDate = birthDate;
        this.subjects = subjects;
        this.hobbies = hobbies;
        this.picture = picture;
        this.address = address;
        this.state = state;
        this.city = city;
    }
}
