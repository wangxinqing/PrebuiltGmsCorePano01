package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.internal.model.people.PersonEntity;

/* renamed from: ywv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ywv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonEntity[i];
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v19, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v30, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v37, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r31) {
        /*
            r30 = this;
            r0 = r31
            int r1 = defpackage.ivw.b(r31)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2 = 0
            r4 = 0
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r10 = r8
            r11 = r10
            r12 = r11
            r14 = r12
            r15 = r14
            r17 = r15
            r18 = r17
            r19 = r18
            r21 = r19
            r22 = r21
            r25 = r22
            r26 = r25
            r27 = r26
            r4 = 0
            r9 = 0
            r13 = 0
            r16 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r28 = 0
        L_0x0033:
            int r2 = r31.dataPosition()
            if (r2 >= r1) goto L_0x0206
            int r2 = r31.readInt()
            int r29 = defpackage.ivw.a((int) r2)
            switch(r29) {
                case 1: goto L_0x01f6;
                case 2: goto L_0x01e7;
                case 3: goto L_0x01d3;
                case 4: goto L_0x01c4;
                case 5: goto L_0x01b5;
                case 6: goto L_0x01a6;
                case 7: goto L_0x0192;
                case 8: goto L_0x0181;
                case 9: goto L_0x0170;
                case 10: goto L_0x0044;
                case 11: goto L_0x0044;
                case 12: goto L_0x015f;
                case 13: goto L_0x0044;
                case 14: goto L_0x014e;
                case 15: goto L_0x013a;
                case 16: goto L_0x0129;
                case 17: goto L_0x0044;
                case 18: goto L_0x0118;
                case 19: goto L_0x00ff;
                case 20: goto L_0x00ee;
                case 21: goto L_0x00dd;
                case 22: goto L_0x00c8;
                case 23: goto L_0x00b3;
                case 24: goto L_0x00a2;
                case 25: goto L_0x0091;
                case 26: goto L_0x0080;
                case 27: goto L_0x006f;
                case 28: goto L_0x005a;
                case 29: goto L_0x004b;
                default: goto L_0x0044;
            }
        L_0x0044:
            r29 = r15
            defpackage.ivw.b(r0, r2)
            goto L_0x0204
        L_0x004b:
            boolean r28 = defpackage.ivw.c(r0, r2)
            r2 = 29
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x005a:
            r29 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.internal.model.people.PersonEntity.UrlsEntity.CREATOR
            java.util.ArrayList r27 = defpackage.ivw.c(r0, r2, r15)
            r2 = 28
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r29
            goto L_0x0204
        L_0x006f:
            r29 = r15
            java.lang.String r26 = defpackage.ivw.q(r0, r2)
            r2 = 27
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x0080:
            r29 = r15
            java.lang.String r25 = defpackage.ivw.q(r0, r2)
            r2 = 26
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x0091:
            r29 = r15
            int r24 = defpackage.ivw.g(r0, r2)
            r2 = 25
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x00a2:
            r29 = r15
            int r23 = defpackage.ivw.g(r0, r2)
            r2 = 24
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x00b3:
            r29 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.internal.model.people.PersonEntity.PlacesLivedEntity.CREATOR
            java.util.ArrayList r22 = defpackage.ivw.c(r0, r2, r15)
            r2 = 23
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r29
            goto L_0x0204
        L_0x00c8:
            r29 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.internal.model.people.PersonEntity.OrganizationsEntity.CREATOR
            java.util.ArrayList r21 = defpackage.ivw.c(r0, r2, r15)
            r2 = 22
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r29
            goto L_0x0204
        L_0x00dd:
            r29 = r15
            int r20 = defpackage.ivw.g(r0, r2)
            r2 = 21
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x00ee:
            r29 = r15
            java.lang.String r19 = defpackage.ivw.q(r0, r2)
            r2 = 20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x00ff:
            r29 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.internal.model.people.PersonEntity.NameEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r18 = r2
            com.google.android.gms.plus.internal.model.people.PersonEntity$NameEntity r18 = (com.google.android.gms.plus.internal.model.people.PersonEntity.NameEntity) r18
            r2 = 19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r29
            goto L_0x0204
        L_0x0118:
            r29 = r15
            java.lang.String r17 = defpackage.ivw.q(r0, r2)
            r2 = 18
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x0129:
            r29 = r15
            boolean r16 = defpackage.ivw.c(r0, r2)
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x013a:
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.internal.model.people.PersonEntity.ImageEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r15 = r2
            com.google.android.gms.plus.internal.model.people.PersonEntity$ImageEntity r15 = (com.google.android.gms.plus.internal.model.people.PersonEntity.ImageEntity) r15
            r2 = 15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x014e:
            r29 = r15
            java.lang.String r14 = defpackage.ivw.q(r0, r2)
            r2 = 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x015f:
            r29 = r15
            int r13 = defpackage.ivw.g(r0, r2)
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x0170:
            r29 = r15
            java.lang.String r12 = defpackage.ivw.q(r0, r2)
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x0181:
            r29 = r15
            java.lang.String r11 = defpackage.ivw.q(r0, r2)
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x0192:
            r29 = r15
            android.os.Parcelable$Creator r10 = com.google.android.gms.plus.internal.model.people.PersonEntity.CoverEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r10)
            r10 = r2
            com.google.android.gms.plus.internal.model.people.PersonEntity$CoverEntity r10 = (com.google.android.gms.plus.internal.model.people.PersonEntity.CoverEntity) r10
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x01a6:
            r29 = r15
            int r9 = defpackage.ivw.g(r0, r2)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x01b5:
            r29 = r15
            java.lang.String r8 = defpackage.ivw.q(r0, r2)
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x01c4:
            r29 = r15
            java.lang.String r7 = defpackage.ivw.q(r0, r2)
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x01d3:
            r29 = r15
            android.os.Parcelable$Creator r6 = com.google.android.gms.plus.internal.model.people.PersonEntity.AgeRangeEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r6)
            r6 = r2
            com.google.android.gms.plus.internal.model.people.PersonEntity$AgeRangeEntity r6 = (com.google.android.gms.plus.internal.model.people.PersonEntity.AgeRangeEntity) r6
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x01e7:
            r29 = r15
            java.lang.String r5 = defpackage.ivw.q(r0, r2)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0204
        L_0x01f6:
            r29 = r15
            int r4 = defpackage.ivw.g(r0, r2)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
        L_0x0204:
            goto L_0x0033
        L_0x0206:
            r29 = r15
            int r2 = r31.dataPosition()
            if (r2 != r1) goto L_0x0217
            com.google.android.gms.plus.internal.model.people.PersonEntity r0 = new com.google.android.gms.plus.internal.model.people.PersonEntity
            r2 = r0
            r15 = r29
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r0
        L_0x0217:
            ivv r2 = new ivv
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "Overread allowed size end="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            goto L_0x0231
        L_0x0230:
            throw r2
        L_0x0231:
            goto L_0x0230
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywv.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
