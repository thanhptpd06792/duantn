package graduate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import graduate.domain.Account;
import graduate.sevice.AccountSevice;



@Controller

public class testcontroller {
	@Controller
	public class formcontroller {
		@Autowired
		AccountSevice accountSevice;
		
		@GetMapping("/")
		public String addoredit(Model model) {
				Account u = new Account();
//				u.setFirstName("Thanh");
				model.addAttribute("USER",u);
				model.addAttribute("ACTION","saveorUpdate");
			return"test/a";
		}
			@PostMapping("/saveorUpdate")
			public String saveorUpdate(Model model ,@ModelAttribute("USER") Account user) {
//				UserDao dao = new UserDao();
//				dao.save(user);
				accountSevice.save(user);
				model.addAttribute("USERS",accountSevice.findAll());
				return"test/a";
			}
	
	}
}
