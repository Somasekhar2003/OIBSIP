import java.util.*;

class DigitalLibraryManagement {
    HashMap<String, Integer> loginto = new HashMap<>();
    HashMap<Integer, String> map = new HashMap<>();
    public static String userID;
    public static int issues = 0;
    Scanner sc = new Scanner(System.in);

    public HashMap<Integer, String> book_database_server() {
        map.put(1, "CSE : Introduction to C Programming");
        map.put(2, "CSE : Java Programming for Beginners");
        map.put(3, "CSE : Artificial Intelligence Basics");
        map.put(4, "CSE : Object-Oriented Programming");
        map.put(5, "EE : Advanced Power Systems");
        map.put(6, "EE : Basic Electrical Circuits");
        map.put(7, "EE : Power Electronics");
        map.put(8, "EE : Fundamentals of Electrical Engineering");
        map.put(9, "EE : Advanced Electrical Engineering");
        map.put(10, "EE : Electrical Drives and Controls");
        map.put(11, "EE : Power Systems Analysis");
        map.put(12, "ECE : Fundamentals of Electronics");
        map.put(13, "ECE : Microprocessors and Microcontrollers");
        map.put(14, "ECE : Analog Electronics");
        map.put(15, "ECE : Digital Electronics");
        map.put(16, "IT : Data Structures and Algorithms");
        map.put(17, "IT : Database Management Systems");
        map.put(18, "IT : Statistics");
        map.put(19, "BBA : Principles of Management");
        map.put(20, "BBA : Economics for Engineers");
        map.put(21, "MATHS : Engineering Mathematics-1");
        map.put(22, "MATHS : Engineering Mathematics-2");
        map.put(23, "MATHS : Engineering Mathematics-3");
        map.put(24, "PHYS : Physics");
        map.put(25, "CHEM : Chemistry");
        map.put(26, "ENG : English");
        map.put(27, "BENG : Bengali");
        map.put(28, "HIND : Hindi");
        map.put(29, "EE : Control Systems");
        map.put(30, "EE : Electrical Circuit Theory");
        map.put(31, "EE : Electric & Hybrid Vehicles");
        map.put(32, "EE : Renewable Energy Sources");
        map.put(33, "CSE : Data Structures");
        map.put(34, "CSE : Operating Systems");
        map.put(35, "CSE : Computer Networks");
        map.put(36, "CSE : Machine Learning");
        map.put(37, "CSE : Database Systems");
        map.put(38, "CSE : Software Engineering");
        map.put(39, "ECE : Communication Systems");
        map.put(40, "ECE : VLSI Design");
        map.put(41, "ECE : Signal Processing");
        map.put(42, "EEE : Power System Protection");
        map.put(43, "EEE : Electrical Machines");
        map.put(44, "EEE : Power Quality");
        map.put(45, "ME : Thermodynamics");
        map.put(46, "ME : Fluid Mechanics");
        map.put(47, "ME : Heat Transfer");
        map.put(48, "ME : Machine Design");
        map.put(49, "ME : Manufacturing Processes");
        map.put(50, "AI : Neural Networks");
        map.put(51, "AI : Natural Language Processing");
        map.put(52, "AI : Deep Learning");
        map.put(53, "AI : Reinforcement Learning");
        map.put(54, "AIM-ML : Introduction to Machine Learning");
        map.put(55, "AIM-ML : Statistical Learning");
        map.put(56, "AIM-ML : Data Mining");
        map.put(57, "AIM-ML : Big Data Analytics");
        map.put(58, "Civil : Structural Analysis");
        map.put(59, "Civil : Geotechnical Engineering");
        map.put(60, "Civil : Transportation Engineering");
        map.put(61, "Civil : Environmental Engineering");
        map.put(62, "Civil : Construction Management");
        return map;
    }
    
