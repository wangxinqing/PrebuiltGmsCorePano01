package com.google.android.gms.icing.appindexing.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppIndexingChimeraService extends Service {
    private prm a;

    public final IBinder onBind(Intent intent) {
        return new owp(this, this.a);
    }

    public final void onCreate() {
        if (axsd.f()) {
            this.a = prm.a("main", getApplicationContext());
        }
        super.onCreate();
    }

    public final void onDestroy() {
        prm prm = this.a;
        if (prm != null) {
            prm.a();
        }
        super.onDestroy();
    }
}
