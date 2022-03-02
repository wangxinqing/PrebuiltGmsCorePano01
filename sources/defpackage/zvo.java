package defpackage;

/* renamed from: zvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class zvo extends bhw implements zvp {
    public zvo() {
        super("com.google.android.gms.romanesco.internal.IRomanescoService");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v6, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v8, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v11, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v13, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v15, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v18, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r11, android.os.Parcel r12, android.os.Parcel r13) {
        /*
            r10 = this;
            r0 = 1101(0x44d, float:1.543E-42)
            java.lang.String r1 = "com.google.android.gms.romanesco.internal.IRomanescoCallbacks"
            r2 = 0
            if (r11 == r0) goto L_0x0156
            r0 = 1102(0x44e, float:1.544E-42)
            if (r11 == r0) goto L_0x0126
            r0 = 1201(0x4b1, float:1.683E-42)
            if (r11 == r0) goto L_0x0101
            r0 = 1401(0x579, float:1.963E-42)
            if (r11 == r0) goto L_0x00cc
            r0 = 2701(0xa8d, float:3.785E-42)
            if (r11 == r0) goto L_0x00a6
            r0 = 2902(0xb56, float:4.067E-42)
            if (r11 == r0) goto L_0x0084
            r0 = 2801(0xaf1, float:3.925E-42)
            if (r11 == r0) goto L_0x004f
            r0 = 2802(0xaf2, float:3.926E-42)
            if (r11 == r0) goto L_0x0025
            r11 = 0
            return r11
        L_0x0025:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x003d
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.zvm
            if (r1 == 0) goto L_0x0037
            r2 = r0
            zvm r2 = (defpackage.zvm) r2
            goto L_0x003e
        L_0x0037:
            zvk r2 = new zvk
            r2.<init>(r11)
            goto L_0x003e
        L_0x003d:
        L_0x003e:
            java.lang.String r11 = r12.readString()
            java.lang.String r0 = r12.readString()
            java.lang.String[] r12 = r12.createStringArray()
            r10.b(r2, r11, r0, r12)
            goto L_0x017e
        L_0x004f:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x0068
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.zvm
            if (r1 == 0) goto L_0x0062
            r2 = r0
            zvm r2 = (defpackage.zvm) r2
            r4 = r2
            goto L_0x006a
        L_0x0062:
            zvk r2 = new zvk
            r2.<init>(r11)
            goto L_0x0069
        L_0x0068:
        L_0x0069:
            r4 = r2
        L_0x006a:
            java.lang.String r5 = r12.readString()
            java.lang.String r6 = r12.readString()
            java.lang.String r7 = r12.readString()
            java.lang.String r8 = r12.readString()
            java.lang.String[] r9 = r12.createStringArray()
            r3 = r10
            r3.b(r4, r5, r6, r7, r8, r9)
            goto L_0x017e
        L_0x0084:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x009c
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.zvm
            if (r1 == 0) goto L_0x0096
            r2 = r0
            zvm r2 = (defpackage.zvm) r2
            goto L_0x009d
        L_0x0096:
            zvk r2 = new zvk
            r2.<init>(r11)
            goto L_0x009d
        L_0x009c:
        L_0x009d:
            java.lang.String r11 = r12.readString()
            r10.a(r2, r11)
            goto L_0x017e
        L_0x00a6:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x00be
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.zvm
            if (r1 == 0) goto L_0x00b8
            r2 = r0
            zvm r2 = (defpackage.zvm) r2
            goto L_0x00bf
        L_0x00b8:
            zvk r2 = new zvk
            r2.<init>(r11)
            goto L_0x00bf
        L_0x00be:
        L_0x00bf:
            java.lang.String r11 = r12.readString()
            long r0 = r12.readLong()
            r10.a((defpackage.zvm) r2, (java.lang.String) r11, (long) r0)
            goto L_0x017e
        L_0x00cc:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x00e5
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.zvm
            if (r1 == 0) goto L_0x00df
            r2 = r0
            zvm r2 = (defpackage.zvm) r2
            r4 = r2
            goto L_0x00e7
        L_0x00df:
            zvk r2 = new zvk
            r2.<init>(r11)
            goto L_0x00e6
        L_0x00e5:
        L_0x00e6:
            r4 = r2
        L_0x00e7:
            java.lang.String r5 = r12.readString()
            java.lang.String r6 = r12.readString()
            java.lang.String r7 = r12.readString()
            java.lang.String r8 = r12.readString()
            java.lang.String[] r9 = r12.createStringArray()
            r3 = r10
            r3.a(r4, r5, r6, r7, r8, r9)
            goto L_0x017e
        L_0x0101:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x0119
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.zvm
            if (r1 == 0) goto L_0x0113
            r2 = r0
            zvm r2 = (defpackage.zvm) r2
            goto L_0x011a
        L_0x0113:
            zvk r2 = new zvk
            r2.<init>(r11)
            goto L_0x011a
        L_0x0119:
        L_0x011a:
            java.lang.String r11 = r12.readString()
            java.lang.String r12 = r12.readString()
            r10.a((defpackage.zvm) r2, (java.lang.String) r11, (java.lang.String) r12)
            goto L_0x017e
        L_0x0126:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x013f
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.zvm
            if (r1 == 0) goto L_0x0139
            r2 = r0
            zvm r2 = (defpackage.zvm) r2
            r4 = r2
            goto L_0x0141
        L_0x0139:
            zvk r2 = new zvk
            r2.<init>(r11)
            goto L_0x0140
        L_0x013f:
        L_0x0140:
            r4 = r2
        L_0x0141:
            java.lang.String r5 = r12.readString()
            java.lang.String r6 = r12.readString()
            java.lang.String r7 = r12.readString()
            java.lang.String[] r8 = r12.createStringArray()
            r3 = r10
            r3.a(r4, r5, r6, r7, r8)
            goto L_0x017e
        L_0x0156:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x016e
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.zvm
            if (r1 == 0) goto L_0x0168
            r2 = r0
            zvm r2 = (defpackage.zvm) r2
            goto L_0x016f
        L_0x0168:
            zvk r2 = new zvk
            r2.<init>(r11)
            goto L_0x016f
        L_0x016e:
        L_0x016f:
            java.lang.String r11 = r12.readString()
            java.lang.String r0 = r12.readString()
            java.lang.String[] r12 = r12.createStringArray()
            r10.a(r2, r11, r0, r12)
        L_0x017e:
            r13.writeNoException()
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zvo.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
