package defpackage;

import android.os.Parcelable;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;

/* renamed from: achy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class achy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ExchangeAssertionsForUserCredentialsRequest[i];
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r13) {
        /*
            r12 = this;
            int r0 = defpackage.ivw.b(r13)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = 0
            r4 = r3
            r6 = r4
            r7 = r6
            r8 = r7
            r9 = r8
            r5 = 0
            r10 = 0
        L_0x0012:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L_0x009a
            int r1 = r13.readInt()
            int r11 = defpackage.ivw.a((int) r1)
            switch(r11) {
                case 2: goto L_0x008a;
                case 3: goto L_0x0078;
                case 4: goto L_0x006b;
                case 5: goto L_0x005e;
                case 6: goto L_0x0051;
                case 7: goto L_0x0044;
                case 8: goto L_0x0036;
                case 9: goto L_0x0028;
                default: goto L_0x0023;
            }
        L_0x0023:
            defpackage.ivw.b(r13, r1)
            goto L_0x0098
        L_0x0028:
            boolean r10 = defpackage.ivw.c(r13, r1)
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0098
        L_0x0036:
            java.lang.String r9 = defpackage.ivw.q(r13, r1)
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0098
        L_0x0044:
            java.lang.String r8 = defpackage.ivw.q(r13, r1)
            r1 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0098
        L_0x0051:
            java.lang.String r7 = defpackage.ivw.q(r13, r1)
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0098
        L_0x005e:
            java.lang.String r6 = defpackage.ivw.q(r13, r1)
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0098
        L_0x006b:
            int r5 = defpackage.ivw.g(r13, r1)
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0098
        L_0x0078:
            android.os.Parcelable$Creator r4 = com.google.android.gms.smartdevice.setup.accounts.DeviceSignals.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r13, (int) r1, (android.os.Parcelable.Creator) r4)
            r4 = r1
            com.google.android.gms.smartdevice.setup.accounts.DeviceSignals r4 = (com.google.android.gms.smartdevice.setup.accounts.DeviceSignals) r4
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0098
        L_0x008a:
            android.os.Parcelable$Creator r3 = com.google.android.gms.smartdevice.setup.accounts.Assertion.CREATOR
            java.util.ArrayList r3 = defpackage.ivw.c(r13, r1, r3)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
        L_0x0098:
            goto L_0x0012
        L_0x009a:
            int r1 = r13.dataPosition()
            if (r1 != r0) goto L_0x00a7
            com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest r13 = new com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r13
        L_0x00a7:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r13)
            goto L_0x00c1
        L_0x00c0:
            throw r1
        L_0x00c1:
            goto L_0x00c0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.achy.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
