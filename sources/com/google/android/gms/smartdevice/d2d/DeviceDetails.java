package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceDetails extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new abow();
    private static final Map e;
    final Set a;
    public long b;
    public int c;
    public boolean d;

    static {
        nz nzVar = new nz();
        nzVar.put("androidId", FastJsonResponse$Field.b("androidId", 2));
        nzVar.put("gmsVersion", FastJsonResponse$Field.a("gmsVersion", 3));
        nzVar.put("isSourceIos", FastJsonResponse$Field.e("isSourceIos", 4));
        e = Collections.unmodifiableMap(nzVar);
    }

    public DeviceDetails() {
        this.a = new HashSet();
    }

    public final Map a() {
        return e;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return Long.valueOf(this.b);
        }
        if (i == 3) {
            return Integer.valueOf(this.c);
        }
        if (i == 4) {
            return Boolean.valueOf(this.d);
        }
        throw new IllegalArgumentException();
    }

    public DeviceDetails(long j, int i) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = j;
        hashSet.add(2);
        this.c = i;
        this.a.add(3);
        this.d = false;
        this.a.add(4);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.c = i;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid id %s", new Object[]{Integer.valueOf(i2)}));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            ivx.b(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.d);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = j;
            this.a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid id %s", new Object[]{Integer.valueOf(i)}));
    }

    public DeviceDetails(Set set, long j, int i, boolean z) {
        this.a = set;
        this.b = j;
        this.c = i;
        this.d = z;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i == 4) {
            this.d = z;
            this.a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid id %s", new Object[]{Integer.valueOf(i)}));
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
