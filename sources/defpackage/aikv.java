package defpackage;

import android.location.Location;

/* renamed from: aikv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aikv extends aiky {
    private final aucd b;

    public aikv(int i, Location location, int i2) {
        super(i);
        aucd o = aili.c.o();
        this.b = o;
        ajcj a = atfi.a(location);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aili aili = (aili) o.b;
        a.getClass();
        aili.a = a;
        aili.b = i2 - 2;
    }

    public final ailk a() {
        aucd aucd = this.a;
        aucd aucd2 = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ailk ailk = (ailk) aucd.b;
        aili aili = (aili) aucd2.i();
        ailk ailk2 = ailk.e;
        aili.getClass();
        ailk.b = aili;
        ailk.a = 5;
        return (ailk) this.a.i();
    }
}
