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
public final class OzEventEntity extends FastSafeParcelableJsonResponse implements ilq {
    public static final Parcelable.Creator CREATOR = new zhm();
    private static final HashMap i;
    final Set a;
    final int b;
    ActionTargetEntity c;
    OzDeviceInfoEntity d;
    FavaDiagnosticsEntity e;
    boolean f;
    String g;
    String h;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put("actionTarget", FastJsonResponse$Field.a("actionTarget", 2, ActionTargetEntity.class));
        i.put("deviceInfo", FastJsonResponse$Field.a("deviceInfo", 5, OzDeviceInfoEntity.class));
        i.put("favaDiagnostics", FastJsonResponse$Field.a("favaDiagnostics", 7, FavaDiagnosticsEntity.class));
        i.put("isNativePlatformEvent", FastJsonResponse$Field.e("isNativePlatformEvent", 10));
        i.put("thirdPartyAppName", FastJsonResponse$Field.f("thirdPartyAppName", 14));
        i.put("thirdPartyCertificateHash", FastJsonResponse$Field.f("thirdPartyCertificateHash", 15));
    }

    public OzEventEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return i;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            return this.c;
        }
        if (i2 == 5) {
            return this.d;
        }
        if (i2 == 7) {
            return this.e;
        }
        if (i2 == 10) {
            return Boolean.valueOf(this.f);
        }
        if (i2 == 14) {
            return this.g;
        }
        if (i2 == 15) {
            return this.h;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OzEventEntity)) {
            return false;
        }
        if (this != obj) {
            OzEventEntity ozEventEntity = (OzEventEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : i.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!ozEventEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(ozEventEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (ozEventEntity.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : i.values()) {
            if (a(fastJsonResponse$Field)) {
                i2 = i2 + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.c = (ActionTargetEntity) jag;
        } else if (i2 == 5) {
            this.d = (OzDeviceInfoEntity) jag;
        } else if (i2 == 7) {
            this.e = (FavaDiagnosticsEntity) jag;
        } else {
            String canonicalName = jag.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i2));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.c, i2, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.d, i2, true);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.e, i2, true);
        }
        if (set.contains(10)) {
            ivx.a(parcel, 10, this.f);
        }
        if (set.contains(14)) {
            ivx.a(parcel, 14, this.g, true);
        }
        if (set.contains(15)) {
            ivx.a(parcel, 15, this.h, true);
        }
        ivx.b(parcel, a2);
    }

    public OzEventEntity(Set set, int i2, ActionTargetEntity actionTargetEntity, OzDeviceInfoEntity ozDeviceInfoEntity, FavaDiagnosticsEntity favaDiagnosticsEntity, boolean z, String str, String str2) {
        this.a = set;
        this.b = i2;
        this.c = actionTargetEntity;
        this.d = ozDeviceInfoEntity;
        this.e = favaDiagnosticsEntity;
        this.f = z;
        this.g = str;
        this.h = str2;
    }

    public OzEventEntity(Set set, ActionTargetEntity actionTargetEntity, OzDeviceInfoEntity ozDeviceInfoEntity, FavaDiagnosticsEntity favaDiagnosticsEntity, boolean z, String str, String str2) {
        this.a = set;
        this.b = 1;
        this.c = actionTargetEntity;
        this.d = ozDeviceInfoEntity;
        this.e = favaDiagnosticsEntity;
        this.f = z;
        this.g = str;
        this.h = str2;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 14) {
            this.g = str2;
        } else if (i2 == 15) {
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
        if (i2 == 10) {
            this.f = z;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be a boolean.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
