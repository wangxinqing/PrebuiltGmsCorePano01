package defpackage;

import android.util.SparseArray;
import java.util.HashSet;

/* renamed from: ccf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ccf {
    public final SparseArray a = new SparseArray();

    private final boolean a(ccj ccj, HashSet hashSet) {
        hashSet.add(ccj);
        int[] iArr = ccj.d;
        if (iArr != null) {
            for (int a2 : iArr) {
                ccj a3 = a(a2);
                if (a3 == null || !a(a3, hashSet)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final HashSet b(int i) {
        ccj a2 = a(i);
        if (a2 != null) {
            HashSet hashSet = new HashSet();
            if (a(a2, hashSet)) {
                return hashSet;
            }
        }
        return null;
    }

    public final ccj a(int i) {
        ccj ccj = (ccj) this.a.get(i);
        if (ccj != null || !cdw.b(i)) {
            return ccj;
        }
        iva.b(cdw.b(i));
        ccj ccj2 = new ccj(new cdv(i), "GenericBackendProducedContextProducer", new int[]{i}, (int[]) null);
        cdw.b.append(i, ccj2);
        this.a.put(i, ccj2);
        return ccj2;
    }
}
