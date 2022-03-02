package defpackage;

/* renamed from: ygl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ygl extends bhw implements ygm {
    public ygl() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    /* JADX WARNING: type inference failed for: r11v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r11v11, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r10, android.os.Parcel r11, android.os.Parcel r12) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r1 = "com.google.android.gms.phenotype.internal.IPhenotypeCallbacks"
            switch(r10) {
                case 1: goto L_0x037a;
                case 2: goto L_0x0347;
                case 3: goto L_0x0327;
                case 4: goto L_0x0302;
                case 5: goto L_0x02e1;
                case 6: goto L_0x02bc;
                case 7: goto L_0x029e;
                case 8: goto L_0x027d;
                case 9: goto L_0x0254;
                case 10: goto L_0x0233;
                case 11: goto L_0x020a;
                case 12: goto L_0x01e5;
                case 13: goto L_0x01ad;
                case 14: goto L_0x0175;
                case 15: goto L_0x014c;
                case 16: goto L_0x0123;
                case 17: goto L_0x00f3;
                case 18: goto L_0x00c6;
                case 19: goto L_0x00a1;
                case 20: goto L_0x007c;
                case 21: goto L_0x0056;
                case 22: goto L_0x0038;
                case 23: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r10 = 0
            return r10
        L_0x0008:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x0020
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x001a
            ygj r0 = (defpackage.ygj) r0
            r2 = r0
            goto L_0x0022
        L_0x001a:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x0021
        L_0x0020:
        L_0x0021:
            r2 = r0
        L_0x0022:
            java.lang.String r3 = r11.readString()
            java.lang.String r4 = r11.readString()
            java.lang.String r5 = r11.readString()
            java.lang.String r6 = r11.readString()
            r1 = r9
            r1.b(r2, r3, r4, r5, r6)
            goto L_0x03a8
        L_0x0038:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x0050
            android.os.IInterface r11 = r10.queryLocalInterface(r1)
            boolean r0 = r11 instanceof defpackage.ygj
            if (r0 == 0) goto L_0x004a
            r0 = r11
            ygj r0 = (defpackage.ygj) r0
            goto L_0x0051
        L_0x004a:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x0051
        L_0x0050:
        L_0x0051:
            r9.b(r0)
            goto L_0x03a8
        L_0x0056:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x006c
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x0067
            ygj r0 = (defpackage.ygj) r0
            goto L_0x006c
        L_0x0067:
            ygh r0 = new ygh
            r0.<init>(r10)
        L_0x006c:
            r11.readString()
            r11.readString()
            android.os.Parcelable$Creator r10 = com.google.android.gms.phenotype.GenericDimension.CREATOR
            java.lang.Object[] r10 = r11.createTypedArray(r10)
            com.google.android.gms.phenotype.GenericDimension[] r10 = (com.google.android.gms.phenotype.GenericDimension[]) r10
            goto L_0x03a8
        L_0x007c:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x0093
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x008d
            ygj r0 = (defpackage.ygj) r0
            goto L_0x0094
        L_0x008d:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x0094
        L_0x0093:
        L_0x0094:
            java.lang.String r10 = r11.readString()
            byte[] r11 = r11.createByteArray()
            r9.a((defpackage.ygj) r0, (java.lang.String) r10, (byte[]) r11)
            goto L_0x03a8
        L_0x00a1:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x00b8
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x00b2
            ygj r0 = (defpackage.ygj) r0
            goto L_0x00b9
        L_0x00b2:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x00b9
        L_0x00b8:
        L_0x00b9:
            android.os.Parcelable$Creator r10 = com.google.android.gms.phenotype.RegistrationInfo.CREATOR
            java.lang.Object[] r10 = r11.createTypedArray(r10)
            com.google.android.gms.phenotype.RegistrationInfo[] r10 = (com.google.android.gms.phenotype.RegistrationInfo[]) r10
            r9.a((defpackage.ygj) r0, (com.google.android.gms.phenotype.RegistrationInfo[]) r10)
            goto L_0x03a8
        L_0x00c6:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x00dd
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x00d7
            ygj r0 = (defpackage.ygj) r0
            goto L_0x00de
        L_0x00d7:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x00de
        L_0x00dd:
        L_0x00de:
            java.lang.String r10 = r11.readString()
            java.lang.String r1 = r11.readString()
            android.os.Parcelable$Creator r2 = com.google.android.gms.phenotype.Flag.CREATOR
            java.lang.Object[] r11 = r11.createTypedArray(r2)
            com.google.android.gms.phenotype.Flag[] r11 = (com.google.android.gms.phenotype.Flag[]) r11
            r9.a((defpackage.ygj) r0, (java.lang.String) r10, (java.lang.String) r1, (com.google.android.gms.phenotype.Flag[]) r11)
            goto L_0x03a8
        L_0x00f3:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x010b
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x0105
            ygj r0 = (defpackage.ygj) r0
            r2 = r0
            goto L_0x010d
        L_0x0105:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x010c
        L_0x010b:
        L_0x010c:
            r2 = r0
        L_0x010d:
            java.lang.String r3 = r11.readString()
            java.lang.String r4 = r11.readString()
            java.lang.String r5 = r11.readString()
            java.lang.String r6 = r11.readString()
            r1 = r9
            r1.a((defpackage.ygj) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6)
            goto L_0x03a8
        L_0x0123:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x013a
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x0134
            ygj r0 = (defpackage.ygj) r0
            goto L_0x013b
        L_0x0134:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x013b
        L_0x013a:
        L_0x013b:
            java.lang.String r10 = r11.readString()
            java.lang.String r1 = r11.readString()
            java.lang.String r11 = r11.readString()
            r9.c(r0, r10, r1, r11)
            goto L_0x03a8
        L_0x014c:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x0163
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x015d
            ygj r0 = (defpackage.ygj) r0
            goto L_0x0164
        L_0x015d:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x0164
        L_0x0163:
        L_0x0164:
            java.lang.String r10 = r11.readString()
            java.lang.String r1 = r11.readString()
            java.lang.String r11 = r11.readString()
            r9.b(r0, r10, r1, r11)
            goto L_0x03a8
        L_0x0175:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x018d
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x0187
            ygj r0 = (defpackage.ygj) r0
            r2 = r0
            goto L_0x018f
        L_0x0187:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x018e
        L_0x018d:
        L_0x018e:
            r2 = r0
        L_0x018f:
            java.lang.String r3 = r11.readString()
            java.lang.String r4 = r11.readString()
            java.lang.String r5 = r11.readString()
            int r6 = r11.readInt()
            int r7 = r11.readInt()
            java.lang.String r8 = r11.readString()
            r1 = r9
            r1.a((defpackage.ygj) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (int) r6, (int) r7, (java.lang.String) r8)
            goto L_0x03a8
        L_0x01ad:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x01c5
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x01bf
            ygj r0 = (defpackage.ygj) r0
            r2 = r0
            goto L_0x01c7
        L_0x01bf:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x01c6
        L_0x01c5:
        L_0x01c6:
            r2 = r0
        L_0x01c7:
            java.lang.String r3 = r11.readString()
            int r4 = r11.readInt()
            java.lang.String[] r5 = r11.createStringArray()
            byte[] r6 = r11.createByteArray()
            java.lang.String r7 = r11.readString()
            java.lang.String r8 = r11.readString()
            r1 = r9
            r1.a((defpackage.ygj) r2, (java.lang.String) r3, (int) r4, (java.lang.String[]) r5, (byte[]) r6, (java.lang.String) r7, (java.lang.String) r8)
            goto L_0x03a8
        L_0x01e5:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x01fc
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x01f6
            ygj r0 = (defpackage.ygj) r0
            goto L_0x01fd
        L_0x01f6:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x01fd
        L_0x01fc:
        L_0x01fd:
            java.lang.String r10 = r11.readString()
            long r1 = r11.readLong()
            r9.a((defpackage.ygj) r0, (java.lang.String) r10, (long) r1)
            goto L_0x03a8
        L_0x020a:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x0221
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x021b
            ygj r0 = (defpackage.ygj) r0
            goto L_0x0222
        L_0x021b:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x0222
        L_0x0221:
        L_0x0222:
            java.lang.String r10 = r11.readString()
            java.lang.String r1 = r11.readString()
            java.lang.String r11 = r11.readString()
            r9.a((defpackage.ygj) r0, (java.lang.String) r10, (java.lang.String) r1, (java.lang.String) r11)
            goto L_0x03a8
        L_0x0233:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x024a
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x0244
            ygj r0 = (defpackage.ygj) r0
            goto L_0x024b
        L_0x0244:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x024b
        L_0x024a:
        L_0x024b:
            java.lang.String r10 = r11.readString()
            r9.c(r0, r10)
            goto L_0x03a8
        L_0x0254:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x026b
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x0265
            ygj r0 = (defpackage.ygj) r0
            goto L_0x026c
        L_0x0265:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x026c
        L_0x026b:
        L_0x026c:
            java.lang.String r10 = r11.readString()
            java.lang.String r1 = r11.readString()
            int r11 = r11.readInt()
            r9.a((defpackage.ygj) r0, (java.lang.String) r10, (java.lang.String) r1, (int) r11)
            goto L_0x03a8
        L_0x027d:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x0294
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x028e
            ygj r0 = (defpackage.ygj) r0
            goto L_0x0295
        L_0x028e:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x0295
        L_0x0294:
        L_0x0295:
            byte[] r10 = r11.createByteArray()
            r9.a((defpackage.ygj) r0, (byte[]) r10)
            goto L_0x03a8
        L_0x029e:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x02b6
            android.os.IInterface r11 = r10.queryLocalInterface(r1)
            boolean r0 = r11 instanceof defpackage.ygj
            if (r0 == 0) goto L_0x02b0
            r0 = r11
            ygj r0 = (defpackage.ygj) r0
            goto L_0x02b7
        L_0x02b0:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x02b7
        L_0x02b6:
        L_0x02b7:
            r9.a(r0)
            goto L_0x03a8
        L_0x02bc:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x02d3
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x02cd
            ygj r0 = (defpackage.ygj) r0
            goto L_0x02d4
        L_0x02cd:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x02d4
        L_0x02d3:
        L_0x02d4:
            java.lang.String r10 = r11.readString()
            java.lang.String r11 = r11.readString()
            r9.b(r0, r10, r11)
            goto L_0x03a8
        L_0x02e1:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x02f8
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x02f2
            ygj r0 = (defpackage.ygj) r0
            goto L_0x02f9
        L_0x02f2:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x02f9
        L_0x02f8:
        L_0x02f9:
            java.lang.String r10 = r11.readString()
            r9.b(r0, r10)
            goto L_0x03a8
        L_0x0302:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x0319
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x0313
            ygj r0 = (defpackage.ygj) r0
            goto L_0x031a
        L_0x0313:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x031a
        L_0x0319:
        L_0x031a:
            java.lang.String r10 = r11.readString()
            java.lang.String r11 = r11.readString()
            r9.a((defpackage.ygj) r0, (java.lang.String) r10, (java.lang.String) r11)
            goto L_0x03a8
        L_0x0327:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x033e
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x0338
            ygj r0 = (defpackage.ygj) r0
            goto L_0x033f
        L_0x0338:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x033f
        L_0x033e:
        L_0x033f:
            java.lang.String r10 = r11.readString()
            r9.a((defpackage.ygj) r0, (java.lang.String) r10)
            goto L_0x03a8
        L_0x0347:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x035f
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x0359
            ygj r0 = (defpackage.ygj) r0
            r2 = r0
            goto L_0x0361
        L_0x0359:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x0360
        L_0x035f:
        L_0x0360:
            r2 = r0
        L_0x0361:
            java.lang.String r3 = r11.readString()
            int r4 = r11.readInt()
            java.lang.String[] r5 = r11.createStringArray()
            int[] r6 = r11.createIntArray()
            byte[] r7 = r11.createByteArray()
            r1 = r9
            r1.a(r2, r3, r4, r5, r6, r7)
            goto L_0x03a8
        L_0x037a:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x0392
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ygj
            if (r1 == 0) goto L_0x038c
            ygj r0 = (defpackage.ygj) r0
            r2 = r0
            goto L_0x0394
        L_0x038c:
            ygh r0 = new ygh
            r0.<init>(r10)
            goto L_0x0393
        L_0x0392:
        L_0x0393:
            r2 = r0
        L_0x0394:
            java.lang.String r3 = r11.readString()
            int r4 = r11.readInt()
            java.lang.String[] r5 = r11.createStringArray()
            byte[] r6 = r11.createByteArray()
            r1 = r9
            r1.a((defpackage.ygj) r2, (java.lang.String) r3, (int) r4, (java.lang.String[]) r5, (byte[]) r6)
        L_0x03a8:
            r12.writeNoException()
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygl.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
