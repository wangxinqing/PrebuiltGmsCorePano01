package defpackage;

import android.util.SparseIntArray;

/* renamed from: abc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class abc {
    final SparseIntArray a = new SparseIntArray();
    final SparseIntArray b = new SparseIntArray();
    public boolean c = false;

    public abstract int a(int i);

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(int r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.a(r9)
            r1 = 0
            if (r0 == r10) goto L_0x005f
            boolean r2 = r8.c
            if (r2 == 0) goto L_0x0046
            android.util.SparseIntArray r2 = r8.a
            int r3 = r2.size()
            r4 = -1
            int r3 = r3 + r4
            r5 = 0
        L_0x0014:
            if (r5 > r3) goto L_0x0027
            int r6 = r5 + r3
            int r6 = r6 >>> 1
            int r7 = r2.keyAt(r6)
            if (r7 < r9) goto L_0x0024
            int r6 = r6 + -1
            r3 = r6
            goto L_0x0014
        L_0x0024:
            int r5 = r6 + 1
            goto L_0x0014
        L_0x0027:
            int r5 = r5 + r4
            if (r5 < 0) goto L_0x0035
            int r3 = r2.size()
            if (r5 >= r3) goto L_0x0035
            int r4 = r2.keyAt(r5)
            goto L_0x0036
        L_0x0035:
        L_0x0036:
            if (r4 < 0) goto L_0x0046
            android.util.SparseIntArray r2 = r8.a
            int r2 = r2.get(r4)
            int r3 = r8.a(r4)
            int r2 = r2 + r3
            int r4 = r4 + 1
            goto L_0x0048
        L_0x0046:
            r2 = 0
            r4 = 0
        L_0x0048:
        L_0x0049:
            if (r4 >= r9) goto L_0x005a
            int r3 = r8.a(r4)
            int r2 = r2 + r3
            if (r2 != r10) goto L_0x0054
            r2 = 0
            goto L_0x0057
        L_0x0054:
            if (r2 <= r10) goto L_0x0057
            r2 = r3
        L_0x0057:
            int r4 = r4 + 1
            goto L_0x0049
        L_0x005a:
            int r0 = r0 + r2
            if (r0 <= r10) goto L_0x005e
            return r1
        L_0x005e:
            return r2
        L_0x005f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abc.a(int, int):int");
    }

    /* access modifiers changed from: package-private */
    public final int b(int i, int i2) {
        if (!this.c) {
            return a(i, i2);
        }
        int i3 = this.a.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int a2 = a(i, i2);
        this.a.put(i, a2);
        return a2;
    }

    public final int c(int i, int i2) {
        int a2 = a(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int a3 = a(i5);
            i3 += a3;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = a3;
            }
        }
        return i3 + a2 > i2 ? i4 + 1 : i4;
    }

    public final void b() {
        this.b.clear();
    }

    public final void a() {
        this.a.clear();
    }
}
