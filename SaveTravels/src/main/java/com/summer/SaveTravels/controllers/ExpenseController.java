package com.summer.SaveTravels.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.summer.SaveTravels.models.Expense;
import com.summer.SaveTravels.services.ExpenseService;

@Controller
public class ExpenseController {
	
	@Autowired
	ExpenseService expenseService;
	
	@GetMapping("/")
	public String home() {
		return "redirect:/expenses";
	}
	@GetMapping("/expenses")
	public String index(@ModelAttribute("expense")Expense expense, Model model) {
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses",expenses);
		return "index.jsp";
	}
	@PostMapping("/expenses")
	public String index(@Validated @ModelAttribute("expense") 
	Expense expense, 
	BindingResult result, 
	Model model) {
		if(result.hasErrors()) {
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses", expenses);
			return "index.jsp";
		}else {
			expenseService.createExpense(expense);
			return "redirect:/expenses";
		}
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") 
	Long id, Model model) {	
		Expense expense = expenseService.findExpense(id);	
		model.addAttribute("expense", expense);
		return "edit.jsp";
	}
	@GetMapping("/expenses/{id}")
	public String show(@PathVariable("id") 
	Long id, Model model) {
	model.addAttribute("expense", expenseService.findExpense(id));
		return "showexp.jsp";
	}
	@PutMapping("/edit/{id}")
	public String update(
			@PathVariable("id") Long id, 
			Model model, 
			@Validated @ModelAttribute("expense") Expense expense, 
			BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/edit/{id}";
		}else {
			expenseService.updateExpense(expense);
			return "redirect:/expenses";
		}
	}
	@DeleteMapping("/expenses/{id}")
	public String delete(@PathVariable("id") Long id) {
		expenseService.delete(id);
		return "redirect:/expenses";
	}
}
