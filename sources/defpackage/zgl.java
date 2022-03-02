package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientOzEventEntity;

/* renamed from: zgl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zgl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ClientOzEventEntity[i];
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v10, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = defpackage.ivw.b(r11)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = 0
            r4 = 0
            r7 = r1
            r5 = r4
            r4 = r7
        L_0x0010:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0068
            int r1 = r11.readInt()
            int r8 = defpackage.ivw.a((int) r1)
            r9 = 1
            if (r8 == r9) goto L_0x005c
            r9 = 2
            if (r8 == r9) goto L_0x004b
            r9 = 3
            if (r8 == r9) goto L_0x003f
            r9 = 5
            if (r8 == r9) goto L_0x002e
            defpackage.ivw.b(r11, r1)
            goto L_0x0067
        L_0x002e:
            android.os.Parcelable$Creator r7 = com.google.android.gms.plus.service.v1whitelisted.models.OzEventEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r11, (int) r1, (android.os.Parcelable.Creator) r7)
            r7 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.OzEventEntity r7 = (com.google.android.gms.plus.service.v1whitelisted.models.OzEventEntity) r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0067
        L_0x003f:
            long r5 = defpackage.ivw.i(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0067
        L_0x004b:
            android.os.Parcelable$Creator r4 = com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r11, (int) r1, (android.os.Parcelable.Creator) r4)
            r4 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity r4 = (com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity) r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0067
        L_0x005c:
            int r3 = defpackage.ivw.g(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
        L_0x0067:
            goto L_0x0010
        L_0x0068:
            int r1 = r11.dataPosition()
            if (r1 != r0) goto L_0x0075
            com.google.android.gms.plus.service.v1whitelisted.models.ClientOzEventEntity r11 = new com.google.android.gms.plus.service.v1whitelisted.models.ClientOzEventEntity
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r7)
            return r11
        L_0x0075:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r11)
            goto L_0x008f
        L_0x008e:
            throw r1
        L_0x008f:
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgl.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
