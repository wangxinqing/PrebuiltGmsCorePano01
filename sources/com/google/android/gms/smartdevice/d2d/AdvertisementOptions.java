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
public class AdvertisementOptions extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new abng();
    private static final Map c;
    final Set a;
    public int b;

    static {
        nz nzVar = new nz();
        nzVar.put("verificationStyle", FastJsonResponse$Field.a("verificationStyle", 1));
        c = Collections.unmodifiableMap(nzVar);
    }

    public AdvertisementOptions() {
        this.a = new HashSet();
    }

    public final Map a() {
        return c;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 1) {
            return Integer.valueOf(this.b);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 1) {
            this.b = i;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        if (this.a.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        ivx.b(parcel, a2);
    }

    public AdvertisementOptions(int i) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = i;
        hashSet.add(1);
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    public AdvertisementOptions(Set set, int i) {
        this.a = set;
        this.b = i;
    }
}
