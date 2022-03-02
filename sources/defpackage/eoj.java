package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;

/* renamed from: eoj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eoj extends bhv implements eol {
    public eoj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IAccountDataService");
    }

    public final void a(eon eon, ClearTokenRequest clearTokenRequest) {
        throw null;
    }

    public final void a(eoq eoq, AccountChangeEventsRequest accountChangeEventsRequest) {
        throw null;
    }

    public final void a(eor eor, String str) {
        throw null;
    }

    public final void a(eos eos, Account account) {
        throw null;
    }

    public final void a(eoz eoz, Account account) {
        throw null;
    }

    public final void a(epa epa, TokenRequest tokenRequest) {
        throw null;
    }

    public final void a(epb epb, String str) {
        throw null;
    }

    public final void a(eoy eoy, Account account) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) eoy);
        bhx.a(aQ, (Parcelable) account);
        b(6, aQ);
    }

    public final void a(ifu ifu, Account account, boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) account);
        bhx.a(aQ, false);
        b(1, aQ);
    }
}
