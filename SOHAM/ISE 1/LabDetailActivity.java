package com.example.ise1_123;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LabDetailActivity extends AppCompatActivity {

    ImageView labImage;
    TextView labInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_detail);

        labImage = findViewById(R.id.labImage);
        labInfo = findViewById(R.id.labInfo);

        String lab = getIntent().getStringExtra("labNumber");

        if(lab.equals("1")){
            labImage.setImageResource(R.drawable.lab1);
            labInfo.setText("Lab 1 : Java Programming Lab\n" +
                    "The JAVA Programming lab is used to perform practicals of Advance C Programming, Data Structures, Information Security, Domain specific mini project and Compiler Construction. The software's that are installed includes Ubuntu OS, Open JDK and GCC packages.\n" +
                    "\n" +
                    "Key Features & Facilities\n" +
                    "Dell OptiPlex 3020 Machines\n" +
                    "Microprocessor Anshuman Kit\n" +
                    "IOT Kit\n" +
                    "HP Laser Jet 1020 Printer\n" +
                    "6 KVA Rudra UPS\n" +
                    "Courses: Java Programming, JavaScript, Web Development");
        }
        else if(lab.equals("2")){
            labImage.setImageResource(R.drawable.lab2);
            labInfo.setText("Lab 2 : Advanced Database System Lab\n" +
                    "The Advance Database System Programming lab is used to perform practicals of Project I, Project II, Advance C Programming, System Programming and Database Engineering. The software's that are installed includes Ubuntu OS, MySQL, Atom editor, Brackets editor, GCC, g++ and Open JDK packages.\n" +
                    "\n" +
                    "Key Features & Facilities\n" +
                    "Dell OptiPlex 5090 & 390 Machines\n" +
                    "6 KVA Renutron UPS\n" +
                    "HP Laser Jet P1008 Printer");
        }
        else if(lab.equals("3")){
            labImage.setImageResource(R.drawable.lab3);
            labInfo.setText("Lab 3 : Database Engineering Lab\n" +
                    "The Database Engineering lab is used to perform practicals of Database Engineering, Web Technology, Java Programming, Domain specific mini project and Computer Network Laboratory. The software's that are installed includes Ubuntu OS, MySQL, MongoDB, GCC, g++ and Open JDK packages.\n" +
                    "\n" +
                    "Key Features & Facilities\n" +
                    "Dell OptiPlex 3020 Machines\n" +
                    "6 KVA Rudra UPS");
        }
        else if(lab.equals("4")){
            labImage.setImageResource(R.drawable.lab4);
            labInfo.setText("Lab 4 : R Programming Lab\n" +
                    "The R Programming lab is used to perform practicals of Data Structures, Web Technology, Java Programming and CNN. The software's that are installed includes Ubuntu OS, Rstudio, GCC, g++ and Open JDK packages.\n" +
                    "\n" +
                    "Key Features & Facilities\n" +
                    "Dell OptiPlex 5090 Machines\n" +
                    "6 KVA Renutron UPS");
        }
        else if(lab.equals("5")){
            labImage.setImageResource(R.drawable.lab5);
            labInfo.setText("Lab 5 :Project Lab\n" +
                    "The Project lab is used to perform practicals of Project I, Project II, Advance C Programming, System Programming and Database Engineering. The software's that are installed includes Ubuntu OS, MySQL, Atom editor, Brackets editor, GCC, g++ and OpenJDK packages.\n" +
                    "\n" +
                    "Key Features & Facilities\n" +
                    "Dell OptiPlex 5090 & 390 Machines\n" +
                    "6 KVA Renutron UPS\n" +
                    "HP Laser Jet P1008 Printer");
        }
        else if(lab.equals("6")){
            labImage.setImageResource(R.drawable.lab6);
            labInfo.setText("Lab 6 : Research Lab\n" +
                    "The Research Lab is used to perform practicals of Project I/II, Data Structures, Java Programming, Operating System and Domain specific mini project. The software's that are installed includes Ubuntu OS, Atom editor, Brackets editor, PyCharm editor, MySQL, MongoDB, GCC, and Open JDK packages.\n" +
                    "\n" +
                    "Key Features & Facilities\n" +
                    "Dell OptiPlex 390 Machines\n" +
                    "6 KVA Emerson UPS\n" +
                    "HP 1020 LaserJet Printer");
        }
        else if(lab.equals("7")){
            labImage.setImageResource(R.drawable.lab7);
            labInfo.setText("Lab 7 : Web Technology Lab\n" +
                    "The Web Technology lab is used to perform practicals of Web Technology, Advance C Programming, Java Programming, CNN and Domain specific mini project. The software's that are installed includes Ubuntu and Window OS, XAMPP server, Wampserver, Atom editor, Brackets editor, GCC, and Open JDK packages.\n" +
                    "\n" +
                    "Key Features & Facilities\n" +
                    "Dell OptiPlex 5090 Machines\n" +
                    "HP Laser Jet M1522 Printer\n" +
                    "6 KVA Renutron UPS");
        }
        else if(lab.equals("8")){
            labImage.setImageResource(R.drawable.lab8);
            labInfo.setText("Lab 8 : Python Programming Lab\n" +
                    "The Python Programming lab is used to perform practicals of Compiler Construction, BDA, Operating System, Database Engineering and Compiler Construction. The software's that are installed includes Ubuntu OS, PyCharm editor, Atom editor, Brackets editor, GCC, g++ and Open JDK packages.\n" +
                    "\n" +
                    "Key Features & Facilities\n" +
                    "Dell OptiPlex 3020 Machines\n" +
                    "6 KVA Renutron UPS\n" +
                    "Canon Image Class LBC6030w Printer");
        }
        else if(lab.equals("9")){
            labImage.setImageResource(R.drawable.lab9);
            labInfo.setText("Lab 9 : C Programming Lab\n" +
                    "The C Programming lab is used to perform practicals of C language. The software's that are installed includes Ubuntu OS, GCC, g++ .\n" +
                    "\n" +
                    "Key Features & Facilities\n" +
                    "HP 280 GT Machines\n" +
                    "6 KVA Rudra UPS");
        }
        else if(lab.equals("10")){
            labImage.setImageResource(R.drawable.lab10);
            labInfo.setText("Lab 10 : System Programming Lab\n" +
                    "Laboratory for system programming and low-level software development.\n" +
                    "\n" +
                    "Key Features & Facilities\n" +
                    "Dell OptiPlex 7000 i7 Machines\n" +
                    "Courses: Database Engineering, Advanced Database Systems");
        }
        else if(lab.equals("11")){
            labImage.setImageResource(R.drawable.lab11);
            labInfo.setText("Lab 11 : Mobile Application Development Lab\n" +
                    "The Mobile Application Development lab is used to perform practical's of Mobile Application development, Data Structures, Java Programming, Information Security and Domain specific mini project. The software's that are installed includes Ubuntu and Window OS, Android studio, Atom editor, Brackets editor, GCC, and Open JDK packages.\n" +
                    "\n" +
                    "Key Features & Facilities\n" +
                    "Dell OptiPlex 5090 Machines\n" +
                    "6 KVA Rudra UPS\n" +
                    "HP Laser Jet P2055dn printer");
        }
        else if(lab.equals("12")){
            labImage.setImageResource(R.drawable.lab12);
            labInfo.setText("Lab 12 : C++ Programming Lab\n" +
                    "The C++ Programming lab is used to perform practicals of C++ language. The software's that are installed includes Ubuntu OS, GCC, g++.\n" +
                    "\n" +
                    "Key Features & Facilities\n" +
                    "Dell OptiPlex 3020 Machines\n" +
                    "6 KVA Renutron UPS.");
        }

    }
}