package defpackage;

/* renamed from: advi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class advi extends bhw implements advj {
    public advi() {
        super("com.google.android.gms.userlocation.internal.ISemanticLocationProviderClient");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: advg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: advg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: advg} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v10, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v15, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v25, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v30, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v35 */
    /* JADX WARNING: type inference failed for: r0v14, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r2v39, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v44, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v49, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v54 */
    /* JADX WARNING: type inference failed for: r0v22, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r2v58, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v63, types: [advf] */
    /* JADX WARNING: type inference failed for: r2v68 */
    /* JADX WARNING: type inference failed for: r2v69 */
    /* JADX WARNING: type inference failed for: r2v70 */
    /* JADX WARNING: type inference failed for: r2v71 */
    /* JADX WARNING: type inference failed for: r2v72 */
    /* JADX WARNING: type inference failed for: r2v73 */
    /* JADX WARNING: type inference failed for: r2v74 */
    /* JADX WARNING: type inference failed for: r2v75 */
    /* JADX WARNING: type inference failed for: r2v76 */
    /* JADX WARNING: type inference failed for: r2v77 */
    /* JADX WARNING: type inference failed for: r2v78 */
    /* JADX WARNING: type inference failed for: r2v79 */
    /* JADX WARNING: type inference failed for: r2v80 */
    /* JADX WARNING: type inference failed for: r2v81 */
    /* JADX WARNING: type inference failed for: r2v82 */
    /* JADX WARNING: type inference failed for: r2v83 */
    /* JADX WARNING: type inference failed for: r2v84 */
    /* JADX WARNING: type inference failed for: r2v85 */
    /* JADX WARNING: type inference failed for: r2v86 */
    /* JADX WARNING: type inference failed for: r2v87 */
    /* JADX WARNING: type inference failed for: r2v88 */
    /* JADX WARNING: type inference failed for: r2v89 */
    /* JADX WARNING: type inference failed for: r2v90 */
    /* JADX WARNING: type inference failed for: r2v91 */
    /* JADX WARNING: type inference failed for: r2v92 */
    /* JADX WARNING: type inference failed for: r2v93 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r10, android.os.Parcel r11, android.os.Parcel r12) {
        /*
            r9 = this;
            java.lang.String r0 = "com.google.android.gms.userlocation.internal.ISemanticLocationProviderCallbacks"
            java.lang.String r1 = "com.google.android.gms.common.api.internal.IStatusCallback"
            r2 = 0
            switch(r10) {
                case 1: goto L_0x02a2;
                case 2: goto L_0x027d;
                case 3: goto L_0x0248;
                case 4: goto L_0x021e;
                case 5: goto L_0x01d8;
                case 6: goto L_0x01ae;
                case 7: goto L_0x0180;
                case 8: goto L_0x013b;
                case 9: goto L_0x010d;
                case 10: goto L_0x00d7;
                case 11: goto L_0x00ad;
                case 12: goto L_0x0068;
                case 13: goto L_0x003a;
                case 14: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            r10 = 0
            return r10
        L_0x000a:
            android.os.Parcelable$Creator r10 = com.google.android.gms.userlocation.internal.UserLocationParameters.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.userlocation.internal.UserLocationParameters r10 = (com.google.android.gms.userlocation.internal.UserLocationParameters) r10
            android.os.IBinder r0 = r11.readStrongBinder()
            if (r0 == 0) goto L_0x002c
            java.lang.String r1 = "com.google.android.gms.userlocation.internal.IReportCheckInCallback"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.advf
            if (r2 == 0) goto L_0x0026
            r2 = r1
            advf r2 = (defpackage.advf) r2
            goto L_0x002d
        L_0x0026:
            advd r2 = new advd
            r2.<init>(r0)
            goto L_0x002d
        L_0x002c:
        L_0x002d:
            android.os.Parcelable$Creator r0 = com.google.android.gms.userlocation.CheckInReport.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.userlocation.CheckInReport r11 = (com.google.android.gms.userlocation.CheckInReport) r11
            r9.a((com.google.android.gms.userlocation.internal.UserLocationParameters) r10, (defpackage.advf) r2, (com.google.android.gms.userlocation.CheckInReport) r11)
            goto L_0x02ce
        L_0x003a:
            android.os.Parcelable$Creator r10 = com.google.android.gms.userlocation.internal.UserLocationParameters.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.userlocation.internal.UserLocationParameters r10 = (com.google.android.gms.userlocation.internal.UserLocationParameters) r10
            android.os.IBinder r0 = r11.readStrongBinder()
            if (r0 == 0) goto L_0x005a
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x0054
            r2 = r1
            ifu r2 = (defpackage.ifu) r2
            goto L_0x005b
        L_0x0054:
            ifs r2 = new ifs
            r2.<init>(r0)
            goto L_0x005b
        L_0x005a:
        L_0x005b:
            android.os.Parcelable$Creator r0 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r0)
            android.app.PendingIntent r11 = (android.app.PendingIntent) r11
            r9.b((com.google.android.gms.userlocation.internal.UserLocationParameters) r10, (defpackage.ifu) r2, (android.app.PendingIntent) r11)
            goto L_0x02ce
        L_0x0068:
            android.os.Parcelable$Creator r10 = com.google.android.gms.userlocation.internal.UserLocationParameters.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            r4 = r10
            com.google.android.gms.userlocation.internal.UserLocationParameters r4 = (com.google.android.gms.userlocation.internal.UserLocationParameters) r4
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x008a
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x0084
            r2 = r0
            ifu r2 = (defpackage.ifu) r2
            r5 = r2
            goto L_0x008c
        L_0x0084:
            ifs r2 = new ifs
            r2.<init>(r10)
            goto L_0x008b
        L_0x008a:
        L_0x008b:
            r5 = r2
        L_0x008c:
            android.os.Parcelable$Creator r10 = com.google.android.gms.userlocation.UserLocationNearbyAlertRequest.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            r6 = r10
            com.google.android.gms.userlocation.UserLocationNearbyAlertRequest r6 = (com.google.android.gms.userlocation.UserLocationNearbyAlertRequest) r6
            android.os.Parcelable$Creator r10 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            r7 = r10
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
            android.os.Parcelable$Creator r10 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            r8 = r10
            android.app.PendingIntent r8 = (android.app.PendingIntent) r8
            r3 = r9
            r3.a((com.google.android.gms.userlocation.internal.UserLocationParameters) r4, (defpackage.ifu) r5, (com.google.android.gms.userlocation.UserLocationNearbyAlertRequest) r6, (android.app.PendingIntent) r7, (android.app.PendingIntent) r8)
            goto L_0x02ce
        L_0x00ad:
            android.os.Parcelable$Creator r10 = com.google.android.gms.userlocation.internal.UserLocationParameters.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.userlocation.internal.UserLocationParameters r10 = (com.google.android.gms.userlocation.internal.UserLocationParameters) r10
            android.os.IBinder r0 = r11.readStrongBinder()
            if (r0 == 0) goto L_0x00cd
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x00c7
            r2 = r1
            ifu r2 = (defpackage.ifu) r2
            goto L_0x00ce
        L_0x00c7:
            ifs r2 = new ifs
            r2.<init>(r0)
            goto L_0x00ce
        L_0x00cd:
        L_0x00ce:
            java.lang.String r11 = r11.readString()
            r9.c(r10, r2, r11)
            goto L_0x02ce
        L_0x00d7:
            android.os.Parcelable$Creator r10 = com.google.android.gms.userlocation.internal.UserLocationParameters.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.userlocation.internal.UserLocationParameters r10 = (com.google.android.gms.userlocation.internal.UserLocationParameters) r10
            android.os.IBinder r0 = r11.readStrongBinder()
            if (r0 == 0) goto L_0x00f7
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x00f1
            r2 = r1
            ifu r2 = (defpackage.ifu) r2
            goto L_0x00f8
        L_0x00f1:
            ifs r2 = new ifs
            r2.<init>(r0)
            goto L_0x00f8
        L_0x00f7:
        L_0x00f8:
            android.os.Parcelable$Creator r0 = com.google.android.gms.location.places.fencing.PlacefencingRequest.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.location.places.fencing.PlacefencingRequest r0 = (com.google.android.gms.location.places.fencing.PlacefencingRequest) r0
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r1)
            android.app.PendingIntent r11 = (android.app.PendingIntent) r11
            r9.a((com.google.android.gms.userlocation.internal.UserLocationParameters) r10, (defpackage.ifu) r2, (com.google.android.gms.location.places.fencing.PlacefencingRequest) r0, (android.app.PendingIntent) r11)
            goto L_0x02ce
        L_0x010d:
            android.os.Parcelable$Creator r10 = com.google.android.gms.userlocation.internal.UserLocationParameters.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.userlocation.internal.UserLocationParameters r10 = (com.google.android.gms.userlocation.internal.UserLocationParameters) r10
            android.os.IBinder r0 = r11.readStrongBinder()
            if (r0 == 0) goto L_0x012d
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x0127
            r2 = r1
            ifu r2 = (defpackage.ifu) r2
            goto L_0x012e
        L_0x0127:
            ifs r2 = new ifs
            r2.<init>(r0)
            goto L_0x012e
        L_0x012d:
        L_0x012e:
            android.os.Parcelable$Creator r0 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r0)
            android.app.PendingIntent r11 = (android.app.PendingIntent) r11
            r9.a((com.google.android.gms.userlocation.internal.UserLocationParameters) r10, (defpackage.ifu) r2, (android.app.PendingIntent) r11)
            goto L_0x02ce
        L_0x013b:
            android.os.Parcelable$Creator r10 = com.google.android.gms.userlocation.internal.UserLocationParameters.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            r4 = r10
            com.google.android.gms.userlocation.internal.UserLocationParameters r4 = (com.google.android.gms.userlocation.internal.UserLocationParameters) r4
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x015d
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x0157
            r2 = r0
            ifu r2 = (defpackage.ifu) r2
            r5 = r2
            goto L_0x015f
        L_0x0157:
            ifs r2 = new ifs
            r2.<init>(r10)
            goto L_0x015e
        L_0x015d:
        L_0x015e:
            r5 = r2
        L_0x015f:
            android.os.Parcelable$Creator r10 = com.google.android.gms.userlocation.SemanticLocationEventRequest.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            r6 = r10
            com.google.android.gms.userlocation.SemanticLocationEventRequest r6 = (com.google.android.gms.userlocation.SemanticLocationEventRequest) r6
            android.os.Parcelable$Creator r10 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            r7 = r10
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
            android.os.Parcelable$Creator r10 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            r8 = r10
            android.app.PendingIntent r8 = (android.app.PendingIntent) r8
            r3 = r9
            r3.a((com.google.android.gms.userlocation.internal.UserLocationParameters) r4, (defpackage.ifu) r5, (com.google.android.gms.userlocation.SemanticLocationEventRequest) r6, (android.app.PendingIntent) r7, (android.app.PendingIntent) r8)
            goto L_0x02ce
        L_0x0180:
            android.os.Parcelable$Creator r10 = com.google.android.gms.userlocation.internal.UserLocationParameters.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.userlocation.internal.UserLocationParameters r10 = (com.google.android.gms.userlocation.internal.UserLocationParameters) r10
            android.os.IBinder r0 = r11.readStrongBinder()
            if (r0 == 0) goto L_0x01a0
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x019a
            r2 = r1
            ifu r2 = (defpackage.ifu) r2
            goto L_0x01a1
        L_0x019a:
            ifs r2 = new ifs
            r2.<init>(r0)
            goto L_0x01a1
        L_0x01a0:
        L_0x01a1:
            android.os.Parcelable$Creator r0 = com.google.android.gms.userlocation.CheckInReport.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.userlocation.CheckInReport r11 = (com.google.android.gms.userlocation.CheckInReport) r11
            r9.a((com.google.android.gms.userlocation.internal.UserLocationParameters) r10, (defpackage.ifu) r2, (com.google.android.gms.userlocation.CheckInReport) r11)
            goto L_0x02ce
        L_0x01ae:
            android.os.Parcelable$Creator r10 = com.google.android.gms.userlocation.internal.UserLocationParameters.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.userlocation.internal.UserLocationParameters r10 = (com.google.android.gms.userlocation.internal.UserLocationParameters) r10
            android.os.IBinder r0 = r11.readStrongBinder()
            if (r0 == 0) goto L_0x01ce
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x01c8
            r2 = r1
            ifu r2 = (defpackage.ifu) r2
            goto L_0x01cf
        L_0x01c8:
            ifs r2 = new ifs
            r2.<init>(r0)
            goto L_0x01cf
        L_0x01ce:
        L_0x01cf:
            java.lang.String r11 = r11.readString()
            r9.b((com.google.android.gms.userlocation.internal.UserLocationParameters) r10, (defpackage.ifu) r2, (java.lang.String) r11)
            goto L_0x02ce
        L_0x01d8:
            android.os.Parcelable$Creator r10 = com.google.android.gms.userlocation.internal.UserLocationParameters.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.userlocation.internal.UserLocationParameters r10 = (com.google.android.gms.userlocation.internal.UserLocationParameters) r10
            android.os.IBinder r3 = r11.readStrongBinder()
            if (r3 == 0) goto L_0x01f7
            android.os.IInterface r1 = r3.queryLocalInterface(r1)
            boolean r4 = r1 instanceof defpackage.ifu
            if (r4 == 0) goto L_0x01f1
            ifu r1 = (defpackage.ifu) r1
            goto L_0x01f8
        L_0x01f1:
            ifs r1 = new ifs
            r1.<init>(r3)
            goto L_0x01f8
        L_0x01f7:
            r1 = r2
        L_0x01f8:
            android.os.IBinder r3 = r11.readStrongBinder()
            if (r3 == 0) goto L_0x0210
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r2 = r0 instanceof defpackage.advg
            if (r2 == 0) goto L_0x020a
            r2 = r0
            advg r2 = (defpackage.advg) r2
            goto L_0x0211
        L_0x020a:
            advg r2 = new advg
            r2.<init>(r3)
            goto L_0x0211
        L_0x0210:
        L_0x0211:
            android.os.Parcelable$Creator r0 = com.google.android.gms.userlocation.SemanticLocationUpdateRequest.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.userlocation.SemanticLocationUpdateRequest r11 = (com.google.android.gms.userlocation.SemanticLocationUpdateRequest) r11
            r9.a((com.google.android.gms.userlocation.internal.UserLocationParameters) r10, (defpackage.ifu) r1, (defpackage.advg) r2, (com.google.android.gms.userlocation.SemanticLocationUpdateRequest) r11)
            goto L_0x02ce
        L_0x021e:
            android.os.Parcelable$Creator r10 = com.google.android.gms.userlocation.internal.UserLocationParameters.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.userlocation.internal.UserLocationParameters r10 = (com.google.android.gms.userlocation.internal.UserLocationParameters) r10
            android.os.IBinder r0 = r11.readStrongBinder()
            if (r0 == 0) goto L_0x023e
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x0238
            r2 = r1
            ifu r2 = (defpackage.ifu) r2
            goto L_0x023f
        L_0x0238:
            ifs r2 = new ifs
            r2.<init>(r0)
            goto L_0x023f
        L_0x023e:
        L_0x023f:
            java.lang.String r11 = r11.readString()
            r9.a((com.google.android.gms.userlocation.internal.UserLocationParameters) r10, (defpackage.ifu) r2, (java.lang.String) r11)
            goto L_0x02ce
        L_0x0248:
            android.os.Parcelable$Creator r10 = com.google.android.gms.userlocation.internal.UserLocationParameters.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.userlocation.internal.UserLocationParameters r10 = (com.google.android.gms.userlocation.internal.UserLocationParameters) r10
            android.os.IBinder r0 = r11.readStrongBinder()
            if (r0 == 0) goto L_0x0268
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x0262
            r2 = r1
            ifu r2 = (defpackage.ifu) r2
            goto L_0x0269
        L_0x0262:
            ifs r2 = new ifs
            r2.<init>(r0)
            goto L_0x0269
        L_0x0268:
        L_0x0269:
            android.os.Parcelable$Creator r0 = com.google.android.gms.userlocation.SemanticLocationEventRequest.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.userlocation.SemanticLocationEventRequest r0 = (com.google.android.gms.userlocation.SemanticLocationEventRequest) r0
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r1)
            android.app.PendingIntent r11 = (android.app.PendingIntent) r11
            r9.a((com.google.android.gms.userlocation.internal.UserLocationParameters) r10, (defpackage.ifu) r2, (com.google.android.gms.userlocation.SemanticLocationEventRequest) r0, (android.app.PendingIntent) r11)
            goto L_0x02ce
        L_0x027d:
            android.os.Parcelable$Creator r10 = com.google.android.gms.userlocation.internal.UserLocationParameters.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.userlocation.internal.UserLocationParameters r10 = (com.google.android.gms.userlocation.internal.UserLocationParameters) r10
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 == 0) goto L_0x029d
            android.os.IInterface r0 = r11.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.advg
            if (r1 == 0) goto L_0x0297
            r2 = r0
            advg r2 = (defpackage.advg) r2
            goto L_0x029e
        L_0x0297:
            advg r2 = new advg
            r2.<init>(r11)
            goto L_0x029e
        L_0x029d:
        L_0x029e:
            r9.a(r10, r2)
            goto L_0x02ce
        L_0x02a2:
            android.os.Parcelable$Creator r10 = com.google.android.gms.userlocation.internal.UserLocationParameters.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.userlocation.internal.UserLocationParameters r10 = (com.google.android.gms.userlocation.internal.UserLocationParameters) r10
            android.os.IBinder r1 = r11.readStrongBinder()
            if (r1 == 0) goto L_0x02c2
            android.os.IInterface r0 = r1.queryLocalInterface(r0)
            boolean r2 = r0 instanceof defpackage.advg
            if (r2 == 0) goto L_0x02bc
            r2 = r0
            advg r2 = (defpackage.advg) r2
            goto L_0x02c3
        L_0x02bc:
            advg r2 = new advg
            r2.<init>(r1)
            goto L_0x02c3
        L_0x02c2:
        L_0x02c3:
            android.os.Parcelable$Creator r0 = com.google.android.gms.userlocation.EstimationOptions.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.userlocation.EstimationOptions r11 = (com.google.android.gms.userlocation.EstimationOptions) r11
            r9.b(r10, r2)
        L_0x02ce:
            r12.writeNoException()
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.advi.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
