package defpackage;

/* renamed from: dut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class dut extends bhw implements duu {
    public dut() {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r6v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            r0 = 1
            java.lang.String r1 = "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks"
            r2 = 0
            if (r5 == r0) goto L_0x00a1
            r3 = 2
            if (r5 == r3) goto L_0x0084
            r3 = 5
            if (r5 == r3) goto L_0x005f
            r3 = 6
            if (r5 == r3) goto L_0x003a
            r3 = 7
            if (r5 == r3) goto L_0x0014
            r5 = 0
            return r5
        L_0x0014:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x002c
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.dux
            if (r2 == 0) goto L_0x0026
            r2 = r1
            dux r2 = (defpackage.dux) r2
            goto L_0x002d
        L_0x0026:
            duv r2 = new duv
            r2.<init>(r5)
            goto L_0x002d
        L_0x002c:
        L_0x002d:
            android.os.Parcelable$Creator r5 = com.google.firebase.appindexing.internal.ActionImpl.CREATOR
            java.lang.Object[] r5 = r6.createTypedArray(r5)
            com.google.firebase.appindexing.internal.ActionImpl[] r5 = (com.google.firebase.appindexing.internal.ActionImpl[]) r5
            r4.a((defpackage.dux) r2, (com.google.firebase.appindexing.internal.ActionImpl[]) r5)
            goto L_0x00c8
        L_0x003a:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0052
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.dux
            if (r2 == 0) goto L_0x004c
            r2 = r1
            dux r2 = (defpackage.dux) r2
            goto L_0x0053
        L_0x004c:
            duv r2 = new duv
            r2.<init>(r5)
            goto L_0x0053
        L_0x0052:
        L_0x0053:
            r6.readString()
            java.lang.String r5 = r6.readString()
            r4.a((defpackage.dux) r2, (java.lang.String) r5)
            goto L_0x00c8
        L_0x005f:
            android.os.Parcelable$Creator r5 = com.google.android.gms.appdatasearch.GetRecentContextCall$Request.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.appdatasearch.GetRecentContextCall$Request r5 = (com.google.android.gms.appdatasearch.GetRecentContextCall$Request) r5
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x007f
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.dux
            if (r2 == 0) goto L_0x0079
            r2 = r1
            dux r2 = (defpackage.dux) r2
            goto L_0x0080
        L_0x0079:
            duv r2 = new duv
            r2.<init>(r6)
            goto L_0x0080
        L_0x007f:
        L_0x0080:
            r4.a((com.google.android.gms.appdatasearch.GetRecentContextCall$Request) r5, (defpackage.dux) r2)
            goto L_0x00c8
        L_0x0084:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x009c
            android.os.IInterface r6 = r5.queryLocalInterface(r1)
            boolean r1 = r6 instanceof defpackage.dux
            if (r1 == 0) goto L_0x0096
            r2 = r6
            dux r2 = (defpackage.dux) r2
            goto L_0x009d
        L_0x0096:
            duv r2 = new duv
            r2.<init>(r5)
            goto L_0x009d
        L_0x009c:
        L_0x009d:
            r4.a(r2)
            goto L_0x00c8
        L_0x00a1:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x00b9
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.dux
            if (r2 == 0) goto L_0x00b3
            r2 = r1
            dux r2 = (defpackage.dux) r2
            goto L_0x00ba
        L_0x00b3:
            duv r2 = new duv
            r2.<init>(r5)
            goto L_0x00ba
        L_0x00b9:
        L_0x00ba:
            r6.readString()
            android.os.Parcelable$Creator r5 = com.google.android.gms.appdatasearch.UsageInfo.CREATOR
            java.lang.Object[] r5 = r6.createTypedArray(r5)
            com.google.android.gms.appdatasearch.UsageInfo[] r5 = (com.google.android.gms.appdatasearch.UsageInfo[]) r5
            r4.a((defpackage.dux) r2, (com.google.android.gms.appdatasearch.UsageInfo[]) r5)
        L_0x00c8:
            r7.writeNoException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dut.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
