package com.google.android.gms.gass;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GassChimeraService extends Service {
    private noj a;
    private noa b;

    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("com.google.android.gms.gass.START")) {
            return new nob(this, this.a, this.b);
        }
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        if (axjg.c()) {
            Context applicationContext = getApplicationContext();
            if (axjg.a.a().b()) {
                noi.a();
            }
            this.a = new noj(hol.a(applicationContext, "GLINE"));
        }
        if (axjj.b()) {
            this.b = noa.a(getApplicationContext());
        }
    }
}
