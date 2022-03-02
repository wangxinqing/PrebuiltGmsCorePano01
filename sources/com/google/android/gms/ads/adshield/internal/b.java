package com.google.android.gms.ads.adshield.internal;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class b extends bhw implements c {
    public b() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    public static c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new a(iBinder);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            java.lang.String r0 = "com.google.android.gms.dynamic.IObjectWrapper"
            r1 = 0
            r2 = 1
            if (r5 == r2) goto L_0x0033
            r3 = 2
            if (r5 == r3) goto L_0x000b
            r5 = 0
            return r5
        L_0x000b:
            java.lang.String r5 = r6.readString()
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x0027
            android.os.IInterface r0 = r6.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.mby
            if (r1 == 0) goto L_0x0021
            r1 = r0
            mby r1 = (defpackage.mby) r1
            goto L_0x0028
        L_0x0021:
            mbw r1 = new mbw
            r1.<init>(r6)
            goto L_0x0028
        L_0x0027:
        L_0x0028:
            android.os.IBinder r5 = r4.newAdShieldClientWithoutAdvertisingId(r5, r1)
            r7.writeNoException()
            r7.writeStrongBinder(r5)
            goto L_0x005a
        L_0x0033:
            java.lang.String r5 = r6.readString()
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x004f
            android.os.IInterface r0 = r6.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.mby
            if (r1 == 0) goto L_0x0049
            r1 = r0
            mby r1 = (defpackage.mby) r1
            goto L_0x0050
        L_0x0049:
            mbw r1 = new mbw
            r1.<init>(r6)
            goto L_0x0050
        L_0x004f:
        L_0x0050:
            android.os.IBinder r5 = r4.newAdShieldClient(r5, r1)
            r7.writeNoException()
            r7.writeStrongBinder(r5)
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.adshield.internal.b.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
