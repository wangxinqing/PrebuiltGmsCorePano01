package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaResultData;

/* renamed from: zql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zql extends bhw implements zqm {
    final /* synthetic */ acwd a;

    public zql() {
        super("com.google.android.gms.recaptcha.internal.IExecuteCallback");
    }

    public final void a(Status status, RecaptchaResultData recaptchaResultData) {
        ihd.a(status, recaptchaResultData, this.a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zql(acwd acwd) {
        super("com.google.android.gms.recaptcha.internal.IExecuteCallback");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), (RecaptchaResultData) bhx.a(parcel, RecaptchaResultData.CREATOR));
        return true;
    }
}
