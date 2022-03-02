package defpackage;

/* renamed from: dwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class dwo extends bhw implements dwp {
    public dwo() {
        super("com.google.android.gms.appinvite.internal.IAppInviteInternalService");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r27, android.os.Parcel r28, android.os.Parcel r29) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "com.google.android.gms.appinvite.internal.IAppInviteInternalCallbacks"
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L_0x002d
            r4 = 2
            if (r0 == r4) goto L_0x000d
            r0 = 0
            return r0
        L_0x000d:
            android.os.IBinder r0 = r28.readStrongBinder()
            if (r0 == 0) goto L_0x0025
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.dwn
            if (r2 == 0) goto L_0x001f
            r2 = r1
            dwn r2 = (defpackage.dwn) r2
            goto L_0x0026
        L_0x001f:
            dwn r2 = new dwn
            r2.<init>(r0)
            goto L_0x0026
        L_0x0025:
        L_0x0026:
            r0 = r26
            r0.a(r2)
            goto L_0x009f
        L_0x002d:
            r0 = r26
            android.os.IBinder r4 = r28.readStrongBinder()
            if (r4 == 0) goto L_0x0048
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.dwn
            if (r2 == 0) goto L_0x0042
            r2 = r1
            dwn r2 = (defpackage.dwn) r2
            r5 = r2
            goto L_0x004a
        L_0x0042:
            dwn r2 = new dwn
            r2.<init>(r4)
            goto L_0x0049
        L_0x0048:
        L_0x0049:
            r5 = r2
        L_0x004a:
            java.lang.String r6 = r28.readString()
            java.lang.String r7 = r28.readString()
            java.lang.String r8 = r28.readString()
            java.lang.String r9 = r28.readString()
            java.lang.String r10 = r28.readString()
            java.util.HashMap r11 = defpackage.bhx.c(r28)
            java.lang.String r12 = r28.readString()
            java.lang.String r13 = r28.readString()
            java.util.ArrayList r14 = defpackage.bhx.b(r28)
            java.lang.String r15 = r28.readString()
            java.lang.String r16 = r28.readString()
            java.lang.String r17 = r28.readString()
            java.lang.String r18 = r28.readString()
            byte[] r19 = r28.createByteArray()
            int r20 = r28.readInt()
            int r21 = r28.readInt()
            java.lang.String r22 = r28.readString()
            java.lang.String r23 = r28.readString()
            int r24 = r28.readInt()
            java.lang.String r25 = r28.readString()
            r4 = r26
            r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x009f:
            r29.writeNoException()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwo.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
