package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: arvx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arvx {
    public final Map a = new HashMap();
    public final double b;
    public final double c;
    public int d = 3;
    private final double e;

    public arvx(double d2, double d3, double d4) {
        this.e = d2;
        this.b = d3;
        this.c = d4;
    }

    public static arvr a(List list, double d2, double d3) {
        boolean z;
        List list2 = list;
        int size = list.size();
        if (size > 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        double d4 = 0.0d;
        double d5 = d2;
        double d6 = 0.0d;
        double d7 = 0.0d;
        double d8 = 0.0d;
        double d9 = 0.0d;
        int i = 0;
        int i2 = 0;
        while (i < size && d5 > d4) {
            arvr arvr = (arvr) list2.get(i);
            double d10 = arvr.b;
            int i3 = arvr.d;
            double d11 = (double) i3;
            Double.isNaN(d11);
            d7 += d10 * d11 * d5;
            Double.isNaN(d11);
            d8 += d10 * d10 * d11 * d5;
            double d12 = arvr.c;
            Double.isNaN(d11);
            d9 += d12 * d11 * d5;
            Double.isNaN(d11);
            d6 += d11 * d5;
            i2 += i3;
            d5 -= d3;
            i++;
            d4 = 0.0d;
            list2 = list;
            size = size;
        }
        double d13 = d7 / d6;
        arvr arvr2 = (arvr) list.get(0);
        return new arvr(arvr2.a, d13, ((d9 / d6) + (d8 / d6)) - (d13 * d13), i2, arvr2.e, arvr2.f);
    }

    public final void a(List list, double d2) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (d2 - ((arvr) listIterator.next()).f > this.e) {
                listIterator.remove();
            }
        }
    }
}
