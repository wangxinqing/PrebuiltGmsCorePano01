package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.uncertifieddevice.UncertifiedDeviceServiceResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: gqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gqq extends bhv implements IInterface {
    public gqq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.uncertifieddevice.IUncertifiedDeviceServiceCallback");
    }

    public final void a(Status status, UncertifiedDeviceServiceResponse uncertifiedDeviceServiceResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) uncertifiedDeviceServiceResponse);
        c(1, aQ);
    }
}
