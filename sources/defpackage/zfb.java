package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;

/* renamed from: zfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zfb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivityEntity[i];
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v11, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r17) {
        /*
            r16 = this;
            r0 = r17
            int r1 = defpackage.ivw.b(r17)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2 = 0
            r4 = 0
            r5 = r2
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
        L_0x0016:
            int r2 = r17.dataPosition()
            if (r2 >= r1) goto L_0x00cf
            int r2 = r17.readInt()
            int r14 = defpackage.ivw.a((int) r2)
            r15 = 1
            if (r14 == r15) goto L_0x00c2
            r15 = 2
            if (r14 == r15) goto L_0x00b1
            r15 = 5
            if (r14 == r15) goto L_0x00a5
            r15 = 10
            if (r14 == r15) goto L_0x0099
            r15 = 15
            if (r14 == r15) goto L_0x0088
            r15 = 17
            if (r14 == r15) goto L_0x007c
            r15 = 19
            if (r14 == r15) goto L_0x0070
            switch(r14) {
                case 23: goto L_0x0062;
                case 24: goto L_0x0054;
                case 25: goto L_0x0045;
                default: goto L_0x0040;
            }
        L_0x0040:
            defpackage.ivw.b(r0, r2)
            goto L_0x00cd
        L_0x0045:
            java.lang.String r13 = defpackage.ivw.q(r0, r2)
            r2 = 25
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00cd
        L_0x0054:
            java.lang.String r12 = defpackage.ivw.q(r0, r2)
            r2 = 24
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00cd
        L_0x0062:
            java.lang.String r11 = defpackage.ivw.q(r0, r2)
            r2 = 23
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00cd
        L_0x0070:
            java.lang.String r10 = defpackage.ivw.q(r0, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r3.add(r2)
            goto L_0x00cd
        L_0x007c:
            java.lang.String r9 = defpackage.ivw.q(r0, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r3.add(r2)
            goto L_0x00cd
        L_0x0088:
            android.os.Parcelable$Creator r8 = com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity.ObjectEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r8)
            r8 = r2
            com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity$ObjectEntity r8 = (com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity.ObjectEntity) r8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r3.add(r2)
            goto L_0x00cd
        L_0x0099:
            java.lang.String r7 = defpackage.ivw.q(r0, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r3.add(r2)
            goto L_0x00cd
        L_0x00a5:
            java.lang.String r6 = defpackage.ivw.q(r0, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r3.add(r2)
            goto L_0x00cd
        L_0x00b1:
            android.os.Parcelable$Creator r5 = com.google.android.gms.plus.service.v1whitelisted.models.AclEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r5)
            r5 = r2
            com.google.android.gms.plus.service.v1whitelisted.models.AclEntity r5 = (com.google.android.gms.plus.service.v1whitelisted.models.AclEntity) r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r3.add(r2)
            goto L_0x00cd
        L_0x00c2:
            int r4 = defpackage.ivw.g(r0, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r3.add(r2)
        L_0x00cd:
            goto L_0x0016
        L_0x00cf:
            int r2 = r17.dataPosition()
            if (r2 != r1) goto L_0x00dc
            com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity r0 = new com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x00dc:
            ivv r2 = new ivv
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "Overread allowed size end="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            goto L_0x00f6
        L_0x00f5:
            throw r2
        L_0x00f6:
            goto L_0x00f5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfb.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
