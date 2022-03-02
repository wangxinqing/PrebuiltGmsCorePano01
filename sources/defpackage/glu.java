package defpackage;

import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.auth.uiflows.addaccount.DmSetScreenlockChimeraActivity;
import com.google.android.gms.common.api.Status;

/* renamed from: glu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class glu implements acvv {
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Status status = ((KeyRegistrationResult) obj).b;
        int i = status.i;
        if (i == -25501 || i == -25502) {
            DmSetScreenlockChimeraActivity.a.c("Successfully synced data to Cryptauth server", new Object[0]);
            return;
        }
        DmSetScreenlockChimeraActivity.a.d("Failed to sync data to Cryptauth server. StatusCode=[%s]", status.d());
    }
}
