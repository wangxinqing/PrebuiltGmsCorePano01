package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsEntity;

/* renamed from: zgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zgx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FavaDiagnosticsEntity[i];
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v10, types: [android.os.Parcelable] */
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
            r4 = r3
            r5 = r4
            r6 = r5
            r3 = 0
            r7 = 0
        L_0x0010:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x007e
            int r1 = r11.readInt()
            int r8 = defpackage.ivw.a((int) r1)
            r9 = 1
            if (r8 == r9) goto L_0x0072
            r9 = 20
            if (r8 == r9) goto L_0x0061
            r9 = 24
            if (r8 == r9) goto L_0x0055
            r9 = 3
            if (r8 == r9) goto L_0x0044
            r9 = 4
            if (r8 == r9) goto L_0x0033
            defpackage.ivw.b(r11, r1)
            goto L_0x007d
        L_0x0033:
            android.os.Parcelable$Creator r5 = com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsNamespacedTypeEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r11, (int) r1, (android.os.Parcelable.Creator) r5)
            r5 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsNamespacedTypeEntity r5 = (com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsNamespacedTypeEntity) r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x007d
        L_0x0044:
            android.os.Parcelable$Creator r4 = com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsNamespacedTypeEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r11, (int) r1, (android.os.Parcelable.Creator) r4)
            r4 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsNamespacedTypeEntity r4 = (com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsNamespacedTypeEntity) r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x007d
        L_0x0055:
            int r7 = defpackage.ivw.g(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x007d
        L_0x0061:
            android.os.Parcelable$Creator r6 = com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsNamespacedTypeEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r11, (int) r1, (android.os.Parcelable.Creator) r6)
            r6 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsNamespacedTypeEntity r6 = (com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsNamespacedTypeEntity) r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x007d
        L_0x0072:
            int r3 = defpackage.ivw.g(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
        L_0x007d:
            goto L_0x0010
        L_0x007e:
            int r1 = r11.dataPosition()
            if (r1 != r0) goto L_0x008b
            com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsEntity r11 = new com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsEntity
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r11
        L_0x008b:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r11)
            goto L_0x00a5
        L_0x00a4:
            throw r1
        L_0x00a5:
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgx.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
