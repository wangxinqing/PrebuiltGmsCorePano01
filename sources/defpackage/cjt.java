package defpackage;

import android.util.SparseArray;

/* renamed from: cjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cjt {
    private SparseArray a = null;

    public cjt(atpr atpr) {
        if (atpr != null && atpr.a.size() != 0) {
            this.a = new SparseArray(atpr.a.size());
            aucx aucx = atpr.a;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                atpx atpx = (atpx) aucx.get(i);
                SparseArray sparseArray = this.a;
                atjv a2 = atjv.a(atpx.b);
                atpx atpx2 = (atpx) sparseArray.get((a2 == null ? atjv.UNKNOWN_CONTEXT_NAME : a2).bA);
                if (atpx2 == null || atpx2.c <= atpx.c) {
                    SparseArray sparseArray2 = this.a;
                    atjv a3 = atjv.a(atpx.b);
                    sparseArray2.put((a3 == null ? atjv.UNKNOWN_CONTEXT_NAME : a3).bA, atpx);
                }
            }
        }
    }

    public final atpx a(atjv atjv) {
        SparseArray sparseArray = this.a;
        if (sparseArray != null) {
            return (atpx) sparseArray.get(atjv.bA);
        }
        return null;
    }
}
