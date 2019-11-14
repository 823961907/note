package cn.strutstest;

public class HelloWorldAction {
 
    private String name;
 
    public String execute() throws Exception {
 
	System.out.println("getName:" + getName());
 
	if (getName().equals("") || getName() == null) {
	    return "error";
	} else {
	    return "success";
	}
    }
 
    public String getName() {
	return name;
    }
 
    public void setName(String name) {
	this.name = name;
    }
}
