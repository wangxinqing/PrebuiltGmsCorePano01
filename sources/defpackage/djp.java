package defpackage;

import android.content.Context;
import com.android.volley.toolbox.HurlStack;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: djp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class djp extends HurlStack {
    private final avzg a;

    public djp() {
        avze avze = new avze();
        avze.o = true;
        avze.i = aamu.a(60000, (Context) ihs.b());
        this.a = new avzg(avze);
    }

    /* access modifiers changed from: protected */
    public final HttpURLConnection createConnection(URL url) {
        return this.a.a(url);
    }
}
