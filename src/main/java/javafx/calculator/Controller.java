package javafx.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.HashMap;
import java.util.Objects;

public class Controller {

    @FXML
    public Button one;
    @FXML
    private Label output;
    private String outputValue = "";
    private String curNumber = "";
    private Integer firstNumber;

    private String sign = "";
//    HashMap<String, Integer> operationsMap = new HashMap<String, Integer>();
//    operationsMap.put("+", firstNumber);

    public void enterNumber (ActionEvent e) {

        String num = ((Button)e.getSource()).getText();
        if (curNumber.length() <= 4) {
            curNumber += num;
            outputValue += num;
        }

        output.setText(outputValue);
    }

    public void mathOperation (ActionEvent e) {
        String inputSign = ((Button)e.getSource()).getText();

        if (firstNumber == null) {
            firstNumber = Integer.valueOf(curNumber);
        }

        if (sign.equals("")) {
            outputValue += " " + inputSign + " ";
            curNumber = "";
            sign = inputSign;
        }

        output.setText(outputValue);
    }

    public void calculate (ActionEvent e) {
        Integer result;

        if (sign.equals("-")) {
            result = firstNumber - Integer.valueOf(curNumber);
        } else if (Objects.equals(sign, "+")) {
            result = firstNumber + Integer.valueOf(curNumber);
        } else {
            //System.out.println(sign);
            //System.out.println(sign == "+");
            result = 0;
        }

        outputValue = String.valueOf(result);
        firstNumber = result;
        curNumber = "";
        sign = "";

        output.setText(outputValue);
    }

    public void delete (ActionEvent e) {
        outputValue = "";
        firstNumber = null;
        curNumber = "";

        output.setText(outputValue);
    }
}
