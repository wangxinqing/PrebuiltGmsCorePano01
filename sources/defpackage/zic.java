package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.SettingEntity;

/* renamed from: zic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zic implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SettingEntity[i];
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [android.os.Parcelable] */
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
            r6 = r4
            r8 = r6
            r5 = 0
            r7 = 0
        L_0x0010:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L_0x0082
            int r1 = r12.readInt()
            int r9 = defpackage.ivw.a((int) r1)
            r10 = 1
            if (r9 == r10) goto L_0x0076
            r10 = 2
            if (r9 == r10) goto L_0x0065
            r10 = 3
            if (r9 == r10) goto L_0x0059
            r10 = 5
            if (r9 == r10) goto L_0x004d
            r10 = 6
            if (r9 == r10) goto L_0x0041
            r10 = 9
            if (r9 == r10) goto L_0x0035
            defpackage.ivw.b(r12, r1)
            goto L_0x0081
        L_0x0035:
            java.lang.String r8 = defpackage.ivw.q(r12, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x0081
        L_0x0041:
            int r7 = defpackage.ivw.g(r12, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x0081
        L_0x004d:
            java.lang.String r6 = defpackage.ivw.q(r12, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x0081
        L_0x0059:
            boolean r5 = defpackage.ivw.c(r12, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x0081
        L_0x0065:
            android.os.Parcelable$Creator r4 = com.google.android.gms.plus.service.v1whitelisted.models.AclEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r12, (int) r1, (android.os.Parcelable.Creator) r4)
            r4 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.AclEntity r4 = (com.google.android.gms.plus.service.v1whitelisted.models.AclEntity) r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x0081
        L_0x0076:
            int r3 = defpackage.ivw.g(r12, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
        L_0x0081:
            goto L_0x0010
        L_0x0082:
            int r1 = r12.dataPosition()
            if (r1 != r0) goto L_0x008f
            com.google.android.gms.plus.service.v1whitelisted.models.SettingEntity r12 = new com.google.android.gms.plus.service.v1whitelisted.models.SettingEntity
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r12
        L_0x008f:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r12)
            goto L_0x00a9
        L_0x00a8:
            throw r1
        L_0x00a9:
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zic.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
