package defpackage;

import android.content.Context;
import android.hardware.SensorEvent;
import android.location.GnssMeasurementsEvent;
import android.location.GnssNavigationMessage;
import android.location.GpsStatus;
import android.location.LocationListener;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: ahtl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahtl extends ahuo implements GpsStatus.Listener {
    public static final /* synthetic */ int f = 0;
    public boolean a = false;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    final long e;
    private final ahyk l;
    private final String m;
    private final GnssMeasurementsEvent.Callback n;
    private final GnssNavigationMessage.Callback o;
    private final boolean p;
    private GpsStatus q;
    private final LocationListener r;

    public ahtl(Context context, boolean z, boolean z2, boolean z3, boolean z4, ahyk ahyk, ahsr ahsr, ahss ahss, ajrh ajrh, long j) {
        super(ahsr, ahss, ajrh);
        ahtj ahtj;
        ahtk ahtk = null;
        this.q = null;
        this.b = z;
        this.p = z2;
        this.c = z3;
        this.d = z4;
        this.r = new ahti(this, "location", "GpsScanner");
        if (ahyk == null) {
            this.l = new ahyk(context, false);
        } else {
            this.l = ahyk;
        }
        this.m = this.g.a;
        this.e = j;
        if (!this.c || Build.VERSION.SDK_INT < 24) {
            ahtj = null;
        } else {
            ahtj = new ahtj(this);
        }
        this.n = ahtj;
        if (this.d && Build.VERSION.SDK_INT >= 24) {
            ahtk = new ahtk(this);
        }
        this.o = ahtk;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        GnssNavigationMessage.Callback callback;
        GnssMeasurementsEvent.Callback callback2;
        if (this.p) {
            ahyk ahyk = this.l;
            ahyk.a(this.m, 3);
            ahyk.b.addGpsStatusListener(this);
        }
        ahyk ahyk2 = this.l;
        if (ahyk2 != null) {
            ahyk2.a(this.m, "gps", this.e, this.r, this.h.getLooper());
        }
        ahss ahss = this.i;
        if (ahss != null) {
            ahss.h();
        }
        if (this.c && (callback2 = this.n) != null) {
            ahyk ahyk3 = this.l;
            ahyk3.a(this.m, 5);
            if (Build.VERSION.SDK_INT >= 24) {
                ahyk3.b.registerGnssMeasurementsCallback(callback2);
            }
        }
        if (this.d && (callback = this.o) != null) {
            ahyk ahyk4 = this.l;
            ahyk4.a(this.m, 7);
            if (Build.VERSION.SDK_INT >= 24) {
                ahyk4.b.registerGnssNavigationMessageCallback(callback);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        GnssNavigationMessage.Callback callback;
        GnssMeasurementsEvent.Callback callback2;
        if (this.p) {
            ahyk ahyk = this.l;
            ahyk.a(this.m, 4);
            ahyk.b.removeGpsStatusListener(this);
        }
        ahyk ahyk2 = this.l;
        if (ahyk2 != null) {
            ahyk2.a(this.m, true, this.r);
        }
        ahss ahss = this.i;
        if (ahss != null) {
            ahss.i();
        }
        if (this.c && (callback2 = this.n) != null) {
            ahyk ahyk3 = this.l;
            ahyk3.a(this.m, 6);
            if (Build.VERSION.SDK_INT >= 24) {
                ahyk3.b.unregisterGnssMeasurementsCallback(callback2);
            }
        }
        if (this.d && (callback = this.o) != null) {
            ahyk ahyk4 = this.l;
            ahyk4.a(this.m, 8);
            if (Build.VERSION.SDK_INT >= 24) {
                ahyk4.b.unregisterGnssNavigationMessageCallback(callback);
            }
        }
    }

    public final void onGpsStatusChanged(int i) {
        GpsStatus gpsStatus;
        this.j.a();
        if (this.p && !i() && i == 4) {
            try {
                gpsStatus = this.l.b.getGpsStatus(this.q);
            } catch (NullPointerException e2) {
                gpsStatus = null;
            }
            this.q = gpsStatus;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ahsr ahsr = this.h;
            GpsStatus gpsStatus2 = this.q;
            if (gpsStatus2 != null) {
                ahsr.a.a(gpsStatus2, elapsedRealtime);
            }
            a(ahup.GPS_SATELLITE, elapsedRealtime, (SensorEvent) null);
        }
    }
}
