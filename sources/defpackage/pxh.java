package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: pxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxh {
    private final Map a = new HashMap();

    public final List a(List list) {
        if (this.a.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            otc otc = (otc) it.next();
            aucd aucd = (aucd) otc.c(5);
            aucd.a((aucj) otc);
            int[] iArr = (int[]) this.a.get(otc.b);
            if (iArr != null) {
                int i = otc.c + iArr[0];
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                otc otc2 = (otc) aucd.b;
                otc otc3 = otc.d;
                otc2.a |= 2;
                otc2.c = i;
                this.a.remove(otc.b);
            }
            arrayList.add((otc) aucd.i());
        }
        for (Map.Entry entry : this.a.entrySet()) {
            aucd o = otc.d.o();
            String str = (String) entry.getKey();
            if (o.c) {
                o.c();
                o.c = false;
            }
            otc otc4 = (otc) o.b;
            str.getClass();
            otc4.a |= 1;
            otc4.b = str;
            int i2 = ((int[]) entry.getValue())[0];
            if (o.c) {
                o.c();
                o.c = false;
            }
            otc otc5 = (otc) o.b;
            otc5.a |= 2;
            otc5.c = i2;
            arrayList.add((otc) o.i());
        }
        this.a.clear();
        Collections.sort(arrayList, pxg.a);
        return arrayList;
    }

    public final void a(String str) {
        int[] iArr = (int[]) this.a.get(str);
        if (iArr == null) {
            this.a.put(str, new int[]{1});
            return;
        }
        iArr[0] = iArr[0] + 1;
    }

    public final boolean a() {
        return !this.a.isEmpty();
    }
}
