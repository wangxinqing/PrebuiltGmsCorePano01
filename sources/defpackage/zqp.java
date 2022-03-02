package defpackage;

/* renamed from: zqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class zqp extends bhw implements zqq {
    public zqp() {
        super("com.google.android.gms.recaptcha.internal.IRecaptchaService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: zqn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: zqj} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [zqm] */
    /* JADX WARNING: type inference failed for: r2v11, types: [zqm] */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: type inference failed for: r2v25 */
    /* JADX WARNING: type inference failed for: r2v26 */
    /* JADX WARNING: type inference failed for: r2v27 */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            java.lang.String r0 = "com.google.android.gms.recaptcha.internal.IExecuteCallback"
            r1 = 1
            r2 = 0
            if (r5 == r1) goto L_0x0089
            r3 = 2
            if (r5 == r3) goto L_0x0066
            r3 = 3
            if (r5 == r3) goto L_0x0039
            r0 = 4
            if (r5 == r0) goto L_0x0011
            r5 = 0
            return r5
        L_0x0011:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x002b
            java.lang.String r0 = "com.google.android.gms.recaptcha.internal.ICloseCallback"
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r2 = r0 instanceof defpackage.zqj
            if (r2 == 0) goto L_0x0025
            r2 = r0
            zqj r2 = (defpackage.zqj) r2
            goto L_0x002c
        L_0x0025:
            zqj r2 = new zqj
            r2.<init>(r5)
            goto L_0x002c
        L_0x002b:
        L_0x002c:
            android.os.Parcelable$Creator r5 = com.google.android.gms.recaptcha.RecaptchaHandle.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.recaptcha.RecaptchaHandle r5 = (com.google.android.gms.recaptcha.RecaptchaHandle) r5
            r4.a(r2)
            goto L_0x00ad
        L_0x0039:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0051
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r2 = r0 instanceof defpackage.zqm
            if (r2 == 0) goto L_0x004b
            r2 = r0
            zqm r2 = (defpackage.zqm) r2
            goto L_0x0052
        L_0x004b:
            zqk r2 = new zqk
            r2.<init>(r5)
            goto L_0x0052
        L_0x0051:
        L_0x0052:
            android.os.Parcelable$Creator r5 = com.google.android.gms.recaptcha.RecaptchaHandle.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.recaptcha.RecaptchaHandle r5 = (com.google.android.gms.recaptcha.RecaptchaHandle) r5
            android.os.Parcelable$Creator r0 = com.google.android.gms.recaptcha.RecaptchaAction.CREATOR
            android.os.Parcelable r6 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.recaptcha.RecaptchaAction r6 = (com.google.android.gms.recaptcha.RecaptchaAction) r6
            r4.a((defpackage.zqm) r2, (com.google.android.gms.recaptcha.RecaptchaHandle) r5, (com.google.android.gms.recaptcha.RecaptchaAction) r6)
            goto L_0x00ad
        L_0x0066:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0080
            java.lang.String r0 = "com.google.android.gms.recaptcha.internal.IInitCallback"
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r2 = r0 instanceof defpackage.zqn
            if (r2 == 0) goto L_0x007a
            r2 = r0
            zqn r2 = (defpackage.zqn) r2
            goto L_0x0081
        L_0x007a:
            zqn r2 = new zqn
            r2.<init>(r5)
            goto L_0x0081
        L_0x0080:
        L_0x0081:
            java.lang.String r5 = r6.readString()
            r4.a(r2, r5)
            goto L_0x00ad
        L_0x0089:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x00a1
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r2 = r0 instanceof defpackage.zqm
            if (r2 == 0) goto L_0x009b
            r2 = r0
            zqm r2 = (defpackage.zqm) r2
            goto L_0x00a2
        L_0x009b:
            zqk r2 = new zqk
            r2.<init>(r5)
            goto L_0x00a2
        L_0x00a1:
        L_0x00a2:
            java.lang.String r5 = r6.readString()
            java.lang.String r6 = r6.readString()
            r4.a((defpackage.zqm) r2, (java.lang.String) r5, (java.lang.String) r6)
        L_0x00ad:
            r7.writeNoException()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zqp.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
