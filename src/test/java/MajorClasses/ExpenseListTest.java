package MajorClasses;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpenseListTest {
    public ArrayList<Expense> testExpenseList = new ArrayList<>();
    public ExpenseList expenseList = new ExpenseList();

    @Test
    public void deleteExpense_successful() {
        testExpenseList.add(new Expense(2.5, "02/02/2012", "food", Currency.SGD));
        expenseList.addExpense("add amt/2.5 t/02/02/2012 cat/food");
        testExpenseList.remove(0);
        expenseList.deleteExpense("delete 1");
        assertEquals(testExpenseList, expenseList.getExpenseList());
    }
}