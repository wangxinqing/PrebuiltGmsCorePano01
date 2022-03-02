package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AcceptConnectionRequestParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new udq();
    public uha a;
    public uge b;
    public String c;
    public byte[] d;
    public ugx e;

    public AcceptConnectionRequestParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AcceptConnectionRequestParams) {
            AcceptConnectionRequestParams acceptConnectionRequestParams = (AcceptConnectionRequestParams) obj;
            return ius.a(this.a, acceptConnectionRequestParams.a) && ius.a(this.b, acceptConnectionRequestParams.b) && ius.a(this.c, acceptConnectionRequestParams.c) && Arrays.equals(this.d, acceptConnectionRequestParams.d) && ius.a(this.e, acceptConnectionRequestParams.e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)), this.e});
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AcceptConnectionRequestParams(android.os.IBinder r4, android.os.IBinder r5, java.lang.String r6, byte[] r7, android.os.IBinder r8) {
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
            java.lang.String r4 = "com.google.android.gms.nearby.internal.connection.IConnectionEventListener"
            android.os.IInterface r4 = r5.queryLocalInterface(r4)
            boolean r2 = r4 instanceof defpackage.uge
            if (r2 == 0) goto L_0x0026
            uge r4 = (defpackage.uge) r4
            goto L_0x002d
        L_0x0026:
            ugc r4 = new ugc
            r4.<init>(r5)
            goto L_0x002d
        L_0x002c:
            r4 = r0
        L_0x002d:
            if (r8 == 0) goto L_0x0043
            java.lang.String r5 = "com.google.android.gms.nearby.internal.connection.IPayloadListener"
            android.os.IInterface r5 = r8.queryLocalInterface(r5)
            boolean r0 = r5 instanceof defpackage.ugx
            if (r0 == 0) goto L_0x003d
            r0 = r5
            ugx r0 = (defpackage.ugx) r0
            goto L_0x0044
        L_0x003d:
            ugv r0 = new ugv
            r0.<init>(r8)
            goto L_0x0044
        L_0x0043:
        L_0x0044:
            r3.<init>()
            r3.a = r1
            r3.b = r4
            r3.c = r6
            r3.d = r7
            r3.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams.<init>(android.os.IBinder, android.os.IBinder, java.lang.String, byte[], android.os.IBinder):void");
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
        uge uge = this.b;
        if (uge != null) {
            iBinder2 = uge.asBinder();
        } else {
            iBinder2 = null;
        }
        ivx.a(parcel, 2, iBinder2);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ugx ugx = this.e;
        if (ugx != null) {
            iBinder3 = ugx.asBinder();
        }
        ivx.a(parcel, 5, iBinder3);
        ivx.b(parcel, a2);
    }
}
