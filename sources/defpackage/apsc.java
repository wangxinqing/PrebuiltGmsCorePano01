package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apsc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apsc implements apts {
    final /* synthetic */ apts a;
    final /* synthetic */ apsd b;

    public apsc(apsd apsd, apts apts) {
        this.b = apsd;
        this.a = apts;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apvn apvn = (apvn) obj;
        if (!TextUtils.isEmpty(apvn.e)) {
            Status status = new Status(17025);
            aptg aptg = this.b.c;
            PhoneAuthCredential phoneAuthCredential = new PhoneAuthCredential((String) null, (String) null, false, apvn.h, true, apvn.e, (String) null);
            try {
                aptm aptm = aptg.c;
                Parcel aQ = aptm.aQ();
                bhx.a(aQ, (Parcelable) status);
                bhx.a(aQ, (Parcelable) phoneAuthCredential);
                aptm.c(12, aQ);
            } catch (RemoteException e) {
                aptg.b.e("RemoteException when sending failure result.", e, new Object[0]);
            }
        } else {
            this.b.d.a(new GetTokenResponse(apvn.b, apvn.a, Long.valueOf(apvn.c), "Bearer"), (String) null, "phone", Boolean.valueOf(apvn.d), (DefaultOAuthCredential) null, this.b.c, this.a);
        }
    }

    public final void a(String str) {
        this.a.a(str);
    }
}
