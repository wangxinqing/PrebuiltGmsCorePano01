package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentEntity;

/* renamed from: zhh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zhh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MomentEntity[i];
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v11, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r14) {
        /*
            r13 = this;
            int r0 = defpackage.ivw.b(r14)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = 0
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x0012:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x00a1
            int r1 = r14.readInt()
            int r11 = defpackage.ivw.a((int) r1)
            r12 = 10
            if (r11 == r12) goto L_0x0094
            r12 = 11
            if (r11 == r12) goto L_0x0083
            switch(r11) {
                case 1: goto L_0x0076;
                case 2: goto L_0x0064;
                case 3: goto L_0x0057;
                case 4: goto L_0x004a;
                case 5: goto L_0x003d;
                case 6: goto L_0x0030;
                default: goto L_0x002b;
            }
        L_0x002b:
            defpackage.ivw.b(r14, r1)
            goto L_0x009f
        L_0x0030:
            java.lang.String r8 = defpackage.ivw.q(r14, r1)
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x009f
        L_0x003d:
            java.lang.String r7 = defpackage.ivw.q(r14, r1)
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x009f
        L_0x004a:
            java.lang.String r6 = defpackage.ivw.q(r14, r1)
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x009f
        L_0x0057:
            java.lang.String r5 = defpackage.ivw.q(r14, r1)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x009f
        L_0x0064:
            android.os.Parcelable$Creator r4 = com.google.android.gms.plus.service.v1whitelisted.models.AclEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r14, (int) r1, (android.os.Parcelable.Creator) r4)
            r4 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.AclEntity r4 = (com.google.android.gms.plus.service.v1whitelisted.models.AclEntity) r4
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x009f
        L_0x0076:
            int r3 = defpackage.ivw.g(r14, r1)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x009f
        L_0x0083:
            android.os.Parcelable$Creator r10 = com.google.android.gms.plus.service.v1whitelisted.models.ItemScope.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r14, (int) r1, (android.os.Parcelable.Creator) r10)
            r10 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.ItemScope r10 = (com.google.android.gms.plus.service.v1whitelisted.models.ItemScope) r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r2.add(r1)
            goto L_0x009f
        L_0x0094:
            java.lang.String r9 = defpackage.ivw.q(r14, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r2.add(r1)
        L_0x009f:
            goto L_0x0012
        L_0x00a1:
            int r1 = r14.dataPosition()
            if (r1 != r0) goto L_0x00ae
            com.google.android.gms.plus.service.v1whitelisted.models.MomentEntity r14 = new com.google.android.gms.plus.service.v1whitelisted.models.MomentEntity
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r14
        L_0x00ae:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r14)
            goto L_0x00c8
        L_0x00c7:
            throw r1
        L_0x00c8:
            goto L_0x00c7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zhh.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
