package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse;
import com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse;
import com.google.android.gms.auth.firstparty.dataservice.GetAndAdvanceOtpCounterResponse;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ValidateAccountCredentialsResponse;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;

/* renamed from: gcq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface gcq extends IInterface {
    Bundle a(String str);

    CheckFactoryResetPolicyComplianceResponse a(CheckFactoryResetPolicyComplianceRequest checkFactoryResetPolicyComplianceRequest);

    DeviceManagementInfoResponse a(Account account);

    TokenResponse a(AccountSignInRequest accountSignInRequest);

    TokenResponse a(ConfirmCredentialsRequest confirmCredentialsRequest);

    TokenResponse a(TokenRequest tokenRequest);

    TokenResponse a(UpdateCredentialsRequest updateCredentialsRequest);

    ValidateAccountCredentialsResponse a(AccountCredentials accountCredentials);

    boolean a(String str, Bundle bundle);

    GetAndAdvanceOtpCounterResponse b(String str);

    void b();

    String c(String str);

    void c();

    void d();

    boolean d(String str);
}
