package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;

/* renamed from: abzq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abzq implements Runnable {
    final /* synthetic */ abzs a;
    final /* synthetic */ IBinder b;

    public abzq(abzs abzs, IBinder iBinder) {
        this.a = abzs;
        this.b = iBinder;
    }

    public final void run() {
        acjv acjv;
        abzs abzs = this.a;
        IBinder iBinder = this.b;
        acwd acwd = abzs.f;
        if (acwd != null) {
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsService");
                acjv = queryLocalInterface instanceof acjv ? (acjv) queryLocalInterface : new acjt(iBinder);
            } else {
                acjv = null;
            }
            if (acjv == null) {
                abzs.a.d("AccountsService is null", new Object[0]);
                acwd.b((Exception) new ibr(new Status(13)));
                return;
            }
            abzs.e = acjv;
            acwd.b((Object) null);
        }
    }
}
