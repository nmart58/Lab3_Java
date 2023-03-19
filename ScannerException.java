
package com.mycompany.testing;


public class ScannerException extends Exception {
    
    public ScannerException (String str) {
        
        super(str);
    }
    
    void CheckInputValues (Double a, Double b, Double h) throws ScannerException {
        
       
            
          if ((a>=0.000001 && a<=1000000) && (b>=0.000001 && b<=1000000) && (h>=0.000001 && h<=1000000))  {
             
              System.out.println("Проверка #1 пройдена!");
              
          }
            
            else {
              
                System.out.println("Проверка #1 НЕ пройдена!");
                throw new ScannerException("Что-то пошло не так... Вы вышли за диапазон (0.000001 - 1000000)");
                
            }
      
    }
    
    void CheckUpDowmLimits (Double a, Double b) throws ScannerException {
       
        if (b<=a) {
           
            System.out.println("Проверка #2 НЕ пройдена!");
            System.out.println("\n-----------------------------");
            throw new ScannerException("Упс... Верхняя граница не может меньше нижней!");
            
        }
        else {
             System.out.println("Проверка #2 пройдена!");
             System.out.println("\n-----------------------------");
        }
    }
}
