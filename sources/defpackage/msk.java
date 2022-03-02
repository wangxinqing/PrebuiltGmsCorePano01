package defpackage;

import android.accounts.Account;
import com.google.android.chimera.Activity;

/* renamed from: msk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class msk implements afht {
    public Account a;
    public msl b;

    public msk(Account account, msl msl) {
        this.a = account;
        this.b = msl;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void a(afhu afhu) {
        ((anih) ((anih) mte.a.d()).a("msk", "a", 359, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FootprintsListener: onUpdate");
        msl msl = this.b;
        if (msl == null || !msl.b().equals(this.a)) {
            ((anih) ((anih) mte.a.d()).a("msk", "a", 362, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FootprintsListener: Do not update, null fragment or account not match");
        } else if (msl.getActivity() != null) {
            ((anih) ((anih) mte.a.d()).a("msk", "a", 366, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FootprintsListener: Call updateAccountSelection");
            Activity activity = msl.getActivity();
            msl.getClass();
            activity.runOnUiThread(new msj(msl));
        }
    }
}
