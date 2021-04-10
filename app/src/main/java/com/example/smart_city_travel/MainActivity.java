package com.example.smart_city_travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn_enter;
    Button btn_route;
    Button btn_hotel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        btn_enter=findViewById( R.id.btn_enter );
        btn_route=findViewById( R.id.btn_route );
        btn_hotel=findViewById( R.id.btn_hotel );
        btn_enter.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( getApplicationContext(),maps_activity.class ) );

            }
        } );
        btn_route.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent i=new Intent( Intent.ACTION_VIEW );
i.setData( Uri.parse( "https://www.yatra.com/hotels" ) );
startActivity( i );
            }
        } );
        btn_hotel.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( Intent.ACTION_VIEW );
                intent.setData( Uri.parse("geo:21.249952,81.605018") );
                Intent chooser=Intent.createChooser( intent,"Launch Maps" );
                startActivity( chooser );
            }
        } );
    }
}
