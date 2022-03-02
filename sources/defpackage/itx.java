package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;

/* renamed from: itx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class itx extends Binder implements ity {
    public itx() {
        attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
    }

    /* access modifiers changed from: protected */
    public void a(int i, itv itv, int i2, String str, String str2, String[] strArr, Bundle bundle, IBinder iBinder, String str3, String str4) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void a(itv itv) {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: itt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: android.os.IBinder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: android.os.IBinder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.google.android.gms.common.internal.GetServiceRequest} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: itt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: itt} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r16, android.os.Parcel r17, android.os.Parcel r18, int r19) {
        /*
            r15 = this;
            r11 = r15
            r1 = r16
            r0 = r17
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            if (r1 > r2) goto L_0x0175
            java.lang.String r2 = "com.google.android.gms.common.internal.IGmsServiceBroker"
            r0.enforceInterface(r2)
            android.os.IBinder r2 = r17.readStrongBinder()
            r3 = 0
            if (r2 == 0) goto L_0x002b
            java.lang.String r4 = "com.google.android.gms.common.internal.IGmsCallbacks"
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r5 = r4 instanceof defpackage.itv
            if (r5 == 0) goto L_0x0024
            itv r4 = (defpackage.itv) r4
            r2 = r4
            goto L_0x002c
        L_0x0024:
            itt r4 = new itt
            r4.<init>(r2)
            r2 = r4
            goto L_0x002c
        L_0x002b:
            r2 = r3
        L_0x002c:
            r4 = 46
            r12 = 1
            if (r1 != r4) goto L_0x0047
            int r1 = r17.readInt()
            if (r1 == 0) goto L_0x0041
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.internal.GetServiceRequest.CREATOR
            java.lang.Object r0 = r1.createFromParcel(r0)
            r3 = r0
            com.google.android.gms.common.internal.GetServiceRequest r3 = (com.google.android.gms.common.internal.GetServiceRequest) r3
            goto L_0x0042
        L_0x0041:
        L_0x0042:
            r15.a(r2, r3)
            goto L_0x0171
        L_0x0047:
            r4 = 47
            if (r1 == r4) goto L_0x0160
            int r4 = r17.readInt()
            r5 = 4
            if (r1 == r5) goto L_0x0057
            java.lang.String r5 = r17.readString()
            goto L_0x0058
        L_0x0057:
            r5 = r3
        L_0x0058:
            if (r1 == r12) goto L_0x012c
            r6 = 2
            if (r1 == r6) goto L_0x0112
            r6 = 23
            if (r1 == r6) goto L_0x0112
            r6 = 25
            if (r1 == r6) goto L_0x0112
            r6 = 27
            if (r1 == r6) goto L_0x0112
            r6 = 30
            if (r1 == r6) goto L_0x00f1
            r6 = 34
            if (r1 == r6) goto L_0x00e5
            r6 = 41
            if (r1 == r6) goto L_0x0112
            r6 = 43
            if (r1 == r6) goto L_0x0112
            r6 = 37
            if (r1 == r6) goto L_0x0112
            r6 = 38
            if (r1 == r6) goto L_0x0112
            switch(r1) {
                case 5: goto L_0x0112;
                case 6: goto L_0x0112;
                case 7: goto L_0x0112;
                case 8: goto L_0x0112;
                case 9: goto L_0x00b9;
                case 10: goto L_0x00aa;
                case 11: goto L_0x0112;
                case 12: goto L_0x0112;
                case 13: goto L_0x0112;
                case 14: goto L_0x0112;
                case 15: goto L_0x0112;
                case 16: goto L_0x0112;
                case 17: goto L_0x0112;
                case 18: goto L_0x0112;
                case 19: goto L_0x008c;
                case 20: goto L_0x00f1;
                default: goto L_0x0084;
            }
        L_0x0084:
            r6 = r3
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r13 = r10
            goto L_0x0151
        L_0x008c:
            android.os.IBinder r6 = r17.readStrongBinder()
            int r7 = r17.readInt()
            if (r7 == 0) goto L_0x00a2
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            java.lang.Object r0 = r7.createFromParcel(r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r8 = r0
            r7 = r3
            r10 = r7
            goto L_0x00a5
        L_0x00a2:
            r7 = r3
            r8 = r7
            r10 = r8
        L_0x00a5:
            r13 = r10
            r9 = r6
            r6 = r13
            goto L_0x0151
        L_0x00aa:
            java.lang.String r6 = r17.readString()
            java.lang.String[] r0 = r17.createStringArray()
            r7 = r0
            r8 = r3
            r9 = r8
            r10 = r9
            r13 = r10
            goto L_0x0151
        L_0x00b9:
            java.lang.String r6 = r17.readString()
            java.lang.String[] r7 = r17.createStringArray()
            java.lang.String r8 = r17.readString()
            android.os.IBinder r9 = r17.readStrongBinder()
            java.lang.String r10 = r17.readString()
            int r13 = r17.readInt()
            if (r13 == 0) goto L_0x00e0
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            java.lang.Object r0 = r3.createFromParcel(r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r13 = r10
            r10 = r8
            r8 = r0
            goto L_0x0151
        L_0x00e0:
            r13 = r10
            r10 = r8
            r8 = r3
            goto L_0x0151
        L_0x00e5:
            java.lang.String r0 = r17.readString()
            r6 = r0
            r7 = r3
            r8 = r7
            r9 = r8
            r10 = r9
            r13 = r10
            goto L_0x0151
        L_0x00f1:
            java.lang.String[] r6 = r17.createStringArray()
            java.lang.String r7 = r17.readString()
            int r8 = r17.readInt()
            if (r8 == 0) goto L_0x010a
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            java.lang.Object r0 = r8.createFromParcel(r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r8 = r0
            r9 = r3
            goto L_0x010c
        L_0x010a:
            r8 = r3
            r9 = r8
        L_0x010c:
            r10 = r9
            r13 = r10
            r14 = r7
            r7 = r6
            r6 = r14
            goto L_0x0151
        L_0x0112:
            int r6 = r17.readInt()
            if (r6 == 0) goto L_0x0125
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r0 = r6.createFromParcel(r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r8 = r0
            r6 = r3
            r7 = r6
            r9 = r7
            goto L_0x0129
        L_0x0125:
            r6 = r3
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0129:
            r10 = r9
            r13 = r10
            goto L_0x0151
        L_0x012c:
            java.lang.String r6 = r17.readString()
            java.lang.String[] r7 = r17.createStringArray()
            java.lang.String r8 = r17.readString()
            int r9 = r17.readInt()
            if (r9 == 0) goto L_0x014c
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            java.lang.Object r0 = r9.createFromParcel(r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r9 = r3
            r13 = r9
            r10 = r6
            r6 = r8
            r8 = r0
            goto L_0x0151
        L_0x014c:
            r9 = r3
            r13 = r9
            r10 = r6
            r6 = r8
            r8 = r13
        L_0x0151:
            r0 = r15
            r1 = r16
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r13
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0171
        L_0x0160:
            int r1 = r17.readInt()
            if (r1 == 0) goto L_0x016e
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.internal.ValidateAccountRequest.CREATOR
            java.lang.Object r0 = r1.createFromParcel(r0)
            com.google.android.gms.common.internal.ValidateAccountRequest r0 = (com.google.android.gms.common.internal.ValidateAccountRequest) r0
        L_0x016e:
            r15.a(r2)
        L_0x0171:
            r18.writeNoException()
            return r12
        L_0x0175:
            boolean r0 = super.onTransact(r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.itx.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
