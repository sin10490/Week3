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
public class Data {
   private String name;
   private int age;
   
   Data()
   {
       String name;
       int age;
   }
   /**
    * 
    * @param Name 
    */
   public void setName(String Name)
   {
       name = Name;
   }
   /**
    * GETTER
     * @return 
    */
   public String getName()
   {
       return name;
   }
   
   public void setAge(int Age)
   {
       age = Age;
   }
   /**   
     * @return 
    */
   public int getAge()
   {
       return age;
   }

}
