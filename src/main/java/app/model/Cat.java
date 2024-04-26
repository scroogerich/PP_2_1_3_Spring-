package app.model;

import org.springframework.stereotype.Component;

@Component("cat")  // Указываем имя компонента
public class Cat extends Animal {
    @Override
    public String toString() {
        return "I'm a Cat";
    }
}