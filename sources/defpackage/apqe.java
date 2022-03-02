package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneMultiFactorInfo;
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

/* renamed from: apqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apqe extends aptn implements jbh {
    private final String a;
    private final String b;
    private final aptp c;
    private final jaz d;
    private final jbf e;
    private final iwd f = new iwd("FirebaseAuth", new String[0]);

    public apqe(String str, String str2, aptp aptp, jaz jaz, jbf jbf) {
        iva.c(str);
        this.a = str;
        iva.c(str2);
        this.b = str2;
        iva.a((Object) aptp);
        this.c = aptp;
        iva.a((Object) jaz);
        this.d = jaz;
        iva.a((Object) jbf);
        this.e = jbf;
    }

    private final void b(aptm aptm) {
        try {
            aptm.a(new Status(17080));
        } catch (RemoteException e2) {
            this.f.e("RemoteException when sending failure result.", e2, new Object[0]);
        }
    }

    @Deprecated
    public final void c(String str, aptm aptm) {
        if (axhw.b()) {
            a(new GetProvidersForEmailAidlRequest(str, (String) null), aptm);
            return;
        }
        iva.c(str);
        this.e.a(this.d, new apqr(this.a, this.b, this.c, str, (String) null, aptm));
    }

    public final void d(String str, aptm aptm) {
        a(str, (ActionCodeSettings) null, aptm);
    }

    @Deprecated
    public final void e(String str, aptm aptm) {
        if (axhw.b()) {
            a(new CheckActionCodeAidlRequest(str, (String) null), aptm);
            return;
        }
        iva.c(str);
        this.e.a(this.d, new apqk(this.a, this.b, this.c, str, (String) null, aptm));
    }

    @Deprecated
    public final void f(String str, aptm aptm) {
        if (axhw.b()) {
            a(new ApplyActionCodeAidlRequest(str, (String) null), aptm);
            return;
        }
        iva.c(str);
        this.e.a(this.d, new apqh(this.a, this.b, this.c, str, (String) null, aptm));
    }

    @Deprecated
    public final void g(String str, aptm aptm) {
        if (axhw.b()) {
            a(new UnlinkEmailCredentialAidlRequest(str), aptm);
            return;
        }
        iva.c(str);
        this.e.a(this.d, new aprg(this.a, this.b, this.c, str, aptm));
    }

    @Deprecated
    public final void h(String str, aptm aptm) {
        if (axhw.b()) {
            a(new ReloadAidlRequest(str), aptm);
            return;
        }
        iva.c(str);
        this.e.a(this.d, new apqv(this.a, this.b, this.c, str, aptm));
    }

    @Deprecated
    public final void i(String str, aptm aptm) {
        if (axhw.b()) {
            a(new DeleteAidlRequest(str), aptm);
            return;
        }
        iva.c(str);
        this.e.a(this.d, new apqn(this.a, this.b, this.c, str, aptm));
    }

    public final void j(String str, aptm aptm) {
        b(str, (ActionCodeSettings) null, aptm);
    }

    @Deprecated
    public final void k(String str, aptm aptm) {
        if (axhw.b()) {
            a(new SetFirebaseUiVersionAidlRequest(str), aptm);
        } else {
            this.e.a(this.d, new apqy(this.a, this.b, this.c, str, aptm));
        }
    }

    private static final String a(String str) {
        String str2 = null;
        try {
            str2 = agxn.a().a(agxn.a().a((CharSequence) str, (String) null), 1);
        } catch (agxm e2) {
        }
        return !TextUtils.isEmpty(str2) ? str2 : str;
    }

    @Deprecated
    public final void d(String str, String str2, aptm aptm) {
        if (axhw.b()) {
            a(new SignInWithEmailAndPasswordAidlRequest(str, str2, (String) null), aptm);
            return;
        }
        iva.c(str);
        iva.c(str2);
        this.e.a(this.d, new aprc(this.a, this.b, this.c, str, str2, (String) null, aptm));
    }

    @Deprecated
    public final void b(String str, aptm aptm) {
        SignInWithCustomTokenAidlRequest signInWithCustomTokenAidlRequest = new SignInWithCustomTokenAidlRequest(str, (String) null);
        if (axhw.b()) {
            a(signInWithCustomTokenAidlRequest, aptm);
            return;
        }
        iva.c(str);
        this.e.a(this.d, new aprb(this.a, this.b, this.c, signInWithCustomTokenAidlRequest, aptm));
    }

    @Deprecated
    public final void c(String str, ActionCodeSettings actionCodeSettings, aptm aptm) {
        if (axhw.b()) {
            a(new SendGetOobConfirmationCodeEmailAidlRequest(str, actionCodeSettings, (String) null), aptm);
            return;
        }
        iva.c(str);
        iva.a((Object) actionCodeSettings);
        this.e.a(this.d, new apqx(this.a, this.b, this.c, str, actionCodeSettings, (String) null, aptm));
    }

    @Deprecated
    public final void e(String str, String str2, aptm aptm) {
        if (axhw.b()) {
            a(new ConfirmPasswordResetAidlRequest(str, str2, (String) null), aptm);
            return;
        }
        iva.c(str);
        iva.c(str2);
        this.e.a(this.d, new apql(this.a, this.b, this.c, str, str2, (String) null, aptm));
    }

    @Deprecated
    public final void f(String str, String str2, aptm aptm) {
        if (axhw.b()) {
            a(new UnlinkFederatedCredentialAidlRequest(str, str2), aptm);
            return;
        }
        iva.c(str);
        iva.c(str2);
        this.e.a(this.d, new aprh(this.a, this.b, this.c, str, str2, aptm));
    }

    private static final void a(long j) {
        if (j < 0 || j > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
    }

    @Deprecated
    public final void a(aptm aptm) {
        if (axhw.b()) {
            a(new SignInAnonymouslyAidlRequest((String) null), aptm);
        } else {
            this.e.a(this.d, new apqz(this.a, this.b, this.c, (String) null, aptm));
        }
    }

    @Deprecated
    public final void c(String str, String str2, aptm aptm) {
        if (axhw.b()) {
            a(new CreateUserWithEmailAndPasswordAidlRequest(str, str2, (String) null), aptm);
            return;
        }
        iva.c(str);
        iva.c(str2);
        this.e.a(this.d, new apqm(this.a, this.b, this.c, str, str2, (String) null, aptm));
    }

    @Deprecated
    public final void b(String str, ActionCodeSettings actionCodeSettings, aptm aptm) {
        if (axhw.b()) {
            a(new SendEmailVerificationWithSettingsAidlRequest(str, actionCodeSettings), aptm);
            return;
        }
        iva.c(str);
        this.e.a(this.d, new apqw(this.a, this.b, this.c, str, actionCodeSettings, aptm));
    }

    @Deprecated
    public final void a(EmailAuthCredential emailAuthCredential, aptm aptm) {
        if (axhw.b()) {
            a(new SignInWithEmailLinkAidlRequest(emailAuthCredential), aptm);
            return;
        }
        iva.a((Object) emailAuthCredential);
        this.e.a(this.d, new aprd(this.a, this.b, this.c, emailAuthCredential, aptm));
    }

    @Deprecated
    public final void b(String str, String str2, aptm aptm) {
        if (axhw.b()) {
            a(new ChangePasswordAidlRequest(str, str2), aptm);
            return;
        }
        iva.c(str);
        iva.c(str2);
        this.e.a(this.d, new apqj(this.a, this.b, this.c, str, str2, aptm));
    }

    @Deprecated
    public final void a(PhoneAuthCredential phoneAuthCredential, aptm aptm) {
        if (axhw.b()) {
            a(new SignInWithPhoneNumberAidlRequest(phoneAuthCredential, (String) null), aptm);
            return;
        }
        iva.a((Object) phoneAuthCredential);
        this.e.a(this.d, new apre(this.a, this.b, this.c, phoneAuthCredential, (String) null, aptm));
    }

    public final void a(ApplyActionCodeAidlRequest applyActionCodeAidlRequest, aptm aptm) {
        iva.a((Object) applyActionCodeAidlRequest);
        iva.c(applyActionCodeAidlRequest.a);
        this.e.a(this.d, new apqh(this.a, this.b, this.c, applyActionCodeAidlRequest.a, applyActionCodeAidlRequest.b, aptm));
    }

    public final void a(ChangeEmailAidlRequest changeEmailAidlRequest, aptm aptm) {
        iva.a((Object) changeEmailAidlRequest);
        iva.c(changeEmailAidlRequest.a);
        iva.c(changeEmailAidlRequest.b);
        this.e.a(this.d, new apqi(this.a, this.b, this.c, changeEmailAidlRequest.a, changeEmailAidlRequest.b, aptm));
    }

    public final void a(ChangePasswordAidlRequest changePasswordAidlRequest, aptm aptm) {
        iva.a((Object) changePasswordAidlRequest);
        iva.c(changePasswordAidlRequest.a);
        iva.c(changePasswordAidlRequest.b);
        this.e.a(this.d, new apqj(this.a, this.b, this.c, changePasswordAidlRequest.a, changePasswordAidlRequest.b, aptm));
    }

    public final void a(CheckActionCodeAidlRequest checkActionCodeAidlRequest, aptm aptm) {
        iva.a((Object) checkActionCodeAidlRequest);
        iva.c(checkActionCodeAidlRequest.a);
        this.e.a(this.d, new apqk(this.a, this.b, this.c, checkActionCodeAidlRequest.a, checkActionCodeAidlRequest.b, aptm));
    }

    public final void a(ConfirmPasswordResetAidlRequest confirmPasswordResetAidlRequest, aptm aptm) {
        iva.a((Object) confirmPasswordResetAidlRequest);
        iva.c(confirmPasswordResetAidlRequest.a);
        iva.c(confirmPasswordResetAidlRequest.b);
        this.e.a(this.d, new apql(this.a, this.b, this.c, confirmPasswordResetAidlRequest.a, confirmPasswordResetAidlRequest.b, confirmPasswordResetAidlRequest.c, aptm));
    }

    public final void a(CreateUserWithEmailAndPasswordAidlRequest createUserWithEmailAndPasswordAidlRequest, aptm aptm) {
        iva.a((Object) createUserWithEmailAndPasswordAidlRequest);
        iva.c(createUserWithEmailAndPasswordAidlRequest.a);
        iva.c(createUserWithEmailAndPasswordAidlRequest.b);
        this.e.a(this.d, new apqm(this.a, this.b, this.c, createUserWithEmailAndPasswordAidlRequest.a, createUserWithEmailAndPasswordAidlRequest.b, createUserWithEmailAndPasswordAidlRequest.c, aptm));
    }

    public final void a(DeleteAidlRequest deleteAidlRequest, aptm aptm) {
        iva.a((Object) deleteAidlRequest);
        iva.c(deleteAidlRequest.a);
        this.e.a(this.d, new apqn(this.a, this.b, this.c, deleteAidlRequest.a, aptm));
    }

    public final void a(FinalizeMfaEnrollmentAidlRequest finalizeMfaEnrollmentAidlRequest, aptm aptm) {
        if (!axif.b()) {
            b(aptm);
            return;
        }
        iva.a((Object) finalizeMfaEnrollmentAidlRequest);
        this.e.a(this.d, new apqo(this.a, this.b, this.c, finalizeMfaEnrollmentAidlRequest, aptm));
    }

    public final void a(FinalizeMfaSignInAidlRequest finalizeMfaSignInAidlRequest, aptm aptm) {
        if (!axif.b()) {
            b(aptm);
            return;
        }
        iva.a((Object) finalizeMfaSignInAidlRequest);
        this.e.a(this.d, new apqp(this.a, this.b, this.c, finalizeMfaSignInAidlRequest, aptm));
    }

    public final void a(GetAccessTokenAidlRequest getAccessTokenAidlRequest, aptm aptm) {
        iva.a((Object) getAccessTokenAidlRequest);
        iva.c(getAccessTokenAidlRequest.a);
        this.e.a(this.d, new apqq(this.a, this.b, this.c, getAccessTokenAidlRequest.a, aptm));
    }

    public final void a(GetProvidersForEmailAidlRequest getProvidersForEmailAidlRequest, aptm aptm) {
        iva.a((Object) getProvidersForEmailAidlRequest);
        iva.c(getProvidersForEmailAidlRequest.a);
        this.e.a(this.d, new apqr(this.a, this.b, this.c, getProvidersForEmailAidlRequest.a, getProvidersForEmailAidlRequest.b, aptm));
    }

    public final void a(LinkEmailAuthCredentialAidlRequest linkEmailAuthCredentialAidlRequest, aptm aptm) {
        iva.a((Object) linkEmailAuthCredentialAidlRequest);
        iva.c(linkEmailAuthCredentialAidlRequest.a);
        iva.c(linkEmailAuthCredentialAidlRequest.b);
        iva.c(linkEmailAuthCredentialAidlRequest.c);
        this.e.a(this.d, new apqs(this.a, this.b, this.c, linkEmailAuthCredentialAidlRequest.a, linkEmailAuthCredentialAidlRequest.b, linkEmailAuthCredentialAidlRequest.c, aptm));
    }

    public final void a(LinkFederatedCredentialAidlRequest linkFederatedCredentialAidlRequest, aptm aptm) {
        iva.a((Object) linkFederatedCredentialAidlRequest);
        iva.c(linkFederatedCredentialAidlRequest.a);
        iva.a((Object) linkFederatedCredentialAidlRequest.b);
        this.e.a(this.d, new apqt(this.a, this.b, this.c, linkFederatedCredentialAidlRequest.a, linkFederatedCredentialAidlRequest.b, aptm));
    }

    public final void a(LinkPhoneAuthCredentialAidlRequest linkPhoneAuthCredentialAidlRequest, aptm aptm) {
        iva.a((Object) linkPhoneAuthCredentialAidlRequest);
        iva.c(linkPhoneAuthCredentialAidlRequest.a);
        iva.a((Object) linkPhoneAuthCredentialAidlRequest.b);
        this.e.a(this.d, new apqu(this.a, this.b, this.c, linkPhoneAuthCredentialAidlRequest.a, linkPhoneAuthCredentialAidlRequest.b, aptm));
    }

    public final void a(ReloadAidlRequest reloadAidlRequest, aptm aptm) {
        iva.a((Object) reloadAidlRequest);
        iva.c(reloadAidlRequest.a);
        this.e.a(this.d, new apqv(this.a, this.b, this.c, reloadAidlRequest.a, aptm));
    }

    public final void a(SendEmailVerificationWithSettingsAidlRequest sendEmailVerificationWithSettingsAidlRequest, aptm aptm) {
        iva.a((Object) sendEmailVerificationWithSettingsAidlRequest);
        iva.c(sendEmailVerificationWithSettingsAidlRequest.a);
        this.e.a(this.d, new apqw(this.a, this.b, this.c, sendEmailVerificationWithSettingsAidlRequest.a, sendEmailVerificationWithSettingsAidlRequest.b, aptm));
    }

    public final void a(SendGetOobConfirmationCodeEmailAidlRequest sendGetOobConfirmationCodeEmailAidlRequest, aptm aptm) {
        iva.c(sendGetOobConfirmationCodeEmailAidlRequest.a);
        iva.a((Object) sendGetOobConfirmationCodeEmailAidlRequest.b);
        this.e.a(this.d, new apqx(this.a, this.b, this.c, sendGetOobConfirmationCodeEmailAidlRequest.a, sendGetOobConfirmationCodeEmailAidlRequest.b, sendGetOobConfirmationCodeEmailAidlRequest.c, aptm));
    }

    public final void a(SendVerificationCodeAidlRequest sendVerificationCodeAidlRequest, aptm aptm) {
        iva.a((Object) sendVerificationCodeAidlRequest);
        SendVerificationCodeRequest sendVerificationCodeRequest = sendVerificationCodeAidlRequest.a;
        iva.a((Object) sendVerificationCodeRequest);
        a(sendVerificationCodeRequest.b);
        this.e.a(this.d, new aprm(this.a, this.b, this.c, new SendVerificationCodeRequest(a(sendVerificationCodeRequest.a), sendVerificationCodeRequest.b, sendVerificationCodeRequest.c, sendVerificationCodeRequest.d, sendVerificationCodeRequest.e), aptm));
    }

    public final void a(SetFirebaseUiVersionAidlRequest setFirebaseUiVersionAidlRequest, aptm aptm) {
        iva.a((Object) setFirebaseUiVersionAidlRequest);
        this.e.a(this.d, new apqy(this.a, this.b, this.c, setFirebaseUiVersionAidlRequest.a, aptm));
    }

    public final void a(SignInAnonymouslyAidlRequest signInAnonymouslyAidlRequest, aptm aptm) {
        iva.a((Object) signInAnonymouslyAidlRequest);
        this.e.a(this.d, new apqz(this.a, this.b, this.c, signInAnonymouslyAidlRequest.a, aptm));
    }

    public final void a(SignInWithCredentialAidlRequest signInWithCredentialAidlRequest, aptm aptm) {
        iva.a((Object) signInWithCredentialAidlRequest);
        iva.a((Object) signInWithCredentialAidlRequest.a);
        this.e.a(this.d, new apra(this.a, this.b, this.c, signInWithCredentialAidlRequest.a, aptm));
    }

    public final void a(SignInWithCustomTokenAidlRequest signInWithCustomTokenAidlRequest, aptm aptm) {
        iva.a((Object) signInWithCustomTokenAidlRequest);
        iva.c(signInWithCustomTokenAidlRequest.a);
        this.e.a(this.d, new aprb(this.a, this.b, this.c, signInWithCustomTokenAidlRequest, aptm));
    }

    public final void a(SignInWithEmailAndPasswordAidlRequest signInWithEmailAndPasswordAidlRequest, aptm aptm) {
        iva.a((Object) signInWithEmailAndPasswordAidlRequest);
        iva.c(signInWithEmailAndPasswordAidlRequest.a);
        iva.c(signInWithEmailAndPasswordAidlRequest.b);
        this.e.a(this.d, new aprc(this.a, this.b, this.c, signInWithEmailAndPasswordAidlRequest.a, signInWithEmailAndPasswordAidlRequest.b, signInWithEmailAndPasswordAidlRequest.c, aptm));
    }

    public final void a(SignInWithEmailLinkAidlRequest signInWithEmailLinkAidlRequest, aptm aptm) {
        iva.a((Object) signInWithEmailLinkAidlRequest);
        iva.a((Object) signInWithEmailLinkAidlRequest.a);
        this.e.a(this.d, new aprd(this.a, this.b, this.c, signInWithEmailLinkAidlRequest.a, aptm));
    }

    public final void a(SignInWithPhoneNumberAidlRequest signInWithPhoneNumberAidlRequest, aptm aptm) {
        iva.a((Object) signInWithPhoneNumberAidlRequest);
        iva.a((Object) signInWithPhoneNumberAidlRequest.a);
        this.e.a(this.d, new apre(this.a, this.b, this.c, signInWithPhoneNumberAidlRequest.a, signInWithPhoneNumberAidlRequest.b, aptm));
    }

    public final void a(StartMfaPhoneNumberEnrollmentAidlRequest startMfaPhoneNumberEnrollmentAidlRequest, aptm aptm) {
        if (!axif.b()) {
            b(aptm);
            return;
        }
        iva.a((Object) startMfaPhoneNumberEnrollmentAidlRequest);
        a(startMfaPhoneNumberEnrollmentAidlRequest.d);
        this.e.a(this.d, new aprk(this.a, this.b, this.c, new StartMfaPhoneNumberEnrollmentAidlRequest(startMfaPhoneNumberEnrollmentAidlRequest.a, a(startMfaPhoneNumberEnrollmentAidlRequest.b), startMfaPhoneNumberEnrollmentAidlRequest.c, startMfaPhoneNumberEnrollmentAidlRequest.d, startMfaPhoneNumberEnrollmentAidlRequest.e, startMfaPhoneNumberEnrollmentAidlRequest.f), aptm));
    }

    public final void a(StartMfaPhoneNumberSignInAidlRequest startMfaPhoneNumberSignInAidlRequest, aptm aptm) {
        if (!axif.b()) {
            b(aptm);
            return;
        }
        iva.a((Object) startMfaPhoneNumberSignInAidlRequest);
        a(startMfaPhoneNumberSignInAidlRequest.d);
        String a2 = a(startMfaPhoneNumberSignInAidlRequest.a.d);
        PhoneMultiFactorInfo phoneMultiFactorInfo = startMfaPhoneNumberSignInAidlRequest.a;
        startMfaPhoneNumberSignInAidlRequest.a = new PhoneMultiFactorInfo(phoneMultiFactorInfo.a, phoneMultiFactorInfo.b, phoneMultiFactorInfo.c, a2);
        this.e.a(this.d, new aprl(this.a, this.b, this.c, startMfaPhoneNumberSignInAidlRequest, aptm));
    }

    public final void a(UnenrollMfaAidlRequest unenrollMfaAidlRequest, aptm aptm) {
        if (!axif.b()) {
            b(aptm);
            return;
        }
        iva.a((Object) unenrollMfaAidlRequest);
        this.e.a(this.d, new aprf(this.a, this.b, this.c, unenrollMfaAidlRequest.a, unenrollMfaAidlRequest.b, aptm));
    }

    public final void a(UnlinkEmailCredentialAidlRequest unlinkEmailCredentialAidlRequest, aptm aptm) {
        iva.a((Object) unlinkEmailCredentialAidlRequest);
        iva.c(unlinkEmailCredentialAidlRequest.a);
        this.e.a(this.d, new aprg(this.a, this.b, this.c, unlinkEmailCredentialAidlRequest.a, aptm));
    }

    public final void a(UnlinkFederatedCredentialAidlRequest unlinkFederatedCredentialAidlRequest, aptm aptm) {
        iva.a((Object) unlinkFederatedCredentialAidlRequest);
        iva.c(unlinkFederatedCredentialAidlRequest.a);
        iva.c(unlinkFederatedCredentialAidlRequest.b);
        this.e.a(this.d, new aprh(this.a, this.b, this.c, unlinkFederatedCredentialAidlRequest.a, unlinkFederatedCredentialAidlRequest.b, aptm));
    }

    public final void a(UpdateProfileAidlRequest updateProfileAidlRequest, aptm aptm) {
        iva.a((Object) updateProfileAidlRequest);
        iva.c(updateProfileAidlRequest.b);
        iva.a((Object) updateProfileAidlRequest.a);
        this.e.a(this.d, new apri(this.a, this.b, this.c, updateProfileAidlRequest.b, updateProfileAidlRequest.a, aptm));
    }

    public final void a(VerifyBeforeUpdateEmailAidlRequest verifyBeforeUpdateEmailAidlRequest, aptm aptm) {
        if (!axil.a.a().a()) {
            b(aptm);
            return;
        }
        iva.a((Object) verifyBeforeUpdateEmailAidlRequest);
        this.e.a(this.d, new aprj(this.a, this.b, this.c, verifyBeforeUpdateEmailAidlRequest, aptm));
    }

    @Deprecated
    public final void a(SendVerificationCodeRequest sendVerificationCodeRequest, aptm aptm) {
        if (axhw.b()) {
            a(new SendVerificationCodeAidlRequest(sendVerificationCodeRequest), aptm);
            return;
        }
        iva.a((Object) sendVerificationCodeRequest);
        a(sendVerificationCodeRequest.b);
        this.e.a(this.d, new aprm(this.a, this.b, this.c, new SendVerificationCodeRequest(a(sendVerificationCodeRequest.a), sendVerificationCodeRequest.b, sendVerificationCodeRequest.c, sendVerificationCodeRequest.d, sendVerificationCodeRequest.e), aptm));
    }

    @Deprecated
    public final void a(VerifyAssertionRequest verifyAssertionRequest, aptm aptm) {
        if (axhw.b()) {
            a(new SignInWithCredentialAidlRequest(verifyAssertionRequest), aptm);
            return;
        }
        iva.a((Object) verifyAssertionRequest);
        this.e.a(this.d, new apra(this.a, this.b, this.c, verifyAssertionRequest, aptm));
    }

    @Deprecated
    public final void a(String str, aptm aptm) {
        if (axhw.b()) {
            a(new GetAccessTokenAidlRequest(str), aptm);
            return;
        }
        iva.c(str);
        this.e.a(this.d, new apqq(this.a, this.b, this.c, str, aptm));
    }

    @Deprecated
    public final void a(String str, ActionCodeSettings actionCodeSettings, aptm aptm) {
        if (actionCodeSettings == null) {
            actionCodeSettings = new ActionCodeSettings();
        }
        actionCodeSettings.i = aqkx.PASSWORD_RESET.j;
        c(str, actionCodeSettings, aptm);
    }

    @Deprecated
    public final void a(String str, PhoneAuthCredential phoneAuthCredential, aptm aptm) {
        if (axhw.b()) {
            a(new LinkPhoneAuthCredentialAidlRequest(str, phoneAuthCredential), aptm);
            return;
        }
        iva.c(str);
        iva.a((Object) phoneAuthCredential);
        this.e.a(this.d, new apqu(this.a, this.b, this.c, str, phoneAuthCredential, aptm));
    }

    @Deprecated
    public final void a(String str, UserProfileChangeRequest userProfileChangeRequest, aptm aptm) {
        if (axhw.b()) {
            a(new UpdateProfileAidlRequest(userProfileChangeRequest, str), aptm);
            return;
        }
        iva.c(str);
        iva.a((Object) userProfileChangeRequest);
        this.e.a(this.d, new apri(this.a, this.b, this.c, str, userProfileChangeRequest, aptm));
    }

    @Deprecated
    public final void a(String str, VerifyAssertionRequest verifyAssertionRequest, aptm aptm) {
        if (axhw.b()) {
            a(new LinkFederatedCredentialAidlRequest(str, verifyAssertionRequest), aptm);
            return;
        }
        iva.c(str);
        iva.a((Object) verifyAssertionRequest);
        this.e.a(this.d, new apqt(this.a, this.b, this.c, str, verifyAssertionRequest, aptm));
    }

    @Deprecated
    public final void a(String str, String str2, aptm aptm) {
        if (axhw.b()) {
            a(new ChangeEmailAidlRequest(str, str2), aptm);
            return;
        }
        iva.c(str);
        iva.c(str2);
        this.e.a(this.d, new apqi(this.a, this.b, this.c, str, str2, aptm));
    }

    @Deprecated
    public final void a(String str, String str2, String str3, aptm aptm) {
        if (axhw.b()) {
            a(new LinkEmailAuthCredentialAidlRequest(str, str2, str3), aptm);
            return;
        }
        iva.c(str);
        iva.c(str2);
        iva.c(str3);
        this.e.a(this.d, new apqs(this.a, this.b, this.c, str, str2, str3, aptm));
    }
}
