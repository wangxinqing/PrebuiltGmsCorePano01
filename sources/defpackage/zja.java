package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;

/* renamed from: zja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zja implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Person.Addresses[i];
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r15) {
        /*
            r14 = this;
            int r0 = defpackage.ivw.b(r15)
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
            r10 = r9
            r11 = r10
            r12 = r11
        L_0x0014:
            int r1 = r15.dataPosition()
            if (r1 >= r0) goto L_0x00ba
            int r1 = r15.readInt()
            int r13 = defpackage.ivw.a((int) r1)
            switch(r13) {
                case 2: goto L_0x00ac;
                case 3: goto L_0x009f;
                case 4: goto L_0x0025;
                case 5: goto L_0x0092;
                case 6: goto L_0x0025;
                case 7: goto L_0x0080;
                case 8: goto L_0x0072;
                case 9: goto L_0x0064;
                case 10: goto L_0x0056;
                case 11: goto L_0x0048;
                case 12: goto L_0x0039;
                case 13: goto L_0x002a;
                default: goto L_0x0025;
            }
        L_0x0025:
            defpackage.ivw.b(r15, r1)
            goto L_0x00b8
        L_0x002a:
            java.lang.String r12 = defpackage.ivw.q(r15, r1)
            r1 = 13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00b8
        L_0x0039:
            java.lang.String r11 = defpackage.ivw.q(r15, r1)
            r1 = 12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00b8
        L_0x0048:
            java.lang.String r10 = defpackage.ivw.q(r15, r1)
            r1 = 11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00b8
        L_0x0056:
            java.lang.String r9 = defpackage.ivw.q(r15, r1)
            r1 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00b8
        L_0x0064:
            java.lang.String r8 = defpackage.ivw.q(r15, r1)
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00b8
        L_0x0072:
            java.lang.String r7 = defpackage.ivw.q(r15, r1)
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00b8
        L_0x0080:
            android.os.Parcelable$Creator r6 = com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r15, (int) r1, (android.os.Parcelable.Creator) r6)
            r6 = r1
            com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata r6 = (com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata) r6
            r1 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00b8
        L_0x0092:
            java.lang.String r5 = defpackage.ivw.q(r15, r1)
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00b8
        L_0x009f:
            java.lang.String r4 = defpackage.ivw.q(r15, r1)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00b8
        L_0x00ac:
            java.lang.String r3 = defpackage.ivw.q(r15, r1)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
        L_0x00b8:
            goto L_0x0014
        L_0x00ba:
            int r1 = r15.dataPosition()
            if (r1 != r0) goto L_0x00c7
            com.google.android.gms.plus.service.v2whitelisted.models.Person$Addresses r15 = new com.google.android.gms.plus.service.v2whitelisted.models.Person$Addresses
            r1 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r15
        L_0x00c7:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r15)
            goto L_0x00e1
        L_0x00e0:
            throw r1
        L_0x00e1:
            goto L_0x00e0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zja.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
