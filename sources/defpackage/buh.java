package defpackage;

import java.util.HashMap;

/* renamed from: buh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class buh {
    public btz a;
    public boolean b;
    public int c;
    public int d;
    public final aucd e;

    public buh(long j) {
        aucd o = atos.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atos atos = (atos) o.b;
        int i = atos.a | 1;
        atos.a = i;
        atos.b = j;
        atos.a = i | 2;
        atos.c = Long.MAX_VALUE;
        this.e = o;
        this.a = new btz();
        this.b = true;
        this.c = 0;
        this.d = 0;
    }

    public final void a() {
        this.d++;
    }

    public final atoq b() {
        if (this.b) {
            return null;
        }
        aucd o = atoq.f.o();
        aucd aucd = this.e;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atoq atoq = (atoq) o.b;
        atos atos = (atos) aucd.i();
        atos.getClass();
        atoq.c = atos;
        atoq.a |= 1;
        int i = this.c;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atoq atoq2 = (atoq) o.b;
        int i2 = atoq2.a | 2;
        atoq2.a = i2;
        atoq2.d = i;
        int i3 = this.d;
        atoq2.a = i2 | 4;
        atoq2.e = i3;
        int i4 = 0;
        for (HashMap size : this.a.a.values()) {
            i4 += size.size();
        }
        if (i4 == 0) {
            return (atoq) o.i();
        }
        for (HashMap values : this.a.b()) {
            for (bty bty : values.values()) {
                aucd aucd2 = bty.c;
                atos atos2 = (atos) bty.d.i();
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                atoj atoj = (atoj) aucd2.b;
                atoj atoj2 = atoj.e;
                atos2.getClass();
                atoj.d = atos2;
                atoj.a |= 4;
                atoj atoj3 = (atoj) aucd2.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atoq atoq3 = (atoq) o.b;
                atoj3.getClass();
                if (!atoq3.b.a()) {
                    atoq3.b = aucj.a(atoq3.b);
                }
                atoq3.b.add(atoj3);
            }
        }
        return (atoq) o.i();
    }
}
