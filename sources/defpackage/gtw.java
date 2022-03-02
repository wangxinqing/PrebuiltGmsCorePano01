package defpackage;

import android.os.ParcelUuid;
import java.util.List;

/* renamed from: gtw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class gtw extends gtt {
    public static final ParcelUuid a = ParcelUuid.fromString("0000FEAA-0000-1000-8000-00805F9B34FB");

    public static boolean e(gti gti) {
        List list = gti.a;
        return list != null && list.contains(a);
    }

    public final Integer b(gti gti) {
        byte[] a2;
        if (!b() || (a2 = gti.a(a)) == null) {
            return null;
        }
        return Integer.valueOf(a2[1] - 41);
    }
}
