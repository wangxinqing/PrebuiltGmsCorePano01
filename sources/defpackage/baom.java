package defpackage;

/* renamed from: baom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baom {
    public int a;
    public final int[] b = new int[10];

    /* access modifiers changed from: package-private */
    public final int a() {
        if ((this.a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    public final boolean a(int i) {
        return ((1 << i) & this.a) != 0;
    }

    public final int b(int i) {
        return this.b[i];
    }

    public final void a(int i, int i2) {
        int[] iArr = this.b;
        if (i < iArr.length) {
            this.a |= 1 << i;
            iArr[i] = i2;
        }
    }
}
