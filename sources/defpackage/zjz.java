package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;

/* renamed from: zjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zjz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Person.Names[i];
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r19) {
        /*
            r18 = this;
            r0 = r19
            int r1 = defpackage.ivw.b(r19)
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
        L_0x001a:
            int r2 = r19.dataPosition()
            if (r2 >= r1) goto L_0x00ea
            int r2 = r19.readInt()
            int r17 = defpackage.ivw.a((int) r2)
            switch(r17) {
                case 2: goto L_0x00dc;
                case 3: goto L_0x00cf;
                case 4: goto L_0x00c2;
                case 5: goto L_0x00b5;
                case 6: goto L_0x00a8;
                case 7: goto L_0x009b;
                case 8: goto L_0x0088;
                case 9: goto L_0x007a;
                case 10: goto L_0x006c;
                case 11: goto L_0x005d;
                case 12: goto L_0x004e;
                case 13: goto L_0x003f;
                case 14: goto L_0x0030;
                default: goto L_0x002b;
            }
        L_0x002b:
            defpackage.ivw.b(r0, r2)
            goto L_0x00e8
        L_0x0030:
            java.lang.String r16 = defpackage.ivw.q(r0, r2)
            r2 = 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e8
        L_0x003f:
            java.lang.String r15 = defpackage.ivw.q(r0, r2)
            r2 = 13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e8
        L_0x004e:
            java.lang.String r14 = defpackage.ivw.q(r0, r2)
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e8
        L_0x005d:
            java.lang.String r13 = defpackage.ivw.q(r0, r2)
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e8
        L_0x006c:
            java.lang.String r12 = defpackage.ivw.q(r0, r2)
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e8
        L_0x007a:
            java.lang.String r11 = defpackage.ivw.q(r0, r2)
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e8
        L_0x0088:
            android.os.Parcelable$Creator r10 = com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r10)
            r10 = r2
            com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata r10 = (com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata) r10
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e8
        L_0x009b:
            java.lang.String r9 = defpackage.ivw.q(r0, r2)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e8
        L_0x00a8:
            java.lang.String r8 = defpackage.ivw.q(r0, r2)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e8
        L_0x00b5:
            java.lang.String r7 = defpackage.ivw.q(r0, r2)
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e8
        L_0x00c2:
            java.lang.String r6 = defpackage.ivw.q(r0, r2)
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e8
        L_0x00cf:
            java.lang.String r5 = defpackage.ivw.q(r0, r2)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e8
        L_0x00dc:
            java.lang.String r4 = defpackage.ivw.q(r0, r2)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
        L_0x00e8:
            goto L_0x001a
        L_0x00ea:
            int r2 = r19.dataPosition()
            if (r2 != r1) goto L_0x00f7
            com.google.android.gms.plus.service.v2whitelisted.models.Person$Names r0 = new com.google.android.gms.plus.service.v2whitelisted.models.Person$Names
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        L_0x00f7:
            ivv r2 = new ivv
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "Overread allowed size end="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            goto L_0x0111
        L_0x0110:
            throw r2
        L_0x0111:
            goto L_0x0110
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjz.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
