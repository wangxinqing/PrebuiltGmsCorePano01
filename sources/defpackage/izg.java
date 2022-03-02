package defpackage;

import com.android.volley.Request;
import com.android.volley.toolbox.HttpClientStack;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ByteArrayEntity;

/* renamed from: izg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class izg extends HttpClientStack {
    private static final HttpEntity a = new ByteArrayEntity(new byte[0]);
    private static final String b;

    static {
        int b2 = jlo.b();
        StringBuilder sb = new StringBuilder(19);
        sb.append("GmsCore/");
        sb.append(b2);
        b = sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public izg(android.content.Context r4, boolean r5) {
        /*
            r3 = this;
            opc r0 = new opc
            java.lang.String r1 = b
            r2 = 1
            r0.<init>(r4, r1, r2)
            r3.<init>(r0)
            if (r5 == 0) goto L_0x0012
            java.lang.String r4 = com.android.volley.VolleyLog.TAG
            r0.a((java.lang.String) r4)
        L_0x0012:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.izg.<init>(android.content.Context, boolean):void");
    }

    public final HttpResponse performRequest(Request request, Map map) {
        HttpResponse performRequest = super.performRequest(request, map);
        if (performRequest.getEntity() == null && (request instanceof izp)) {
            performRequest.setEntity(a);
            performRequest.setStatusCode(200);
        }
        return performRequest;
    }
}
