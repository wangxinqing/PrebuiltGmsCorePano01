package defpackage;

import com.google.android.chimera.FragmentTransaction;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: aect  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aect {
    public int a = 0;
    public boolean b;
    public int c;
    private final InputStream d;
    private final int e;
    private byte[] f = new byte[FragmentTransaction.TRANSIT_ENTER_MASK];
    private int g;

    public aect(InputStream inputStream, int i) {
        this.d = inputStream;
        this.e = Math.max(i, FragmentTransaction.TRANSIT_ENTER_MASK);
        this.b = inputStream == null;
        this.c = 0;
        this.g = 0;
    }

    /* access modifiers changed from: package-private */
    public final byte a(int i) {
        int i2 = this.a;
        if (i < i2) {
            return this.f[b(i)];
        }
        StringBuilder sb = new StringBuilder(42);
        sb.append("Index ");
        sb.append(i);
        sb.append(" exceeds size ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int b(int i) {
        return (this.c + i) % this.f.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("circular buffer size: ");
        sb.append(this.a);
        sb.append(10);
        for (int i = 0; i < Math.min(this.a, 100); i++) {
            char a2 = (char) a(i);
            sb.append(a2 != 10 ? Character.valueOf(a2) : "\\n");
            sb.append('(');
            sb.append((byte) a2);
            sb.append("), ");
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, byte[] bArr, int i2) {
        if (i2 <= this.f.length) {
            int b2 = b(i);
            byte[] bArr2 = this.f;
            int length = bArr2.length - b2;
            if (i2 > length) {
                System.arraycopy(bArr, 0, bArr2, b2, length);
                System.arraycopy(bArr, length, this.f, 0, i2 - length);
                return;
            }
            System.arraycopy(bArr, 0, bArr2, b2, i2);
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Not enough space to write ");
        sb.append(i2);
        sb.append(" bytes");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return;
        }
        if (this.a - i < i3) {
            throw new IndexOutOfBoundsException("Not enough data to copy.");
        } else if (bArr.length - i2 >= i3) {
            int b2 = b(i);
            int b3 = b(i + i3);
            if (b2 < b3) {
                System.arraycopy(this.f, b2, bArr, i2, i3);
                return;
            }
            byte[] bArr2 = this.f;
            int length = bArr2.length - b2;
            System.arraycopy(bArr2, b2, bArr, i2, length);
            System.arraycopy(this.f, 0, bArr, i2 + length, b3);
        } else {
            throw new IndexOutOfBoundsException("Not enough space to copy.");
        }
    }

    public final boolean a() {
        int i;
        if (this.b) {
            return false;
        }
        int i2 = 0;
        while (true) {
            int i3 = this.a;
            byte[] bArr = this.f;
            int length = bArr.length;
            if (i3 == length) {
                int i4 = this.e;
                if (length >= i4) {
                    return true;
                }
                this.f = Arrays.copyOf(bArr, Math.min(length + length, i4));
            }
            InputStream inputStream = this.d;
            byte[] bArr2 = this.f;
            int i5 = this.g;
            int i6 = this.c;
            if (i6 <= i5) {
                i = bArr2.length - i5;
            } else {
                i = i6 - i5;
            }
            int read = inputStream.read(bArr2, i5, i);
            if (read != -1) {
                this.a += read;
                this.g = (this.g + read) % this.e;
                i2 += read;
            } else {
                this.b = true;
                return i2 != 0;
            }
        }
    }

    public final byte[] a(int i, int i2) {
        byte[] bArr = new byte[i2];
        a(i, bArr, 0, i2);
        return bArr;
    }
}
