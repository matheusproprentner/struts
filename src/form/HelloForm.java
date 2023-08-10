package form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import lombok.Data;
import model.User;

@Data
public class HelloForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String name = "";
	
	public  String password = "";

	
	List<User> list;
	
}
