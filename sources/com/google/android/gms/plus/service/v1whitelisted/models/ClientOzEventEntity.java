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
public final class ClientOzEventEntity extends FastSafeParcelableJsonResponse implements ilq {
    public static final Parcelable.Creator CREATOR = new zgl();
    private static final HashMap f;
    final Set a;
    final int b;
    ClientActionDataEntity c;
    public long d;
    OzEventEntity e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("actionData", FastJsonResponse$Field.a("actionData", 2, ClientActionDataEntity.class));
        f.put("clientTimeMsec", FastJsonResponse$Field.b("clientTimeMsec", 3));
        f.put("ozEvent", FastJsonResponse$Field.a("ozEvent", 5, OzEventEntity.class));
    }

    public ClientOzEventEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return f;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return Long.valueOf(this.d);
        }
        if (i == 5) {
            return this.e;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ClientOzEventEntity)) {
            return false;
        }
        if (this != obj) {
            ClientOzEventEntity clientOzEventEntity = (ClientOzEventEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!clientOzEventEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(clientOzEventEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (clientOzEventEntity.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
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
        sb.append(" is not known to be a long.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.c, i, true);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.d);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.e, i, true);
        }
        ivx.b(parcel, a2);
    }

    public ClientOzEventEntity(Set set, int i, ClientActionDataEntity clientActionDataEntity, long j, OzEventEntity ozEventEntity) {
        this.a = set;
        this.b = i;
        this.c = clientActionDataEntity;
        this.d = j;
        this.e = ozEventEntity;
    }

    public ClientOzEventEntity(Set set, ClientActionDataEntity clientActionDataEntity, long j, OzEventEntity ozEventEntity) {
        this.a = set;
        this.b = 1;
        this.c = clientActionDataEntity;
        this.d = j;
        this.e = ozEventEntity;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.c = (ClientActionDataEntity) jag;
        } else if (i == 5) {
            this.e = (OzEventEntity) jag;
        } else {
            String canonicalName = jag.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
