/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gitmaven;

/**
 *
 * @author LNSBG31
 */
public class BranchClass 
{
    public String name; 
    public String version; 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "BranchClass{" + "name=" + name + ", version=" + version + '}';
    }

  
    
    
    
    
}
