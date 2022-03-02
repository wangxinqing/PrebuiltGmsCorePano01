package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: pku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pku {
    public static Status a(String str, int i, String str2) {
        pia pia = phw.a;
        phw.e.e("%s: %d", str, Integer.valueOf(i));
        return new Status(i, str2);
    }

    public static Status a(String str, aepg aepg) {
        int i;
        int i2 = aepg.a;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 1) {
                i = 10;
            } else if (i3 != 2) {
                i = i3 != 3 ? 13 : 31500;
            } else {
                i = 8;
            }
            return a(str, i, aepg.getMessage());
        }
        throw null;
    }

    public static Status a(String str, String str2) {
        return a(str, 13, str2);
    }
}
