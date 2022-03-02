package defpackage;

/* renamed from: ahqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahqv {
    public int a;
    public int b;
    private int c;
    private int d;
    private int e;

    public final aqek a(int i, int i2) {
        aqek aqek = new aqek(ajck.ao);
        aqek.g(1, i);
        aqek.g(2, i2);
        aqek.g(3, this.c);
        aqek.g(4, this.d);
        aqek.g(5, this.e);
        aqek.g(6, this.a);
        aqek.g(7, this.b);
        return aqek;
    }

    public final void a() {
        this.c++;
    }

    public final arti b(int i, int i2) {
        aucd o = arti.i.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        arti arti = (arti) o.b;
        int i3 = arti.a | 1;
        arti.a = i3;
        arti.b = i;
        int i4 = i3 | 2;
        arti.a = i4;
        arti.c = i2;
        int i5 = this.c;
        int i6 = i4 | 4;
        arti.a = i6;
        arti.d = i5;
        int i7 = this.d;
        int i8 = i6 | 8;
        arti.a = i8;
        arti.e = i7;
        int i9 = this.e;
        int i10 = i8 | 16;
        arti.a = i10;
        arti.f = i9;
        int i11 = this.a;
        int i12 = i10 | 32;
        arti.a = i12;
        arti.g = i11;
        int i13 = this.b;
        arti.a = i12 | 64;
        arti.h = i13;
        return (arti) o.i();
    }

    public final void b() {
        this.d++;
    }

    public final void c() {
        this.e++;
    }

    public final void d() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.a = 0;
        this.b = 0;
    }
}
