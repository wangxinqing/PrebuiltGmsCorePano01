package defpackage;

import android.content.Context;
import android.os.Process;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.RetryPolicy;
import java.util.HashMap;

/* renamed from: accg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class accg implements acca {
    private final Context a;
    private final RequestQueue b;
    private final RetryPolicy c;
    private boolean d = false;

    public accg(Context context, RequestQueue requestQueue, RetryPolicy retryPolicy) {
        iva.a((Object) context);
        this.a = context;
        iva.a((Object) requestQueue);
        this.b = requestQueue;
        iva.a((Object) retryPolicy);
        this.c = retryPolicy;
        this.d = true;
    }

    public final aorr a(String str, String str2, byte[] bArr, Object obj) {
        int i;
        if ("get".equalsIgnoreCase(str)) {
            i = 0;
        } else if (!"post".equalsIgnoreCase(str)) {
            throw new IllegalArgumentException(str.length() == 0 ? new String("Unsupported method: ") : "Unsupported method: ".concat(str));
        } else {
            i = 1;
        }
        iva.c(str2);
        iva.a((Object) bArr);
        iva.a(obj);
        accd accd = new accd();
        Request a2 = a(this.a, i, str2, bArr, obj, accd);
        a2.setRetryPolicy(this.c);
        a2.setShouldRetryServerErrors(this.d);
        this.b.add(a2);
        return accd;
    }

    /* access modifiers changed from: protected */
    public Request a(Context context, int i, String str, byte[] bArr, Object obj, accd accd) {
        HashMap hashMap = new HashMap();
        accb.a(context, hashMap, context.getPackageName());
        return new accf(i, str, bArr, obj, accd, accd, hashMap, Process.myUid());
    }
}
