public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        System.out.println("���������� ������ ���������� ��� iOS �� ������");

        int ProductionYear = 2016;
        if (ProductionYear > 2015) {
            System.out.println("�������� ������� ������ ���������� ����������");
        } else if (ProductionYear < 2015) {
            System.out.println("�������� ����������� ������ ���������� ����������.");
        }

        int year = 2021;
        if (0 == year % 400) {
            System.out.println(year + " ��� �������� �����������");
        } else {
            System.out.println(year + " ��� �� �������� �����������");
        }

        int deliveryDistance = 50;{
        if (deliveryDistance < 20)
                System.out.println("����������� ���� 1");

            if (deliveryDistance == 20 || deliveryDistance < 60)
                System.out.println("����������� ���� 2");

            if (deliveryDistance == 60 || deliveryDistance < 100)
                System.out.println("����������� ���� 3");


        }
        
                int month = 3;
                String monthString;
                switch (month) {
                    case 1:
                        monthString = "������";
                        break;
                    case 2:
                        monthString = "�������";
                        break;
                    case 3:
                        monthString = "����";
                        break;
                    case 4:
                        monthString = "������";
                        break;
                    case 5:
                        monthString = "���";
                        break;
                    case 6:
                        monthString = "����";
                        break;
                    case 7:
                        monthString = "����";
                        break;
                    case 8:
                        monthString = "������";
                        break;
                    case 9:
                        monthString = "��������";
                        break;
                    case 10:
                        monthString = "�������";
                        break;
                    case 11:
                        monthString = "������";
                        break;
                    case 12:
                        monthString = "�������";
                        break;
                    default:
                        monthString = "�� ����� ������";
                        break;
                }

}
}