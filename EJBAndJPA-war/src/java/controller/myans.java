/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author afrin
 */
@Named(value = "myans")
@SessionScoped
public class myans implements Serializable {

    static List <String> ans=new ArrayList<String>();
    static int mark=0;
    
    public myans() {
        
    }

    public List<String> getAns() {
        return ans;
    }

    public void setAns(List<String> ans) {
        this.ans = ans;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
    
    public void submit(String input)
    {
        String now=input;
        ans.add(now);
    }
    public void calculate()
    {
        List <String> actans=new ArrayList<String>();
    actans.add("D"); actans.add("A"); actans.add("A");
    actans.add("B"); actans.add("A");actans.add("A");
    actans.add("C"); actans.add("C"); actans.add("A");
    actans.add("B");    
    mark=0;
        for(int i=0;i<ans.size();i++)
        {
            if(ans.get(i).equals(actans.get(i))) mark++;
        }
        System.out.println(mark);
    }
}
