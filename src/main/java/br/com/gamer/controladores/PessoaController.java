package br.com.gamer.controladores;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.gamer.dao.DAOConsole;
import br.com.gamer.dao.DAOFabricante;
import br.com.gamer.dao.DAOJogo;
import br.com.gamer.dao.DAOPermissaoPessoa;
import br.com.gamer.dao.DAOPessoa;
import br.com.gamer.entidades.Pessoa;

@Controller
public class PessoaController {
	@Autowired
	private DAOPessoa daoPessoa;
	@Autowired
	private DAOConsole daoConsole;
	@Autowired
	private DAOJogo daoJogo;
	@Autowired
	private DAOPermissaoPessoa daoPermissaoPessoa;
	@Autowired
	private DAOFabricante daoFabricante;

	public DAOPessoa getDaoPessoa() {
		return daoPessoa;
	}

	public void setDaoPessoa(DAOPessoa daoPessoa) {
		this.daoPessoa = daoPessoa;
	}

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

	public DAOPermissaoPessoa getDaoPermissaoPessoa() {
		return daoPermissaoPessoa;
	}

	public void setDaoPermissaoPessoa(DAOPermissaoPessoa daoPermissaoPessoa) {
		this.daoPermissaoPessoa = daoPermissaoPessoa;
	}

	public DAOFabricante getDaoFabricante() {
		return daoFabricante;
	}

	public void setDaoFabricante(DAOFabricante daoFabricante) {
		this.daoFabricante = daoFabricante;
	}

	@RequestMapping("/registroPessoa")
	public ModelAndView registroPessoa(ModelAndView mav) {
		if (mav.getModel().get("pessoa") == null) {
			Pessoa pessoa = new Pessoa();
			mav.getModel().put("pessoa", pessoa);
		}

		return mav;
	}

	@RequestMapping(value = "/executarRegistroPessoa", method = RequestMethod.POST)
	public ModelAndView guardarPessoa(@Valid Pessoa pessoa,
			BindingResult bindingResult, HttpSession sessao) {
		ModelAndView mav = new ModelAndView("index");
		if (bindingResult.hasErrors()) {
			mav.getModel().put("pessoa", pessoa);
			return registroPessoa(mav);
		}
		getDaoPessoa().persistir(pessoa);
		getDaoPermissaoPessoa().addRole("ROLE_MEMBRO", pessoa);
		sessao.setAttribute("pessoa", pessoa);
		return mav;
	}

	@RequestMapping("/anexarJogosConsoles")
	public ModelAndView anexarJogosConsoles(ModelAndView mav) {

		Authentication authentication = (Authentication) SecurityContextHolder
				.getContext().getAuthentication();

		if (mav.getModel().get("pessoa") == null) {
			Pessoa pessoa = new Pessoa();
			if (authentication != null) {
				pessoa = daoPessoa.getPessoa((String) authentication
						.getPrincipal());
			}
			mav.getModel().put("pessoa", pessoa);
		}

		if (mav.getModel().get("jogos") == null
				|| mav.getModel().get("consoles") == null) {
			mav.getModel().put("jogos", getDaoJogo().list(0, 100));
			mav.getModel().put("consoles", getDaoConsole().list(0, 100));

		}

		mav.setViewName("anexarJogosConsoles");
		return mav;
	}

	@RequestMapping(value = "/guardarAnexos", method = RequestMethod.POST)
	public ModelAndView guardarAnexos(@Valid Pessoa pessoa,
			BindingResult bindingResult, HttpSession sessao) {
		ModelAndView mav = new ModelAndView("index");
		if (bindingResult.hasErrors()) {

			mav.getModel().put("pessoa", pessoa);
			mav.getModel().put("jogos", sessao.getAttribute("jogos"));
			mav.getModel().put("consoles", sessao.getAttribute("consoles"));
			return anexarJogosConsoles(mav);

		}

		getDaoPessoa().persistir(pessoa);
		sessao.setAttribute("pessoa", pessoa);
		return mav;
	}

}
