package defpackage;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: abdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface abdr extends IInterface {
    void a(ConnectionResult connectionResult, AuthAccountResult authAccountResult);

    void a(Status status);

    void a(Status status, GoogleSignInAccount googleSignInAccount);

    void a(RecordConsentByConsentResultResponse recordConsentByConsentResultResponse);

    void a(SignInResponse signInResponse);

    void b(Status status);
}
