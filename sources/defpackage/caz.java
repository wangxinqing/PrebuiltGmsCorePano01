package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: caz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class caz {
    public static final int[] a = {10000, 10001, 10002, 10003, 10004, 10005};
    public final Set b = new HashSet();
    public final Map c = new HashMap();

    public final void a(bsz bsz, int i, int i2) {
        boolean z = true;
        if (i2 == 1) {
            z = false;
        }
        iva.b(z);
        if (!b(i)) {
            ((anih) ((anih) bxk.a.b()).a("caz", "a", 140, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[InterestSyncState] account=%s, contextName=%s is not synchronizable", (Object) bsz, i);
            return;
        }
        SparseArray sparseArray = (SparseArray) this.c.get(bsz);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            this.c.put(bsz, sparseArray);
        }
        cay cay = (cay) sparseArray.get(i);
        if (cay == null) {
            cay = new cay(bsz, i, i2);
            sparseArray.put(i, cay);
        }
        cay.b(i2);
    }

    public final boolean b(int i) {
        return this.b.contains(Integer.valueOf(i));
    }

    public final boolean a(int i) {
        Iterator it = this.c.values().iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                return false;
            }
            SparseArray sparseArray = (SparseArray) it.next();
            while (true) {
                if (i2 < sparseArray.size()) {
                    if (((cay) sparseArray.valueAt(i2)).a(i)) {
                        return true;
                    }
                    i2++;
                }
            }
        }
    }
}
