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
public final class LoggedCircleEntity extends FastSafeParcelableJsonResponse implements ilq {
    public static final Parcelable.Creator CREATOR = new zhc();
    private static final HashMap c = new HashMap();
    final Set a;
    final int b;

    public LoggedCircleEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return c;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LoggedCircleEntity)) {
            return false;
        }
        if (this != obj) {
            LoggedCircleEntity loggedCircleEntity = (LoggedCircleEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!loggedCircleEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(loggedCircleEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (loggedCircleEntity.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
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
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        if (this.a.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        ivx.b(parcel, a2);
    }

    public LoggedCircleEntity(Set set, int i) {
        this.a = set;
        this.b = i;
    }
}
