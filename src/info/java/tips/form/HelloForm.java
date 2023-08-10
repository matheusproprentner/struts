package info.java.tips.form;

import org.apache.struts.action.ActionForm;

public class HelloForm extends ActionForm {

	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
