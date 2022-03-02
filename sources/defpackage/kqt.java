package defpackage;

import java.util.Arrays;

/* renamed from: kqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class kqt {
    private final int a;
    public final Object b;
    protected final int c;
    private final int[] d;
    private final Object[] e;

    protected kqt(int i, kqs kqs) {
        boolean z;
        boolean z2 = true;
        if (kqs.c > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        iva.b(kqs.d[0] != 0 ? false : z2);
        this.a = kqs.c;
        this.d = kqs.d;
        this.e = kqs.e;
        this.b = d(i);
        this.c = i;
    }

    public final Object c(int i) {
        Object d2 = d(i);
        StringBuilder sb = new StringBuilder(34);
        sb.append("Not present in version ");
        sb.append(i);
        iva.a(d2, (Object) sb.toString());
        return d2;
    }

    /* access modifiers changed from: protected */
    public final Object d(int i) {
        if (i < 0) {
            return null;
        }
        int binarySearch = Arrays.binarySearch(this.d, 0, this.a, i);
        if (binarySearch >= 0) {
            return this.e[binarySearch];
        }
        return this.e[(binarySearch ^ -1) - 1];
    }

    public final boolean e(int i) {
        return d(i) != null;
    }

    public final boolean g() {
        return this.b != null;
    }

    /* access modifiers changed from: protected */
    public final void h() {
        iva.a(g(), "Not present in current version %d", Integer.valueOf(this.c));
    }
}
