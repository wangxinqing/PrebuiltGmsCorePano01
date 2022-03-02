package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.OzEventEntity;

/* renamed from: zhm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zhm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OzEventEntity[i];
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v9, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v11, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r13) {
        /*
            r12 = this;
            int r0 = defpackage.ivw.b(r13)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = 0
            r4 = r3
            r5 = r4
            r6 = r5
            r8 = r6
            r9 = r8
            r3 = 0
            r7 = 0
        L_0x0012:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L_0x00a0
            int r1 = r13.readInt()
            int r10 = defpackage.ivw.a((int) r1)
            r11 = 1
            if (r10 == r11) goto L_0x0093
            r11 = 2
            if (r10 == r11) goto L_0x0082
            r11 = 5
            if (r10 == r11) goto L_0x0071
            r11 = 7
            if (r10 == r11) goto L_0x0060
            r11 = 10
            if (r10 == r11) goto L_0x0054
            r11 = 14
            if (r10 == r11) goto L_0x0048
            r11 = 15
            if (r10 == r11) goto L_0x003c
            defpackage.ivw.b(r13, r1)
            goto L_0x009e
        L_0x003c:
            java.lang.String r9 = defpackage.ivw.q(r13, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r2.add(r1)
            goto L_0x009e
        L_0x0048:
            java.lang.String r8 = defpackage.ivw.q(r13, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r2.add(r1)
            goto L_0x009e
        L_0x0054:
            boolean r7 = defpackage.ivw.c(r13, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r2.add(r1)
            goto L_0x009e
        L_0x0060:
            android.os.Parcelable$Creator r6 = com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r13, (int) r1, (android.os.Parcelable.Creator) r6)
            r6 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsEntity r6 = (com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsEntity) r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r2.add(r1)
            goto L_0x009e
        L_0x0071:
            android.os.Parcelable$Creator r5 = com.google.android.gms.plus.service.v1whitelisted.models.OzDeviceInfoEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r13, (int) r1, (android.os.Parcelable.Creator) r5)
            r5 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.OzDeviceInfoEntity r5 = (com.google.android.gms.plus.service.v1whitelisted.models.OzDeviceInfoEntity) r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r2.add(r1)
            goto L_0x009e
        L_0x0082:
            android.os.Parcelable$Creator r4 = com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r13, (int) r1, (android.os.Parcelable.Creator) r4)
            r4 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity r4 = (com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity) r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r2.add(r1)
            goto L_0x009e
        L_0x0093:
            int r3 = defpackage.ivw.g(r13, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r2.add(r1)
        L_0x009e:
            goto L_0x0012
        L_0x00a0:
            int r1 = r13.dataPosition()
            if (r1 != r0) goto L_0x00ad
            com.google.android.gms.plus.service.v1whitelisted.models.OzEventEntity r13 = new com.google.android.gms.plus.service.v1whitelisted.models.OzEventEntity
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r13
        L_0x00ad:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r13)
            goto L_0x00c7
        L_0x00c6:
            throw r1
        L_0x00c7:
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zhm.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
