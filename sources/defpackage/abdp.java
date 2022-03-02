package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: abdp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abdp extends bhv implements abdr {
    public abdp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public final void a(ConnectionResult connectionResult, AuthAccountResult authAccountResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) connectionResult);
        bhx.a(aQ, (Parcelable) authAccountResult);
        b(3, aQ);
    }

    public final void b(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        b(6, aQ);
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        b(4, aQ);
    }

    public final void a(Status status, GoogleSignInAccount googleSignInAccount) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) googleSignInAccount);
        b(7, aQ);
    }

    public final void a(RecordConsentByConsentResultResponse recordConsentByConsentResultResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) recordConsentByConsentResultResponse);
        b(9, aQ);
    }

    public final void a(SignInResponse signInResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) signInResponse);
        b(8, aQ);
    }
}
