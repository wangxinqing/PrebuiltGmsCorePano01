package defpackage;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: iul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iul implements iss {
    private final Context a;

    public iul(Context context) {
        this.a = context;
    }

    public final ConnectionResult a(GetServiceRequest getServiceRequest, ConnectionInfo connectionInfo) {
        if (jni.b(this.a).c(getServiceRequest.d, getServiceRequest.b)) {
            return ConnectionResult.a;
        }
        int i = getServiceRequest.b;
        StringBuilder sb = new StringBuilder(46);
        sb.append("API not available for instant app: ");
        sb.append(i);
        sb.toString();
        return new ConnectionResult(16);
    }
}
