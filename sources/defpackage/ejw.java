package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;

/* renamed from: ejw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ejw implements ejz {
    final /* synthetic */ TokenWorkflowRequest a;

    public ejw(TokenWorkflowRequest tokenWorkflowRequest) {
        this.a = tokenWorkflowRequest;
    }

    public final PendingIntent a(gdn gdn) {
        return gdn.a(this.a);
    }
}
