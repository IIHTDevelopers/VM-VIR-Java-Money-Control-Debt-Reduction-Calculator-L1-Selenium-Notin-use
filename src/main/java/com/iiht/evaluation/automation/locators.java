package com.iiht.evaluation.automation;

import java.util.HashMap;
import java.util.Map;

public class locators {
    public static final Map<String, String> money_control_element = new HashMap<>();

    static {
       

        money_control_element.put("main_menu", "");
        money_control_element.put("sub_menu", "");

       
        money_control_element.put("rate_of_interest_per_annum_input", "");
        money_control_element.put("how_much_can_you_repay_every_month_input", "");
        money_control_element.put("debt_reduction_plan_calculator_calculate_button", "");
        money_control_element.put("debt_reduction_plan_calculator_result_div", "");
    }
}
