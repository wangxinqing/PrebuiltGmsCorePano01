package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;

/* renamed from: acjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acjt extends bhv implements acjv {
    public acjt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsService");
    }

    public final void a() {
        throw null;
    }

    public final void a(acjs acjs, boolean z) {
        throw null;
    }

    public final void a(acjs acjs, Challenge[] challengeArr, boolean z) {
        throw null;
    }

    public final void b(acjs acjs, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) acjs);
        bhx.a(aQ, (Parcelable) exchangeAssertionsForUserCredentialsRequest);
        c(6, aQ);
    }

    public final void c(acjs acjs, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) acjs);
        bhx.a(aQ, (Parcelable) exchangeAssertionsForUserCredentialsRequest);
        c(7, aQ);
    }

    public final void a(acjs acjs) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) acjs);
        c(12, aQ);
    }

    public final void a(acjs acjs, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) acjs);
        bhx.a(aQ, (Parcelable) exchangeAssertionsForUserCredentialsRequest);
        c(5, aQ);
    }

    public final void a(acjs acjs, ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) acjs);
        bhx.a(aQ, (Parcelable) exchangeSessionCheckpointsForUserCredentialsRequest);
        c(10, aQ);
    }

    public final void a(acjs acjs, Account[] accountArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) acjs);
        aQ.writeTypedArray(accountArr, 0);
        c(1, aQ);
    }

    public final void a(acjs acjs, Assertion[] assertionArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) acjs);
        aQ.writeTypedArray(assertionArr, 0);
        c(4, aQ);
    }

    public final void a(acjs acjs, Challenge[] challengeArr, boolean z, boolean z2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) acjs);
        aQ.writeTypedArray(challengeArr, 0);
        bhx.a(aQ, z);
        bhx.a(aQ, z2);
        c(11, aQ);
    }

    public final void a(acjs acjs, UserBootstrapInfo[] userBootstrapInfoArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) acjs);
        aQ.writeTypedArray(userBootstrapInfoArr, 0);
        c(2, aQ);
    }
}
