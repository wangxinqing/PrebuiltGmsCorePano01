package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;

/* renamed from: zke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zke implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Person.PhoneNumbers[i];
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
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x000f:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0072
            int r1 = r11.readInt()
            int r8 = defpackage.ivw.a((int) r1)
            r9 = 2
            if (r8 == r9) goto L_0x0066
            r9 = 8
            if (r8 == r9) goto L_0x005a
            r9 = 4
            if (r8 == r9) goto L_0x004e
            r9 = 5
            if (r8 == r9) goto L_0x003d
            r9 = 6
            if (r8 == r9) goto L_0x0031
            defpackage.ivw.b(r11, r1)
            goto L_0x0071
        L_0x0031:
            java.lang.String r6 = defpackage.ivw.q(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0071
        L_0x003d:
            android.os.Parcelable$Creator r5 = com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r11, (int) r1, (android.os.Parcelable.Creator) r5)
            r5 = r1
            com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata r5 = (com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata) r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0071
        L_0x004e:
            java.lang.String r4 = defpackage.ivw.q(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0071
        L_0x005a:
            java.lang.String r7 = defpackage.ivw.q(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0071
        L_0x0066:
            java.lang.String r3 = defpackage.ivw.q(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
        L_0x0071:
            goto L_0x000f
        L_0x0072:
            int r1 = r11.dataPosition()
            if (r1 != r0) goto L_0x007f
            com.google.android.gms.plus.service.v2whitelisted.models.Person$PhoneNumbers r11 = new com.google.android.gms.plus.service.v2whitelisted.models.Person$PhoneNumbers
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r11
        L_0x007f:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r11)
            goto L_0x0099
        L_0x0098:
            throw r1
        L_0x0099:
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zke.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
