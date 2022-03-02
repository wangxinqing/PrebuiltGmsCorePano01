package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: chk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class chk {
    public static final ArrayList a = new ArrayList();
    public final SparseArray b = new SparseArray();
    public final SparseArray c = new SparseArray();

    public chk(atss atss) {
        a(atss);
    }

    public static int a(int i, int i2, int i3) {
        return (i3 * 10000) + (i2 * 100) + i;
    }

    static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list);
        anbs.f(arrayList, chj.a);
        Collections.sort(arrayList);
        return arrayList;
    }

    public final void a(atss atss) {
        this.b.clear();
        if (!(atss == null || atss.a.size() == 0)) {
            aucx aucx = atss.a;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                atsf atsf = (atsf) aucx.get(i);
                SparseArray sparseArray = this.b;
                atsd atsd = atsf.a;
                if (atsd == null) {
                    atsd = atsd.f;
                }
                int i2 = atsd.b;
                atsd atsd2 = atsf.a;
                if (atsd2 == null) {
                    atsd2 = atsd.f;
                }
                int i3 = atsd2.c;
                atsd atsd3 = atsf.a;
                if (atsd3 == null) {
                    atsd3 = atsd.f;
                }
                sparseArray.append(a(i2, i3, atsd3.d), a((List) new aucu(atsf.b, atsf.c)));
            }
        }
        this.c.clear();
        if (atss != null && atss.b.size() != 0) {
            aucx aucx2 = atss.b;
            int size2 = aucx2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                atsi atsi = (atsi) aucx2.get(i4);
                SparseArray sparseArray2 = this.c;
                int a2 = atsp.a(atsi.a);
                if (a2 == 0) {
                    a2 = 1;
                }
                sparseArray2.append(a2 - 1, a((List) new aucu(atsi.b, atsi.c)));
            }
        }
    }
}
