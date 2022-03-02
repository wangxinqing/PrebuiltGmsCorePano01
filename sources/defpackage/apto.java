package defpackage;

import android.os.IInterface;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.api.aidlrequests.ApplyActionCodeAidlRequest;
import com.google.firebase.auth.api.aidlrequests.ChangeEmailAidlRequest;
import com.google.firebase.auth.api.aidlrequests.ChangePasswordAidlRequest;
import com.google.firebase.auth.api.aidlrequests.CheckActionCodeAidlRequest;
import com.google.firebase.auth.api.aidlrequests.ConfirmPasswordResetAidlRequest;
import com.google.firebase.auth.api.aidlrequests.CreateUserWithEmailAndPasswordAidlRequest;
import com.google.firebase.auth.api.aidlrequests.DeleteAidlRequest;
import com.google.firebase.auth.api.aidlrequests.FinalizeMfaEnrollmentAidlRequest;
import com.google.firebase.auth.api.aidlrequests.FinalizeMfaSignInAidlRequest;
import com.google.firebase.auth.api.aidlrequests.GetAccessTokenAidlRequest;
import com.google.firebase.auth.api.aidlrequests.GetProvidersForEmailAidlRequest;
import com.google.firebase.auth.api.aidlrequests.LinkEmailAuthCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.LinkFederatedCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.LinkPhoneAuthCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.ReloadAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SendEmailVerificationWithSettingsAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SendGetOobConfirmationCodeEmailAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SendVerificationCodeAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SetFirebaseUiVersionAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInAnonymouslyAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithCustomTokenAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithEmailAndPasswordAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithEmailLinkAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithPhoneNumberAidlRequest;
import com.google.firebase.auth.api.aidlrequests.StartMfaPhoneNumberEnrollmentAidlRequest;
import com.google.firebase.auth.api.aidlrequests.StartMfaPhoneNumberSignInAidlRequest;
import com.google.firebase.auth.api.aidlrequests.UnenrollMfaAidlRequest;
import com.google.firebase.auth.api.aidlrequests.UnlinkEmailCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.UnlinkFederatedCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.UpdateProfileAidlRequest;
import com.google.firebase.auth.api.aidlrequests.VerifyBeforeUpdateEmailAidlRequest;
import com.google.firebase.auth.api.model.SendVerificationCodeRequest;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* renamed from: apto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface apto extends IInterface {
    @Deprecated
    void a(aptm aptm);

    @Deprecated
    void a(EmailAuthCredential emailAuthCredential, aptm aptm);

    @Deprecated
    void a(PhoneAuthCredential phoneAuthCredential, aptm aptm);

    void a(ApplyActionCodeAidlRequest applyActionCodeAidlRequest, aptm aptm);

    void a(ChangeEmailAidlRequest changeEmailAidlRequest, aptm aptm);

    void a(ChangePasswordAidlRequest changePasswordAidlRequest, aptm aptm);

    void a(CheckActionCodeAidlRequest checkActionCodeAidlRequest, aptm aptm);

    void a(ConfirmPasswordResetAidlRequest confirmPasswordResetAidlRequest, aptm aptm);

    void a(CreateUserWithEmailAndPasswordAidlRequest createUserWithEmailAndPasswordAidlRequest, aptm aptm);

    void a(DeleteAidlRequest deleteAidlRequest, aptm aptm);

    void a(FinalizeMfaEnrollmentAidlRequest finalizeMfaEnrollmentAidlRequest, aptm aptm);

    void a(FinalizeMfaSignInAidlRequest finalizeMfaSignInAidlRequest, aptm aptm);

    void a(GetAccessTokenAidlRequest getAccessTokenAidlRequest, aptm aptm);

    void a(GetProvidersForEmailAidlRequest getProvidersForEmailAidlRequest, aptm aptm);

    void a(LinkEmailAuthCredentialAidlRequest linkEmailAuthCredentialAidlRequest, aptm aptm);

    void a(LinkFederatedCredentialAidlRequest linkFederatedCredentialAidlRequest, aptm aptm);

    void a(LinkPhoneAuthCredentialAidlRequest linkPhoneAuthCredentialAidlRequest, aptm aptm);

    void a(ReloadAidlRequest reloadAidlRequest, aptm aptm);

    void a(SendEmailVerificationWithSettingsAidlRequest sendEmailVerificationWithSettingsAidlRequest, aptm aptm);

    void a(SendGetOobConfirmationCodeEmailAidlRequest sendGetOobConfirmationCodeEmailAidlRequest, aptm aptm);

    void a(SendVerificationCodeAidlRequest sendVerificationCodeAidlRequest, aptm aptm);

    void a(SetFirebaseUiVersionAidlRequest setFirebaseUiVersionAidlRequest, aptm aptm);

    void a(SignInAnonymouslyAidlRequest signInAnonymouslyAidlRequest, aptm aptm);

    void a(SignInWithCredentialAidlRequest signInWithCredentialAidlRequest, aptm aptm);

    void a(SignInWithCustomTokenAidlRequest signInWithCustomTokenAidlRequest, aptm aptm);

    void a(SignInWithEmailAndPasswordAidlRequest signInWithEmailAndPasswordAidlRequest, aptm aptm);

    void a(SignInWithEmailLinkAidlRequest signInWithEmailLinkAidlRequest, aptm aptm);

    void a(SignInWithPhoneNumberAidlRequest signInWithPhoneNumberAidlRequest, aptm aptm);

    void a(StartMfaPhoneNumberEnrollmentAidlRequest startMfaPhoneNumberEnrollmentAidlRequest, aptm aptm);

    void a(StartMfaPhoneNumberSignInAidlRequest startMfaPhoneNumberSignInAidlRequest, aptm aptm);

    void a(UnenrollMfaAidlRequest unenrollMfaAidlRequest, aptm aptm);

    void a(UnlinkEmailCredentialAidlRequest unlinkEmailCredentialAidlRequest, aptm aptm);

    void a(UnlinkFederatedCredentialAidlRequest unlinkFederatedCredentialAidlRequest, aptm aptm);

    void a(UpdateProfileAidlRequest updateProfileAidlRequest, aptm aptm);

    void a(VerifyBeforeUpdateEmailAidlRequest verifyBeforeUpdateEmailAidlRequest, aptm aptm);

    @Deprecated
    void a(SendVerificationCodeRequest sendVerificationCodeRequest, aptm aptm);

    @Deprecated
    void a(VerifyAssertionRequest verifyAssertionRequest, aptm aptm);

    @Deprecated
    void a(String str, aptm aptm);

    @Deprecated
    void a(String str, ActionCodeSettings actionCodeSettings, aptm aptm);

    @Deprecated
    void a(String str, PhoneAuthCredential phoneAuthCredential, aptm aptm);

    @Deprecated
    void a(String str, UserProfileChangeRequest userProfileChangeRequest, aptm aptm);

    @Deprecated
    void a(String str, VerifyAssertionRequest verifyAssertionRequest, aptm aptm);

    @Deprecated
    void a(String str, String str2, aptm aptm);

    @Deprecated
    void a(String str, String str2, String str3, aptm aptm);

    @Deprecated
    void b(String str, aptm aptm);

    @Deprecated
    void b(String str, ActionCodeSettings actionCodeSettings, aptm aptm);

    @Deprecated
    void b(String str, String str2, aptm aptm);

    @Deprecated
    void c(String str, aptm aptm);

    @Deprecated
    void c(String str, ActionCodeSettings actionCodeSettings, aptm aptm);

    @Deprecated
    void c(String str, String str2, aptm aptm);

    void d(String str, aptm aptm);

    @Deprecated
    void d(String str, String str2, aptm aptm);

    @Deprecated
    void e(String str, aptm aptm);

    @Deprecated
    void e(String str, String str2, aptm aptm);

    @Deprecated
    void f(String str, aptm aptm);

    @Deprecated
    void f(String str, String str2, aptm aptm);

    @Deprecated
    void g(String str, aptm aptm);

    @Deprecated
    void h(String str, aptm aptm);

    @Deprecated
    void i(String str, aptm aptm);

    void j(String str, aptm aptm);

    @Deprecated
    void k(String str, aptm aptm);
}
