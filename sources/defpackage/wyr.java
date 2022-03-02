package defpackage;

import android.os.Parcelable;
import com.google.android.gms.people.identity.internal.models.PersonImpl;

/* renamed from: wyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wyr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonImpl.NamesImpl[i];
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r18) {
        /*
            r17 = this;
            r0 = r18
            int r1 = defpackage.ivw.b(r18)
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
            r15 = r14
        L_0x0018:
            int r2 = r18.dataPosition()
            if (r2 >= r1) goto L_0x00d9
            int r2 = r18.readInt()
            int r16 = defpackage.ivw.a((int) r2)
            switch(r16) {
                case 2: goto L_0x00c6;
                case 3: goto L_0x00b9;
                case 4: goto L_0x00ac;
                case 5: goto L_0x009f;
                case 6: goto L_0x0092;
                case 7: goto L_0x0085;
                case 8: goto L_0x0077;
                case 9: goto L_0x0069;
                case 10: goto L_0x005b;
                case 11: goto L_0x004c;
                case 12: goto L_0x003d;
                case 13: goto L_0x002e;
                default: goto L_0x0029;
            }
        L_0x0029:
            defpackage.ivw.b(r0, r2)
            goto L_0x00d7
        L_0x002e:
            java.lang.String r15 = defpackage.ivw.q(r0, r2)
            r2 = 13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00d7
        L_0x003d:
            java.lang.String r14 = defpackage.ivw.q(r0, r2)
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00d7
        L_0x004c:
            java.lang.String r13 = defpackage.ivw.q(r0, r2)
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00d7
        L_0x005b:
            java.lang.String r12 = defpackage.ivw.q(r0, r2)
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00d7
        L_0x0069:
            java.lang.String r11 = defpackage.ivw.q(r0, r2)
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00d7
        L_0x0077:
            java.lang.String r10 = defpackage.ivw.q(r0, r2)
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00d7
        L_0x0085:
            java.lang.String r9 = defpackage.ivw.q(r0, r2)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00d7
        L_0x0092:
            java.lang.String r8 = defpackage.ivw.q(r0, r2)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00d7
        L_0x009f:
            java.lang.String r7 = defpackage.ivw.q(r0, r2)
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00d7
        L_0x00ac:
            java.lang.String r6 = defpackage.ivw.q(r0, r2)
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00d7
        L_0x00b9:
            java.lang.String r5 = defpackage.ivw.q(r0, r2)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x00d7
        L_0x00c6:
            android.os.Parcelable$Creator r4 = com.google.android.gms.people.identity.internal.models.PersonImpl.MetadataImpl.CREATOR
            android.os.Parcelable r2 = defpackage.ivw.a((android.os.Parcel) r0, (int) r2, (android.os.Parcelable.Creator) r4)
            r4 = r2
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r4 = (com.google.android.gms.people.identity.internal.models.PersonImpl.MetadataImpl) r4
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
        L_0x00d7:
            goto L_0x0018
        L_0x00d9:
            int r2 = r18.dataPosition()
            if (r2 != r1) goto L_0x00e6
            com.google.android.gms.people.identity.internal.models.PersonImpl$NamesImpl r0 = new com.google.android.gms.people.identity.internal.models.PersonImpl$NamesImpl
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        L_0x00e6:
            ivv r2 = new ivv
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "Overread allowed size end="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            goto L_0x0100
        L_0x00ff:
            throw r2
        L_0x0100:
            goto L_0x00ff
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyr.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
