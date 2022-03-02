package defpackage;

/* renamed from: ftx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ftx extends bhw implements fty {
    public ftx() {
        super("com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: fsz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: ftl} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v6, types: [ifu] */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4, android.os.Parcel r5, android.os.Parcel r6) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == r0) goto L_0x0054
            r2 = 2
            if (r4 == r2) goto L_0x0032
            r2 = 3
            if (r4 == r2) goto L_0x000c
            r4 = 0
            return r4
        L_0x000c:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0025
            java.lang.String r1 = "com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.ftl
            if (r2 == 0) goto L_0x001f
            ftl r1 = (defpackage.ftl) r1
            goto L_0x0026
        L_0x001f:
            ftl r1 = new ftl
            r1.<init>(r4)
            goto L_0x0026
        L_0x0025:
        L_0x0026:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.api.identity.GetSignInIntentRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.api.identity.GetSignInIntentRequest r4 = (com.google.android.gms.auth.api.identity.GetSignInIntentRequest) r4
            r3.a((defpackage.ftl) r1, (com.google.android.gms.auth.api.identity.GetSignInIntentRequest) r4)
            goto L_0x0079
        L_0x0032:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x004b
            java.lang.String r1 = "com.google.android.gms.common.api.internal.IStatusCallback"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x0045
            ifu r1 = (defpackage.ifu) r1
            goto L_0x004c
        L_0x0045:
            ifs r1 = new ifs
            r1.<init>(r4)
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            java.lang.String r4 = r5.readString()
            r3.a((defpackage.ifu) r1, (java.lang.String) r4)
            goto L_0x0079
        L_0x0054:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x006d
            java.lang.String r1 = "com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.fsz
            if (r2 == 0) goto L_0x0067
            fsz r1 = (defpackage.fsz) r1
            goto L_0x006e
        L_0x0067:
            fsz r1 = new fsz
            r1.<init>(r4)
            goto L_0x006e
        L_0x006d:
        L_0x006e:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.api.identity.BeginSignInRequest.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.api.identity.BeginSignInRequest r4 = (com.google.android.gms.auth.api.identity.BeginSignInRequest) r4
            r3.a((defpackage.fsz) r1, (com.google.android.gms.auth.api.identity.BeginSignInRequest) r4)
        L_0x0079:
            r6.writeNoException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftx.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
