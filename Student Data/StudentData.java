package com.data;

public class StudentData {
    public static void main(String[] args) {
        Student s[] = new Student [10];
        s[0] = new Student("Akask",22,4001,"Mech","101, Karanodai, Tiruvallur");
        s[1] = new Student("Aravind",21,4002,"Mech","243, Kamarapalayam, Theni");
        s[2] = new Student("Bala",24,4003,"Mech","290, Puduvalavu, Pudukottai");
        s[3] = new Student("Balaji",22,4004,"Mech","621, Puduvayal, Sivaganga");
        s[4] = new Student("Chandru",22,4005,"Mech","443, Gandhi Nagar, Coimbatore");
        s[5] = new Student("Dhanush", 23,4006,"Mech","588, Ponnamaravathi , Pudukottai");
        s[6] = new Student("Dinesh",22,4007,"Mech","934, Pillamangalam, Sivaganga");
        s[7] = new Student("Elavarasan",23,4008,"Mech","487, Viralimalai, Trichy");
        s[8] = new Student("Govind",23,4009,"Mech", "565, Vadakur, Ramanathapuram");
        s[9] = new Student("Hari", 24,4010,"Mech","346, Manali, Chennai");
        int n = 0;
        for(int i = 0 ; i < s.length ; i++)
        {
            System.out.println("Student " + ++n);
            System.out.println(s[i].display());
            System.out.println();
        }
    }
}
