package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.Application;

/* renamed from: zfn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zfn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Application[i];
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [android.os.Parcelable] */
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
        L_0x000f:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0073
            int r1 = r11.readInt()
            int r8 = defpackage.ivw.a((int) r1)
            r9 = 1
            if (r8 == r9) goto L_0x0067
            r9 = 2
            if (r8 == r9) goto L_0x0059
            r9 = 3
            if (r8 == r9) goto L_0x004d
            r9 = 5
            if (r8 == r9) goto L_0x003c
            r9 = 6
            if (r8 == r9) goto L_0x0030
            defpackage.ivw.b(r11, r1)
            goto L_0x0072
        L_0x0030:
            java.lang.String r7 = defpackage.ivw.q(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0072
        L_0x003c:
            android.os.Parcelable$Creator r6 = com.google.android.gms.plus.service.v1whitelisted.models.Application.Icon.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r11, (int) r1, (android.os.Parcelable.Creator) r6)
            r6 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.Application$Icon r6 = (com.google.android.gms.plus.service.v1whitelisted.models.Application.Icon) r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0072
        L_0x004d:
            java.lang.String r5 = defpackage.ivw.q(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0072
        L_0x0059:
            android.os.Parcelable$Creator r4 = com.google.android.gms.plus.service.v1whitelisted.models.PlusAppClient.CREATOR
            java.util.ArrayList r4 = defpackage.ivw.c(r11, r1, r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0072
        L_0x0067:
            int r3 = defpackage.ivw.g(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
        L_0x0072:
            goto L_0x000f
        L_0x0073:
            int r1 = r11.dataPosition()
            if (r1 != r0) goto L_0x0080
            com.google.android.gms.plus.service.v1whitelisted.models.Application r11 = new com.google.android.gms.plus.service.v1whitelisted.models.Application
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r11
        L_0x0080:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r11)
            goto L_0x009a
        L_0x0099:
            throw r1
        L_0x009a:
            goto L_0x0099
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfn.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
