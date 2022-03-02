package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: lhf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lhf implements lic {
    final /* synthetic */ lhi a;

    public lhf(lhi lhi) {
        this.a = lhi;
    }

    public final lib a(URL url) {
        lhh lhh;
        synchronized (this.a) {
            if (this.a.c()) {
                try {
                    lhi lhi = this.a;
                    lhh = new lhh(lhi, lhi.b, (HttpURLConnection) jlk.a(url, 2818));
                } catch (Exception e) {
                    izj.a();
                    throw e;
                }
            } else {
                throw new lhp("No network matching permissions is available.");
            }
        }
        return lhh;
    }
}
