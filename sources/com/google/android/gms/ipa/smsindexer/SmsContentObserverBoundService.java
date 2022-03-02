package com.google.android.gms.ipa.smsindexer;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SmsContentObserverBoundService extends BoundService {
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        qtj.a(getApplicationContext());
    }

    public final void onDestroy() {
        qtj.a();
    }
}
