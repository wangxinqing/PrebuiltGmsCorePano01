package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;

/* renamed from: acjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acjq extends bhv implements acjs {
    public acjq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(9, aQ);
    }

    public final void b(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) exchangeAssertionsForUserCredentialsRequest);
        c(5, aQ);
    }

    public final void c(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) exchangeAssertionsForUserCredentialsRequest);
        c(6, aQ);
    }

    public final void a(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) exchangeAssertionsForUserCredentialsRequest);
        c(4, aQ);
    }

    public final void a(Status status, BootstrapAccount[] bootstrapAccountArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeTypedArray(bootstrapAccountArr, 0);
        c(11, aQ);
    }

    public final void a(Status status, Assertion[] assertionArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeTypedArray(assertionArr, 0);
        c(3, aQ);
    }

    public final void a(Status status, Challenge[] challengeArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeTypedArray(challengeArr, 0);
        c(2, aQ);
    }

    public final void a(Status status, UserBootstrapInfo[] userBootstrapInfoArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeTypedArray(userBootstrapInfoArr, 0);
        c(1, aQ);
    }

    public final void a(Status status, UserCredential[] userCredentialArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeTypedArray(userCredentialArr, 0);
        c(10, aQ);
    }

    public final void a(Status status, UserCredential[] userCredentialArr, String str, String str2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeTypedArray(userCredentialArr, 0);
        aQ.writeString(str);
        aQ.writeString(str2);
        c(7, aQ);
    }
}
