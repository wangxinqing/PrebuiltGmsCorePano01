package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.accounts.api.AccountData;

/* renamed from: pyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pyo extends bhv implements IInterface {
    public pyo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.identity.accounts.service.IAccountDataCallbacks");
    }

    public final void a(AccountData accountData) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) accountData);
        b(2, aQ);
    }

    public final void a(byte[] bArr) {
        Parcel aQ = aQ();
        aQ.writeByteArray(bArr);
        b(1, aQ);
    }
}
