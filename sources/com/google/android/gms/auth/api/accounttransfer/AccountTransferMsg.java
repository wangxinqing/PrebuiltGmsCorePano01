package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountTransferMsg extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new eto();
    private static final HashMap f;
    final Set a;
    final int b;
    public ArrayList c;
    public int d;
    public AccountTransferProgress e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("authenticatorData", FastJsonResponse$Field.b("authenticatorData", 2, AuthenticatorAnnotatedData.class));
        f.put("progress", FastJsonResponse$Field.a("progress", 4, AccountTransferProgress.class));
    }

    public AccountTransferMsg() {
        this.a = new HashSet(1);
        this.b = 1;
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return f;
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
        if (i == 4) {
            return this.e;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public AccountTransferMsg(Set set, int i, ArrayList arrayList, int i2, AccountTransferProgress accountTransferProgress) {
        this.a = set;
        this.b = i;
        this.c = arrayList;
        this.d = i2;
        this.e = accountTransferProgress;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i = fastJsonResponse$Field.g;
        if (i == 4) {
            this.e = (AccountTransferProgress) jag;
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
            ivx.c(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            ivx.b(parcel, 3, this.d);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.e, i, true);
        }
        ivx.b(parcel, a2);
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.c = arrayList;
            this.a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", new Object[]{Integer.valueOf(i), arrayList.getClass().getCanonicalName()}));
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
