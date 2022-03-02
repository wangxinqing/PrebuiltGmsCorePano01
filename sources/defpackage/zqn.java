package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaHandle;

/* renamed from: zqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zqn extends bhv implements IInterface {
    public zqn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.recaptcha.internal.IInitCallback");
    }

    public final void a(Status status, RecaptchaHandle recaptchaHandle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) recaptchaHandle);
        c(1, aQ);
    }
}
