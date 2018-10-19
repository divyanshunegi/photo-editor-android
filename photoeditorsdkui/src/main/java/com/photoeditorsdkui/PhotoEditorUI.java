package com.photoeditorsdkui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by divyanshunegi on 19/10/18.
 * Project : photo-editor-android
 */
public class PhotoEditorUI extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_editor_ui);
        Toast.makeText(this, "UI activity", Toast.LENGTH_SHORT).show();
    }
}
