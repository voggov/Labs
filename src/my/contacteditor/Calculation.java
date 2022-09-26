package my.contacteditor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Calculation extends Thread {
    private Double lowerBound;
    private Double upperBound;
    private Double step;
    private Double result;

    public Calculation(Double lowerBound, Double upperBound, Double step) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.step = step;
    }

    @Override
    public void run() {
        calculateCertainIntegral(this.lowerBound, this.upperBound, this.step);
        System.out.println("Thread0 is running");
        System.out.println("Thread1 is running");
        System.out.println("Thread2 is running");
        System.out.println("Thread3 is running");

    }

    private synchronized Double calculateCertainIntegral(Double lowerBound, Double upperBound, Double step) {
        double result = 0;
        double h = (upperBound - lowerBound) / step; //шаг разбиения отрезка [a;b].

        for (int i = 0; i < step; i++) {
            result += inFunction(lowerBound + h * (i + 0.5)); //Определяем значение yi подынтегральной функции f(x) в каждой части деления.
        }
        result *= h;
        this.result = result;
        return result;
    }

    private double inFunction(double x) {
        return Math.tan(x);
    }


}
