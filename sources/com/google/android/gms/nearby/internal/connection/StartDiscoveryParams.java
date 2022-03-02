package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class StartDiscoveryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uiw();
    public uha a;
    public ugn b;
    public String c;
    public long d;
    public DiscoveryOptions e;
    public ugq f;

    public StartDiscoveryParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartDiscoveryParams) {
            StartDiscoveryParams startDiscoveryParams = (StartDiscoveryParams) obj;
            return ius.a(this.a, startDiscoveryParams.a) && ius.a(this.b, startDiscoveryParams.b) && ius.a(this.c, startDiscoveryParams.c) && ius.a(Long.valueOf(this.d), Long.valueOf(startDiscoveryParams.d)) && ius.a(this.e, startDiscoveryParams.e) && ius.a(this.f, startDiscoveryParams.f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), this.e, this.f});
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StartDiscoveryParams(android.os.IBinder r4, android.os.IBinder r5, java.lang.String r6, long r7, com.google.android.gms.nearby.connection.DiscoveryOptions r9, android.os.IBinder r10) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0016
            java.lang.String r1 = "com.google.android.gms.nearby.internal.connection.IResultListener"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.uha
            if (r2 == 0) goto L_0x0010
            uha r1 = (defpackage.uha) r1
            goto L_0x0017
        L_0x0010:
            ugy r1 = new ugy
            r1.<init>(r4)
            goto L_0x0017
        L_0x0016:
            r1 = r0
        L_0x0017:
            if (r5 == 0) goto L_0x002c
            java.lang.String r4 = "com.google.android.gms.nearby.internal.connection.IDiscoveryCallback"
            android.os.IInterface r4 = r5.queryLocalInterface(r4)
            boolean r2 = r4 instanceof defpackage.ugn
            if (r2 == 0) goto L_0x0026
            ugn r4 = (defpackage.ugn) r4
            goto L_0x002d
        L_0x0026:
            ugl r4 = new ugl
            r4.<init>(r5)
            goto L_0x002d
        L_0x002c:
            r4 = r0
        L_0x002d:
            if (r10 == 0) goto L_0x0043
            java.lang.String r5 = "com.google.android.gms.nearby.internal.connection.IDiscoveryListener"
            android.os.IInterface r5 = r10.queryLocalInterface(r5)
            boolean r0 = r5 instanceof defpackage.ugq
            if (r0 == 0) goto L_0x003d
            r0 = r5
            ugq r0 = (defpackage.ugq) r0
            goto L_0x0044
        L_0x003d:
            ugo r0 = new ugo
            r0.<init>(r10)
            goto L_0x0044
        L_0x0043:
        L_0x0044:
            r3.<init>()
            r3.a = r1
            r3.b = r4
            r3.c = r6
            r3.d = r7
            r3.e = r9
            r3.f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.internal.connection.StartDiscoveryParams.<init>(android.os.IBinder, android.os.IBinder, java.lang.String, long, com.google.android.gms.nearby.connection.DiscoveryOptions, android.os.IBinder):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int a2 = ivx.a(parcel);
        uha uha = this.a;
        IBinder iBinder3 = null;
        if (uha != null) {
            iBinder = uha.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 1, iBinder);
        ugn ugn = this.b;
        if (ugn != null) {
            iBinder2 = ugn.asBinder();
        } else {
            iBinder2 = null;
        }
        ivx.a(parcel, 2, iBinder2);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e, i, false);
        ugq ugq = this.f;
        if (ugq != null) {
            iBinder3 = ugq.asBinder();
        }
        ivx.a(parcel, 6, iBinder3);
        ivx.b(parcel, a2);
    }
}
