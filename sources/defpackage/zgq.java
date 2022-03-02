package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity;

/* renamed from: zgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zgq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CommentEntity[i];
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v15, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v18, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v23, types: [android.os.Parcelable] */
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
            r11 = r10
        L_0x0013:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x00ba
            int r1 = r14.readInt()
            int r12 = defpackage.ivw.a((int) r1)
            switch(r12) {
                case 1: goto L_0x00ac;
                case 2: goto L_0x009a;
                case 3: goto L_0x0024;
                case 4: goto L_0x008d;
                case 5: goto L_0x007e;
                case 6: goto L_0x0024;
                case 7: goto L_0x006c;
                case 8: goto L_0x0059;
                case 9: goto L_0x004b;
                case 10: goto L_0x0024;
                case 11: goto L_0x0038;
                case 12: goto L_0x0029;
                default: goto L_0x0024;
            }
        L_0x0024:
            defpackage.ivw.b(r14, r1)
            goto L_0x00b8
        L_0x0029:
            java.lang.String r11 = defpackage.ivw.q(r14, r1)
            r1 = 12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00b8
        L_0x0038:
            android.os.Parcelable$Creator r10 = com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity.StatusForViewerEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r14, (int) r1, (android.os.Parcelable.Creator) r10)
            r10 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity$StatusForViewerEntity r10 = (com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity.StatusForViewerEntity) r10
            r1 = 11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00b8
        L_0x004b:
            java.lang.String r9 = defpackage.ivw.q(r14, r1)
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00b8
        L_0x0059:
            android.os.Parcelable$Creator r8 = com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity.PlusonersEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r14, (int) r1, (android.os.Parcelable.Creator) r8)
            r8 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity$PlusonersEntity r8 = (com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity.PlusonersEntity) r8
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00b8
        L_0x006c:
            android.os.Parcelable$Creator r7 = com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity.ObjectEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r14, (int) r1, (android.os.Parcelable.Creator) r7)
            r7 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity$ObjectEntity r7 = (com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity.ObjectEntity) r7
            r1 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00b8
        L_0x007e:
            android.os.Parcelable$Creator r6 = com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity.InReplyToEntity.CREATOR
            java.util.ArrayList r6 = defpackage.ivw.c(r14, r1, r6)
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00b8
        L_0x008d:
            java.lang.String r5 = defpackage.ivw.q(r14, r1)
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00b8
        L_0x009a:
            android.os.Parcelable$Creator r4 = com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity.ActorEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r14, (int) r1, (android.os.Parcelable.Creator) r4)
            r4 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity$ActorEntity r4 = (com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity.ActorEntity) r4
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00b8
        L_0x00ac:
            int r3 = defpackage.ivw.g(r14, r1)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
        L_0x00b8:
            goto L_0x0013
        L_0x00ba:
            int r1 = r14.dataPosition()
            if (r1 != r0) goto L_0x00c7
            com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity r14 = new com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r14
        L_0x00c7:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r14)
            goto L_0x00e1
        L_0x00e0:
            throw r1
        L_0x00e1:
            goto L_0x00e0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgq.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
