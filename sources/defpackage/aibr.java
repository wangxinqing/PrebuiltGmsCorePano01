package defpackage;

import java.util.Arrays;

/* renamed from: aibr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aibr extends aibw {
    public final byte[] a;
    public final boolean b;
    public final aibv[] c;
    private int d;

    public aibr(byte[] bArr) {
        this(bArr, (aibv[]) null, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static long a(byte[] r4, int r5, int r6) {
        /*
            int r6 = r6 + -1
            r0 = 0
        L_0x0004:
            if (r6 < 0) goto L_0x0017
            r2 = 8
            long r0 = r0 << r2
            int r2 = r6 + r5
            byte r2 = r4[r2]
            if (r2 < 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            int r2 = r2 + 256
        L_0x0012:
            long r2 = (long) r2
            long r0 = r0 | r2
            int r6 = r6 + -1
            goto L_0x0004
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aibr.a(byte[], int, int):long");
    }

    private final void e(int i) {
        if (i >= b()) {
            throw new IllegalArgumentException(String.format("Index (%d) out of range [0, %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(b())}));
        }
    }

    public final byte b(int i) {
        e(i);
        return this.a[(i * 9) + 15];
    }

    public final byte c() {
        byte[] bArr = this.a;
        if (bArr == null || bArr.length == 0) {
            return -1;
        }
        return bArr[0];
    }

    public final long d() {
        return a(this.a, 1, 8);
    }

    public final aibv[] e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aibr)) {
            return false;
        }
        aibr aibr = (aibr) obj;
        return Arrays.equals(aibr.a, this.a) && aibr.b == this.b;
    }

    public final boolean f() {
        aibv[] aibvArr = this.c;
        return aibvArr != null && aibvArr.length > 0;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = ((Arrays.hashCode(this.a) + 31) * 31) + (!this.b ? 1237 : 1231);
        this.d = hashCode;
        return hashCode;
    }

    public final String toString() {
        int b2 = b();
        StringBuilder sb = new StringBuilder(b2 * 40);
        sb.append("WifiCompressedScan [");
        if (a()) {
            sb.append("deliveryTime=");
            sb.append(d());
            sb.append(", version=");
            sb.append(c());
            sb.append(", len=");
            sb.append(this.a.length);
            sb.append(", devices=[");
            for (int i = 0; i < b2; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append("[mac=");
                sb.append(a(i));
                sb.append(", rssi=");
                sb.append(b(i));
                sb.append(", frequency=");
                sb.append(c(i));
                sb.append("]");
            }
            aibv[] aibvArr = this.c;
            if (aibvArr != null) {
                for (aibv aibv : aibvArr) {
                    sb.append(", [rttMac=");
                    sb.append(aibv.a);
                    sb.append(", distanceCm=");
                    sb.append(aibv.e);
                    sb.append(", distanceSdCm=");
                    sb.append(aibv.f);
                    sb.append(", numSuccessFrames=");
                    sb.append(aibv.i);
                    sb.append(", rssi=");
                    sb.append(aibv.d);
                    sb.append(", timestamp=");
                    sb.append(aibv.c);
                    sb.append("]");
                }
            }
        } else {
            sb.append("corrupted");
        }
        sb.append("]");
        return sb.toString();
    }

    public aibr(byte[] bArr, aibv[] aibvArr, boolean z) {
        this.a = bArr;
        this.b = z;
        this.c = aibvArr;
    }

    public static aibr a(long j) {
        return new aibq(j, 0).a((aibv[]) null, false);
    }

    public final int c(int i) {
        e(i);
        int i2 = this.a[(i * 9) + 16] + 128;
        if (i2 <= 0) {
            return 0;
        }
        if ((i2 >= 7 && i2 <= 12) || i2 < 7 || i2 == 13) {
            return ((i2 - 1) * 5) + 2412;
        }
        if (i2 == 14) {
            return 2484;
        }
        if (i2 >= 183 && i2 <= 196) {
            return ((i2 - 183) * 5) + 4915;
        }
        if (i2 > 200) {
            return 0;
        }
        return (i2 * 5) + 5000;
    }

    public final byte[] d(int i) {
        return i < b() ? Arrays.copyOf(this.a, (i * 9) + 9) : this.a;
    }

    static void a(long j, byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            bArr[i3] = (byte) ((int) j);
            j >>= 8;
        }
    }

    public final int b() {
        return Math.max(0, (this.a.length - 9) / 9);
    }

    public final long a(int i) {
        e(i);
        return a(this.a, (i * 9) + 9, 6);
    }

    public final boolean a() {
        byte[] bArr = this.a;
        if (bArr != null) {
            int length = bArr.length;
            if (length != 9) {
                return length == (b() * 9) + 9 && c() == 0;
            }
            if (c() == 0) {
                return true;
            }
        }
        return false;
    }
}
