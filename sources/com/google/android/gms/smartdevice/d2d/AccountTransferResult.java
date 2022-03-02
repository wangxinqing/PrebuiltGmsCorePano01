package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountTransferResult extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new abne();
    private static final HashMap d;
    final Set a;
    public BootstrapAccount b;
    public int c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("bootstrapAccount", FastJsonResponse$Field.a("bootstrapAccount", 2, BootstrapAccount.class));
        d.put("RESULT", FastJsonResponse$Field.a("RESULT", 3));
    }

    public AccountTransferResult() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return d;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return Integer.valueOf(this.c);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.c = i;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be an int.", new Object[]{Integer.valueOf(i2)}));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.b, i, true);
        }
        if (set.contains(3)) {
            ivx.b(parcel, 3, this.c);
        }
        ivx.b(parcel, a2);
    }

    public AccountTransferResult(BootstrapAccount bootstrapAccount, int i) {
        this.a = new HashSet();
        iva.a((Object) bootstrapAccount);
        this.b = bootstrapAccount;
        this.a.add(2);
        this.c = i;
        this.a.add(3);
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = (BootstrapAccount) jag;
            this.a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a concrete type.", new Object[]{Integer.valueOf(i)}));
    }

    public AccountTransferResult(Set set, BootstrapAccount bootstrapAccount, int i) {
        this.a = set;
        this.b = bootstrapAccount;
        this.c = i;
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
