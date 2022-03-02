package defpackage;

/* renamed from: zof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class zof extends bhw implements zog {
    public zof() {
        super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4, android.os.Parcel r5, android.os.Parcel r6) {
        /*
            r3 = this;
            r6 = 1
            java.lang.String r0 = "com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks"
            r1 = 0
            if (r4 == r6) goto L_0x0050
            r2 = 2
            if (r4 == r2) goto L_0x002b
            r2 = 3
            if (r4 == r2) goto L_0x000e
            r4 = 0
            return r4
        L_0x000e:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0026
            android.os.IInterface r5 = r4.queryLocalInterface(r0)
            boolean r0 = r5 instanceof defpackage.zod
            if (r0 == 0) goto L_0x0020
            r1 = r5
            zod r1 = (defpackage.zod) r1
            goto L_0x0027
        L_0x0020:
            zob r1 = new zob
            r1.<init>(r4)
            goto L_0x0027
        L_0x0026:
        L_0x0027:
            r3.b(r1)
            goto L_0x006c
        L_0x002b:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0043
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.zod
            if (r1 == 0) goto L_0x003d
            r1 = r0
            zod r1 = (defpackage.zod) r1
            goto L_0x0044
        L_0x003d:
            zob r1 = new zob
            r1.<init>(r4)
            goto L_0x0044
        L_0x0043:
        L_0x0044:
            android.os.Parcelable$Creator r4 = com.google.android.gms.pseudonymous.PseudonymousIdToken.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.pseudonymous.PseudonymousIdToken r4 = (com.google.android.gms.pseudonymous.PseudonymousIdToken) r4
            r3.a(r1, r4)
            goto L_0x006c
        L_0x0050:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0068
            android.os.IInterface r5 = r4.queryLocalInterface(r0)
            boolean r0 = r5 instanceof defpackage.zod
            if (r0 == 0) goto L_0x0062
            r1 = r5
            zod r1 = (defpackage.zod) r1
            goto L_0x0069
        L_0x0062:
            zob r1 = new zob
            r1.<init>(r4)
            goto L_0x0069
        L_0x0068:
        L_0x0069:
            r3.a(r1)
        L_0x006c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zof.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
