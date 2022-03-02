package defpackage;

import java.io.InputStream;

/* renamed from: atih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class atih extends athw implements athh {
    protected atig a;
    public long b = -1;
    public long c = -1;
    public long d = -1;
    public boolean e = false;
    private int f = 1;
    private int g = -1;

    public abstract int a();

    public final synchronized void a(atig atig) {
        this.a = atig;
    }

    public final synchronized boolean a(long j) {
        if (this.d + 20000 >= j) {
            return this.f > 0;
        }
        return false;
    }

    public abstract InputStream b();

    public final synchronized void b(int i) {
        this.g = i;
    }

    public abstract void d();

    public final synchronized atig g() {
        return this.a;
    }

    public final synchronized void h() {
        this.f--;
    }

    public final synchronized int i() {
        return this.g;
    }

    public final synchronized boolean j() {
        if (this.e) {
            return false;
        }
        this.e = true;
        return true;
    }

    public final synchronized void b(long j) {
        long j2 = 3000 + j;
        this.b = j2;
        long j3 = j + 5000;
        this.c = j3;
        this.c = Math.max(j3, j2);
    }
}
