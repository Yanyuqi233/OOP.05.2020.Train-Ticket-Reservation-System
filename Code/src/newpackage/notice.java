/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Administrator
 */
public class notice {
    static void update(String sql, String time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String content;
    
    public notice()
    {
       super(); 
    }
    public notice(String content)
    {
        super();
        content=content;
    }
    
    public String Getcontent(){
        return content;
    }
    public void setcontent(String content)
    {
        this.content=content;
    }
}
