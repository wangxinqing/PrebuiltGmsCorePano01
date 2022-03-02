package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: aaai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaai {
    public int[] a;

    static {
        aaai.class.getSimpleName();
    }

    public aaai(int i, TreeSet treeSet) {
        Iterator it = treeSet.iterator();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z = true;
        while (it.hasNext()) {
            int a2 = (int) a(((aaae) it.next()).b().a);
            if (i2 != a2 || z) {
                arrayList.add(Integer.valueOf(a2));
            }
            i2 = a2;
            z = false;
        }
        int[] iArr = new int[(arrayList.size() + 3)];
        this.a = iArr;
        iArr[0] = 1;
        iArr[1] = 1936614772;
        iArr[2] = i;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.a[i3 + 3] = ((Integer) arrayList.get(i3)).intValue();
        }
    }

    public static long a(long j) {
        return j & 4294967295L;
    }

    public static long a(byte[] bArr) {
        return (((long) bArr[3]) & 255) | ((((long) bArr[2]) & 255) << 8) | ((((long) bArr[1]) & 255) << 16) | ((255 & ((long) bArr[0])) << 24);
    }
}
