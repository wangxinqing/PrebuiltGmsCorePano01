package defpackage;

import android.util.SparseArray;
import java.util.LinkedList;
import java.util.List;

/* renamed from: abwa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abwa {
    private final SparseArray a;
    private final abvy b;
    private final int c;
    private int d;

    public abwa(abvy abvy, int i) {
        if (i != 0) {
            this.c = i;
            this.b = abvy;
            this.a = new SparseArray();
            return;
        }
        throw new IllegalArgumentException("Invalid byte size");
    }

    public final synchronized List a(byte[] bArr) {
        LinkedList linkedList;
        byte[] bArr2;
        int length = bArr.length;
        LinkedList linkedList2 = new LinkedList();
        int i = 0;
        while (i < length) {
            int i2 = length - i;
            int i3 = this.c;
            if (i2 > i3) {
                bArr2 = new byte[i3];
            } else {
                bArr2 = new byte[i2];
            }
            int length2 = bArr2.length;
            System.arraycopy(bArr, i, bArr2, 0, length2);
            i += length2;
            linkedList2.add(bArr2);
        }
        linkedList = new LinkedList();
        int i4 = this.d + 1;
        this.d = i4;
        for (int i5 = 0; i5 < linkedList2.size(); i5++) {
            byte[] bArr3 = (byte[]) linkedList2.get(i5);
            aucd o = acci.f.o();
            int length3 = bArr.length;
            if (o.c) {
                o.c();
                o.c = false;
            }
            acci acci = (acci) o.b;
            acci.a |= 4;
            acci.d = length3;
            auay a2 = auay.a(bArr3);
            if (o.c) {
                o.c();
                o.c = false;
            }
            acci acci2 = (acci) o.b;
            a2.getClass();
            int i6 = acci2.a | 8;
            acci2.a = i6;
            acci2.e = a2;
            int i7 = i6 | 2;
            acci2.a = i7;
            acci2.c = i5;
            acci2.a = i7 | 1;
            acci2.b = i4;
            linkedList.add(((acci) o.i()).k());
        }
        return linkedList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(byte[] r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r4.length     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0063
            aubs r0 = defpackage.aubs.c()     // Catch:{ auda -> 0x005b }
            acci r1 = defpackage.acci.f     // Catch:{ auda -> 0x005b }
            aucj r4 = defpackage.aucj.a((defpackage.aucj) r1, (byte[]) r4, (defpackage.aubs) r0)     // Catch:{ auda -> 0x005b }
            acci r4 = (defpackage.acci) r4     // Catch:{ auda -> 0x005b }
            android.util.SparseArray r0 = r3.a     // Catch:{ all -> 0x0071 }
            int r1 = r4.b     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0071 }
            abvz r0 = (defpackage.abvz) r0     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0028
            abvz r0 = new abvz     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            android.util.SparseArray r1 = r3.a     // Catch:{ all -> 0x0071 }
            int r2 = r4.b     // Catch:{ all -> 0x0071 }
            r1.put(r2, r0)     // Catch:{ all -> 0x0071 }
        L_0x0028:
            byte[] r1 = r0.a     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            int r1 = r4.d     // Catch:{ all -> 0x0071 }
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x0071 }
            r0.a = r1     // Catch:{ all -> 0x0071 }
        L_0x0033:
            int r1 = r0.b     // Catch:{ all -> 0x0071 }
            int r2 = r4.c     // Catch:{ all -> 0x0071 }
            int r1 = r1 + 1
            if (r1 != r2) goto L_0x003f
            r0.a(r4)     // Catch:{ all -> 0x0071 }
            goto L_0x0044
        L_0x003f:
            android.util.SparseArray r1 = r0.d     // Catch:{ all -> 0x0071 }
            r1.put(r2, r4)     // Catch:{ all -> 0x0071 }
        L_0x0044:
            byte[] r1 = r0.a     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x0059
            int r0 = r0.c     // Catch:{ all -> 0x0071 }
            int r2 = r1.length     // Catch:{ all -> 0x0071 }
            if (r0 != r2) goto L_0x0059
            abvy r0 = r3.b     // Catch:{ all -> 0x0071 }
            r0.a((byte[]) r1)     // Catch:{ all -> 0x0071 }
            android.util.SparseArray r0 = r3.a     // Catch:{ all -> 0x0071 }
            int r4 = r4.b     // Catch:{ all -> 0x0071 }
            r0.remove(r4)     // Catch:{ all -> 0x0071 }
        L_0x0059:
            monitor-exit(r3)
            return
        L_0x005b:
            r4 = move-exception
            abvy r0 = r3.b     // Catch:{ all -> 0x0071 }
            r0.a((java.lang.Exception) r4)     // Catch:{ all -> 0x0071 }
            monitor-exit(r3)
            return
        L_0x0063:
            abvy r4 = r3.b     // Catch:{ all -> 0x0071 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = "Empty byte array"
            r0.<init>(r1)     // Catch:{ all -> 0x0071 }
            r4.a((java.lang.Exception) r0)     // Catch:{ all -> 0x0071 }
            monitor-exit(r3)
            return
        L_0x0071:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abwa.b(byte[]):void");
    }
}
