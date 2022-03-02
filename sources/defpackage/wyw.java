package defpackage;

import android.os.Parcelable;
import com.google.android.gms.people.identity.internal.models.PersonImpl;

/* renamed from: wyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wyw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonImpl[i];
    }

    /* JADX WARNING: type inference failed for: r2v36, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v43, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v68, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r40) {
        /*
            r39 = this;
            r0 = r40
            int r1 = defpackage.ivw.b(r40)
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
        L_0x0044:
            int r2 = r40.dataPosition()
            if (r2 >= r1) goto L_0x02fe
            int r2 = r40.readInt()
            int r38 = defpackage.ivw.a((int) r2)
            switch(r38) {
                case 2: goto L_0x02ec;
                case 3: goto L_0x02db;
                case 4: goto L_0x02cc;
                case 5: goto L_0x02bb;
                case 6: goto L_0x02aa;
                case 7: goto L_0x0299;
                case 8: goto L_0x0287;
                case 9: goto L_0x0274;
                case 10: goto L_0x0263;
                case 11: goto L_0x0250;
                case 12: goto L_0x023d;
                case 13: goto L_0x022e;
                case 14: goto L_0x0219;
                case 15: goto L_0x0204;
                case 16: goto L_0x01f3;
                case 17: goto L_0x01da;
                case 18: goto L_0x01c5;
                case 19: goto L_0x01b0;
                case 20: goto L_0x0197;
                case 21: goto L_0x0182;
                case 22: goto L_0x016d;
                case 23: goto L_0x0158;
                case 24: goto L_0x0143;
                case 25: goto L_0x012e;
                case 26: goto L_0x0119;
                case 27: goto L_0x0108;
                case 28: goto L_0x00f3;
                case 29: goto L_0x00de;
                case 30: goto L_0x00c9;
                case 31: goto L_0x00b4;
                case 32: goto L_0x009b;
                case 33: goto L_0x0086;
                case 34: goto L_0x0071;
                case 35: goto L_0x005c;
                default: goto L_0x0055;
            }
        L_0x0055:
            r38 = r15
            defpackage.ivw.b(r0, r2)
            goto L_0x02fc
        L_0x005c:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.NotesImpl.CREATOR
            java.util.ArrayList r37 = defpackage.ivw.c(r0, r2, r15)
            r2 = 35
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x0071:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.UrlsImpl.CREATOR
            java.util.ArrayList r36 = defpackage.ivw.c(r0, r2, r15)
            r2 = 34
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x0086:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.TaglinesImpl.CREATOR
            java.util.ArrayList r35 = defpackage.ivw.c(r0, r2, r15)
            r2 = 33
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x009b:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.SortKeysImpl.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r34 = r2
            com.google.android.gms.people.identity.internal.models.PersonImpl$SortKeysImpl r34 = (com.google.android.gms.people.identity.internal.models.PersonImpl.SortKeysImpl) r34
            r2 = 32
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x00b4:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.SkillsImpl.CREATOR
            java.util.ArrayList r33 = defpackage.ivw.c(r0, r2, r15)
            r2 = 31
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x00c9:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.RelationshipStatusesImpl.CREATOR
            java.util.ArrayList r32 = defpackage.ivw.c(r0, r2, r15)
            r2 = 30
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x00de:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.RelationshipInterestsImpl.CREATOR
            java.util.ArrayList r31 = defpackage.ivw.c(r0, r2, r15)
            r2 = 29
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x00f3:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.RelationsImpl.CREATOR
            java.util.ArrayList r30 = defpackage.ivw.c(r0, r2, r15)
            r2 = 28
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x0108:
            r38 = r15
            java.lang.String r29 = defpackage.ivw.q(r0, r2)
            r2 = 27
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x02fc
        L_0x0119:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.PlacesLivedImpl.CREATOR
            java.util.ArrayList r28 = defpackage.ivw.c(r0, r2, r15)
            r2 = 26
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x012e:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.PhoneNumbersImpl.CREATOR
            java.util.ArrayList r27 = defpackage.ivw.c(r0, r2, r15)
            r2 = 25
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x0143:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.OrganizationsImpl.CREATOR
            java.util.ArrayList r26 = defpackage.ivw.c(r0, r2, r15)
            r2 = 24
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x0158:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.OccupationsImpl.CREATOR
            java.util.ArrayList r25 = defpackage.ivw.c(r0, r2, r15)
            r2 = 23
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x016d:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.NicknamesImpl.CREATOR
            java.util.ArrayList r24 = defpackage.ivw.c(r0, r2, r15)
            r2 = 22
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x0182:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.NamesImpl.CREATOR
            java.util.ArrayList r23 = defpackage.ivw.c(r0, r2, r15)
            r2 = 21
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x0197:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.PersonMetadataImpl.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r22 = r2
            com.google.android.gms.people.identity.internal.models.PersonImpl$PersonMetadataImpl r22 = (com.google.android.gms.people.identity.internal.models.PersonImpl.PersonMetadataImpl) r22
            r2 = 20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x01b0:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.MembershipsImpl.CREATOR
            java.util.ArrayList r21 = defpackage.ivw.c(r0, r2, r15)
            r2 = 19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x01c5:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.CREATOR
            java.util.ArrayList r20 = defpackage.ivw.c(r0, r2, r15)
            r2 = 18
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x01da:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.LegacyFieldsImpl.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r15)
            r19 = r2
            com.google.android.gms.people.identity.internal.models.PersonImpl$LegacyFieldsImpl r19 = (com.google.android.gms.people.identity.internal.models.PersonImpl.LegacyFieldsImpl) r19
            r2 = 17
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x01f3:
            r38 = r15
            java.lang.String r18 = defpackage.ivw.q(r0, r2)
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x02fc
        L_0x0204:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.InstantMessagingImpl.CREATOR
            java.util.ArrayList r17 = defpackage.ivw.c(r0, r2, r15)
            r2 = 15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x0219:
            r38 = r15
            android.os.Parcelable$Creator r15 = com.google.android.gms.people.identity.internal.models.PersonImpl.ImagesImpl.CREATOR
            java.util.ArrayList r16 = defpackage.ivw.c(r0, r2, r15)
            r2 = 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r38
            goto L_0x02fc
        L_0x022e:
            java.lang.String r15 = defpackage.ivw.q(r0, r2)
            r2 = 13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x02fc
        L_0x023d:
            r38 = r15
            android.os.Parcelable$Creator r14 = com.google.android.gms.people.identity.internal.models.PersonImpl.GendersImpl.CREATOR
            java.util.ArrayList r14 = defpackage.ivw.c(r0, r2, r14)
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x02fc
        L_0x0250:
            r38 = r15
            android.os.Parcelable$Creator r13 = com.google.android.gms.people.identity.internal.models.PersonImpl.EventsImpl.CREATOR
            java.util.ArrayList r13 = defpackage.ivw.c(r0, r2, r13)
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x02fc
        L_0x0263:
            r38 = r15
            java.lang.String r12 = defpackage.ivw.q(r0, r2)
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x02fc
        L_0x0274:
            r38 = r15
            android.os.Parcelable$Creator r11 = com.google.android.gms.people.identity.internal.models.PersonImpl.EmailsImpl.CREATOR
            java.util.ArrayList r11 = defpackage.ivw.c(r0, r2, r11)
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x02fc
        L_0x0287:
            r38 = r15
            android.os.Parcelable$Creator r10 = com.google.android.gms.people.identity.internal.models.PersonImpl.CustomFieldsImpl.CREATOR
            java.util.ArrayList r10 = defpackage.ivw.c(r0, r2, r10)
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x02fc
        L_0x0299:
            r38 = r15
            android.os.Parcelable$Creator r9 = com.google.android.gms.people.identity.internal.models.PersonImpl.CoverPhotosImpl.CREATOR
            java.util.ArrayList r9 = defpackage.ivw.c(r0, r2, r9)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x02fc
        L_0x02aa:
            r38 = r15
            android.os.Parcelable$Creator r8 = com.google.android.gms.people.identity.internal.models.PersonImpl.BraggingRightsImpl.CREATOR
            java.util.ArrayList r8 = defpackage.ivw.c(r0, r2, r8)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x02fc
        L_0x02bb:
            r38 = r15
            android.os.Parcelable$Creator r7 = com.google.android.gms.people.identity.internal.models.PersonImpl.BirthdaysImpl.CREATOR
            java.util.ArrayList r7 = defpackage.ivw.c(r0, r2, r7)
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x02fc
        L_0x02cc:
            r38 = r15
            java.lang.String r6 = defpackage.ivw.q(r0, r2)
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x02fc
        L_0x02db:
            r38 = r15
            android.os.Parcelable$Creator r5 = com.google.android.gms.people.identity.internal.models.PersonImpl.AddressesImpl.CREATOR
            java.util.ArrayList r5 = defpackage.ivw.c(r0, r2, r5)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x02fc
        L_0x02ec:
            r38 = r15
            android.os.Parcelable$Creator r4 = com.google.android.gms.people.identity.internal.models.PersonImpl.AboutsImpl.CREATOR
            java.util.ArrayList r4 = defpackage.ivw.c(r0, r2, r4)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
        L_0x02fc:
            goto L_0x0044
        L_0x02fe:
            r38 = r15
            int r2 = r40.dataPosition()
            if (r2 != r1) goto L_0x030f
            com.google.android.gms.people.identity.internal.models.PersonImpl r0 = new com.google.android.gms.people.identity.internal.models.PersonImpl
            r2 = r0
            r15 = r38
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return r0
        L_0x030f:
            ivv r2 = new ivv
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "Overread allowed size end="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            goto L_0x0329
        L_0x0328:
            throw r2
        L_0x0329:
            goto L_0x0328
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyw.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
