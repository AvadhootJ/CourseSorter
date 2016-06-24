import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class SortCourse implements Cloneable {

    /**Lets Purdue CS students figure out how many classes they need to finish tracks.*/

    // 0-> CS General Cores. ---> Complete and working.
    // 1-> Foundations of Computer Science. ---> Complete and working
    // 2-> Programming Language. ---> Complete and working.
    // 3-> Security. ---> Complete and working.// 8-> Software Engineering.
    // 4-> Systems Programming. --->Complete and working.


    static Collection CSGeneralCores = new ArrayList() {{
        add(18000);
        add(18200);
        add(24000);
        add(25000);
        add(25100);
        add(25200);
    }};
    static Collection FoCS_Core = new ArrayList() {{
        add(35200);
        add(38100);
    }};

    static Collection FoCS_Elective = new ArrayList() {{
        add(31400);
        add(33400);
        add(35500);
        add(44800);
        add(45600);
        add(47100);
        add(48300);

    }};

    static Collection Security_Core = new ArrayList() {{
        add(35400);
        add(35500);
        add(42600);
    }};

    static Collection Security_Elective = new ArrayList() {{
        add(30700);
        add(34800);
        add(35200);
        add(35300);
        add(38100);
        add(40800);
        add(42200);
        add(44800);
        add(45400);
        add(48100);
    }};

    static Collection ProLang_Core = new ArrayList() {{
        add(35200);
        add(35400);
        add(42600);
    }};

    static Collection ProLang_Elective = new ArrayList() {{
        add(30700);
        add(35300);
        add(38100);
        add(42200);
        add(48300);
    }};

    static Collection System_Core = new ArrayList() {{
        add(35200);
        add(35400);
        add(42200);
    }};

    static Collection System_Elective = new ArrayList() {{
        add(30700);
        add(33400);
        add(35300);
        add(38100);
        add(42600);
        add(42600);
        add(44800);
        add(45600);
        add(45400);
        add(48100);
    }};


    static Collection CSECore = new ArrayList() {{
        add(26600); /**or**/
        add(36600); /**or**/
        add(31400);
    }};
    static Collection CSEList1 = new ArrayList() {{
        add(30700);
        add(33400);
    }};
    static Collection CSEList2 = new ArrayList() {{
        add(35200);
        add(35400);
        add(38100);
        add(43400);
        add(34800);/**or**/
        add(44800);/**or**/
        add(47100);
        add(49000);
    }};
    static Collection CSEList3 = new ArrayList() {{
        add(38100);
    }};
    static Collection CSEList4 = new ArrayList() {{
        add(35400);
    }};
    static Collection CSEList5 = new ArrayList() {{
        add(51400);
        add(51500);
        add(49700);
    }};
    static Collection CSEList6 = new ArrayList() {{
        add(33400);
        add(35200);
        add(45600);
        add(47100);
        add(48300);
    }};

    static Collection CGV_Core = new ArrayList() {{
        add(33400);
        add(31400);
        add(38100);
    }};

    static Collection CGV_Elective = new ArrayList() {{
        add(31400);
        add(35200);
        add(35400);
        add(38100);
        add(42200);
        add(43400);
        add(44800);
        add(47100);

    }};

    static Collection Soft_Core = new ArrayList() {{

    }};

    static Collection Soft_Elective = new ArrayList(){{
        add(34800);
        add(35200);
        add(35300);
        add(35400);
        add(38100);
        add(42200);
        add(42600);
        add(42800);
        add(45600);
        add(47300);
        add(45400);
        add(48100);
    }};


    public static void main(String[] args) {

        Collection userCourses = new ArrayList<>();


        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your course number. Enter x when done");

        while (s.hasNextInt()) {
            userCourses.add(s.nextInt());
        }
        System.out.println("Your courses: " + userCourses);

        //CS Cores Code

        CSGeneralCores.removeAll(userCourses);
        int CSGenElectiveRemaining = 6 - CSGeneralCores.size();

        System.out.println("*******************************************************************************************");
        if ((CSGenElectiveRemaining == 0) && (CSGeneralCores.size() != 6)) {
            System.out.println("You have completed the Computer Science Core Courses");
        } else {
            System.out.println("In order to complete the Computer Science Core Courses, you have yet to complete the " +
                    "following:");
            System.out.println("Core: " + CSGeneralCores);
        }

        //Foundations of CS Code
        FoCS_Core.removeAll(userCourses);
        FoCS_Elective.removeAll(userCourses);
        int FoCSElectiveRemaining = 4 - (7 - FoCS_Elective.size());
        if (FoCS_Elective.size() <= 3) {
            FoCSElectiveRemaining = 0;
        }
        System.out.println("*******************************************************************************************");

        if ((FoCS_Core.size() == 0) && FoCSElectiveRemaining == 0) {
            System.out.println("You have completed the Foundations of Computer Science Track");
        } else {
            System.out.println("In order to complete the Foundations of Computer Science Track, you have yet to complete " +
                    "the following:");
        }
        if (FoCS_Core.size() == 0 && FoCSElectiveRemaining != 0) {
            System.out.println("You have completed all the cores for this track. Good job.");
        } else if (FoCS_Core.size() != 0)
            System.out.println("Core: " + FoCS_Core);

        if (FoCSElectiveRemaining == 0 && FoCS_Core.size() != 0) {
            System.out.println("Electives for this tracks are complete. Good job.");
        } else if (FoCSElectiveRemaining != 0) {
            System.out.println(FoCSElectiveRemaining + " Elective(s) from the list " + FoCS_Elective);
            System.out.println("One elective computer course at the 300, 400, 500 level or an independent study course is" +
                    "acceptable");
        }

        System.out.println("*******************************************************************************************");

        //Security Track Code

        Security_Core.removeAll(userCourses);
        Security_Elective.removeAll(userCourses);
        int SecurityElectiveRemaining = 3 - (10 - Security_Elective.size());
        if (Security_Elective.size() <= 7) {
            SecurityElectiveRemaining = 0;
        }
        if ((Security_Core.size() == 0) && SecurityElectiveRemaining == 0) {
            System.out.println("You have completed the Security Track");
        } else {
            System.out.println("In order to complete the Security Track, you have yet to complete the following:");
        }

        if (Security_Core.size() == 0 && SecurityElectiveRemaining != 0) {
            System.out.println("You have completed all the cores for this track. Good job.");
        } else if (Security_Core.size() != 0) {
            System.out.println("Core: " + Security_Core);
        }

        if (SecurityElectiveRemaining == 0 && Security_Core.size() != 0) {
            System.out.println("Electives for this tracks are complete. Good job.");
        } else if (SecurityElectiveRemaining != 0) {
            System.out.println(SecurityElectiveRemaining + " Elective(s) from the list " + Security_Elective);
        }


        System.out.println("*******************************************************************************************");

        //Programming Language Track Code

        ProLang_Core.removeAll(userCourses);
        ProLang_Elective.removeAll(userCourses);
        int ProLangElectiveRemaining = 3 - (5 - ProLang_Elective.size());
        if (ProLang_Elective.size() <= 2) {
            ProLangElectiveRemaining = 0;
        }

        if ((ProLang_Core.size() == 0) && ProLangElectiveRemaining == 0) {
            System.out.println("You have completed the Programming Languages Track");
        } else {
            System.out.println("In order to complete the Programming Language Track, you have yet to complete the following:");
        }

        if (ProLang_Core.size() == 0 && ProLangElectiveRemaining != 0) {
            System.out.println("You have completed all the cores for this track. Good job.");
        } else if (ProLang_Core.size() != 0) {
            System.out.println("Core: " + ProLang_Core);
        }
        if (ProLangElectiveRemaining == 0 && ProLang_Core.size() != 0) {
            System.out.println("Electives for this tracks are complete. Good job.");
        } else if (ProLangElectiveRemaining != 0) {
            System.out.println(ProLangElectiveRemaining + " Elective(s) from the list " + ProLang_Elective);
        }

        System.out.println("*******************************************************************************************");


        //Systems Programming Track

        System_Core.removeAll(userCourses);
        System_Elective.removeAll(userCourses);
        int SystemElectiveRemaining = 3 - (9 - System_Elective.size());
        if (System_Elective.size() <= 6) {
            SystemElectiveRemaining = 0;
        }

        if ((System_Core.size() == 0) && SystemElectiveRemaining == 0) {
            System.out.println("You have completed the Systems Programming Track");
        } else {
            System.out.println("In order to complete the Systems Programming Track, you have yet to complete the following:");
        }
        if (System_Core.size() == 0 && SystemElectiveRemaining != 0) {
            System.out.println("You have completed all the cores for this track. Good job.");
        } else if (System_Core.size() != 0)
            System.out.println("Core: " + System_Core);

        if (SystemElectiveRemaining == 0 && System_Core.size() != 0) {
            System.out.println("Electives for this tracks are complete. Good job.");
        } else if (SystemElectiveRemaining != 0) {
            System.out.println(SystemElectiveRemaining + " Elective(s) from the list " + System_Elective);
            System.out.println("It is strongly recommended that students select a senior project course as one of the electives.");
        }


        System.out.println("*******************************************************************************************");

    }
}

