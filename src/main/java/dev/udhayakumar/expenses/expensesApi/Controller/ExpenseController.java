package dev.udhayakumar.expenses.expensesApi.Controller;


import dev.udhayakumar.expenses.expensesApi.Model.Expense;
import dev.udhayakumar.expenses.expensesApi.Service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpenseController {

    @Autowired
    ExpenseService expenseservice;

    @PostMapping(value = "/saveExpense")
    public String saveExpense(@RequestBody Expense expense){
        return expenseservice.saveExpense(expense);
    }

    @GetMapping(value = "/getExpenses")
    public List<Expense> getExpense(){
        return expenseservice.getExpense();
    }
}
