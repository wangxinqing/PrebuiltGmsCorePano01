package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class OzDeviceInfoEntity extends FastSafeParcelableJsonResponse implements ilq {
    public static final Parcelable.Creator CREATOR = new zhk();
    private static final HashMap k;
    final Set a;
    final int b;
    int c;
    boolean d;
    boolean e;
    String f;
    String g;
    String h;
    int i;
    int j;

    static {
        HashMap hashMap = new HashMap();
        k = hashMap;
        hashMap.put("densityDpi", FastJsonResponse$Field.a("densityDpi", 2));
        k.put("featureLandscape", FastJsonResponse$Field.e("featureLandscape", 3));
        k.put("featurePortrait", FastJsonResponse$Field.e("featurePortrait", 4));
        k.put("fingerprint", FastJsonResponse$Field.f("fingerprint", 5));
        k.put("manufacturer", FastJsonResponse$Field.f("manufacturer", 6));
        k.put("orientation", FastJsonResponse$Field.f("orientation", 7));
        k.put("screenHeightDp", FastJsonResponse$Field.a("screenHeightDp", 8));
        k.put("screenWidthDp", FastJsonResponse$Field.a("screenWidthDp", 9));
    }

    public OzDeviceInfoEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return k;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 2:
                return Integer.valueOf(this.c);
            case 3:
                return Boolean.valueOf(this.d);
            case 4:
                return Boolean.valueOf(this.e);
            case 5:
                return this.f;
            case 6:
                return this.g;
            case 7:
                return this.h;
            case 8:
                return Integer.valueOf(this.i);
            case 9:
                return Integer.valueOf(this.j);
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OzDeviceInfoEntity)) {
            return false;
        }
        if (this != obj) {
            OzDeviceInfoEntity ozDeviceInfoEntity = (OzDeviceInfoEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : k.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!ozDeviceInfoEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(ozDeviceInfoEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (ozDeviceInfoEntity.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : k.values()) {
            if (a(fastJsonResponse$Field)) {
                i2 = i2 + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i2) {
        int i3 = fastJsonResponse$Field.g;
        if (i3 == 2) {
            this.c = i2;
        } else if (i3 == 8) {
            this.i = i2;
        } else if (i3 == 9) {
            this.j = i2;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i3);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i3));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            ivx.b(parcel, 2, this.c);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.d);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.e);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.f, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.g, true);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.h, true);
        }
        if (set.contains(8)) {
            ivx.b(parcel, 8, this.i);
        }
        if (set.contains(9)) {
            ivx.b(parcel, 9, this.j);
        }
        ivx.b(parcel, a2);
    }

    public OzDeviceInfoEntity(Set set, int i2, int i3, boolean z, boolean z2, String str, String str2, String str3, int i4, int i5) {
        this.a = set;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = i4;
        this.j = i5;
    }

    public OzDeviceInfoEntity(Set set, int i2, boolean z, boolean z2, String str, String str2, String str3, int i3, int i4) {
        this.a = set;
        this.b = 1;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = i3;
        this.j = i4;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 5) {
            this.f = str2;
        } else if (i2 == 6) {
            this.g = str2;
        } else if (i2 == 7) {
            this.h = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.d = z;
        } else if (i2 == 4) {
            this.e = z;
        } else {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
