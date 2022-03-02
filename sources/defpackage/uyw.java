package defpackage;

import android.os.ParcelUuid;
import com.google.android.gms.beacon.BleFilter;
import java.util.List;

/* renamed from: uyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uyw {
    public static final BleFilter a;
    private static final ParcelUuid b = ParcelUuid.fromString("0000FEF3-0000-1000-8000-00805F9B34FB");

    static {
        gtf gtf = new gtf();
        gtf.a(b);
        a = gtf.a();
    }

    public static tgh a(gti gti) {
        List list = gti.a;
        tgh tgh = null;
        if (list == null || !list.contains(b)) {
            return null;
        }
        byte[] a2 = gti.a(b);
        if (a2 != null) {
            return new tgh(a2);
        }
        String str = gti.d;
        if (str == null) {
            return null;
        }
        try {
            tgh a3 = tgh.a(str);
            try {
                byte[] bArr = a3.a;
                if (bArr == null || bArr.length == 0) {
                    return null;
                }
                return a3;
            } catch (IllegalArgumentException e) {
                tgh = a3;
                ((anih) ((anih) tgc.a.c()).a("uyw", "a", 42, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No token in either service data or device name: %s", (Object) gti.d);
                return tgh;
            }
        } catch (IllegalArgumentException e2) {
            ((anih) ((anih) tgc.a.c()).a("uyw", "a", 42, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No token in either service data or device name: %s", (Object) gti.d);
            return tgh;
        }
    }
}
