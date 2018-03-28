package com.example.dk.myapplication;


import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends Activity {

    public int time =0;
    public int vt;
    public int lathinh1;
    public int lathinh2;
    Boolean a1 = false,a2 = false,a3 = false,a4 = false,a5 = false,a6 = false,a7 = false,a8 = false,a9 = false,a10 = false,a11 = false,a12 = false,a13 = false,a14 = false,a15 = false,a16 = false; // khi xoa hinh thi khong cho click vao hinh nua
    Boolean a1_kich1lan = false,a2_kich1lan = false,a3_kich1lan = false,a4_kich1lan = false,a5_kich1lan = false,a6_kich1lan = false,a7_kich1lan = false,a8_kich1lan = false,a9_kich1lan = false,a10_kich1lan = false,a11_kich1lan = false,a12_kich1lan = false,a13_kich1lan = false,a14_kich1lan = false,a15_kich1lan = false,a16_kich1lan = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    Timer t = new Timer();
    public void xoahinhtrungnhau()
    {
        time=0;
        t.scheduleAtFixedRate(new TimerTask()
        {
            @Override
            public void run()
            {
                runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {

                        time += 1;
                        if(time == 1)
                        {
                            if(vt==1)
                            {
                                //1-2
                                img = (ImageView) findViewById(R.id.a1);
                                img.setImageResource(Color.BLACK);
                                img = (ImageView) findViewById(R.id.a2);
                                img.setImageResource(Color.BLACK);

                                a1 = true;
                                a2 = true;
                                vt=0;
                                kiemtratrung =0;
                                chiclick2hinh =0;
                                lathinh1 =0;
                                //return;
                            }
                            if(vt==2)
                            {
                                //3-5
                                img = (ImageView) findViewById(R.id.a3);
                                img.setImageResource(Color.BLACK);
                                img = (ImageView) findViewById(R.id.a5);
                                img.setImageResource(Color.BLACK);
                                vt=0;
                                a3 = true;
                                a5 = true;
                                kiemtratrung =0;
                                chiclick2hinh =0;
                                lathinh1 =0;
                                //return;
                            }
                            if(vt==3)
                            {
                                //4-8
                                img = (ImageView) findViewById(R.id.a4);
                                img.setImageResource(Color.BLACK);
                                img = (ImageView) findViewById(R.id.a8);
                                img.setImageResource(Color.BLACK);
                                vt=0;
                                a4 = true;
                                a8 = true;
                                kiemtratrung =0;
                                chiclick2hinh =0;
                                lathinh1 =0;
                                //return;
                            }
                            if(vt==4)
                            {
                                //6-15
                                img = (ImageView) findViewById(R.id.a6);
                                img.setImageResource(Color.BLACK);
                                img = (ImageView) findViewById(R.id.a15);
                                img.setImageResource(Color.BLACK);
                                vt=0;
                                a6 = true;
                                a15 = true;
                                kiemtratrung =0;
                                chiclick2hinh =0;
                                lathinh1 =0;
                                //return;
                            }
                            if(vt==5)
                            {
                                //7-13
                                img = (ImageView) findViewById(R.id.a7);
                                img.setImageResource(Color.BLACK);
                                img = (ImageView) findViewById(R.id.a13);
                                img.setImageResource(Color.BLACK);
                                vt=0;
                                a7 = true;
                                a13 = true;
                                kiemtratrung =0;
                                chiclick2hinh =0;
                                lathinh1 =0;
                                //return;
                            }
                            if(vt==6)
                            {
                                //9-12
                                img = (ImageView) findViewById(R.id.a9);
                                img.setImageResource(Color.BLACK);
                                img = (ImageView) findViewById(R.id.a12);
                                img.setImageResource(Color.BLACK);
                                vt=0;
                                a9 = true;
                                a12 = true;
                                kiemtratrung =0;
                                chiclick2hinh =0;
                                lathinh1 =0;
                                //return;
                            }
                            if(vt==7)
                            {
                                //10-16
                                img = (ImageView) findViewById(R.id.a10);
                                img.setImageResource(Color.BLACK);
                                img = (ImageView) findViewById(R.id.a16);
                                img.setImageResource(Color.BLACK);
                                vt=0;
                                a10 = true;
                                a16 = true;
                                kiemtratrung =0;
                                chiclick2hinh=0;
                                lathinh1 =0;
                                //return;
                            }
                            if(vt==8)
                            {
                                //11-14
                                img = (ImageView) findViewById(R.id.a11);
                                img.setImageResource(Color.BLACK);
                                img = (ImageView) findViewById(R.id.a14);
                                img.setImageResource(Color.BLACK);
                                vt=0;
                                a11 = true;
                                a14 = true;
                                kiemtratrung =0;
                                chiclick2hinh =0;
                                lathinh1 =0;
                                //return;
                            }
                            //upbaikhongtrung();
                            //Toast.makeText(getApplication(), "Bạn Đã Chiến Thắng", Toast.LENGTH_SHORT).show();
                        }
                    }

                });
            }

        }, 0, 1000);
    }

    public void upbaikhongtrung()
    {
        time=0;
        t.scheduleAtFixedRate(new TimerTask()
        {
            @Override
            public void run()
            {
                runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        time += 1;
                        if(time == 1)
                        {

                            if(lathinh2 ==1)
                            {
                                img=(ImageView) findViewById(R.id.a1);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==2)
                            {
                                img=(ImageView) findViewById(R.id.a2);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==3)
                            {
                                img=(ImageView) findViewById(R.id.a3);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==4)
                            {
                                img=(ImageView) findViewById(R.id.a4);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==5)
                            {
                                img=(ImageView) findViewById(R.id.a5);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==6)
                            {
                                img=(ImageView) findViewById(R.id.a6);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==7)
                            {
                                img=(ImageView) findViewById(R.id.a7);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==8)
                            {
                                img=(ImageView) findViewById(R.id.a8);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==9)
                            {
                                img=(ImageView) findViewById(R.id.a9);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==10)
                            {
                                img=(ImageView) findViewById(R.id.a10);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==11)
                            {
                                img=(ImageView) findViewById(R.id.a11);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==12)
                            {
                                img=(ImageView) findViewById(R.id.a12);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==13)
                            {
                                img=(ImageView) findViewById(R.id.a13);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==14)
                            {
                                img=(ImageView) findViewById(R.id.a14);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==15)
                            {
                                img=(ImageView) findViewById(R.id.a15);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==16)
                            {
                                img=(ImageView) findViewById(R.id.a16);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh1==1)
                            {
                                img=(ImageView) findViewById(R.id.a1);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a1_kich1lan = false;
                            }
                            if(lathinh1==2)
                            {
                                img=(ImageView) findViewById(R.id.a2);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a2_kich1lan = false;
                            }
                            if(lathinh1==3)
                            {
                                img=(ImageView) findViewById(R.id.a3);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a3_kich1lan = false;
                            }
                            if(lathinh1==4)
                            {
                                img=(ImageView) findViewById(R.id.a4);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a4_kich1lan = false;
                            }
                            if(lathinh1==5)
                            {
                                img=(ImageView) findViewById(R.id.a5);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a5_kich1lan = false;
                            }
                            if(lathinh1==6)
                            {
                                img=(ImageView) findViewById(R.id.a6);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a6_kich1lan = false;
                            }
                            if(lathinh1==7)
                            {
                                img=(ImageView) findViewById(R.id.a7);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a7_kich1lan = false;
                            }
                            if(lathinh1==8)
                            {
                                img=(ImageView) findViewById(R.id.a8);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a8_kich1lan = false;
                            }
                            if(lathinh1==9)
                            {
                                img=(ImageView) findViewById(R.id.a9);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a9_kich1lan = false;
                            }
                            if(lathinh1==10)
                            {
                                img=(ImageView) findViewById(R.id.a10);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a10_kich1lan = false;
                            }
                            if(lathinh1==11)
                            {
                                img=(ImageView) findViewById(R.id.a11);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a11_kich1lan = false;
                            }
                            if(lathinh1==12)
                            {
                                img=(ImageView) findViewById(R.id.a12);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a12_kich1lan = false;
                            }
                            if(lathinh1==13)
                            {
                                img=(ImageView) findViewById(R.id.a13);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a13_kich1lan = false;
                            }
                            if(lathinh1==14)
                            {
                                img=(ImageView) findViewById(R.id.a14);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a14_kich1lan = false;
                            }
                            if(lathinh1==15)
                            {
                                img=(ImageView) findViewById(R.id.a15);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a15_kich1lan = false;
                            }
                            if(lathinh1==16)
                            {
                                img=(ImageView) findViewById(R.id.a16);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a16_kich1lan = false;
                            }
                        }
                    }

                });
            }

        }, 0, 1000);

    }

    int thebai[] = { R.drawable.a0, R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4,R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8};
    int chiclick2hinh = 0;
    int kiemtratrung = 0;
    ImageView img;

    public void btnClick(View v)
    {
        switch (v.getId()) {
            case R.id.a1:
                if(!a1_kich1lan&&!a1)
                {
                    a1_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a1);
                    img.setImageResource(thebai[1]);
                    if(kiemtratrung==1)
                    {
                        vt=1;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung =1;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =1;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2 = 1;
                            upbaikhongtrung();
                            a1_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a2:
                if(!a2_kich1lan&&!a2)
                {
                    a2_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a2);
                    img.setImageResource(thebai[1]);
                    if(kiemtratrung==1)
                    {
                        vt=1;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 1;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =2;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2 =2;
                            upbaikhongtrung();
                            a2_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a3:
                if(!a3_kich1lan&&!a3)
                {
                    a3_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a3);
                    img.setImageResource(thebai[2]);
                    if(kiemtratrung==2)
                    {
                        vt=2;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 2;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =3;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2 =3;
                            upbaikhongtrung();
                            a3_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a4:
                if(!a4_kich1lan&&!a4)
                {
                    a4_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a4);
                    img.setImageResource(thebai[3]);
                    if(kiemtratrung==3)
                    {
                        vt=3;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 3;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =4;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=4;
                            upbaikhongtrung();
                            a4_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a5:
                if(!a5_kich1lan&&!a5)
                {
                    a5_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a5);
                    img.setImageResource(thebai[2]);
                    if(kiemtratrung==2)
                    {
                        vt=2;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 2;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =5;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=5;
                            upbaikhongtrung();
                            a5_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a6:
                if(!a6_kich1lan&&!a6)
                {
                    a6_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a6);
                    img.setImageResource(thebai[4]);
                    if(kiemtratrung==4)
                    {
                        vt=4;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 4;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =6;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=6;
                            upbaikhongtrung();
                            a6_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a7:
                if(!a7_kich1lan&&!a7)
                {
                    a7_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a7);
                    img.setImageResource(thebai[5]);
                    if(kiemtratrung==5)
                    {
                        vt=5;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 5;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =7;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=7;
                            upbaikhongtrung();
                            a7_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a8:
                if(!a8_kich1lan&&!a8)
                {
                    a8_kich1lan= true;
                    img=(ImageView) findViewById(R.id.a8);
                    img.setImageResource(thebai[3]);
                    if(kiemtratrung==3)
                    {
                        vt=3;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 3;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =8;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=8;
                            upbaikhongtrung();
                            a8_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a9:
                if(!a9_kich1lan&&!a9)
                {
                    a9_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a9);
                    img.setImageResource(thebai[6]);
                    if(kiemtratrung==6)
                    {
                        vt=6;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 6;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =9;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=9;
                            upbaikhongtrung();
                            a9_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a10:
                if(!a10_kich1lan&&!a10)
                {
                    a10_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a10);
                    img.setImageResource(thebai[7]);
                    if(kiemtratrung==7)
                    {
                        vt=7;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 7;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =10;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2 =10;
                            upbaikhongtrung();
                            a10_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a11:
                if(!a11_kich1lan&&!a11)
                {
                    a11_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a11);
                    img.setImageResource(thebai[8]);
                    if(kiemtratrung==8)
                    {
                        vt=8;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 8;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =11;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2 =11;
                            upbaikhongtrung();
                            a11_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a12:
                if(!a12_kich1lan&&!a12)
                {
                    a12_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a12);
                    img.setImageResource(thebai[6]);
                    if(kiemtratrung==6)
                    {
                        vt=6;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 6;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =12;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2 =12;
                            upbaikhongtrung();
                            a12_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a13:
                if(!a13_kich1lan&&!a13)
                {
                    a13_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a13);
                    img.setImageResource(thebai[5]);
                    if(kiemtratrung==5)
                    {
                        vt=5;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 5;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =13;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=13;
                            upbaikhongtrung();
                            a13_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a14:
                if(!a14_kich1lan&&!a14)
                {
                    a14_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a14);
                    img.setImageResource(thebai[8]);
                    if(kiemtratrung==8)
                    {
                        vt=8;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 8;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =14;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=14;
                            upbaikhongtrung();
                            a14_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a15:
                if(!a15_kich1lan&&!a15)
                {
                    a15_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a15);
                    img.setImageResource(thebai[4]);
                    if(kiemtratrung==4)
                    {
                        vt=4;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 4;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =15;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=15;
                            upbaikhongtrung();
                            a15_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a16:
                if(!a16_kich1lan&&!a16)
                {
                    a16_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a16);
                    img.setImageResource(thebai[7]);
                    if(kiemtratrung==7)
                    {

                        vt=7;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 7;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =16;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=16;
                            upbaikhongtrung();
                            a16_kich1lan = false;
                        }
                    }
                }
                break;
            default:
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
package com.example.trucxanh;




        import java.util.Timer;
        import java.util.TimerTask;

        import android.os.Bundle;
        import android.app.Activity;
        import android.graphics.Color;
        import android.view.Menu;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.Toast;

public class MainActivity extends Activity {

    public int time =0;
    public int vt; // luu lainvi tri trung de xoa hinh 2 hinh trung nay
    public int lathinh1;// luu lai la bai de up neu 2 la bai khong trung nhau
    public int lathinh2;
    Boolean a1 = false,a2 = false,a3 = false,a4 = false,a5 = false,a6 = false,a7 = false,a8 = false,a9 = false,a10 = false,a11 = false,a12 = false,a13 = false,a14 = false,a15 = false,a16 = false; // khi xoa hinh thi khong cho click vao hinh nua
    Boolean a1_kich1lan = false,a2_kich1lan = false,a3_kich1lan = false,a4_kich1lan = false,a5_kich1lan = false,a6_kich1lan = false,a7_kich1lan = false,a8_kich1lan = false,a9_kich1lan = false,a10_kich1lan = false,a11_kich1lan = false,a12_kich1lan = false,a13_kich1lan = false,a14_kich1lan = false,a15_kich1lan = false,a16_kich1lan = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    Timer t = new Timer();
    public void xoahinhtrungnhau()
    {
        time=0;
        t.scheduleAtFixedRate(new TimerTask()
        {
            @Override
            public void run()
            {
                runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {

                        time += 1;
                        if(time == 1)
                        {
                            if(vt==1)
                            {
                                //1-2
                                img = (ImageView) findViewById(R.id.a1);
                                img.setImageResource(Color.BLACK);
                                img = (ImageView) findViewById(R.id.a2);
                                img.setImageResource(Color.BLACK);

                                a1 = true;
                                a2 = true;
                                vt=0;
                                kiemtratrung =0;
                                chiclick2hinh =0;
                                lathinh1 =0;
                                //return;
                            }
                            if(vt==2)
                            {
                                //3-5
                                img = (ImageView) findViewById(R.id.a3);
                                img.setImageResource(Color.BLACK);
                                img = (ImageView) findViewById(R.id.a5);
                                img.setImageResource(Color.BLACK);
                                vt=0;
                                a3 = true;
                                a5 = true;
                                kiemtratrung =0;
                                chiclick2hinh =0;
                                lathinh1 =0;
                                //return;
                            }
                            if(vt==3)
                            {
                                //4-8
                                img = (ImageView) findViewById(R.id.a4);
                                img.setImageResource(Color.BLACK);
                                img = (ImageView) findViewById(R.id.a8);
                                img.setImageResource(Color.BLACK);
                                vt=0;
                                a4 = true;
                                a8 = true;
                                kiemtratrung =0;
                                chiclick2hinh =0;
                                lathinh1 =0;
                                //return;
                            }
                            if(vt==4)
                            {
                                //6-15
                                img = (ImageView) findViewById(R.id.a6);
                                img.setImageResource(Color.BLACK);
                                img = (ImageView) findViewById(R.id.a15);
                                img.setImageResource(Color.BLACK);
                                vt=0;
                                a6 = true;
                                a15 = true;
                                kiemtratrung =0;
                                chiclick2hinh =0;
                                lathinh1 =0;
                                //return;
                            }
                            if(vt==5)
                            {
                                //7-13
                                img = (ImageView) findViewById(R.id.a7);
                                img.setImageResource(Color.BLACK);
                                img = (ImageView) findViewById(R.id.a13);
                                img.setImageResource(Color.BLACK);
                                vt=0;
                                a7 = true;
                                a13 = true;
                                kiemtratrung =0;
                                chiclick2hinh =0;
                                lathinh1 =0;
                                //return;
                            }
                            if(vt==6)
                            {
                                //9-12
                                img = (ImageView) findViewById(R.id.a9);
                                img.setImageResource(Color.BLACK);
                                img = (ImageView) findViewById(R.id.a12);
                                img.setImageResource(Color.BLACK);
                                vt=0;
                                a9 = true;
                                a12 = true;
                                kiemtratrung =0;
                                chiclick2hinh =0;
                                lathinh1 =0;
                                //return;
                            }
                            if(vt==7)
                            {
                                //10-16
                                img = (ImageView) findViewById(R.id.a10);
                                img.setImageResource(Color.BLACK);
                                img = (ImageView) findViewById(R.id.a16);
                                img.setImageResource(Color.BLACK);
                                vt=0;
                                a10 = true;
                                a16 = true;
                                kiemtratrung =0;
                                chiclick2hinh=0;
                                lathinh1 =0;
                                //return;
                            }
                            if(vt==8)
                            {
                                //11-14
                                img = (ImageView) findViewById(R.id.a11);
                                img.setImageResource(Color.BLACK);
                                img = (ImageView) findViewById(R.id.a14);
                                img.setImageResource(Color.BLACK);
                                vt=0;
                                a11 = true;
                                a14 = true;
                                kiemtratrung =0;
                                chiclick2hinh =0;
                                lathinh1 =0;
                                //return;
                            }
                            //upbaikhongtrung();
                            //Toast.makeText(getApplication(), "Bạn Đã Chiến Thắng", Toast.LENGTH_SHORT).show();
                        }
                    }

                });
            }

        }, 0, 1000);
    }

    public void upbaikhongtrung()
    {
        time=0;
        t.scheduleAtFixedRate(new TimerTask()
        {
            @Override
            public void run()
            {
                runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        time += 1;
                        if(time == 1)
                        {

                            if(lathinh2 ==1)
                            {
                                img=(ImageView) findViewById(R.id.a1);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==2)
                            {
                                img=(ImageView) findViewById(R.id.a2);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==3)
                            {
                                img=(ImageView) findViewById(R.id.a3);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==4)
                            {
                                img=(ImageView) findViewById(R.id.a4);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==5)
                            {
                                img=(ImageView) findViewById(R.id.a5);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==6)
                            {
                                img=(ImageView) findViewById(R.id.a6);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==7)
                            {
                                img=(ImageView) findViewById(R.id.a7);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==8)
                            {
                                img=(ImageView) findViewById(R.id.a8);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==9)
                            {
                                img=(ImageView) findViewById(R.id.a9);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==10)
                            {
                                img=(ImageView) findViewById(R.id.a10);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==11)
                            {
                                img=(ImageView) findViewById(R.id.a11);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==12)
                            {
                                img=(ImageView) findViewById(R.id.a12);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==13)
                            {
                                img=(ImageView) findViewById(R.id.a13);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==14)
                            {
                                img=(ImageView) findViewById(R.id.a14);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==15)
                            {
                                img=(ImageView) findViewById(R.id.a15);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh2 ==16)
                            {
                                img=(ImageView) findViewById(R.id.a16);
                                img.setImageResource(thebai[0]);
                            }
                            if(lathinh1==1)
                            {
                                img=(ImageView) findViewById(R.id.a1);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a1_kich1lan = false;
                            }
                            if(lathinh1==2)
                            {
                                img=(ImageView) findViewById(R.id.a2);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a2_kich1lan = false;
                            }
                            if(lathinh1==3)
                            {
                                img=(ImageView) findViewById(R.id.a3);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a3_kich1lan = false;
                            }
                            if(lathinh1==4)
                            {
                                img=(ImageView) findViewById(R.id.a4);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a4_kich1lan = false;
                            }
                            if(lathinh1==5)
                            {
                                img=(ImageView) findViewById(R.id.a5);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a5_kich1lan = false;
                            }
                            if(lathinh1==6)
                            {
                                img=(ImageView) findViewById(R.id.a6);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a6_kich1lan = false;
                            }
                            if(lathinh1==7)
                            {
                                img=(ImageView) findViewById(R.id.a7);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a7_kich1lan = false;
                            }
                            if(lathinh1==8)
                            {
                                img=(ImageView) findViewById(R.id.a8);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a8_kich1lan = false;
                            }
                            if(lathinh1==9)
                            {
                                img=(ImageView) findViewById(R.id.a9);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a9_kich1lan = false;
                            }
                            if(lathinh1==10)
                            {
                                img=(ImageView) findViewById(R.id.a10);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a10_kich1lan = false;
                            }
                            if(lathinh1==11)
                            {
                                img=(ImageView) findViewById(R.id.a11);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a11_kich1lan = false;
                            }
                            if(lathinh1==12)
                            {
                                img=(ImageView) findViewById(R.id.a12);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a12_kich1lan = false;
                            }
                            if(lathinh1==13)
                            {
                                img=(ImageView) findViewById(R.id.a13);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a13_kich1lan = false;
                            }
                            if(lathinh1==14)
                            {
                                img=(ImageView) findViewById(R.id.a14);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a14_kich1lan = false;
                            }
                            if(lathinh1==15)
                            {
                                img=(ImageView) findViewById(R.id.a15);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a15_kich1lan = false;
                            }
                            if(lathinh1==16)
                            {
                                img=(ImageView) findViewById(R.id.a16);
                                img.setImageResource(thebai[0]);
                                chiclick2hinh=0;
                                lathinh1 =0;
                                kiemtratrung =0;
                                a16_kich1lan = false;
                            }
                        }
                    }

                });
            }

        }, 0, 1000);

    }

    int thebai[] = { R.drawable.a0, R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4,R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8};
    int chiclick2hinh = 0;
    int kiemtratrung = 0;
    ImageView img;

    public void btnClick(View v)
    {
        switch (v.getId()) {
            case R.id.a1:
                if(!a1_kich1lan&&!a1)
                {
                    a1_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a1);
                    img.setImageResource(thebai[1]);
                    if(kiemtratrung==1)
                    {
                        vt=1;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung =1;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =1;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2 = 1;
                            upbaikhongtrung();
                            a1_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a2:
                if(!a2_kich1lan&&!a2)
                {
                    a2_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a2);
                    img.setImageResource(thebai[1]);
                    if(kiemtratrung==1)
                    {
                        vt=1;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 1;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =2;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2 =2;
                            upbaikhongtrung();
                            a2_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a3:
                if(!a3_kich1lan&&!a3)
                {
                    a3_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a3);
                    img.setImageResource(thebai[2]);
                    if(kiemtratrung==2)
                    {
                        vt=2;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 2;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =3;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2 =3;
                            upbaikhongtrung();
                            a3_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a4:
                if(!a4_kich1lan&&!a4)
                {
                    a4_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a4);
                    img.setImageResource(thebai[3]);
                    if(kiemtratrung==3)
                    {
                        vt=3;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 3;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =4;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=4;
                            upbaikhongtrung();
                            a4_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a5:
                if(!a5_kich1lan&&!a5)
                {
                    a5_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a5);
                    img.setImageResource(thebai[2]);
                    if(kiemtratrung==2)
                    {
                        vt=2;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 2;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =5;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=5;
                            upbaikhongtrung();
                            a5_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a6:
                if(!a6_kich1lan&&!a6)
                {
                    a6_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a6);
                    img.setImageResource(thebai[4]);
                    if(kiemtratrung==4)
                    {
                        vt=4;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 4;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =6;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=6;
                            upbaikhongtrung();
                            a6_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a7:
                if(!a7_kich1lan&&!a7)
                {
                    a7_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a7);
                    img.setImageResource(thebai[5]);
                    if(kiemtratrung==5)
                    {
                        vt=5;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 5;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =7;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=7;
                            upbaikhongtrung();
                            a7_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a8:
                if(!a8_kich1lan&&!a8)
                {
                    a8_kich1lan= true;
                    img=(ImageView) findViewById(R.id.a8);
                    img.setImageResource(thebai[3]);
                    if(kiemtratrung==3)
                    {
                        vt=3;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 3;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =8;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=8;
                            upbaikhongtrung();
                            a8_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a9:
                if(!a9_kich1lan&&!a9)
                {
                    a9_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a9);
                    img.setImageResource(thebai[6]);
                    if(kiemtratrung==6)
                    {
                        vt=6;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 6;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =9;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=9;
                            upbaikhongtrung();
                            a9_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a10:
                if(!a10_kich1lan&&!a10)
                {
                    a10_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a10);
                    img.setImageResource(thebai[7]);
                    if(kiemtratrung==7)
                    {
                        vt=7;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 7;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =10;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2 =10;
                            upbaikhongtrung();
                            a10_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a11:
                if(!a11_kich1lan&&!a11)
                {
                    a11_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a11);
                    img.setImageResource(thebai[8]);
                    if(kiemtratrung==8)
                    {
                        vt=8;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 8;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =11;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2 =11;
                            upbaikhongtrung();
                            a11_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a12:
                if(!a12_kich1lan&&!a12)
                {
                    a12_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a12);
                    img.setImageResource(thebai[6]);
                    if(kiemtratrung==6)
                    {
                        vt=6;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 6;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =12;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2 =12;
                            upbaikhongtrung();
                            a12_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a13:
                if(!a13_kich1lan&&!a13)
                {
                    a13_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a13);
                    img.setImageResource(thebai[5]);
                    if(kiemtratrung==5)
                    {
                        vt=5;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 5;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =13;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=13;
                            upbaikhongtrung();
                            a13_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a14:
                if(!a14_kich1lan&&!a14)
                {
                    a14_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a14);
                    img.setImageResource(thebai[8]);
                    if(kiemtratrung==8)
                    {
                        vt=8;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 8;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =14;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=14;
                            upbaikhongtrung();
                            a14_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a15:
                if(!a15_kich1lan&&!a15)
                {
                    a15_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a15);
                    img.setImageResource(thebai[4]);
                    if(kiemtratrung==4)
                    {
                        vt=4;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 4;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =15;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=15;
                            upbaikhongtrung();
                            a15_kich1lan = false;
                        }
                    }
                }
                break;
            case R.id.a16:
                if(!a16_kich1lan&&!a16)
                {
                    a16_kich1lan = true;
                    img=(ImageView) findViewById(R.id.a16);
                    img.setImageResource(thebai[7]);
                    if(kiemtratrung==7)
                    {

                        vt=7;
                        xoahinhtrungnhau();
                        break;
                    }
                    else
                    {
                        kiemtratrung = 7;
                        chiclick2hinh++;
                        if(chiclick2hinh==1)
                        {
                            lathinh1 =16;
                        }
                        if(chiclick2hinh==2)
                        {
                            lathinh2=16;
                            upbaikhongtrung();
                            a16_kich1lan = false;
                        }
                    }
                }
                break;
            default:
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}

