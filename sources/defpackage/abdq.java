package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: abdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class abdq extends bhw implements abdr {
    public abdq() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public void a(ConnectionResult connectionResult, AuthAccountResult authAccountResult) {
    }

    public void a(Status status) {
    }

    public void a(Status status, GoogleSignInAccount googleSignInAccount) {
    }

    public void a(RecordConsentByConsentResultResponse recordConsentByConsentResultResponse) {
    }

    public void a(SignInResponse signInResponse) {
    }

    public void b(Status status) {
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                a((ConnectionResult) bhx.a(parcel, ConnectionResult.CREATOR), (AuthAccountResult) bhx.a(parcel, AuthAccountResult.CREATOR));
                break;
            case 4:
                a((Status) bhx.a(parcel, Status.CREATOR));
                break;
            case 6:
                b((Status) bhx.a(parcel, Status.CREATOR));
                break;
            case 7:
                a((Status) bhx.a(parcel, Status.CREATOR), (GoogleSignInAccount) bhx.a(parcel, GoogleSignInAccount.CREATOR));
                break;
            case 8:
                a((SignInResponse) bhx.a(parcel, SignInResponse.CREATOR));
                break;
            case 9:
                a((RecordConsentByConsentResultResponse) bhx.a(parcel, RecordConsentByConsentResultResponse.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
