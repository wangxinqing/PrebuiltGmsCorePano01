package defpackage;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* renamed from: ekg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ekg extends Service {
    private ekf a;

    public final IBinder onBind(Intent intent) {
        return this.a.getIBinder();
    }

    public final void onCreate() {
        super.onCreate();
        this.a = new ekf(this);
    }
}
