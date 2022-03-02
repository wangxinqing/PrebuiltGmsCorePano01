package defpackage;

import android.os.SystemClock;
import com.google.android.location.fused.providers.GpsPulseProviderController$StatePulseWait$AlarmListener;

/* renamed from: aiiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiiw extends aiis {
    public final /* synthetic */ aiix c;
    private final GpsPulseProviderController$StatePulseWait$AlarmListener d = new GpsPulseProviderController$StatePulseWait$AlarmListener(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected aiiw(aiix aiix) {
        super(aiix);
        this.c = aiix;
    }

    public final void a() {
        long j;
        jiq jiq = this.c.k;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        aiix aiix = this.c;
        long j2 = elapsedRealtime + aiix.r;
        if (j2 < 0) {
            j = Long.MAX_VALUE;
        } else {
            j = j2;
        }
        aiix.j.a("com.google.android.location.GPS_PULSE_ALARM", 2, j, (jgw) this.d, aiix.d, isb.a(aiix.w));
    }

    public final void b() {
        this.c.j.a((jgw) this.d);
    }

    public final String toString() {
        return "waiting_to_pulse";
    }
}
