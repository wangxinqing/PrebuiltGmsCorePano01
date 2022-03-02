package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcSettingsListActivityRequest;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;

/* renamed from: adby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adby extends bhv implements adca {
    public adby(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.udc.internal.IUdcService");
    }

    public final void a(adbx adbx) {
        throw null;
    }

    public final void a(adbx adbx, UdcSettingsListActivityRequest udcSettingsListActivityRequest) {
        throw null;
    }

    public final void a(adbx adbx, UdcWriteLocalSettingsRequest udcWriteLocalSettingsRequest) {
        throw null;
    }

    public final void a(adbx adbx, byte[] bArr) {
        throw null;
    }

    public final void b(adbx adbx) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) adbx);
        b(11, aQ);
    }

    public final void b(adbx adbx, byte[] bArr) {
        throw null;
    }

    public final void c(adbx adbx) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) adbx);
        b(12, aQ);
    }

    public final void d(adbx adbx, byte[] bArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) adbx);
        aQ.writeByteArray(bArr);
        b(4, aQ);
    }

    public final void e(adbx adbx, byte[] bArr) {
        throw null;
    }

    public final void f(adbx adbx, byte[] bArr) {
        throw null;
    }

    public final void a(adbx adbx, UdcCacheRequest udcCacheRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) adbx);
        bhx.a(aQ, (Parcelable) udcCacheRequest);
        b(8, aQ);
    }

    public final void c(adbx adbx, byte[] bArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) adbx);
        aQ.writeByteArray(bArr);
        b(3, aQ);
    }
}
