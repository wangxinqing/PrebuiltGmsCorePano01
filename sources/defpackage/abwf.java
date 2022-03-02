package defpackage;

import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;

/* renamed from: abwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abwf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WorkProfilePayload[i];
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = defpackage.ivw.b(r10)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = 0
            r3 = r1
            r5 = r3
            r6 = r5
            r4 = 0
        L_0x000f:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L_0x0062
            int r1 = r10.readInt()
            int r7 = defpackage.ivw.a((int) r1)
            r8 = 2
            if (r7 == r8) goto L_0x0056
            r8 = 3
            if (r7 == r8) goto L_0x004a
            r8 = 4
            if (r7 == r8) goto L_0x0039
            r8 = 5
            if (r7 == r8) goto L_0x002d
            defpackage.ivw.b(r10, r1)
            goto L_0x0061
        L_0x002d:
            java.lang.String r6 = defpackage.ivw.q(r10, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
            goto L_0x0061
        L_0x0039:
            android.os.Parcelable$Creator r5 = com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload.CREATOR
            android.os.Parcelable r1 = defpackage.ivw.a((android.os.Parcel) r10, (int) r1, (android.os.Parcelable.Creator) r5)
            r5 = r1
            com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload r5 = (com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload) r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
            goto L_0x0061
        L_0x004a:
            int r4 = defpackage.ivw.g(r10, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
            goto L_0x0061
        L_0x0056:
            java.lang.String r3 = defpackage.ivw.q(r10, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
        L_0x0061:
            goto L_0x000f
        L_0x0062:
            int r1 = r10.dataPosition()
            if (r1 != r0) goto L_0x006f
            com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload r10 = new com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r10
        L_0x006f:
            ivv r1 = new ivv
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r10)
            goto L_0x0089
        L_0x0088:
            throw r1
        L_0x0089:
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abwf.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
