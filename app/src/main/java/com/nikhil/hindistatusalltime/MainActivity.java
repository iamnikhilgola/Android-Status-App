package com.nikhil.hindistatusalltime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.emoji.bundled.BundledEmojiCompatConfig;
import androidx.emoji.text.EmojiCompat;
import androidx.emoji.text.FontRequestEmojiCompatConfig;
import androidx.emoji.widget.EmojiEditText;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    DatabaseReference databaseReference;
    HindiEditText hin,eng,tags;
    EditText down,share;
    Button store;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EmojiCompat.Config config = new BundledEmojiCompatConfig(this);
        EmojiCompat.init(config);
        setContentView(R.layout.activity_main);
        hin = findViewById(R.id.et_hindistatus);
        eng = findViewById(R.id.et_engstatus);
        tags = findViewById(R.id.et_tags);
        down = findViewById(R.id.et_download);
        share = findViewById(R.id.et_share);
        store = findViewById(R.id.store);
        databaseReference = FirebaseDatabase.getInstance().getReference("Statuses");
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storeInfo();
            }
        });

    }
    private void storeInfo(){
            String hinstatus = hin.getText().toString();
            String engstatus = eng.getText().toString();
            String tag = tags.getText().toString();
            int shareCount = Integer.parseInt(share.getText().toString());
            int downloadCount = Integer.parseInt(share.getText().toString());
            if(!TextUtils.isEmpty(hinstatus)){
                String id = databaseReference.push().getKey();
                Status status = new Status(id,hinstatus,engstatus,tag,shareCount,downloadCount);
                databaseReference.child(id).setValue(status);
                Toast.makeText(this,"Added Success",Toast.LENGTH_LONG).show();
            }
    }

}
