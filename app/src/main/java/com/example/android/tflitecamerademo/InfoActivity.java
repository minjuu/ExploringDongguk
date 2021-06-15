package com.example.android.tflitecamerademo;

import android.app.Application;
import android.os.Bundle;
import android.os.Debug;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.WindowManager;
import android.widget.ImageView;



public class InfoActivity extends AppCompatActivity {

    String id ="";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

//        ImageView img = (ImageView) findViewById(R.id.explain1);
//        img.setImageDrawable(getResources().getDrawable(R.drawable.bongwan));
//
//        img.setImageResource(R.drawable.bongwan);

        id = MyGlobals.getInstance().getId();
        Log.d("test","id제발:"+id);
        if(id.equals("법학관(beophakgwan)"))
            setContentView(R.layout.dialog01);
        else if(id.equals("본관(bongwan)")) {
            setContentView((R.layout.dialog02));
            Log.d("test","같아"+id);
        }
        else if(id.equals("명진관(myeongjingwan)"))
            setContentView((R.layout.dialog03));
        else if(id.equals("과학관(gwahakgwan)"))
            setContentView((R.layout.dialog04));
        else if(id.equals("다향관(dahyanggwan)"))
            setContentView((R.layout.dialog05));
        else if(id.equals("상록원(sangrogwon)"))
            setContentView((R.layout.dialog06));
        else if(id.equals("중앙도서관(library)"))
            setContentView((R.layout.dialog07));
        else if(id.equals("사회과학관(sahoegwahak)"))
            setContentView((R.layout.dialog08));
        else if(id.equals("학술문화관(haksulmunhwa)"))
            setContentView((R.layout.dialog09));
        else if(id.equals("혜화관(hyehwagwan)"))
            setContentView((R.layout.dialog10));
        else if(id.equals("학림관(hakrimgwan)"))
            setContentView((R.layout.dialog11));
        else if(id.equals("계산관(gyesangwan)"))
            setContentView((R.layout.dialog12));
        else if(id.equals("원흥관(wonheunggwan)"))
            setContentView((R.layout.dialog13));
        else if(id.equals("신공학관(singonghakgwan)"))
            setContentView((R.layout.dialog14));
        else if(id.equals("정보문화관(jeongbomunhwa)"))
            setContentView((R.layout.dialog15));
        else if(id.equals("학생회관(studentcouncil)"))
            setContentView((R.layout.dialog16));
        else if(id.equals("정각원(jeonggagwon)"))
            setContentView((R.layout.dialog17));
        else if(id.equals("체육관(cheyukgwan)"))
            setContentView((R.layout.dialog18));




    }
}