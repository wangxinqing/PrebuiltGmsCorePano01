package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthenticatorAnnotatedData extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new ets();
    private static final HashMap g;
    final Set a;
    final int b;
    public AuthenticatorTransferInfo c;
    public String d;
    public String e;
    public String f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("authenticatorInfo", FastJsonResponse$Field.a("authenticatorInfo", 2, AuthenticatorTransferInfo.class));
        g.put("signature", FastJsonResponse$Field.f("signature", 3));
        g.put("package", FastJsonResponse$Field.f("package", 4));
    }

    public AuthenticatorAnnotatedData() {
        this.a = new HashSet(3);
        this.b = 1;
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return g;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 1) {
            return Integer.valueOf(this.b);
        }
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return this.d;
        }
        if (i == 4) {
            return this.e;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public AuthenticatorAnnotatedData(Set set, int i, AuthenticatorTransferInfo authenticatorTransferInfo, String str, String str2, String str3) {
        this.a = set;
        this.b = i;
        this.c = authenticatorTransferInfo;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.c = (AuthenticatorTransferInfo) jag;
            this.a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(i), jag.getClass().getCanonicalName()}));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.c, i, true);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.d, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.f, true);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.d = str2;
        } else if (i == 4) {
            this.e = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(i)}));
        }
        this.a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
