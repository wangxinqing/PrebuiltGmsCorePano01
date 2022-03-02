package defpackage;

/* renamed from: hsz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class hsz extends bhw implements hta {
    public hsz() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r3v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r3v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v7, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v8, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v9, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r2, android.os.Parcel r3, android.os.Parcel r4) {
        /*
            r1 = this;
            java.lang.String r4 = "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks"
            r0 = 0
            switch(r2) {
                case 1: goto L_0x0105;
                case 2: goto L_0x00e8;
                case 3: goto L_0x00cb;
                case 4: goto L_0x00ae;
                case 5: goto L_0x0090;
                case 6: goto L_0x006e;
                case 7: goto L_0x004c;
                case 8: goto L_0x0026;
                case 9: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r2 = 0
            return r2
        L_0x0008:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x0020
            android.os.IInterface r3 = r2.queryLocalInterface(r4)
            boolean r4 = r3 instanceof defpackage.hsx
            if (r4 == 0) goto L_0x001a
            r0 = r3
            hsx r0 = (defpackage.hsx) r0
            goto L_0x0021
        L_0x001a:
            hsv r0 = new hsv
            r0.<init>(r2)
            goto L_0x0021
        L_0x0020:
        L_0x0021:
            r1.e(r0)
            goto L_0x0129
        L_0x0026:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x003e
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.hsx
            if (r0 == 0) goto L_0x0038
            r0 = r4
            hsx r0 = (defpackage.hsx) r0
            goto L_0x003f
        L_0x0038:
            hsv r0 = new hsv
            r0.<init>(r2)
            goto L_0x003f
        L_0x003e:
        L_0x003f:
            android.os.Parcelable$Creator r2 = com.google.android.gms.clearcut.CollectForDebugParcelable.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r3, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.clearcut.CollectForDebugParcelable r2 = (com.google.android.gms.clearcut.CollectForDebugParcelable) r2
            r1.a((defpackage.hsx) r0, (com.google.android.gms.clearcut.CollectForDebugParcelable) r2)
            goto L_0x0129
        L_0x004c:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x0064
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.hsx
            if (r0 == 0) goto L_0x005e
            r0 = r4
            hsx r0 = (defpackage.hsx) r0
            goto L_0x0065
        L_0x005e:
            hsv r0 = new hsv
            r0.<init>(r2)
            goto L_0x0065
        L_0x0064:
        L_0x0065:
            java.lang.String r2 = r3.readString()
            r1.b(r0, r2)
            goto L_0x0129
        L_0x006e:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x0086
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.hsx
            if (r0 == 0) goto L_0x0080
            r0 = r4
            hsx r0 = (defpackage.hsx) r0
            goto L_0x0087
        L_0x0080:
            hsv r0 = new hsv
            r0.<init>(r2)
            goto L_0x0087
        L_0x0086:
        L_0x0087:
            java.lang.String r2 = r3.readString()
            r1.a((defpackage.hsx) r0, (java.lang.String) r2)
            goto L_0x0129
        L_0x0090:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x00a8
            android.os.IInterface r3 = r2.queryLocalInterface(r4)
            boolean r4 = r3 instanceof defpackage.hsx
            if (r4 == 0) goto L_0x00a2
            r0 = r3
            hsx r0 = (defpackage.hsx) r0
            goto L_0x00a9
        L_0x00a2:
            hsv r0 = new hsv
            r0.<init>(r2)
            goto L_0x00a9
        L_0x00a8:
        L_0x00a9:
            r1.d(r0)
            goto L_0x0129
        L_0x00ae:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x00c6
            android.os.IInterface r3 = r2.queryLocalInterface(r4)
            boolean r4 = r3 instanceof defpackage.hsx
            if (r4 == 0) goto L_0x00c0
            r0 = r3
            hsx r0 = (defpackage.hsx) r0
            goto L_0x00c7
        L_0x00c0:
            hsv r0 = new hsv
            r0.<init>(r2)
            goto L_0x00c7
        L_0x00c6:
        L_0x00c7:
            r1.c(r0)
            goto L_0x0129
        L_0x00cb:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x00e3
            android.os.IInterface r3 = r2.queryLocalInterface(r4)
            boolean r4 = r3 instanceof defpackage.hsx
            if (r4 == 0) goto L_0x00dd
            r0 = r3
            hsx r0 = (defpackage.hsx) r0
            goto L_0x00e4
        L_0x00dd:
            hsv r0 = new hsv
            r0.<init>(r2)
            goto L_0x00e4
        L_0x00e3:
        L_0x00e4:
            r1.b(r0)
            goto L_0x0129
        L_0x00e8:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x0100
            android.os.IInterface r3 = r2.queryLocalInterface(r4)
            boolean r4 = r3 instanceof defpackage.hsx
            if (r4 == 0) goto L_0x00fa
            r0 = r3
            hsx r0 = (defpackage.hsx) r0
            goto L_0x0101
        L_0x00fa:
            hsv r0 = new hsv
            r0.<init>(r2)
            goto L_0x0101
        L_0x0100:
        L_0x0101:
            r1.a(r0)
            goto L_0x0129
        L_0x0105:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 == 0) goto L_0x011d
            android.os.IInterface r4 = r2.queryLocalInterface(r4)
            boolean r0 = r4 instanceof defpackage.hsx
            if (r0 == 0) goto L_0x0117
            r0 = r4
            hsx r0 = (defpackage.hsx) r0
            goto L_0x011e
        L_0x0117:
            hsv r0 = new hsv
            r0.<init>(r2)
            goto L_0x011e
        L_0x011d:
        L_0x011e:
            android.os.Parcelable$Creator r2 = com.google.android.gms.clearcut.LogEventParcelable.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r3, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.clearcut.LogEventParcelable r2 = (com.google.android.gms.clearcut.LogEventParcelable) r2
            r1.a((defpackage.hsx) r0, (com.google.android.gms.clearcut.LogEventParcelable) r2)
        L_0x0129:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsz.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
