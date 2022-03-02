package defpackage;

import com.android.volley.Request;
import com.android.volley.toolbox.HttpClientStack;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ByteArrayEntity;

/* renamed from: iiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iiq extends HttpClientStack {
    private static final HttpEntity a = new ByteArrayEntity(new byte[0]);

    public final HttpResponse performRequest(Request request, Map map) {
        HttpResponse performRequest = super.performRequest(request, map);
        if (performRequest.getEntity() == null && (request instanceof izp)) {
            performRequest.setEntity(a);
            performRequest.setStatusCode(200);
        }
        return performRequest;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public iiq(android.content.Context r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "ApiaryHttpClient/1.0"
            java.lang.String r0 = defpackage.izu.a(r5, r0)
            boolean r1 = defpackage.awjm.b()
            opc r2 = new opc
            r3 = 1
            r2.<init>((android.content.Context) r5, (java.lang.String) r0, (boolean) r3, (boolean) r1)
            fzh r0 = defpackage.iit.a
            java.lang.Object r0 = r0.b()
            iit r0 = (defpackage.iit) r0
            r0.a(r2, r5)
            if (r6 == 0) goto L_0x0022
            java.lang.String r5 = com.android.volley.VolleyLog.TAG
            r2.a((java.lang.String) r5)
        L_0x0022:
            org.apache.http.params.HttpParams r5 = r2.b
            r6 = 30000(0x7530, float:4.2039E-41)
            org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r5, r6)
            org.apache.http.params.HttpConnectionParams.setSoTimeout(r5, r6)
            r0 = 30000(0x7530, double:1.4822E-319)
            org.apache.http.conn.params.ConnManagerParams.setTimeout(r5, r0)
            r4.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iiq.<init>(android.content.Context, boolean):void");
    }
}
