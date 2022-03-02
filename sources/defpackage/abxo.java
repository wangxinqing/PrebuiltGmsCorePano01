package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;
import java.util.List;

/* renamed from: abxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abxo extends bhv implements abxq {
    public abxo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(1, aQ);
    }

    public final void b(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(2, aQ);
    }

    public final void c(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(3, aQ);
    }

    public final void d(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(5, aQ);
    }

    public final void e(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(6, aQ);
    }

    public final void a(Status status, AdvertisingInfo advertisingInfo) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) advertisingInfo);
        c(9, aQ);
    }

    public final void a(Status status, ManagedAccountSetupInfo managedAccountSetupInfo) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) managedAccountSetupInfo);
        c(7, aQ);
    }

    public final void a(Status status, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeString(str);
        c(4, aQ);
    }

    public final void a(Status status, List list) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeTypedList(list);
        c(8, aQ);
    }
}