    public void homepage() {
        System.out.println("--------------------------------------------------------");
        System.out.println("----- WELCOME TO DIGITAL LIBRARY MANAGEMENT SYSTEM -----");
        System.out.println("----------------------- HOMEPAGE -----------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("""
                           Please Select One Option...
                           """);
        System.out.println("1.>>> Admin Login >>>");
        System.out.println("2.>>> User Login >>>");
        System.out.println("3.>>> Exit >>>");
        System.out.println("--------------------------------------------------------");
        System.out.print("Select Option: ");
        int sp = sc.nextInt();
        switch (sp) {
            case 1 -> admin_login();
            case 2 -> user_login();
            case 3 -> {
                System.out.print("""
                                 
                                 Do You want to Exit? (Y/N): """);
                String exit = sc.next();
                if (exit.equalsIgnoreCase("Y")) {
                    System.out.println("""
                                       
                                       --------------------------------------------------------""");
                    System.out.println("""
                                       
                                       EXITING SUCCESSFULLY...!""");
                    System.out.println("""
                                       
                                       --------------------------------------------------------""");
                    System.out.println("""
                                       
                                       Thank You.!!! Please Visit Again...""");
                    System.out.println("""
                                       
                                       --------------------------------------------------------""");
                    System.exit(0);
                } else {
                    System.out.println("""
                                       
                                       Exiting Cancelled... Stayed on the HomePage...""");
                    homepage();
                }
            }
            default -> {
                System.out.println("""
                                   
                                   Invalid Option Choice.! Please Try again...""");
                homepage();
            }
        }
    }

    public void admin_login() {
        System.out.println("--------------------------------------------------------");
        System.out.println("------------------- ADMIN LOGIN PAGE -------------------");
        System.out.println("--------------------------------------------------------");
        System.out.print("Enter User-Id: ");
        userID = sc.next();
        System.out.print("Enter Password: ");
        int password = sc.nextInt();
        loginto.put("somu", 1234567);
        loginto.put("admin1", 567890);

        if (loginto.containsKey(userID) && loginto.get(userID) == password) {
            System.out.println("--------------------------------------------------------");
            System.out.println("""
                               
                               LOGIN SUCCESSFULLY...!""");
            System.out.println("""
                               
                               --------------------------------------------------------""");
            admin_mainpage();
        } else {
            System.out.println("""
                               
                               Invalid login credentials.!!! Please try again...""");
            admin_login();
        }
    }

    public void user_login() {
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------------- USER LOGIN PAGE -------------------");
        System.out.println("--------------------------------------------------------");
        System.out.print("Enter User-Id: ");
        userID = sc.next();
        System.out.print("Enter Password: ");
        int password = sc.nextInt();
        loginto.put("somu", 12345);
        loginto.put("user1", 567890);
        loginto.put("user2", 100000);
        loginto.put("user3", 234567);
        loginto.put("user4", 1234567);

        System.out.println("Attempting login with userID: " + userID + " and password: " + password);

        if (loginto.containsKey(userID) && loginto.get(userID) == password) {
            System.out.println("--------------------------------------------------------");
            System.out.println("""
                               
                               LOGIN SUCCESSFULLY...!""");
            System.out.println("""
                               
                               --------------------------------------------------------""");
            user_mainpage();
        } else {
            System.out.println("""
                               
                               Invalid login credentials.!!! Please try again...""");
            user_login();
        }
    }

    public void admin_mainpage() {
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------- ADMIN MAIN PAGE ------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("1.>>> View All Books >>>");
        System.out.println("2.>>> Add New Book >>>");
        System.out.println("3.>>> Remove Book >>>");
        System.out.println("4.>>> View Issued Books >>>");
        System.out.println("5.>>> View Users >>>");
        System.out.println("6.>>> Logout >>>");
        System.out.println("--------------------------------------------------------");
        System.out.print("Select Option: ");
        int am = sc.nextInt();
        switch (am) {
            case 1 -> {
                view_books();
                admin_mainpage();
            }
            case 2 -> {
                add_book();
                admin_mainpage();
            }
            case 3 -> {
                remove_book();
                admin_mainpage();
            }
            case 4 -> {
                view_issued_books();
                admin_mainpage();
            }
            case 5 -> {
                view_users();
                admin_mainpage();
            }
            case 6 -> {
                System.out.println("Logging out...");
                homepage();
            }
            default -> {
                System.out.println("""
                                   
                                   Invalid Option Choice.! Please Try again...""");
                admin_mainpage();
            }
        }
    }

    public void user_mainpage() {
        System.out.println("--------------------------------------------------------");
        System.out.println("---------------------- USER MAIN PAGE ------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("1.>>> View All Books >>>");
        System.out.println("2.>>> Issue Book >>>");
        System.out.println("3.>>> View Issued Books >>>");
        System.out.println("4.>>> Return Book >>>");
        System.out.println("5.>>> Logout >>>");
        System.out.println("--------------------------------------------------------");
        System.out.print("Select Option: ");
        int um = sc.nextInt();
        switch (um) {
            case 1 -> {
                view_books();
                user_mainpage();
            }
            case 2 -> {
                issue_book();
                user_mainpage();
            }
            case 3 -> {
                view_issued_books();
                user_mainpage();
            }
            case 4 -> {
                return_book();
                user_mainpage();
            }
            case 5 -> {
                System.out.println("Logging out...");
                homepage();
            }
            default -> {
                System.out.println("""
                                   
                                   Invalid Option Choice.! Please Try again...""");
                user_mainpage();
            }
        }
    }

    public void view_books() {
        System.out.println("--------------------------------------------------------");
        System.out.println("------------------------ ALL BOOKS ---------------------");
        System.out.println("--------------------------------------------------------");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Book ID: " + entry.getKey() + ", Book Title: " + entry.getValue());
        }
    }

    public void add_book() {
        System.out.println("--------------------------------------------------------");
        System.out.println("---------------------- ADD NEW BOOK --------------------");
        System.out.println("--------------------------------------------------------");
        System.out.print("Enter Book ID: ");
        int bookID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Title: ");
        String bookTitle = sc.nextLine();
        map.put(bookID, bookTitle);
        System.out.println("Book added successfully!");
    }

    public void remove_book() {
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------- REMOVE BOOK ----------------------");
        System.out.println("--------------------------------------------------------");
        System.out.print("Enter Book ID to remove: ");
        int bookID = sc.nextInt();
        if (map.containsKey(bookID)) {
            map.remove(bookID);
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book ID not found!");
        }
    }

    public void view_issued_books() {
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------------- ISSUED BOOKS ----------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Currently, no books are issued.");
        }

    public void issue_book() {
        System.out.println("--------------------------------------------------------");
        System.out.println("---------------------- ISSUE BOOK ----------------------");
        System.out.println("--------------------------------------------------------");
        System.out.print("Enter Book ID to issue: ");
        int bookID = sc.nextInt();
        if (map.containsKey(bookID)) {
            issues++;
            System.out.println("Book issued successfully! Total issues: " + issues);
        } else {
            System.out.println("Book ID not found!");
        }
    }

    public void return_book() {
        System.out.println("--------------------------------------------------------");
        System.out.println("---------------------- RETURN BOOK ---------------------");
        System.out.println("--------------------------------------------------------");
        System.out.print("Enter Book ID to return: ");
        int bookID = sc.nextInt();
        if (map.containsKey(bookID)) {
            issues--;
            System.out.println("Book returned successfully! Total issues: " + issues);
        } else {
            System.out.println("Book ID not found!");
        }
    }

    public void view_users() {
        System.out.println("--------------------------------------------------------");
        System.out.println("---------------------- ALL USERS -----------------------");
        System.out.println("--------------------------------------------------------");
        for (Map.Entry<String, Integer> entry : loginto.entrySet()) {
            System.out.println("User ID: " + entry.getKey());
        }
    }

    public static void main(String[] args) {
        DigitalLibraryManagement dlm = new DigitalLibraryManagement();
        dlm.book_database_server();
        dlm.homepage();
    }
}
