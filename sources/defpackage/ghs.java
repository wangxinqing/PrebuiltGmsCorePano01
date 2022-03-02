package defpackage;

/* renamed from: ghs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ghs extends bhw implements ght {
    public ghs() {
        super("com.google.android.gms.auth.managed.internal.IEmmService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            java.lang.String r0 = "com.google.android.gms.auth.managed.internal.IEmmCallbacks"
            r1 = 0
            r2 = 1
            if (r5 == r2) goto L_0x0035
            r3 = 9
            if (r5 == r3) goto L_0x000c
            r5 = 0
            return r5
        L_0x000c:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0024
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ghq
            if (r1 == 0) goto L_0x001e
            r1 = r0
            ghq r1 = (defpackage.ghq) r1
            goto L_0x0025
        L_0x001e:
            gho r1 = new gho
            r1.<init>(r5)
            goto L_0x0025
        L_0x0024:
        L_0x0025:
            java.lang.String r5 = r6.readString()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r6 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r0)
            android.os.Bundle r6 = (android.os.Bundle) r6
            r4.a((defpackage.ghq) r1, (java.lang.String) r5, (android.os.Bundle) r6)
            goto L_0x0059
        L_0x0035:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x004d
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ghq
            if (r1 == 0) goto L_0x0047
            r1 = r0
            ghq r1 = (defpackage.ghq) r1
            goto L_0x004e
        L_0x0047:
            gho r1 = new gho
            r1.<init>(r5)
            goto L_0x004e
        L_0x004d:
        L_0x004e:
            java.lang.String r5 = r6.readString()
            java.lang.String r6 = r6.readString()
            r4.a((defpackage.ghq) r1, (java.lang.String) r5, (java.lang.String) r6)
        L_0x0059:
            r7.writeNoException()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghs.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
