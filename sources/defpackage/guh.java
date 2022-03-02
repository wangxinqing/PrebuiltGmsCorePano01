package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: guh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class guh extends ift {
    public final void a(Status status) {
        if (!status.c()) {
            String valueOf = String.valueOf(status);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("Failed to cancel dangling listener. Status: ");
            sb.append(valueOf);
            Log.e("BleClientImpl", sb.toString());
        }
    }
}
