package defpackage;

/* renamed from: rsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rsl extends bhw implements rsm {
    final /* synthetic */ rqp a;

    public rsl() {
        super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r3, android.os.Parcel r4, android.os.Parcel r5) {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            if (r3 == r1) goto L_0x0010
            r4 = 2
            if (r3 == r4) goto L_0x0009
            r3 = 0
            return r3
        L_0x0009:
            rqp r3 = r2.a
            alee r3 = (defpackage.alee) r3
            r3.j = r0
            goto L_0x0036
        L_0x0010:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x002a
            java.lang.String r4 = "com.google.android.gms.maps.internal.IOnLocationChangeListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.rtk
            if (r0 == 0) goto L_0x0024
            r0 = r4
            rtk r0 = (defpackage.rtk) r0
            goto L_0x002b
        L_0x0024:
            rtk r0 = new rtk
            r0.<init>(r3)
            goto L_0x002b
        L_0x002a:
        L_0x002b:
            rqp r3 = r2.a
            rqj r4 = new rqj
            r4.<init>(r0)
            alee r3 = (defpackage.alee) r3
            r3.j = r4
        L_0x0036:
            r5.writeNoException()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rsl.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rsl(rqp rqp) {
        super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
        this.a = rqp;
    }
}
