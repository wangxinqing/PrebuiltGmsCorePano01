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
public final class ClientLoggedCircleEntity extends FastSafeParcelableJsonResponse implements zfz {
    public static final Parcelable.Creator CREATOR = new zga();
    private static final HashMap d;
    final Set a;
    final int b;
    String c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("circleId", FastJsonResponse$Field.f("circleId", 2));
    }

    public ClientLoggedCircleEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return d;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ClientLoggedCircleEntity)) {
            return false;
        }
        if (this != obj) {
            ClientLoggedCircleEntity clientLoggedCircleEntity = (ClientLoggedCircleEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!clientLoggedCircleEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(clientLoggedCircleEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (clientLoggedCircleEntity.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
            if (a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.c = str2;
            this.a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a String.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.c, true);
        }
        ivx.b(parcel, a2);
    }

    public ClientLoggedCircleEntity(Set set, int i, String str) {
        this.a = set;
        this.b = i;
        this.c = str;
    }

    public ClientLoggedCircleEntity(Set set, String str) {
        this.a = set;
        this.b = 1;
        this.c = str;
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
