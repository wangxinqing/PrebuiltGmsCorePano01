package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: zqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zqj extends bhv implements IInterface {
    public zqj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.recaptcha.internal.ICloseCallback");
    }

    public final void a(Status status, boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, z);
        c(1, aQ);
    }
}
