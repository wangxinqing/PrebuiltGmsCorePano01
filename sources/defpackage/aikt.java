package defpackage;

import android.location.Location;
import java.util.List;

/* renamed from: aikt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aikt extends aiky {
    private final ou b;
    private final nz c = new nz();
    private final aucd d = aild.c.o();
    private final aucd e;

    public aikt(List list, Location location, ou ouVar, aucd aucd) {
        super(-1509023308);
        this.b = ouVar;
        this.e = aucd;
        aucd aucd2 = this.d;
        ajcj a = atfi.a(location);
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        a.getClass();
        ((aild) aucd2.b).b = a;
        aiky.a(list, this.c);
    }

    public final ailk a() {
        aucd aucd = this.d;
        ailf a = aiky.a(this.b, this.e, this.c);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aild aild = aild.c;
        a.getClass();
        ((aild) aucd.b).a = a;
        aucd aucd2 = this.a;
        aucd aucd3 = this.d;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        ailk ailk = (ailk) aucd2.b;
        aild aild2 = (aild) aucd3.i();
        ailk ailk2 = ailk.e;
        aild2.getClass();
        ailk.b = aild2;
        ailk.a = 3;
        return (ailk) this.a.i();
    }
}
