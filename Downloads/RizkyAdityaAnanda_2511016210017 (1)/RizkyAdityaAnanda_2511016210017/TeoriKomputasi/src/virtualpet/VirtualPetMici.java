package VirtualPet;

import java.util.Scanner;

public class VirtualPetMici {

    static int pilihan;
    static String kondisi;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("======= Miaw! Selamat Datang =======");
        lapar();
    }

    public static void aksi() {
        System.out.println("Apa yang ingin kamu lakukan?\n1. Memberinya Whiskas\n2. Menyuruhnya tidur\n3. Mengajaknya bermain pancingan bulu\n4. Memandikannya");
        System.out.print("Masukkan pilihan : ");
        pilihan = input.nextInt();
        System.out.print("Apakah ingin melanjutkan? (y/n) : ");
        kondisi = input.next();
        System.out.println("============================================================");
    }

    public static void lapar() {
        System.out.println("Mici sedang meow-meow, nampaknya Ia sedang kelaparan....");
        aksi();
        if (kondisi.equals("y")) {
            if (pilihan == 1) {
                makanDelayedText();
                kenyang();
            } else if (pilihan == 2) {
                tidurDelayedText();
                lapar();
            } else if (pilihan == 3) {
                bermainDelayedText();
                lapar();
            } else if (pilihan == 4) {
                mandiDelayedText();
                sedih();
            }
        } else if (kondisi.equalsIgnoreCase("n")) {
            System.out.println("Mici sedang kelaparan :(");
            System.out.println("Status : REJECTED");
        }
    }

    public static void kenyang() {
        System.out.println("Mici merasa kenyang, Ia sudah memakan banyak Whiskas. Yummy~~~");
        aksi();
        if (kondisi.equalsIgnoreCase("y")) {
            if (pilihan == 1) {
                makanDelayedText();
                kenyang();
            } else if (pilihan == 2) {
                tidurDelayedText();
                lapar();
            } else if (pilihan == 3) {
                bermainDelayedText();
                senang();
            } else if (pilihan == 4) {
                mandiDelayedText();
                bersih();
            }
        } else if (kondisi.equalsIgnoreCase("n")) {
            System.out.println("Terima kasih! Mici merasa kenyang ...");
            System.out.println("Status : ACCEPTED");
        }
    }

    public static void senang() {
        System.out.println("Mici merasa sangat senang!");
        aksi();
        if (kondisi.equalsIgnoreCase("y")) {
            if (pilihan == 1) {
                makanDelayedText();
                kenyang();
            } else if (pilihan == 2) {
                tidurDelayedText();
                lapar();
            } else if (pilihan == 3) {
                bermainDelayedText();
                kotor();
            } else if (pilihan == 4) {
                mandiDelayedText();
                bersih();
            }
        } else if (kondisi.equalsIgnoreCase("n")) {
            System.out.println("Miaw! Terima kasih! Mici sangat senang");
            System.out.println("Status : ACCEPTED");
        }
    }

    public static void sedih() {
        System.out.println("Mici terlihat sedih, sepertinya ia trauma karena dimandikan saat lapar...");
        aksi();
        if (kondisi.equalsIgnoreCase("y")) {
            if (pilihan == 1) {
                makanDelayedText();
                kenyang();
            } else if (pilihan == 2) {
                tidurDelayedText();
                lapar();
            } else if (pilihan == 3) {
                bermainDelayedText();
                senang();
            } else if (pilihan == 4) {
                mandiDelayedText();
                sedih();
            }
        } else if (kondisi.equalsIgnoreCase("n")) {
            System.out.println("Huhu... Mici merasa sedih :(");
            System.out.println("Status : REJECTED");
        }
    }

    public static void kotor() {
        System.out.println("Duh! Mici sangat kotor sekali");
        aksi();
        if (kondisi.equalsIgnoreCase("y")) {
            if (pilihan == 1) {
                makanDelayedText();
                kotor();
            } else if (pilihan == 2) {
                tidurDelayedText();
                kotor();
            } else if (pilihan == 3) {
                bermainDelayedText();
                kotor();
            } else if (pilihan == 4) {
                mandiDelayedText();
                bersih();
            }
        } else if (kondisi.equalsIgnoreCase("n")) {
            System.out.println("Mici butuh mandi! Ia tidak mau melakukan hal lain saat badannya gatal.");
            System.out.println("Status : REJECTED");
        }
    }

    public static void bersih() {
        System.out.println("Wow! badan Mici bersih sekali");
        aksi();
        if (kondisi.equalsIgnoreCase("y")) {
            if (pilihan == 1) {
                makanDelayedText();
                kenyang();
            } else if (pilihan == 2) {
                tidurDelayedText();
                lapar();
            } else if (pilihan == 3) {
                bermainDelayedText();
                kotor();
            } else if (pilihan == 4) {
                mandiDelayedText();
                bersih();
            }
        } else if (kondisi.equalsIgnoreCase("n")) {
            System.out.println("Miaw Terima kasih! badan Mici akhirnya bersih :D");
            System.out.println("Status : ACCEPTED");
        }
    }

    public static void delayedText() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
        }
    }

    public static void makanDelayedText() {
        System.out.println("Mici sedang memakan whiskas ...");
        delayedText();
        System.out.println("============================================================");
    }

    public static void tidurDelayedText() {
        System.out.println("Mici sedang tidur dalam beberapa jam ...");
        delayedText();
        System.out.println("============================================================");
    }

    public static void bermainDelayedText() {
        System.out.println("Mici sedang melompat-lompat mengejar pancingan bulu dengan lincah...");
        delayedText();
        System.out.println("============================================================");
    }

    public static void mandiDelayedText() {
        System.out.println("Mici sedang dimandikan dengan shampoo khusus kucing... Ia terlihat sedikit pasrah.");
        delayedText();
        System.out.println("============================================================");
    }

}
