package defpackage;

import android.os.Parcelable;
import com.google.android.gms.people.identity.internal.models.PersonImpl;

/* renamed from: wyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wyn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonImpl.InstantMessagingImpl[i];
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = defpackage.ivw.b(r11)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x0010:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0078
            int r1 = r11.readInt()
            int r9 = defpackage.ivw.a((int) r1)
            switch(r9) {
                case 2: goto L_0x0066;
                case 3: goto L_0x0059;
                case 4: goto L_0x004c;
                case 5: goto L_0x003f;
                case 6: goto L_0x0032;
                case 7: goto L_0x0025;
                default: goto L_0x0021;
            }
        L_0x0021:
            defpackage.ivw.b(r11, r1)
            goto L_0x0077
        L_0x0025:
            java.lang.String r8 = defpackage.ivw.q(r11, r1)
            r1 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0077
        L_0x0032:
            java.lang.String r7 = defpackage.ivw.q(r11, r1)
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0077
        L_0x003f:
            java.lang.String r6 = defpackage.ivw.q(r11, r1)
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0077
        L_0x004c:
            java.lang.String r5 = defpackage.ivw.q(r11, r1)
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0077
        L_0x0059:
            java.lang.String r4 = defpackage.ivw.q(r11, r1)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0077
        L_0x0066:
            android.os.Parcelable$Creator r3 = com.google.android.gms.people.identity.internal.models.PersonImpl.MetadataImpl.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r11, (int) r1, (android.os.Parcelable.Creator) r3)
            r3 = r1
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r3 = (com.google.android.gms.people.identity.internal.models.PersonImpl.MetadataImpl) r3
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
        L_0x0077:
            goto L_0x0010
        L_0x0078:
            int r1 = r11.dataPosition()
            if (r1 != r0) goto L_0x0085
            com.google.android.gms.people.identity.internal.models.PersonImpl$InstantMessagingImpl r11 = new com.google.android.gms.people.identity.internal.models.PersonImpl$InstantMessagingImpl
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r11
        L_0x0085:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r11)
            goto L_0x009f
        L_0x009e:
            throw r1
        L_0x009f:
            goto L_0x009e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyn.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
