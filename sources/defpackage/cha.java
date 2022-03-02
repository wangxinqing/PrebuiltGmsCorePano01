package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cha {
    public static final int[] a = {0, 1};
    private static final List c;
    public final Map b = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        for (int cgx : a) {
            arrayList.add(new cgx(cgx));
        }
        c = arrayList;
    }

    public static final List a(List list, int i) {
        int i2;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            cgy cgy = (cgy) list.get(i3);
            float c2 = cgy.c(i);
            if (i != 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            arrayList.add(Float.valueOf(c2 - cgy.c(i2)));
        }
        return cgw.a(arrayList, Float.valueOf(-120.0f));
    }

    public static final List b(List list, int i) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Float.valueOf(((cgy) list.get(i2)).c(i)));
        }
        return cgw.a(arrayList, Float.valueOf(-120.0f));
    }

    public final List a(int i) {
        Comparator comparator = (Comparator) c.get(i);
        ArrayList arrayList = new ArrayList();
        for (cgy cgy : this.b.values()) {
            if (cgy.a(i)) {
                arrayList.add(cgy);
            }
        }
        Collections.sort(arrayList, comparator);
        return arrayList;
    }
}
