import java.util.Scanner;
 class main 
 {
    public static void main(String[] args) 
   {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Wybierz figurę:");
        System.out.println("1 - Prostokąt");
        System.out.println("2 - Trójkąt prostokątny");
        int choice = scanner.nextInt();
        
        switch (choice) 
        {
            case 1:
            
                // Obliczanie pola prostokąta
                System.out.print("Podaj długość boku a: ");
                double a = scanner.nextDouble();
                System.out.print("Podaj długość boku b: ");
                double b = scanner.nextDouble();
                double PoleProst = a * b;
                System.out.println("Pole prostokąta: " + PoleProst);
                break;
            
            case 2:
            
                // Obliczanie pola ∆ prostokątnego
                System.out.print("Podaj długość przyprostokątnej a: ");
                double X = scanner.nextDouble();
                System.out.print("Podaj długość przyprostokątnej b: ");
                double H = scanner.nextDouble();
                double Pole_Trojkata = 0.5 * X * H;
                System.out.println("Pole trójkąta prostokątnego: " + Pole_Trojkata);
            
                break;
            
            default:
                System.out.println("Nieprawidłowy wybór!");
        }
    }
}
