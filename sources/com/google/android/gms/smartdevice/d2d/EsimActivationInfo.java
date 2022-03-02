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
public class EsimActivationInfo extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new aboz();
    private static final HashMap f;
    final Set a;
    public String b;
    public String c;
    public String d;
    public String e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("eid", FastJsonResponse$Field.f("eid", 2));
        f.put("imei", FastJsonResponse$Field.f("imei", 3));
        f.put("carrierName", FastJsonResponse$Field.f("carrierName", 4));
        f.put("carrierId", FastJsonResponse$Field.f("carrierId", 5));
    }

    public EsimActivationInfo() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return f;
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
        if (i == 4) {
            return this.d;
        }
        if (i == 5) {
            return this.e;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public EsimActivationInfo(Set set, String str, String str2, String str3, String str4) {
        this.a = set;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = str2;
        } else if (i == 3) {
            this.c = str2;
        } else if (i == 4) {
            this.d = str2;
        } else if (i == 5) {
            this.e = str2;
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
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.e, true);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
