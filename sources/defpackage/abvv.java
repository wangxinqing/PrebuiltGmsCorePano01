package defpackage;

import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;

/* renamed from: abvv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abvv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountBootstrapPayload[i];
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v11, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = defpackage.ivw.b(r11)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x000f:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x007c
            int r1 = r11.readInt()
            int r8 = defpackage.ivw.a((int) r1)
            r9 = 2
            if (r8 == r9) goto L_0x006e
            r9 = 3
            if (r8 == r9) goto L_0x0060
            r9 = 4
            if (r8 == r9) goto L_0x004f
            r9 = 5
            if (r8 == r9) goto L_0x0041
            r9 = 6
            if (r8 == r9) goto L_0x0030
            defpackage.ivw.b(r11, r1)
            goto L_0x007b
        L_0x0030:
            android.os.Parcelable$Creator r7 = com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r11, (int) r1, (android.os.Parcelable.Creator) r7)
            r7 = r1
            com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest r7 = (com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest) r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x007b
        L_0x0041:
            android.os.Parcelable$Creator r6 = com.google.android.gms.smartdevice.setup.accounts.UserCredential.CREATOR
            java.util.ArrayList r6 = defpackage.ivw.c(r11, r1, r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x007b
        L_0x004f:
            android.os.Parcelable$Creator r5 = com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r11, (int) r1, (android.os.Parcelable.Creator) r5)
            r5 = r1
            com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest r5 = (com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest) r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x007b
        L_0x0060:
            android.os.Parcelable$Creator r4 = com.google.android.gms.smartdevice.setup.accounts.Challenge.CREATOR
            java.util.ArrayList r4 = defpackage.ivw.c(r11, r1, r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x007b
        L_0x006e:
            android.os.Parcelable$Creator r3 = com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo.CREATOR
            java.util.ArrayList r3 = defpackage.ivw.c(r11, r1, r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
        L_0x007b:
            goto L_0x000f
        L_0x007c:
            int r1 = r11.dataPosition()
            if (r1 != r0) goto L_0x0089
            com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload r11 = new com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r11
        L_0x0089:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r11)
            goto L_0x00a3
        L_0x00a2:
            throw r1
        L_0x00a3:
            goto L_0x00a2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abvv.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
