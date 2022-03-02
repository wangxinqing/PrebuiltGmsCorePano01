package defpackage;

import android.location.LocationListener;
import android.os.Looper;

/* renamed from: aijb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aijb extends aijc {
    private final LocationListener a;
    private final ajpz b;
    private final Looper c;

    public aijb(ajpz ajpz, LocationListener locationListener, Looper looper) {
        this.a = locationListener;
        this.b = ajpz;
        this.c = looper;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (!this.u || !this.v) {
            this.b.a(this.a);
        } else if (this.b.a.isProviderEnabled("passive")) {
            this.b.a("passive", 0, this.a, this.c, this.w, false);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Passive[");
        a(sb);
        sb.append(']');
        return sb.toString();
    }
}
