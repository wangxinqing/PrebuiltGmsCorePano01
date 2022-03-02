package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: ccr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ccr {
    private final SparseArray a = new SparseArray();

    public ccr(attp attp) {
        if (attp != null && attp.a.size() != 0) {
            aucx aucx = attp.a;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                atto atto = (atto) aucx.get(i);
                this.a.put(atto.a, Float.valueOf(atto.b));
            }
        }
    }

    private final List a(ou ouVar, atts atts) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(atts);
        List list = (List) ouVar.get(atts.d);
        for (int i = 0; i < list.size(); i++) {
            if (a((atts) list.get(i))) {
                arrayList.addAll(a(ouVar, (atts) list.get(i)));
            }
        }
        if (!arrayList.isEmpty()) {
            String[] strArr = new String[(arrayList.size() - 1)];
            for (int i2 = 1; i2 < arrayList.size(); i2++) {
                strArr[i2 - 1] = ((atts) arrayList.get(i2)).d;
            }
            atts atts2 = (atts) arrayList.get(0);
            aucd aucd = (aucd) atts2.c(5);
            aucd.a((aucj) atts2);
            attr attr = (attr) aucd;
            if (attr.c) {
                attr.c();
                attr.c = false;
            }
            auct auct = atts.o;
            ((atts) attr.b).r = aucj.s();
            attr.a(Arrays.asList(strArr));
            arrayList.set(0, (atts) attr.i());
        }
        return arrayList;
    }

    private final boolean a(atts atts) {
        if (atts.n.size() > 0) {
            double d = atts.q;
            SparseArray sparseArray = this.a;
            if (d >= ((double) ((Float) sparseArray.get(((asup) atts.o.a(Integer.valueOf(atts.n.c(0)))).bx, (Float) sparseArray.get(0, Float.valueOf(0.5f)))).floatValue())) {
                return true;
            }
        }
        return false;
    }

    public final List a(List list) {
        ou ouVar = new ou();
        ou ouVar2 = new ou();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ouVar.put(((atts) list.get(i)).d, (atts) list.get(i));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            atts atts = (atts) it.next();
            if (atts.p == 0) {
                arrayList.add(atts);
            }
            ArrayList arrayList3 = new ArrayList(atts.r.size());
            aucx aucx = atts.r;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = (String) aucx.get(i2);
                if (ouVar.containsKey(str)) {
                    arrayList3.add((atts) ouVar.get(str));
                }
            }
            ouVar2.put(atts.d, arrayList3);
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (a((atts) arrayList.get(i3))) {
                arrayList2.addAll(a(ouVar2, (atts) arrayList.get(i3)));
            }
        }
        return arrayList2;
    }
}
