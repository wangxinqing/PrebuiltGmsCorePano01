package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;

/* renamed from: zfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zfe implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivityEntity.ObjectEntity.AttachmentsEntity[i];
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v10, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v13, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r15) {
        /*
            r14 = this;
            int r0 = defpackage.ivw.b(r15)
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
            r11 = r10
        L_0x0013:
            int r1 = r15.dataPosition()
            if (r1 >= r0) goto L_0x00c4
            int r1 = r15.readInt()
            int r12 = defpackage.ivw.a((int) r1)
            r13 = 1
            if (r12 == r13) goto L_0x00b7
            r13 = 2
            if (r12 == r13) goto L_0x00a6
            r13 = 4
            if (r12 == r13) goto L_0x009a
            r13 = 5
            if (r12 == r13) goto L_0x0089
            r13 = 6
            if (r12 == r13) goto L_0x007d
            r13 = 10
            if (r12 == r13) goto L_0x006c
            r13 = 11
            if (r12 == r13) goto L_0x0060
            r13 = 13
            if (r12 == r13) goto L_0x0052
            r13 = 14
            if (r12 == r13) goto L_0x0045
            defpackage.ivw.b(r15, r1)
            goto L_0x00c2
        L_0x0045:
            java.lang.String r11 = defpackage.ivw.q(r15, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2.add(r1)
            goto L_0x00c2
        L_0x0052:
            android.os.Parcelable$Creator r10 = com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity.ObjectEntity.AttachmentsEntity.ThumbnailsEntity.CREATOR
            java.util.ArrayList r10 = defpackage.ivw.c(r15, r1, r10)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2.add(r1)
            goto L_0x00c2
        L_0x0060:
            java.lang.String r9 = defpackage.ivw.q(r15, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2.add(r1)
            goto L_0x00c2
        L_0x006c:
            android.os.Parcelable$Creator r8 = com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity.ObjectEntity.AttachmentsEntity.ImageEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r15, (int) r1, (android.os.Parcelable.Creator) r8)
            r8 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity$ObjectEntity$AttachmentsEntity$ImageEntity r8 = (com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity.ObjectEntity.AttachmentsEntity.ImageEntity) r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2.add(r1)
            goto L_0x00c2
        L_0x007d:
            java.lang.String r7 = defpackage.ivw.q(r15, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2.add(r1)
            goto L_0x00c2
        L_0x0089:
            android.os.Parcelable$Creator r6 = com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity.ObjectEntity.AttachmentsEntity.DeepLinkEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r15, (int) r1, (android.os.Parcelable.Creator) r6)
            r6 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity$ObjectEntity$AttachmentsEntity$DeepLinkEntity r6 = (com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity.ObjectEntity.AttachmentsEntity.DeepLinkEntity) r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2.add(r1)
            goto L_0x00c2
        L_0x009a:
            java.lang.String r5 = defpackage.ivw.q(r15, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2.add(r1)
            goto L_0x00c2
        L_0x00a6:
            android.os.Parcelable$Creator r4 = com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r15, (int) r1, (android.os.Parcelable.Creator) r4)
            r4 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity$ObjectEntity$AttachmentsEntity$ActionEntity r4 = (com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity) r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2.add(r1)
            goto L_0x00c2
        L_0x00b7:
            int r3 = defpackage.ivw.g(r15, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2.add(r1)
        L_0x00c2:
            goto L_0x0013
        L_0x00c4:
            int r1 = r15.dataPosition()
            if (r1 != r0) goto L_0x00d1
            com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity$ObjectEntity$AttachmentsEntity r15 = new com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity$ObjectEntity$AttachmentsEntity
            r1 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r15
        L_0x00d1:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r15)
            goto L_0x00eb
        L_0x00ea:
            throw r1
        L_0x00eb:
            goto L_0x00ea
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfe.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
