package defpackage;

import android.os.Process;
import com.android.volley.Request;
import com.android.volley.Response;
import java.util.HashMap;

/* renamed from: accc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class accc extends izs {
    public accc(int i, String str, byte[] bArr, Object obj, Response.Listener listener, Response.ErrorListener errorListener, HashMap hashMap) {
        super(i, str, bArr, obj, listener, errorListener, (String) null, (String) null, false, hashMap, 21248, Process.myUid());
    }

    public final String getBodyContentType() {
        return "application/octet-stream";
    }

    public final Request.Priority getPriority() {
        return Request.Priority.IMMEDIATE;
    }
}
