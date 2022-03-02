package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity;

/* renamed from: zeq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zeq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActionTargetEntity[i];
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v13, types: [android.os.Parcelable] */
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
            r4 = r3
            r5 = r4
            r7 = r5
            r8 = r7
            r9 = r8
            r10 = r9
            r3 = 0
            r6 = 0
        L_0x0013:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x00ac
            int r1 = r14.readInt()
            int r11 = defpackage.ivw.a((int) r1)
            r12 = 1
            if (r11 == r12) goto L_0x009f
            r12 = 2
            if (r11 == r12) goto L_0x008e
            r12 = 5
            if (r11 == r12) goto L_0x0082
            r12 = 6
            if (r11 == r12) goto L_0x0076
            r12 = 25
            if (r11 == r12) goto L_0x006a
            r12 = 89
            if (r11 == r12) goto L_0x005e
            r12 = 61
            if (r11 == r12) goto L_0x004d
            r12 = 62
            if (r11 == r12) goto L_0x0041
            defpackage.ivw.b(r14, r1)
            goto L_0x00aa
        L_0x0041:
            java.lang.String r9 = defpackage.ivw.q(r14, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r2.add(r1)
            goto L_0x00aa
        L_0x004d:
            android.os.Parcelable$Creator r8 = com.google.android.gms.plus.service.v1whitelisted.models.LoggedProfileEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r14, (int) r1, (android.os.Parcelable.Creator) r8)
            r8 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.LoggedProfileEntity r8 = (com.google.android.gms.plus.service.v1whitelisted.models.LoggedProfileEntity) r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r2.add(r1)
            goto L_0x00aa
        L_0x005e:
            java.util.ArrayList r10 = defpackage.ivw.C(r14, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r2.add(r1)
            goto L_0x00aa
        L_0x006a:
            java.util.ArrayList r7 = defpackage.ivw.C(r14, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r2.add(r1)
            goto L_0x00aa
        L_0x0076:
            int r6 = defpackage.ivw.g(r14, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r2.add(r1)
            goto L_0x00aa
        L_0x0082:
            java.lang.String r5 = defpackage.ivw.q(r14, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r2.add(r1)
            goto L_0x00aa
        L_0x008e:
            android.os.Parcelable$Creator r4 = com.google.android.gms.plus.service.v1whitelisted.models.AclDetailsEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r14, (int) r1, (android.os.Parcelable.Creator) r4)
            r4 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.AclDetailsEntity r4 = (com.google.android.gms.plus.service.v1whitelisted.models.AclDetailsEntity) r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r2.add(r1)
            goto L_0x00aa
        L_0x009f:
            int r3 = defpackage.ivw.g(r14, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r2.add(r1)
        L_0x00aa:
            goto L_0x0013
        L_0x00ac:
            int r1 = r14.dataPosition()
            if (r1 != r0) goto L_0x00b9
            com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity r14 = new com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r14
        L_0x00b9:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r14)
            goto L_0x00d3
        L_0x00d2:
            throw r1
        L_0x00d3:
            goto L_0x00d2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zeq.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
