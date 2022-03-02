package defpackage;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: cgl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cgl {
    private static final long d = TimeUnit.MINUTES.toMillis(1);
    public boolean a = false;
    public volatile boolean b;
    private final LocationListener c = new cgk("contextmanager", "GpsManager");
    private final LocationManager e;

    public cgl(Context context) {
        this.e = (LocationManager) context.getSystemService("location");
    }

    public final void a() {
        this.e.requestLocationUpdates("gps", d, 1.0E30f, this.c, Looper.getMainLooper());
    }

    public final void b() {
        this.e.removeUpdates(this.c);
    }
}
