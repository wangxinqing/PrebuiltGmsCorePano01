package defpackage;

import android.os.Parcelable;
import com.google.android.gms.people.identity.internal.models.PersonImpl;

/* renamed from: wyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wyb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonImpl.AddressesImpl[i];
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r17) {
        /*
            r16 = this;
            r0 = r17
            int r1 = defpackage.ivw.b(r17)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x0017:
            int r2 = r17.dataPosition()
            if (r2 >= r1) goto L_0x00c9
            int r2 = r17.readInt()
            int r15 = defpackage.ivw.a((int) r2)
            switch(r15) {
                case 2: goto L_0x00b6;
                case 3: goto L_0x00a9;
                case 4: goto L_0x009c;
                case 5: goto L_0x008f;
                case 6: goto L_0x0082;
                case 7: goto L_0x0075;
                case 8: goto L_0x0067;
                case 9: goto L_0x0059;
                case 10: goto L_0x004b;
                case 11: goto L_0x003c;
                case 12: goto L_0x002d;
                default: goto L_0x0028;
            }
        L_0x0028:
            defpackage.ivw.b(r0, r2)
            goto L_0x00c7
        L_0x002d:
            java.lang.String r14 = defpackage.ivw.q(r0, r2)
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00c7
        L_0x003c:
            java.lang.String r13 = defpackage.ivw.q(r0, r2)
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00c7
        L_0x004b:
            java.lang.String r12 = defpackage.ivw.q(r0, r2)
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00c7
        L_0x0059:
            java.lang.String r11 = defpackage.ivw.q(r0, r2)
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00c7
        L_0x0067:
            java.lang.String r10 = defpackage.ivw.q(r0, r2)
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00c7
        L_0x0075:
            java.lang.String r9 = defpackage.ivw.q(r0, r2)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00c7
        L_0x0082:
            java.lang.String r8 = defpackage.ivw.q(r0, r2)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00c7
        L_0x008f:
            java.lang.String r7 = defpackage.ivw.q(r0, r2)
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00c7
        L_0x009c:
            java.lang.String r6 = defpackage.ivw.q(r0, r2)
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00c7
        L_0x00a9:
            java.lang.String r5 = defpackage.ivw.q(r0, r2)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00c7
        L_0x00b6:
            android.os.Parcelable$Creator r4 = com.google.android.gms.people.identity.internal.models.PersonImpl.MetadataImpl.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r4)
            r4 = r2
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r4 = (com.google.android.gms.people.identity.internal.models.PersonImpl.MetadataImpl) r4
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
        L_0x00c7:
            goto L_0x0017
        L_0x00c9:
            int r2 = r17.dataPosition()
            if (r2 != r1) goto L_0x00d6
            com.google.android.gms.people.identity.internal.models.PersonImpl$AddressesImpl r0 = new com.google.android.gms.people.identity.internal.models.PersonImpl$AddressesImpl
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x00d6:
            ivv r2 = new ivv
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "Overread allowed size end="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            goto L_0x00f0
        L_0x00ef:
            throw r2
        L_0x00f0:
            goto L_0x00ef
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyb.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
