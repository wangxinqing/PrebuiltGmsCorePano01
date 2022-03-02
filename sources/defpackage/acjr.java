package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;

/* renamed from: acjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class acjr extends bhw implements acjs {
    protected final idg a;

    public final void a(Status status) {
        throw new UnsupportedOperationException();
    }

    public void b(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        throw new UnsupportedOperationException();
    }

    protected acjr(idg idg) {
        super("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsCallbacks");
        this.a = idg;
    }

    public void a(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, BootstrapAccount[] bootstrapAccountArr) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, Assertion[] assertionArr) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, Challenge[] challengeArr) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, UserBootstrapInfo[] userBootstrapInfoArr) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, UserCredential[] userCredentialArr) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, UserCredential[] userCredentialArr, String str, String str2) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a((Status) bhx.a(parcel, Status.CREATOR), (UserBootstrapInfo[]) parcel.createTypedArray(UserBootstrapInfo.CREATOR));
                return true;
            case 2:
                a((Status) bhx.a(parcel, Status.CREATOR), (Challenge[]) parcel.createTypedArray(Challenge.CREATOR));
                return true;
            case 3:
                a((Status) bhx.a(parcel, Status.CREATOR), (Assertion[]) parcel.createTypedArray(Assertion.CREATOR));
                return true;
            case 4:
                a((Status) bhx.a(parcel, Status.CREATOR), (ExchangeAssertionsForUserCredentialsRequest) bhx.a(parcel, ExchangeAssertionsForUserCredentialsRequest.CREATOR));
                return true;
            case 5:
                b((Status) bhx.a(parcel, Status.CREATOR), (ExchangeAssertionsForUserCredentialsRequest) bhx.a(parcel, ExchangeAssertionsForUserCredentialsRequest.CREATOR));
                return true;
            case 6:
                c((Status) bhx.a(parcel, Status.CREATOR), (ExchangeAssertionsForUserCredentialsRequest) bhx.a(parcel, ExchangeAssertionsForUserCredentialsRequest.CREATOR));
                return true;
            case 7:
                a((Status) bhx.a(parcel, Status.CREATOR), (UserCredential[]) parcel.createTypedArray(UserCredential.CREATOR), parcel.readString(), parcel.readString());
                return true;
            case 8:
                Status status = (Status) bhx.a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) bhx.a(parcel, PendingIntent.CREATOR);
                throw new UnsupportedOperationException();
            case 9:
                a((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 10:
                a((Status) bhx.a(parcel, Status.CREATOR), (UserCredential[]) parcel.createTypedArray(UserCredential.CREATOR));
                return true;
            case 11:
                a((Status) bhx.a(parcel, Status.CREATOR), (BootstrapAccount[]) parcel.createTypedArray(BootstrapAccount.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
