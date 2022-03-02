package defpackage;

import android.net.Uri;
import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: nwb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nwb {
    private static nwb c;
    public final Random a;
    public final Map b = new nz();

    public nwb(Random random) {
        this.a = random;
    }

    public static final String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            if (host == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder(host);
            List<String> pathSegments = parse.getPathSegments();
            for (int i = 0; i < Math.min(pathSegments.size(), 2); i++) {
                sb.append("/");
                sb.append(pathSegments.get(i));
            }
            return sb.toString();
        } catch (Exception e) {
            Log.w("GCM.HTTP", str.length() == 0 ? new String("Error parsing url: ") : "Error parsing url: ".concat(str), e);
            return null;
        }
    }

    public static final boolean b() {
        return axlc.a.a().E() > 0;
    }

    public static synchronized nwb a() {
        nwb nwb;
        synchronized (nwb.class) {
            if (c == null) {
                c = new nwb(nyn.a);
            }
            nwb = c;
        }
        return nwb;
    }
}
