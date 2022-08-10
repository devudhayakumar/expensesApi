package dev.udhayakumar.expenses.expensesApi.Service;

import dev.udhayakumar.expenses.expensesApi.Model.Expense;
import dev.udhayakumar.expenses.expensesApi.Repository.ExpenseRepo;
import dev.udhayakumar.expenses.expensesApi.Repository.ExpensesListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    ExpenseRepo expenserepo;

    public String saveExpense(Expense expense){
        expenserepo.save(expense);
        return "Saved..";
    }


    public List<Expense> getExpense(){
        return expenserepo.findAll();
    }

}
