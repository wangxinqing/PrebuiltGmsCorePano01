package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Random;

/* renamed from: njh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class njh {
    private final short[] a = new short[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    private final short[] b = new short[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    private final int c;
    private long d;
    private final long e;

    public njh(Random random, long j) {
        this.c = (random.nextInt() & -131075) | 65537;
        this.d = 0;
        this.e = j;
    }

    private final int a(String str, int i, int i2) {
        int hashCode = str.hashCode() * this.c;
        char c2 = 0;
        if (!str.isEmpty()) {
            c2 = str.charAt(0);
        }
        int i3 = ((hashCode >>> 24) + c2) & 255;
        int length = ((hashCode >>> 16) + str.length()) & 255;
        int min = Math.min(this.a[i3], this.b[length]);
        int i4 = (i * min) + i2;
        short min2 = (short) Math.min(32767, i4);
        short[] sArr = this.a;
        if (sArr[i3] == min) {
            sArr[i3] = min2;
        }
        short[] sArr2 = this.b;
        if (sArr2[length] == min) {
            sArr2[length] = min2;
        }
        return i4;
    }

    /* access modifiers changed from: package-private */
    public final int a(String str, long j, int i) {
        long j2 = j - this.d;
        long j3 = this.e;
        if (j2 >= j3) {
            long j4 = j2 / j3;
            long j5 = 15;
            if (j4 <= 15) {
                j5 = j4;
            }
            for (int i2 = 0; i2 < 256; i2++) {
                short[] sArr = this.a;
                int i3 = (int) j5;
                int i4 = sArr[i2] >> i3;
                sArr[i2] = (short) i4;
                this.b[i2] = (short) (i4 >> i3);
            }
            this.d += j4 * this.e;
        }
        return a(str, 1, i);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        a(str, 0, 0);
    }
}
