package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.auth.firstparty.delegate.ConfirmCredentialsWorkflowRequest;

/* renamed from: ejr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ejr implements ejz {
    final /* synthetic */ ConfirmCredentialsWorkflowRequest a;

    public ejr(ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest) {
        this.a = confirmCredentialsWorkflowRequest;
    }

    public final PendingIntent a(gdn gdn) {
        return gdn.a(this.a);
    }
}
