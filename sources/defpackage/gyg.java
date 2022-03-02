package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: gyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gyg extends bhv implements gyi {
    public gyg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.checkin.internal.ICheckinApiService");
    }

    public final void a(gyf gyf) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) gyf);
        b(5, aQ);
    }

    public final void a(ifu ifu, Account account) {
        throw null;
    }

    public final void b(ifu ifu) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        b(4, aQ);
    }

    public final void b(ifu ifu, Bundle bundle) {
        throw null;
    }

    public final void a(ifu ifu) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        b(3, aQ);
    }

    public final void a(ifu ifu, Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) bundle);
        b(1, aQ);
    }
}
