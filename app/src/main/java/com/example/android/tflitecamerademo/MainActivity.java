package com.example.android.tflitecamerademo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import net.daum.mf.map.api.CalloutBalloonAdapter;
import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.dgumap);

        MapView mapView = new MapView(this);
        // 중심점 변경
        mapView.setMapCenterPoint(MapPoint.mapPointWithGeoCoord(37.558436292058964, 127.00016774048937), true);

        MapPoint MARKER_POINT1 = MapPoint.mapPointWithGeoCoord(37.55860868045855, 126.99946223916655);//본관
        MapPoint MARKER_POINT2 = MapPoint.mapPointWithGeoCoord(37.560109241180115, 126.99896634407318);//계산관
        MapPoint MARKER_POINT3 = MapPoint.mapPointWithGeoCoord(37.55729467565779, 126.99986713676321);//과학관
        MapPoint MARKER_POINT4 = MapPoint.mapPointWithGeoCoord(37.560248818722144, 126.99977593628465);//학림관
        MapPoint MARKER_POINT5 = MapPoint.mapPointWithGeoCoord(37.55872343016335, 127.00021297203676);//다향관
        MapPoint MARKER_POINT6 = MapPoint.mapPointWithGeoCoord(37.55983728406388, 127.00026848129795);//체육관

        MapPoint MARKER_POINT7 = MapPoint.mapPointWithGeoCoord(37.557770725591254, 127.00187371702079);//혜화관
        MapPoint MARKER_POINT8 = MapPoint.mapPointWithGeoCoord(37.559606992159885, 126.998541736317);//정보문화관
        MapPoint MARKER_POINT9 = MapPoint.mapPointWithGeoCoord(37.55781549836627, 127.00307776986223);//학술문화관
        MapPoint MARKER_POINT10 = MapPoint.mapPointWithGeoCoord(37.55808162930053, 127.00096012345035);//법학관
        MapPoint MARKER_POINT11 = MapPoint.mapPointWithGeoCoord(37.55774485414227, 126.9999608652691);//명진관
        MapPoint MARKER_POINT12 = MapPoint.mapPointWithGeoCoord(37.55797059728521, 126.99910809811023);//중앙도서관

        MapPOIItem customMarker1 = new MapPOIItem();
        MapPOIItem customMarker2 = new MapPOIItem();
        MapPOIItem customMarker3 = new MapPOIItem();
        MapPOIItem customMarker4 = new MapPOIItem();
        MapPOIItem customMarker5 = new MapPOIItem();
        MapPOIItem customMarker6 = new MapPOIItem();

        MapPOIItem customMarker7 = new MapPOIItem();
        MapPOIItem customMarker8 = new MapPOIItem();
        MapPOIItem customMarker9 = new MapPOIItem();
        MapPOIItem customMarker10 = new MapPOIItem();
        MapPOIItem customMarker11 = new MapPOIItem();
        MapPOIItem customMarker12 = new MapPOIItem();

        customMarker1.setItemName("동국대학교 본관");
        customMarker1.setTag(1);
        customMarker1.setMapPoint(MARKER_POINT1);
        customMarker1.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker1.setCustomImageResourceId(R.drawable.marker); // 마커 이미지.
        customMarker1.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker1.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        customMarker2.setItemName("동국대학교 계산관");
        customMarker2.setTag(2);
        customMarker2.setMapPoint(MARKER_POINT2);
        customMarker2.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker2.setCustomImageResourceId(R.drawable.marker); // 마커 이미지.
        customMarker2.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker2.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        customMarker3.setItemName("동국대학교 과학관");
        customMarker3.setTag(3);
        customMarker3.setMapPoint(MARKER_POINT3);
        customMarker3.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker3.setCustomImageResourceId(R.drawable.marker); // 마커 이미지.
        customMarker3.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker3.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        customMarker4.setItemName("동국대학교 학림관");
        customMarker4.setTag(4);
        customMarker4.setMapPoint(MARKER_POINT4);
        customMarker4.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker4.setCustomImageResourceId(R.drawable.marker); // 마커 이미지.
        customMarker4.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker4.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        customMarker5.setItemName("동국대학교 다향관");
        customMarker5.setTag(5);
        customMarker5.setMapPoint(MARKER_POINT5);
        customMarker5.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker5.setCustomImageResourceId(R.drawable.marker); // 마커 이미지.
        customMarker5.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker5.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        customMarker6.setItemName("동국대학교 체육관");
        customMarker6.setTag(6);
        customMarker6.setMapPoint(MARKER_POINT6);
        customMarker6.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker6.setCustomImageResourceId(R.drawable.marker); // 마커 이미지.
        customMarker6.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker6.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        customMarker7.setItemName("동국대학교 혜화관");
        customMarker7.setTag(7);
        customMarker7.setMapPoint(MARKER_POINT7);
        customMarker7.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker7.setCustomImageResourceId(R.drawable.marker); // 마커 이미지.
        customMarker7.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker7.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        customMarker8.setItemName("동국대학교 정보문화관");
        customMarker8.setTag(8);
        customMarker8.setMapPoint(MARKER_POINT8);
        customMarker8.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker8.setCustomImageResourceId(R.drawable.marker); // 마커 이미지.
        customMarker8.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker8.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        customMarker9.setItemName("동국대학교 학술문화관");
        customMarker9.setTag(9);
        customMarker9.setMapPoint(MARKER_POINT9);
        customMarker9.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker9.setCustomImageResourceId(R.drawable.marker); // 마커 이미지.
        customMarker9.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker9.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        customMarker10.setItemName("동국대학교 법학관");
        customMarker10.setTag(10);
        customMarker10.setMapPoint(MARKER_POINT10);
        customMarker10.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker10.setCustomImageResourceId(R.drawable.marker); // 마커 이미지.
        customMarker10.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker10.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        customMarker11.setItemName("동국대학교 명진관");
        customMarker11.setTag(11);
        customMarker11.setMapPoint(MARKER_POINT11);
        customMarker11.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker11.setCustomImageResourceId(R.drawable.marker); // 마커 이미지.
        customMarker11.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker11.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        customMarker12.setItemName("동국대학교 중앙도서관");
        customMarker12.setTag(12);
        customMarker12.setMapPoint(MARKER_POINT12);
        customMarker12.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker12.setCustomImageResourceId(R.drawable.marker); // 마커 이미지.
        customMarker12.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker12.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        mapView.addPOIItem(customMarker1);
        mapView.addPOIItem(customMarker2);
        mapView.addPOIItem(customMarker3);
        mapView.addPOIItem(customMarker4);
        mapView.addPOIItem(customMarker5);
        mapView.addPOIItem(customMarker6);
        mapView.addPOIItem(customMarker7);
        mapView.addPOIItem(customMarker8);
        mapView.addPOIItem(customMarker9);
        mapView.addPOIItem(customMarker10);
        mapView.addPOIItem(customMarker11);
        mapView.addPOIItem(customMarker12);


        MapPoint MARKER_POINT13 = MapPoint.mapPointWithGeoCoord(37.55826188223574, 126.99823925577131);//신공학관
        MapPOIItem customMarker13 = new MapPOIItem();

        customMarker13.setItemName("동국대학교 신공학관");
        customMarker13.setTag(13);
        customMarker13.setMapPoint(MARKER_POINT13);
        customMarker13.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker13.setCustomImageResourceId(R.drawable.marker); // 마커 이미지.
        customMarker13.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker13.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        mapView.addPOIItem(customMarker13);

        MapPoint MARKER_POINT14 = MapPoint.mapPointWithGeoCoord(37.557031826482316, 126.9996781927309);//상록원
        MapPOIItem customMarker14 = new MapPOIItem();

        customMarker14.setItemName("동국대학교 상록원");
        customMarker14.setTag(14);
        customMarker14.setMapPoint(MARKER_POINT14);
        customMarker14.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker14.setCustomImageResourceId(R.drawable.marker); // 마커 이미지.
        customMarker14.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker14.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        mapView.addPOIItem(customMarker14);

        MapPoint MARKER_POINT15 = MapPoint.mapPointWithGeoCoord(37.55745998928984, 127.00252034227812);//사회과학관
        MapPOIItem customMarker15 = new MapPOIItem();

        customMarker15.setItemName("동국대학교 사회과학관");
        customMarker15.setTag(15);
        customMarker15.setMapPoint(MARKER_POINT15);
        customMarker15.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker15.setCustomImageResourceId(R.drawable.marker); // 마커 이미지.
        customMarker15.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker15.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        mapView.addPOIItem(customMarker15);

        MapPoint MARKER_POINT16 = MapPoint.mapPointWithGeoCoord(37.55751566141337, 127.00118341288515);//정각원
        MapPOIItem customMarker16 = new MapPOIItem();

        customMarker16.setItemName("동국대학교 정각원");
        customMarker16.setTag(16);
        customMarker16.setMapPoint(MARKER_POINT16);
        customMarker16.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker16.setCustomImageResourceId(R.drawable.marker); // 마커 이미지.
        customMarker16.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker16.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        mapView.addPOIItem(customMarker16);

        MapPoint MARKER_POINT17 = MapPoint.mapPointWithGeoCoord(37.558657450744, 126.9989443859783);//원흥관
        MapPOIItem customMarker17 = new MapPOIItem();

        customMarker17.setItemName("동국대학교 원흥관");
        customMarker17.setTag(17);
        customMarker17.setMapPoint(MARKER_POINT17);
        customMarker17.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker17.setCustomImageResourceId(R.drawable.marker); // 마커 이미지.
        customMarker17.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker17.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        mapView.addPOIItem(customMarker17);

        MapPoint MARKER_POINT18 = MapPoint.mapPointWithGeoCoord(37.5600960490981, 126.99835045895911);//학생회관
        MapPOIItem customMarker18 = new MapPOIItem();

        customMarker18.setItemName("동국대학교 학생회관");
        customMarker18.setTag(18);
        customMarker18.setMapPoint(MARKER_POINT18);
        customMarker18.setMarkerType(MapPOIItem.MarkerType.CustomImage); // 마커타입을 커스텀 마커로 지정.
        customMarker18.setCustomImageResourceId(R.drawable.marker); // 마커 이미지.
        customMarker18.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        customMarker18.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.

        mapView.addPOIItem(customMarker18);
        mapView.setCalloutBalloonAdapter(new CustomCalloutBalloonAdapter());

        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.map_view);
        mapViewContainer.addView(mapView);
    }
    class CustomCalloutBalloonAdapter implements CalloutBalloonAdapter {
        private final View mCalloutBalloon;

        public CustomCalloutBalloonAdapter() {
            mCalloutBalloon = getLayoutInflater().inflate(R.layout.custom_callout_balloon, null);
        }

        @Override
        public View getCalloutBalloon(MapPOIItem poiItem) {
            ((ImageView) mCalloutBalloon.findViewById(R.id.badge)).setImageResource(R.drawable.ic_launcher);
            ((TextView) mCalloutBalloon.findViewById(R.id.title)).setText(poiItem.getItemName());
            ((TextView) mCalloutBalloon.findViewById(R.id.desc)).setText("Custom CalloutBalloon");
            return mCalloutBalloon;
        }

        @Override
        public View getPressedCalloutBalloon(MapPOIItem poiItem) {
            return null;
        }
    }
}