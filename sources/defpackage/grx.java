package defpackage;

import android.accounts.Account;
import android.os.Parcel;

/* renamed from: grx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class grx implements grz {
    static final grz a = new grx();

    private grx() {
    }

    public final Object a(gsu gsu) {
        Parcel a2 = gsu.a(1, gsu.aQ());
        Account account = (Account) bhx.a(a2, Account.CREATOR);
        a2.recycle();
        return account;
    }
}
