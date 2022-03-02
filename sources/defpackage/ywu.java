package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.internal.model.moments.MomentEntity;

/* renamed from: ywu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ywu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MomentEntity[i];
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v11, types: [android.os.Parcelable] */
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
            if (r1 >= r0) goto L_0x0086
            int r1 = r12.readInt()
            int r9 = defpackage.ivw.a((int) r1)
            r10 = 1
            if (r9 == r10) goto L_0x007a
            r10 = 2
            if (r9 == r10) goto L_0x006e
            r10 = 4
            if (r9 == r10) goto L_0x005d
            r10 = 5
            if (r9 == r10) goto L_0x0051
            r10 = 6
            if (r9 == r10) goto L_0x0040
            r10 = 7
            if (r9 == r10) goto L_0x0034
            defpackage.ivw.b(r12, r1)
            goto L_0x0085
        L_0x0034:
            java.lang.String r8 = defpackage.ivw.q(r12, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x0085
        L_0x0040:
            android.os.Parcelable$Creator r7 = com.google.android.gms.plus.internal.model.moments.ItemScopeEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r12, (int) r1, (android.os.Parcelable.Creator) r7)
            r7 = r1
            com.google.android.gms.plus.internal.model.moments.ItemScopeEntity r7 = (com.google.android.gms.plus.internal.model.moments.ItemScopeEntity) r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x0085
        L_0x0051:
            java.lang.String r6 = defpackage.ivw.q(r12, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x0085
        L_0x005d:
            android.os.Parcelable$Creator r5 = com.google.android.gms.plus.internal.model.moments.ItemScopeEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r12, (int) r1, (android.os.Parcelable.Creator) r5)
            r5 = r1
            com.google.android.gms.plus.internal.model.moments.ItemScopeEntity r5 = (com.google.android.gms.plus.internal.model.moments.ItemScopeEntity) r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x0085
        L_0x006e:
            java.lang.String r4 = defpackage.ivw.q(r12, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
            goto L_0x0085
        L_0x007a:
            int r3 = defpackage.ivw.g(r12, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2.add(r1)
        L_0x0085:
            goto L_0x0010
        L_0x0086:
            int r1 = r12.dataPosition()
            if (r1 != r0) goto L_0x0093
            com.google.android.gms.plus.internal.model.moments.MomentEntity r12 = new com.google.android.gms.plus.internal.model.moments.MomentEntity
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r12
        L_0x0093:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r12)
            goto L_0x00ad
        L_0x00ac:
            throw r1
        L_0x00ad:
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywu.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
