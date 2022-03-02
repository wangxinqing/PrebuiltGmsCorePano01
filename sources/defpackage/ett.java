package defpackage;

import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;

/* renamed from: ett  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ett implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AuthenticatorTransferInfo[i];
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v17, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = defpackage.ivw.b(r11)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = 0
            r4 = r3
            r6 = r4
            r7 = r6
            r8 = r7
            r3 = 0
            r5 = 0
        L_0x0011:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x007e
            int r1 = r11.readInt()
            int r9 = defpackage.ivw.a((int) r1)
            switch(r9) {
                case 1: goto L_0x0071;
                case 2: goto L_0x0064;
                case 3: goto L_0x0057;
                case 4: goto L_0x004a;
                case 5: goto L_0x0038;
                case 6: goto L_0x0026;
                default: goto L_0x0022;
            }
        L_0x0022:
            defpackage.ivw.b(r11, r1)
            goto L_0x007d
        L_0x0026:
            android.os.Parcelable$Creator r8 = com.google.android.gms.auth.api.accounttransfer.DeviceMetaData.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r11, (int) r1, (android.os.Parcelable.Creator) r8)
            r8 = r1
            com.google.android.gms.auth.api.accounttransfer.DeviceMetaData r8 = (com.google.android.gms.auth.api.accounttransfer.DeviceMetaData) r8
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x007d
        L_0x0038:
            android.os.Parcelable$Creator r7 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r11, (int) r1, (android.os.Parcelable.Creator) r7)
            r7 = r1
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x007d
        L_0x004a:
            byte[] r6 = defpackage.ivw.t(r11, r1)
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x007d
        L_0x0057:
            int r5 = defpackage.ivw.g(r11, r1)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x007d
        L_0x0064:
            java.lang.String r4 = defpackage.ivw.q(r11, r1)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x007d
        L_0x0071:
            int r3 = defpackage.ivw.g(r11, r1)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
        L_0x007d:
            goto L_0x0011
        L_0x007e:
            int r1 = r11.dataPosition()
            if (r1 != r0) goto L_0x008b
            com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo r11 = new com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r11
        L_0x008b:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r11)
            goto L_0x00a5
        L_0x00a4:
            throw r1
        L_0x00a5:
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ett.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
