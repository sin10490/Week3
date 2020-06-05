/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentDemo;

/**
 *
 * @author Gurjit
 */
public class StudentData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //char[] pillbox=new char[7];
        //array of StudentDemo objects
        Data [] list = new Data[3];
        
        Data s1 = new Data();
        Data s2 = new Data();
        Data s3 = new Data();
        
        s1.setName("Gurjit Singh");
        s1.setAge(19);
        
        s2.setName("Sandeep Singh");
        s2.setAge(19);
        
        s3.setName("Singh");
        s3.setAge(20);
        
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        
        System.out.println( "Name:" + list[0].getName()+ "  Age:" + list[0].getAge() );
        System.out.println( "Name:" + list[1].getName()+ "  Age:" + list[1].getAge() );
        System.out.println( "Name:" + list[2].getName()+ "  Age:" + list[2].getAge() );
    }
}    

