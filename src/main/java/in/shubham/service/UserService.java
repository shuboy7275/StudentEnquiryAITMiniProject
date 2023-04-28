package in.shubham.service;

import in.shubham.binding.LoginForm;
import in.shubham.binding.SignUpForm;
import in.shubham.binding.UnlockForm;



public interface UserService {
	
	public String login(LoginForm form); 
	
	public boolean signup(SignUpForm form);
	
	public boolean unlockAccount(UnlockForm form);
	
	public boolean forgotPwd(String email);
	
	

}
