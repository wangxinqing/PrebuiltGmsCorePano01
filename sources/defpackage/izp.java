package defpackage;

import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonRequest;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.util.HashMap;
import java.util.Map;

/* renamed from: izp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class izp extends JsonRequest implements NetworkCallbacks {
    private final String e;
    private final HashMap f;
    private final int g;
    private final int h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public izp(int r7, java.lang.String r8, java.lang.Object r9, com.android.volley.Response.Listener r10, com.android.volley.Response.ErrorListener r11, java.lang.String r12, java.util.HashMap r13, int r14, int r15) {
        /*
            r6 = this;
            if (r9 == 0) goto L_0x0008
            java.lang.String r9 = r9.toString()
            r3 = r9
            goto L_0x000a
        L_0x0008:
            r9 = 0
            r3 = r9
        L_0x000a:
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.e = r12
            r6.f = r13
            if (r12 == 0) goto L_0x002f
            java.lang.String r7 = "OAuth "
            int r8 = r12.length()
            if (r8 != 0) goto L_0x0026
            java.lang.String r8 = new java.lang.String
            r8.<init>(r7)
            goto L_0x002a
        L_0x0026:
            java.lang.String r8 = r7.concat(r12)
        L_0x002a:
            java.lang.String r7 = "Authorization"
            r13.put(r7, r8)
        L_0x002f:
            java.util.HashMap r7 = r6.f
            java.lang.String r8 = "Accept-Encoding"
            java.lang.String r9 = "gzip"
            r7.put(r8, r9)
            com.android.volley.DefaultRetryPolicy r7 = new com.android.volley.DefaultRetryPolicy
            r8 = 10000(0x2710, float:1.4013E-41)
            r9 = 1
            r10 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r8, r9, r10)
            r6.setRetryPolicy(r7)
            r6.g = r14
            r6.h = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.izp.<init>(int, java.lang.String, java.lang.Object, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener, java.lang.String, java.util.HashMap, int, int):void");
    }

    public final Map getHeaders() {
        return this.f;
    }

    public final void onPostNetworkDispatch() {
        izj.a();
    }

    public final void onPreNetworkDispatch() {
        izj.a(this.g, this.h);
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        return Response.success((Object) null, (Cache.Entry) null);
    }
}
