package defpackage;

import android.os.Parcelable;
import com.google.android.gms.people.identity.internal.models.PersonImpl;

/* renamed from: wyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wyx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonImpl.PersonMetadataImpl[i];
    }

    /* JADX WARNING: type inference failed for: r2v26, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r20) {
        /*
            r19 = this;
            r0 = r20
            int r1 = defpackage.ivw.b(r20)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2 = 0
            r4 = 0
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
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x001c:
            int r2 = r20.dataPosition()
            if (r2 >= r1) goto L_0x00fb
            int r2 = r20.readInt()
            int r18 = defpackage.ivw.a((int) r2)
            switch(r18) {
                case 2: goto L_0x00ed;
                case 3: goto L_0x00e0;
                case 4: goto L_0x00d3;
                case 5: goto L_0x00c6;
                case 6: goto L_0x00b9;
                case 7: goto L_0x00ac;
                case 8: goto L_0x009e;
                case 9: goto L_0x0090;
                case 10: goto L_0x0082;
                case 11: goto L_0x0073;
                case 12: goto L_0x005f;
                case 13: goto L_0x0050;
                case 14: goto L_0x0041;
                case 15: goto L_0x0032;
                default: goto L_0x002d;
            }
        L_0x002d:
            defpackage.ivw.b(r0, r2)
            goto L_0x00f9
        L_0x0032:
            boolean r17 = defpackage.ivw.c(r0, r2)
            r2 = 15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00f9
        L_0x0041:
            boolean r16 = defpackage.ivw.c(r0, r2)
            r2 = 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00f9
        L_0x0050:
            boolean r15 = defpackage.ivw.c(r0, r2)
            r2 = 13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00f9
        L_0x005f:
            android.os.Parcelable$Creator r14 = com.google.android.gms.people.identity.internal.models.PersonImpl.ProfileOwnerStatsImpl.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r14)
            r14 = r2
            com.google.android.gms.people.identity.internal.models.PersonImpl$ProfileOwnerStatsImpl r14 = (com.google.android.gms.people.identity.internal.models.PersonImpl.ProfileOwnerStatsImpl) r14
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00f9
        L_0x0073:
            java.lang.String r13 = defpackage.ivw.q(r0, r2)
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00f9
        L_0x0082:
            java.util.ArrayList r12 = defpackage.ivw.C(r0, r2)
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00f9
        L_0x0090:
            java.lang.String r11 = defpackage.ivw.q(r0, r2)
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00f9
        L_0x009e:
            java.lang.String r10 = defpackage.ivw.q(r0, r2)
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00f9
        L_0x00ac:
            java.util.ArrayList r9 = defpackage.ivw.C(r0, r2)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00f9
        L_0x00b9:
            java.util.ArrayList r8 = defpackage.ivw.C(r0, r2)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00f9
        L_0x00c6:
            java.util.ArrayList r7 = defpackage.ivw.C(r0, r2)
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00f9
        L_0x00d3:
            java.util.ArrayList r6 = defpackage.ivw.C(r0, r2)
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00f9
        L_0x00e0:
            java.util.ArrayList r5 = defpackage.ivw.C(r0, r2)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00f9
        L_0x00ed:
            java.util.ArrayList r4 = defpackage.ivw.C(r0, r2)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
        L_0x00f9:
            goto L_0x001c
        L_0x00fb:
            int r2 = r20.dataPosition()
            if (r2 != r1) goto L_0x0108
            com.google.android.gms.people.identity.internal.models.PersonImpl$PersonMetadataImpl r0 = new com.google.android.gms.people.identity.internal.models.PersonImpl$PersonMetadataImpl
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        L_0x0108:
            ivv r2 = new ivv
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "Overread allowed size end="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            goto L_0x0122
        L_0x0121:
            throw r2
        L_0x0122:
            goto L_0x0121
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyx.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
