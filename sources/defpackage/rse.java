package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: rse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class rse extends bhw implements rsf {
    public rse() {
        super("com.google.android.gms.maps.internal.ICreator");
    }

    public static rsf asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
        if (queryLocalInterface instanceof rsf) {
            return (rsf) queryLocalInterface;
        }
        return new rsd(iBinder);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r3, android.os.Parcel r4, android.os.Parcel r5) {
        /*
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.dynamic.IObjectWrapper"
            r1 = 0
            switch(r3) {
                case 1: goto L_0x00e7;
                case 2: goto L_0x00c3;
                case 3: goto L_0x0097;
                case 4: goto L_0x008b;
                case 5: goto L_0x007f;
                case 6: goto L_0x005a;
                case 7: goto L_0x002d;
                case 8: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r3 = 0
            return r3
        L_0x0008:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0020
            android.os.IInterface r4 = r3.queryLocalInterface(r0)
            boolean r0 = r4 instanceof defpackage.mby
            if (r0 == 0) goto L_0x001a
            r1 = r4
            mby r1 = (defpackage.mby) r1
            goto L_0x0021
        L_0x001a:
            mbw r1 = new mbw
            r1.<init>(r3)
            goto L_0x0021
        L_0x0020:
        L_0x0021:
            rum r3 = r2.newStreetViewPanoramaFragmentDelegate(r1)
            r5.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r5, (android.os.IInterface) r3)
            goto L_0x0106
        L_0x002d:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0045
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.mby
            if (r1 == 0) goto L_0x003f
            r1 = r0
            mby r1 = (defpackage.mby) r1
            goto L_0x0046
        L_0x003f:
            mbw r1 = new mbw
            r1.<init>(r3)
            goto L_0x0046
        L_0x0045:
        L_0x0046:
            android.os.Parcelable$Creator r3 = com.google.android.gms.maps.StreetViewPanoramaOptions.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.maps.StreetViewPanoramaOptions r3 = (com.google.android.gms.maps.StreetViewPanoramaOptions) r3
            rup r3 = r2.newStreetViewPanoramaViewDelegate(r1, r3)
            r5.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r5, (android.os.IInterface) r3)
            goto L_0x0106
        L_0x005a:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0072
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.mby
            if (r1 == 0) goto L_0x006c
            r1 = r0
            mby r1 = (defpackage.mby) r1
            goto L_0x0073
        L_0x006c:
            mbw r1 = new mbw
            r1.<init>(r3)
            goto L_0x0073
        L_0x0072:
        L_0x0073:
            int r3 = r4.readInt()
            r2.initV2(r1, r3)
            r5.writeNoException()
            goto L_0x0106
        L_0x007f:
            rvu r3 = r2.newBitmapDescriptorFactoryDelegate()
            r5.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r5, (android.os.IInterface) r3)
            goto L_0x0106
        L_0x008b:
            rsb r3 = r2.newCameraUpdateFactoryDelegate()
            r5.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r5, (android.os.IInterface) r3)
            goto L_0x0106
        L_0x0097:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x00af
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.mby
            if (r1 == 0) goto L_0x00a9
            r1 = r0
            mby r1 = (defpackage.mby) r1
            goto L_0x00b0
        L_0x00a9:
            mbw r1 = new mbw
            r1.<init>(r3)
            goto L_0x00b0
        L_0x00af:
        L_0x00b0:
            android.os.Parcelable$Creator r3 = com.google.android.gms.maps.GoogleMapOptions.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.maps.GoogleMapOptions r3 = (com.google.android.gms.maps.GoogleMapOptions) r3
            rss r3 = r2.newMapViewDelegate(r1, r3)
            r5.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r5, (android.os.IInterface) r3)
            goto L_0x0106
        L_0x00c3:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x00db
            android.os.IInterface r4 = r3.queryLocalInterface(r0)
            boolean r0 = r4 instanceof defpackage.mby
            if (r0 == 0) goto L_0x00d5
            r1 = r4
            mby r1 = (defpackage.mby) r1
            goto L_0x00dc
        L_0x00d5:
            mbw r1 = new mbw
            r1.<init>(r3)
            goto L_0x00dc
        L_0x00db:
        L_0x00dc:
            rsp r3 = r2.newMapFragmentDelegate(r1)
            r5.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r5, (android.os.IInterface) r3)
            goto L_0x0106
        L_0x00e7:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x00ff
            android.os.IInterface r4 = r3.queryLocalInterface(r0)
            boolean r0 = r4 instanceof defpackage.mby
            if (r0 == 0) goto L_0x00f9
            r1 = r4
            mby r1 = (defpackage.mby) r1
            goto L_0x0100
        L_0x00f9:
            mbw r1 = new mbw
            r1.<init>(r3)
            goto L_0x0100
        L_0x00ff:
        L_0x0100:
            r2.init(r1)
            r5.writeNoException()
        L_0x0106:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rse.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
