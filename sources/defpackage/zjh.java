package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;

/* renamed from: zjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zjh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Person.Emails[i];
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [android.os.Parcelable] */
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
            if (r1 >= r0) goto L_0x0073
            int r1 = r11.readInt()
            int r8 = defpackage.ivw.a((int) r1)
            r9 = 2
            if (r8 == r9) goto L_0x0065
            r9 = 4
            if (r8 == r9) goto L_0x0059
            r9 = 5
            if (r8 == r9) goto L_0x0048
            r9 = 6
            if (r8 == r9) goto L_0x003c
            r9 = 7
            if (r8 == r9) goto L_0x0030
            defpackage.ivw.b(r11, r1)
            goto L_0x0072
        L_0x0030:
            java.lang.String r7 = defpackage.ivw.q(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0072
        L_0x003c:
            java.lang.String r6 = defpackage.ivw.q(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0072
        L_0x0048:
            android.os.Parcelable$Creator r5 = com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r11, (int) r1, (android.os.Parcelable.Creator) r5)
            r5 = r1
            com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata r5 = (com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata) r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0072
        L_0x0059:
            java.lang.String r4 = defpackage.ivw.q(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0072
        L_0x0065:
            android.os.Parcelable$Creator r3 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Emails.Certificates.CREATOR
            java.util.ArrayList r3 = defpackage.ivw.c(r11, r1, r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
        L_0x0072:
            goto L_0x000f
        L_0x0073:
            int r1 = r11.dataPosition()
            if (r1 != r0) goto L_0x0080
            com.google.android.gms.plus.service.v2whitelisted.models.Person$Emails r11 = new com.google.android.gms.plus.service.v2whitelisted.models.Person$Emails
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjh.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
