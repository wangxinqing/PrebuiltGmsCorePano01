package defpackage;

import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;

/* renamed from: gbs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface gbs {
    TokenResponse a(AccountSignInRequest accountSignInRequest);

    TokenResponse a(ConfirmCredentialsRequest confirmCredentialsRequest);

    TokenResponse a(UpdateCredentialsRequest updateCredentialsRequest);
}
