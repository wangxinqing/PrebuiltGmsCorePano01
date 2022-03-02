package defpackage;

import android.util.Log;

/* renamed from: nvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nvk {
    public final int a = ((int) axkz.a.a().f());
    public final int b = ((int) axkz.c());
    public final int c = ((int) axkz.d());
    public final int d = ((int) axkz.b());
    public final double e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public nvk() {
        if (axkz.c() > axkz.b() || axkz.b() > axkz.d()) {
            long c2 = axkz.c();
            long d2 = axkz.d();
            long b2 = axkz.b();
            StringBuilder sb = new StringBuilder(160);
            sb.append("Invalid upward triggers: fast_upward_trigger: ");
            sb.append(c2);
            sb.append(", slow_upward_trigger: ");
            sb.append(d2);
            sb.append(", after_ratio_upward_trigger: ");
            sb.append(b2);
            sb.append(".");
            Log.w("GCM", sb.toString());
        }
        this.i = (int) axkz.a.a().g();
        this.f = (int) axkz.a.a().c();
        this.g = (int) axkz.a.a().i();
        int h2 = (int) axkz.a.a().h();
        int i2 = this.g;
        int i3 = this.i;
        if (h2 >= i2) {
            int i4 = (h2 - i2) % i3;
            if (i4 != 0) {
                Log.w("GCM", "Longest interval is not at step boundary. Rounding it down to step boundary.");
                h2 -= i4;
            }
        } else {
            Log.w("GCM", "Longest interval is shorter than shortest interval. Replacing longest with shortest.");
            h2 = i2;
        }
        this.h = h2;
        int e2 = (int) axkz.a.a().e();
        int i5 = this.g;
        int i6 = this.h;
        if (e2 < i5 || e2 > i6) {
            Log.w("GCM", "Initial interval is not between the shortest and longest interval. Using the average of shortest and longest interval as the initial interval.");
            e2 = (i5 + i6) / 2;
        }
        this.j = e2;
        this.e = axkz.a.a().b();
    }
}
