package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;

/* renamed from: mfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mfb extends bhv implements mfd {
    public mfb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.facs.cache.internal.IFacsCacheService");
    }

    public final void a(mfa mfa) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mfa);
        b(4, aQ);
    }

    public final void b(mfa mfa, FacsCacheCallOptions facsCacheCallOptions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mfa);
        bhx.a(aQ, (Parcelable) facsCacheCallOptions);
        b(3, aQ);
    }

    public final void a(mfa mfa, FacsCacheCallOptions facsCacheCallOptions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mfa);
        bhx.a(aQ, (Parcelable) facsCacheCallOptions);
        b(1, aQ);
    }

    public final void a(mfa mfa, byte[] bArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mfa);
        aQ.writeByteArray(bArr);
        b(5, aQ);
    }

    public final void a(mfa mfa, byte[] bArr, FacsCacheCallOptions facsCacheCallOptions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mfa);
        aQ.writeByteArray(bArr);
        bhx.a(aQ, (Parcelable) facsCacheCallOptions);
        b(2, aQ);
    }
}
