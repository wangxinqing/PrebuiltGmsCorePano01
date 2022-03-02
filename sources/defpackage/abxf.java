package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: abxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abxf extends bhv implements abxh {
    public abxf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceService");
    }

    public final void a(abxe abxe) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) abxe);
        c(2, aQ);
    }

    public final void a(abxe abxe, BootstrapConfigurations bootstrapConfigurations) {
        throw null;
    }

    public final void a(abxe abxe, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu) {
        throw null;
    }

    public final void a(acgz acgz) {
        throw null;
    }

    public final void a(acgz acgz, HandshakeData handshakeData) {
        throw null;
    }

    public final void b(abxe abxe) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) abxe);
        c(6, aQ);
    }

    public final void b(acgz acgz, HandshakeData handshakeData) {
        throw null;
    }

    public final void c(abxe abxe) {
        throw null;
    }

    public final void d(abxe abxe) {
        throw null;
    }

    public final void a(abxe abxe, abxk abxk) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) abxe);
        bhx.a(aQ, (IInterface) abxk);
        c(1, aQ);
    }

    public final void b(abxe abxe, Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) abxe);
        bhx.a(aQ, (Parcelable) bundle);
        c(16, aQ);
    }

    public final void a(abxe abxe, Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) abxe);
        bhx.a(aQ, (Parcelable) bundle);
        c(7, aQ);
    }

    public final void a(abxe abxe, D2DDevice d2DDevice, BootstrapConfigurations bootstrapConfigurations, abwy abwy) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) abxe);
        bhx.a(aQ, (Parcelable) d2DDevice);
        bhx.a(aQ, (Parcelable) bootstrapConfigurations);
        bhx.a(aQ, (IInterface) abwy);
        c(4, aQ);
    }

    public final void a(abxe abxe, D2DDevice d2DDevice, String str, abxb abxb) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) abxe);
        bhx.a(aQ, (Parcelable) d2DDevice);
        aQ.writeString(str);
        bhx.a(aQ, (IInterface) abxb);
        c(3, aQ);
    }

    public final void a(abxe abxe, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) abxe);
        aQ.writeString((String) null);
        c(5, aQ);
    }

    public final void a(ConnectParams connectParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) connectParams);
        c(22, aQ);
    }
}
