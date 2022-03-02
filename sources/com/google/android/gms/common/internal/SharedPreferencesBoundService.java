package com.google.android.gms.common.internal;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SharedPreferencesBoundService extends BoundService {
    private iug a;

    public final IBinder onBind(Intent intent) {
        iug iug = this.a;
        iug.asBinder();
        return iug;
    }

    public final void onCreate() {
        this.a = new iug(getApplicationContext());
    }
}
