package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: adtb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adtb extends adso {
    public final void c(Status status) {
        if (!status.c()) {
            String valueOf = String.valueOf(status);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("disconnect(): Could not unregister listener: status=");
            sb.append(valueOf);
            Log.e("UsageReportingClientImp", sb.toString());
        }
    }
}
