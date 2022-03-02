package defpackage;

/* renamed from: fuy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class fuy extends bhw implements fuz {
    public fuy() {
        super("com.google.android.gms.auth.api.internal.IAuthService");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r6v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            r0 = 1
            java.lang.String r1 = "com.google.android.gms.auth.api.internal.IAuthCallbacks"
            r2 = 0
            if (r5 == r0) goto L_0x0050
            r3 = 2
            if (r5 == r3) goto L_0x002b
            r3 = 3
            if (r5 == r3) goto L_0x000e
            r5 = 0
            return r5
        L_0x000e:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0026
            android.os.IInterface r6 = r5.queryLocalInterface(r1)
            boolean r1 = r6 instanceof defpackage.fuw
            if (r1 == 0) goto L_0x0020
            r2 = r6
            fuw r2 = (defpackage.fuw) r2
            goto L_0x0027
        L_0x0020:
            fuu r2 = new fuu
            r2.<init>(r5)
            goto L_0x0027
        L_0x0026:
        L_0x0027:
            r4.a(r2)
            goto L_0x0074
        L_0x002b:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0043
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.fuw
            if (r2 == 0) goto L_0x003d
            r2 = r1
            fuw r2 = (defpackage.fuw) r2
            goto L_0x0044
        L_0x003d:
            fuu r2 = new fuu
            r2.<init>(r5)
            goto L_0x0044
        L_0x0043:
        L_0x0044:
            android.os.Parcelable$Creator r5 = com.google.android.gms.auth.api.proxy.ProxyGrpcRequest.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.auth.api.proxy.ProxyGrpcRequest r5 = (com.google.android.gms.auth.api.proxy.ProxyGrpcRequest) r5
            r4.a((defpackage.fuw) r2, (com.google.android.gms.auth.api.proxy.ProxyGrpcRequest) r5)
            goto L_0x0074
        L_0x0050:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0068
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.fuw
            if (r2 == 0) goto L_0x0062
            r2 = r1
            fuw r2 = (defpackage.fuw) r2
            goto L_0x0069
        L_0x0062:
            fuu r2 = new fuu
            r2.<init>(r5)
            goto L_0x0069
        L_0x0068:
        L_0x0069:
            android.os.Parcelable$Creator r5 = com.google.android.gms.auth.api.proxy.ProxyRequest.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.auth.api.proxy.ProxyRequest r5 = (com.google.android.gms.auth.api.proxy.ProxyRequest) r5
            r4.a((defpackage.fuw) r2, (com.google.android.gms.auth.api.proxy.ProxyRequest) r5)
        L_0x0074:
            r7.writeNoException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fuy.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
