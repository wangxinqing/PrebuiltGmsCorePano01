package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class StartAdvertisingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uiu();
    public uhd a;
    public ugb b;
    public String c;
    public String d;
    public long e;
    public AdvertisingOptions f;
    public ugh g;
    public byte[] h;

    public StartAdvertisingParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartAdvertisingParams) {
            StartAdvertisingParams startAdvertisingParams = (StartAdvertisingParams) obj;
            return ius.a(this.a, startAdvertisingParams.a) && ius.a(this.b, startAdvertisingParams.b) && ius.a(this.c, startAdvertisingParams.c) && ius.a(this.d, startAdvertisingParams.d) && ius.a(Long.valueOf(this.e), Long.valueOf(startAdvertisingParams.e)) && ius.a(this.f, startAdvertisingParams.f) && ius.a(this.g, startAdvertisingParams.g) && Arrays.equals(this.h, startAdvertisingParams.h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Long.valueOf(this.e), this.f, this.g, Integer.valueOf(Arrays.hashCode(this.h))});
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StartAdvertisingParams(android.os.IBinder r4, android.os.IBinder r5, java.lang.String r6, java.lang.String r7, long r8, com.google.android.gms.nearby.connection.AdvertisingOptions r10, android.os.IBinder r11, byte[] r12) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0016
            java.lang.String r1 = "com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.uhd
            if (r2 == 0) goto L_0x0010
            uhd r1 = (defpackage.uhd) r1
            goto L_0x0017
        L_0x0010:
            uhb r1 = new uhb
            r1.<init>(r4)
            goto L_0x0017
        L_0x0016:
            r1 = r0
        L_0x0017:
            if (r5 == 0) goto L_0x002c
            java.lang.String r4 = "com.google.android.gms.nearby.internal.connection.IAdvertisingCallback"
            android.os.IInterface r4 = r5.queryLocalInterface(r4)
            boolean r2 = r4 instanceof defpackage.ugb
            if (r2 == 0) goto L_0x0026
            ugb r4 = (defpackage.ugb) r4
            goto L_0x002d
        L_0x0026:
            ufz r4 = new ufz
            r4.<init>(r5)
            goto L_0x002d
        L_0x002c:
            r4 = r0
        L_0x002d:
            if (r11 == 0) goto L_0x0043
            java.lang.String r5 = "com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener"
            android.os.IInterface r5 = r11.queryLocalInterface(r5)
            boolean r0 = r5 instanceof defpackage.ugh
            if (r0 == 0) goto L_0x003d
            r0 = r5
            ugh r0 = (defpackage.ugh) r0
            goto L_0x0044
        L_0x003d:
            ugf r0 = new ugf
            r0.<init>(r11)
            goto L_0x0044
        L_0x0043:
        L_0x0044:
            r3.<init>()
            r3.a = r1
            r3.b = r4
            r3.c = r6
            r3.d = r7
            r3.e = r8
            r3.f = r10
            r3.g = r0
            r3.h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.internal.connection.StartAdvertisingParams.<init>(android.os.IBinder, android.os.IBinder, java.lang.String, java.lang.String, long, com.google.android.gms.nearby.connection.AdvertisingOptions, android.os.IBinder, byte[]):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int a2 = ivx.a(parcel);
        uhd uhd = this.a;
        IBinder iBinder3 = null;
        if (uhd != null) {
            iBinder = uhd.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 1, iBinder);
        ugb ugb = this.b;
        if (ugb != null) {
            iBinder2 = ugb.asBinder();
        } else {
            iBinder2 = null;
        }
        ivx.a(parcel, 2, iBinder2);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f, i, false);
        ugh ugh = this.g;
        if (ugh != null) {
            iBinder3 = ugh.asBinder();
        }
        ivx.a(parcel, 7, iBinder3);
        ivx.a(parcel, 8, this.h, false);
        ivx.b(parcel, a2);
    }
}
