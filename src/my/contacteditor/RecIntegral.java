/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.contacteditor;

import java.util.LinkedList;

/**
 *
 * @author user
 */
public class RecIntegral{
    private LinkedList<String> linkedList = new LinkedList();
    
    RecIntegral(String lowerBound, String upperBound, String step, String result){
        this.linkedList.add(0, lowerBound);
        this.linkedList.add(1, upperBound);
        this.linkedList.add(2, step);
        this.linkedList.add(3, result);
    }
    
    public void addCalcResult(String result){
        this.linkedList.add(3, result);
        this.linkedList.remove(4);
    }
    
    public String getLowerBound(){
        return this.linkedList.get(0);
    }
    
    public String getUpperBound(){
        return this.linkedList.get(1);
    }
    
    public String getStep(){
        return this.linkedList.get(2);
    }
    
    public String getResult(){
        return this.linkedList.get(3);
    }
}
