package example;

import javax.validation.constraints.Null;

public class ExceptionExample {

        public static void main(String args[]){
            String str = null;
            try {
                System.out.println(str.length());
            } catch (NullPointerException e) {
                e.printStackTrace();
            }

        }
    }

