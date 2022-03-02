package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: gry  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class gry implements grz {
    private final Account a;

    public gry(Account account) {
        this.a = account;
    }

    public final Object a(gsu gsu) {
        Account account = this.a;
        int i = gsa.a;
        Parcel aQ = gsu.aQ();
        bhx.a(aQ, (Parcelable) account);
        gsu.b(2, aQ);
        return null;
    }
}
