package defpackage;

import com.google.android.gms.auth.api.credentials.credentialsaving.ui.PasswordSavingChimeraActivity;
import com.google.android.gms.common.api.Status;

/* renamed from: fdv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fdv implements ax {
    private final PasswordSavingChimeraActivity a;

    public fdv(PasswordSavingChimeraActivity passwordSavingChimeraActivity) {
        this.a = passwordSavingChimeraActivity;
    }

    public final void a(Object obj) {
        int i;
        PasswordSavingChimeraActivity passwordSavingChimeraActivity = this.a;
        Status status = (Status) obj;
        if (!status.equals(Status.a)) {
            i = 0;
        } else {
            i = -1;
        }
        passwordSavingChimeraActivity.a(status, i);
    }
}
