package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: aiky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aiky {
    public final aucd a;

    public aiky(int i) {
        aucd o = ailk.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((ailk) o.b).c = i;
        long currentTimeMillis = System.currentTimeMillis();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((ailk) o.b).d = currentTimeMillis;
        this.a = o;
    }

    protected static ailf a(ou ouVar, aucd aucd, nz nzVar) {
        aucd o = ailf.b.o();
        for (Map.Entry entry : nzVar.entrySet()) {
            Integer num = (Integer) ouVar.get(entry.getKey());
            if (num == null) {
                num = Integer.valueOf(ouVar.h);
                ouVar.put((aijt) entry.getKey(), num);
                aucd.a(((aijt) entry.getKey()).a(""));
            }
            aucd aucd2 = (aucd) entry.getValue();
            int intValue = num.intValue();
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aile aile = aile.g;
            ((aile) aucd2.b).a = intValue;
            if (o.c) {
                o.c();
                o.c = false;
            }
            ailf ailf = (ailf) o.b;
            aile aile2 = (aile) aucd2.i();
            aile2.getClass();
            if (!ailf.a.a()) {
                ailf.a = aucj.a(ailf.a);
            }
            ailf.a.add(aile2);
        }
        return (ailf) o.i();
    }

    public abstract ailk a();

    protected static void a(List list, ou ouVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aijt aijt = (aijt) it.next();
            aucd o = aile.g.o();
            short a2 = aijt.a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aile aile = (aile) o.b;
            aile.b = a2;
            aile.c = aijt.e;
            aile.d = aijt.g;
            aile.e = aijt.h;
            aile.f = aijt.i;
            ouVar.put(aijt, o);
        }
    }
}
