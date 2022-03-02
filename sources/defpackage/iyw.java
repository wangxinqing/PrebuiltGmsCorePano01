package defpackage;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonRequest;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.util.HashMap;
import java.util.Map;

/* renamed from: iyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class iyw extends JsonRequest implements NetworkCallbacks {
    public final HashMap e;
    private final int f;
    private final int g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected iyw(int r9, java.lang.String r10, java.lang.String r11, com.android.volley.Response.Listener r12, com.android.volley.Response.ErrorListener r13, java.lang.String r14, java.lang.String r15, boolean r16, java.util.HashMap r17, int r18, int r19) {
        /*
            r8 = this;
            r6 = r8
            r7 = r17
            if (r11 == 0) goto L_0x000b
            java.lang.String r0 = r11.toString()
            r3 = r0
            goto L_0x000d
        L_0x000b:
            r0 = 0
            r3 = r0
        L_0x000d:
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r6.e = r7
            r0 = r14
            r1 = r15
            defpackage.iyt.a(r7, r14, r15)
            java.util.HashMap r0 = r6.e
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r2 = "gzip"
            r0.put(r1, r2)
            r0 = r16
            r8.setShouldCache(r0)
            r0 = r18
            r6.f = r0
            r0 = r19
            r6.g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iyw.<init>(int, java.lang.String, java.lang.String, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener, java.lang.String, java.lang.String, boolean, java.util.HashMap, int, int):void");
    }

    public final void deliverResponse(Object obj) {
        super.deliverResponse(obj);
    }

    public final Map getHeaders() {
        return this.e;
    }

    public final void onPostNetworkDispatch() {
        izj.a();
    }

    public final void onPreNetworkDispatch() {
        izj.a(this.f, this.g);
    }

    /* access modifiers changed from: protected */
    public abstract Response parseNetworkResponse(NetworkResponse networkResponse);
}
