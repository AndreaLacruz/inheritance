package ar.com.ada.oop.override;

import java.util.Objects;

public class Person {

    private String name, lastName;

    public Person() {
    }

    public Person(String name1) {
        this.name = name1;
    }

    public Person(String name1, String lastName1) {
        this.name = name1;
        this.lastName = lastName1;
    }

    public void setName(String name1){
        this.name = name1;
    }

    public  String getName(){
        return name;
    }

    public void setLastName( String lastName1){
        this.lastName = lastName1;
    }

    @Override
    public String toString(){
        return "Persona: name " + this.name + " LastName " + this.lastName;

    }

    @Override
    public int hashCode(){
        return -33 * Objects.hash(this.name , this.lastName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Person that = (Person) obj;

        boolean tmp = this.name.equals(that.name) && this.lastName.equals(that.lastName);

        return tmp;
    }
}
