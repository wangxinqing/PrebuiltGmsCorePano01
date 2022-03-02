package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WorkProfilePayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new abwf();
    private static final Map f;
    final Set a;
    public String b;
    public int c;
    public AccountBootstrapPayload d;
    public String e;

    static {
        anab h = anaf.h();
        h.a("accountName", FastJsonResponse$Field.f("accountName", 2));
        h.a("managementMode", FastJsonResponse$Field.a("managementMode", 3));
        h.a("accountPayload", FastJsonResponse$Field.a("accountPayload", 4, AccountBootstrapPayload.class));
        h.a("sourceId", FastJsonResponse$Field.f("sourceId", 5));
        f = h.a();
    }

    public WorkProfilePayload() {
        this.a = new HashSet();
    }

    public final Map a() {
        return f;
    }

    public final int b() {
        return anvt.a(this.c);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.c = i;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalStateException();
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
        if (i == 4) {
            return this.d;
        }
        if (i == 5) {
            return this.e;
        }
        throw new IllegalStateException();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            ivx.b(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.d, i, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.e, true);
        }
        ivx.b(parcel, a2);
    }

    public WorkProfilePayload(String str, int i, String str2) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = str;
        hashSet.add(2);
        this.c = i;
        this.a.add(3);
        this.e = str2;
        this.a.add(5);
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        if (fastJsonResponse$Field.g == 4) {
            this.d = (AccountBootstrapPayload) jag;
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = str2;
        } else if (i == 5) {
            this.e = str2;
        } else {
            throw new IllegalStateException();
        }
        this.a.add(Integer.valueOf(i));
    }

    public WorkProfilePayload(Set set, String str, int i, AccountBootstrapPayload accountBootstrapPayload, String str2) {
        this.a = set;
        this.b = str;
        this.c = i;
        this.d = accountBootstrapPayload;
        this.e = str2;
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
