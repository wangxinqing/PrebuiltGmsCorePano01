package defpackage;

import android.util.SparseArray;
import java.util.HashSet;
import java.util.Set;

/* renamed from: cba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cba implements cao {
    public final caz a = new caz();

    private static final void a() {
        cbi.z().b(awuz.a.a().aK());
    }

    public final void a(bsz bsz, cas cas) {
    }

    public final void a(bsz bsz, cas cas, cas cas2) {
    }

    public final void b(bsz bsz, atjv atjv) {
        Object[] objArr = {bsz, Integer.valueOf(atjv.bA)};
        if (this.a.b(atjv.bA)) {
            this.a.a(bsz, atjv.bA, 3);
            a();
        }
    }

    public final Set a(bsz bsz, int i) {
        iva.b(true);
        caz caz = this.a;
        iva.b(true);
        SparseArray sparseArray = (SparseArray) caz.c.get(bsz);
        HashSet hashSet = null;
        if (!(sparseArray == null || sparseArray.size() == 0)) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                cay cay = (cay) sparseArray.valueAt(i2);
                if (cay.c && cay.d == i) {
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(Integer.valueOf(cay.b));
                }
            }
        }
        return hashSet;
    }

    public final void a(bsz bsz, atjv atjv) {
        Object[] objArr = {bsz, Integer.valueOf(atjv.bA)};
        if (this.a.b(atjv.bA)) {
            this.a.a(bsz, atjv.bA, 2);
            a();
        }
    }
}
