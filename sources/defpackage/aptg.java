package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.api.aidlresponses.OnFailedMfaSignInAidlResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.api.model.ResetPasswordResponse;

/* renamed from: aptg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aptg {
    public final iwd b;
    public final aptm c;

    public aptg(aptm aptm, iwd iwd) {
        iva.a((Object) aptm);
        this.c = aptm;
        iva.a((Object) iwd);
        this.b = iwd;
    }

    public void a(Status status) {
        try {
            this.c.a(status);
        } catch (RemoteException e) {
            this.b.e("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    public final void a(PhoneAuthCredential phoneAuthCredential) {
        try {
            aptm aptm = this.c;
            Parcel aQ = aptm.aQ();
            bhx.a(aQ, (Parcelable) phoneAuthCredential);
            aptm.c(10, aQ);
        } catch (RemoteException e) {
            this.b.e("RemoteException when sending verification completed response.", e, new Object[0]);
        }
    }

    public final void a(OnFailedMfaSignInAidlResponse onFailedMfaSignInAidlResponse) {
        try {
            aptm aptm = this.c;
            Parcel aQ = aptm.aQ();
            bhx.a(aQ, (Parcelable) onFailedMfaSignInAidlResponse);
            aptm.c(15, aQ);
        } catch (RemoteException e) {
            this.b.e("RemoteException when sending failure result for mfa", e, new Object[0]);
        }
    }

    public final void a(GetTokenResponse getTokenResponse, GetAccountInfoUser getAccountInfoUser) {
        try {
            aptm aptm = this.c;
            Parcel aQ = aptm.aQ();
            bhx.a(aQ, (Parcelable) getTokenResponse);
            bhx.a(aQ, (Parcelable) getAccountInfoUser);
            aptm.c(2, aQ);
        } catch (RemoteException e) {
            this.b.e("RemoteException when sending get token and account info user response", e, new Object[0]);
        }
    }

    public final void a(ResetPasswordResponse resetPasswordResponse) {
        try {
            aptm aptm = this.c;
            Parcel aQ = aptm.aQ();
            bhx.a(aQ, (Parcelable) resetPasswordResponse);
            aptm.c(4, aQ);
        } catch (RemoteException e) {
            this.b.e("RemoteException when sending password reset response.", e, new Object[0]);
        }
    }

    public void a(String str) {
        try {
            aptm aptm = this.c;
            Parcel aQ = aptm.aQ();
            aQ.writeString(str);
            aptm.c(9, aQ);
        } catch (RemoteException e) {
            this.b.e("RemoteException when sending send verification code response.", e, new Object[0]);
        }
    }
}
