package defpackage;

import android.os.Parcelable;
import com.google.android.gms.smartdevice.setup.accounts.DeviceSignals;

/* renamed from: achw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class achw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceSignals[i];
    }

    /* JADX WARNING: type inference failed for: r1v18, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r12) {
        /*
            r11 = this;
            int r0 = defpackage.ivw.b(r12)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0011:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L_0x0087
            int r1 = r12.readInt()
            int r10 = defpackage.ivw.a((int) r1)
            switch(r10) {
                case 2: goto L_0x007a;
                case 3: goto L_0x006d;
                case 4: goto L_0x0060;
                case 5: goto L_0x0053;
                case 6: goto L_0x0046;
                case 7: goto L_0x0039;
                case 8: goto L_0x0026;
                default: goto L_0x0022;
            }
        L_0x0022:
            defpackage.ivw.b(r12, r1)
            goto L_0x0086
        L_0x0026:
            android.os.Parcelable$Creator r9 = com.google.android.gms.smartdevice.setup.accounts.UserPresence.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r12, (int) r1, (android.os.Parcelable.Creator) r9)
            r9 = r1
            com.google.android.gms.smartdevice.setup.accounts.UserPresence r9 = (com.google.android.gms.smartdevice.setup.accounts.UserPresence) r9
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0086
        L_0x0039:
            java.lang.String r8 = defpackage.ivw.q(r12, r1)
            r1 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0086
        L_0x0046:
            java.lang.String r7 = defpackage.ivw.q(r12, r1)
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0086
        L_0x0053:
            java.lang.String r6 = defpackage.ivw.q(r12, r1)
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0086
        L_0x0060:
            java.lang.String r5 = defpackage.ivw.q(r12, r1)
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0086
        L_0x006d:
            java.lang.String r4 = defpackage.ivw.q(r12, r1)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0086
        L_0x007a:
            java.lang.String r3 = defpackage.ivw.q(r12, r1)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
        L_0x0086:
            goto L_0x0011
        L_0x0087:
            int r1 = r12.dataPosition()
            if (r1 != r0) goto L_0x0094
            com.google.android.gms.smartdevice.setup.accounts.DeviceSignals r12 = new com.google.android.gms.smartdevice.setup.accounts.DeviceSignals
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r12
        L_0x0094:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r12)
            goto L_0x00ae
        L_0x00ad:
            throw r1
        L_0x00ae:
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.achw.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
