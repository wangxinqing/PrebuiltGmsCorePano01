package defpackage;

/* renamed from: ojs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ojs extends bhw implements ojt {
    public ojs() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
    }

    /* JADX WARNING: type inference failed for: r11v18, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r11v19, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r11v20, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r12v6, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r12v7, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r12v8, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r12v9, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r12v10, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r10, android.os.Parcel r11, android.os.Parcel r12) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r1 = "com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks"
            switch(r10) {
                case 1: goto L_0x02be;
                case 2: goto L_0x028f;
                case 3: goto L_0x026d;
                case 4: goto L_0x0252;
                case 5: goto L_0x0237;
                case 6: goto L_0x021c;
                case 7: goto L_0x01fe;
                case 8: goto L_0x01c7;
                case 9: goto L_0x0190;
                case 10: goto L_0x0150;
                case 11: goto L_0x0123;
                case 12: goto L_0x00f6;
                case 13: goto L_0x00d0;
                case 14: goto L_0x00aa;
                case 15: goto L_0x0084;
                case 16: goto L_0x005e;
                case 17: goto L_0x002e;
                case 18: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r10 = 0
            return r10
        L_0x0008:
            android.os.Parcelable$Creator r10 = com.google.android.gms.googlehelp.GoogleHelp.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.googlehelp.GoogleHelp r10 = (com.google.android.gms.googlehelp.GoogleHelp) r10
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 == 0) goto L_0x0028
            android.os.IInterface r12 = r11.queryLocalInterface(r1)
            boolean r0 = r12 instanceof defpackage.ojq
            if (r0 == 0) goto L_0x0022
            r0 = r12
            ojq r0 = (defpackage.ojq) r0
            goto L_0x0029
        L_0x0022:
            ojo r0 = new ojo
            r0.<init>(r11)
            goto L_0x0029
        L_0x0028:
        L_0x0029:
            r9.d(r10, r0)
            goto L_0x02e4
        L_0x002e:
            android.os.Parcelable$Creator r10 = com.google.android.gms.googlehelp.InProductHelp.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.googlehelp.InProductHelp r10 = (com.google.android.gms.googlehelp.InProductHelp) r10
            android.os.Parcelable$Creator r2 = android.graphics.Bitmap.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r2)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 == 0) goto L_0x0055
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ojq
            if (r1 == 0) goto L_0x004f
            ojq r0 = (defpackage.ojq) r0
            goto L_0x0056
        L_0x004f:
            ojo r0 = new ojo
            r0.<init>(r11)
            goto L_0x0056
        L_0x0055:
        L_0x0056:
            r9.a((com.google.android.gms.googlehelp.InProductHelp) r10, (defpackage.ojq) r0)
            r12.writeNoException()
            goto L_0x02e4
        L_0x005e:
            android.os.Parcelable$Creator r10 = com.google.android.gms.googlehelp.SupportRequestHelp.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.googlehelp.SupportRequestHelp r10 = (com.google.android.gms.googlehelp.SupportRequestHelp) r10
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 == 0) goto L_0x007e
            android.os.IInterface r12 = r11.queryLocalInterface(r1)
            boolean r0 = r12 instanceof defpackage.ojq
            if (r0 == 0) goto L_0x0078
            r0 = r12
            ojq r0 = (defpackage.ojq) r0
            goto L_0x007f
        L_0x0078:
            ojo r0 = new ojo
            r0.<init>(r11)
            goto L_0x007f
        L_0x007e:
        L_0x007f:
            r9.b((com.google.android.gms.googlehelp.SupportRequestHelp) r10, (defpackage.ojq) r0)
            goto L_0x02e4
        L_0x0084:
            android.os.Parcelable$Creator r10 = com.google.android.gms.googlehelp.SupportRequestHelp.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.googlehelp.SupportRequestHelp r10 = (com.google.android.gms.googlehelp.SupportRequestHelp) r10
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 == 0) goto L_0x00a4
            android.os.IInterface r12 = r11.queryLocalInterface(r1)
            boolean r0 = r12 instanceof defpackage.ojq
            if (r0 == 0) goto L_0x009e
            r0 = r12
            ojq r0 = (defpackage.ojq) r0
            goto L_0x00a5
        L_0x009e:
            ojo r0 = new ojo
            r0.<init>(r11)
            goto L_0x00a5
        L_0x00a4:
        L_0x00a5:
            r9.a((com.google.android.gms.googlehelp.SupportRequestHelp) r10, (defpackage.ojq) r0)
            goto L_0x02e4
        L_0x00aa:
            android.os.Parcelable$Creator r10 = com.google.android.gms.googlehelp.GoogleHelp.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.googlehelp.GoogleHelp r10 = (com.google.android.gms.googlehelp.GoogleHelp) r10
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 == 0) goto L_0x00ca
            android.os.IInterface r12 = r11.queryLocalInterface(r1)
            boolean r0 = r12 instanceof defpackage.ojq
            if (r0 == 0) goto L_0x00c4
            r0 = r12
            ojq r0 = (defpackage.ojq) r0
            goto L_0x00cb
        L_0x00c4:
            ojo r0 = new ojo
            r0.<init>(r11)
            goto L_0x00cb
        L_0x00ca:
        L_0x00cb:
            r9.c(r10, r0)
            goto L_0x02e4
        L_0x00d0:
            android.os.Parcelable$Creator r10 = com.google.android.gms.googlehelp.GoogleHelp.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.googlehelp.GoogleHelp r10 = (com.google.android.gms.googlehelp.GoogleHelp) r10
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 == 0) goto L_0x00f0
            android.os.IInterface r12 = r11.queryLocalInterface(r1)
            boolean r0 = r12 instanceof defpackage.ojq
            if (r0 == 0) goto L_0x00ea
            r0 = r12
            ojq r0 = (defpackage.ojq) r0
            goto L_0x00f1
        L_0x00ea:
            ojo r0 = new ojo
            r0.<init>(r11)
            goto L_0x00f1
        L_0x00f0:
        L_0x00f1:
            r9.b((com.google.android.gms.googlehelp.GoogleHelp) r10, (defpackage.ojq) r0)
            goto L_0x02e4
        L_0x00f6:
            android.os.Parcelable$Creator r10 = com.google.android.gms.googlehelp.GoogleHelp.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.googlehelp.GoogleHelp r10 = (com.google.android.gms.googlehelp.GoogleHelp) r10
            java.lang.String r12 = r11.readString()
            java.lang.String r2 = r11.readString()
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 == 0) goto L_0x011d
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ojq
            if (r1 == 0) goto L_0x0117
            ojq r0 = (defpackage.ojq) r0
            goto L_0x011e
        L_0x0117:
            ojo r0 = new ojo
            r0.<init>(r11)
            goto L_0x011e
        L_0x011d:
        L_0x011e:
            r9.b((com.google.android.gms.googlehelp.GoogleHelp) r10, (java.lang.String) r12, (java.lang.String) r2, (defpackage.ojq) r0)
            goto L_0x02e4
        L_0x0123:
            android.os.Parcelable$Creator r10 = com.google.android.gms.googlehelp.GoogleHelp.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.googlehelp.GoogleHelp r10 = (com.google.android.gms.googlehelp.GoogleHelp) r10
            java.lang.String r12 = r11.readString()
            java.lang.String r2 = r11.readString()
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 == 0) goto L_0x014a
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ojq
            if (r1 == 0) goto L_0x0144
            ojq r0 = (defpackage.ojq) r0
            goto L_0x014b
        L_0x0144:
            ojo r0 = new ojo
            r0.<init>(r11)
            goto L_0x014b
        L_0x014a:
        L_0x014b:
            r9.a((com.google.android.gms.googlehelp.GoogleHelp) r10, (java.lang.String) r12, (java.lang.String) r2, (defpackage.ojq) r0)
            goto L_0x02e4
        L_0x0150:
            android.os.Parcelable$Creator r10 = com.google.android.gms.feedback.FeedbackOptions.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            r3 = r10
            com.google.android.gms.feedback.FeedbackOptions r3 = (com.google.android.gms.feedback.FeedbackOptions) r3
            android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            r4 = r10
            android.os.Bundle r4 = (android.os.Bundle) r4
            long r5 = r11.readLong()
            android.os.Parcelable$Creator r10 = com.google.android.gms.googlehelp.GoogleHelp.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            r7 = r10
            com.google.android.gms.googlehelp.GoogleHelp r7 = (com.google.android.gms.googlehelp.GoogleHelp) r7
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x0188
            android.os.IInterface r11 = r10.queryLocalInterface(r1)
            boolean r12 = r11 instanceof defpackage.ojq
            if (r12 == 0) goto L_0x0182
            r0 = r11
            ojq r0 = (defpackage.ojq) r0
            r8 = r0
            goto L_0x018a
        L_0x0182:
            ojo r0 = new ojo
            r0.<init>(r10)
            goto L_0x0189
        L_0x0188:
        L_0x0189:
            r8 = r0
        L_0x018a:
            r2 = r9
            r2.a(r3, r4, r5, r7, r8)
            goto L_0x02e4
        L_0x0190:
            android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            r3 = r10
            android.os.Bundle r3 = (android.os.Bundle) r3
            long r4 = r11.readLong()
            android.os.Parcelable$Creator r10 = com.google.android.gms.googlehelp.GoogleHelp.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            r6 = r10
            com.google.android.gms.googlehelp.GoogleHelp r6 = (com.google.android.gms.googlehelp.GoogleHelp) r6
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x01bf
            android.os.IInterface r11 = r10.queryLocalInterface(r1)
            boolean r12 = r11 instanceof defpackage.ojq
            if (r12 == 0) goto L_0x01b9
            r0 = r11
            ojq r0 = (defpackage.ojq) r0
            r7 = r0
            goto L_0x01c1
        L_0x01b9:
            ojo r0 = new ojo
            r0.<init>(r10)
            goto L_0x01c0
        L_0x01bf:
        L_0x01c0:
            r7 = r0
        L_0x01c1:
            r2 = r9
            r2.b((android.os.Bundle) r3, (long) r4, (com.google.android.gms.googlehelp.GoogleHelp) r6, (defpackage.ojq) r7)
            goto L_0x02e4
        L_0x01c7:
            android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            r3 = r10
            android.os.Bundle r3 = (android.os.Bundle) r3
            long r4 = r11.readLong()
            android.os.Parcelable$Creator r10 = com.google.android.gms.googlehelp.GoogleHelp.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            r6 = r10
            com.google.android.gms.googlehelp.GoogleHelp r6 = (com.google.android.gms.googlehelp.GoogleHelp) r6
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x01f6
            android.os.IInterface r11 = r10.queryLocalInterface(r1)
            boolean r12 = r11 instanceof defpackage.ojq
            if (r12 == 0) goto L_0x01f0
            r0 = r11
            ojq r0 = (defpackage.ojq) r0
            r7 = r0
            goto L_0x01f8
        L_0x01f0:
            ojo r0 = new ojo
            r0.<init>(r10)
            goto L_0x01f7
        L_0x01f6:
        L_0x01f7:
            r7 = r0
        L_0x01f8:
            r2 = r9
            r2.a((android.os.Bundle) r3, (long) r4, (com.google.android.gms.googlehelp.GoogleHelp) r6, (defpackage.ojq) r7)
            goto L_0x02e4
        L_0x01fe:
            r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x0217
            android.os.IInterface r11 = r10.queryLocalInterface(r1)
            boolean r0 = r11 instanceof defpackage.ojq
            if (r0 == 0) goto L_0x0212
            ojq r11 = (defpackage.ojq) r11
            goto L_0x0217
        L_0x0212:
            ojo r11 = new ojo
            r11.<init>(r10)
        L_0x0217:
            r12.writeNoException()
            goto L_0x02e4
        L_0x021c:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x0232
            android.os.IInterface r11 = r10.queryLocalInterface(r1)
            boolean r0 = r11 instanceof defpackage.ojq
            if (r0 == 0) goto L_0x022d
            ojq r11 = (defpackage.ojq) r11
            goto L_0x0232
        L_0x022d:
            ojo r11 = new ojo
            r11.<init>(r10)
        L_0x0232:
            r12.writeNoException()
            goto L_0x02e4
        L_0x0237:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x024d
            android.os.IInterface r11 = r10.queryLocalInterface(r1)
            boolean r0 = r11 instanceof defpackage.ojq
            if (r0 == 0) goto L_0x0248
            ojq r11 = (defpackage.ojq) r11
            goto L_0x024d
        L_0x0248:
            ojo r11 = new ojo
            r11.<init>(r10)
        L_0x024d:
            r12.writeNoException()
            goto L_0x02e4
        L_0x0252:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x0268
            android.os.IInterface r11 = r10.queryLocalInterface(r1)
            boolean r0 = r11 instanceof defpackage.ojq
            if (r0 == 0) goto L_0x0263
            ojq r11 = (defpackage.ojq) r11
            goto L_0x0268
        L_0x0263:
            ojo r11 = new ojo
            r11.<init>(r10)
        L_0x0268:
            r12.writeNoException()
            goto L_0x02e4
        L_0x026d:
            android.os.Parcelable$Creator r10 = android.graphics.Bitmap.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x028b
            android.os.IInterface r11 = r10.queryLocalInterface(r1)
            boolean r0 = r11 instanceof defpackage.ojq
            if (r0 == 0) goto L_0x0286
            ojq r11 = (defpackage.ojq) r11
            goto L_0x028b
        L_0x0286:
            ojo r11 = new ojo
            r11.<init>(r10)
        L_0x028b:
            r12.writeNoException()
            goto L_0x02e4
        L_0x028f:
            android.os.Parcelable$Creator r10 = com.google.android.gms.googlehelp.GoogleHelp.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.googlehelp.GoogleHelp r10 = (com.google.android.gms.googlehelp.GoogleHelp) r10
            android.os.Parcelable$Creator r2 = android.graphics.Bitmap.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r2)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 == 0) goto L_0x02b6
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ojq
            if (r1 == 0) goto L_0x02b0
            ojq r0 = (defpackage.ojq) r0
            goto L_0x02b7
        L_0x02b0:
            ojo r0 = new ojo
            r0.<init>(r11)
            goto L_0x02b7
        L_0x02b6:
        L_0x02b7:
            r9.e(r10, r0)
            r12.writeNoException()
            goto L_0x02e4
        L_0x02be:
            android.os.Parcelable$Creator r10 = com.google.android.gms.googlehelp.GoogleHelp.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.googlehelp.GoogleHelp r10 = (com.google.android.gms.googlehelp.GoogleHelp) r10
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 == 0) goto L_0x02dd
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ojq
            if (r1 == 0) goto L_0x02d7
            ojq r0 = (defpackage.ojq) r0
            goto L_0x02de
        L_0x02d7:
            ojo r0 = new ojo
            r0.<init>(r11)
            goto L_0x02de
        L_0x02dd:
        L_0x02de:
            r9.a((com.google.android.gms.googlehelp.GoogleHelp) r10, (defpackage.ojq) r0)
            r12.writeNoException()
        L_0x02e4:
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojs.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
