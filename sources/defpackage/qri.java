package defpackage;

import android.os.SystemClock;

/* renamed from: qri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qri {
    private long a;
    private long b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = -1;
    private final int h;
    private int i = 2;

    public qri(int i2) {
        this.h = i2;
        this.a = 0;
    }

    public final synchronized antd a() {
        aucd o;
        o = antd.l.o();
        int i2 = this.h;
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((antd) o.b).a = i2 - 2;
        antd antd = (antd) o.b;
        antd.b = 0;
        antd.c = this.c;
        antd.e = this.d;
        antd.f = this.e;
        antd.d = this.f;
        antd.g = 0;
        antd.h = 0;
        int i3 = this.i;
        if (i3 != 1) {
            antd.i = i3 - 2;
            if (this.g >= 0) {
                aucd o2 = antb.b.o();
                int i4 = this.g;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                ((antb) o2.b).a = i4;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                antb antb = (antb) o2.i();
                antb.getClass();
                ((antd) o.b).j = antb;
            }
            long j = this.b;
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((antd) o.b).k = j;
        } else {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return (antd) o.i();
    }

    public final synchronized void a(int i2) {
        this.e += i2;
    }

    public final synchronized void b() {
        if (this.a > 0) {
            this.b = SystemClock.elapsedRealtime() - this.a;
        }
    }

    public final synchronized void b(int i2) {
        this.f += i2;
    }

    public final void c() {
        this.a = SystemClock.elapsedRealtime();
    }

    public final synchronized void c(int i2) {
        this.d += i2;
    }

    public final synchronized void d() {
        this.g = 15;
    }

    public final synchronized void d(int i2) {
        this.c += i2;
    }

    public final synchronized void e(int i2) {
        if (this.i != 4) {
            this.i = i2;
        }
    }
}
