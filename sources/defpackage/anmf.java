package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: anmf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anmf {
    public final String a;
    public final char[] b;
    final int c;
    final int d;
    final int e;
    final int f;
    private final byte[] g;
    private final boolean[] h;

    public anmf(String str, char[] cArr) {
        amrl.a((Object) str);
        this.a = str;
        this.b = (char[]) amrl.a((Object) cArr);
        try {
            int length = cArr.length;
            int a2 = aons.a(length, RoundingMode.UNNECESSARY);
            this.d = a2;
            int min = Math.min(8, Integer.lowestOneBit(a2));
            try {
                this.e = 8 / min;
                this.f = this.d / min;
                this.c = length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                int i = 0;
                while (true) {
                    boolean z = true;
                    if (i >= cArr.length) {
                        break;
                    }
                    char c2 = cArr[i];
                    amrl.a(c2 < 128, "Non-ASCII character: %s", c2);
                    if (bArr[c2] != -1) {
                        z = false;
                    }
                    amrl.a(z, "Duplicate character: %s", c2);
                    bArr[c2] = (byte) i;
                    i++;
                }
                this.g = bArr;
                boolean[] zArr = new boolean[this.e];
                for (int i2 = 0; i2 < this.f; i2++) {
                    zArr[aons.a(i2 * 8, this.d, RoundingMode.CEILING)] = true;
                }
                this.h = zArr;
            } catch (ArithmeticException e2) {
                String str2 = new String(cArr);
                throw new IllegalArgumentException(str2.length() == 0 ? new String("Illegal alphabet ") : "Illegal alphabet ".concat(str2), e2);
            }
        } catch (ArithmeticException e3) {
            int length2 = cArr.length;
            StringBuilder sb = new StringBuilder(35);
            sb.append("Illegal alphabet length ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString(), e3);
        }
    }

    /* access modifiers changed from: package-private */
    public final char a(int i) {
        return this.b[i];
    }

    public final boolean b() {
        for (char c2 : this.b) {
            if (ampw.c(c2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anmf) {
            return Arrays.equals(this.b, ((anmf) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final int a(char c2) {
        if (c2 > 127) {
            String valueOf = String.valueOf(Integer.toHexString(c2));
            throw new anmi(valueOf.length() == 0 ? new String("Unrecognized character: 0x") : "Unrecognized character: 0x".concat(valueOf));
        }
        byte b2 = this.g[c2];
        if (b2 != -1) {
            return b2;
        }
        if (c2 > ' ' && c2 != 127) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Unrecognized character: ");
            sb.append(c2);
            throw new anmi(sb.toString());
        }
        String valueOf2 = String.valueOf(Integer.toHexString(c2));
        throw new anmi(valueOf2.length() == 0 ? new String("Unrecognized character: 0x") : "Unrecognized character: 0x".concat(valueOf2));
    }

    public final boolean b(char c2) {
        byte[] bArr = this.g;
        return c2 < bArr.length && bArr[c2] != -1;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(int i) {
        return this.h[i % this.e];
    }

    public final boolean a() {
        for (char b2 : this.b) {
            if (ampw.b(b2)) {
                return true;
            }
        }
        return false;
    }
}
