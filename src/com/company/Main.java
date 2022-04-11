package com.company;
import java.util.*;

        public class Main {
            public static void main(String[] args) {
                Scanner shirt= new Scanner(System.in);
                Baju erigo= new Baju();
                erigo.hargatotal();

                System.out.println("  ");
                System.out.println("======================================");
                System.out.println("The type of clothes you will buy is : ");
                erigo.jenis = shirt.nextLine();

                System.out.println("The number of clothes you will buy is : ");
                erigo.jumlah = shirt.nextInt();

                erigo.display();
                System.out.println("  ");
                System.out.println("====================================");
            }
        }
        class Baju {
            String jenis;
            int harga;
            int jumlah;

            int baju_a = 100000;
            int baju_b = 125000;
            int baju_c = 175000;

            void hargatotal() {
                System.out.println("===== Welcome to our store =====");
                System.out.println("   ");
                System.out.println("Available clothes : ");
                System.out.println("Shirt a with price " + baju_a);
                System.out.println("Shirt b with price " + baju_b);
                System.out.println("Shirt c with price " + baju_c);
            }
            void harga_a() {
                if (jumlah > 100) {
                    this.harga = 95000;
                } else {
                    this.harga = baju_a;
                }
            }
            void harga_b() {
                if (jumlah > 100) {
                    this.harga = 120000;
                } else {
                    this.harga = baju_b;
                }
            }
            void harga_c() {
                if (jumlah > 100) {
                    this.harga = 160000;
                } else {
                    this.harga = baju_c;
                }
            }
            void display() {
                if (jenis.equalsIgnoreCase("a"))
                    harga_a();
                else if (jenis.equalsIgnoreCase("b"))
                    harga_b();
                else if (jenis.equalsIgnoreCase("c"))
                    harga_c();

                System.out.println("The type you bought : " + jenis);
                System.out.println("price  : " + harga);
                System.out.println("Total price  : " + harga * jumlah);
            }
        }
