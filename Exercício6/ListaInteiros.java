import java.util.*;
public class ListaInteiros implements Comparable<Integer>{

    public static void main(String[] args){
        
        List<Integer> lista = new ArrayList<Integer>();       
        List<Integer> lista2 = new ArrayList<Integer>();
        Random aleatorio = new Random(); 
        for(int i= 0; i<100; i++){
            int valor = aleatorio.nextInt(100);
            lista.add(valor);
        }  
        for(Integer inteiro: lista){                  
            lista2.add(lista.get(inteiro));
        }       
        Collections.sort(lista2);
        for(int i= 0; i<100; i++){            
            System.out.print(lista2.get(i)+" - ");
        }                                      
    }   
}