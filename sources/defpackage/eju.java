package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;

/* renamed from: eju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eju implements ejz {
    final /* synthetic */ UpdateCredentialsWorkflowRequest a;

    public eju(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
        this.a = updateCredentialsWorkflowRequest;
    }

    public final PendingIntent a(gdn gdn) {
        return gdn.a(this.a);
    }
}
