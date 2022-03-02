package defpackage;

import android.os.ParcelUuid;
import java.util.Arrays;

/* renamed from: vvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vvy {
    public static final ParcelUuid a = tho.a("FE2C");
    public static final byte[] b;
    private static final int f;
    public final int c;
    public final int d;
    public final int e;

    static {
        byte[] a2 = jjp.a("FC128E");
        b = a2;
        f = a2.length + 2;
    }

    private vvy(int i, int i2, int i3) {
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public static vvy a(int i) {
        return new vvy(0, i, -((byte) ((int) ayni.a.a().b())));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vvy) {
            vvy vvy = (vvy) obj;
            return ius.a(Integer.valueOf(this.c), Integer.valueOf(vvy.c)) && ius.a(Integer.valueOf(this.d), Integer.valueOf(vvy.d)) && ius.a(Integer.valueOf(this.e), Integer.valueOf(vvy.e));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public static vvy a(byte[] bArr) {
        if (bArr == null) {
            jjg jjg = vvj.a;
            return null;
        } else if (bArr.length < f) {
            jjg jjg2 = vvj.a;
            return null;
        } else if (!Arrays.equals(whu.a(bArr, 0, b.length), b)) {
            jjg jjg3 = vvj.a;
            return null;
        } else {
            byte[] a2 = whu.a(bArr, 0, f);
            return new vvy((whu.a(a2, b.length, f)[0] >> 5) & 7, (whu.a(a2, b.length, f)[0] >> 2) & 7, -whu.a(a2, b.length, f)[1]);
        }
    }
}
