package defpackage;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.RetryPolicy;
import java.util.HashMap;

/* renamed from: acce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acce extends accg {
    public acce(Context context, RequestQueue requestQueue, RetryPolicy retryPolicy) {
        super(context, requestQueue, retryPolicy);
    }

    public final Request a(Context context, int i, String str, byte[] bArr, Object obj, accd accd) {
        HashMap hashMap = new HashMap();
        accb.a(context, hashMap, context.getPackageName());
        return new accc(i, str, bArr, obj, accd, accd, hashMap);
    }
}
