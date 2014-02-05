package br.com.gamer.controladores;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.gamer.dao.DAOFabricante;
import br.com.gamer.entidades.Fabricante;

@Controller
public class FabricanteController {

	@Autowired
	private DAOFabricante daoFabricante;

	public DAOFabricante getDaoFabricante() {
		return daoFabricante;
	}

	public void setDaoFabricante(DAOFabricante daoFabricante) {
		this.daoFabricante = daoFabricante;
	}

	@RequestMapping("/registroFabricante")
	public ModelAndView registroFabricante(ModelAndView mav) {
		if (mav.getModel().get("fabricante") == null) {
			Fabricante fab = new Fabricante();
			mav.getModel().put("fabricante", fab);

		}
		mav.setViewName("registroFabricante");
		return mav;
	}

	@RequestMapping(value = "/executarRegistroFab", method = RequestMethod.POST)
	public ModelAndView guardarFabricante(@Valid Fabricante fabricante,
			BindingResult bindingResult, HttpSession sessao) {
		ModelAndView mav = new ModelAndView("index");

		if (bindingResult.hasErrors()) {
			mav.getModel().put("fabricante", fabricante);
			return registroFabricante(mav);
		}
		getDaoFabricante().persistir(fabricante);
		sessao.setAttribute("fabricante", fabricante);
		return mav;
	}
}
