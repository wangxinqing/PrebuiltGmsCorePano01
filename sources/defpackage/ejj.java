package defpackage;

import android.os.Parcelable;
import com.google.android.gms.auth.account.accounttransfer.AccountBootstrapPayload;

/* renamed from: ejj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ejj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountBootstrapPayload[i];
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [android.os.Parcelable] */
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
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x0010:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0083
            int r1 = r11.readInt()
            int r9 = defpackage.ivw.a((int) r1)
            switch(r9) {
                case 1: goto L_0x0076;
                case 2: goto L_0x0067;
                case 3: goto L_0x0058;
                case 4: goto L_0x0046;
                case 5: goto L_0x0037;
                case 6: goto L_0x0025;
                default: goto L_0x0021;
            }
        L_0x0021:
            defpackage.ivw.b(r11, r1)
            goto L_0x0082
        L_0x0025:
            android.os.Parcelable$Creator r8 = com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r11, (int) r1, (android.os.Parcelable.Creator) r8)
            r8 = r1
            com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest r8 = (com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest) r8
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0082
        L_0x0037:
            android.os.Parcelable$Creator r7 = com.google.android.gms.smartdevice.setup.accounts.UserCredential.CREATOR
            java.util.ArrayList r7 = defpackage.ivw.c(r11, r1, r7)
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0082
        L_0x0046:
            android.os.Parcelable$Creator r6 = com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r11, (int) r1, (android.os.Parcelable.Creator) r6)
            r6 = r1
            com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest r6 = (com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest) r6
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0082
        L_0x0058:
            android.os.Parcelable$Creator r5 = com.google.android.gms.smartdevice.setup.accounts.Challenge.CREATOR
            java.util.ArrayList r5 = defpackage.ivw.c(r11, r1, r5)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0082
        L_0x0067:
            android.os.Parcelable$Creator r4 = com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo.CREATOR
            java.util.ArrayList r4 = defpackage.ivw.c(r11, r1, r4)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0082
        L_0x0076:
            int r3 = defpackage.ivw.g(r11, r1)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
        L_0x0082:
            goto L_0x0010
        L_0x0083:
            int r1 = r11.dataPosition()
            if (r1 != r0) goto L_0x0090
            com.google.android.gms.auth.account.accounttransfer.AccountBootstrapPayload r11 = new com.google.android.gms.auth.account.accounttransfer.AccountBootstrapPayload
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r11
        L_0x0090:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r11)
            goto L_0x00aa
        L_0x00a9:
            throw r1
        L_0x00aa:
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejj.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
