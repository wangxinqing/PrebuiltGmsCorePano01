package defpackage;

/* renamed from: hjw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class hjw extends bhw implements hjx {
    public hjw() {
        super("com.google.android.gms.chromesync.internal.IChromeSyncApiService");
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [hju] */
    /* JADX WARNING: type inference failed for: r2v6, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v11, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v16, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v20, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v25, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v30, types: [hju] */
    /* JADX WARNING: type inference failed for: r2v35, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v40, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v45, types: [ifu] */
    /* JADX WARNING: type inference failed for: r2v50, types: [hju] */
    /* JADX WARNING: type inference failed for: r2v55, types: [hju] */
    /* JADX WARNING: type inference failed for: r2v60, types: [hju] */
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
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r6, android.os.Parcel r7, android.os.Parcel r8) {
        /*
            r5 = this;
            r0 = 1
            java.lang.String r1 = "com.google.android.gms.chromesync.internal.IBundleCallback"
            r2 = 0
            if (r6 == r0) goto L_0x021f
            r3 = 2
            java.lang.String r4 = "com.google.android.gms.common.api.internal.IStatusCallback"
            if (r6 == r3) goto L_0x01f6
            r3 = 3
            if (r6 == r3) goto L_0x01c9
            r3 = 4
            if (r6 == r3) goto L_0x01ab
            switch(r6) {
                case 101: goto L_0x017d;
                case 102: goto L_0x014f;
                case 103: goto L_0x0125;
                case 104: goto L_0x00f3;
                case 105: goto L_0x00c1;
                case 106: goto L_0x0097;
                default: goto L_0x0014;
            }
        L_0x0014:
            switch(r6) {
                case 201: goto L_0x006d;
                case 202: goto L_0x0043;
                case 203: goto L_0x0019;
                default: goto L_0x0017;
            }
        L_0x0017:
            r6 = 0
            return r6
        L_0x0019:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x0031
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.hju
            if (r2 == 0) goto L_0x002b
            r2 = r1
            hju r2 = (defpackage.hju) r2
            goto L_0x0032
        L_0x002b:
            hjs r2 = new hjs
            r2.<init>(r6)
            goto L_0x0032
        L_0x0031:
        L_0x0032:
            java.util.ArrayList r6 = r7.createStringArrayList()
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r1)
            android.os.Bundle r7 = (android.os.Bundle) r7
            r5.a((defpackage.hju) r2, (java.util.List) r6)
            goto L_0x0243
        L_0x0043:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x005b
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.hju
            if (r2 == 0) goto L_0x0055
            r2 = r1
            hju r2 = (defpackage.hju) r2
            goto L_0x005c
        L_0x0055:
            hjs r2 = new hjs
            r2.<init>(r6)
            goto L_0x005c
        L_0x005b:
        L_0x005c:
            java.util.ArrayList r6 = r7.createStringArrayList()
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r1)
            android.os.Bundle r7 = (android.os.Bundle) r7
            r5.a((defpackage.hju) r2, (java.util.List) r6, (android.os.Bundle) r7)
            goto L_0x0243
        L_0x006d:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x0085
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.hju
            if (r2 == 0) goto L_0x007f
            r2 = r1
            hju r2 = (defpackage.hju) r2
            goto L_0x0086
        L_0x007f:
            hjs r2 = new hjs
            r2.<init>(r6)
            goto L_0x0086
        L_0x0085:
        L_0x0086:
            java.lang.String r6 = r7.readString()
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r1)
            android.os.Bundle r7 = (android.os.Bundle) r7
            r5.a((defpackage.hju) r2, (java.lang.String) r6)
            goto L_0x0243
        L_0x0097:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x00af
            android.os.IInterface r1 = r6.queryLocalInterface(r4)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x00a9
            r2 = r1
            ifu r2 = (defpackage.ifu) r2
            goto L_0x00b0
        L_0x00a9:
            ifs r2 = new ifs
            r2.<init>(r6)
            goto L_0x00b0
        L_0x00af:
        L_0x00b0:
            int r6 = r7.readInt()
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r1)
            android.os.Bundle r7 = (android.os.Bundle) r7
            r5.a((defpackage.ifu) r2, (int) r6)
            goto L_0x0243
        L_0x00c1:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x00d9
            android.os.IInterface r1 = r6.queryLocalInterface(r4)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x00d3
            r2 = r1
            ifu r2 = (defpackage.ifu) r2
            goto L_0x00da
        L_0x00d3:
            ifs r2 = new ifs
            r2.<init>(r6)
            goto L_0x00da
        L_0x00d9:
        L_0x00da:
            int r6 = r7.readInt()
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r3)
            android.os.Bundle r7 = (android.os.Bundle) r7
            r5.b((defpackage.ifu) r2, (int) r6, (android.os.Bundle) r1, (android.os.Bundle) r7)
            goto L_0x0243
        L_0x00f3:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x010b
            android.os.IInterface r1 = r6.queryLocalInterface(r4)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x0105
            r2 = r1
            ifu r2 = (defpackage.ifu) r2
            goto L_0x010c
        L_0x0105:
            ifs r2 = new ifs
            r2.<init>(r6)
            goto L_0x010c
        L_0x010b:
        L_0x010c:
            int r6 = r7.readInt()
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r3)
            android.os.Bundle r7 = (android.os.Bundle) r7
            r5.a((defpackage.ifu) r2, (int) r6, (android.os.Bundle) r1, (android.os.Bundle) r7)
            goto L_0x0243
        L_0x0125:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x013d
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.hju
            if (r2 == 0) goto L_0x0137
            r2 = r1
            hju r2 = (defpackage.hju) r2
            goto L_0x013e
        L_0x0137:
            hjs r2 = new hjs
            r2.<init>(r6)
            goto L_0x013e
        L_0x013d:
        L_0x013e:
            int r6 = r7.readInt()
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r1)
            android.os.Bundle r7 = (android.os.Bundle) r7
            r5.a((defpackage.hju) r2, (int) r6, (android.os.Bundle) r7)
            goto L_0x0243
        L_0x014f:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x0167
            android.os.IInterface r1 = r6.queryLocalInterface(r4)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x0161
            r2 = r1
            ifu r2 = (defpackage.ifu) r2
            goto L_0x0168
        L_0x0161:
            ifs r2 = new ifs
            r2.<init>(r6)
            goto L_0x0168
        L_0x0167:
        L_0x0168:
            int r6 = r7.readInt()
            java.lang.String r1 = r7.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r3)
            android.os.Bundle r7 = (android.os.Bundle) r7
            r5.b((defpackage.ifu) r2, (int) r6, (java.lang.String) r1, (android.os.Bundle) r7)
            goto L_0x0243
        L_0x017d:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x0195
            android.os.IInterface r1 = r6.queryLocalInterface(r4)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x018f
            r2 = r1
            ifu r2 = (defpackage.ifu) r2
            goto L_0x0196
        L_0x018f:
            ifs r2 = new ifs
            r2.<init>(r6)
            goto L_0x0196
        L_0x0195:
        L_0x0196:
            int r6 = r7.readInt()
            java.lang.String r1 = r7.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r3)
            android.os.Bundle r7 = (android.os.Bundle) r7
            r5.a((defpackage.ifu) r2, (int) r6, (java.lang.String) r1, (android.os.Bundle) r7)
            goto L_0x0243
        L_0x01ab:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x01c3
            android.os.IInterface r7 = r6.queryLocalInterface(r4)
            boolean r1 = r7 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x01bd
            r2 = r7
            ifu r2 = (defpackage.ifu) r2
            goto L_0x01c4
        L_0x01bd:
            ifs r2 = new ifs
            r2.<init>(r6)
            goto L_0x01c4
        L_0x01c3:
        L_0x01c4:
            r5.a(r2)
            goto L_0x0243
        L_0x01c9:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x01e1
            android.os.IInterface r1 = r6.queryLocalInterface(r4)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x01db
            r2 = r1
            ifu r2 = (defpackage.ifu) r2
            goto L_0x01e2
        L_0x01db:
            ifs r2 = new ifs
            r2.<init>(r6)
            goto L_0x01e2
        L_0x01e1:
        L_0x01e2:
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            android.os.Parcelable r6 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r6)
            android.os.Bundle r6 = (android.os.Bundle) r6
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r1)
            android.os.Bundle r7 = (android.os.Bundle) r7
            r5.a((defpackage.ifu) r2, (android.os.Bundle) r6)
            goto L_0x0243
        L_0x01f6:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x020e
            android.os.IInterface r1 = r6.queryLocalInterface(r4)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x0208
            r2 = r1
            ifu r2 = (defpackage.ifu) r2
            goto L_0x020f
        L_0x0208:
            ifs r2 = new ifs
            r2.<init>(r6)
            goto L_0x020f
        L_0x020e:
        L_0x020f:
            java.lang.String r6 = r7.readString()
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r1)
            android.os.Bundle r7 = (android.os.Bundle) r7
            r5.a((defpackage.ifu) r2, (java.lang.String) r6, (android.os.Bundle) r7)
            goto L_0x0243
        L_0x021f:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x0237
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.hju
            if (r2 == 0) goto L_0x0231
            r2 = r1
            hju r2 = (defpackage.hju) r2
            goto L_0x0238
        L_0x0231:
            hjs r2 = new hjs
            r2.<init>(r6)
            goto L_0x0238
        L_0x0237:
        L_0x0238:
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            android.os.Parcelable r6 = defpackage.bhx.a((android.os.Parcel) r7, (android.os.Parcelable.Creator) r6)
            android.os.Bundle r6 = (android.os.Bundle) r6
            r5.a((defpackage.hju) r2, (android.os.Bundle) r6)
        L_0x0243:
            r8.writeNoException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hjw.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
