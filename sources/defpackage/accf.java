package defpackage;

import com.android.volley.Request;
import com.android.volley.Response;
import java.util.HashMap;

/* renamed from: accf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class accf extends izs {
    public accf(int i, String str, byte[] bArr, Object obj, Response.Listener listener, Response.ErrorListener errorListener, HashMap hashMap, int i2) {
        super(i, str, bArr, obj, listener, errorListener, (String) null, (String) null, false, hashMap, 21248, i2);
    }

    public final String getBodyContentType() {
        return "application/protobuf";
    }

    public final Request.Priority getPriority() {
        return Request.Priority.IMMEDIATE;
    }
}
