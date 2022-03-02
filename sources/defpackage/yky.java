package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.plus.activity.AccountSignUpChimeraActivity;

/* renamed from: yky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yky extends ykt implements jje {
    final /* synthetic */ AccountSignUpChimeraActivity b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yky(AccountSignUpChimeraActivity accountSignUpChimeraActivity) {
        super(accountSignUpChimeraActivity);
        this.b = accountSignUpChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        AccountSignUpChimeraActivity accountSignUpChimeraActivity = this.b;
        accountSignUpChimeraActivity.a = (String) obj;
        accountSignUpChimeraActivity.a();
        return null;
    }

    public final boolean c() {
        return !"<<default account>>".equals(this.b.a);
    }

    public final void d() {
        AccountSignUpChimeraActivity accountSignUpChimeraActivity = this.b;
        yli yli = accountSignUpChimeraActivity.i;
        try {
            ((ytn) yli.x()).d(new ylf(yli, this), accountSignUpChimeraActivity.g);
        } catch (RemoteException e) {
            Log.e("AccountSignUpClient", e.getMessage(), e);
        }
    }
}
