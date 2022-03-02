package defpackage;

/* renamed from: arst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arst {
    public static final int a(byte[] bArr) {
        if (bArr != null) {
            return bArr[0];
        }
        throw new IllegalArgumentException("FREWLE tile to be parsed is null.");
    }

    public static final int b(byte[] bArr) {
        if (a(bArr) == 1) {
            return arth.a(bArr, 1);
        }
        throw new IllegalArgumentException("Unsupported protocol version on getFrewleTileVersion.");
    }

    public static final double c(byte[] bArr, int i) {
        if (a(bArr) == 1) {
            return (double) bArr[(arsu.a(bArr, i) * 11) + 20];
        }
        throw new IllegalArgumentException("Unknown protocol version on getPowerOutput.");
    }

    public static final double d(byte[] bArr, int i) {
        if (a(bArr) == 1) {
            double d = (double) bArr[(arsu.a(bArr, i) * 11) + 21];
            Double.isNaN(d);
            return (d + 128.0d) * 0.01d;
        }
        throw new IllegalArgumentException("Unknown protocol version on getPathLossExponent.");
    }

    public static final long a(long j, int i) {
        long j2 = (long) (i & 16777215);
        int b = 30 - aema.b(j);
        return (j ^ aema.c(j)) | (((j2 + j2) | 1) << ((b + b) - 24));
    }

    public static final long a(byte[] bArr, int i) {
        if (a(bArr) == 1) {
            int i2 = (i * 11) + 11;
            return (arth.b(bArr[i2]) << 40) + (arth.b(bArr[i2 + 1]) << 32) + (arth.b(bArr[i2 + 2]) << 24) + (arth.b(bArr[i2 + 3]) << 16) + (arth.b(bArr[i2 + 4]) << 8) + arth.b(bArr[i2 + 5]);
        }
        throw new IllegalArgumentException("Unknown protocol version on getMacAddress.");
    }

    public static final int b(byte[] bArr, int i) {
        if (a(bArr) == 1) {
            int a = (arsu.a(bArr, i) * 11) + 17;
            return (arth.a(bArr[a]) << 16) + (arth.a(bArr[a + 1]) << 8) + arth.a(bArr[a + 2]);
        }
        throw new IllegalArgumentException("Unknown protocol version on getApS2CellIdSuffix.");
    }

    public static final long c(byte[] bArr) {
        if (a(bArr) == 1) {
            return (((((arth.b(bArr[4]) << 32) + (arth.b(bArr[5]) << 24)) + (arth.b(bArr[6]) << 16)) + (arth.b(bArr[7]) << 8)) + arth.b(bArr[8])) << 24;
        }
        throw new IllegalArgumentException("Unsupported protocol version on getS2CellId.");
    }

    public static final int d(byte[] bArr) {
        if (a(bArr) == 1) {
            return arth.a(bArr, 9);
        }
        throw new IllegalArgumentException("Unsupported protocol version on getNumMacEntries.");
    }
}
