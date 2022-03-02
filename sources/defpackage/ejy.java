package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.auth.firstparty.delegate.AccountRemovalAllowedWorkflowRequest;

/* renamed from: ejy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ejy implements ejz {
    final /* synthetic */ AccountRemovalAllowedWorkflowRequest a;

    public ejy(AccountRemovalAllowedWorkflowRequest accountRemovalAllowedWorkflowRequest) {
        this.a = accountRemovalAllowedWorkflowRequest;
    }

    public final PendingIntent a(gdn gdn) {
        return gdn.a(this.a);
    }
}
