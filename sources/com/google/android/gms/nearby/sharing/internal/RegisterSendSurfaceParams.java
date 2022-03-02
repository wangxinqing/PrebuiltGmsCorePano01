package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class RegisterSendSurfaceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wah();
    public vyt a;
    public vyn b;
    public int c;
    public ifu d;

    public RegisterSendSurfaceParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterSendSurfaceParams) {
            RegisterSendSurfaceParams registerSendSurfaceParams = (RegisterSendSurfaceParams) obj;
            return ius.a(this.a, registerSendSurfaceParams.a) && ius.a(this.b, registerSendSurfaceParams.b) && ius.a(Integer.valueOf(this.c), Integer.valueOf(registerSendSurfaceParams.c)) && ius.a(this.d, registerSendSurfaceParams.d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d});
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RegisterSendSurfaceParams(android.os.IBinder r4, android.os.IBinder r5, int r6, android.os.IBinder r7) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0016
            java.lang.String r1 = "com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.vyt
            if (r2 == 0) goto L_0x0010
            vyt r1 = (defpackage.vyt) r1
            goto L_0x0017
        L_0x0010:
            vyr r1 = new vyr
            r1.<init>(r4)
            goto L_0x0017
        L_0x0016:
            r1 = r0
        L_0x0017:
            if (r5 == 0) goto L_0x002c
            java.lang.String r4 = "com.google.android.gms.nearby.sharing.internal.IShareTargetDiscoveredCallback"
            android.os.IInterface r4 = r5.queryLocalInterface(r4)
            boolean r2 = r4 instanceof defpackage.vyn
            if (r2 == 0) goto L_0x0026
            vyn r4 = (defpackage.vyn) r4
            goto L_0x002d
        L_0x0026:
            vyl r4 = new vyl
            r4.<init>(r5)
            goto L_0x002d
        L_0x002c:
            r4 = r0
        L_0x002d:
            if (r7 == 0) goto L_0x0043
            java.lang.String r5 = "com.google.android.gms.common.api.internal.IStatusCallback"
            android.os.IInterface r5 = r7.queryLocalInterface(r5)
            boolean r0 = r5 instanceof defpackage.ifu
            if (r0 == 0) goto L_0x003d
            r0 = r5
            ifu r0 = (defpackage.ifu) r0
            goto L_0x0044
        L_0x003d:
            ifs r0 = new ifs
            r0.<init>(r7)
            goto L_0x0044
        L_0x0043:
        L_0x0044:
            r3.<init>()
            r3.a = r1
            r3.b = r4
            r3.c = r6
            r3.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.sharing.internal.RegisterSendSurfaceParams.<init>(android.os.IBinder, android.os.IBinder, int, android.os.IBinder):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a.asBinder());
        ivx.a(parcel, 2, this.b.asBinder());
        ivx.b(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d.asBinder());
        ivx.b(parcel, a2);
    }
}
