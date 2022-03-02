package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SendConnectionRequestParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uiq();
    public uha a;
    public uge b;
    public ugk c;
    public String d;
    public String e;
    public byte[] f;
    public ugh g;
    public byte[] h;
    public ConnectionOptions i;

    public SendConnectionRequestParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendConnectionRequestParams) {
            SendConnectionRequestParams sendConnectionRequestParams = (SendConnectionRequestParams) obj;
            return ius.a(this.a, sendConnectionRequestParams.a) && ius.a(this.b, sendConnectionRequestParams.b) && ius.a(this.c, sendConnectionRequestParams.c) && ius.a(this.d, sendConnectionRequestParams.d) && ius.a(this.e, sendConnectionRequestParams.e) && Arrays.equals(this.f, sendConnectionRequestParams.f) && ius.a(this.g, sendConnectionRequestParams.g) && Arrays.equals(this.h, sendConnectionRequestParams.h) && ius.a(this.i, sendConnectionRequestParams.i);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, Integer.valueOf(Arrays.hashCode(this.f)), this.g, Integer.valueOf(Arrays.hashCode(this.h)), this.i});
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendConnectionRequestParams(android.os.IBinder r4, android.os.IBinder r5, android.os.IBinder r6, java.lang.String r7, java.lang.String r8, byte[] r9, android.os.IBinder r10, byte[] r11, com.google.android.gms.nearby.connection.ConnectionOptions r12) {
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
            if (r6 == 0) goto L_0x0042
            java.lang.String r5 = "com.google.android.gms.nearby.internal.connection.IConnectionResponseListener"
            android.os.IInterface r5 = r6.queryLocalInterface(r5)
            boolean r2 = r5 instanceof defpackage.ugk
            if (r2 == 0) goto L_0x003c
            ugk r5 = (defpackage.ugk) r5
            goto L_0x0043
        L_0x003c:
            ugi r5 = new ugi
            r5.<init>(r6)
            goto L_0x0043
        L_0x0042:
            r5 = r0
        L_0x0043:
            if (r10 == 0) goto L_0x0059
            java.lang.String r6 = "com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener"
            android.os.IInterface r6 = r10.queryLocalInterface(r6)
            boolean r0 = r6 instanceof defpackage.ugh
            if (r0 == 0) goto L_0x0053
            r0 = r6
            ugh r0 = (defpackage.ugh) r0
            goto L_0x005a
        L_0x0053:
            ugf r0 = new ugf
            r0.<init>(r10)
            goto L_0x005a
        L_0x0059:
        L_0x005a:
            r3.<init>()
            r3.a = r1
            r3.b = r4
            r3.c = r5
            r3.d = r7
            r3.e = r8
            r3.f = r9
            r3.g = r0
            r3.h = r11
            r3.i = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams.<init>(android.os.IBinder, android.os.IBinder, android.os.IBinder, java.lang.String, java.lang.String, byte[], android.os.IBinder, byte[], com.google.android.gms.nearby.connection.ConnectionOptions):void");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        IBinder iBinder;
        IBinder iBinder2;
        IBinder iBinder3;
        int a2 = ivx.a(parcel);
        uha uha = this.a;
        IBinder iBinder4 = null;
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
        ugk ugk = this.c;
        if (ugk != null) {
            iBinder3 = ugk.asBinder();
        } else {
            iBinder3 = null;
        }
        ivx.a(parcel, 3, iBinder3);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ugh ugh = this.g;
        if (ugh != null) {
            iBinder4 = ugh.asBinder();
        }
        ivx.a(parcel, 7, iBinder4);
        ivx.a(parcel, 8, this.h, false);
        ivx.a(parcel, 9, this.i, i2, false);
        ivx.b(parcel, a2);
    }
}
