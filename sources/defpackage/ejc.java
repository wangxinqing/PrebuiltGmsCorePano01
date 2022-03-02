package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ejc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ejc extends bhv implements eje {
    public ejc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    public final void a(ejb ejb, Account account) {
        throw null;
    }

    public final void a(ejb ejb, String str) {
        throw null;
    }

    public final void a(boolean z) {
        throw null;
    }

    public final boolean a(String str, String str2) {
        throw null;
    }

    public final boolean b() {
        throw null;
    }

    public final void c() {
        b(6, aQ());
    }

    public final void a(String str, erf erf) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        bhx.a(aQ, (IInterface) erf);
        c(7, aQ);
    }
}
