package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.BitSet;
import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;

/* renamed from: bns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bns implements Comparator {
    private final SparseIntArray a;

    public bns(bnt bnt, SparseArray sparseArray, SortedMap sortedMap) {
        boolean z;
        boolean z2;
        int size = sparseArray.size();
        SparseArray sparseArray2 = new SparseArray(size);
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            List<brm> list = (List) sparseArray.valueAt(i);
            amtf.a((Object) list);
            BitSet bitSet = new BitSet();
            for (brm brm : list) {
                bom bom = (bom) sortedMap.get(brm);
                amtf.a((Object) bom);
                bitSet.set(bnt.a(bom));
            }
            sparseArray2.append(keyAt, bitSet);
        }
        this.a = new SparseIntArray(size);
        int i2 = 0;
        while (this.a.size() < size) {
            int size2 = sparseArray2.size();
            boolean z3 = false;
            for (int i3 = 0; i3 < size2; i3++) {
                int keyAt2 = sparseArray2.keyAt(i3);
                BitSet bitSet2 = (BitSet) sparseArray2.valueAt(i3);
                if (bitSet2 == null || !bitSet2.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (bitSet2 == null || bitSet2.cardinality() != 1 || !bitSet2.get(keyAt2)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z || z2) {
                    sparseArray2.setValueAt(i3, (Object) null);
                    int i4 = i2 + 1;
                    this.a.append(keyAt2, i2);
                    int size3 = sparseArray2.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        BitSet bitSet3 = (BitSet) sparseArray2.valueAt(i5);
                        if (bitSet3 != null) {
                            bitSet3.clear(keyAt2);
                        }
                    }
                    i2 = i4;
                    z3 = true;
                }
            }
            amtf.a(z3);
        }
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        bnp bnp = (bnp) obj2;
        int i = this.a.get(((bnp) obj).b, -1);
        boolean z = true;
        amtf.a(i >= 0);
        int i2 = this.a.get(bnp.b, -1);
        if (i2 < 0) {
            z = false;
        }
        amtf.a(z);
        return i2 - i;
    }
}
