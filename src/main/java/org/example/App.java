package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        final int sizeGlassInMilliliters = 200;
        System.out.println("Объём стакана в милилитрах :" + sizeGlassInMilliliters);

        final double percentGlassFilled = 25;
        System.out.println("Процент заполнения стакана :" + percentGlassFilled);

        double millilitersInGlassPercent = sizeGlassInMilliliters * (percentGlassFilled / 100);
        System.out.println("Милилитров воды в стакане, заполненном на столько процентов :" + millilitersInGlassPercent);

    }
}
