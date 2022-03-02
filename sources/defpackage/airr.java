package defpackage;

import java.util.LinkedList;

/* renamed from: airr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class airr {
    public final LinkedList a = new LinkedList();
    public long b = 0;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public int g = -1;

    public final void a() {
        this.a.clear();
        this.c = false;
    }

    public final boolean b() {
        return this.e || this.d;
    }

    public final String toString() {
        boolean z = this.d;
        boolean z2 = this.e;
        int i = this.g;
        boolean z3 = this.c;
        long j = this.b;
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 204);
        sb.append("GlsFailureTracker [currentOnCellNetwork=");
        sb.append(z);
        sb.append(", currentOnWifiNetwork=");
        sb.append(z2);
        sb.append(", currentWifiNetworkId=");
        sb.append(i);
        sb.append(", inBackOffMode=");
        sb.append(z3);
        sb.append(", lastGlsFailureMillisSinceBoot=");
        sb.append(j);
        sb.append(", glsFailureTimestamps=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
