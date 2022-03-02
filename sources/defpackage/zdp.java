package defpackage;

import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.AccountField;

/* renamed from: zdp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zdp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountField[i];
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v23, types: [android.os.Parcelable] */
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
            r4 = r3
            r6 = r4
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
            r3 = 0
            r5 = 0
            r8 = 0
        L_0x0015:
            int r1 = r15.dataPosition()
            if (r1 >= r0) goto L_0x00c2
            int r1 = r15.readInt()
            int r13 = defpackage.ivw.a((int) r1)
            switch(r13) {
                case 1: goto L_0x00b4;
                case 2: goto L_0x00a5;
                case 3: goto L_0x0098;
                case 4: goto L_0x008b;
                case 5: goto L_0x0026;
                case 6: goto L_0x0079;
                case 7: goto L_0x006c;
                case 8: goto L_0x005c;
                case 9: goto L_0x004e;
                case 10: goto L_0x003a;
                case 11: goto L_0x002b;
                default: goto L_0x0026;
            }
        L_0x0026:
            defpackage.ivw.b(r15, r1)
            goto L_0x00c0
        L_0x002b:
            java.lang.String r12 = defpackage.ivw.q(r15, r1)
            r1 = 11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00c0
        L_0x003a:
            android.os.Parcelable$Creator r11 = com.google.android.gms.plus.service.v1whitelisted.models.AccountField.ValueEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r15, (int) r1, (android.os.Parcelable.Creator) r11)
            r11 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.AccountField$ValueEntity r11 = (com.google.android.gms.plus.service.v1whitelisted.models.AccountField.ValueEntity) r11
            r1 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00c0
        L_0x004e:
            java.lang.String r10 = defpackage.ivw.q(r15, r1)
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00c0
        L_0x005c:
            android.os.Parcelable$Creator r9 = com.google.android.gms.plus.service.v1whitelisted.models.AccountField.OptionsEntity.CREATOR
            java.util.ArrayList r9 = defpackage.ivw.c(r15, r1, r9)
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00c0
        L_0x006c:
            boolean r8 = defpackage.ivw.c(r15, r1)
            r1 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00c0
        L_0x0079:
            android.os.Parcelable$Creator r7 = com.google.android.gms.plus.service.v1whitelisted.models.AccountField.LabelEntity.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r15, (int) r1, (android.os.Parcelable.Creator) r7)
            r7 = r1
            com.google.android.gms.plus.service.v1whitelisted.models.AccountField$LabelEntity r7 = (com.google.android.gms.plus.service.v1whitelisted.models.AccountField.LabelEntity) r7
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00c0
        L_0x008b:
            java.lang.String r6 = defpackage.ivw.q(r15, r1)
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00c0
        L_0x0098:
            boolean r5 = defpackage.ivw.c(r15, r1)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00c0
        L_0x00a5:
            android.os.Parcelable$Creator r4 = com.google.android.gms.plus.service.v1whitelisted.models.AccountField.ErrorsEntity.CREATOR
            java.util.ArrayList r4 = defpackage.ivw.c(r15, r1, r4)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x00c0
        L_0x00b4:
            int r3 = defpackage.ivw.g(r15, r1)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
        L_0x00c0:
            goto L_0x0015
        L_0x00c2:
            int r1 = r15.dataPosition()
            if (r1 != r0) goto L_0x00cf
            com.google.android.gms.plus.service.v1whitelisted.models.AccountField r15 = new com.google.android.gms.plus.service.v1whitelisted.models.AccountField
            r1 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r15
        L_0x00cf:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r15)
            goto L_0x00e9
        L_0x00e8:
            throw r1
        L_0x00e9:
            goto L_0x00e8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdp.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
