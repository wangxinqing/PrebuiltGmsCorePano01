package defpackage;

import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bxv {
    public static bxt a(ContextManagerClientInfo contextManagerClientInfo, FenceUpdateRequestImpl fenceUpdateRequestImpl, byg byg) {
        int i;
        char c;
        int i2;
        int i3;
        int i4;
        bwa bwa;
        int i5;
        ContextManagerClientInfo contextManagerClientInfo2 = contextManagerClientInfo;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = byg.a().iterator();
        while (true) {
            i = 2;
            c = 0;
            i2 = 1;
            if (!it.hasNext()) {
                break;
            }
            bwc bwc = (bwc) it.next();
            for (bzm bzm : bwc.d()) {
                Object[] objArr = {bzm.e, bzm.b};
                arrayList.add(a(bzm, bwc.a, true));
            }
        }
        Object[] objArr2 = {arrayList, arrayList2};
        ArrayList arrayList3 = fenceUpdateRequestImpl.a;
        int size = arrayList3.size();
        int i6 = 0;
        while (i3 < size) {
            UpdateFenceOperation updateFenceOperation = (UpdateFenceOperation) arrayList3.get(i3);
            new Object[i2][c] = Integer.valueOf(updateFenceOperation.a);
            int i7 = updateFenceOperation.a;
            if (i7 == 3 || i7 == 4 || i7 == 5) {
                if (i7 == 3) {
                    a((List) arrayList, (List) arrayList2, bwa.a(contextManagerClientInfo2, updateFenceOperation.c));
                } else if (i7 != 4) {
                    String a = bzm.a(contextManagerClientInfo2, updateFenceOperation.f);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        bxu bxu = (bxu) it2.next();
                        Object[] objArr3 = new Object[3];
                        objArr3[c] = updateFenceOperation.f;
                        objArr3[i2] = a;
                        String str = bxu.a.e;
                        objArr3[i] = str;
                        if (str.equals(a)) {
                            new Object[i2][c] = bxu.a.e;
                            arrayList2.add(bxu);
                            it2.remove();
                        }
                    }
                } else {
                    a((List) arrayList, (List) arrayList2, bwa.a(contextManagerClientInfo2, updateFenceOperation.e));
                }
                new Object[i2][c] = Integer.valueOf(arrayList2.size());
            }
            int i8 = updateFenceOperation.a;
            if (i8 == i2 || i8 == i) {
                if (i8 != i2) {
                    bwa = bwa.a(contextManagerClientInfo2, updateFenceOperation.e);
                } else {
                    bwa = bwa.a(contextManagerClientInfo2, updateFenceOperation.c);
                }
                new Object[i2][c] = bwa;
                bzm bzm2 = new bzm(updateFenceOperation.b);
                String str2 = contextManagerClientInfo2.b;
                String str3 = contextManagerClientInfo2.a;
                String str4 = contextManagerClientInfo2.d;
                bzm2.f = str2;
                bzm2.g = str3;
                bzm2.h = str4;
                bzm2.e = bzm.a(str2, str3, str4, bzm2.a);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    bxu bxu2 = (bxu) it3.next();
                    if (bxu2.a.e.equals(bzm2.e) && bxu2.b.equals(bwa) && bxu2.a.b.equals(bzm2.b)) {
                        new Object[i2][c] = bxu2.a.e;
                        arrayList.add(bxu2);
                        it3.remove();
                    }
                }
                Iterator it4 = arrayList.iterator();
                boolean z = false;
                while (it4.hasNext()) {
                    bxu bxu3 = (bxu) it4.next();
                    if (bxu3.a.e.equals(bzm2.e)) {
                        if (bxu3.b.equals(bwa)) {
                            bzm bzm3 = bxu3.a;
                            i5 = i3;
                            if (bzm3.c == bzm2.c && bzm3.b.equals(bzm2.b)) {
                                new Object[1][0] = bxu3.a.e;
                                i3 = i5;
                                z = true;
                            }
                        } else {
                            i5 = i3;
                        }
                        arrayList2.add(bxu3);
                        it4.remove();
                    } else {
                        i5 = i3;
                    }
                    i3 = i5;
                }
                i4 = i3;
                if (!z) {
                    new Object[1][0] = bzm2.e;
                    arrayList.add(a(bzm2, bwa, false));
                }
            } else {
                i4 = i3;
            }
            i6 = i4 + 1;
            i = 2;
            c = 0;
            i2 = 1;
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            bxu bxu4 = (bxu) it5.next();
            if (bxu4.c) {
                new Object[1][0] = bxu4.a.e;
                it5.remove();
            }
        }
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            bxu bxu5 = (bxu) it6.next();
            if (!bxu5.c) {
                new Object[1][0] = bxu5.a.e;
                it6.remove();
            }
        }
        bxt bxt = new bxt(arrayList, arrayList2);
        if (bxk.a(2)) {
            List list = bxt.a;
            List list2 = bxt.b;
            int size2 = list.size();
            for (int i9 = 0; i9 < size2; i9++) {
                bxu bxu6 = (bxu) list.get(i9);
                Object[] objArr4 = {bxu6.a.e, bxu6};
            }
            int size3 = list2.size();
            for (int i10 = 0; i10 < size3; i10++) {
                bxu bxu7 = (bxu) list2.get(i10);
                Object[] objArr5 = {bxu7.a.e, bxu7};
            }
        }
        return bxt;
    }

    private static bxu a(bzm bzm, bwa bwa, boolean z) {
        return new bxu(bzm, bwa, z);
    }

    private static void a(List list, List list2, bwa bwa) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bxu bxu = (bxu) it.next();
            Object[] objArr = {bwa, Boolean.valueOf(bxu.b.equals(bwa))};
            if (bxu.b.equals(bwa)) {
                Object[] objArr2 = {bxu.a.e, bxu};
                list2.add(bxu);
                it.remove();
            }
        }
    }
}
