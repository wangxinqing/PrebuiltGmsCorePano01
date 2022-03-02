package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import com.google.android.gms.udc.DeviceDataUploadOptedInAccountsParcelable;
import com.google.android.gms.udc.SettingDisplayInfo;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.List;

/* renamed from: adbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adbv extends bhv implements adbx {
    public adbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.udc.internal.IUdcCallbacks");
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(9, aQ);
    }

    public final void b(Status status, byte[] bArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeByteArray(bArr);
        c(2, aQ);
    }

    public final void c(Status status, byte[] bArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeByteArray(bArr);
        c(3, aQ);
    }

    public final void d(Status status, byte[] bArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeByteArray(bArr);
        c(4, aQ);
    }

    public final void a(Status status, PendingIntent pendingIntent) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) pendingIntent);
        c(6, aQ);
    }

    public final void a(Status status, DeviceDataUploadOptInFlags deviceDataUploadOptInFlags) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) deviceDataUploadOptInFlags);
        c(10, aQ);
    }

    public final void a(Status status, DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) deviceDataUploadOptedInAccountsParcelable);
        c(11, aQ);
    }

    public final void a(Status status, SettingDisplayInfo settingDisplayInfo, PendingIntent pendingIntent) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) settingDisplayInfo);
        bhx.a(aQ, (Parcelable) pendingIntent);
        c(7, aQ);
    }

    public final void a(Status status, UdcCacheResponse udcCacheResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) udcCacheResponse);
        c(8, aQ);
    }

    public final void a(Status status, List list) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeTypedList(list);
        c(5, aQ);
    }

    public final void a(Status status, byte[] bArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeByteArray(bArr);
        c(1, aQ);
    }
}
