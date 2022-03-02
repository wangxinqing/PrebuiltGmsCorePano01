package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;

/* renamed from: ejv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ejv implements ejz {
    final /* synthetic */ FinishSessionWorkflowRequest a;

    public ejv(FinishSessionWorkflowRequest finishSessionWorkflowRequest) {
        this.a = finishSessionWorkflowRequest;
    }

    public final PendingIntent a(gdn gdn) {
        return gdn.a(this.a);
    }
}
