package defpackage;

import com.google.android.chimera.FragmentTransaction;
import java.io.InputStream;

/* renamed from: atfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atfw extends InputStream {
    private int a;
    private final byte[] b;
    private int c;
    private int d;
    private final InputStream e;

    public atfw(InputStream inputStream, int i) {
        this.e = inputStream;
        this.a = i;
        this.b = new byte[Math.min(i, FragmentTransaction.TRANSIT_ENTER_MASK)];
    }

    private final boolean a() {
        int i = this.a;
        if (i <= 0) {
            return false;
        }
        if (this.c < this.d) {
            return true;
        }
        InputStream inputStream = this.e;
        byte[] bArr = this.b;
        int read = inputStream.read(bArr, 0, Math.min(i, bArr.length));
        this.d = read;
        if (read > 0) {
            this.c = 0;
            return true;
        }
        this.a = 0;
        return false;
    }

    public final int available() {
        return this.d - this.c;
    }

    public final int read() {
        if (!a()) {
            return -1;
        }
        this.a--;
        byte[] bArr = this.b;
        int i = this.c;
        this.c = i + 1;
        return bArr[i] & 255;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (!a()) {
            return -1;
        }
        int min = Math.min(i2, this.d - this.c);
        System.arraycopy(this.b, this.c, bArr, i, min);
        this.c += min;
        this.a -= min;
        return min;
    }
}
