package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;

/* renamed from: zjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zjv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Person.Metadata[i];
    }

    /* JADX WARNING: type inference failed for: r2v24, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v41, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r25) {
        /*
            r24 = this;
            r0 = r25
            int r1 = defpackage.ivw.b(r25)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2 = 0
            r4 = 0
            r5 = 0
            r8 = r4
            r9 = r8
            r10 = r9
            r12 = r10
            r13 = r12
            r15 = r13
            r18 = r15
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r16 = r5
            r7 = 0
            r11 = 0
            r14 = 0
            r5 = r22
            r6 = r5
        L_0x0027:
            int r2 = r25.dataPosition()
            if (r2 >= r1) goto L_0x0172
            int r2 = r25.readInt()
            int r23 = defpackage.ivw.a((int) r2)
            switch(r23) {
                case 2: goto L_0x0160;
                case 3: goto L_0x0151;
                case 4: goto L_0x0142;
                case 5: goto L_0x0133;
                case 6: goto L_0x0124;
                case 7: goto L_0x0115;
                case 8: goto L_0x0105;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00e3;
                case 11: goto L_0x00cd;
                case 12: goto L_0x00bc;
                case 13: goto L_0x00ad;
                case 14: goto L_0x009c;
                case 15: goto L_0x008b;
                case 16: goto L_0x007a;
                case 17: goto L_0x0069;
                case 18: goto L_0x0058;
                case 19: goto L_0x003f;
                default: goto L_0x0038;
            }
        L_0x0038:
            r23 = r15
            defpackage.ivw.b(r0, r2)
            goto L_0x0170
        L_0x003f:
            r23 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Metadata.ProfileOwnerStats.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r22 = r2
            com.google.android.gms.plus.service.v2whitelisted.models.Person$Metadata$ProfileOwnerStats r22 = (com.google.android.gms.plus.service.v2whitelisted.models.Person.Metadata.ProfileOwnerStats) r22
            r2 = 19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r23
            goto L_0x0170
        L_0x0058:
            r23 = r15
            java.lang.String r21 = defpackage.ivw.q(r0, r2)
            r2 = 18
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0170
        L_0x0069:
            r23 = r15
            java.util.ArrayList r20 = defpackage.ivw.C(r0, r2)
            r2 = 17
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0170
        L_0x007a:
            r23 = r15
            java.lang.String r19 = defpackage.ivw.q(r0, r2)
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0170
        L_0x008b:
            r23 = r15
            java.lang.String r18 = defpackage.ivw.q(r0, r2)
            r2 = 15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0170
        L_0x009c:
            r23 = r15
            long r16 = defpackage.ivw.i(r0, r2)
            r2 = 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0170
        L_0x00ad:
            java.util.ArrayList r15 = defpackage.ivw.C(r0, r2)
            r2 = 13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0170
        L_0x00bc:
            r23 = r15
            boolean r14 = defpackage.ivw.c(r0, r2)
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0170
        L_0x00cd:
            r23 = r15
            android.os.Parcelable$Creator r13 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Metadata.IdentityInfo.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r13)
            r13 = r2
            com.google.android.gms.plus.service.v2whitelisted.models.Person$Metadata$IdentityInfo r13 = (com.google.android.gms.plus.service.v2whitelisted.models.Person.Metadata.IdentityInfo) r13
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0170
        L_0x00e3:
            r23 = r15
            java.util.ArrayList r12 = defpackage.ivw.C(r0, r2)
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0170
        L_0x00f4:
            r23 = r15
            boolean r11 = defpackage.ivw.c(r0, r2)
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0170
        L_0x0105:
            r23 = r15
            java.lang.String r10 = defpackage.ivw.q(r0, r2)
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0170
        L_0x0115:
            r23 = r15
            java.util.ArrayList r9 = defpackage.ivw.C(r0, r2)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0170
        L_0x0124:
            r23 = r15
            java.util.ArrayList r8 = defpackage.ivw.C(r0, r2)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0170
        L_0x0133:
            r23 = r15
            boolean r7 = defpackage.ivw.c(r0, r2)
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0170
        L_0x0142:
            r23 = r15
            java.util.ArrayList r6 = defpackage.ivw.C(r0, r2)
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0170
        L_0x0151:
            r23 = r15
            java.util.ArrayList r5 = defpackage.ivw.C(r0, r2)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0170
        L_0x0160:
            r23 = r15
            android.os.Parcelable$Creator r4 = com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeopleaffinities.CREATOR
            java.util.ArrayList r4 = defpackage.ivw.c(r0, r2, r4)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
        L_0x0170:
            goto L_0x0027
        L_0x0172:
            r23 = r15
            int r2 = r25.dataPosition()
            if (r2 != r1) goto L_0x0183
            com.google.android.gms.plus.service.v2whitelisted.models.Person$Metadata r0 = new com.google.android.gms.plus.service.v2whitelisted.models.Person$Metadata
            r2 = r0
            r15 = r23
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22)
            return r0
        L_0x0183:
            ivv r2 = new ivv
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "Overread allowed size end="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            goto L_0x019d
        L_0x019c:
            throw r2
        L_0x019d:
            goto L_0x019c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjv.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
