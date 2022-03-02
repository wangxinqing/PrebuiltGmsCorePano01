package defpackage;

import android.content.Context;
import com.android.volley.RequestQueue;

/* renamed from: gjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gjo {
    private final Context a;
    private final RequestQueue b;

    public gjo(Context context, RequestQueue requestQueue) {
        iva.a((Object) context);
        this.a = context;
        iva.a((Object) requestQueue);
        this.b = requestQueue;
    }

    public final aorr a(String str, String str2, audx audx, audx audx2) {
        if ("get".equalsIgnoreCase(str) || "post".equalsIgnoreCase(str)) {
            iva.c(str2);
            iva.a((Object) audx);
            iva.a((Object) audx2);
            iix iix = new iix();
            this.b.add(iiw.a(this.a, str2, audx, audx2, iix));
            return iix;
        }
        throw new IllegalArgumentException(str.length() == 0 ? new String("Unsupported method: ") : "Unsupported method: ".concat(str));
    }
}
