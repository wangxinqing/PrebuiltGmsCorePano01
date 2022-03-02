package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;

/* renamed from: ejx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ejx implements ejz {
    final /* synthetic */ UpdateCredentialsWorkflowRequest a;

    public ejx(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
        this.a = updateCredentialsWorkflowRequest;
    }

    public final PendingIntent a(gdn gdn) {
        return gdn.b(this.a);
    }
}
