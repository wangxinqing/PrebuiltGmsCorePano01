package defpackage;

/* renamed from: sjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class sjc extends bhw implements sjd {
    public sjc() {
        super("com.google.android.gms.mdisync.internal.IMdiSyncService");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            java.lang.String r0 = "com.google.android.gms.mdisync.internal.IMdiSyncCallbacks"
            r1 = 0
            r2 = 1
            if (r5 == r2) goto L_0x0038
            r3 = 2
            if (r5 == r3) goto L_0x000b
            r5 = 0
            return r5
        L_0x000b:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0023
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.sjb
            if (r1 == 0) goto L_0x001d
            r1 = r0
            sjb r1 = (defpackage.sjb) r1
            goto L_0x0024
        L_0x001d:
            sjb r1 = new sjb
            r1.<init>(r5)
            goto L_0x0024
        L_0x0023:
        L_0x0024:
            android.os.Parcelable$Creator r5 = com.google.android.gms.mdisync.internal.TeleportingSyncRequest.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.mdisync.internal.TeleportingSyncRequest r5 = (com.google.android.gms.mdisync.internal.TeleportingSyncRequest) r5
            android.os.Parcelable$Creator r0 = com.google.android.gms.mdisync.CallerInfo.CREATOR
            android.os.Parcelable r6 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.mdisync.CallerInfo r6 = (com.google.android.gms.mdisync.CallerInfo) r6
            r4.a((defpackage.sjb) r1, (com.google.android.gms.mdisync.internal.TeleportingSyncRequest) r5, (com.google.android.gms.mdisync.CallerInfo) r6)
            goto L_0x0064
        L_0x0038:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0050
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.sjb
            if (r1 == 0) goto L_0x004a
            r1 = r0
            sjb r1 = (defpackage.sjb) r1
            goto L_0x0051
        L_0x004a:
            sjb r1 = new sjb
            r1.<init>(r5)
            goto L_0x0051
        L_0x0050:
        L_0x0051:
            android.os.Parcelable$Creator r5 = com.google.android.gms.mdisync.internal.SyncRequest.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.mdisync.internal.SyncRequest r5 = (com.google.android.gms.mdisync.internal.SyncRequest) r5
            android.os.Parcelable$Creator r0 = com.google.android.gms.mdisync.CallerInfo.CREATOR
            android.os.Parcelable r6 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.mdisync.CallerInfo r6 = (com.google.android.gms.mdisync.CallerInfo) r6
            r4.a((defpackage.sjb) r1, (com.google.android.gms.mdisync.internal.SyncRequest) r5, (com.google.android.gms.mdisync.CallerInfo) r6)
        L_0x0064:
            r7.writeNoException()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjc.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
