package graduate.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import graduate.domain.Account;
import graduate.sevice.AccountSevice;

@Controller
@RequestMapping("tfive/account")
public class LoginController {
	@Autowired
	AccountSevice accountSevice;
	@GetMapping("login")
	public String viewLogin(ModelMap model,@ModelAttribute("Account") Account account) {
		
		Account u = new Account();
		model.addAttribute("acc",u);
		model.addAttribute("ACTION","create");
			return "customerUI/login";
		}
	@PostMapping("/create")
	public String saveorUpdate(Model model ,@ModelAttribute("acc") Account account) {

		if(account.getPassword().equals(account.getPassword2())) {
			accountSevice.save(account);
			
			model.addAttribute("mess","đăng ký thành công");
		}else {
			model.addAttribute("mess","đăng ký thất bại");
		}
		
		return "customerUI/login";
	}
		
		
	}
	

