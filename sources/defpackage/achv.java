package defpackage;

import android.os.Parcelable;
import com.google.android.gms.smartdevice.setup.accounts.DeviceRiskSignals;

/* renamed from: achv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class achv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceRiskSignals[i];
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v21, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r17) {
        /*
            r16 = this;
            r0 = r17
            int r1 = defpackage.ivw.b(r17)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r4 = 0
            r2 = 0
            r6 = 0
            r7 = r2
            r8 = r7
            r13 = r8
            r14 = r13
            r9 = r4
            r11 = r9
            r5 = r11
            r4 = 0
        L_0x0017:
            int r2 = r17.dataPosition()
            if (r2 >= r1) goto L_0x00a2
            int r2 = r17.readInt()
            int r15 = defpackage.ivw.a((int) r2)
            switch(r15) {
                case 2: goto L_0x0094;
                case 3: goto L_0x0087;
                case 4: goto L_0x007a;
                case 5: goto L_0x006d;
                case 6: goto L_0x0060;
                case 7: goto L_0x0053;
                case 8: goto L_0x0040;
                case 9: goto L_0x002d;
                default: goto L_0x0028;
            }
        L_0x0028:
            defpackage.ivw.b(r0, r2)
            goto L_0x00a0
        L_0x002d:
            android.os.Parcelable$Creator r14 = com.google.android.gms.smartdevice.setup.accounts.StarguardData.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r14)
            r14 = r2
            com.google.android.gms.smartdevice.setup.accounts.StarguardData r14 = (com.google.android.gms.smartdevice.setup.accounts.StarguardData) r14
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00a0
        L_0x0040:
            android.os.Parcelable$Creator r13 = com.google.android.gms.smartdevice.setup.accounts.ScreenlockState.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r13)
            r13 = r2
            com.google.android.gms.smartdevice.setup.accounts.ScreenlockState r13 = (com.google.android.gms.smartdevice.setup.accounts.ScreenlockState) r13
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00a0
        L_0x0053:
            long r11 = defpackage.ivw.i(r0, r2)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00a0
        L_0x0060:
            long r9 = defpackage.ivw.i(r0, r2)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00a0
        L_0x006d:
            java.lang.String r8 = defpackage.ivw.q(r0, r2)
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00a0
        L_0x007a:
            java.lang.String r7 = defpackage.ivw.q(r0, r2)
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00a0
        L_0x0087:
            long r5 = defpackage.ivw.i(r0, r2)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00a0
        L_0x0094:
            int r4 = defpackage.ivw.g(r0, r2)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
        L_0x00a0:
            goto L_0x0017
        L_0x00a2:
            int r2 = r17.dataPosition()
            if (r2 != r1) goto L_0x00af
            com.google.android.gms.smartdevice.setup.accounts.DeviceRiskSignals r0 = new com.google.android.gms.smartdevice.setup.accounts.DeviceRiskSignals
            r2 = r0
            r2.<init>(r3, r4, r5, r7, r8, r9, r11, r13, r14)
            return r0
        L_0x00af:
            ivv r2 = new ivv
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "Overread allowed size end="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            goto L_0x00c9
        L_0x00c8:
            throw r2
        L_0x00c9:
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.achv.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
