package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;

/* renamed from: epf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class epf extends bhv implements eph {
    public epf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void a(eom eom, Account account) {
        throw null;
    }

    public final void a(eom eom, String str) {
        throw null;
    }

    public final void a(eoq eoq, AccountChangeEventsRequest accountChangeEventsRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) eoq);
        bhx.a(aQ, (Parcelable) accountChangeEventsRequest);
        b(4, aQ);
    }

    public final void a(eov eov, GetAccountsRequest getAccountsRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) eov);
        bhx.a(aQ, (Parcelable) getAccountsRequest);
        b(5, aQ);
    }

    public final void a(epe epe, Account account, String str, Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) epe);
        bhx.a(aQ, (Parcelable) account);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) bundle);
        b(1, aQ);
    }

    public final void a(ifu ifu, ClearTokenRequest clearTokenRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) clearTokenRequest);
        b(2, aQ);
    }
}
