package com.example.samsung.protocolsmakerfree.presentation;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by samsung on 23.05.2017.
 */

public class Messager {

    private static final String LOG_TAG = "prtclMkr";

    public static void sendToAllRecipients(final Context context, final String msg) {
        Log.d(LOG_TAG, msg);
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public static void sendToOnlyToast(final Context context, final String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public static void sendToOnlyLog(final String msg) {
        Log.d(LOG_TAG, msg);
    }

}
