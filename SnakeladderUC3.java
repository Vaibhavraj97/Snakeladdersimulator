package com.bridgelabz.snakeladder;
import java.util.Random;

public class SnakeladderUC3 {
		 static int option = 0;
	     static int playerOne=0;
	     static int switchPlayer=0;
	     
	     public static int optionCheck(){
	         Random r = new Random();
	         int random =r.nextInt(3)+1;
	         return random;
	       }

	    public static void play(){

	             if( switchPlayer % 1 == 0 ){

	             System.out.println("For Player 1 ");
	             option=optionCheck();

	             if (option == 2){//for ladder//

	                System.out.println("Option is for Ladder");
	               

	               }

	            else if (option == 3){//for snake//
	            	
	               System.out.println("Option is for Snake");
	               

	               }

	            else if (option == 1){//for no-play//
	            	
	              System.out.println("Option is No-Play");
	            }
	             }
	    }
	            	
	     public static void main(String[] args) {
	    	 
	    	 SnakeladderUC3 object=new SnakeladderUC3();
	    	 object.optionCheck();
	    	 object.play();
	     }
	             
	    }



	    


