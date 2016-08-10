/**
 * Created by Avadhoot Joshi
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class SortCourse implements Cloneable {

    /**
     * Lets Purdue CS students figure out how many classes they need to finish their tracks.
     */

    // 0-> CS General Cores. ---> Complete and working.

    // 1-> Computer Graphics and Visualization. ---> Complete and working.
    // 2-> Database and Information Systems. ---> Complete and working.
    // 3-> Foundations of Computer Science. ---> Complete and working.
    // 4-> Programming Language. ---> Complete and working.
    // 5-> Security. ---> Complete and working.
    // 6-> Systems Programming. --->Complete and working.
    // 7-> Machine Intelligence. ---> Complete and working.
    // 8-> Software Engineering. ---> Complete and working.
    // 9-> Computational Science & Engineering. ---> Complete and working.

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

    static Collection DBISCore = new ArrayList() {{
        add(34800);
        add(38100);
        add(44800);
    }};
    static Collection DBISCore2 = new ArrayList() {{
        add(39000);
        add(47300);
    }};

    static Collection DBIS1 = new ArrayList() {{
        add(35200);
        add(35400);
    }};
    static Collection DBIS2 = new ArrayList() {{
        add(35500);
        add(42600);
    }};
    static Collection DBIS3a = new ArrayList() {{
        add(42200);
        add(47100);
        add(47800);
        add(49000);
    }};
    static Collection DBIS3b = new ArrayList() {{
        add(39000);
        add(47300);
    }};


    static Collection MI_Core1 = new ArrayList() {{
        add(39000);
        add(38100);
    }};

    static Collection MI_Core2 = new ArrayList() {{
        add(47100);
        add(47300);
    }};

    static Collection MI_Core3 = new ArrayList() {{

        add(41600);
        add(51200);
    }};

    static Collection MI_Elective = new ArrayList() {{
        add(34800);
        add(35200);
        add(44800);
        add(45600);
        add(47100);
        add(48300);
        add(47300);
    }};

    static Collection SE_Core1 = new ArrayList() {{
        add(30700);
        add(40800);
        add(49000);
    }};

    static Collection SE_Core2 = new ArrayList() {{
        add(35200);
        add(35400);
    }};

    static Collection SE_Elective = new ArrayList() {{
        add(34800);
        add(35200);
        add(35300);
        add(35400);
        add(38100);
        add(42200);
        add(42600);
        add(44800);
        add(45600);
        add(47300);
        add(45400);
        add(48100);

    }};

    static Collection CSE_Core1 = new ArrayList() {{
        add(31400);
    }};

    static Collection CSE_Core2 = new ArrayList() {{
        add(26600);
        add(36600);
    }};

    static Collection CSE_L1 = new ArrayList() {{
        add(30700);
        add(33400);
    }};
    static Collection CSE_L2a = new ArrayList() {{
        add(35200);
        add(35400);
        add(38100);
        add(43400);
        add(47100);
        add(49000);
    }};
    static Collection CSE_L2b = new ArrayList() {{
        add(34800);
        add(44800);
    }};
    static Collection CSE_L3 = new ArrayList() {{
        add(38100);
    }};
    static Collection CSE_L4 = new ArrayList() {{
        add(35400);
    }};
    static Collection CSE_L5 = new ArrayList() {{
        add(51400);
        add(51500);
        add(49700);
    }};
    static Collection CSE_L6 = new ArrayList() {{
        add(33400);
        add(35200);
        add(45600);
        add(47100);
        add(48300);
    }};


    public static void main(String[] args) {

        Collection userCourses = new ArrayList<>();


        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your course number. Enter x when done");

        while (s.hasNextInt()) {
            userCourses.add(s.nextInt());
        }
        System.out.println("YOUR COURSES:  --->" + userCourses);

        //CS Cores Code

        CSGeneralCores.removeAll(userCourses);
        int CSGenElectiveRemaining = 6 - CSGeneralCores.size();

        System.out.println("*******************************************************************************************");
        System.out.println("*******************************************************************************************");

        if ((CSGenElectiveRemaining == 6) && (CSGeneralCores.size() != 6)) {
            System.out.println("You have completed the Computer Science Core Courses");
        } else if (CSGenElectiveRemaining != 6) {
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
        System.out.println("*******************************************************************************************");


        //CGV Code
        int CGVCComplete = 0;

        CGV_Core.removeAll(userCourses);
        CGV_Elective.removeAll(userCourses);

        int CGVElectiveRemaining = 4 - (8 - CGV_Elective.size());
        if (userCourses.contains(38100) && userCourses.contains(31400)) {
            CGVElectiveRemaining += 1;
        }

        if ((CGV_Elective.size() <= 3) && userCourses.contains(38100) && userCourses.contains(31400)) {
            CGVElectiveRemaining = 0;
        } else if (CGV_Elective.size() <= 4) {
            CGVElectiveRemaining = 0;
        }

        if (CGV_Core.size() == 0) {
            CGVCComplete = 1;
        }
        if ((CGV_Core.size() == 1) && (CGV_Core.contains(31400) || CGV_Core.contains(38100))) {
            CGVCComplete = 1;
        }

        if ((CGVCComplete == 1) && CGVElectiveRemaining == 0) {
            System.out.println("You have completed the Computer Graphics and Visualization Track");
        } else {
            System.out.println("In order to complete the Computer Graphics and Visualization Track, you have yet to " +
                    "complete the following:");
        }

        if (CGVCComplete == 1 && CGVElectiveRemaining != 0) {
            System.out.println("You have completed all the cores for this track. Good job.");

        } else if ((CGV_Core.size() == 1) && (CGV_Core.contains(33400))) {
            System.out.println("Core: [33400]");
        } else if ((CGV_Core.size() == 1) && (CGV_Core.contains(31400))) {
            System.out.println("You have completed all the cores for this track. Good job.");
        } else if ((CGV_Core.size() == 1) && (CGV_Core.contains(38100))) {
            System.out.println("You have completed all the cores for this track. Good job.");
        } else if ((CGV_Core.size() == 2) && (CGV_Core.contains(31400) && CGV_Core.contains(33400))) {
            System.out.println("Core: [33400]");
        } else if ((CGV_Core.size() == 2) && (CGV_Core.contains(38100) && CGV_Core.contains(33400))) {
            System.out.println("Core: [33400]");
        } else if ((CGV_Core.size() == 2) && (CGV_Core.contains(31400) && CGV_Core.contains(38100))) {
            System.out.println("Core: 31400 or 38100");
            System.out.println("Only 1 course out of 31400 and 38100 will be counted towards Core and Elective");
        }


        if (CGVElectiveRemaining == 0 && CGV_Core.size() != 0) {
            System.out.println("Electives for this tracks are complete. Good job.");
        } else if (CGVElectiveRemaining != 0) {
            System.out.println(CGVElectiveRemaining + " Elective(s) from the list " + CGV_Elective);
            System.out.println("Only 1 course out of 31400 and 38100 will be counted towards Core and Elective");

        }
        System.out.println("*******************************************************************************************");
        System.out.println("*******************************************************************************************");


        //Database and Information Systems Track

        DBISCore.removeAll(userCourses);
        DBISCore2.removeAll(userCourses);
        DBIS1.removeAll(userCourses);
        DBIS2.removeAll(userCourses);
        DBIS3a.removeAll(userCourses);
        DBIS3b.removeAll(userCourses);

        boolean Cor1 = false;
        boolean Cor2 = false;
        boolean Cat1 = false;
        boolean Cat2 = false;
        boolean Cat3a = false;
        boolean Cat3b = false;
        boolean Cat3 = false;

        if (userCourses.contains(39000) && (userCourses.contains(47300))) {
            Cor2 = true;
            Cat3b = true;
        }
        if (userCourses.contains(39000) && (!userCourses.contains(47300))) {
            Cor2 = true;
            Cat3b = false;
        }
        if (!userCourses.contains(39000) && (userCourses.contains(47300))) {
            Cor2 = true;
            Cat3b = false;
        }
        if (DBISCore.size() == 0) {
            Cor1 = true;
        }
        if (DBISCore2.size() <= 1) {
            Cor2 = true;
        }
        if (DBIS1.size() <= 1) {
            Cat1 = true;
        }
        if (DBIS2.size() <= 1) {
            Cat2 = true;
        }
        if (DBIS3a.size() <= 3) {
            Cat3a = true;
        }
        if (DBIS3b.size() <= 1) {
            Cat3b = true;
        }
        if ((Cat3a) && (Cat3b)) {
            Cat3 = true;
        }
        if ((!Cat3a) && (Cat3b)) {
            Cat3 = true;
        }
        if ((Cat3a) && (!Cat3b)) {
            Cat3 = true;
        }


        if ((Cor1) && (Cor2) && (Cat1) && (Cat2) && (Cat3)) {
            System.out.println("You have completed the Database and Information Systems Track");
        } else {
            System.out.println("In order to complete the Database and Information Systems Track, you have yet to complete " +
                    "the following:");
        }

        if ((Cor1 && Cor2) && !(Cat1 && Cat2 && Cat3)) {
            System.out.println("You have completed all the cores for this track. Good job.");
        }
        if (!Cor1) {
            System.out.println("Core: " + DBISCore);
        }
        if (!Cor2) {
            System.out.println("Core: " + DBISCore2);
            System.out.println("Only one course out of 39000 and 47300 will be counted for Core");
        }

        if (Cat1 && Cat2 & Cat3 && !(Cor1 && Cor2)) {
            System.out.println("Electives for this tracks are complete. Good job.");
        } else if (!Cat1 || !Cat2 || !Cat3) {
            System.out.println("Electives left are:");
        }
        if (!Cat1) {
            System.out.println(" *Category I - Computing Systems*");
            System.out.println("-->1 Elective from: " + DBIS1);
        }
        if (!Cat2) {
            System.out.println(" *Category II - Information Assurance*");
            System.out.println("-->1 Elective from: " + DBIS2);
        }
        if (!Cat3a || !Cat3b) {
            System.out.println(" *Category III - Related Studies*");
            System.out.println("-->1 Elective from: " + DBIS3a);
            System.out.println("-->OR 1 Elective from: " + DBIS3b);
            System.out.println("Only one course out of 39000 and 47300 will be counted for Elective Category III");

        }


        System.out.println("*******************************************************************************************");
        System.out.println("*******************************************************************************************");


        //Machine Intelligence Track

        MI_Core1.removeAll(userCourses);
        MI_Core2.removeAll(userCourses);
        MI_Core3.removeAll(userCourses);
        MI_Elective.removeAll(userCourses);


        int MI_ElectiveRemaining = 2 - (7 - MI_Elective.size());
        if (MI_Elective.size() <= 5) {
            MI_ElectiveRemaining = 0;
        }

        if ((MI_ElectiveRemaining == 0) && (MI_Core1.size() == 0) && (MI_Core2.size() <= 1) && (MI_Core3.size() <= 1)) {
            System.out.println("You have completed the Machine Intelligence Track");
        } else {
            System.out.println("In order to complete the Machine Intelligence Track, you have yet to complete the " +
                    "following:");
        }

        if ((MI_Core1.size() == 0) && (MI_Core2.size() <= 1) && (MI_Core3.size() <= 1)) {
            System.out.println("You have completed all the cores for this track. Good job.");
        } else {
            System.out.println("Cores: ");
            System.out.println("NOTE: Students considering graduate work or research in this area are encouraged to " +
                    "take STAT/MA 41600 and STAT 41700");
        }
        if (MI_Core1.size() != 0) {
            System.out.println("All from: " + MI_Core1);
        }
        if (MI_Core2.size() > 1) {
            System.out.println("1 from: " + MI_Core2);
        }
        if (MI_Core3.size() > 1) {
            System.out.println("1 from: " + MI_Core3);
        }

        if (MI_ElectiveRemaining == 0) {
            System.out.println("Electives for this tracks are complete. Good job.");
        } else if (MI_ElectiveRemaining != 0) {
            System.out.println(MI_ElectiveRemaining + " Elective(s) from the list: " + MI_Elective);
            System.out.println("Three credits of a relevant EPICS or independent study project may be used as one " +
                    "elective with track committee approval.");


        }

        System.out.println("*******************************************************************************************");
        System.out.println("*******************************************************************************************");

        //Software Engineering Track

        SE_Core1.removeAll(userCourses);
        SE_Core2.removeAll(userCourses);
        SE_Elective.removeAll(userCourses);

        int SE_ElectiveRemaining = 2 - (12 - SE_Elective.size());

        if (!userCourses.contains(35200) && !userCourses.contains(35400) && SE_Elective.size() <= 10) {
            SE_ElectiveRemaining = 0;
        }
        if (userCourses.contains(35200) && !userCourses.contains(35400) && SE_Elective.size() <= 9) {
            SE_ElectiveRemaining = 0;
        }

        if (!userCourses.contains(35200) && userCourses.contains(35400) && SE_Elective.size() <= 9) {
            SE_ElectiveRemaining = 0;
        }

        if (userCourses.contains(35200) && userCourses.contains(35400) && SE_Elective.size() == 10) {
            SE_ElectiveRemaining = 1;
        }

        if (userCourses.contains(35200) && userCourses.contains(35400) && SE_Elective.size() < 10) {
            SE_ElectiveRemaining = 0;
        }

        if ((SE_Core1.size() == 0) && (SE_Core2.size() <= 1) && (SE_ElectiveRemaining == 0)) {

            System.out.println("You have completed the Software Engineering Track");
        } else {
            System.out.println("In order to complete the Software Engineering Track, you have yet to complete the " +
                    "following:");
            System.out.println("Note: Neither CS 35200 nor CS 35400 can be double counted toward the required and " +
                    "elective courses");
        }

        if ((SE_Core1.size() == 0) && (SE_Core2.size() <= 1)) {
            System.out.println("You have completed all the cores for this track. Good job.");

        } else if ((SE_Core1.size() != 0) || (SE_Core2.size() > 1)) {
            System.out.println("Cores:");
        }

        if (SE_Core1.size() != 0) {
            System.out.println("All from: " + SE_Core1);
        }
        if (SE_Core2.size() > 1) {
            System.out.println("1 from: " + SE_Core2);
        }

        if (SE_ElectiveRemaining == 0) {
            System.out.println("Electives for this tracks are complete. Good job.");
        } else if (SE_ElectiveRemaining != 0) {
            System.out.println(SE_ElectiveRemaining + " Elective(s) from the list:" + SE_Elective);
        }

        System.out.println("*******************************************************************************************");
        System.out.println("*******************************************************************************************");

        //Computational Science and Engineering Track

        CSE_Core1.removeAll(userCourses);
        CSE_Core2.removeAll(userCourses);
        CSE_L1.removeAll(userCourses);
        CSE_L2a.removeAll(userCourses);
        CSE_L2b.removeAll(userCourses);
        CSE_L3.removeAll(userCourses);
        CSE_L4.removeAll(userCourses);
        CSE_L5.removeAll(userCourses);
        CSE_L6.removeAll(userCourses);

        boolean l1 = false;  //bool for List base completion (Atleast 1)
        boolean l2 = false;
        boolean l3 = false;
        boolean l4 = false;
        boolean l5 = false;
        boolean l6 = false;


        if (CSE_L1.size() <= 1) {
            l1 = true;
        }
        if (CSE_L2a.size() <= 5 || CSE_L2b.size() <= 1) {
            l2 = true;
        }
        if (CSE_L3.size() == 0) {
            l3 = true;
        }
        if (CSE_L4.size() == 0) {
            l4 = true;
        }
        if (CSE_L5.size() <= 2) {
            l5 = true;
        }
        if (CSE_L6.size() <= 4) {
            l6 = true;
        }

        int optionCount1 = 0;
        int optionCount2 = 0;

        //option1 counter code
        optionCount1 += (2 - CSE_L1.size());
        optionCount1 += (6 - CSE_L2a.size());
        optionCount1 += (2 - CSE_L2b.size());
        if (userCourses.contains(34800) && userCourses.contains(44800)) {
            optionCount1 -= 1;
        }


        //option2 counter code
        optionCount2 += (1 - CSE_L3.size());
        optionCount2 += (1 - CSE_L4.size());
        optionCount2 += (3 - CSE_L5.size());
        optionCount2 += (5 - CSE_L6.size());

        boolean op1done = false;
        boolean op2done = false;
        boolean coredone = false;   //Checks is either of the options is complete

        if ((optionCount1 >= 5) && (CSE_L1.size() <= 1) && ((CSE_L2a.size() <= 5) || CSE_L2b.size() <= 1)) {
            op1done = true;
        }

        if ((optionCount2 >= 5) && (CSE_L3.size() == 0) && (CSE_L4.size() == 0) && (CSE_L5.size() <= 2) && (CSE_L6.size() <= 4)) {
            op2done = true;
        }

        if ((CSE_Core1.size() == 0) && (CSE_Core2.size() <= 1)) {
            coredone = true;
        }

        if (coredone && op1done && op2done) {
            System.out.println("You have completed the Software Engineering Track");
        } else {
            System.out.println("In order to complete the Computational Science and Engineering Track, you have yet to" +
                    " complete the following:");
        }

        if (coredone) {
            System.out.println("You have completed all the cores for this track. Good job.");
        } else if (coredone == false) {
            System.out.println("Cores: ");
            if (CSE_Core1.size() != 0) {
                System.out.println("All from: " + CSE_Core1);
            }
            if (CSE_Core2.size() > 1) {
                System.out.println("One from: " + CSE_Core2);
            }
        }

        if (op1done || op2done) {
            System.out.println("Electives for this tracks are complete. Good job.");
        } else if (op1done == false && op2done == false) {
            System.out.println("###Complete either one option###");

            System.out.println("***Option 1: Practical/Applied***");
            System.out.println("Atleast " + (5 - optionCount1) + " more from the following");

            System.out.println("---List 1---");
            if (CSE_L1.size() == 2) {
                System.out.println("Must have atleast 1 from: " + CSE_L1);
            } else if (CSE_L1.size() == 1) {
                System.out.println("Choose from: " + CSE_L1);
            } else if (CSE_L1.size() == 0) {
                System.out.println("List 1 exhausted");
            }

            System.out.println("---List 2---");
            if (CSE_L2a.size() == 6) {
                System.out.println("Atleast 1 from: " + CSE_L2a);
                System.out.println("One from : " + CSE_L2b + " is also acceptable");
            }
            if (CSE_L2a.size() <= 5) {
                System.out.println(CSE_L2a);
                if (CSE_L2b.size() == 2) {
                    System.out.println("One from: " + CSE_L2b + " is allowed");
                }
            }
            if (CSE_L2a.size() == 0 && CSE_L2b.size() <= 1) {
                System.out.println("List 2 exhausted");
            }

            System.out.println("***Option 2 (academic)***");
            System.out.println("Atleast " + (5 - optionCount2) + " more from the following");

            System.out.println("---List 3---");
            if (CSE_L3.size() == 1) {
                System.out.println("You must do: " + CSE_L3);
            } else if (CSE_L3.size() == 0) {
                System.out.println("List 3 complete");
            }

            System.out.println("---List 4---");
            if (CSE_L4.size() == 1) {
                System.out.println("You must do: " + CSE_L4);
            } else if (CSE_L4.size() == 0) {
                System.out.println("List 4 complete");
            }

            System.out.println("---List 5---");

            if (CSE_L5.size() == 3) {
                System.out.println("You must do atleast 1 from: " + CSE_L5);
            } else if (CSE_L5.size() <= 2) {
                System.out.println("You can also do: " + CSE_L5);

            } else if (CSE_L3.size() == 0) {
                System.out.println("List 5 exhausted");
            }
            System.out.println("---List 6---");

            if (CSE_L6.size() == 5) {
                System.out.println("You must do atleast 1 from: " + CSE_L6);
            } else if (CSE_L6.size() <= 4) {
                System.out.println("You can also do: " + CSE_L6);

            } else if (CSE_L6.size() == 0) {
                System.out.println("List 6 exhausted");
            }
        }

        System.out.println("*******************************************************************************************");
        System.out.println("*******************************************************************************************");
    }
}