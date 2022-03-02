package defpackage;

/* renamed from: arom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arom {
    private final byte[] a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private int f;
    private int g = 0;
    private int h = 0;

    public arom(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = 0;
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.f = (bArr != null ? bArr.length : i5) + 4;
        this.e = i4 - 4;
    }

    private static int a(int i) {
        return i == 0 ? 1 : 0;
    }

    public final boolean a() {
        return this.f > 0;
    }

    public final byte[] b() {
        byte[] bArr;
        if (a()) {
            int min = Math.min(this.e, this.f);
            this.f -= min;
            if (arok.a(this.h)) {
                min -= 4;
            }
            int a2 = a(this.f);
            if (min != 0) {
                int i = this.b;
                int i2 = this.h;
                int a3 = a(this.f);
                int i3 = this.c;
                int i4 = this.d;
                byte[] bArr2 = this.a;
                int i5 = this.g;
                if (bArr2 != null) {
                    int length = bArr2.length;
                    if (length == 0) {
                        throw new IllegalArgumentException("'data' cannot be empty.");
                    } else if (i5 < 0) {
                        throw new IllegalArgumentException("'dataOffset' cannot be negative.");
                    } else if (min > 0) {
                        int i6 = i5 + min;
                        if (length >= i6) {
                            bArr = arok.a(i, i2, a3, i3, i4, bArr2, i5, min);
                        } else {
                            StringBuilder sb = new StringBuilder(90);
                            sb.append("Requested data sub-array overflows. TotalDataLength=");
                            sb.append(length);
                            sb.append(", Length+Offset=");
                            sb.append(i6);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("'dataLength' must be positive and non-zero");
                    }
                } else {
                    throw new IllegalArgumentException("'data' cannot be null.");
                }
            } else {
                bArr = arok.a(this.b, this.h, a2, this.c, this.d, (byte[]) null, 0, 0);
            }
            this.g += min;
            this.h++;
            return bArr;
        }
        throw new IllegalStateException("Cannot invoke getNextFragment() when no fragments exist");
    }
}
