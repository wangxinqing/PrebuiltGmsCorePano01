package defpackage;

import java.io.OutputStream;

/* renamed from: aqeh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqeh extends OutputStream {
    public int[] a = new int[1];
    public int b = 0;
    public int c = 0;
    private byte[] d = new byte[16];
    private int e = 0;

    private static int a(int i, int i2, int i3, int i4) {
        int i5 = i2 - i3;
        while (i5 < i) {
            int i6 = i2 >> i4;
            if (i6 > 0) {
                i2 += i6;
                i5 = i2 - i3;
            } else {
                StringBuilder sb = new StringBuilder(63);
                sb.append("Incorrect size [");
                sb.append(i2);
                sb.append("] and rightShiftAmount [");
                sb.append(i4);
                sb.append("]");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return i2;
    }

    private final void c(int i) {
        int length = this.d.length;
        int i2 = this.b;
        int i3 = 1;
        if (length - i < i2) {
            int i4 = this.e;
            if (i4 < 64) {
                i3 = 0;
            } else if (i4 >= 128) {
                i3 = 2;
            }
            int a2 = a(i, length, i2, i3);
            byte[] bArr = this.d;
            if (a2 > bArr.length) {
                byte[] bArr2 = new byte[a2];
                System.arraycopy(bArr, 0, bArr2, 0, this.b);
                this.d = bArr2;
                this.e = 0;
                return;
            }
            return;
        }
        this.e++;
    }

    public final void b(int i) {
        int a2 = a(1, this.a.length, this.c, 0);
        int[] iArr = this.a;
        if (a2 > iArr.length) {
            int[] iArr2 = new int[a2];
            System.arraycopy(iArr, 0, iArr2, 0, this.c);
            this.a = iArr2;
        }
        int[] iArr3 = this.a;
        int i2 = this.c;
        this.c = i2 + 1;
        iArr3[i2] = i;
    }

    public final void write(int i) {
        c(1);
        byte[] bArr = this.d;
        int i2 = this.b;
        this.b = i2 + 1;
        bArr[i2] = (byte) (i & 255);
    }

    public final int a(int i) {
        return this.a[i];
    }

    public final void write(byte[] bArr) {
        int length = bArr.length;
        c(length);
        System.arraycopy(bArr, 0, this.d, this.b, length);
        this.b += length;
    }

    public final void a(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.d, i, i2);
    }

    public final void write(byte[] bArr, int i, int i2) {
        c(i2);
        System.arraycopy(bArr, i, this.d, this.b, i2);
        this.b += i2;
    }
}
