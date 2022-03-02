package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity;

/* renamed from: zhs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zhs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonEntity[i];
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v15, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v17, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r18) {
        /*
            r17 = this;
            r0 = r18
            int r1 = defpackage.ivw.b(r18)
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
            r14 = r13
        L_0x0017:
            int r2 = r18.dataPosition()
            if (r2 >= r1) goto L_0x0107
            int r2 = r18.readInt()
            int r15 = defpackage.ivw.a((int) r2)
            r16 = r14
            r14 = 1
            if (r15 == r14) goto L_0x00f8
            r14 = 9
            if (r15 == r14) goto L_0x00ea
            r14 = 20
            if (r15 == r14) goto L_0x00d7
            r14 = 22
            if (r15 == r14) goto L_0x00c9
            r14 = 32
            if (r15 == r14) goto L_0x00bc
            r14 = 11
            if (r15 == r14) goto L_0x00ac
            r14 = 12
            if (r15 == r14) goto L_0x009e
            r14 = 15
            if (r15 == r14) goto L_0x0090
            r14 = 16
            if (r15 == r14) goto L_0x007c
            r14 = 29
            if (r15 == r14) goto L_0x0068
            r14 = 30
            if (r15 == r14) goto L_0x0059
            defpackage.ivw.b(r0, r2)
            r14 = r16
            goto L_0x0105
        L_0x0059:
            java.lang.String r13 = defpackage.ivw.q(r0, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r3.add(r2)
            r14 = r16
            goto L_0x0105
        L_0x0068:
            android.os.Parcelable$Creator r12 = com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity.StatusForViewerEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r12)
            r12 = r2
            com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity$StatusForViewerEntity r12 = (com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity.StatusForViewerEntity) r12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r3.add(r2)
            r14 = r16
            goto L_0x0105
        L_0x007c:
            android.os.Parcelable$Creator r9 = com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity.ImageEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r9)
            r9 = r2
            com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity$ImageEntity r9 = (com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity.ImageEntity) r9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r3.add(r2)
            r14 = r16
            goto L_0x0105
        L_0x0090:
            java.lang.String r8 = defpackage.ivw.q(r0, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r3.add(r2)
            r14 = r16
            goto L_0x0105
        L_0x009e:
            java.lang.String r7 = defpackage.ivw.q(r0, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r3.add(r2)
            r14 = r16
            goto L_0x0105
        L_0x00ac:
            android.os.Parcelable$Creator r6 = com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity.EmailsEntity.CREATOR
            java.util.ArrayList r6 = defpackage.ivw.c(r0, r2, r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r3.add(r2)
            r14 = r16
            goto L_0x0105
        L_0x00bc:
            java.lang.String r2 = defpackage.ivw.q(r0, r2)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r3.add(r14)
            r14 = r2
            goto L_0x0105
        L_0x00c9:
            java.lang.String r11 = defpackage.ivw.q(r0, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r3.add(r2)
            r14 = r16
            goto L_0x0105
        L_0x00d7:
            android.os.Parcelable$Creator r10 = com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity.NameEntity.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r10)
            r10 = r2
            com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity$NameEntity r10 = (com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity.NameEntity) r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r3.add(r2)
            r14 = r16
            goto L_0x0105
        L_0x00ea:
            java.lang.String r5 = defpackage.ivw.q(r0, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r3.add(r2)
            r14 = r16
            goto L_0x0105
        L_0x00f8:
            int r4 = defpackage.ivw.g(r0, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r3.add(r2)
            r14 = r16
        L_0x0105:
            goto L_0x0017
        L_0x0107:
            r16 = r14
            int r2 = r18.dataPosition()
            if (r2 != r1) goto L_0x0118
            com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity r0 = new com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity
            r2 = r0
            r14 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0118:
            ivv r2 = new ivv
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "Overread allowed size end="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            goto L_0x0132
        L_0x0131:
            throw r2
        L_0x0132:
            goto L_0x0131
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zhs.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
