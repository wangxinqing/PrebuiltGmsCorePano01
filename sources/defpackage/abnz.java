package defpackage;

import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;

/* renamed from: abnz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abnz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BootstrapConfigurations[i];
    }

    /* JADX WARNING: type inference failed for: r2v28, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r23) {
        /*
            r22 = this;
            r0 = r23
            int r1 = defpackage.ivw.b(r23)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r4 = 0
            r2 = 0
            r6 = 0
            r13 = r4
            r15 = r13
            r4 = r6
            r5 = r4
            r8 = r5
            r9 = r8
            r17 = r9
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r18 = 0
            r19 = 0
        L_0x001f:
            int r2 = r23.dataPosition()
            if (r2 >= r1) goto L_0x011d
            int r2 = r23.readInt()
            int r20 = defpackage.ivw.a((int) r2)
            switch(r20) {
                case 2: goto L_0x010d;
                case 3: goto L_0x00fe;
                case 4: goto L_0x00ef;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00cf;
                case 7: goto L_0x00c0;
                case 8: goto L_0x00b0;
                case 9: goto L_0x009f;
                case 10: goto L_0x008e;
                case 11: goto L_0x007d;
                case 12: goto L_0x006e;
                case 13: goto L_0x0055;
                case 14: goto L_0x0046;
                case 15: goto L_0x0037;
                default: goto L_0x0030;
            }
        L_0x0030:
            r20 = r15
            defpackage.ivw.b(r0, r2)
            goto L_0x011b
        L_0x0037:
            boolean r19 = defpackage.ivw.c(r0, r2)
            r2 = 15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x011b
        L_0x0046:
            boolean r18 = defpackage.ivw.c(r0, r2)
            r2 = 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x011b
        L_0x0055:
            r20 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.smartdevice.d2d.DeviceDetails.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r17 = r2
            com.google.android.gms.smartdevice.d2d.DeviceDetails r17 = (com.google.android.gms.smartdevice.d2d.DeviceDetails) r17
            r2 = 13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r20
            goto L_0x011b
        L_0x006e:
            long r15 = defpackage.ivw.i(r0, r2)
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x011b
        L_0x007d:
            r20 = r15
            long r13 = defpackage.ivw.i(r0, r2)
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x011b
        L_0x008e:
            r20 = r15
            int r12 = defpackage.ivw.g(r0, r2)
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x011b
        L_0x009f:
            r20 = r15
            boolean r11 = defpackage.ivw.c(r0, r2)
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x011b
        L_0x00b0:
            r20 = r15
            boolean r10 = defpackage.ivw.c(r0, r2)
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x011b
        L_0x00c0:
            r20 = r15
            android.os.Bundle r9 = defpackage.ivw.s(r0, r2)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x011b
        L_0x00cf:
            r20 = r15
            android.os.Parcelable$Creator r8 = com.google.android.gms.smartdevice.d2d.BootstrapAccount.CREATOR
            java.util.ArrayList r8 = defpackage.ivw.c(r0, r2, r8)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x011b
        L_0x00e0:
            r20 = r15
            boolean r7 = defpackage.ivw.c(r0, r2)
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x011b
        L_0x00ef:
            r20 = r15
            java.lang.String r6 = defpackage.ivw.q(r0, r2)
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x011b
        L_0x00fe:
            r20 = r15
            java.lang.String r5 = defpackage.ivw.q(r0, r2)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x011b
        L_0x010d:
            r20 = r15
            java.lang.String r4 = defpackage.ivw.q(r0, r2)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
        L_0x011b:
            goto L_0x001f
        L_0x011d:
            r20 = r15
            int r2 = r23.dataPosition()
            if (r2 != r1) goto L_0x012e
            com.google.android.gms.smartdevice.d2d.BootstrapConfigurations r0 = new com.google.android.gms.smartdevice.d2d.BootstrapConfigurations
            r2 = r0
            r15 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r18, r19)
            return r0
        L_0x012e:
            ivv r2 = new ivv
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "Overread allowed size end="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            goto L_0x0148
        L_0x0147:
            throw r2
        L_0x0148:
            goto L_0x0147
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abnz.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
