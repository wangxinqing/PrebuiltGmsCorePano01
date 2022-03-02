package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.AccountField;

/* renamed from: zeg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zeg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountField.ValueEntity[i];
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [android.os.Parcelable] */
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
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r3 = 0
            r4 = 0
        L_0x0011:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0079
            int r1 = r11.readInt()
            int r9 = defpackage.ivw.a((int) r1)
            switch(r9) {
                case 1: goto L_0x006c;
                case 2: goto L_0x005f;
                case 3: goto L_0x0052;
                case 4: goto L_0x0040;
                case 5: goto L_0x0033;
                case 6: goto L_0x0026;
                default: goto L_0x0022;
            }
        L_0x0022:
            defpackage.ivw.b(r11, r1)
            goto L_0x0078
        L_0x0026:
            java.lang.String r8 = defpackage.ivw.q(r11, r1)
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0078
        L_0x0033:
            java.lang.String r7 = defpackage.ivw.q(r11, r1)
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0078
        L_0x0040:
            android.os.Parcelable$Creator r6 = com.google.android.gms.plus.service.v1whitelisted.models.AccountField.ValueEntity.NameEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r11, (int) r1, (android.os.Parcelable.Creator) r6)
            r6 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.AccountField$ValueEntity$NameEntity r6 = (com.google.android.gms.plus.service.v1whitelisted.models.AccountField.ValueEntity.NameEntity) r6
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0078
        L_0x0052:
            java.lang.String r5 = defpackage.ivw.q(r11, r1)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0078
        L_0x005f:
            boolean r4 = defpackage.ivw.c(r11, r1)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0078
        L_0x006c:
            int r3 = defpackage.ivw.g(r11, r1)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
        L_0x0078:
            goto L_0x0011
        L_0x0079:
            int r1 = r11.dataPosition()
            if (r1 != r0) goto L_0x0086
            com.google.android.gms.plus.service.v1whitelisted.models.AccountField$ValueEntity r11 = new com.google.android.gms.plus.service.v1whitelisted.models.AccountField$ValueEntity
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r11
        L_0x0086:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r11)
            goto L_0x00a0
        L_0x009f:
            throw r1
        L_0x00a0:
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zeg.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
