package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceStatus extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new abwb();
    private static final Map c;
    public int a;
    final Set b;

    static {
        anab h = anaf.h();
        h.a("errorCode", FastJsonResponse$Field.a("errorCode", 1));
        c = h.a();
    }

    public DeviceStatus() {
        this.b = new HashSet();
    }

    public final Map a() {
        return c;
    }

    public final Object c(String str) {
        if ("errorCode".equals(str)) {
            return Integer.valueOf(this.a);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("No value for key ") : "No value for key ".concat(valueOf));
    }

    public DeviceStatus(Set set, int i) {
        this.b = set;
        this.a = i;
    }

    public final void a(int i) {
        this.a = i;
        this.b.add(1);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        if (this.b.contains(1)) {
            ivx.b(parcel, 1, this.a);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, int i) {
        if ("errorCode".equals(str)) {
            a(i);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.b.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
