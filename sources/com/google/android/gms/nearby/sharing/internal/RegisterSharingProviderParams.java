package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class RegisterSharingProviderParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wai();
    public ifu a;
    public vye b;

    private RegisterSharingProviderParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterSharingProviderParams) {
            RegisterSharingProviderParams registerSharingProviderParams = (RegisterSharingProviderParams) obj;
            return ius.a(this.b, registerSharingProviderParams.b) && ius.a(this.a, registerSharingProviderParams.a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RegisterSharingProviderParams(android.os.IBinder r4, android.os.IBinder r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0016
            java.lang.String r1 = "com.google.android.gms.nearby.sharing.internal.IExternalSharingProvider"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.vye
            if (r2 == 0) goto L_0x0010
            vye r1 = (defpackage.vye) r1
            goto L_0x0017
        L_0x0010:
            vye r1 = new vye
            r1.<init>(r4)
            goto L_0x0017
        L_0x0016:
            r1 = r0
        L_0x0017:
            if (r5 == 0) goto L_0x002d
            java.lang.String r4 = "com.google.android.gms.common.api.internal.IStatusCallback"
            android.os.IInterface r4 = r5.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.ifu
            if (r0 == 0) goto L_0x0027
            r0 = r4
            ifu r0 = (defpackage.ifu) r0
            goto L_0x002e
        L_0x0027:
            ifs r0 = new ifs
            r0.<init>(r5)
            goto L_0x002e
        L_0x002d:
        L_0x002e:
            r3.<init>()
            r3.b = r1
            r3.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.sharing.internal.RegisterSharingProviderParams.<init>(android.os.IBinder, android.os.IBinder):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b.a);
        ivx.a(parcel, 2, this.a.asBinder());
        ivx.b(parcel, a2);
    }
}
