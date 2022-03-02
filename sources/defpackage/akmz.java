package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: akmz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akmz implements akmu {
    public static final int[] a = {18, 19, 20, 21};

    public final akmy a(akln akln, List list) {
        aklz.a();
        List a2 = akms.a(list.size());
        ArrayList arrayList = new ArrayList(list);
        for (int i = 0; i < arrayList.size(); i++) {
            aklu aklu = (aklu) a2.get(i);
            aucr aucr = ((akkk) arrayList.get(i)).a.m;
            if (aucr.size() == a.length) {
                int i2 = 0;
                while (true) {
                    int[] iArr = a;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    aklu.a(Integer.valueOf(iArr[i2]), (Float) aucr.get(i2));
                    i2++;
                }
            }
        }
        return new akmy(list, a2);
    }

    public final String a() {
        return "Popularity";
    }
}
