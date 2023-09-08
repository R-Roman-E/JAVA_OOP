package HW_2;

public class test2 implements test1{
    int age;
   

    public test2(){
      age = 11;
       
    }
    public int getNext(){
     age = 11;

       return age;
     
    }

    public void reset(){

     age = 10;

    }

    public void setNum(int x){
   
       age = x;
       
    }

    
}
