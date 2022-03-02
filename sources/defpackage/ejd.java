package defpackage;

/* renamed from: ejd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ejd extends bhw implements eje {
    public ejd() {
        super("com.google.android.gms.auth.account.IWorkAccountService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ejb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: ejb} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v11, types: [erf] */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r3, android.os.Parcel r4, android.os.Parcel r5) {
        /*
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.auth.account.IWorkAccountCallback"
            r1 = 0
            switch(r3) {
                case 1: goto L_0x009e;
                case 2: goto L_0x007a;
                case 3: goto L_0x0052;
                case 4: goto L_0x003f;
                case 5: goto L_0x0034;
                case 6: goto L_0x002c;
                case 7: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r3 = 0
            return r3
        L_0x0008:
            java.lang.String r3 = r4.readString()
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 == 0) goto L_0x0026
            java.lang.String r5 = "com.google.android.gms.auth.account.internal.IBooleanResultCallback"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r0 = r5 instanceof defpackage.erf
            if (r0 == 0) goto L_0x0020
            r1 = r5
            erf r1 = (defpackage.erf) r1
            goto L_0x0027
        L_0x0020:
            erd r1 = new erd
            r1.<init>(r4)
            goto L_0x0027
        L_0x0026:
        L_0x0027:
            r2.a((java.lang.String) r3, (defpackage.erf) r1)
            goto L_0x00a8
        L_0x002c:
            r2.c()
            r5.writeNoException()
            goto L_0x00a8
        L_0x0034:
            boolean r3 = r2.b()
            r5.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r5, (boolean) r3)
            goto L_0x00a8
        L_0x003f:
            java.lang.String r3 = r4.readString()
            java.lang.String r4 = r4.readString()
            boolean r3 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            r5.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r5, (boolean) r3)
            goto L_0x00a8
        L_0x0052:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x006a
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ejb
            if (r1 == 0) goto L_0x0064
            r1 = r0
            ejb r1 = (defpackage.ejb) r1
            goto L_0x006b
        L_0x0064:
            ejb r1 = new ejb
            r1.<init>(r3)
            goto L_0x006b
        L_0x006a:
        L_0x006b:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            android.accounts.Account r3 = (android.accounts.Account) r3
            r2.a((defpackage.ejb) r1, (android.accounts.Account) r3)
            r5.writeNoException()
            goto L_0x00a8
        L_0x007a:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0092
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ejb
            if (r1 == 0) goto L_0x008c
            r1 = r0
            ejb r1 = (defpackage.ejb) r1
            goto L_0x0093
        L_0x008c:
            ejb r1 = new ejb
            r1.<init>(r3)
            goto L_0x0093
        L_0x0092:
        L_0x0093:
            java.lang.String r3 = r4.readString()
            r2.a((defpackage.ejb) r1, (java.lang.String) r3)
            r5.writeNoException()
            goto L_0x00a8
        L_0x009e:
            boolean r3 = defpackage.bhx.a(r4)
            r2.a(r3)
            r5.writeNoException()
        L_0x00a8:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejd.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
