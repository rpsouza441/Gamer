package br.com.gamer.controladores;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.gamer.converter.ConsoleEditor;
import br.com.gamer.converter.FabricanteEditor;
import br.com.gamer.converter.JogoEditor;
import br.com.gamer.dao.DAOConsole;
import br.com.gamer.dao.DAOFabricante;
import br.com.gamer.dao.DAOJogo;
import br.com.gamer.dao.DAOPermissaoPessoa;
import br.com.gamer.dao.DAOPessoa;
import br.com.gamer.entidades.Console;
import br.com.gamer.entidades.Fabricante;
import br.com.gamer.entidades.Jogo;
import br.com.gamer.entidades.Pessoa;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

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

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/")
	public String index(Map<String, Object> model) {

		return "index";
	}

	@RequestMapping("/lista")
	public String lista(Map<String, Object> model) {
		model.put("pessoas", getDaoPessoa().list(0, 100));
		return "lista";
	}

	@RequestMapping("/show{id}")
	public ModelAndView pessoa(@PathVariable("id") Long id) {
		ModelAndView mav = new ModelAndView();
		System.out.println("Vou expor o membro");
		Pessoa pessoa = getDaoPessoa().get(id);
		System.out.println("Encontrei o membro: " + pessoa);
		mav.getModel().put("pessoa", pessoa);
		mav.setViewName("show");
		return mav;
	}

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
	 SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	 dateFormat.setLenient(false);
	 webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	 }

	@InitBinder
	protected void initBinderFabricante(HttpServletRequest request,
			ServletRequestDataBinder binder) {
		System.out.println("entrou initbinder fabricante");
		binder.registerCustomEditor(Fabricante.class, new FabricanteEditor(
				this.daoFabricante));
	}

	@InitBinder
	protected void initBinderJogo(HttpServletRequest request,
			ServletRequestDataBinder binder) {
		System.out.println("entrou initbinder jogo");
		binder.registerCustomEditor(Jogo.class, new JogoEditor(this.daoJogo));
	}

	@InitBinder
	protected void initBinderConsole(HttpServletRequest request,
			ServletRequestDataBinder binder) {
		System.out.println("entrou initbinder console");
		binder.registerCustomEditor(Console.class, new ConsoleEditor(
				this.daoConsole));
	}

	/*
	 * @RequestMapping("/registroConsole") public String
	 * registroConsole(Map<String, Object> model) { if (model.get("fabricantes")
	 * == null) { System.out.println("A: 'fabricantes' está nulo"); }else {
	 * System.out.println("A: não está nulo >> "+model.get("fabricantes")); } if
	 * (model.get("console") == null) { Console console = new Console();
	 * model.put("console", console); } model.put("fabricantes",
	 * getDaoFabricante().list(0, 100)); if (model.get("fabricantes") == null) {
	 * System.out.println("B: 'fabricantes' está nulo"); }else {
	 * System.out.println("B: não está nulo >> "+model.get("fabricantes")); }
	 * return "registroConsole"; }
	 * 
	 * @RequestMapping(value = "/executarRegistroConsole", method =
	 * RequestMethod.POST) public String guardarConsole(@Valid Console console,
	 * BindingResult bindingResult, HttpSession sessao) {
	 * System.out.println(console.getFabricante()); if
	 * (bindingResult.hasErrors()) {
	 * System.out.println("Erro do executarRegistroConsole: " + bindingResult);
	 * Map<String, Object> model = new HashMap<String, Object>();
	 * model.put("console", console); return registroConsole(model); }
	 * getDaoConsole().persistir(console); sessao.setAttribute("console",
	 * console); return "redirect:/"; }
	 */
	/*
	 * @RequestMapping("/registroFabricante") public String
	 * registroFabricante(Map<String, Object> model) { if
	 * (model.get("fabricante") == null) { Fabricante fab = new Fabricante();
	 * model.put("fabricante", fab);
	 * 
	 * }
	 * 
	 * return "registroFabricante"; }
	 * 
	 * @RequestMapping(value = "/executarRegistroFab", method =
	 * RequestMethod.POST) public String guardarFabricante(@Valid Fabricante
	 * fabricante, BindingResult bindingResult, HttpSession sessao) { if
	 * (bindingResult.hasErrors()) {
	 * System.out.println("Erro no executarRegistroFab: " + bindingResult);
	 * Map<String, Object> model = new HashMap<String, Object>();
	 * model.put("fabricante", fabricante); return registroFabricante(model); }
	 * getDaoFabricante().persistir(fabricante);
	 * sessao.setAttribute("fabricante", fabricante); return "redirect:/"; }
	 */

	/*
	 * @RequestMapping("/registroJogo") public String registroJogo(Map<String,
	 * Object> model) { if (model.get("jogo") == null) { Jogo jogo = new Jogo();
	 * 
	 * model.put("jogo", jogo); } model.put("fabricantes",
	 * getDaoFabricante().list(0, 100)); model.put("consoles",
	 * getDaoConsole().list(0, 100)); return "registroJogo"; }
	 * 
	 * @RequestMapping(value = "/bindingResult", method = RequestMethod.POST)
	 * public String guardarJogo(@Valid Jogo jogo, BindingResult bindingResult,
	 * HttpSession sessao) {
	 * 
	 * if (bindingResult.hasErrors()) {
	 * System.out.println("Erro no bindingResult: " + bindingResult);
	 * Map<String, Object> model = new HashMap<String, Object>();
	 * model.put("jogo", jogo); model.put("fabricantes",
	 * getDaoFabricante().list(0, 100)); model.put("consoles",
	 * getDaoConsole().list(0, 100)); return registroJogo(model); }
	 * getDaoJogo().persistir(jogo);
	 * 
	 * sessao.setAttribute("jogo", jogo); return "redirect:/"; }
	 */

	/*
	 * @RequestMapping("/registroPessoa") public String
	 * registroPessoa(Map<String, Object> model) { if (model.get("pessoa") ==
	 * null) { Pessoa pessoa = new Pessoa(); model.put("pessoa", pessoa);
	 * 
	 * }
	 * 
	 * return "registroPessoa"; }
	 * 
	 * @RequestMapping(value = "/executarRegistroPessoa", method =
	 * RequestMethod.POST) public String guardarPessoa(@Valid Pessoa pessoa,
	 * BindingResult bindingResult, HttpSession sessao) { if
	 * (bindingResult.hasErrors()) { Map<String, Object> model = new
	 * HashMap<String, Object>(); model.put("pessoa", pessoa); return
	 * registroPessoa(model); } getDaoPessoa().persistir(pessoa);
	 * getDaoPermissaoPessoa().addRole("ROLE_MEMBRO", pessoa);
	 * sessao.setAttribute("pessoa", pessoa); return "redirect:/"; }
	 * 
	 * @RequestMapping("/anexarJogosConsoles") public String
	 * anexarJogosConsoles(Map<String, Object> model) { Pessoa pessoa = new
	 * Pessoa();
	 * 
	 * Authentication authentication = (Authentication) SecurityContextHolder
	 * .getContext().getAuthentication(); if (authentication != null) { pessoa =
	 * daoPessoa .getPessoa((String) authentication.getPrincipal()); }
	 * System.out.println("Anexando>> " + pessoa.getNome() + " " +
	 * pessoa.getSobrenome() + " " + pessoa.getLogin() + " " +
	 * pessoa.getHashSenha()); model.put("pessoa", pessoa); model.put("jogos",
	 * getDaoJogo().list(0, 100)); model.put("consoles", getDaoConsole().list(0,
	 * 100)); return "anexarJogosConsoles"; }
	 * 
	 * @RequestMapping(value = "/guardarAnexos", method = RequestMethod.POST)
	 * public String guardarAnexos(@Valid Pessoa pessoa, BindingResult
	 * bindingResult, HttpSession sessao) {
	 * 
	 * System.out.println("Entrou em guardarAnexos.\n Dados anexos " +
	 * pessoa.getNome() + " " + pessoa.getSobrenome() + " " + pessoa.getLogin()
	 * + " " + pessoa.getHashSenha()); if (bindingResult.hasErrors()) {
	 * System.out.println("erro em guardarAnexos" + bindingResult); Map<String,
	 * Object> model = new HashMap<String, Object>(); model.put("pessoa",
	 * pessoa); return anexarJogosConsoles(model);
	 * 
	 * }
	 * 
	 * getDaoPessoa().persistir(pessoa); System.out.println("guardou");
	 * sessao.setAttribute("pessoa", pessoa); return "redirect:/"; }
	 */

}
