package defpackage;

/* renamed from: rjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class rjt extends bhw implements rju {
    public rjt() {
        super("com.google.android.gms.location.places.internal.IGooglePlacesService");
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r13v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r3v5, types: [rka] */
    /* JADX WARNING: type inference failed for: r3v10, types: [rka] */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r13v13, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r3v18, types: [rka] */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r13v15, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r3v26, types: [rka] */
    /* JADX WARNING: type inference failed for: r3v30, types: [rjx] */
    /* JADX WARNING: type inference failed for: r3v34 */
    /* JADX WARNING: type inference failed for: r13v21, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r3v38, types: [rla] */
    /* JADX WARNING: type inference failed for: r3v42, types: [rka] */
    /* JADX WARNING: type inference failed for: r3v46, types: [rka] */
    /* JADX WARNING: type inference failed for: r3v50, types: [rla] */
    /* JADX WARNING: type inference failed for: r3v54, types: [rla] */
    /* JADX WARNING: type inference failed for: r3v58, types: [rka] */
    /* JADX WARNING: type inference failed for: r3v62, types: [rld] */
    /* JADX WARNING: type inference failed for: r3v66 */
    /* JADX WARNING: type inference failed for: r13v29, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r3v70 */
    /* JADX WARNING: type inference failed for: r3v71 */
    /* JADX WARNING: type inference failed for: r3v72 */
    /* JADX WARNING: type inference failed for: r3v73 */
    /* JADX WARNING: type inference failed for: r3v74 */
    /* JADX WARNING: type inference failed for: r3v75 */
    /* JADX WARNING: type inference failed for: r3v76 */
    /* JADX WARNING: type inference failed for: r3v77 */
    /* JADX WARNING: type inference failed for: r3v78 */
    /* JADX WARNING: type inference failed for: r3v79 */
    /* JADX WARNING: type inference failed for: r3v80 */
    /* JADX WARNING: type inference failed for: r3v81 */
    /* JADX WARNING: type inference failed for: r3v82 */
    /* JADX WARNING: type inference failed for: r3v83 */
    /* JADX WARNING: type inference failed for: r3v84 */
    /* JADX WARNING: type inference failed for: r3v85 */
    /* JADX WARNING: type inference failed for: r3v86 */
    /* JADX WARNING: type inference failed for: r3v87 */
    /* JADX WARNING: type inference failed for: r3v88 */
    /* JADX WARNING: type inference failed for: r3v89 */
    /* JADX WARNING: type inference failed for: r3v90 */
    /* JADX WARNING: type inference failed for: r3v91 */
    /* JADX WARNING: type inference failed for: r3v92 */
    /* JADX WARNING: type inference failed for: r3v93 */
    /* JADX WARNING: type inference failed for: r3v94 */
    /* JADX WARNING: type inference failed for: r3v95 */
    /* JADX WARNING: type inference failed for: r3v96 */
    /* JADX WARNING: type inference failed for: r3v97 */
    /* JADX WARNING: type inference failed for: r3v98 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r12, android.os.Parcel r13, android.os.Parcel r14) {
        /*
            r11 = this;
            java.lang.String r0 = "com.google.android.gms.location.places.internal.IPhotosCallbacks"
            java.lang.String r1 = "com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks"
            java.lang.String r2 = "com.google.android.gms.location.places.internal.IPlacesCallbacks"
            r3 = 0
            switch(r12) {
                case 2: goto L_0x040d;
                case 3: goto L_0x000a;
                case 4: goto L_0x03d8;
                case 5: goto L_0x03af;
                case 6: goto L_0x038b;
                case 7: goto L_0x0367;
                case 8: goto L_0x032e;
                case 9: goto L_0x0314;
                case 10: goto L_0x0302;
                case 11: goto L_0x02e8;
                case 12: goto L_0x02d6;
                case 13: goto L_0x0296;
                case 14: goto L_0x0268;
                case 15: goto L_0x0256;
                case 16: goto L_0x0220;
                case 17: goto L_0x01f6;
                case 18: goto L_0x01cf;
                case 19: goto L_0x01a5;
                case 20: goto L_0x016b;
                case 21: goto L_0x013e;
                case 22: goto L_0x0110;
                case 23: goto L_0x00ea;
                case 24: goto L_0x00c4;
                case 25: goto L_0x009e;
                case 26: goto L_0x0078;
                case 27: goto L_0x0050;
                case 28: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            r12 = 0
            return r12
        L_0x000c:
            java.lang.String r5 = r13.readString()
            android.os.Parcelable$Creator r12 = com.google.android.gms.maps.model.LatLngBounds.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            r6 = r12
            com.google.android.gms.maps.model.LatLngBounds r6 = (com.google.android.gms.maps.model.LatLngBounds) r6
            int r7 = r13.readInt()
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.AutocompleteFilter.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            r8 = r12
            com.google.android.gms.location.places.AutocompleteFilter r8 = (com.google.android.gms.location.places.AutocompleteFilter) r8
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            r9 = r12
            com.google.android.gms.location.places.internal.PlacesParams r9 = (com.google.android.gms.location.places.internal.PlacesParams) r9
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x0048
            android.os.IInterface r13 = r12.queryLocalInterface(r2)
            boolean r0 = r13 instanceof defpackage.rka
            if (r0 == 0) goto L_0x0042
            r3 = r13
            rka r3 = (defpackage.rka) r3
            r10 = r3
            goto L_0x004a
        L_0x0042:
            rjy r3 = new rjy
            r3.<init>(r12)
            goto L_0x0049
        L_0x0048:
        L_0x0049:
            r10 = r3
        L_0x004a:
            r4 = r11
            r4.a((java.lang.String) r5, (com.google.android.gms.maps.model.LatLngBounds) r6, (int) r7, (com.google.android.gms.location.places.AutocompleteFilter) r8, (com.google.android.gms.location.places.internal.PlacesParams) r9, (defpackage.rka) r10)
            goto L_0x044f
        L_0x0050:
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.internal.PlacesParams r12 = (com.google.android.gms.location.places.internal.PlacesParams) r12
            android.os.IBinder r13 = r13.readStrongBinder()
            if (r13 == 0) goto L_0x0072
            java.lang.String r0 = "com.google.android.gms.location.places.personalized.IUserPlacesCallbacks"
            android.os.IInterface r0 = r13.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.rld
            if (r1 == 0) goto L_0x006c
            r3 = r0
            rld r3 = (defpackage.rld) r3
            goto L_0x0073
        L_0x006c:
            rlb r3 = new rlb
            r3.<init>(r13)
            goto L_0x0073
        L_0x0072:
        L_0x0073:
            r11.a((com.google.android.gms.location.places.internal.PlacesParams) r12, (defpackage.rld) r3)
            goto L_0x044f
        L_0x0078:
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.internal.PlacesParams r12 = (com.google.android.gms.location.places.internal.PlacesParams) r12
            android.os.IBinder r13 = r13.readStrongBinder()
            if (r13 == 0) goto L_0x0098
            android.os.IInterface r0 = r13.queryLocalInterface(r2)
            boolean r1 = r0 instanceof defpackage.rka
            if (r1 == 0) goto L_0x0092
            r3 = r0
            rka r3 = (defpackage.rka) r3
            goto L_0x0099
        L_0x0092:
            rjy r3 = new rjy
            r3.<init>(r13)
            goto L_0x0099
        L_0x0098:
        L_0x0099:
            r11.b((com.google.android.gms.location.places.internal.PlacesParams) r12, (defpackage.rka) r3)
            goto L_0x044f
        L_0x009e:
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.internal.PlacesParams r12 = (com.google.android.gms.location.places.internal.PlacesParams) r12
            android.os.IBinder r13 = r13.readStrongBinder()
            if (r13 == 0) goto L_0x00be
            android.os.IInterface r0 = r13.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.rla
            if (r1 == 0) goto L_0x00b8
            r3 = r0
            rla r3 = (defpackage.rla) r3
            goto L_0x00bf
        L_0x00b8:
            rky r3 = new rky
            r3.<init>(r13)
            goto L_0x00bf
        L_0x00be:
        L_0x00bf:
            r11.b((com.google.android.gms.location.places.internal.PlacesParams) r12, (defpackage.rla) r3)
            goto L_0x044f
        L_0x00c4:
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.internal.PlacesParams r12 = (com.google.android.gms.location.places.internal.PlacesParams) r12
            android.os.IBinder r13 = r13.readStrongBinder()
            if (r13 == 0) goto L_0x00e4
            android.os.IInterface r0 = r13.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.rla
            if (r1 == 0) goto L_0x00de
            r3 = r0
            rla r3 = (defpackage.rla) r3
            goto L_0x00e5
        L_0x00de:
            rky r3 = new rky
            r3.<init>(r13)
            goto L_0x00e5
        L_0x00e4:
        L_0x00e5:
            r11.a((com.google.android.gms.location.places.internal.PlacesParams) r12, (defpackage.rla) r3)
            goto L_0x044f
        L_0x00ea:
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.internal.PlacesParams r12 = (com.google.android.gms.location.places.internal.PlacesParams) r12
            android.os.IBinder r13 = r13.readStrongBinder()
            if (r13 == 0) goto L_0x010a
            android.os.IInterface r0 = r13.queryLocalInterface(r2)
            boolean r1 = r0 instanceof defpackage.rka
            if (r1 == 0) goto L_0x0104
            r3 = r0
            rka r3 = (defpackage.rka) r3
            goto L_0x010b
        L_0x0104:
            rjy r3 = new rjy
            r3.<init>(r13)
            goto L_0x010b
        L_0x010a:
        L_0x010b:
            r11.a((com.google.android.gms.location.places.internal.PlacesParams) r12, (defpackage.rka) r3)
            goto L_0x044f
        L_0x0110:
            android.os.Parcelable$Creator r12 = com.google.android.gms.maps.model.LatLng.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.maps.model.LatLng r12 = (com.google.android.gms.maps.model.LatLng) r12
            android.os.Parcelable$Creator r0 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.location.places.internal.PlacesParams r0 = (com.google.android.gms.location.places.internal.PlacesParams) r0
            android.os.IBinder r13 = r13.readStrongBinder()
            if (r13 == 0) goto L_0x0138
            android.os.IInterface r1 = r13.queryLocalInterface(r2)
            boolean r2 = r1 instanceof defpackage.rka
            if (r2 == 0) goto L_0x0132
            r3 = r1
            rka r3 = (defpackage.rka) r3
            goto L_0x0139
        L_0x0132:
            rjy r3 = new rjy
            r3.<init>(r13)
            goto L_0x0139
        L_0x0138:
        L_0x0139:
            r11.a((com.google.android.gms.maps.model.LatLng) r12, (com.google.android.gms.location.places.internal.PlacesParams) r0, (defpackage.rka) r3)
            goto L_0x044f
        L_0x013e:
            java.lang.String r12 = r13.readString()
            r13.readString()
            android.os.Parcelable$Creator r0 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.location.places.internal.PlacesParams r0 = (com.google.android.gms.location.places.internal.PlacesParams) r0
            android.os.IBinder r13 = r13.readStrongBinder()
            if (r13 == 0) goto L_0x0165
            android.os.IInterface r1 = r13.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.rla
            if (r2 == 0) goto L_0x015f
            r3 = r1
            rla r3 = (defpackage.rla) r3
            goto L_0x0166
        L_0x015f:
            rky r3 = new rky
            r3.<init>(r13)
            goto L_0x0166
        L_0x0165:
        L_0x0166:
            r11.a((java.lang.String) r12, (com.google.android.gms.location.places.internal.PlacesParams) r0, (defpackage.rla) r3)
            goto L_0x044f
        L_0x016b:
            java.lang.String r5 = r13.readString()
            int r6 = r13.readInt()
            int r7 = r13.readInt()
            int r8 = r13.readInt()
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            r9 = r12
            com.google.android.gms.location.places.internal.PlacesParams r9 = (com.google.android.gms.location.places.internal.PlacesParams) r9
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x019d
            android.os.IInterface r13 = r12.queryLocalInterface(r0)
            boolean r0 = r13 instanceof defpackage.rjx
            if (r0 == 0) goto L_0x0197
            r3 = r13
            rjx r3 = (defpackage.rjx) r3
            r10 = r3
            goto L_0x019f
        L_0x0197:
            rjv r3 = new rjv
            r3.<init>(r12)
            goto L_0x019e
        L_0x019d:
        L_0x019e:
            r10 = r3
        L_0x019f:
            r4 = r11
            r4.a((java.lang.String) r5, (int) r6, (int) r7, (int) r8, (com.google.android.gms.location.places.internal.PlacesParams) r9, (defpackage.rjx) r10)
            goto L_0x044f
        L_0x01a5:
            java.lang.String r12 = r13.readString()
            android.os.Parcelable$Creator r1 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r1 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r1)
            com.google.android.gms.location.places.internal.PlacesParams r1 = (com.google.android.gms.location.places.internal.PlacesParams) r1
            android.os.IBinder r13 = r13.readStrongBinder()
            if (r13 == 0) goto L_0x01c9
            android.os.IInterface r0 = r13.queryLocalInterface(r0)
            boolean r2 = r0 instanceof defpackage.rjx
            if (r2 == 0) goto L_0x01c3
            r3 = r0
            rjx r3 = (defpackage.rjx) r3
            goto L_0x01ca
        L_0x01c3:
            rjv r3 = new rjv
            r3.<init>(r13)
            goto L_0x01ca
        L_0x01c9:
        L_0x01ca:
            r11.a((java.lang.String) r12, (com.google.android.gms.location.places.internal.PlacesParams) r1, (defpackage.rjx) r3)
            goto L_0x044f
        L_0x01cf:
            r13.readString()
            r13.readInt()
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.internal.PlacesParams r12 = (com.google.android.gms.location.places.internal.PlacesParams) r12
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x044f
            android.os.IInterface r13 = r12.queryLocalInterface(r2)
            boolean r0 = r13 instanceof defpackage.rka
            if (r0 == 0) goto L_0x01ef
            rka r13 = (defpackage.rka) r13
            goto L_0x044f
        L_0x01ef:
            rjy r13 = new rjy
            r13.<init>(r12)
            goto L_0x044f
        L_0x01f6:
            java.util.ArrayList r12 = r13.createStringArrayList()
            android.os.Parcelable$Creator r0 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.location.places.internal.PlacesParams r0 = (com.google.android.gms.location.places.internal.PlacesParams) r0
            android.os.IBinder r13 = r13.readStrongBinder()
            if (r13 == 0) goto L_0x021a
            android.os.IInterface r1 = r13.queryLocalInterface(r2)
            boolean r2 = r1 instanceof defpackage.rka
            if (r2 == 0) goto L_0x0214
            r3 = r1
            rka r3 = (defpackage.rka) r3
            goto L_0x021b
        L_0x0214:
            rjy r3 = new rjy
            r3.<init>(r13)
            goto L_0x021b
        L_0x021a:
        L_0x021b:
            r11.a((java.util.List) r12, (com.google.android.gms.location.places.internal.PlacesParams) r0, (defpackage.rka) r3)
            goto L_0x044f
        L_0x0220:
            java.lang.String r5 = r13.readString()
            java.lang.String r6 = r13.readString()
            java.lang.String r7 = r13.readString()
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            r8 = r12
            com.google.android.gms.location.places.internal.PlacesParams r8 = (com.google.android.gms.location.places.internal.PlacesParams) r8
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x024e
            android.os.IInterface r13 = r12.queryLocalInterface(r1)
            boolean r0 = r13 instanceof defpackage.rla
            if (r0 == 0) goto L_0x0248
            r3 = r13
            rla r3 = (defpackage.rla) r3
            r9 = r3
            goto L_0x0250
        L_0x0248:
            rky r3 = new rky
            r3.<init>(r12)
            goto L_0x024f
        L_0x024e:
        L_0x024f:
            r9 = r3
        L_0x0250:
            r4 = r11
            r4.a((java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (com.google.android.gms.location.places.internal.PlacesParams) r8, (defpackage.rla) r9)
            goto L_0x044f
        L_0x0256:
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.PlaceReport.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.PlaceReport r12 = (com.google.android.gms.location.places.PlaceReport) r12
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.internal.PlacesParams r12 = (com.google.android.gms.location.places.internal.PlacesParams) r12
            goto L_0x044f
        L_0x0268:
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.AddPlaceRequest.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.AddPlaceRequest r12 = (com.google.android.gms.location.places.AddPlaceRequest) r12
            android.os.Parcelable$Creator r0 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.location.places.internal.PlacesParams r0 = (com.google.android.gms.location.places.internal.PlacesParams) r0
            android.os.IBinder r13 = r13.readStrongBinder()
            if (r13 == 0) goto L_0x0290
            android.os.IInterface r1 = r13.queryLocalInterface(r2)
            boolean r2 = r1 instanceof defpackage.rka
            if (r2 == 0) goto L_0x028a
            r3 = r1
            rka r3 = (defpackage.rka) r3
            goto L_0x0291
        L_0x028a:
            rjy r3 = new rjy
            r3.<init>(r13)
            goto L_0x0291
        L_0x0290:
        L_0x0291:
            r11.a((com.google.android.gms.location.places.AddPlaceRequest) r12, (com.google.android.gms.location.places.internal.PlacesParams) r0, (defpackage.rka) r3)
            goto L_0x044f
        L_0x0296:
            java.lang.String r5 = r13.readString()
            android.os.Parcelable$Creator r12 = com.google.android.gms.maps.model.LatLngBounds.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            r6 = r12
            com.google.android.gms.maps.model.LatLngBounds r6 = (com.google.android.gms.maps.model.LatLngBounds) r6
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.AutocompleteFilter.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            r7 = r12
            com.google.android.gms.location.places.AutocompleteFilter r7 = (com.google.android.gms.location.places.AutocompleteFilter) r7
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            r8 = r12
            com.google.android.gms.location.places.internal.PlacesParams r8 = (com.google.android.gms.location.places.internal.PlacesParams) r8
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x02ce
            android.os.IInterface r13 = r12.queryLocalInterface(r2)
            boolean r0 = r13 instanceof defpackage.rka
            if (r0 == 0) goto L_0x02c8
            r3 = r13
            rka r3 = (defpackage.rka) r3
            r9 = r3
            goto L_0x02d0
        L_0x02c8:
            rjy r3 = new rjy
            r3.<init>(r12)
            goto L_0x02cf
        L_0x02ce:
        L_0x02cf:
            r9 = r3
        L_0x02d0:
            r4 = r11
            r4.a((java.lang.String) r5, (com.google.android.gms.maps.model.LatLngBounds) r6, (com.google.android.gms.location.places.AutocompleteFilter) r7, (com.google.android.gms.location.places.internal.PlacesParams) r8, (defpackage.rka) r9)
            goto L_0x044f
        L_0x02d6:
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.internal.PlacesParams r12 = (com.google.android.gms.location.places.internal.PlacesParams) r12
            android.os.Parcelable$Creator r12 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            android.app.PendingIntent r12 = (android.app.PendingIntent) r12
            goto L_0x044f
        L_0x02e8:
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.NearbyAlertRequest.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.NearbyAlertRequest r12 = (com.google.android.gms.location.places.NearbyAlertRequest) r12
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.internal.PlacesParams r12 = (com.google.android.gms.location.places.internal.PlacesParams) r12
            android.os.Parcelable$Creator r12 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            android.app.PendingIntent r12 = (android.app.PendingIntent) r12
            goto L_0x044f
        L_0x0302:
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.internal.PlacesParams r12 = (com.google.android.gms.location.places.internal.PlacesParams) r12
            android.os.Parcelable$Creator r12 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            android.app.PendingIntent r12 = (android.app.PendingIntent) r12
            goto L_0x044f
        L_0x0314:
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.PlaceRequest.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.PlaceRequest r12 = (com.google.android.gms.location.places.PlaceRequest) r12
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.internal.PlacesParams r12 = (com.google.android.gms.location.places.internal.PlacesParams) r12
            android.os.Parcelable$Creator r12 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            android.app.PendingIntent r12 = (android.app.PendingIntent) r12
            goto L_0x044f
        L_0x032e:
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.UserDataType.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.UserDataType r12 = (com.google.android.gms.location.places.UserDataType) r12
            android.os.Parcelable$Creator r0 = com.google.android.gms.maps.model.LatLngBounds.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.maps.model.LatLngBounds r0 = (com.google.android.gms.maps.model.LatLngBounds) r0
            r13.createStringArrayList()
            android.os.Parcelable$Creator r0 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.location.places.internal.PlacesParams r0 = (com.google.android.gms.location.places.internal.PlacesParams) r0
            android.os.IBinder r13 = r13.readStrongBinder()
            if (r13 == 0) goto L_0x0361
            android.os.IInterface r1 = r13.queryLocalInterface(r2)
            boolean r2 = r1 instanceof defpackage.rka
            if (r2 == 0) goto L_0x035b
            r3 = r1
            rka r3 = (defpackage.rka) r3
            goto L_0x0362
        L_0x035b:
            rjy r3 = new rjy
            r3.<init>(r13)
            goto L_0x0362
        L_0x0361:
        L_0x0362:
            r11.a((com.google.android.gms.location.places.UserDataType) r12, (com.google.android.gms.location.places.internal.PlacesParams) r0, (defpackage.rka) r3)
            goto L_0x044f
        L_0x0367:
            r13.createStringArrayList()
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.internal.PlacesParams r12 = (com.google.android.gms.location.places.internal.PlacesParams) r12
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x044f
            android.os.IInterface r13 = r12.queryLocalInterface(r2)
            boolean r0 = r13 instanceof defpackage.rka
            if (r0 == 0) goto L_0x0384
            rka r13 = (defpackage.rka) r13
            goto L_0x044f
        L_0x0384:
            rjy r13 = new rjy
            r13.<init>(r12)
            goto L_0x044f
        L_0x038b:
            r13.readString()
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.internal.PlacesParams r12 = (com.google.android.gms.location.places.internal.PlacesParams) r12
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x044f
            android.os.IInterface r13 = r12.queryLocalInterface(r2)
            boolean r0 = r13 instanceof defpackage.rka
            if (r0 == 0) goto L_0x03a8
            rka r13 = (defpackage.rka) r13
            goto L_0x044f
        L_0x03a8:
            rjy r13 = new rjy
            r13.<init>(r12)
            goto L_0x044f
        L_0x03af:
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.PlaceFilter.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.PlaceFilter r12 = (com.google.android.gms.location.places.PlaceFilter) r12
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.location.places.internal.PlacesParams r12 = (com.google.android.gms.location.places.internal.PlacesParams) r12
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x044f
            android.os.IInterface r13 = r12.queryLocalInterface(r2)
            boolean r0 = r13 instanceof defpackage.rka
            if (r0 == 0) goto L_0x03d1
            rka r13 = (defpackage.rka) r13
            goto L_0x044f
        L_0x03d1:
            rjy r13 = new rjy
            r13.<init>(r12)
            goto L_0x044f
        L_0x03d8:
            android.os.Parcelable$Creator r12 = com.google.android.gms.maps.model.LatLng.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            com.google.android.gms.maps.model.LatLng r12 = (com.google.android.gms.maps.model.LatLng) r12
            android.os.Parcelable$Creator r0 = com.google.android.gms.location.places.PlaceFilter.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.location.places.PlaceFilter r0 = (com.google.android.gms.location.places.PlaceFilter) r0
            android.os.Parcelable$Creator r1 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r1 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r1)
            com.google.android.gms.location.places.internal.PlacesParams r1 = (com.google.android.gms.location.places.internal.PlacesParams) r1
            android.os.IBinder r13 = r13.readStrongBinder()
            if (r13 == 0) goto L_0x0408
            android.os.IInterface r2 = r13.queryLocalInterface(r2)
            boolean r3 = r2 instanceof defpackage.rka
            if (r3 == 0) goto L_0x0402
            r3 = r2
            rka r3 = (defpackage.rka) r3
            goto L_0x0409
        L_0x0402:
            rjy r3 = new rjy
            r3.<init>(r13)
            goto L_0x0409
        L_0x0408:
        L_0x0409:
            r11.a(r12, r0, r1, r3)
            goto L_0x044f
        L_0x040d:
            android.os.Parcelable$Creator r12 = com.google.android.gms.maps.model.LatLngBounds.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            r5 = r12
            com.google.android.gms.maps.model.LatLngBounds r5 = (com.google.android.gms.maps.model.LatLngBounds) r5
            int r6 = r13.readInt()
            java.lang.String r7 = r13.readString()
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.PlaceFilter.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            r8 = r12
            com.google.android.gms.location.places.PlaceFilter r8 = (com.google.android.gms.location.places.PlaceFilter) r8
            android.os.Parcelable$Creator r12 = com.google.android.gms.location.places.internal.PlacesParams.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r13, (android.os.Parcelable.Creator) r12)
            r9 = r12
            com.google.android.gms.location.places.internal.PlacesParams r9 = (com.google.android.gms.location.places.internal.PlacesParams) r9
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x0449
            android.os.IInterface r13 = r12.queryLocalInterface(r2)
            boolean r0 = r13 instanceof defpackage.rka
            if (r0 == 0) goto L_0x0443
            r3 = r13
            rka r3 = (defpackage.rka) r3
            r10 = r3
            goto L_0x044b
        L_0x0443:
            rjy r3 = new rjy
            r3.<init>(r12)
            goto L_0x044a
        L_0x0449:
        L_0x044a:
            r10 = r3
        L_0x044b:
            r4 = r11
            r4.a((com.google.android.gms.maps.model.LatLngBounds) r5, (int) r6, (java.lang.String) r7, (com.google.android.gms.location.places.PlaceFilter) r8, (com.google.android.gms.location.places.internal.PlacesParams) r9, (defpackage.rka) r10)
        L_0x044f:
            r14.writeNoException()
            r12 = 1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjt.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
