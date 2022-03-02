package defpackage;

/* renamed from: rjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class rjq extends bhw implements rjr {
    public rjq() {
        super("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [rka] */
    /* JADX WARNING: type inference failed for: r2v6, types: [rka] */
    /* JADX WARNING: type inference failed for: r2v11, types: [rka] */
    /* JADX WARNING: type inference failed for: r2v16, types: [rka] */
    /* JADX WARNING: type inference failed for: r2v21, types: [rka] */
    /* JADX WARNING: type inference failed for: r2v26, types: [rka] */
    /* JADX WARNING: type inference failed for: r2v31, types: [rka] */
    /* JADX WARNING: type inference failed for: r2v36, types: [rka] */
    /* JADX WARNING: type inference failed for: r2v41, types: [rka] */
    /* JADX WARNING: type inference failed for: r2v46, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v51, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v55 */
    /* JADX WARNING: type inference failed for: r2v56 */
    /* JADX WARNING: type inference failed for: r2v57 */
    /* JADX WARNING: type inference failed for: r2v58 */
    /* JADX WARNING: type inference failed for: r2v59 */
    /* JADX WARNING: type inference failed for: r2v60 */
    /* JADX WARNING: type inference failed for: r2v61 */
    /* JADX WARNING: type inference failed for: r2v62 */
    /* JADX WARNING: type inference failed for: r2v63 */
    /* JADX WARNING: type inference failed for: r2v64 */
    /* JADX WARNING: type inference failed for: r2v65 */
    /* JADX WARNING: type inference failed for: r2v66 */
    /* JADX WARNING: type inference failed for: r2v67 */
    /* JADX WARNING: type inference failed for: r2v68 */
    /* JADX WARNING: type inference failed for: r2v69 */
    /* JADX WARNING: type inference failed for: r2v70 */
    /* JADX WARNING: type inference failed for: r2v71 */
    /* JADX WARNING: type inference failed for: r2v72 */
    /* JADX WARNING: type inference failed for: r2v73 */
    /* JADX WARNING: type inference failed for: r2v74 */
    /* JADX WARNING: type inference failed for: r2v75 */
    /* JADX WARNING: type inference failed for: r2v76 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            java.lang.String r0 = "com.google.android.gms.common.api.internal.IStatusCallback"
            java.lang.String r1 = "com.google.android.gms.location.places.internal.IPlacesCallbacks"
            r2 = 0
            switch(r5) {
                case 2: goto L_0x01dd;
                case 3: goto L_0x01b0;
                case 4: goto L_0x017b;
                case 5: goto L_0x014d;
                case 6: goto L_0x011f;
                case 7: goto L_0x00f1;
                case 8: goto L_0x00c3;
                case 9: goto L_0x008d;
                case 10: goto L_0x0063;
                case 11: goto L_0x0035;
                case 12: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            r5 = 0
            return r5
        L_0x000a:
            android.os.Parcelable$Creator r5 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.location.places.internal.PlacesParams r5 = (com.google.android.gms.location.places.internal.PlacesParams) r5
            android.os.Parcelable$Creator r5 = com.google.android.gms.location.places.ReplaySignal.CREATOR
            r6.createTypedArrayList(r5)
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x002f
            android.os.IInterface r6 = r5.queryLocalInterface(r0)
            boolean r0 = r6 instanceof defpackage.ifu
            if (r0 == 0) goto L_0x0029
            r2 = r6
            ifu r2 = (defpackage.ifu) r2
            goto L_0x0030
        L_0x0029:
            ifs r2 = new ifs
            r2.<init>(r5)
            goto L_0x0030
        L_0x002f:
        L_0x0030:
            r4.a(r2)
            goto L_0x0211
        L_0x0035:
            android.os.Parcelable$Creator r5 = com.google.android.gms.location.places.PlacesClientIdentifier.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.location.places.PlacesClientIdentifier r5 = (com.google.android.gms.location.places.PlacesClientIdentifier) r5
            android.os.Parcelable$Creator r1 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r1 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r1)
            com.google.android.gms.location.places.internal.PlacesParams r1 = (com.google.android.gms.location.places.internal.PlacesParams) r1
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x005d
            android.os.IInterface r0 = r6.queryLocalInterface(r0)
            boolean r2 = r0 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x0057
            r2 = r0
            ifu r2 = (defpackage.ifu) r2
            goto L_0x005e
        L_0x0057:
            ifs r2 = new ifs
            r2.<init>(r6)
            goto L_0x005e
        L_0x005d:
        L_0x005e:
            r4.a((com.google.android.gms.location.places.PlacesClientIdentifier) r5, (com.google.android.gms.location.places.internal.PlacesParams) r1, (defpackage.ifu) r2)
            goto L_0x0211
        L_0x0063:
            android.os.Parcelable$Creator r5 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.location.places.internal.PlacesParams r5 = (com.google.android.gms.location.places.internal.PlacesParams) r5
            java.lang.String r0 = r6.readString()
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x0087
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.rka
            if (r2 == 0) goto L_0x0081
            r2 = r1
            rka r2 = (defpackage.rka) r2
            goto L_0x0088
        L_0x0081:
            rjy r2 = new rjy
            r2.<init>(r6)
            goto L_0x0088
        L_0x0087:
        L_0x0088:
            r4.a((com.google.android.gms.location.places.internal.PlacesParams) r5, (java.lang.String) r0, (defpackage.rka) r2)
            goto L_0x0211
        L_0x008d:
            android.os.Parcelable$Creator r5 = com.google.android.gms.location.places.fencing.PlacefencingRequest.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.location.places.fencing.PlacefencingRequest r5 = (com.google.android.gms.location.places.fencing.PlacefencingRequest) r5
            android.os.Parcelable$Creator r0 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.location.places.internal.PlacesParams r0 = (com.google.android.gms.location.places.internal.PlacesParams) r0
            android.os.Parcelable$Creator r3 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r3)
            android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x00bd
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.rka
            if (r2 == 0) goto L_0x00b7
            r2 = r1
            rka r2 = (defpackage.rka) r2
            goto L_0x00be
        L_0x00b7:
            rjy r2 = new rjy
            r2.<init>(r6)
            goto L_0x00be
        L_0x00bd:
        L_0x00be:
            r4.a((com.google.android.gms.location.places.fencing.PlacefencingRequest) r5, (com.google.android.gms.location.places.internal.PlacesParams) r0, (android.app.PendingIntent) r3, (defpackage.rka) r2)
            goto L_0x0211
        L_0x00c3:
            android.os.Parcelable$Creator r5 = com.google.android.gms.location.places.PlacesClientIdentifier.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.location.places.PlacesClientIdentifier r5 = (com.google.android.gms.location.places.PlacesClientIdentifier) r5
            android.os.Parcelable$Creator r0 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.location.places.internal.PlacesParams r0 = (com.google.android.gms.location.places.internal.PlacesParams) r0
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x00eb
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.rka
            if (r2 == 0) goto L_0x00e5
            r2 = r1
            rka r2 = (defpackage.rka) r2
            goto L_0x00ec
        L_0x00e5:
            rjy r2 = new rjy
            r2.<init>(r6)
            goto L_0x00ec
        L_0x00eb:
        L_0x00ec:
            r4.a((com.google.android.gms.location.places.PlacesClientIdentifier) r5, (com.google.android.gms.location.places.internal.PlacesParams) r0, (defpackage.rka) r2)
            goto L_0x0211
        L_0x00f1:
            android.os.Parcelable$Creator r5 = com.google.android.gms.location.places.PlaceReport.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.location.places.PlaceReport r5 = (com.google.android.gms.location.places.PlaceReport) r5
            android.os.Parcelable$Creator r0 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.location.places.internal.PlacesParams r0 = (com.google.android.gms.location.places.internal.PlacesParams) r0
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x0119
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.rka
            if (r2 == 0) goto L_0x0113
            r2 = r1
            rka r2 = (defpackage.rka) r2
            goto L_0x011a
        L_0x0113:
            rjy r2 = new rjy
            r2.<init>(r6)
            goto L_0x011a
        L_0x0119:
        L_0x011a:
            r4.a((com.google.android.gms.location.places.PlaceReport) r5, (com.google.android.gms.location.places.internal.PlacesParams) r0, (defpackage.rka) r2)
            goto L_0x0211
        L_0x011f:
            android.os.Parcelable$Creator r5 = com.google.android.gms.location.places.PlaceFilter.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.location.places.PlaceFilter r5 = (com.google.android.gms.location.places.PlaceFilter) r5
            android.os.Parcelable$Creator r0 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.location.places.internal.PlacesParams r0 = (com.google.android.gms.location.places.internal.PlacesParams) r0
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x0147
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.rka
            if (r2 == 0) goto L_0x0141
            r2 = r1
            rka r2 = (defpackage.rka) r2
            goto L_0x0148
        L_0x0141:
            rjy r2 = new rjy
            r2.<init>(r6)
            goto L_0x0148
        L_0x0147:
        L_0x0148:
            r4.a((com.google.android.gms.location.places.PlaceFilter) r5, (com.google.android.gms.location.places.internal.PlacesParams) r0, (defpackage.rka) r2)
            goto L_0x0211
        L_0x014d:
            android.os.Parcelable$Creator r5 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.location.places.internal.PlacesParams r5 = (com.google.android.gms.location.places.internal.PlacesParams) r5
            android.os.Parcelable$Creator r0 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x0175
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.rka
            if (r2 == 0) goto L_0x016f
            r2 = r1
            rka r2 = (defpackage.rka) r2
            goto L_0x0176
        L_0x016f:
            rjy r2 = new rjy
            r2.<init>(r6)
            goto L_0x0176
        L_0x0175:
        L_0x0176:
            r4.b(r5, r0, r2)
            goto L_0x0211
        L_0x017b:
            android.os.Parcelable$Creator r5 = com.google.android.gms.location.places.NearbyAlertRequest.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.location.places.NearbyAlertRequest r5 = (com.google.android.gms.location.places.NearbyAlertRequest) r5
            android.os.Parcelable$Creator r0 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.location.places.internal.PlacesParams r0 = (com.google.android.gms.location.places.internal.PlacesParams) r0
            android.os.Parcelable$Creator r3 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r3)
            android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x01ab
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.rka
            if (r2 == 0) goto L_0x01a5
            r2 = r1
            rka r2 = (defpackage.rka) r2
            goto L_0x01ac
        L_0x01a5:
            rjy r2 = new rjy
            r2.<init>(r6)
            goto L_0x01ac
        L_0x01ab:
        L_0x01ac:
            r4.a((com.google.android.gms.location.places.NearbyAlertRequest) r5, (com.google.android.gms.location.places.internal.PlacesParams) r0, (android.app.PendingIntent) r3, (defpackage.rka) r2)
            goto L_0x0211
        L_0x01b0:
            android.os.Parcelable$Creator r5 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.location.places.internal.PlacesParams r5 = (com.google.android.gms.location.places.internal.PlacesParams) r5
            android.os.Parcelable$Creator r0 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x01d8
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.rka
            if (r2 == 0) goto L_0x01d2
            r2 = r1
            rka r2 = (defpackage.rka) r2
            goto L_0x01d9
        L_0x01d2:
            rjy r2 = new rjy
            r2.<init>(r6)
            goto L_0x01d9
        L_0x01d8:
        L_0x01d9:
            r4.a((com.google.android.gms.location.places.internal.PlacesParams) r5, (android.app.PendingIntent) r0, (defpackage.rka) r2)
            goto L_0x0211
        L_0x01dd:
            android.os.Parcelable$Creator r5 = com.google.android.gms.location.places.PlaceRequest.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.location.places.PlaceRequest r5 = (com.google.android.gms.location.places.PlaceRequest) r5
            android.os.Parcelable$Creator r0 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.location.places.internal.PlacesParams r0 = (com.google.android.gms.location.places.internal.PlacesParams) r0
            android.os.Parcelable$Creator r3 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r3)
            android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x020d
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.rka
            if (r2 == 0) goto L_0x0207
            r2 = r1
            rka r2 = (defpackage.rka) r2
            goto L_0x020e
        L_0x0207:
            rjy r2 = new rjy
            r2.<init>(r6)
            goto L_0x020e
        L_0x020d:
        L_0x020e:
            r4.a((com.google.android.gms.location.places.PlaceRequest) r5, (com.google.android.gms.location.places.internal.PlacesParams) r0, (android.app.PendingIntent) r3, (defpackage.rka) r2)
        L_0x0211:
            r7.writeNoException()
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjq.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
