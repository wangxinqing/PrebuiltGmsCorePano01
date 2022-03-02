package defpackage;

/* renamed from: sar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class sar extends bhw implements sas {
    public sar() {
        super("com.google.android.gms.mdh.internal.IMobileDataHubListenerService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: sae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: ifs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: sae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: sah} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: ifs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: ifs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: ifs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: sae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: sah} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: ifs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: ifs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: ifs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: saw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: sae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: saw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: saw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: ifs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: ifs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: ifs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: saw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: sae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: saw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: saw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: ifs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: ifs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: sae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: sae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: sae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: sae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: sae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: sae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: sae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: sae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: sae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: sae} */
    /* JADX WARNING: type inference failed for: r11v0, types: [sah] */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [saf] */
    /* JADX WARNING: type inference failed for: r10v2, types: [sah] */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r4v6, types: [saf] */
    /* JADX WARNING: type inference failed for: r4v10, types: [saw] */
    /* JADX WARNING: type inference failed for: r4v14, types: [saw] */
    /* JADX WARNING: type inference failed for: r0v17, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v18, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r13, android.os.Parcel r14, android.os.Parcel r15) {
        /*
            r12 = this;
            java.lang.String r0 = "com.google.android.gms.mdh.internal.IFootprintsRecordingSettingsListener"
            java.lang.String r1 = "com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener"
            java.lang.String r2 = "com.google.android.gms.mdh.internal.ILatestFootprintListener"
            java.lang.String r3 = "com.google.android.gms.common.api.internal.IStatusCallback"
            r4 = 0
            switch(r13) {
                case 1: goto L_0x0174;
                case 2: goto L_0x0129;
                case 3: goto L_0x00dd;
                case 4: goto L_0x0091;
                case 5: goto L_0x004f;
                case 6: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            r13 = 0
            return r13
        L_0x000e:
            android.os.IBinder r13 = r14.readStrongBinder()
            if (r13 == 0) goto L_0x0025
            android.os.IInterface r1 = r13.queryLocalInterface(r3)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x001f
            ifu r1 = (defpackage.ifu) r1
            goto L_0x0026
        L_0x001f:
            ifs r1 = new ifs
            r1.<init>(r13)
            goto L_0x0026
        L_0x0025:
            r1 = r4
        L_0x0026:
            android.os.Parcelable$Creator r13 = android.accounts.Account.CREATOR
            android.os.Parcelable r13 = defpackage.bhx.a((android.os.Parcel) r14, (android.os.Parcelable.Creator) r13)
            android.accounts.Account r13 = (android.accounts.Account) r13
            r14.readInt()
            android.os.IBinder r14 = r14.readStrongBinder()
            if (r14 == 0) goto L_0x0049
            android.os.IInterface r0 = r14.queryLocalInterface(r0)
            boolean r2 = r0 instanceof defpackage.sae
            if (r2 == 0) goto L_0x0043
            r4 = r0
            sae r4 = (defpackage.sae) r4
            goto L_0x004a
        L_0x0043:
            sae r4 = new sae
            r4.<init>(r14)
            goto L_0x004a
        L_0x0049:
        L_0x004a:
            r12.a(r1, r13, r4)
            goto L_0x01c7
        L_0x004f:
            android.os.IBinder r13 = r14.readStrongBinder()
            if (r13 == 0) goto L_0x0066
            android.os.IInterface r1 = r13.queryLocalInterface(r3)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x0060
            ifu r1 = (defpackage.ifu) r1
            goto L_0x0067
        L_0x0060:
            ifs r1 = new ifs
            r1.<init>(r13)
            goto L_0x0067
        L_0x0066:
            r1 = r4
        L_0x0067:
            android.os.Parcelable$Creator r13 = android.accounts.Account.CREATOR
            android.os.Parcelable r13 = defpackage.bhx.a((android.os.Parcel) r14, (android.os.Parcelable.Creator) r13)
            android.accounts.Account r13 = (android.accounts.Account) r13
            int r2 = r14.readInt()
            android.os.IBinder r14 = r14.readStrongBinder()
            if (r14 == 0) goto L_0x008b
            android.os.IInterface r0 = r14.queryLocalInterface(r0)
            boolean r3 = r0 instanceof defpackage.sae
            if (r3 == 0) goto L_0x0085
            r4 = r0
            sae r4 = (defpackage.sae) r4
            goto L_0x008c
        L_0x0085:
            sae r4 = new sae
            r4.<init>(r14)
            goto L_0x008c
        L_0x008b:
        L_0x008c:
            r12.a(r1, r13, r2, r4)
            goto L_0x01c7
        L_0x0091:
            android.os.IBinder r13 = r14.readStrongBinder()
            if (r13 == 0) goto L_0x00aa
            android.os.IInterface r0 = r13.queryLocalInterface(r3)
            boolean r2 = r0 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x00a3
            ifu r0 = (defpackage.ifu) r0
            r6 = r0
            goto L_0x00ab
        L_0x00a3:
            ifs r0 = new ifs
            r0.<init>(r13)
            r6 = r0
            goto L_0x00ab
        L_0x00aa:
            r6 = r4
        L_0x00ab:
            android.os.Parcelable$Creator r13 = android.accounts.Account.CREATOR
            android.os.Parcelable r13 = defpackage.bhx.a((android.os.Parcel) r14, (android.os.Parcelable.Creator) r13)
            r7 = r13
            android.accounts.Account r7 = (android.accounts.Account) r7
            int r8 = r14.readInt()
            int r9 = r14.readInt()
            android.os.IBinder r13 = r14.readStrongBinder()
            if (r13 == 0) goto L_0x00d5
            android.os.IInterface r14 = r13.queryLocalInterface(r1)
            boolean r0 = r14 instanceof defpackage.saw
            if (r0 == 0) goto L_0x00cf
            r4 = r14
            saw r4 = (defpackage.saw) r4
            r10 = r4
            goto L_0x00d7
        L_0x00cf:
            saw r4 = new saw
            r4.<init>(r13)
            goto L_0x00d6
        L_0x00d5:
        L_0x00d6:
            r10 = r4
        L_0x00d7:
            r5 = r12
            r5.b(r6, r7, r8, r9, r10)
            goto L_0x01c7
        L_0x00dd:
            android.os.IBinder r13 = r14.readStrongBinder()
            if (r13 == 0) goto L_0x00f6
            android.os.IInterface r0 = r13.queryLocalInterface(r3)
            boolean r2 = r0 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x00ef
            ifu r0 = (defpackage.ifu) r0
            r6 = r0
            goto L_0x00f7
        L_0x00ef:
            ifs r0 = new ifs
            r0.<init>(r13)
            r6 = r0
            goto L_0x00f7
        L_0x00f6:
            r6 = r4
        L_0x00f7:
            android.os.Parcelable$Creator r13 = android.accounts.Account.CREATOR
            android.os.Parcelable r13 = defpackage.bhx.a((android.os.Parcel) r14, (android.os.Parcelable.Creator) r13)
            r7 = r13
            android.accounts.Account r7 = (android.accounts.Account) r7
            int r8 = r14.readInt()
            int r9 = r14.readInt()
            android.os.IBinder r13 = r14.readStrongBinder()
            if (r13 == 0) goto L_0x0121
            android.os.IInterface r14 = r13.queryLocalInterface(r1)
            boolean r0 = r14 instanceof defpackage.saw
            if (r0 == 0) goto L_0x011b
            r4 = r14
            saw r4 = (defpackage.saw) r4
            r10 = r4
            goto L_0x0123
        L_0x011b:
            saw r4 = new saw
            r4.<init>(r13)
            goto L_0x0122
        L_0x0121:
        L_0x0122:
            r10 = r4
        L_0x0123:
            r5 = r12
            r5.a((defpackage.ifu) r6, (android.accounts.Account) r7, (int) r8, (int) r9, (defpackage.saw) r10)
            goto L_0x01c7
        L_0x0129:
            android.os.IBinder r13 = r14.readStrongBinder()
            if (r13 == 0) goto L_0x0142
            android.os.IInterface r0 = r13.queryLocalInterface(r3)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x013b
            ifu r0 = (defpackage.ifu) r0
            r6 = r0
            goto L_0x0143
        L_0x013b:
            ifs r0 = new ifs
            r0.<init>(r13)
            r6 = r0
            goto L_0x0143
        L_0x0142:
            r6 = r4
        L_0x0143:
            android.os.Parcelable$Creator r13 = android.accounts.Account.CREATOR
            android.os.Parcelable r13 = defpackage.bhx.a((android.os.Parcel) r14, (android.os.Parcelable.Creator) r13)
            r7 = r13
            android.accounts.Account r7 = (android.accounts.Account) r7
            int r8 = r14.readInt()
            int r9 = r14.readInt()
            android.os.IBinder r13 = r14.readStrongBinder()
            if (r13 == 0) goto L_0x016d
            android.os.IInterface r14 = r13.queryLocalInterface(r2)
            boolean r0 = r14 instanceof defpackage.sah
            if (r0 == 0) goto L_0x0167
            r4 = r14
            sah r4 = (defpackage.sah) r4
            r10 = r4
            goto L_0x016f
        L_0x0167:
            saf r4 = new saf
            r4.<init>(r13)
            goto L_0x016e
        L_0x016d:
        L_0x016e:
            r10 = r4
        L_0x016f:
            r5 = r12
            r5.a((defpackage.ifu) r6, (android.accounts.Account) r7, (int) r8, (int) r9, (defpackage.sah) r10)
            goto L_0x01c7
        L_0x0174:
            android.os.IBinder r13 = r14.readStrongBinder()
            if (r13 == 0) goto L_0x018d
            android.os.IInterface r0 = r13.queryLocalInterface(r3)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x0186
            ifu r0 = (defpackage.ifu) r0
            r6 = r0
            goto L_0x018e
        L_0x0186:
            ifs r0 = new ifs
            r0.<init>(r13)
            r6 = r0
            goto L_0x018e
        L_0x018d:
            r6 = r4
        L_0x018e:
            android.os.Parcelable$Creator r13 = android.accounts.Account.CREATOR
            android.os.Parcelable r13 = defpackage.bhx.a((android.os.Parcel) r14, (android.os.Parcelable.Creator) r13)
            r7 = r13
            android.accounts.Account r7 = (android.accounts.Account) r7
            int r8 = r14.readInt()
            int r9 = r14.readInt()
            android.os.Parcelable$Creator r13 = com.google.android.gms.mdh.LatestFootprintFilter.CREATOR
            android.os.Parcelable r13 = defpackage.bhx.a((android.os.Parcel) r14, (android.os.Parcelable.Creator) r13)
            r10 = r13
            com.google.android.gms.mdh.LatestFootprintFilter r10 = (com.google.android.gms.mdh.LatestFootprintFilter) r10
            android.os.IBinder r13 = r14.readStrongBinder()
            if (r13 == 0) goto L_0x01c1
            android.os.IInterface r14 = r13.queryLocalInterface(r2)
            boolean r0 = r14 instanceof defpackage.sah
            if (r0 == 0) goto L_0x01bb
            r4 = r14
            sah r4 = (defpackage.sah) r4
            r11 = r4
            goto L_0x01c3
        L_0x01bb:
            saf r4 = new saf
            r4.<init>(r13)
            goto L_0x01c2
        L_0x01c1:
        L_0x01c2:
            r11 = r4
        L_0x01c3:
            r5 = r12
            r5.a(r6, r7, r8, r9, r10, r11)
        L_0x01c7:
            r15.writeNoException()
            r13 = 1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sar.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
