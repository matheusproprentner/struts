package action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import form.HelloForm;
import model.User;

public class HelloAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HelloForm helloForm = (HelloForm) form;

		ActionForward fw = mapping.getInputForward();

		if (helloForm != null && !helloForm.getName().isEmpty() && !helloForm.getPassword().isEmpty()) {
			fw = mapping.findForward("success");
			List<User> list = new ArrayList();
			list.add(new User("José", "Silva", 32));
			list.add(new User("Vitor", "Soares", 49));
			list.add(new User("Lara", "Alves", 25));
			helloForm.setList(list);
		} else {
			ActionErrors errs = new ActionErrors();
			errs.add("", new ActionMessage("hello.msg.err"));

			saveErrors(request, errs);
		}
		return fw;
	}
}
