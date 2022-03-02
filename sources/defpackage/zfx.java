package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;

/* renamed from: zfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zfx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ClientActionDataEntity[i];
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v12, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r12) {
        /*
            r11 = this;
            int r0 = defpackage.ivw.b(r12)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = 0
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x0010:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L_0x008d
            int r1 = r12.readInt()
            int r9 = defpackage.ivw.a((int) r1)
            r10 = 1
            if (r9 == r10) goto L_0x0081
            r10 = 2
            if (r9 == r10) goto L_0x0070
            r10 = 7
            if (r9 == r10) goto L_0x0062
            r10 = 8
            if (r9 == r10) goto L_0x0054
            r10 = 13
            if (r9 == r10) goto L_0x0048
            r10 = 20
            if (r9 == r10) goto L_0x0037
            defpackage.ivw.b(r12, r1)
            goto L_0x008c
        L_0x0037:
            android.os.Parcelable$Creator r8 = com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedRhsComponentEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r12, (int) r1, (android.os.Parcelable.Creator) r8)
            r8 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedRhsComponentEntity r8 = (com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedRhsComponentEntity) r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x008c
        L_0x0048:
            java.util.ArrayList r7 = defpackage.ivw.C(r12, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x008c
        L_0x0054:
            android.os.Parcelable$Creator r6 = com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedCircleMemberEntity.CREATOR
            java.util.ArrayList r6 = defpackage.ivw.c(r12, r1, r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x008c
        L_0x0062:
            android.os.Parcelable$Creator r5 = com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedCircleEntity.CREATOR
            java.util.ArrayList r5 = defpackage.ivw.c(r12, r1, r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x008c
        L_0x0070:
            android.os.Parcelable$Creator r4 = com.google.android.gms.plus.service.v1whitelisted.models.ClientAclDetailsEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r12, (int) r1, (android.os.Parcelable.Creator) r4)
            r4 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.ClientAclDetailsEntity r4 = (com.google.android.gms.plus.service.v1whitelisted.models.ClientAclDetailsEntity) r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x008c
        L_0x0081:
            int r3 = defpackage.ivw.g(r12, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
        L_0x008c:
            goto L_0x0010
        L_0x008d:
            int r1 = r12.dataPosition()
            if (r1 != r0) goto L_0x009a
            com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity r12 = new com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r12
        L_0x009a:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r12)
            goto L_0x00b4
        L_0x00b3:
            throw r1
        L_0x00b4:
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfx.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
