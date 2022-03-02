package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;

/* renamed from: ziy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ziy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Person[i];
    }

    /* JADX WARNING: type inference failed for: r2v28, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v47, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v52, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v77, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r43) {
        /*
            r42 = this;
            r0 = r43
            int r1 = defpackage.ivw.b(r43)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
            r28 = r27
            r29 = r28
            r30 = r29
            r31 = r30
            r32 = r31
            r33 = r32
            r34 = r33
            r35 = r34
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r40 = r39
        L_0x004a:
            int r2 = r43.dataPosition()
            if (r2 >= r1) goto L_0x0347
            int r2 = r43.readInt()
            int r41 = defpackage.ivw.a((int) r2)
            switch(r41) {
                case 2: goto L_0x0335;
                case 3: goto L_0x0324;
                case 4: goto L_0x005b;
                case 5: goto L_0x0313;
                case 6: goto L_0x0302;
                case 7: goto L_0x02f1;
                case 8: goto L_0x02df;
                case 9: goto L_0x02cd;
                case 10: goto L_0x02ba;
                case 11: goto L_0x02a7;
                case 12: goto L_0x0296;
                case 13: goto L_0x0283;
                case 14: goto L_0x026f;
                case 15: goto L_0x025a;
                case 16: goto L_0x005b;
                case 17: goto L_0x0245;
                case 18: goto L_0x0234;
                case 19: goto L_0x021f;
                case 20: goto L_0x005b;
                case 21: goto L_0x020a;
                case 22: goto L_0x01f5;
                case 23: goto L_0x005b;
                case 24: goto L_0x01e4;
                case 25: goto L_0x01cf;
                case 26: goto L_0x01b6;
                case 27: goto L_0x005b;
                case 28: goto L_0x01a1;
                case 29: goto L_0x0188;
                case 30: goto L_0x0173;
                case 31: goto L_0x015e;
                case 32: goto L_0x0149;
                case 33: goto L_0x0134;
                case 34: goto L_0x011f;
                case 35: goto L_0x005b;
                case 36: goto L_0x010a;
                case 37: goto L_0x005b;
                case 38: goto L_0x00f5;
                case 39: goto L_0x00e4;
                case 40: goto L_0x00cf;
                case 41: goto L_0x005b;
                case 42: goto L_0x005b;
                case 43: goto L_0x00ba;
                case 44: goto L_0x00a5;
                case 45: goto L_0x008c;
                case 46: goto L_0x0077;
                case 47: goto L_0x0062;
                default: goto L_0x005b;
            }
        L_0x005b:
            r41 = r15
            defpackage.ivw.b(r0, r2)
            goto L_0x0345
        L_0x0062:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Urls.CREATOR
            java.util.ArrayList r40 = defpackage.ivw.c(r0, r2, r15)
            r2 = 47
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x0077:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Taglines.CREATOR
            java.util.ArrayList r39 = defpackage.ivw.c(r0, r2, r15)
            r2 = 46
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x008c:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.SortKeys.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r38 = r2
            com.google.android.gms.plus.service.v2whitelisted.models.Person$SortKeys r38 = (com.google.android.gms.plus.service.v2whitelisted.models.Person.SortKeys) r38
            r2 = 45
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x00a5:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Skills.CREATOR
            java.util.ArrayList r37 = defpackage.ivw.c(r0, r2, r15)
            r2 = 44
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x00ba:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.SipAddress.CREATOR
            java.util.ArrayList r36 = defpackage.ivw.c(r0, r2, r15)
            r2 = 43
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x00cf:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Relations.CREATOR
            java.util.ArrayList r35 = defpackage.ivw.c(r0, r2, r15)
            r2 = 40
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x00e4:
            r41 = r15
            java.lang.String r34 = defpackage.ivw.q(r0, r2)
            r2 = 39
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0345
        L_0x00f5:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.PlacesLived.CREATOR
            java.util.ArrayList r33 = defpackage.ivw.c(r0, r2, r15)
            r2 = 38
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x010a:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.PhoneNumbers.CREATOR
            java.util.ArrayList r32 = defpackage.ivw.c(r0, r2, r15)
            r2 = 36
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x011f:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.OtherKeywords.CREATOR
            java.util.ArrayList r31 = defpackage.ivw.c(r0, r2, r15)
            r2 = 34
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x0134:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Organizations.CREATOR
            java.util.ArrayList r30 = defpackage.ivw.c(r0, r2, r15)
            r2 = 33
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x0149:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Occupations.CREATOR
            java.util.ArrayList r29 = defpackage.ivw.c(r0, r2, r15)
            r2 = 32
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x015e:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Nicknames.CREATOR
            java.util.ArrayList r28 = defpackage.ivw.c(r0, r2, r15)
            r2 = 31
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x0173:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Names.CREATOR
            java.util.ArrayList r27 = defpackage.ivw.c(r0, r2, r15)
            r2 = 30
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x0188:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Metadata.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r26 = r2
            com.google.android.gms.plus.service.v2whitelisted.models.Person$Metadata r26 = (com.google.android.gms.plus.service.v2whitelisted.models.Person.Metadata) r26
            r2 = 29
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x01a1:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Memberships.CREATOR
            java.util.ArrayList r25 = defpackage.ivw.c(r0, r2, r15)
            r2 = 28
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x01b6:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.LegacyFields.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r24 = r2
            com.google.android.gms.plus.service.v2whitelisted.models.Person$LegacyFields r24 = (com.google.android.gms.plus.service.v2whitelisted.models.Person.LegacyFields) r24
            r2 = 26
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x01cf:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Languages.CREATOR
            java.util.ArrayList r23 = defpackage.ivw.c(r0, r2, r15)
            r2 = 25
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x01e4:
            r41 = r15
            java.lang.String r22 = defpackage.ivw.q(r0, r2)
            r2 = 24
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0345
        L_0x01f5:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Interests.CREATOR
            java.util.ArrayList r21 = defpackage.ivw.c(r0, r2, r15)
            r2 = 22
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x020a:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.InstantMessaging.CREATOR
            java.util.ArrayList r20 = defpackage.ivw.c(r0, r2, r15)
            r2 = 21
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x021f:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Images.CREATOR
            java.util.ArrayList r19 = defpackage.ivw.c(r0, r2, r15)
            r2 = 19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x0234:
            r41 = r15
            java.lang.String r18 = defpackage.ivw.q(r0, r2)
            r2 = 18
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0345
        L_0x0245:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Genders.CREATOR
            java.util.ArrayList r17 = defpackage.ivw.c(r0, r2, r15)
            r2 = 17
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x025a:
            r41 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.ExternalIds.CREATOR
            java.util.ArrayList r16 = defpackage.ivw.c(r0, r2, r15)
            r2 = 15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r41
            goto L_0x0345
        L_0x026f:
            android.os.Parcelable$Creator r15 = com.google.android.gms.plus.service.v2whitelisted.models.Person.ExtendedData.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r15 = r2
            com.google.android.gms.plus.service.v2whitelisted.models.Person$ExtendedData r15 = (com.google.android.gms.plus.service.v2whitelisted.models.Person.ExtendedData) r15
            r2 = 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0345
        L_0x0283:
            r41 = r15
            android.os.Parcelable$Creator r14 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Events.CREATOR
            java.util.ArrayList r14 = defpackage.ivw.c(r0, r2, r14)
            r2 = 13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0345
        L_0x0296:
            r41 = r15
            java.lang.String r13 = defpackage.ivw.q(r0, r2)
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0345
        L_0x02a7:
            r41 = r15
            android.os.Parcelable$Creator r12 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Emails.CREATOR
            java.util.ArrayList r12 = defpackage.ivw.c(r0, r2, r12)
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0345
        L_0x02ba:
            r41 = r15
            android.os.Parcelable$Creator r11 = com.google.android.gms.plus.service.v2whitelisted.models.Person.CustomFields.CREATOR
            java.util.ArrayList r11 = defpackage.ivw.c(r0, r2, r11)
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0345
        L_0x02cd:
            r41 = r15
            android.os.Parcelable$Creator r10 = com.google.android.gms.plus.service.v2whitelisted.models.Person.CoverPhotos.CREATOR
            java.util.ArrayList r10 = defpackage.ivw.c(r0, r2, r10)
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0345
        L_0x02df:
            r41 = r15
            android.os.Parcelable$Creator r9 = com.google.android.gms.plus.service.v2whitelisted.models.Person.ClientData.CREATOR
            java.util.ArrayList r9 = defpackage.ivw.c(r0, r2, r9)
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0345
        L_0x02f1:
            r41 = r15
            android.os.Parcelable$Creator r8 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Calendars.CREATOR
            java.util.ArrayList r8 = defpackage.ivw.c(r0, r2, r8)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0345
        L_0x0302:
            r41 = r15
            android.os.Parcelable$Creator r7 = com.google.android.gms.plus.service.v2whitelisted.models.Person.BraggingRights.CREATOR
            java.util.ArrayList r7 = defpackage.ivw.c(r0, r2, r7)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0345
        L_0x0313:
            r41 = r15
            android.os.Parcelable$Creator r6 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Birthdays.CREATOR
            java.util.ArrayList r6 = defpackage.ivw.c(r0, r2, r6)
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0345
        L_0x0324:
            r41 = r15
            android.os.Parcelable$Creator r5 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Addresses.CREATOR
            java.util.ArrayList r5 = defpackage.ivw.c(r0, r2, r5)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0345
        L_0x0335:
            r41 = r15
            android.os.Parcelable$Creator r4 = com.google.android.gms.plus.service.v2whitelisted.models.Person.Abouts.CREATOR
            java.util.ArrayList r4 = defpackage.ivw.c(r0, r2, r4)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
        L_0x0345:
            goto L_0x004a
        L_0x0347:
            r41 = r15
            int r2 = r43.dataPosition()
            if (r2 != r1) goto L_0x0358
            com.google.android.gms.plus.service.v2whitelisted.models.Person r0 = new com.google.android.gms.plus.service.v2whitelisted.models.Person
            r2 = r0
            r15 = r41
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return r0
        L_0x0358:
            ivv r2 = new ivv
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "Overread allowed size end="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            goto L_0x0372
        L_0x0371:
            throw r2
        L_0x0372:
            goto L_0x0371
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ziy.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
