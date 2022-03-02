package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: eih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eih implements eil {
    final /* synthetic */ Account a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;

    public eih(Account account, String str, Bundle bundle) {
        this.a = account;
        this.b = str;
        this.c = bundle;
    }

    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        biw biw;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            biw = queryLocalInterface instanceof biw ? (biw) queryLocalInterface : new biu(iBinder);
        } else {
            biw = null;
        }
        Bundle a2 = biw.a(this.a, this.b, this.c);
        eim.a((Object) a2);
        return eim.a(a2);
    }
}
