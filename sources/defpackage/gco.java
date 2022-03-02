package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
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

/* renamed from: gco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gco extends bhv implements gcq {
    public gco(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService");
    }

    public final Bundle a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(16, aQ);
        Bundle bundle = (Bundle) bhx.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final GetAndAdvanceOtpCounterResponse b(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(37, aQ);
        GetAndAdvanceOtpCounterResponse getAndAdvanceOtpCounterResponse = (GetAndAdvanceOtpCounterResponse) bhx.a(a, GetAndAdvanceOtpCounterResponse.CREATOR);
        a.recycle();
        return getAndAdvanceOtpCounterResponse;
    }

    public final String c(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(38, aQ);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void d() {
        b(44, aQ());
    }

    public final CheckFactoryResetPolicyComplianceResponse a(CheckFactoryResetPolicyComplianceRequest checkFactoryResetPolicyComplianceRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) checkFactoryResetPolicyComplianceRequest);
        Parcel a = a(27, aQ);
        CheckFactoryResetPolicyComplianceResponse checkFactoryResetPolicyComplianceResponse = (CheckFactoryResetPolicyComplianceResponse) bhx.a(a, CheckFactoryResetPolicyComplianceResponse.CREATOR);
        a.recycle();
        return checkFactoryResetPolicyComplianceResponse;
    }

    public final void b() {
        b(29, aQ());
    }

    public final void c() {
        b(43, aQ());
    }

    public final boolean d(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(39, aQ);
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final DeviceManagementInfoResponse a(Account account) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) account);
        Parcel a = a(40, aQ);
        DeviceManagementInfoResponse deviceManagementInfoResponse = (DeviceManagementInfoResponse) bhx.a(a, DeviceManagementInfoResponse.CREATOR);
        a.recycle();
        return deviceManagementInfoResponse;
    }

    public final TokenResponse a(AccountSignInRequest accountSignInRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) accountSignInRequest);
        Parcel a = a(9, aQ);
        TokenResponse tokenResponse = (TokenResponse) bhx.a(a, TokenResponse.CREATOR);
        a.recycle();
        return tokenResponse;
    }

    public final TokenResponse a(ConfirmCredentialsRequest confirmCredentialsRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) confirmCredentialsRequest);
        Parcel a = a(10, aQ);
        TokenResponse tokenResponse = (TokenResponse) bhx.a(a, TokenResponse.CREATOR);
        a.recycle();
        return tokenResponse;
    }

    public final TokenResponse a(TokenRequest tokenRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) tokenRequest);
        Parcel a = a(8, aQ);
        TokenResponse tokenResponse = (TokenResponse) bhx.a(a, TokenResponse.CREATOR);
        a.recycle();
        return tokenResponse;
    }

    public final TokenResponse a(UpdateCredentialsRequest updateCredentialsRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) updateCredentialsRequest);
        Parcel a = a(11, aQ);
        TokenResponse tokenResponse = (TokenResponse) bhx.a(a, TokenResponse.CREATOR);
        a.recycle();
        return tokenResponse;
    }

    public final ValidateAccountCredentialsResponse a(AccountCredentials accountCredentials) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) accountCredentials);
        Parcel a = a(36, aQ);
        ValidateAccountCredentialsResponse validateAccountCredentialsResponse = (ValidateAccountCredentialsResponse) bhx.a(a, ValidateAccountCredentialsResponse.CREATOR);
        a.recycle();
        return validateAccountCredentialsResponse;
    }

    public final boolean a(String str, Bundle bundle) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) bundle);
        Parcel a = a(17, aQ);
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }
}
