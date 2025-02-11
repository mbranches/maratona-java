package academy.praticando.predio.app;

import academy.praticando.predio.domain.Apartment;
import academy.praticando.predio.domain.Owner;
import academy.praticando.predio.domain.TypeApartment;

import java.util.ArrayList;
import java.util.Scanner;

public class AppRegister {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);

        int contador = 0;

        ArrayList<Apartment> apartmentsList = new ArrayList<>();

        while (true) {
            menu.showMainMenu();

            System.out.print("Your option: ");
            int option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                while (true) {
                    System.out.print("Name of apartment owner: ");
                    String name_owner = input.nextLine();
                    System.out.print("Age: ");
                    int age_owner = input.nextInt();
                    input.nextLine();
                    System.out.print("CPF: ");
                    String cpf_owner = input.nextLine();

                    Owner owner = new Owner(name_owner, age_owner, cpf_owner);

                    System.out.println();

                    System.out.print("Apartment number: ");
                    int apartment_num = input.nextInt();
                    input.nextLine();
                    menu.showTypeApartment();
                    System.out.print("Type: ");
                    TypeApartment typeApartment = TypeApartment.typeNum(input.nextInt());
                    input.nextLine();


                    System.out.print("Value: R$");
                    double valueApartment = input.nextDouble();
                    input.nextLine();


                    System.out.println();
                    System.out.print("Do you want to confirm apartment registration[S/N]?: ");
                    char confirmation = input.nextLine().toUpperCase().charAt(0);
                    System.out.println();
                    if (confirmation == 'S') {
                        Apartment apartment = new Apartment(owner, apartment_num, typeApartment, valueApartment);
                        apartmentsList.add(apartment);
                        break;
                    }
                }

                System.out.print("Type 'exit' for exit: ");
                String exit = input.nextLine();
                System.out.println();


            } else if (option == 2) {
                System.out.println();
                for (Apartment ap : apartmentsList) {
                    Shows.showAp(ap);
                }
                System.out.print("Type 'exit' for exit: ");
                String exit = input.nextLine();
                System.out.println();

            } else if (option == 3) {
                while (true) {
                    System.out.print("Type apartment number: ");
                    int number_apartments = input.nextInt();
                    input.nextLine();

                    boolean apartmentsExist = false;

                    for (Apartment ap : apartmentsList) {
                        if (number_apartments == ap.getNumApartment()) {
                            apartmentsExist = true;
                            Shows.showAp(ap);
                        }
                    }


                    if (!apartmentsExist) {
                        System.out.println("Error! The apartment does not exist.");
                        continue;
                    }

                    String exit;

                    while (true) {
                        System.out.println();
                        System.out.print("Type 'exit' to exit and 'continue' to continue: ");
                        exit = input.nextLine();
                        if (exit.equals("exit") || exit.equals("continue")) break;
                        else System.out.println("Error! Please enter a valid option.");
                    }

                    if (exit.equals("exit")) break;
                }
            } else if (option == 4) {
                System.out.println("Exiting...");
                break;
            }
        }


    }
}
