package defpackage;

import android.content.Context;
import android.location.GpsStatus;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* renamed from: cgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cgj implements GpsStatus.Listener {
    public final LocationManager a;
    public volatile boolean b;
    public volatile cgt c;
    public int d;
    public final Handler e = new qvr(Looper.getMainLooper());
    public final cgm f;
    private final Handler g;

    public cgj(Context context, cgm cgm, Looper looper) {
        this.a = (LocationManager) context.getSystemService("location");
        this.f = cgm;
        this.g = new qvr(looper);
    }

    public final void onGpsStatusChanged(int i) {
        if (this.b && i == 4) {
            try {
                this.g.post(new cgg(this, this.a.getGpsStatus((GpsStatus) null)));
            } catch (NullPointerException e2) {
                Log.e("IndoorOutdoorPredictor", "Null Pointer in getGpsStatus");
            }
        }
    }
}
