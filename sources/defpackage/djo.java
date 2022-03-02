package defpackage;

import com.android.volley.toolbox.HurlStack;
import java.net.HttpURLConnection;
import java.net.URL;
import org.chromium.net.CronetEngine;

/* renamed from: djo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class djo extends HurlStack {
    private final CronetEngine a;
    private final int b;

    public djo(CronetEngine cronetEngine, int i) {
        this.a = cronetEngine;
        this.b = i;
    }

    /* access modifiers changed from: protected */
    public final HttpURLConnection createConnection(URL url) {
        bawv bawv = new bawv(url, this.a);
        bawv.a(izj.a(4102));
        bawv.b(this.b);
        return bawv;
    }
}
