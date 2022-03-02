package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.plus.activity.AccountSignUpChimeraActivity;

/* renamed from: yla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yla extends ykt {
    final /* synthetic */ AccountSignUpChimeraActivity b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yla(AccountSignUpChimeraActivity accountSignUpChimeraActivity) {
        super(accountSignUpChimeraActivity);
        this.b = accountSignUpChimeraActivity;
    }

    public final boolean c() {
        return !this.b.c;
    }

    public final void d() {
        AccountSignUpChimeraActivity accountSignUpChimeraActivity = this.b;
        yli yli = accountSignUpChimeraActivity.i;
        try {
            ((ytn) yli.x()).a(accountSignUpChimeraActivity.a, accountSignUpChimeraActivity.g);
        } catch (RemoteException e) {
            Log.e("AccountSignUpClient", e.getMessage(), e);
        }
        this.b.c = false;
        new qvr().post(new ykz(this));
    }
}
