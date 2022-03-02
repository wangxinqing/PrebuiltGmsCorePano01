package defpackage;

import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;

/* renamed from: eto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eto implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountTransferMsg[i];
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = defpackage.ivw.b(r10)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = 0
            r4 = r1
            r6 = r4
            r5 = 0
        L_0x000e:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L_0x0063
            int r1 = r10.readInt()
            int r7 = defpackage.ivw.a((int) r1)
            r8 = 1
            if (r7 == r8) goto L_0x0057
            r8 = 2
            if (r7 == r8) goto L_0x0049
            r8 = 3
            if (r7 == r8) goto L_0x003d
            r8 = 4
            if (r7 == r8) goto L_0x002c
            defpackage.ivw.b(r10, r1)
            goto L_0x0062
        L_0x002c:
            android.os.Parcelable$Creator r6 = com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r10, (int) r1, (android.os.Parcelable.Creator) r6)
            r6 = r1
            com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress r6 = (com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress) r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
            goto L_0x0062
        L_0x003d:
            int r5 = defpackage.ivw.g(r10, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
            goto L_0x0062
        L_0x0049:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData.CREATOR
            java.util.ArrayList r4 = defpackage.ivw.c(r10, r1, r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
            goto L_0x0062
        L_0x0057:
            int r3 = defpackage.ivw.g(r10, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
        L_0x0062:
            goto L_0x000e
        L_0x0063:
            int r1 = r10.dataPosition()
            if (r1 != r0) goto L_0x0070
            com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg r10 = new com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r10
        L_0x0070:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r10)
            goto L_0x008a
        L_0x0089:
            throw r1
        L_0x008a:
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eto.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
