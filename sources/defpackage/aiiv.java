package defpackage;

import android.location.LocationListener;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.location.fused.providers.GpsPulseProviderController$StatePulse$AlarmListener;

/* renamed from: aiiv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiiv extends aiis {
    public int c;
    public final /* synthetic */ aiix d;
    private final LocationListener e = new aiiu(this, "location", "GpsPulseProviderController");
    private final GpsPulseProviderController$StatePulse$AlarmListener f = new GpsPulseProviderController$StatePulse$AlarmListener(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiiv(aiix aiix) {
        super(aiix);
        this.d = aiix;
    }

    public final void a() {
        this.c = 0;
        aiix aiix = this.d;
        ajpz ajpz = aiix.a;
        LocationListener locationListener = this.e;
        Looper looper = aiix.d.getLooper();
        aiix aiix2 = this.d;
        ajpz.a("gps", 0, locationListener, looper, aiix2.w, aiix2.x);
        aiix aiix3 = this.d;
        jgy jgy = aiix3.j;
        jiq jiq = aiix3.k;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        aiix aiix4 = this.d;
        int i = aiix.q;
        jgy.a("com.google.android.location.GPS_PULSE_TIMEOUT_ALARM", 2, aiix4.n + elapsedRealtime, (jgw) this.f, aiix4.d, isb.a(aiix4.w));
    }

    public final void b() {
        this.d.j.a((jgw) this.f);
        this.d.a.a(this.e);
    }

    public final LocationListener e() {
        return this.e;
    }

    public final String toString() {
        return "pulsing";
    }
}
