package defpackage;

/* renamed from: dya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class dya extends bhw implements dyb {
    public dya() {
        super("com.google.android.gms.appinvite.ui.context.ISelectionFragmentHolder");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: dxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: dxz} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [mby] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4, android.os.Parcel r5, android.os.Parcel r6) {
        /*
            r3 = this;
            r0 = 1
            if (r4 == r0) goto L_0x00d3
            r1 = 2
            r2 = 0
            if (r4 == r1) goto L_0x00b1
            r1 = 3
            if (r4 == r1) goto L_0x00a2
            switch(r4) {
                case 101: goto L_0x0097;
                case 102: goto L_0x0075;
                case 103: goto L_0x0053;
                case 104: goto L_0x0047;
                case 105: goto L_0x0037;
                case 106: goto L_0x0027;
                case 107: goto L_0x001b;
                case 108: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            r4 = 0
            return r4
        L_0x000f:
            int r4 = r5.readInt()
            r3.b((int) r4)
            r6.writeNoException()
            goto L_0x00dd
        L_0x001b:
            int r4 = r5.readInt()
            r3.a((int) r4)
            r6.writeNoException()
            goto L_0x00dd
        L_0x0027:
            android.os.Parcelable$Creator r4 = com.google.android.gms.appinvite.model.ContactPerson.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.appinvite.model.ContactPerson r4 = (com.google.android.gms.appinvite.model.ContactPerson) r4
            r3.b((com.google.android.gms.appinvite.model.ContactPerson) r4)
            r6.writeNoException()
            goto L_0x00dd
        L_0x0037:
            android.os.Parcelable$Creator r4 = com.google.android.gms.appinvite.model.ContactPerson.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.appinvite.model.ContactPerson r4 = (com.google.android.gms.appinvite.model.ContactPerson) r4
            r3.a((com.google.android.gms.appinvite.model.ContactPerson) r4)
            r6.writeNoException()
            goto L_0x00dd
        L_0x0047:
            boolean r4 = defpackage.bhx.a(r5)
            r3.a((boolean) r4)
            r6.writeNoException()
            goto L_0x00dd
        L_0x0053:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x006d
            java.lang.String r5 = "com.google.android.gms.appinvite.ui.context.ISelectionChangeListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r1 = r5 instanceof defpackage.dxz
            if (r1 == 0) goto L_0x0067
            r2 = r5
            dxz r2 = (defpackage.dxz) r2
            goto L_0x006e
        L_0x0067:
            dxz r2 = new dxz
            r2.<init>(r4)
            goto L_0x006e
        L_0x006d:
        L_0x006e:
            r3.a((defpackage.dxz) r2)
            r6.writeNoException()
            goto L_0x00dd
        L_0x0075:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x008f
            java.lang.String r5 = "com.google.android.gms.appinvite.ui.context.ILoadingListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r1 = r5 instanceof defpackage.dxy
            if (r1 == 0) goto L_0x0089
            r2 = r5
            dxy r2 = (defpackage.dxy) r2
            goto L_0x0090
        L_0x0089:
            dxy r2 = new dxy
            r2.<init>(r4)
            goto L_0x0090
        L_0x008f:
        L_0x0090:
            r3.a((defpackage.dxy) r2)
            r6.writeNoException()
            goto L_0x00dd
        L_0x0097:
            java.util.List r4 = r3.b()
            r6.writeNoException()
            r6.writeTypedList(r4)
            goto L_0x00dd
        L_0x00a2:
            android.os.Parcelable$Creator r4 = com.google.android.gms.appinvite.ui.context.SelectionFragmentOptions.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.appinvite.ui.context.SelectionFragmentOptions r4 = (com.google.android.gms.appinvite.ui.context.SelectionFragmentOptions) r4
            r3.a((com.google.android.gms.appinvite.ui.context.SelectionFragmentOptions) r4)
            r6.writeNoException()
            goto L_0x00dd
        L_0x00b1:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x00cb
            java.lang.String r5 = "com.google.android.gms.dynamic.IObjectWrapper"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r1 = r5 instanceof defpackage.mby
            if (r1 == 0) goto L_0x00c5
            r2 = r5
            mby r2 = (defpackage.mby) r2
            goto L_0x00cc
        L_0x00c5:
            mbw r2 = new mbw
            r2.<init>(r4)
            goto L_0x00cc
        L_0x00cb:
        L_0x00cc:
            r3.a((defpackage.mby) r2)
            r6.writeNoException()
            goto L_0x00dd
        L_0x00d3:
            mby r4 = r3.a()
            r6.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r6, (android.os.IInterface) r4)
        L_0x00dd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dya.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
