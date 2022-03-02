package defpackage;

import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

/* renamed from: aboe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aboe implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BootstrapOptions[i];
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v45, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v50, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v53, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r35) {
        /*
            r34 = this;
            r0 = r35
            int r1 = defpackage.ivw.b(r35)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r4 = 0
            r2 = 0
            r6 = 0
            r7 = r2
            r9 = r7
            r10 = r9
            r26 = r10
            r27 = r26
            r28 = r27
            r29 = r28
            r14 = r4
            r21 = r14
            r24 = r21
            r4 = 0
            r5 = 0
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r30 = 0
            r31 = 0
        L_0x0035:
            int r2 = r35.dataPosition()
            if (r2 >= r1) goto L_0x0201
            int r2 = r35.readInt()
            int r32 = defpackage.ivw.a((int) r2)
            switch(r32) {
                case 2: goto L_0x01f1;
                case 3: goto L_0x01e2;
                case 4: goto L_0x01d3;
                case 5: goto L_0x01c4;
                case 6: goto L_0x01b5;
                case 7: goto L_0x01a6;
                case 8: goto L_0x0191;
                case 9: goto L_0x0180;
                case 10: goto L_0x016f;
                case 11: goto L_0x015e;
                case 12: goto L_0x014f;
                case 13: goto L_0x013e;
                case 14: goto L_0x012d;
                case 15: goto L_0x011c;
                case 16: goto L_0x010b;
                case 17: goto L_0x00fa;
                case 18: goto L_0x00e9;
                case 19: goto L_0x00d8;
                case 20: goto L_0x00c7;
                case 21: goto L_0x00ae;
                case 22: goto L_0x009d;
                case 23: goto L_0x0084;
                case 24: goto L_0x006b;
                case 25: goto L_0x005c;
                case 26: goto L_0x004d;
                default: goto L_0x0046;
            }
        L_0x0046:
            r32 = r14
            defpackage.ivw.b(r0, r2)
            goto L_0x01ff
        L_0x004d:
            boolean r31 = defpackage.ivw.c(r0, r2)
            r2 = 26
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x005c:
            int r30 = defpackage.ivw.g(r0, r2)
            r2 = 25
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x006b:
            r32 = r14
            android.os.Parcelable$Creator r14 = com.google.android.gms.smartdevice.d2d.AdvertisementOptions.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r14)
            r29 = r2
            com.google.android.gms.smartdevice.d2d.AdvertisementOptions r29 = (com.google.android.gms.smartdevice.d2d.AdvertisementOptions) r29
            r2 = 24
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r14 = r32
            goto L_0x01ff
        L_0x0084:
            r32 = r14
            android.os.Parcelable$Creator r14 = com.google.android.gms.smartdevice.d2d.EsimActivationInfo.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r14)
            r28 = r2
            com.google.android.gms.smartdevice.d2d.EsimActivationInfo r28 = (com.google.android.gms.smartdevice.d2d.EsimActivationInfo) r28
            r2 = 23
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r14 = r32
            goto L_0x01ff
        L_0x009d:
            r32 = r14
            byte[] r27 = defpackage.ivw.t(r0, r2)
            r2 = 22
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x00ae:
            r32 = r14
            android.os.Parcelable$Creator r14 = com.google.android.gms.smartdevice.d2d.PostTransferAction.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r14)
            r26 = r2
            com.google.android.gms.smartdevice.d2d.PostTransferAction r26 = (com.google.android.gms.smartdevice.d2d.PostTransferAction) r26
            r2 = 21
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r14 = r32
            goto L_0x01ff
        L_0x00c7:
            r32 = r14
            long r24 = defpackage.ivw.i(r0, r2)
            r2 = 20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x00d8:
            r32 = r14
            int r23 = defpackage.ivw.g(r0, r2)
            r2 = 19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x00e9:
            r32 = r14
            long r21 = defpackage.ivw.i(r0, r2)
            r2 = 18
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x00fa:
            r32 = r14
            int r20 = defpackage.ivw.g(r0, r2)
            r2 = 17
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x010b:
            r32 = r14
            boolean r19 = defpackage.ivw.c(r0, r2)
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x011c:
            r32 = r14
            boolean r18 = defpackage.ivw.c(r0, r2)
            r2 = 15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x012d:
            r32 = r14
            boolean r17 = defpackage.ivw.c(r0, r2)
            r2 = 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x013e:
            r32 = r14
            boolean r16 = defpackage.ivw.c(r0, r2)
            r2 = 13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x014f:
            long r14 = defpackage.ivw.i(r0, r2)
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x015e:
            r32 = r14
            int r13 = defpackage.ivw.g(r0, r2)
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x016f:
            r32 = r14
            int r12 = defpackage.ivw.g(r0, r2)
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x0180:
            r32 = r14
            boolean r11 = defpackage.ivw.c(r0, r2)
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x0191:
            r32 = r14
            android.os.Parcelable$Creator r10 = com.google.android.gms.smartdevice.d2d.CompanionApp.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r10)
            r10 = r2
            com.google.android.gms.smartdevice.d2d.CompanionApp r10 = (com.google.android.gms.smartdevice.d2d.CompanionApp) r10
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x01a6:
            r32 = r14
            java.lang.String r9 = defpackage.ivw.q(r0, r2)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x01b5:
            r32 = r14
            byte r8 = defpackage.ivw.e(r0, r2)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x01c4:
            r32 = r14
            java.util.ArrayList r7 = defpackage.ivw.C(r0, r2)
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x01d3:
            r32 = r14
            boolean r6 = defpackage.ivw.c(r0, r2)
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x01e2:
            r32 = r14
            int r5 = defpackage.ivw.g(r0, r2)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x01ff
        L_0x01f1:
            r32 = r14
            int r4 = defpackage.ivw.g(r0, r2)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
        L_0x01ff:
            goto L_0x0035
        L_0x0201:
            r32 = r14
            int r2 = r35.dataPosition()
            if (r2 != r1) goto L_0x0212
            com.google.android.gms.smartdevice.d2d.BootstrapOptions r0 = new com.google.android.gms.smartdevice.d2d.BootstrapOptions
            r2 = r0
            r14 = r32
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r23, r24, r26, r27, r28, r29, r30, r31)
            return r0
        L_0x0212:
            ivv r2 = new ivv
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "Overread allowed size end="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            goto L_0x022c
        L_0x022b:
            throw r2
        L_0x022c:
            goto L_0x022b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aboe.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
