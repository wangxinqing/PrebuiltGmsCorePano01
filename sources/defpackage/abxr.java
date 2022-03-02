package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: abxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abxr extends bhv implements abxt {
    public abxr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceService");
    }

    public final String a(BootstrapOptions bootstrapOptions) {
        throw null;
    }

    public final void a(abxq abxq, abxn abxn) {
        throw null;
    }

    public final void a(abxq abxq, BootstrapOptions bootstrapOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu) {
        throw null;
    }

    public final void a(acgz acgz) {
        throw null;
    }

    public final void a(acgz acgz, HandshakeData handshakeData) {
        throw null;
    }

    public final void b(abxq abxq) {
        throw null;
    }

    public final void b(acgz acgz) {
        throw null;
    }

    public final void b(acgz acgz, HandshakeData handshakeData) {
        throw null;
    }

    public final void c(abxq abxq) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) abxq);
        c(19, aQ);
    }

    public final void d(abxq abxq) {
        throw null;
    }

    public final void e(abxq abxq) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) abxq);
        c(16, aQ);
    }

    public final void f(abxq abxq) {
        throw null;
    }

    public final void a(abxq abxq) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) abxq);
        c(3, aQ);
    }

    public final void a(abxq abxq, BootstrapOptions bootstrapOptions, abxn abxn) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) abxq);
        bhx.a(aQ, (Parcelable) bootstrapOptions);
        bhx.a(aQ, (IInterface) abxn);
        c(1, aQ);
    }
}
