package defpackage;

/* renamed from: avxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avxq {
    public int[] a = new int[1];
    public int b = 0;

    private final void b(int i) {
        int[] iArr = this.a;
        int length = iArr.length;
        if (i > (length << 5)) {
            int[] iArr2 = new int[((i + 31) >> 5)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.a = iArr2;
        }
    }

    public final int a() {
        return (this.b + 7) >> 3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.b);
        for (int i = 0; i < this.b; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(!a(i) ? '.' : 'X');
        }
        return sb.toString();
    }

    public final void a(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        b(this.b + i2);
        while (i2 > 0) {
            i2--;
            boolean z = true;
            if (((i >> i2) & 1) == 0) {
                z = false;
            }
            a(z);
        }
    }

    public final void a(avxq avxq) {
        int i = avxq.b;
        b(this.b + i);
        for (int i2 = 0; i2 < i; i2++) {
            a(avxq.a(i2));
        }
    }

    public final void a(boolean z) {
        b(this.b + 1);
        if (z) {
            int[] iArr = this.a;
            int i = this.b;
            int i2 = i >> 5;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.b++;
    }

    public final boolean a(int i) {
        return ((1 << (i & 31)) & this.a[i >> 5]) != 0;
    }
}
