package defpackage;

/* renamed from: afgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afgr {
    private final Object a = new Object();
    private long b;
    private long c;
    private long d;
    private long e;
    private long f;
    private boolean g;

    public final aokn a() {
        aokn aokn;
        synchronized (this.a) {
            aucd o = aokn.g.o();
            long j = (this.c - this.b) / 1000;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aokn aokn2 = (aokn) o.b;
            int i = aokn2.a | 4;
            aokn2.a = i;
            aokn2.b = j;
            long j2 = this.d;
            int i2 = i | 8;
            aokn2.a = i2;
            aokn2.c = j2;
            long j3 = this.e;
            int i3 = i2 | 64;
            aokn2.a = i3;
            aokn2.e = j3;
            long j4 = this.f;
            int i4 = i3 | 16;
            aokn2.a = i4;
            aokn2.d = j4;
            boolean z = this.g;
            aokn2.a = i4 | 128;
            aokn2.f = z;
            aokn = (aokn) o.i();
        }
        return aokn;
    }

    public final aoko b() {
        aoko aoko;
        synchronized (this.a) {
            aucd o = aoko.f.o();
            long j = (this.c - this.b) / 1000;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoko aoko2 = (aoko) o.b;
            int i = aoko2.a | 4;
            aoko2.a = i;
            aoko2.b = j;
            long j2 = this.d;
            int i2 = i | 8;
            aoko2.a = i2;
            aoko2.c = j2;
            long j3 = this.e;
            int i3 = i2 | 64;
            aoko2.a = i3;
            aoko2.e = j3;
            long j4 = this.f;
            aoko2.a = i3 | 16;
            aoko2.d = j4;
            aoko = (aoko) o.i();
        }
        return aoko;
    }

    public final void c() {
        synchronized (this.a) {
            this.g = true;
        }
    }

    public final void c(long j) {
        synchronized (this.a) {
            this.b = j;
        }
    }

    public final void a(long j) {
        synchronized (this.a) {
            this.c = j;
        }
    }

    public final void b(long j) {
        synchronized (this.a) {
            this.f = j;
        }
    }

    public final void a(long j, long j2) {
        synchronized (this.a) {
            this.d = j;
            this.e = j2;
        }
    }
}
