package defpackage;

import android.os.ParcelUuid;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: ttk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ttk extends ttl {
    public static final ParcelUuid a = new ParcelUuid(UUID.fromString("0000FEA0-0000-1000-8000-00805F9B34FB"));

    public static boolean b(int i) {
        return i >= 0;
    }

    public static boolean e(gti gti) {
        List list = gti.a;
        return list != null && list.contains(a);
    }

    public static String f(gti gti) {
        byte[] h = h(gti);
        if (h == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < 7; i++) {
                sb.append(String.format("%02X", new Object[]{Integer.valueOf(h[i] & 255)}));
                if (i < 6) {
                    sb.append(":");
                }
            }
            return sb.toString();
        } catch (IndexOutOfBoundsException e) {
            anih anih = (anih) tsp.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to parse Chromecast setup mac");
            return null;
        }
    }

    public static int g(gti gti) {
        byte[] h;
        byte[] h2 = h(gti);
        if (h2 == null || (h = h(gti)) == null || h.length <= 0 || h[0] < 2) {
            return -1;
        }
        try {
            return h2[12] & 255;
        } catch (IndexOutOfBoundsException e) {
            anih anih = (anih) tsp.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to parse Chromecast device uptime");
            return -1;
        }
    }

    private static byte[] h(gti gti) {
        Map map;
        if (gti == null || (map = gti.b) == null) {
            return null;
        }
        return (byte[]) map.get(a);
    }

    public final int a() {
        return 101;
    }

    public final byte[] a(gti gti) {
        return gti.e;
    }
}
