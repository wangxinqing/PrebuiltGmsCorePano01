package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;

/* renamed from: ejt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ejt implements ejz {
    final /* synthetic */ StartAddAccountSessionWorkflowRequest a;

    public ejt(StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest) {
        this.a = startAddAccountSessionWorkflowRequest;
    }

    public final PendingIntent a(gdn gdn) {
        return gdn.a(this.a);
    }
}
