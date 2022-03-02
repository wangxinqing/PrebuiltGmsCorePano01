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
public class BootstrapAccount extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new abnv();
    private static final HashMap d;
    final Set a;
    public String b;
    public String c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("name", FastJsonResponse$Field.f("name", 2));
        d.put("type", FastJsonResponse$Field.f("type", 3));
    }

    public BootstrapAccount() {
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
            return this.c;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = str2;
        } else if (i == 3) {
            this.c = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(i)}));
        }
        this.a.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.c, true);
        }
        ivx.b(parcel, a2);
    }

    public BootstrapAccount(String str, String str2) {
        this.a = new HashSet();
        iva.a(str, (Object) "name cannot be null or empty.");
        this.b = str;
        this.a.add(2);
        iva.a(str2, (Object) "type cannot be null or empty.");
        this.c = str2;
        this.a.add(3);
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    public BootstrapAccount(Set set, String str, String str2) {
        this.a = set;
        this.b = str;
        this.c = str2;
    }
}
