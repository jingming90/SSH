package base;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements SessionAware,
		ApplicationAware, RequestAware {
/*
	protected HttpServletRequest request = ServletActionContext.getRequest();
	protected HttpSession session = ServletActionContext.getRequest()
			.getSession();
	protected ServletContext context = ServletActionContext.getRequest()
			.getServletContext();*/

	private Map<String, Object> req;
	private Map<String, Object> app;
	private Map<String, Object> ses;

	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.req = arg0;
	}

	@Override
	public void setApplication(Map<String, Object> arg0) {
		this.app = arg0;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.ses = arg0;
	}

}
