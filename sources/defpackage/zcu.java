package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.pos.PlusonesEntity;

/* renamed from: zcu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zcu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlusonesEntity.MetadataEntity[i];
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r13) {
        /*
            r12 = this;
            int r0 = defpackage.ivw.b(r13)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r3 = 0
            r1 = 0
            r5 = 0
            r8 = r1
            r9 = r8
            r10 = r9
            r6 = r3
            r4 = r6
            r3 = 0
        L_0x0013:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L_0x007b
            int r1 = r13.readInt()
            int r11 = defpackage.ivw.a((int) r1)
            switch(r11) {
                case 1: goto L_0x006e;
                case 2: goto L_0x0061;
                case 3: goto L_0x0054;
                case 4: goto L_0x0042;
                case 5: goto L_0x0035;
                case 6: goto L_0x0028;
                default: goto L_0x0024;
            }
        L_0x0024:
            defpackage.ivw.b(r13, r1)
            goto L_0x007a
        L_0x0028:
            java.lang.String r10 = defpackage.ivw.q(r13, r1)
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x007a
        L_0x0035:
            java.lang.String r9 = defpackage.ivw.q(r13, r1)
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x007a
        L_0x0042:
            android.os.Parcelable$Creator r8 = com.google.android.gms.plus.service.pos.PlusonesEntity.MetadataEntity.GlobalCountsEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r13, (int) r1, (android.os.Parcelable.Creator) r8)
            r8 = r1
            com.google.android.gms.plus.service.pos.PlusonesEntity$MetadataEntity$GlobalCountsEntity r8 = (com.google.android.gms.plus.service.pos.PlusonesEntity.MetadataEntity.GlobalCountsEntity) r8
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x007a
        L_0x0054:
            long r6 = defpackage.ivw.i(r13, r1)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x007a
        L_0x0061:
            long r4 = defpackage.ivw.i(r13, r1)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x007a
        L_0x006e:
            int r3 = defpackage.ivw.g(r13, r1)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
        L_0x007a:
            goto L_0x0013
        L_0x007b:
            int r1 = r13.dataPosition()
            if (r1 != r0) goto L_0x0088
            com.google.android.gms.plus.service.pos.PlusonesEntity$MetadataEntity r13 = new com.google.android.gms.plus.service.pos.PlusonesEntity$MetadataEntity
            r1 = r13
            r1.<init>(r2, r3, r4, r6, r8, r9, r10)
            return r13
        L_0x0088:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r13)
            goto L_0x00a2
        L_0x00a1:
            throw r1
        L_0x00a2:
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zcu.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
