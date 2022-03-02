package defpackage;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: aqfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqfs extends aqfd {
    private static final long b = TimeUnit.SECONDS.toNanos(12);
    private static final long c = TimeUnit.SECONDS.toNanos(5);
    private final aqgg d;
    private aqey e;
    private long f;
    private long g;

    public aqfs(aqgg aqgg) {
        this.d = aqgg;
        this.a = new aqgg[]{aqgg};
    }

    private final boolean a(long j) {
        return this.e != null && j < this.f + c;
    }

    private final boolean e() {
        return this.e != null && this.g < this.f + b;
    }

    public final long b() {
        return !e() ? this.d.b() : this.f;
    }

    public final void c() {
        this.e = null;
        this.f = 0;
        this.d.c();
    }

    public final int a(long j, int i) {
        int a = super.a(j, i);
        return a(j) ? a & -5 : a;
    }

    public final aqey a() {
        return !e() ? this.d.a() : this.e;
    }

    public final void a(long j, aqey aqey) {
        aqex aqex = aqex.GPS;
        int ordinal = aqey.a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                this.e = aqey;
                this.f = j;
            }
        } else if (a(j)) {
            aqey = null;
        }
        this.g = j;
        if (aqey != null) {
            this.d.a(j, aqey);
        }
    }

    public final void a(long j, PrintWriter printWriter) {
        StringBuilder sb = new StringBuilder();
        sb.append("InjectionSensorFusion:");
        long j2 = this.g;
        long j3 = this.f;
        StringBuilder sb2 = new StringBuilder(92);
        sb2.append(" time(ns): {lastAbsoluteTimeNs=");
        sb2.append(j2);
        sb2.append(",lastInjectedTimeNs=");
        sb2.append(j3);
        sb2.append("}");
        sb.append(sb2.toString());
        printWriter.println(sb);
        this.d.a(j, printWriter);
    }
}
