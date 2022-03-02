package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleCertificatesQuery;

/* renamed from: itz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class itz extends bhv implements iub {
    public itz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final mby getGoogleCertificates() {
        throw null;
    }

    public final mby getGoogleReleaseCertificates() {
        throw null;
    }

    public final boolean isGoogleOrPlatformSigned(GoogleCertificatesQuery googleCertificatesQuery, mby mby) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) googleCertificatesQuery);
        bhx.a(aQ, (IInterface) mby);
        Parcel a = a(5, aQ);
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final boolean isGoogleReleaseSigned(String str, mby mby) {
        throw null;
    }

    public final boolean isGoogleSigned(String str, mby mby) {
        throw null;
    }
}
