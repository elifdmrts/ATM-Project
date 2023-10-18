import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        Scanner scanner = new Scanner(System.in);
        int rıght = 3;
        while (rıght > 0) {
            System.out.print("Kullanıcı Adınızı Giriniz: ");
            userName = scanner.nextLine();
            System.out.print("Şifrenizi Giriniz: ");
            password = scanner.nextLine();
            int balance = 1500;
            if (userName.equals("patika") && password.equals("java123")) {
                System.out.println("Merhaba, Bankamıza Hoşgeldiniz:)");
                System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz.");
                System.out.println("1-Para Çekme\n2-Para Yatırma\n3-Bakiye Sorgula\n4-Çıkış Yap");
                int preference = scanner.nextInt();

                switch (preference) {
                    case 1:
                        System.out.print("Para miktarı : ");
                        int price = scanner.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                            System.out.println("Bakiyeniz: " + balance);
                        }
                        break;
                    case 2:
                        System.out.print("Para miktarı : ");
                        int pricee = scanner.nextInt();
                        balance += pricee;
                        System.out.println("Bakiyeniz: " + balance);
                        break;

                    case 3:
                        System.out.println("Bakiyeniz : " + balance);
                        break;

                    case 4:
                        System.out.println("Tekrar görüşmek üzere.");
                        break;

                }
                break;
            } else {
                rıght--;
                System.out.println("Bilgilerinizi Kontrol Ediniz!");

            }

            if (rıght == 0) {
                System.out.println("Hesabınız Bloke Olmuştur, Bankayla iletişime Geçin");
            } else System.out.println("Kalan Hakkınız: " + rıght);
        }

    }


}
