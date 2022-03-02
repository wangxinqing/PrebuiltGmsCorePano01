package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaHandle;

/* renamed from: zqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zqo extends bhv implements zqq {
    public zqo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.recaptcha.internal.IRecaptchaService");
    }

    public final void a(zqj zqj) {
        throw null;
    }

    public final void a(zqm zqm, RecaptchaHandle recaptchaHandle, RecaptchaAction recaptchaAction) {
        throw null;
    }

    public final void a(zqn zqn, String str) {
        throw null;
    }

    public final void a(zqm zqm, String str, String str2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) zqm);
        aQ.writeString(str);
        aQ.writeString(str2);
        b(1, aQ);
    }
}
