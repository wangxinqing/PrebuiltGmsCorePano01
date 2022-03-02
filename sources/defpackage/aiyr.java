package defpackage;

import com.google.android.gms.location.ActivityTransition;
import java.util.Map;

/* renamed from: aiyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiyr {
    public static arij a(int i, Map map) {
        aucd o = arij.g.o();
        arii arii = arii.ENABLE;
        if (o.c) {
            o.c();
            o.c = false;
        }
        arij arij = (arij) o.b;
        arij.b = arii.g;
        int i2 = arij.a | 1;
        arij.a = i2;
        arij.a = i2 | 2;
        arij.c = i;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                ariu a = aiyu.a(((ActivityTransition) entry.getKey()).a);
                arji arji = (arji) aiyu.a.get(Integer.valueOf(((ActivityTransition) entry.getKey()).b));
                if (a != null) {
                    aucd o2 = arir.e.o();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    arir arir = (arir) o2.b;
                    arir.b = a.k;
                    int i3 = arir.a | 1;
                    arir.a = i3;
                    arir.c = arji.d;
                    arir.a = i3 | 2;
                    int intValue = ((Integer) entry.getValue()).intValue();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    arir arir2 = (arir) o2.b;
                    arir2.a |= 4;
                    arir2.d = intValue;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    arij arij2 = (arij) o.b;
                    arir arir3 = (arir) o2.i();
                    arir3.getClass();
                    if (!arij2.d.a()) {
                        arij2.d = aucj.a(arij2.d);
                    }
                    arij2.d.add(arir3);
                }
            }
        }
        return (arij) o.i();
    }

    public static arij a(arii arii) {
        aucd o = arij.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        arij arij = (arij) o.b;
        arij.b = arii.g;
        arij.a |= 1;
        return (arij) o.i();
    }
}
