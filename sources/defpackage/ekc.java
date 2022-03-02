package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.cast.JGCastService;
import com.google.android.gms.auth.account.authenticator.ChromeOsAuthDelegateService;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import java.util.UUID;

/* renamed from: ekc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ekc extends gdm {
    public ekc(Context context) {
        super(context);
    }

    public final PendingIntent a(SetupAccountWorkflowRequest setupAccountWorkflowRequest) {
        if (!"com.google".equals(setupAccountWorkflowRequest.h)) {
            return super.a(setupAccountWorkflowRequest);
        }
        Intent a = ChromeOsAuthDelegateService.a();
        a.addCategory(UUID.randomUUID().toString());
        return PendingIntent.getActivity(this.a, 0, a, JGCastService.FLAG_PRIVATE_DISPLAY);
    }
}
