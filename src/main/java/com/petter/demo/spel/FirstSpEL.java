package com.petter.demo.spel;

import com.petter.demo.User;
import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author : GD
 * @date :2020/6/27 : 21:59
 */

public class FirstSpEL {

    @Test
    void Hello() {
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("'Hello World'.concat('!')");
        String message = (String) exp.getValue();
        System.out.println(message);
    }

    @Test
    void test2() {
        User tesla = new User("Nikola Tesla","Serbian");
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("name");
        String value = (String) exp.getValue(tesla);
        System.out.println(value);
        exp = parser.parseExpression("name == 'Nikola Tesla'");
        Boolean value1 = exp.getValue(tesla,Boolean.class);
        System.out.println(value1);
    }

}
