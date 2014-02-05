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
import br.com.gamer.dao.DAOJogo;
import br.com.gamer.entidades.Jogo;

@Controller
public class JogoController {

	@Autowired
	private DAOConsole daoConsole;
	@Autowired
	private DAOJogo daoJogo;
	@Autowired
	private DAOFabricante daoFabricante;

	public DAOConsole getDaoConsole() {
		return daoConsole;
	}

	public void setDaoConsole(DAOConsole daoConsole) {
		this.daoConsole = daoConsole;
	}

	public DAOJogo getDaoJogo() {
		return daoJogo;
	}

	public void setDaoJogo(DAOJogo daoJogo) {
		this.daoJogo = daoJogo;
	}

	public DAOFabricante getDaoFabricante() {
		return daoFabricante;
	}

	public void setDaoFabricante(DAOFabricante daoFabricante) {
		this.daoFabricante = daoFabricante;
	}

	@RequestMapping("/registroJogo")
	public ModelAndView registroJogo(ModelAndView mav) {
		if (mav.getModel().get("jogo") == null) {
			Jogo jogo = new Jogo();

			mav.getModel().put("jogo", jogo);
		}

		if (mav.getModel().get("fabricantes") == null
				|| mav.getModel().get("consoles") == null) {

			mav.getModel().put("fabricantes", getDaoFabricante().list(0, 100));
			mav.getModel().put("consoles", getDaoConsole().list(0, 100));
		}
		mav.setViewName("registroJogo");

		return mav;
	}

	@RequestMapping(value = "/executarRegistroJogo", method = RequestMethod.POST)
	public ModelAndView guardarJogo(@Valid Jogo jogo,
			BindingResult bindingResult, HttpSession sessao) {
		ModelAndView mav = new ModelAndView("index");
		if (bindingResult.hasErrors()) {
			mav.getModel().put("jogo", jogo);
			mav.getModel()
					.put("fabricantes", sessao.getAttribute("fabicantes"));
			mav.getModel().put("consoles", sessao.getAttribute("consoles"));
			return registroJogo(mav);
		}

		getDaoJogo().persistir(jogo);
		sessao.setAttribute("jogo", jogo);

		return mav;
	}
}
