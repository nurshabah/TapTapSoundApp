package com.iak.app.taptapsound;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String isPlaying = "Media is Playing";
    private MediaPlayer player;
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button) this.findViewById(R.id.satu);
        button2=(Button) this.findViewById(R.id.dua);
        button3=(Button) this.findViewById(R.id.tiga);
        button4=(Button) this.findViewById(R.id.empat);
        button5=(Button) this.findViewById(R.id.lima);
        button6=(Button) this.findViewById(R.id.enam);
        button7=(Button) this.findViewById(R.id.tujuh);
        button8=(Button) this.findViewById(R.id.delapan);
        button9=(Button) this.findViewById(R.id.sembilan);
        button10=(Button) this.findViewById(R.id.sepuluh);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(1);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(2);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(3);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(4);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(5);

            }
        });
        /*button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(5);

            }
        });*/
        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(6);

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(7);

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(8);

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(9);

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(10);

            }
        });
    }


    private void playSound(int arg){
        try{
            if (player.isPlaying()) {
                player.stop();
                player.release();
            }
        }catch(Exception e){
            Toast.makeText(this, " Masuk Exception", Toast.LENGTH_SHORT).show();
        }
        if (arg == 1){

            Toast.makeText(this, isPlaying+" 1", Toast.LENGTH_SHORT).show();
            player = MediaPlayer.create(this, R.raw.lagu1);

        }else if (arg==2){
            Toast.makeText(this, isPlaying+" 2", Toast.LENGTH_SHORT).show();
            player = MediaPlayer.create(this, R.raw.lagu2);
        }else if (arg==3){
            Toast.makeText(this, isPlaying+" 3", Toast.LENGTH_SHORT).show();
            player = MediaPlayer.create(this, R.raw.lagu3);
        }
        else if (arg==4){
            Toast.makeText(this, isPlaying+" 4", Toast.LENGTH_SHORT).show();
            player = MediaPlayer.create(this, R.raw.lagu4);
        }
        else if (arg==5){
            Toast.makeText(this, isPlaying+" 5", Toast.LENGTH_SHORT).show();
            player = MediaPlayer.create(this, R.raw.lagu5);
        }
        else if (arg==6){
            Toast.makeText(this, isPlaying+" 6", Toast.LENGTH_SHORT).show();
            player = MediaPlayer.create(this, R.raw.lagu6);
        }
        else if (arg==7){
            Toast.makeText(this, isPlaying+" 7", Toast.LENGTH_SHORT).show();
            player = MediaPlayer.create(this, R.raw.lagu7);
        }
        else if (arg==8){
            Toast.makeText(this, isPlaying+" 8", Toast.LENGTH_SHORT).show();
            player = MediaPlayer.create(this, R.raw.lagu8);
        }
        else if (arg==9){
            Toast.makeText(this, isPlaying+" 9", Toast.LENGTH_SHORT).show();
            player = MediaPlayer.create(this, R.raw.lagu9);
        }
        else if (arg==10){
            Toast.makeText(this, isPlaying+" 10", Toast.LENGTH_SHORT).show();
            player = MediaPlayer.create(this, R.raw.lagu10);
        }
        player.setLooping(false); // Set looping
        player.start();
    }
}
