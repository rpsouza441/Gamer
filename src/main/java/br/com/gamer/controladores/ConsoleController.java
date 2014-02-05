package br.com.gamer.controladores;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.gamer.dao.DAOConsole;
import br.com.gamer.dao.DAOFabricante;
import br.com.gamer.entidades.Console;

@Controller
public class ConsoleController {

	@Autowired
	private DAOFabricante daoFabricante;
	@Autowired
	private DAOConsole daoConsole;

	public DAOConsole getDaoConsole() {
		return daoConsole;
	}

	public void setDaoConsole(DAOConsole daoConsole) {
		this.daoConsole = daoConsole;
	}

	public DAOFabricante getDaoFabricante() {
		return daoFabricante;
	}

	public void setDaoFabricante(DAOFabricante daoFabricante) {
		this.daoFabricante = daoFabricante;
	}

	@RequestMapping("/registroConsole")
	public ModelAndView registroConsole(ModelAndView mav) {

		/*if (mav.getModel().get("console") == null) {
			System.out.println("dentro do if");
			Console console = new Console();
			mav.getModel().put("console", console);
			if (mav.getModel().get("console") == null) {
				System.out.println("errado");
			} else {
				System.out.println("certo");
			}
		} else {
			Console c1 = new Console();
			c1 = (Console) mav.getModel().get("console");
			System.out.println(c1.getNome());
		}*/

		if (mav.getModel().get("console") == null) {
			Console console = new Console();
			mav.getModel().put("console", console);

		}

		if (mav.getModel().get("fabricantes") == null) {
			mav.getModel().put("fabricantes", getDaoFabricante().list(0, 100));
		}
		
		mav.setViewName("registroConsole");
		return mav;
	}

	@RequestMapping(value = "/executarRegistroConsole", method = RequestMethod.POST)
	public ModelAndView guardarConsole(@Valid Console console,
			BindingResult bindingResult, HttpSession sessao) {

		ModelAndView mav = new ModelAndView("index");

		if (bindingResult.hasErrors()) {
			mav.getModel().put("console", console);
			mav.getModel().put("fabricantes",
					sessao.getAttribute("fabricantes"));
			return registroConsole(mav);
		}
		getDaoConsole().persistir(console);
		sessao.setAttribute("console", console);
		return mav;
	}
}
