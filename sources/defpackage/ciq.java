package defpackage;

import android.util.SparseArray;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: ciq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ciq {
    public final HashMap a = new HashMap();

    public static int a(long j, long j2) {
        long j3 = j - j2;
        if (j3 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j3 >= -2147483648L) {
            return (int) j3;
        }
        return Integer.MIN_VALUE;
    }

    protected ciq() {
    }

    public final cih a(bsz bsz, atjv atjv) {
        cim cim;
        SparseArray sparseArray = (SparseArray) this.a.get(bsz);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            this.a.put(bsz, sparseArray);
        }
        cih cih = (cih) sparseArray.get(atjv.bA);
        if (cih != null) {
            return cih;
        }
        boolean z = !bsz.b();
        int a2 = cil.a(atjv);
        if (a2 == 0) {
            cim = new cin(z);
        } else if (a2 == 1) {
            cim = new cim((int) awuz.f(), cig.a(atjv), z);
        } else if (a2 != 2) {
            cim = new cio(cig.a(atjv));
        } else {
            cim = new cip((int) awuz.f(), cig.a(atjv), z);
        }
        sparseArray.put(atjv.bA, cim);
        return cim;
    }

    public final void a(bsz bsz, ContextDataFilterImpl contextDataFilterImpl, boolean z) {
        SparseArray sparseArray = (SparseArray) this.a.get(bsz);
        if (sparseArray != null) {
            Iterator it = contextDataFilterImpl.d().iterator();
            while (it.hasNext()) {
                cih cih = (cih) sparseArray.get(((Integer) it.next()).intValue());
                if (cih != null) {
                    cih.a(contextDataFilterImpl, z);
                }
            }
        }
    }

    public final void a(bsz bsz, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cij cij = (cij) list.get(i);
            a(bsz, cij.a.h()).a(cij);
        }
    }

    public final void a(ArrayList arrayList, bsz bsz, ContextDataFilterImpl contextDataFilterImpl, boolean z, long j) {
        HashSet d;
        ContextDataFilterImpl contextDataFilterImpl2 = contextDataFilterImpl;
        long j2 = j;
        SparseArray sparseArray = (SparseArray) this.a.get(bsz);
        if (sparseArray != null && (d = contextDataFilterImpl.d()) != null && !d.isEmpty()) {
            int i = contextDataFilterImpl2.c.b;
            if (i == -1) {
                i = Integer.MAX_VALUE;
            }
            Iterator it = contextDataFilterImpl.d().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                cih cih = (cih) sparseArray.get(intValue);
                if (cih != null) {
                    if (bta.d(intValue)) {
                        Object[] objArr = {Integer.toString(intValue), cih.getClass(), Boolean.valueOf(bvd.a(intValue)), Boolean.valueOf(cih.a(j2))};
                    }
                    if (bvd.a(intValue)) {
                        if (bsz.b()) {
                            if (bvd.a(intValue)) {
                                Iterator it2 = this.a.values().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        ArrayList arrayList2 = arrayList;
                                        break;
                                    }
                                    cih cih2 = (cih) ((SparseArray) it2.next()).get(intValue);
                                    if (cih2 != null) {
                                        if (cih2.a(j2)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                ArrayList arrayList3 = arrayList;
                            }
                        }
                        if (bsz.b() || cih.a(j2)) {
                            Iterator it3 = cih.iterator();
                            int i2 = 0;
                            int i3 = 0;
                            while (it3.hasNext()) {
                                cij cij = (cij) it3.next();
                                i2++;
                                if (z && !cij.b) {
                                    ArrayList arrayList4 = arrayList;
                                } else if (i <= 0 || !contextDataFilterImpl2.a(cij.a)) {
                                    ArrayList arrayList5 = arrayList;
                                } else {
                                    arrayList.add(cij.a);
                                    i--;
                                    i3++;
                                }
                            }
                            ArrayList arrayList6 = arrayList;
                            if (bta.d(intValue)) {
                                Object[] objArr2 = {Integer.toString(intValue), cih.getClass(), Integer.valueOf(i2), Integer.valueOf(i3)};
                            }
                        } else {
                            ArrayList arrayList7 = arrayList;
                        }
                    } else {
                        ArrayList arrayList8 = arrayList;
                    }
                } else {
                    ArrayList arrayList9 = arrayList;
                }
            }
        }
    }
}
