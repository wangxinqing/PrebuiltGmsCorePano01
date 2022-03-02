package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;

/* renamed from: eik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eik implements eil {
    final /* synthetic */ String a;
    final /* synthetic */ String[] b;

    public eik(String str, String[] strArr) {
        this.a = str;
        this.b = strArr;
    }

    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        biw biw;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            biw = queryLocalInterface instanceof biw ? (biw) queryLocalInterface : new biu(iBinder);
        } else {
            biw = null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("accountType", this.a);
        bundle.putStringArray("account_features", this.b);
        Bundle a2 = biw.a(bundle);
        eim.a((Object) a2);
        Parcelable[] parcelableArray = a2.getParcelableArray("accounts");
        Account[] accountArr = new Account[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            accountArr[i] = (Account) parcelableArray[i];
        }
        return accountArr;
    }
}
