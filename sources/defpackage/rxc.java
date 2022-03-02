package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdd.FileGroupRequest;
import com.google.android.gms.mdd.OverrideFileGroupRequest;

/* renamed from: rxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rxc extends bhv implements rxe {
    public rxc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdd.IMobileDataDownloadService");
    }

    public final void a(ifu ifu) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        b(2, aQ);
    }

    public final void a(ifu ifu, OverrideFileGroupRequest overrideFileGroupRequest) {
        throw null;
    }

    public final void b(ifu ifu) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        b(9, aQ);
    }

    public final void b(ifu ifu, FileGroupRequest fileGroupRequest) {
        throw null;
    }

    public final void c(ifu ifu) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        b(4, aQ);
    }

    public final void d(ifu ifu) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        b(7, aQ);
    }

    public final void e(ifu ifu) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        b(8, aQ);
    }

    public final void f(ifu ifu) {
        throw null;
    }

    public final void a(ifu ifu, FileGroupRequest fileGroupRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) fileGroupRequest);
        b(12, aQ);
    }

    public final void a(rwy rwy, FileGroupRequest fileGroupRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) rwy);
        bhx.a(aQ, (Parcelable) fileGroupRequest);
        b(1, aQ);
    }

    public final void a(rxb rxb) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) rxb);
        b(10, aQ);
    }

    public final void a(boolean z, ifu ifu) {
        Parcel aQ = aQ();
        bhx.a(aQ, z);
        bhx.a(aQ, (IInterface) ifu);
        b(3, aQ);
    }
}
