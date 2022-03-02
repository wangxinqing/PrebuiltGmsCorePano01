package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdh.LatestFootprintFilter;

/* renamed from: saq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class saq extends bhv implements sas {
    public saq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdh.internal.IMobileDataHubListenerService");
    }

    public final void a(ifu ifu, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, sah sah) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) account);
        aQ.writeInt(i);
        aQ.writeInt(i2);
        bhx.a(aQ, (Parcelable) latestFootprintFilter);
        bhx.a(aQ, (IInterface) sah);
        b(1, aQ);
    }

    public final void a(ifu ifu, Account account, int i, int i2, saw saw) {
        throw null;
    }

    public final void a(ifu ifu, Account account, int i, sae sae) {
        throw null;
    }

    public final void a(ifu ifu, Account account, sae sae) {
        throw null;
    }

    public final void b(ifu ifu, Account account, int i, int i2, saw saw) {
        throw null;
    }

    public final void a(ifu ifu, Account account, int i, int i2, sah sah) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) account);
        aQ.writeInt(i);
        aQ.writeInt(i2);
        bhx.a(aQ, (IInterface) sah);
        b(2, aQ);
    }
}
