package defpackage;

import android.accounts.Account;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: gsp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class gsp implements igp {
    private final Account a;

    public gsp(Account account) {
        this.a = account;
    }

    public final void a(Object obj, Object obj2) {
        Account account = this.a;
        gta gta = new gta((acwd) obj2);
        gtb gtb = (gtb) ((gsz) obj).x();
        Parcel aQ = gtb.aQ();
        bhx.a(aQ, (IInterface) gta);
        bhx.a(aQ, (Parcelable) account);
        gtb.b(3, aQ);
    }
}
