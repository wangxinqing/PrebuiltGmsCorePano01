package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Map;
import java.util.Set;

/* renamed from: iuy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iuy implements iss {
    private final Context a;
    private final int b;
    private final ixm c;
    private final Set d;
    private final Map e;

    public iuy(Context context, int i, Set set, Map map) {
        ixm ixm = ixm.b;
        this.a = context;
        this.b = i;
        this.d = set;
        this.e = map;
        this.c = ixm;
    }

    public final ConnectionResult a(GetServiceRequest getServiceRequest, ConnectionInfo connectionInfo) {
        if (!"com.google.android.gms".equals(getServiceRequest.d)) {
            Set a2 = this.c.a(this.d);
            if (!a2.isEmpty()) {
                int i = this.b;
                String valueOf = String.valueOf(a2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
                sb.append("API ");
                sb.append(i);
                sb.append(" requires missing permission groups: ");
                sb.append(valueOf);
                Log.w("PermCheckPreProcessor", sb.toString());
                return new ConnectionResult(19, this.c.a(this.a.getApplicationContext(), this.d, this.e));
            }
        }
        return ConnectionResult.a;
    }
}
