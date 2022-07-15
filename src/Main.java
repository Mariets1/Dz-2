public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        System.out.println("Установите версию приложения для iOS по ссылке");

        int ProductionYear = 2016;
        if (ProductionYear > 2015) {
            System.out.println("Скачайте обычную версию мобильного приложения");
        } else if (ProductionYear < 2015) {
            System.out.println("Скачайте облегченную версию мобильного приложения.");
        }

        int year = 2021;
        if (0 == year % 400) {
            System.out.println(year + " год является высокостным");
        } else {
            System.out.println(year + " год не является высокостным");
        }

        int deliveryDistance = 50;{
        if (deliveryDistance < 20)
                System.out.println("Потребуется дней 1");

            if (deliveryDistance == 20 || deliveryDistance < 60)
                System.out.println("Потребуется дней 2");

            if (deliveryDistance == 60 || deliveryDistance < 100)
                System.out.println("Потребуется дней 3");


        }
        
                int month = 3;
                String monthString;
                switch (month) {
                    case 1:
                        monthString = "Январь";
                        break;
                    case 2:
                        monthString = "Февраль";
                        break;
                    case 3:
                        monthString = "Март";
                        break;
                    case 4:
                        monthString = "Апрель";
                        break;
                    case 5:
                        monthString = "Май";
                        break;
                    case 6:
                        monthString = "Июнь";
                        break;
                    case 7:
                        monthString = "Июль";
                        break;
                    case 8:
                        monthString = "Август";
                        break;
                    case 9:
                        monthString = "Сентябрь";
                        break;
                    case 10:
                        monthString = "Октябрь";
                        break;
                    case 11:
                        monthString = "Ноябрь";
                        break;
                    case 12:
                        monthString = "Декабрь";
                        break;
                    default:
                        monthString = "Не знаем такого";
                        break;
                }

}
}