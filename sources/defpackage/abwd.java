package defpackage;

import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;

/* renamed from: abwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abwd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MessagePayload[i];
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v13, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v16, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v19, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v24, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v31, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v34, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v37, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r20) {
        /*
            r19 = this;
            r0 = r20
            int r1 = defpackage.ivw.b(r20)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2 = 0
            r4 = 0
            r7 = r4
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r4 = 0
            r5 = 0
            r6 = 0
            r12 = 0
        L_0x001d:
            int r2 = r20.dataPosition()
            if (r2 >= r1) goto L_0x0146
            int r2 = r20.readInt()
            int r18 = defpackage.ivw.a((int) r2)
            switch(r18) {
                case 1: goto L_0x0136;
                case 2: goto L_0x0127;
                case 3: goto L_0x0113;
                case 4: goto L_0x00ff;
                case 5: goto L_0x00eb;
                case 6: goto L_0x00d7;
                case 7: goto L_0x00c7;
                case 8: goto L_0x00b1;
                case 9: goto L_0x00a0;
                case 10: goto L_0x008d;
                case 11: goto L_0x0077;
                case 12: goto L_0x0063;
                case 13: goto L_0x004a;
                case 14: goto L_0x0035;
                default: goto L_0x002e;
            }
        L_0x002e:
            r18 = r15
            defpackage.ivw.b(r0, r2)
            goto L_0x0144
        L_0x0035:
            r18 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.smartdevice.d2d.EsimActivationPayload.CREATOR
            java.util.ArrayList r17 = defpackage.ivw.c(r0, r2, r15)
            r2 = 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r18
            goto L_0x0144
        L_0x004a:
            r18 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r16 = r2
            com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload r16 = (com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload) r16
            r2 = 13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r18
            goto L_0x0144
        L_0x0063:
            android.os.Parcelable$Creator r15 = com.google.android.gms.smartdevice.d2d.data.DeviceStatus.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r15 = r2
            com.google.android.gms.smartdevice.d2d.data.DeviceStatus r15 = (com.google.android.gms.smartdevice.d2d.data.DeviceStatus) r15
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0144
        L_0x0077:
            r18 = r15
            android.os.Parcelable$Creator r14 = com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r14)
            r14 = r2
            com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload r14 = (com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload) r14
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0144
        L_0x008d:
            r18 = r15
            android.os.Parcelable$Creator r13 = com.google.android.gms.smartdevice.d2d.AccountTransferResult.CREATOR
            java.util.ArrayList r13 = defpackage.ivw.c(r0, r2, r13)
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0144
        L_0x00a0:
            r18 = r15
            boolean r12 = defpackage.ivw.c(r0, r2)
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0144
        L_0x00b1:
            r18 = r15
            android.os.Parcelable$Creator r11 = com.google.android.gms.smartdevice.d2d.data.ProgressEvent.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r11)
            r11 = r2
            com.google.android.gms.smartdevice.d2d.data.ProgressEvent r11 = (com.google.android.gms.smartdevice.d2d.data.ProgressEvent) r11
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0144
        L_0x00c7:
            r18 = r15
            int r5 = defpackage.ivw.g(r0, r2)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0144
        L_0x00d7:
            r18 = r15
            android.os.Parcelable$Creator r10 = com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r10)
            r10 = r2
            com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload r10 = (com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload) r10
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0144
        L_0x00eb:
            r18 = r15
            android.os.Parcelable$Creator r9 = com.google.android.gms.smartdevice.d2d.data.DisplayText.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r9)
            r9 = r2
            com.google.android.gms.smartdevice.d2d.data.DisplayText r9 = (com.google.android.gms.smartdevice.d2d.data.DisplayText) r9
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0144
        L_0x00ff:
            r18 = r15
            android.os.Parcelable$Creator r8 = com.google.android.gms.smartdevice.d2d.BootstrapConfigurations.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r8)
            r8 = r2
            com.google.android.gms.smartdevice.d2d.BootstrapConfigurations r8 = (com.google.android.gms.smartdevice.d2d.BootstrapConfigurations) r8
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0144
        L_0x0113:
            r18 = r15
            android.os.Parcelable$Creator r7 = com.google.android.gms.smartdevice.d2d.BootstrapOptions.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r7)
            r7 = r2
            com.google.android.gms.smartdevice.d2d.BootstrapOptions r7 = (com.google.android.gms.smartdevice.d2d.BootstrapOptions) r7
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0144
        L_0x0127:
            r18 = r15
            int r6 = defpackage.ivw.g(r0, r2)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0144
        L_0x0136:
            r18 = r15
            int r4 = defpackage.ivw.g(r0, r2)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
        L_0x0144:
            goto L_0x001d
        L_0x0146:
            r18 = r15
            int r2 = r20.dataPosition()
            if (r2 != r1) goto L_0x0157
            com.google.android.gms.smartdevice.d2d.data.MessagePayload r0 = new com.google.android.gms.smartdevice.d2d.data.MessagePayload
            r2 = r0
            r15 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        L_0x0157:
            ivv r2 = new ivv
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "Overread allowed size end="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            goto L_0x0171
        L_0x0170:
            throw r2
        L_0x0171:
            goto L_0x0170
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abwd.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
