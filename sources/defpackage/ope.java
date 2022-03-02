package defpackage;

import android.content.Context;
import java.net.HttpURLConnection;

/* renamed from: ope  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ope {
    public final opk a;
    public final opd b;

    public ope(Context context, opd opd) {
        this.a = new opk(context);
        iva.a((Object) opd);
        this.b = opd;
    }

    public final void a(HttpURLConnection httpURLConnection, int i) {
        if (httpURLConnection != null) {
            this.a.a(httpURLConnection.getURL().toString(), i);
            httpURLConnection.disconnect();
        }
    }
}
