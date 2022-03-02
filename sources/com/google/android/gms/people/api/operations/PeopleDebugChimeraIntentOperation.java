package com.google.android.gms.people.api.operations;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PeopleDebugChimeraIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (!Build.TYPE.equals("user") && "com.google.android.gms.people.api.operations.DATA_CHANGED".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("a");
            String stringExtra2 = intent.getStringExtra("p");
            int parseInt = Integer.parseInt(intent.getStringExtra("s"));
            Log.i("PeopleDebugChimeraIntentOperation", xdt.a("DataChanged! %s/%s scopes=%d", stringExtra, stringExtra2, Integer.valueOf(parseInt)));
            wmy a = wmy.a((Context) this);
            a.a(stringExtra, stringExtra2, parseInt);
            a.b();
        }
    }
}
