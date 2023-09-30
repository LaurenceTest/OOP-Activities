/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version4;

/**
 *
 * @author User
 */
public class Name {
    private String firstName = "";
    private String middleName = "";
    private String lastName = "";
    private String[] suffix = {""};

    public Name(String firstName, String middleName, String lastName, String ...suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Name(String firstName) {
        this.firstName = firstName;
    }

    public Name(Name self){
        this.firstName = self.firstName;
        this.middleName = self.middleName;
        this.lastName = self.lastName;
        this.suffix = self.suffix;
    }

    public Name(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String[] getSuffix(){
        return suffix;
    }

    public String getSuffixString() {
        String suffixes = "";
        int i;
        for(i = 0; i < suffix.length ; i++){
            suffixes += i + 1 != suffix.length ? suffix[i] + ", ": suffix[i];
        }
        return suffixes;
    }

    public void setSuffix(String[] suffix) {
        this.suffix = suffix;
    }

    @Override
    public String toString() {
        String middleName = this.middleName != "" ? " " + this.middleName.charAt(0) + "." : "";
        String lastName = this.lastName != "" ? " " + this.lastName : "";
        return firstName + middleName + lastName + (getSuffixString().length() > 0 ? " " + getSuffixString() : "");
    }
}
