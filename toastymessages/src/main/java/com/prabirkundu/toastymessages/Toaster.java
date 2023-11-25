package com.prabirkundu.toastymessages;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void simpleMassages(Context context, String massage){
        Toast.makeText(context, massage, Toast.LENGTH_SHORT).show();
    }
}
