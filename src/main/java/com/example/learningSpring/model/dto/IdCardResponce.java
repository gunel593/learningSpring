package com.example.learningSpring.model.dto;

import com.example.learningSpring.model.entity.IdCard;

import java.util.Objects;

public class IdCardResponce {
    private Long id;
    private String name;
    private String surname;
    private Integer age;
    private String fin_code;
    private String series;
    private String serial_number;

    public IdCardResponce(Long id,
                          String name,
                          String surname,
                          Integer age,
                          String fin_code,
                          String series,
                          String serial_number) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.fin_code = fin_code;
        this.series = series;
        this.serial_number = serial_number;
    }

    public static IdCardBuilder builder() {
        return new IdCardBuilder();
    }

    public static class IdCardBuilder {
        private Long id;
        private String name;
        private String surname;
        private Integer age;
        private String fin_code;
        private String series;
        private String serial_number;

        public IdCardBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public IdCardBuilder name(String name) {
            this.name = name;
            return this;
        }

        public IdCardBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public IdCardBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public IdCardBuilder fin_code(String fin_code) {
            this.fin_code = fin_code;
            return this;
        }

        public IdCardBuilder series(String series) {
            this.series = series;
            return this;
        }

        public IdCardBuilder serial_number(String serial_number) {
            this.serial_number = serial_number;
            return this;
        }

        public IdCardResponce build() {
            IdCardResponce idCard =
                    new IdCardResponce(
                            this.id,
                            this.name,
                            this.surname,
                            this.age,
                            this.fin_code,
                            this.series,
                            this.serial_number
                    );
            return idCard;
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFin_code() {
        return fin_code;
    }

    public void setFin_code(String fin_code) {
        this.fin_code = fin_code;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdCardResponce idcard = (IdCardResponce) o;
        return id == idcard.id &&
                age == idcard.age &&
                Objects.equals(name, idcard.name) &&
                Objects.equals(surname, idcard.surname) &&
                Objects.equals(fin_code, idcard.fin_code) &&
                Objects.equals(series, idcard.series) &&
                Objects.equals(serial_number, idcard.serial_number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, age, fin_code, series, serial_number);
    }

    @Override
    public String toString() {
        return "IdCardResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", finCode='" + fin_code + '\'' +
                ", series='" + series + '\'' +
                ", serialNumber='" + serial_number + '\'' +
                '}';
    }
}