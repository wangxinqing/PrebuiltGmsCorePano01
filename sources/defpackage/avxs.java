package defpackage;

import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: avxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avxs {
    public static final avxs a = new avxs(285, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0);
    public int[] b;
    public int[] c;
    public avxt d;
    public final int e;
    public final int f;
    private final int g;
    private boolean h = false;

    static {
        new avxs(4201, FragmentTransaction.TRANSIT_ENTER_MASK, 1);
        new avxs(1033, 1024, 1);
        new avxs(67, 64, 1);
        new avxs(19, 16, 1);
        new avxs(301, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 1);
    }

    public avxs(int i, int i2, int i3) {
        this.g = i;
        this.e = i2;
        this.f = i3;
    }

    public static int a(int i, int i2) {
        return i ^ i2;
    }

    public final int b(int i, int i2) {
        a();
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.e - 1)];
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.g) + ',' + this.e + ')';
    }

    public final void a() {
        if (!this.h) {
            int i = this.e;
            this.b = new int[i];
            this.c = new int[i];
            int i2 = 0;
            int i3 = 1;
            while (true) {
                int i4 = this.e;
                if (i2 >= i4) {
                    break;
                }
                this.b[i2] = i3;
                i3 += i3;
                if (i3 >= i4) {
                    i3 = (i3 ^ this.g) & (i4 - 1);
                }
                i2++;
            }
            for (int i5 = 0; i5 < this.e - 1; i5++) {
                this.c[this.b[i5]] = i5;
            }
            this.d = new avxt(this, new int[]{0});
            new avxt(this, new int[]{1});
            this.h = true;
        }
    }

    public final avxt b() {
        a();
        return this.d;
    }
}
