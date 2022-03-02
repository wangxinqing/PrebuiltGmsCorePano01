package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;

/* renamed from: ejs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ejs implements ejz {
    final /* synthetic */ SetupAccountWorkflowRequest a;

    public ejs(SetupAccountWorkflowRequest setupAccountWorkflowRequest) {
        this.a = setupAccountWorkflowRequest;
    }

    public final PendingIntent a(gdn gdn) {
        return gdn.a(this.a);
    }
}
