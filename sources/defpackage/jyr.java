package defpackage;

/* renamed from: jyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jyr extends bhw implements jys {
    public jyr() {
        super("com.google.android.gms.deviceconnection.internal.IDeviceConnectionService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4, android.os.Parcel r5, android.os.Parcel r6) {
        /*
            r3 = this;
            r0 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r1 = "com.google.android.gms.deviceconnection.internal.IDeviceConnectionCallbacks"
            r2 = 0
            if (r4 == r0) goto L_0x002a
            r0 = 1002(0x3ea, float:1.404E-42)
            if (r4 == r0) goto L_0x000d
            r4 = 0
            return r4
        L_0x000d:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0025
            android.os.IInterface r5 = r4.queryLocalInterface(r1)
            boolean r0 = r5 instanceof defpackage.jyq
            if (r0 == 0) goto L_0x001f
            r2 = r5
            jyq r2 = (defpackage.jyq) r2
            goto L_0x0026
        L_0x001f:
            jyq r2 = new jyq
            r2.<init>(r4)
            goto L_0x0026
        L_0x0025:
        L_0x0026:
            r3.a(r2)
            goto L_0x004a
        L_0x002a:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0042
            android.os.IInterface r0 = r4.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.jyq
            if (r1 == 0) goto L_0x003c
            r2 = r0
            jyq r2 = (defpackage.jyq) r2
            goto L_0x0043
        L_0x003c:
            jyq r2 = new jyq
            r2.<init>(r4)
            goto L_0x0043
        L_0x0042:
        L_0x0043:
            java.lang.String[] r4 = r5.createStringArray()
            r3.a(r2, r4)
        L_0x004a:
            r6.writeNoException()
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jyr.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
