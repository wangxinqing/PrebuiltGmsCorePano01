package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: iua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class iua extends bhw implements iub {
    public iua() {
        super("com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public static iub asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof iub) {
            return (iub) queryLocalInterface;
        }
        return new itz(iBinder);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v6, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L_0x009b
            r1 = 2
            if (r5 == r1) goto L_0x0090
            r1 = 3
            java.lang.String r2 = "com.google.android.gms.dynamic.IObjectWrapper"
            r3 = 0
            if (r5 == r1) goto L_0x0068
            r1 = 4
            if (r5 == r1) goto L_0x0040
            r1 = 5
            if (r5 == r1) goto L_0x0014
            r5 = 0
            return r5
        L_0x0014:
            android.os.Parcelable$Creator r5 = com.google.android.gms.common.GoogleCertificatesQuery.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.common.GoogleCertificatesQuery r5 = (com.google.android.gms.common.GoogleCertificatesQuery) r5
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x0034
            android.os.IInterface r1 = r6.queryLocalInterface(r2)
            boolean r2 = r1 instanceof defpackage.mby
            if (r2 == 0) goto L_0x002e
            r3 = r1
            mby r3 = (defpackage.mby) r3
            goto L_0x0035
        L_0x002e:
            mbw r3 = new mbw
            r3.<init>(r6)
            goto L_0x0035
        L_0x0034:
        L_0x0035:
            boolean r5 = r4.isGoogleOrPlatformSigned(r5, r3)
            r7.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r7, (boolean) r5)
            goto L_0x00a5
        L_0x0040:
            java.lang.String r5 = r6.readString()
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x005c
            android.os.IInterface r1 = r6.queryLocalInterface(r2)
            boolean r2 = r1 instanceof defpackage.mby
            if (r2 == 0) goto L_0x0056
            r3 = r1
            mby r3 = (defpackage.mby) r3
            goto L_0x005d
        L_0x0056:
            mbw r3 = new mbw
            r3.<init>(r6)
            goto L_0x005d
        L_0x005c:
        L_0x005d:
            boolean r5 = r4.isGoogleSigned(r5, r3)
            r7.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r7, (boolean) r5)
            goto L_0x00a5
        L_0x0068:
            java.lang.String r5 = r6.readString()
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x0084
            android.os.IInterface r1 = r6.queryLocalInterface(r2)
            boolean r2 = r1 instanceof defpackage.mby
            if (r2 == 0) goto L_0x007e
            r3 = r1
            mby r3 = (defpackage.mby) r3
            goto L_0x0085
        L_0x007e:
            mbw r3 = new mbw
            r3.<init>(r6)
            goto L_0x0085
        L_0x0084:
        L_0x0085:
            boolean r5 = r4.isGoogleReleaseSigned(r5, r3)
            r7.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r7, (boolean) r5)
            goto L_0x00a5
        L_0x0090:
            mby r5 = r4.getGoogleReleaseCertificates()
            r7.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r7, (android.os.IInterface) r5)
            goto L_0x00a5
        L_0x009b:
            mby r5 = r4.getGoogleCertificates()
            r7.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r7, (android.os.IInterface) r5)
        L_0x00a5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iua.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
