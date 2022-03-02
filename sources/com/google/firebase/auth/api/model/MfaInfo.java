package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MfaInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apuq();
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public String e;

    public MfaInfo(String str, String str2, String str3, long j) {
        this.a = str;
        iva.c(str2);
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.firebase.auth.api.model.MfaInfo a(defpackage.alnh r8) {
        /*
            com.google.firebase.auth.api.model.MfaInfo r6 = new com.google.firebase.auth.api.model.MfaInfo
            int r0 = r8.a
            java.lang.String r7 = ""
            r1 = 1
            if (r0 == r1) goto L_0x000b
            r1 = r7
            goto L_0x0010
        L_0x000b:
            java.lang.Object r0 = r8.b
            java.lang.String r0 = (java.lang.String) r0
            r1 = r0
        L_0x0010:
            java.lang.String r2 = r8.e
            java.lang.String r3 = r8.f
            aufc r0 = r8.g
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            aufc r0 = defpackage.aufc.c
        L_0x001b:
            long r4 = r0.a
            r0 = r6
            r0.<init>(r1, r2, r3, r4)
            int r0 = r8.c
            r1 = 5
            if (r0 != r1) goto L_0x002c
            java.lang.Object r8 = r8.d
            r7 = r8
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x002d
        L_0x002c:
        L_0x002d:
            r6.e = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.api.model.MfaInfo.a(alnh):com.google.firebase.auth.api.model.MfaInfo");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d);
        ivx.b(parcel, a2);
    }
}
