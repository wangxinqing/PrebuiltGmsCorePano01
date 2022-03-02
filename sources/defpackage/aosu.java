package defpackage;

import com.google.android.chimera.FragmentTransaction;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: aosu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aosu extends InputStream {
    private final byte[] a = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
    private int b = 0;
    private int c = 0;
    private final aota d;

    public aosu(InputStream inputStream) {
        aota aota = new aota();
        this.d = aota;
        try {
            aosx.a(aota, inputStream);
        } catch (aosv e) {
            throw new IOException("Brotli decoder initialization failed", e);
        }
    }

    public final void close() {
        aosx.a(this.d);
    }

    public final int read() {
        int i = this.c;
        if (i >= this.b) {
            byte[] bArr = this.a;
            int read = read(bArr, 0, bArr.length);
            this.b = read;
            this.c = 0;
            if (read == -1) {
                return -1;
            }
            i = 0;
        }
        byte[] bArr2 = this.a;
        this.c = i + 1;
        return bArr2[i] & 255;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(23);
            sb.append("Bad offset: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0) {
            int i3 = i + i2;
            int length = bArr.length;
            if (i3 > length) {
                StringBuilder sb2 = new StringBuilder(42);
                sb2.append("Buffer overflow: ");
                sb2.append(i3);
                sb2.append(" > ");
                sb2.append(length);
                throw new IllegalArgumentException(sb2.toString());
            } else if (i2 == 0) {
                return 0;
            } else {
                int max = Math.max(this.b - this.c, 0);
                if (max != 0) {
                    max = Math.min(max, i2);
                    System.arraycopy(this.a, this.c, bArr, i, max);
                    this.c += max;
                    i += max;
                    i2 -= max;
                    if (i2 == 0) {
                        return max;
                    }
                }
                try {
                    aota aota = this.d;
                    aota.f = bArr;
                    aota.ac = i;
                    aota.ad = i2;
                    aota.ae = 0;
                    aosx.b(aota);
                    int i4 = this.d.ae;
                    if (i4 != 0) {
                        return i4 + max;
                    }
                    return -1;
                } catch (aosv e) {
                    throw new IOException("Brotli stream decoding failed", e);
                }
            }
        } else {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Bad length: ");
            sb3.append(i2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }
}
