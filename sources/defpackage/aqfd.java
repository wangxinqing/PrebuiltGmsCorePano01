package defpackage;

import java.io.PrintWriter;

/* renamed from: aqfd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aqfd implements aqgg {
    private static final aqgg[] b = new aqgg[0];
    public aqgg[] a = b;

    public int a(long j, int i) {
        int i2 = 0;
        for (aqgg a2 : this.a) {
            i2 |= a2.a(j, i);
        }
        return i2;
    }

    public long b() {
        throw new IllegalStateException("getTimeNs not implemented");
    }

    public void c() {
        for (aqgg c : this.a) {
            c.c();
        }
    }

    public void d() {
        for (aqgg d : this.a) {
            d.d();
        }
    }

    public aqey a() {
        throw new IllegalStateException("getPosition not implemented");
    }

    public void a(long j, float f, float f2) {
        for (aqgg a2 : this.a) {
            a2.a(j, f, f2);
        }
    }

    public void a(long j, aqey aqey) {
        for (aqgg a2 : this.a) {
            a2.a(j, aqey);
        }
    }

    public void a(long j, aqfq aqfq) {
        for (aqgg a2 : this.a) {
            a2.a(j, aqfq);
        }
    }

    public void a(long j, aqgf aqgf) {
        for (aqgg a2 : this.a) {
            a2.a(j, aqgf);
        }
    }

    public void a(long j, PrintWriter printWriter) {
        for (aqgg a2 : this.a) {
            a2.a(j, printWriter);
        }
    }
}
