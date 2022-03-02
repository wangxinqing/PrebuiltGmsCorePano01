package defpackage;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: aaut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaut implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ aauu b;

    public aaut(aauu aauu, List list) {
        this.b = aauu;
        this.a = list;
    }

    public final void run() {
        if (this.b.a.compareAndSet(true, false)) {
            try {
                aarq aarq = this.b.b;
                List<String> list = this.a;
                StringBuilder sb = new StringBuilder();
                for (String bytes : list) {
                    sb.append(Base64.encodeToString(bytes.getBytes(Charset.forName("UTF-8")), 0));
                    sb.append(";");
                }
                aarq.a("snet_safe_browsing_cookies", sb.toString());
            } finally {
                this.b.a.set(true);
            }
        }
    }
}
