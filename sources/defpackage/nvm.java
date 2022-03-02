package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;

/* renamed from: nvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nvm implements nvl {
    static final int[] a = {110000, 230000, 550000, 720000, 840000, 1140000, 1440000, 1740000};
    private final int b;
    private final aucd c;

    public nvm(nqj nqj) {
        int i;
        this.b = nqj.h;
        aucd o = nqj.k.o();
        if ((nqj.a & 4) != 0) {
            i = nqj.d;
        } else {
            i = c(c().length);
        }
        boolean z = false;
        if (o.c) {
            o.c();
            o.c = false;
        }
        nqj nqj2 = (nqj) o.b;
        int i2 = nqj2.a | 4;
        nqj2.a = i2;
        nqj2.d = i;
        if ((nqj.a & 8) != 0 && nqj.e) {
            z = true;
        }
        int i3 = i2 | 8;
        nqj2.a = i3;
        nqj2.e = z;
        int i4 = nqj.f;
        int i5 = i3 | 16;
        nqj2.a = i5;
        nqj2.f = i4;
        int i6 = nqj.g;
        nqj2.a = i5 | 32;
        nqj2.g = i6;
        this.c = o;
    }

    private final void a(String str) {
        nqj nqj = (nqj) this.c.b;
        int i = nqj.f;
        int i2 = nqj.g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
        sb.append(str);
        sb.append(", good=");
        sb.append(i);
        sb.append(" bad=");
        sb.append(i2);
        Log.w("GCM", sb.toString());
    }

    private final int b(int i) {
        aucd aucd = this.c;
        int i2 = ((nqj) aucd.b).d;
        if (i2 < 0 || i2 > i - 1) {
            int c2 = c(i);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            nqj nqj = (nqj) aucd.b;
            nqj nqj2 = nqj.k;
            nqj.a |= 4;
            nqj.d = c2;
            g();
            aucd aucd2 = this.c;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            nqj nqj3 = (nqj) aucd2.b;
            nqj3.a |= 8;
            nqj3.e = false;
            Log.i("GCM", "Reset heartbeat interval");
        }
        return ((nqj) this.c.b).d;
    }

    private static final int c(int i) {
        int c2 = (int) axlf.a.a().c();
        return (c2 < 0 || c2 > i + -1) ? i >> 1 : c2;
    }

    private final synchronized void e() {
        aucd aucd = this.c;
        int i = ((nqj) aucd.b).f + 1;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        nqj nqj = (nqj) aucd.b;
        nqj nqj2 = nqj.k;
        nqj.a |= 16;
        nqj.f = i;
        aucd aucd2 = this.c;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        nqj nqj3 = (nqj) aucd2.b;
        nqj3.a |= 8;
        nqj3.e = false;
        if (((long) ((nqj) this.c.b).f) >= axlf.c()) {
            int i2 = ((nqj) this.c.b).d;
            if (i2 < c().length - 1) {
                aucd aucd3 = this.c;
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                nqj nqj4 = (nqj) aucd3.b;
                nqj4.a |= 8;
                nqj4.e = true;
                aucd aucd4 = this.c;
                int i3 = i2 + 1;
                if (aucd4.c) {
                    aucd4.c();
                    aucd4.c = false;
                }
                nqj nqj5 = (nqj) aucd4.b;
                nqj5.a |= 4;
                nqj5.d = i3;
                int a2 = a();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Raising heartbeat interval to ");
                sb.append(a2);
                a(sb.toString());
            } else {
                a("Resetting heartbeat counters (at max)");
            }
            g();
        }
    }

    private final synchronized void f() {
        aucd aucd = this.c;
        int i = ((nqj) aucd.b).g + 1;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        nqj nqj = (nqj) aucd.b;
        nqj nqj2 = nqj.k;
        nqj.a |= 32;
        nqj.g = i;
        if (((long) ((nqj) this.c.b).g) < axlf.b()) {
            if (!((nqj) this.c.b).e) {
                return;
            }
        }
        if (((nqj) this.c.b).d <= 0) {
            a("Resetting heartbeat counters (at min)");
        } else {
            if (d()) {
                if (!((nqj) this.c.b).e) {
                    int a2 = a();
                    StringBuilder sb = new StringBuilder(49);
                    sb.append("Dropping heartbeat interval to 0 from ");
                    sb.append(a2);
                    a(sb.toString());
                    aucd aucd2 = this.c;
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    nqj nqj3 = (nqj) aucd2.b;
                    nqj3.a |= 4;
                    nqj3.d = 0;
                }
            }
            aucd aucd3 = this.c;
            int i2 = ((nqj) aucd3.b).d - 1;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            nqj nqj4 = (nqj) aucd3.b;
            nqj4.a |= 4;
            nqj4.d = i2;
            int a3 = a();
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Lowering heartbeat interval 1 notch to ");
            sb2.append(a3);
            a(sb2.toString());
        }
        aucd aucd4 = this.c;
        if (aucd4.c) {
            aucd4.c();
            aucd4.c = false;
        }
        nqj nqj5 = (nqj) aucd4.b;
        nqj5.a |= 8;
        nqj5.e = false;
        g();
    }

    private final void g() {
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        nqj nqj = (nqj) aucd.b;
        nqj nqj2 = nqj.k;
        nqj.a |= 16;
        nqj.f = 0;
        aucd aucd2 = this.c;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        nqj nqj3 = (nqj) aucd2.b;
        nqj3.a |= 32;
        nqj3.g = 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        if (nqw.e(this.b)) {
            return axlf.a.a().f();
        }
        return axlf.a.a().b();
    }

    public final String toString() {
        return "SimpleIntervalSteppingHeartbeatAlgorithm{" + "interval: " + a() + ", fall_fast: " + d() + ", upward_trigger: " + axlf.c() + ", downward_trigger: " + axlf.b() + ", intervals: " + Arrays.toString(c()) + "}";
    }

    public static int[] c() {
        String d = axlf.a.a().d();
        if (TextUtils.isEmpty(d)) {
            return a;
        }
        String[] split = d.split(",");
        int length = split.length;
        int[] iArr = new int[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            try {
                int parseInt = Integer.parseInt(split[i]);
                if (parseInt <= i2) {
                    String valueOf = String.valueOf(d);
                    Log.e("GCM", valueOf.length() == 0 ? new String("Invalid adaptive wifi heartbeat intervals: ") : "Invalid adaptive wifi heartbeat intervals: ".concat(valueOf));
                    return a;
                }
                iArr[i] = parseInt;
                i++;
                i2 = parseInt;
            } catch (NumberFormatException e) {
                String valueOf2 = String.valueOf(d);
                Log.e("GCM", valueOf2.length() == 0 ? new String("Failed to parse heartbeat intervals: ") : "Failed to parse heartbeat intervals: ".concat(valueOf2));
                return a;
            }
        }
        return iArr;
    }

    public final int a() {
        int[] c2 = c();
        return c2[b(c2.length)];
    }

    public final void a(int i) {
        if (i != 1) {
            f();
        } else {
            e();
        }
    }

    public final nqj b() {
        b(c().length);
        return (nqj) this.c.i();
    }
}
