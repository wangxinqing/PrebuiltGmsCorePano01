package defpackage;

import android.os.Parcelable;
import com.google.android.gms.people.identity.internal.models.PersonImpl;

/* renamed from: wyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wyv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonImpl.OrganizationsImpl[i];
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r19) {
        /*
            r18 = this;
            r0 = r19
            int r1 = defpackage.ivw.b(r19)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2 = 0
            r4 = 0
            r4 = r2
            r6 = r4
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r5 = 0
        L_0x001b:
            int r2 = r19.dataPosition()
            if (r2 >= r1) goto L_0x00eb
            int r2 = r19.readInt()
            int r17 = defpackage.ivw.a((int) r2)
            switch(r17) {
                case 2: goto L_0x00d8;
                case 3: goto L_0x00cb;
                case 4: goto L_0x00be;
                case 5: goto L_0x00b1;
                case 6: goto L_0x00a4;
                case 7: goto L_0x0097;
                case 8: goto L_0x0089;
                case 9: goto L_0x007b;
                case 10: goto L_0x006d;
                case 11: goto L_0x005e;
                case 12: goto L_0x004f;
                case 13: goto L_0x0040;
                case 14: goto L_0x0031;
                default: goto L_0x002c;
            }
        L_0x002c:
            defpackage.ivw.b(r0, r2)
            goto L_0x00e9
        L_0x0031:
            java.lang.String r16 = defpackage.ivw.q(r0, r2)
            r2 = 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e9
        L_0x0040:
            java.lang.String r15 = defpackage.ivw.q(r0, r2)
            r2 = 13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e9
        L_0x004f:
            java.lang.String r14 = defpackage.ivw.q(r0, r2)
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e9
        L_0x005e:
            java.lang.String r13 = defpackage.ivw.q(r0, r2)
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e9
        L_0x006d:
            java.lang.String r12 = defpackage.ivw.q(r0, r2)
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e9
        L_0x007b:
            java.lang.String r11 = defpackage.ivw.q(r0, r2)
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e9
        L_0x0089:
            java.lang.String r10 = defpackage.ivw.q(r0, r2)
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e9
        L_0x0097:
            java.lang.String r9 = defpackage.ivw.q(r0, r2)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e9
        L_0x00a4:
            java.lang.String r8 = defpackage.ivw.q(r0, r2)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e9
        L_0x00b1:
            java.lang.String r7 = defpackage.ivw.q(r0, r2)
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e9
        L_0x00be:
            java.lang.String r6 = defpackage.ivw.q(r0, r2)
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e9
        L_0x00cb:
            boolean r5 = defpackage.ivw.c(r0, r2)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00e9
        L_0x00d8:
            android.os.Parcelable$Creator r4 = com.google.android.gms.people.identity.internal.models.PersonImpl.MetadataImpl.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r4)
            r4 = r2
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r4 = (com.google.android.gms.people.identity.internal.models.PersonImpl.MetadataImpl) r4
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
        L_0x00e9:
            goto L_0x001b
        L_0x00eb:
            int r2 = r19.dataPosition()
            if (r2 != r1) goto L_0x00f8
            com.google.android.gms.people.identity.internal.models.PersonImpl$OrganizationsImpl r0 = new com.google.android.gms.people.identity.internal.models.PersonImpl$OrganizationsImpl
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        L_0x00f8:
            ivv r2 = new ivv
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "Overread allowed size end="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            goto L_0x0112
        L_0x0111:
            throw r2
        L_0x0112:
            goto L_0x0111
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyv.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
