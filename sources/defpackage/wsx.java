package defpackage;

/* renamed from: wsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class wsx extends bhw implements wsy {
    public wsx() {
        super("com.google.android.gms.people.contactssync.internal.IContactsSyncService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v10, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v11, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v12, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v4, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4, android.os.Parcel r5, android.os.Parcel r6) {
        /*
            r3 = this;
            r0 = 194202(0x2f69a, float:2.72135E-40)
            r1 = 0
            java.lang.String r2 = "com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks"
            if (r4 == r0) goto L_0x0137
            r0 = 201202(0x311f2, float:2.81944E-40)
            if (r4 == r0) goto L_0x0110
            switch(r4) {
                case 192402: goto L_0x00f0;
                case 192403: goto L_0x00d5;
                default: goto L_0x0010;
            }
        L_0x0010:
            switch(r4) {
                case 192802: goto L_0x00b3;
                case 192803: goto L_0x0091;
                case 192804: goto L_0x006f;
                case 192805: goto L_0x0051;
                case 192806: goto L_0x0033;
                case 192807: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            r4 = 0
            return r4
        L_0x0015:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x002d
            android.os.IInterface r5 = r4.queryLocalInterface(r2)
            boolean r0 = r5 instanceof defpackage.wtb
            if (r0 == 0) goto L_0x0027
            r1 = r5
            wtb r1 = (defpackage.wtb) r1
            goto L_0x002e
        L_0x0027:
            wsz r1 = new wsz
            r1.<init>(r4)
            goto L_0x002e
        L_0x002d:
        L_0x002e:
            r3.c(r1)
            goto L_0x015b
        L_0x0033:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x004b
            android.os.IInterface r5 = r4.queryLocalInterface(r2)
            boolean r0 = r5 instanceof defpackage.wtb
            if (r0 == 0) goto L_0x0045
            r1 = r5
            wtb r1 = (defpackage.wtb) r1
            goto L_0x004c
        L_0x0045:
            wsz r1 = new wsz
            r1.<init>(r4)
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            r3.b(r1)
            goto L_0x015b
        L_0x0051:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0069
            android.os.IInterface r5 = r4.queryLocalInterface(r2)
            boolean r0 = r5 instanceof defpackage.wtb
            if (r0 == 0) goto L_0x0063
            r1 = r5
            wtb r1 = (defpackage.wtb) r1
            goto L_0x006a
        L_0x0063:
            wsz r1 = new wsz
            r1.<init>(r4)
            goto L_0x006a
        L_0x0069:
        L_0x006a:
            r3.a(r1)
            goto L_0x015b
        L_0x006f:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0087
            android.os.IInterface r0 = r4.queryLocalInterface(r2)
            boolean r1 = r0 instanceof defpackage.wtb
            if (r1 == 0) goto L_0x0081
            r1 = r0
            wtb r1 = (defpackage.wtb) r1
            goto L_0x0088
        L_0x0081:
            wsz r1 = new wsz
            r1.<init>(r4)
            goto L_0x0088
        L_0x0087:
        L_0x0088:
            int[] r4 = r5.createIntArray()
            r3.b(r1, r4)
            goto L_0x015b
        L_0x0091:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x00a9
            android.os.IInterface r0 = r4.queryLocalInterface(r2)
            boolean r1 = r0 instanceof defpackage.wtb
            if (r1 == 0) goto L_0x00a3
            r1 = r0
            wtb r1 = (defpackage.wtb) r1
            goto L_0x00aa
        L_0x00a3:
            wsz r1 = new wsz
            r1.<init>(r4)
            goto L_0x00aa
        L_0x00a9:
        L_0x00aa:
            int[] r4 = r5.createIntArray()
            r3.a((defpackage.wtb) r1, (int[]) r4)
            goto L_0x015b
        L_0x00b3:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x00cb
            android.os.IInterface r0 = r4.queryLocalInterface(r2)
            boolean r1 = r0 instanceof defpackage.wtb
            if (r1 == 0) goto L_0x00c5
            r1 = r0
            wtb r1 = (defpackage.wtb) r1
            goto L_0x00cc
        L_0x00c5:
            wsz r1 = new wsz
            r1.<init>(r4)
            goto L_0x00cc
        L_0x00cb:
        L_0x00cc:
            java.lang.String r4 = r5.readString()
            r3.a((defpackage.wtb) r1, (java.lang.String) r4)
            goto L_0x015b
        L_0x00d5:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x00eb
            android.os.IInterface r0 = r4.queryLocalInterface(r2)
            boolean r1 = r0 instanceof defpackage.wtb
            if (r1 == 0) goto L_0x00e6
            wtb r0 = (defpackage.wtb) r0
            goto L_0x00eb
        L_0x00e6:
            wsz r0 = new wsz
            r0.<init>(r4)
        L_0x00eb:
            r5.readString()
            goto L_0x015b
        L_0x00f0:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0106
            android.os.IInterface r0 = r4.queryLocalInterface(r2)
            boolean r1 = r0 instanceof defpackage.wtb
            if (r1 == 0) goto L_0x0101
            wtb r0 = (defpackage.wtb) r0
            goto L_0x0106
        L_0x0101:
            wsz r0 = new wsz
            r0.<init>(r4)
        L_0x0106:
            r5.createIntArray()
            r5.readString()
            defpackage.bhx.a(r5)
            goto L_0x015b
        L_0x0110:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0128
            android.os.IInterface r0 = r4.queryLocalInterface(r2)
            boolean r1 = r0 instanceof defpackage.wtb
            if (r1 == 0) goto L_0x0122
            r1 = r0
            wtb r1 = (defpackage.wtb) r1
            goto L_0x0129
        L_0x0122:
            wsz r1 = new wsz
            r1.<init>(r4)
            goto L_0x0129
        L_0x0128:
        L_0x0129:
            android.os.Parcelable$Creator r4 = com.google.android.gms.people.account.categories.ClassifyAccountTypeRequest.CREATOR
            java.util.ArrayList r4 = r5.createTypedArrayList(r4)
            java.lang.String r5 = r5.readString()
            r3.a(r1, r4, r5)
            goto L_0x015b
        L_0x0137:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x014f
            android.os.IInterface r0 = r4.queryLocalInterface(r2)
            boolean r1 = r0 instanceof defpackage.wtb
            if (r1 == 0) goto L_0x0149
            r1 = r0
            wtb r1 = (defpackage.wtb) r1
            goto L_0x0150
        L_0x0149:
            wsz r1 = new wsz
            r1.<init>(r4)
            goto L_0x0150
        L_0x014f:
        L_0x0150:
            android.os.Parcelable$Creator r4 = android.net.Uri.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            android.net.Uri r4 = (android.net.Uri) r4
            r3.a((defpackage.wtb) r1, (android.net.Uri) r4)
        L_0x015b:
            r6.writeNoException()
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsx.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
