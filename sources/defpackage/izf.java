package defpackage;

import android.content.Context;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: izf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class izf {
    public static final izf a = new izf(ihs.b());
    private final hph b;

    private izf(Context context) {
        hol hol = new hol(context, "GMSCORE_BACKEND_COUNTERS", (String) null);
        hol.a(avsd.UNMETERED_OR_DAILY);
        hph hph = new hph(hol, hol.g, 100);
        this.b = hph;
        hph.a();
        this.b.a((ScheduledExecutorService) jfm.a(1, 10), 3600000);
    }

    private static final String a(String str) {
        if (str != null) {
            try {
                URL url = new URL(str.toLowerCase(Locale.US));
                String host = url.getHost();
                if (!"www.googleapis.com".equals(host)) {
                    return host;
                }
                String path = url.getPath();
                int indexOf = path.indexOf(47, 1);
                if (indexOf != -1) {
                    return path.substring(1, indexOf);
                }
                return null;
            } catch (MalformedURLException e) {
            }
        }
        return null;
    }

    public final void a() {
        if (awzl.b() && awzl.a.a().b()) {
            this.b.d();
        }
    }

    public final void a(baaj baaj, babj babj) {
        String str;
        if (awzl.b()) {
            if (baaj != null) {
                String str2 = baaj.b;
                String valueOf = String.valueOf(str2.substring(str2.lastIndexOf(46) + 1));
                str = valueOf.length() == 0 ? new String("GRPC-") : "GRPC-".concat(valueOf);
            } else {
                str = "GRPC";
            }
            this.b.d(str).a(babj.r.r);
        }
    }

    public final void a(String str, int i) {
        if (awzl.b()) {
            String a2 = a(str);
            this.b.d(a2 != null ? a2.length() == 0 ? new String("Apiary-") : "Apiary-".concat(a2) : "Apiary").a(i);
        }
    }
}
