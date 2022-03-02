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
public class EsimActivationPayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new abpa();
    private static final HashMap g;
    final Set a;
    public int b;
    public String c;
    public String d;
    public String e;
    public boolean f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("resultCode", FastJsonResponse$Field.a("resultCode", 2));
        g.put("activationCode", FastJsonResponse$Field.f("activationCode", 3));
        g.put("phoneNumber", FastJsonResponse$Field.f("phoneNumber", 4));
        g.put("carrierName", FastJsonResponse$Field.f("carrierName", 5));
        g.put("isEmbedded", FastJsonResponse$Field.e("isEmbedded", 6));
    }

    public EsimActivationPayload() {
        this.a = new HashSet();
        this.b = 1;
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return g;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return Integer.valueOf(this.b);
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
        if (i == 6) {
            return Boolean.valueOf(this.f);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public EsimActivationPayload(String str, String str2, String str3, boolean z) {
        this();
        this.b = 0;
        this.a.add(2);
        this.c = str;
        this.a.add(3);
        this.d = str2;
        this.a.add(4);
        this.e = str3;
        this.a.add(5);
        this.f = z;
        this.a.add(6);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.b = i;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be an integer.", new Object[]{Integer.valueOf(i2)}));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.b(parcel, 2, this.b);
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
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.f);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
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

    public EsimActivationPayload(Set set, int i, String str, String str2, String str3, boolean z) {
        this.a = set;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i == 6) {
            this.f = z;
            this.a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a boolean.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
