package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator CREATOR = new nby();
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final List d;
    public final List e;
    public final ChannelIdValue f;
    public final String g;

    public RegisterRequestParams(Integer num, Double d2, Uri uri, List list, List list2, ChannelIdValue channelIdValue, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        this.a = num;
        this.b = d2;
        this.c = uri;
        boolean z4 = false;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        iva.b(z, "empty list of register requests is provided");
        this.d = list;
        this.e = list2;
        this.f = channelIdValue;
        Uri uri2 = this.c;
        HashSet hashSet = new HashSet();
        if (uri2 != null) {
            hashSet.add(uri2);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RegisterRequest registerRequest = (RegisterRequest) list.get(i);
            if (uri2 == null && registerRequest.c == null) {
                z3 = false;
            } else {
                z3 = true;
            }
            iva.b(z3, "register request has null appId and no request appId is provided");
            String str2 = registerRequest.c;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            RegisteredKey registeredKey = (RegisteredKey) list2.get(i2);
            if (uri2 == null && registeredKey.b == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            iva.b(z2, "registered key has null appId and no request appId is provided");
            String str3 = registeredKey.b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        iva.b((str == null || str.length() <= 80) ? true : z4, "Display Hint cannot be longer than 80 characters");
        this.g = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        r1 = r4.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        r3 = r5.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 == r5) goto L_0x0068
            boolean r1 = r5 instanceof com.google.android.gms.fido.u2f.api.common.RegisterRequestParams
            r2 = 0
            if (r1 == 0) goto L_0x0067
            com.google.android.gms.fido.u2f.api.common.RegisterRequestParams r5 = (com.google.android.gms.fido.u2f.api.common.RegisterRequestParams) r5
            java.lang.Integer r1 = r4.a
            java.lang.Integer r3 = r5.a
            boolean r1 = defpackage.ius.a(r1, r3)
            if (r1 == 0) goto L_0x0067
            java.lang.Double r1 = r4.b
            java.lang.Double r3 = r5.b
            boolean r1 = defpackage.ius.a(r1, r3)
            if (r1 == 0) goto L_0x0067
            android.net.Uri r1 = r4.c
            android.net.Uri r3 = r5.c
            boolean r1 = defpackage.ius.a(r1, r3)
            if (r1 == 0) goto L_0x0067
            java.util.List r1 = r4.d
            java.util.List r3 = r5.d
            boolean r1 = defpackage.ius.a(r1, r3)
            if (r1 == 0) goto L_0x0067
            java.util.List r1 = r4.e
            if (r1 != 0) goto L_0x003b
            java.util.List r3 = r5.e
            if (r3 != 0) goto L_0x003b
            goto L_0x0052
        L_0x003b:
            if (r1 == 0) goto L_0x0067
            java.util.List r3 = r5.e
            if (r3 == 0) goto L_0x0067
            boolean r1 = r1.containsAll(r3)
            if (r1 == 0) goto L_0x0067
            java.util.List r1 = r5.e
            java.util.List r3 = r4.e
            boolean r1 = r1.containsAll(r3)
            if (r1 != 0) goto L_0x0052
            goto L_0x0067
        L_0x0052:
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r1 = r4.f
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r3 = r5.f
            boolean r1 = defpackage.ius.a(r1, r3)
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = r4.g
            java.lang.String r5 = r5.g
            boolean r5 = defpackage.ius.a(r1, r5)
            if (r5 == 0) goto L_0x0067
            return r0
        L_0x0067:
            return r2
        L_0x0068:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.d, this.e, this.f, this.g});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c, i, false);
        ivx.c(parcel, 5, this.d, false);
        ivx.c(parcel, 6, this.e, false);
        ivx.a(parcel, 7, this.f, i, false);
        ivx.a(parcel, 8, this.g, false);
        ivx.b(parcel, a2);
    }
}
