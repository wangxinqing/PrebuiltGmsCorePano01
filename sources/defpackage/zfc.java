package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;

/* renamed from: zfc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zfc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivityEntity.ObjectEntity[i];
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v11, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v13, types: [android.os.Parcelable] */
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
            if (r1 >= r0) goto L_0x008f
            int r1 = r12.readInt()
            int r9 = defpackage.ivw.a((int) r1)
            r10 = 1
            if (r9 == r10) goto L_0x0083
            r10 = 2
            if (r9 == r10) goto L_0x0072
            r10 = 3
            if (r9 == r10) goto L_0x0064
            r10 = 4
            if (r9 == r10) goto L_0x0058
            r10 = 9
            if (r9 == r10) goto L_0x0047
            r10 = 10
            if (r9 == r10) goto L_0x0036
            defpackage.ivw.b(r12, r1)
            goto L_0x008e
        L_0x0036:
            android.os.Parcelable$Creator r8 = com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity.ObjectEntity.RepliesEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r12, (int) r1, (android.os.Parcelable.Creator) r8)
            r8 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity$ObjectEntity$RepliesEntity r8 = (com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity.ObjectEntity.RepliesEntity) r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x008e
        L_0x0047:
            android.os.Parcelable$Creator r7 = com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity.ObjectEntity.PlusonersEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r12, (int) r1, (android.os.Parcelable.Creator) r7)
            r7 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity$ObjectEntity$PlusonersEntity r7 = (com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity.ObjectEntity.PlusonersEntity) r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x008e
        L_0x0058:
            java.lang.String r6 = defpackage.ivw.q(r12, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x008e
        L_0x0064:
            android.os.Parcelable$Creator r5 = com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity.ObjectEntity.AttachmentsEntity.CREATOR
            java.util.ArrayList r5 = defpackage.ivw.c(r12, r1, r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x008e
        L_0x0072:
            android.os.Parcelable$Creator r4 = com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity.ObjectEntity.ActorEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r12, (int) r1, (android.os.Parcelable.Creator) r4)
            r4 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity$ObjectEntity$ActorEntity r4 = (com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity.ObjectEntity.ActorEntity) r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x008e
        L_0x0083:
            int r3 = defpackage.ivw.g(r12, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
        L_0x008e:
            goto L_0x0010
        L_0x008f:
            int r1 = r12.dataPosition()
            if (r1 != r0) goto L_0x009c
            com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity$ObjectEntity r12 = new com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity$ObjectEntity
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r12
        L_0x009c:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r12)
            goto L_0x00b6
        L_0x00b5:
            throw r1
        L_0x00b6:
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfc.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
