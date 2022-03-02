package defpackage;

import android.os.Parcelable;
import com.google.android.gms.drive.internal.model.User;

/* renamed from: kyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kyj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new User[i];
    }

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
            r3 = r1
            r4 = r3
            r6 = r4
            r7 = r6
            r5 = 0
        L_0x0010:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0074
            int r1 = r11.readInt()
            int r8 = defpackage.ivw.a((int) r1)
            r9 = 2
            if (r8 == r9) goto L_0x0068
            r9 = 5
            if (r8 == r9) goto L_0x005c
            r9 = 7
            if (r8 == r9) goto L_0x0050
            r9 = 9
            if (r8 == r9) goto L_0x0044
            r9 = 10
            if (r8 == r9) goto L_0x0033
            defpackage.ivw.b(r11, r1)
            goto L_0x0073
        L_0x0033:
            android.os.Parcelable$Creator r7 = com.google.android.gms.drive.internal.model.User.Picture.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r11, (int) r1, (android.os.Parcelable.Creator) r7)
            r7 = r1
            com.google.android.gms.drive.internal.model.User$Picture r7 = (com.google.android.gms.drive.internal.model.User.Picture) r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0073
        L_0x0044:
            java.lang.String r6 = defpackage.ivw.q(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0073
        L_0x0050:
            boolean r5 = defpackage.ivw.c(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0073
        L_0x005c:
            java.lang.String r4 = defpackage.ivw.q(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x0073
        L_0x0068:
            java.lang.String r3 = defpackage.ivw.q(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
        L_0x0073:
            goto L_0x0010
        L_0x0074:
            int r1 = r11.dataPosition()
            if (r1 != r0) goto L_0x0081
            com.google.android.gms.drive.internal.model.User r11 = new com.google.android.gms.drive.internal.model.User
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r11
        L_0x0081:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r11)
            goto L_0x009b
        L_0x009a:
            throw r1
        L_0x009b:
            goto L_0x009a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyj.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
