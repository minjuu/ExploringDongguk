package com.example.android.tflitecamerademo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import net.daum.mf.map.api.MapView;

/** Main {@code Activity} class for the Camera app. */
public class CameraActivity extends Activity {
  Dialog dilaog01; // 커스텀 다이얼로그
  ImageView test1; // 선언
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_camera);

    Button mapButton = (Button) findViewById(R.id.mapbtn);
    mapButton.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
      }
    });

    Button showBtn = (Button) findViewById(R.id.showBtn);
    showBtn.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), InfoActivity.class);
        startActivity(intent);
      }
    });
//    dilaog01 = new Dialog(CameraActivity.this);       // Dialog 초기화
//    dilaog01.requestWindowFeature(Window.FEATURE_NO_TITLE); // 타이틀 제거
//    dilaog01.setContentView(R.layout.dialog01);             // xml 레이아웃 파일과 연결



    if (null == savedInstanceState) {
      getFragmentManager()
              .beginTransaction()
              .replace(R.id.container, Camera2BasicFragment.newInstance())
              .commit();
    }

//    View.OnClickListener listener = new View.OnClickListener()
//    {
//      @Override
//      public void onClick(View v) {
////        showDialog01(); // 아래 showDialog01() 함수 호출
//
//      }
//    };
//    Button show_Btn = (Button) findViewById(R.id.showBtn);
//    show_Btn.setOnClickListener(listener);
//  }
//
//  public void showDialog01(){
//    test1= (ImageView)findViewById(R.id.explain);
//    test1.setImageResource(R.drawable.background);
//    Log.d("test","ddddddd22");
//    dilaog01.show(); // 다이얼로그 띄우기
//    /* 이 함수 안에 원하는 디자인과 기능을 구현하면 된다. */
//
//    // 위젯 연결 방식은 각자 취향대로~
//    // '아래 아니오 버튼'처럼 일반적인 방법대로 연결하면 재사용에 용이하고,
//    // '아래 네 버튼'처럼 바로 연결하면 일회성으로 사용하기 편함.
//    // *주의할 점: findViewById()를 쓸 때는 -> 앞에 반드시 다이얼로그 이름을 붙여야 한다.
//
//
//    // 아니오 버튼
//    Button noBtn = dilaog01.findViewById(R.id.noBtn);
//    noBtn.setOnClickListener(new View.OnClickListener() {
//      @Override
//      public void onClick(View view) {
//        // 원하는 기능 구현
//        test1= (ImageView)findViewById(R.id.explain);
//        dilaog01.dismiss(); // 다이얼로그 닫기
//      }
//    });
  }


}