package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaResultData;

/* renamed from: zqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zqk extends bhv implements zqm {
    public zqk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.recaptcha.internal.IExecuteCallback");
    }

    public final void a(Status status, RecaptchaResultData recaptchaResultData) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) recaptchaResultData);
        c(1, aQ);
    }
}
