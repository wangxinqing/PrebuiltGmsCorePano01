package defpackage;

import android.content.Context;
import android.os.Process;
import com.android.volley.Request;
import java.util.HashMap;

/* renamed from: iiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iiw extends izs {
    protected iiw(String str, HashMap hashMap, audx audx, audx audx2, iix iix) {
        super(1, str, audx.k(), audx2, iix, iix, (String) null, (String) null, false, hashMap, 1025, Process.myUid());
    }

    public static iiw a(Context context, String str, audx audx, audx audx2, iix iix) {
        HashMap hashMap = new HashMap();
        iiv.a(context, hashMap, context.getPackageName());
        return new iiw(str, hashMap, audx, audx2, iix);
    }

    public final String getBodyContentType() {
        return "application/protobuf";
    }

    public final Request.Priority getPriority() {
        return Request.Priority.IMMEDIATE;
    }
}
