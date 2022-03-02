package defpackage;

import java.util.Map;

/* renamed from: agtf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agtf {
    private final atwv a;

    private agtf(int i) {
        atwv atwv = (atwv) atwy.i.o();
        this.a = atwv;
        if (atwv.c) {
            atwv.c();
            atwv.c = false;
        }
        atwy atwy = (atwy) atwv.b;
        atwy.b = i - 1;
        atwy.a |= 1;
    }

    public static agtf a(int i) {
        return new agtf(i);
    }

    public static agtf a(babk babk) {
        agtf agtf = new agtf(4);
        atwv atwv = agtf.a;
        int i = babk.a.r.r;
        if (atwv.c) {
            atwv.c();
            atwv.c = false;
        }
        atwy atwy = (atwy) atwv.b;
        atwy atwy2 = atwy.i;
        atwy.a |= 32;
        atwy.h = i;
        return agtf;
    }

    public static agtf a(babl babl) {
        agtf agtf = new agtf(4);
        atwv atwv = agtf.a;
        int i = babl.a.r.r;
        if (atwv.c) {
            atwv.c();
            atwv.c = false;
        }
        atwy atwy = (atwy) atwv.b;
        atwy atwy2 = atwy.i;
        atwy.a |= 32;
        atwy.h = i;
        return agtf;
    }

    public final atwy a() {
        return (atwy) this.a.i();
    }

    public final void a(afyp afyp, amqy amqy) {
        atwv atwv = this.a;
        long b = afyp.b();
        if (atwv.c) {
            atwv.c();
            atwv.c = false;
        }
        atwy atwy = (atwy) atwv.b;
        atwy atwy2 = atwy.i;
        atwy.a |= 2;
        atwy.d = b;
        long c = afyp.c();
        if (atwv.c) {
            atwv.c();
            atwv.c = false;
        }
        atwy atwy3 = (atwy) atwv.b;
        atwy3.a |= 4;
        atwy3.e = c;
        long d = afyp.d();
        if (atwv.c) {
            atwv.c();
            atwv.c = false;
        }
        atwy atwy4 = (atwy) atwv.b;
        atwy4.a |= 8;
        atwy4.f = d;
        anhj a2 = afyp.a().entrySet().iterator();
        while (a2.hasNext()) {
            Map.Entry entry = (Map.Entry) a2.next();
            atwv atwv2 = this.a;
            aucd o = atwx.d.o();
            atxf atxf = (atxf) amqy.a((Enum) entry.getKey());
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwx atwx = (atwx) o.b;
            atwx.b = atxf.l;
            atwx.a |= 1;
            long longValue = ((Long) entry.getValue()).longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwx atwx2 = (atwx) o.b;
            atwx2.a |= 2;
            atwx2.c = longValue;
            atwv2.a(o);
        }
    }

    public final void a(boolean z) {
        atwv atwv = this.a;
        if (atwv.c) {
            atwv.c();
            atwv.c = false;
        }
        atwy atwy = (atwy) atwv.b;
        atwy atwy2 = atwy.i;
        atwy.a |= 16;
        atwy.g = z;
    }
}
