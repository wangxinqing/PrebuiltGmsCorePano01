package com.google.android.location.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PendingIntentCallbackChimeraService extends Service {
    alv a;

    public static Intent a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.android.location.internal.PendingIntentCallbackService"));
        return intent;
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.a = alv.a((Context) this);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        String action = intent.getAction();
        String a2 = asvl.a(action);
        if (a2 != null) {
            Intent intent2 = new Intent(intent);
            intent2.setAction(a2);
            intent2.setComponent((ComponentName) null);
            alv alv = this.a;
            if (!alv.a(intent2)) {
                return 2;
            }
            alv.a();
            return 2;
        }
        String valueOf = String.valueOf(action);
        Log.w("PICallbackService", valueOf.length() == 0 ? new String("Unknown action: ") : "Unknown action: ".concat(valueOf));
        return 2;
    }
}
