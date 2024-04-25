package com.example.simple_toast;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    private final Context context;
    public Toaster(Context context){
        this.context = context;
    }

    public void showToast(){
        Toast.makeText(context, "hello how are you" , Toast.LENGTH_SHORT).show();
    }


}
