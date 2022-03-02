package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: auaw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auaw extends OutputStream {
    private static final byte[] a = new byte[0];
    private final int b = 128;
    private final ArrayList c = new ArrayList();
    private int d;
    private byte[] e = new byte[128];
    private int f;

    private final void a(int i) {
        this.c.add(new auav(this.e));
        int length = this.d + this.e.length;
        this.d = length;
        this.e = new byte[Math.max(this.b, Math.max(i, length >>> 1))];
        this.f = 0;
    }

    public final synchronized int b() {
        return this.d + this.f;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(b())});
    }

    public final synchronized void write(int i) {
        if (this.f == this.e.length) {
            a(1);
        }
        byte[] bArr = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final synchronized auay a() {
        int i = this.f;
        byte[] bArr = this.e;
        int length = bArr.length;
        if (i >= length) {
            this.c.add(new auav(bArr));
            this.e = a;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(length, i));
            this.c.add(new auav(bArr2));
        }
        this.d += this.f;
        this.f = 0;
        return auay.a((Iterable) this.c);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.e;
        int length = bArr2.length;
        int i3 = this.f;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        a(i5);
        System.arraycopy(bArr, i + i4, this.e, 0, i5);
        this.f = i5;
    }
}
