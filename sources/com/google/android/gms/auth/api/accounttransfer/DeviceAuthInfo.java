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
public class DeviceAuthInfo extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new etv();
    private static final HashMap e;
    final Set a;
    final int b;
    public boolean c;
    public long d;

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put("solved", FastJsonResponse$Field.e("solved", 2));
        e.put("age", FastJsonResponse$Field.b("age", 3));
    }

    public DeviceAuthInfo() {
        this.a = new HashSet(1);
        this.b = 1;
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return e;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 1) {
            return Integer.valueOf(this.b);
        }
        if (i == 2) {
            return Boolean.valueOf(this.c);
        }
        if (i == 3) {
            return Long.valueOf(this.d);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public DeviceAuthInfo(Set set, int i, boolean z, long j) {
        this.a = set;
        this.b = i;
        this.c = z;
        this.d = j;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.d = j;
            this.a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.c);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.d);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.c = z;
            this.a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
