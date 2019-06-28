package com.example.application.tripiser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        getRadio();             //gets the state of radio button.
    }

    public void getRadio()
    {
        RadioButton tp1=(RadioButton) findViewById(R.id.tp1);       //Declaration of all the radio buttons.
        RadioButton tp2=(RadioButton) findViewById(R.id.tp2);
        RadioButton fab1=(RadioButton) findViewById(R.id.fab1);
        RadioButton fab2=(RadioButton) findViewById(R.id.fab2);
        RadioButton eat1=(RadioButton) findViewById(R.id.eat1);
        RadioButton eat2=(RadioButton) findViewById(R.id.eat2);
        RadioButton pc1=(RadioButton) findViewById(R.id.pc1);
        RadioButton pc2=(RadioButton) findViewById(R.id.pc2);
        RadioButton ps1=(RadioButton) findViewById(R.id.ps1);
        RadioButton ps2=(RadioButton) findViewById(R.id.ps2);
        RadioButton cl1=(RadioButton) findViewById(R.id.cl1);
        RadioButton cl2=(RadioButton) findViewById(R.id.cl2);
        RadioButton cos1=(RadioButton) findViewById(R.id.cos1);
        RadioButton cos2=(RadioButton) findViewById(R.id.cos2);
        RadioButton ft1=(RadioButton) findViewById(R.id.ft1);
        RadioButton ft2=(RadioButton) findViewById(R.id.ft2);
        RadioButton tr1=(RadioButton) findViewById(R.id.tr1);
        RadioButton tr2=(RadioButton) findViewById(R.id.tr2);
        RadioButton tw1=(RadioButton) findViewById(R.id.tw1);
        RadioButton tw2=(RadioButton) findViewById(R.id.tw2);
        RadioButton copd1=(RadioButton) findViewById(R.id.copd1);
        RadioButton copd2=(RadioButton) findViewById(R.id.copd2);
        RadioButton sk1=(RadioButton) findViewById(R.id.sk1);
        RadioButton sk2=(RadioButton) findViewById(R.id.sk2);

        List<String> arr=new ArrayList<String>();    //In getRadio fuction
        try {
            FileInputStream fin=openFileInput("list.txt");
            BufferedReader br=new BufferedReader(new InputStreamReader(fin));
            String str;
            if((str=br.readLine())!=null)
            {
                char a[]=str.toCharArray();
                switch(a[0])
                {
                    case 'w':tp1.setChecked(true);
                        break;
                    case 't':tp2.setChecked(true);
                        break;
                    default:
                        break;
                }
            }
            if((str=br.readLine())!=null)
            {
                char a[]=str.toCharArray();
                switch(a[0])
                {
                    case 'w':fab1.setChecked(true);
                        break;
                    case 't':fab2.setChecked(true);
                        break;
                    default:
                        break;
                }
            }
            if((str=br.readLine())!=null)
            {
                char a[]=str.toCharArray();
                switch(a[0])
                {
                    case 'w':eat1.setChecked(true);
                        break;
                    case 't':eat2.setChecked(true);
                        break;
                    default:
                        break;
                }
            }
            if((str=br.readLine())!=null)
            {
                char a[]=str.toCharArray();
                switch(a[0])
                {
                    case 'w':pc1.setChecked(true);
                        break;
                    case 't':pc2.setChecked(true);
                        break;
                    default:
                        break;
                }
            }
            if((str=br.readLine())!=null)
            {
                char a[]=str.toCharArray();
                switch(a[0])
                {
                    case 'w':ps1.setChecked(true);
                        break;
                    case 't':ps2.setChecked(true);
                        break;
                    default:
                        break;
                }
            }
            if((str=br.readLine())!=null)
            {
                char a[]=str.toCharArray();
                switch(a[0])
                {
                    case 'w':cl1.setChecked(true);
                        break;
                    case 't':cl2.setChecked(true);
                        break;
                    default:
                        break;
                }
            }
            if((str=br.readLine())!=null)
            {
                char a[]=str.toCharArray();
                switch(a[0])
                {
                    case 'w':cos1.setChecked(true);
                        break;
                    case 't':cos2.setChecked(true);
                        break;
                    default:
                        break;
                }
            }
            if((str=br.readLine())!=null)
            {
                char a[]=str.toCharArray();
                switch(a[0])
                {
                    case 'w':ft1.setChecked(true);
                        break;
                    case 't':ft2.setChecked(true);
                        break;
                    default:
                        break;
                }
            }
            if((str=br.readLine())!=null)
            {
                char a[]=str.toCharArray();
                switch(a[0])
                {
                    case 'w':tr1.setChecked(true);
                        break;
                    case 't':tr2.setChecked(true);
                        break;
                    default:
                        break;
                }
            }
            if((str=br.readLine())!=null)
            {
                char a[]=str.toCharArray();
                switch(a[0])
                {
                    case 'w':tw1.setChecked(true);
                        break;
                    case 't':tw2.setChecked(true);
                        break;
                    default:
                        break;
                }
            }
            if((str=br.readLine())!=null)
            {
                char a[]=str.toCharArray();
                switch(a[0])
                {
                    case 'w':copd1.setChecked(true);
                        break;
                    case 't':copd2.setChecked(true);
                        break;
                    default:
                        break;
                }
            }
            if((str=br.readLine())!=null)
            {
                char a[]=str.toCharArray();
                switch(a[0])
                {
                    case 'w':sk1.setChecked(true);
                        break;
                    case 't':sk2.setChecked(true);
                        break;
                    default:
                        break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        saveRadio();            //Saves the state of all the radioButtons.
    }

    public void saveRadio()
    {
        RadioButton tp1=(RadioButton) findViewById(R.id.tp1);       //Declaration of all the radio buttons
        RadioButton tp2=(RadioButton) findViewById(R.id.tp2);
        RadioButton fab1=(RadioButton) findViewById(R.id.fab1);
        RadioButton fab2=(RadioButton) findViewById(R.id.fab2);
        RadioButton eat1=(RadioButton) findViewById(R.id.eat1);
        RadioButton eat2=(RadioButton) findViewById(R.id.eat2);
        RadioButton pc1=(RadioButton) findViewById(R.id.pc1);
        RadioButton pc2=(RadioButton) findViewById(R.id.pc2);
        RadioButton ps1=(RadioButton) findViewById(R.id.ps1);
        RadioButton ps2=(RadioButton) findViewById(R.id.ps2);
        RadioButton cl1=(RadioButton) findViewById(R.id.cl1);
        RadioButton cl2=(RadioButton) findViewById(R.id.cl2);
        RadioButton cos1=(RadioButton) findViewById(R.id.cos1);
        RadioButton cos2=(RadioButton) findViewById(R.id.cos2);
        RadioButton ft1=(RadioButton) findViewById(R.id.ft1);
        RadioButton ft2=(RadioButton) findViewById(R.id.ft2);
        RadioButton tr1=(RadioButton) findViewById(R.id.tr1);
        RadioButton tr2=(RadioButton) findViewById(R.id.tr2);
        RadioButton tw1=(RadioButton) findViewById(R.id.tw1);
        RadioButton tw2=(RadioButton) findViewById(R.id.tw2);
        RadioButton copd1=(RadioButton) findViewById(R.id.copd1);
        RadioButton copd2=(RadioButton) findViewById(R.id.copd2);
        RadioButton sk1=(RadioButton) findViewById(R.id.sk1);
        RadioButton sk2=(RadioButton) findViewById(R.id.sk2);
        try {
            String filename="list.txt";
            if(tp1.isChecked())                                 //checking every radiobutton and saving its state
            {
                writeit("w\n",filename,MODE_PRIVATE);
            }
            else if(tp2.isChecked())
            {
                writeit("t\n",filename,MODE_APPEND);
            }
            else
            {
                writeit("c\n",filename,MODE_APPEND);
            }
            if(fab1.isChecked())
            {
                writeit("w\n",filename,MODE_APPEND);
            }
            else if(fab2.isChecked())
            {
                writeit("t\n",filename,MODE_APPEND);
            }
            else
            {
                writeit("c\n",filename,MODE_APPEND);
            }
            if(eat1.isChecked())
            {
                writeit("w\n",filename,MODE_APPEND);
            }
            else if(eat2.isChecked())
            {
                writeit("t\n",filename,MODE_APPEND);
            }
            else
            {
                writeit("c\n",filename,MODE_APPEND);
            }
            if(pc1.isChecked())
            {
                writeit("w\n",filename,MODE_APPEND);
            }
            else if(pc2.isChecked())
            {
                writeit("t\n",filename,MODE_APPEND);
            }
            else
            {
                writeit("c\n",filename,MODE_APPEND);
            }
            if(ps1.isChecked())
            {
                writeit("w\n",filename,MODE_APPEND);
            }
            else if(ps2.isChecked())
            {
                writeit("t\n",filename,MODE_APPEND);
            }
            else
            {
                writeit("c\n",filename,MODE_APPEND);
            }
            if(cl1.isChecked())
            {
                writeit("w\n",filename,MODE_APPEND);
            }
            else if(cl2.isChecked())
            {
                writeit("t\n",filename,MODE_APPEND);
            }
            else
            {
                writeit("c\n",filename,MODE_APPEND);
            }
            if(cos1.isChecked())
            {
                writeit("w\n",filename,MODE_APPEND);
            }
            else if(cos2.isChecked())
            {
                writeit("t\n",filename,MODE_APPEND);
            }
            else
            {
                writeit("c\n",filename,MODE_APPEND);
            }
            if(ft1.isChecked())
            {
                writeit("w\n",filename,MODE_APPEND);
            }
            else if(ft2.isChecked())
            {
                writeit("t\n",filename,MODE_APPEND);
            }
            else
            {
                writeit("c\n",filename,MODE_APPEND);
            }
            if(tr1.isChecked())
            {
                writeit("w\n",filename,MODE_APPEND);
            }
            else if(tr2.isChecked())
            {
                writeit("t\n",filename,MODE_APPEND);
            }
            else
            {
                writeit("c\n",filename,MODE_APPEND);
            }
            if(tw1.isChecked())
            {
                writeit("w\n",filename,MODE_APPEND);
            }
            else if(tw2.isChecked())
            {
                writeit("t\n",filename,MODE_APPEND);
            }
            else
            {
                writeit("c\n",filename,MODE_APPEND);
            }
            if(copd1.isChecked())
            {
                writeit("w\n",filename,MODE_APPEND);
            }
            else if(copd2.isChecked())
            {
                writeit("t\n",filename,MODE_APPEND);
            }
            else
            {
                writeit("c\n",filename,MODE_APPEND);
            }
            if(sk1.isChecked())
            {
                writeit("w\n",filename,MODE_APPEND);
            }
            else if(sk2.isChecked())
            {
                writeit("t\n",filename,MODE_APPEND);
            }
            else
            {
                writeit("c\n",filename,MODE_APPEND);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeit(String str,String fname,int mode) throws IOException
    {
        FileOutputStream fout=openFileOutput(fname,mode);
        fout.write(str.getBytes());
    }

}
