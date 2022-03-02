package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ahtd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahtd {
    private static final List a(List list, int i) {
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        while (i < size) {
            arrayList.add((ahtc) list.get(i));
            i += 2;
        }
        return arrayList;
    }

    public final List a(List list) {
        List list2 = list;
        int size = list.size();
        int i = 0;
        if (size == 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((ahtc) list2.get(0));
            return arrayList;
        }
        List a = a(a(list2, 0));
        List a2 = a(a(list2, 1));
        int i2 = size / 2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        while (i < i2) {
            double d = (double) i;
            Double.isNaN(d);
            double d2 = (double) size;
            Double.isNaN(d2);
            double d3 = (d * -6.283185307179586d) / d2;
            ahtc ahtc = new ahtc(Math.cos(d3), Math.sin(d3));
            ahtc ahtc2 = (ahtc) a2.get(i);
            double d4 = ahtc.a;
            double d5 = ahtc2.a;
            double d6 = ahtc.b;
            List list3 = a2;
            double d7 = ahtc2.b;
            ahtc ahtc3 = new ahtc((d4 * d5) - (d6 * d7), (d4 * d7) + (d6 * d5));
            ahtc ahtc4 = (ahtc) a.get(i);
            arrayList2 = arrayList2;
            arrayList2.add(new ahtc(ahtc4.a + ahtc3.a, ahtc4.b + ahtc3.b));
            ArrayList arrayList4 = arrayList3;
            arrayList4.add(new ahtc(ahtc4.a - ahtc3.a, ahtc4.b - ahtc3.b));
            i++;
            a2 = list3;
            arrayList3 = arrayList4;
        }
        arrayList2.addAll(arrayList3);
        return arrayList2;
    }
}
