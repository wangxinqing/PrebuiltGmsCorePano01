package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ClientOzExtensionEntity extends FastSafeParcelableJsonResponse implements ilq {
    public static final Parcelable.Creator CREATOR = new zgn();
    private static final HashMap h;
    final Set a;
    final int b;
    String c;
    List d;
    String e;
    String f;
    long g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("callingApplication", FastJsonResponse$Field.f("callingApplication", 2));
        h.put("clientEvent", FastJsonResponse$Field.b("clientEvent", 3, ClientOzEventEntity.class));
        h.put("clientId", FastJsonResponse$Field.f("clientId", 4));
        h.put("clientVersion", FastJsonResponse$Field.f("clientVersion", 5));
        h.put("sendTimeMsec", FastJsonResponse$Field.b("sendTimeMsec", 6));
    }

    public ClientOzExtensionEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return h;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return this.d;
        }
        if (i == 4) {
            return this.e;
        }
        if (i == 5) {
            return this.f;
        }
        if (i == 6) {
            return Long.valueOf(this.g);
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ClientOzExtensionEntity)) {
            return false;
        }
        if (this != obj) {
            ClientOzExtensionEntity clientOzExtensionEntity = (ClientOzExtensionEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!clientOzExtensionEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(clientOzExtensionEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (clientOzExtensionEntity.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
            if (a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public ClientOzExtensionEntity(Set set, int i, String str, List list, String str2, String str3, long j) {
        this.a = set;
        this.b = i;
        this.c = str;
        this.d = list;
        this.e = str2;
        this.f = str3;
        this.g = j;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i == 6) {
            this.g = j;
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
            ivx.a(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            ivx.c(parcel, 3, this.d, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.f, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.g);
        }
        ivx.b(parcel, a2);
    }

    public ClientOzExtensionEntity(Set set, String str, List list, String str2, String str3, long j) {
        this.a = set;
        this.b = 1;
        this.c = str;
        this.d = list;
        this.e = str2;
        this.f = str3;
        this.g = j;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.c = str2;
        } else if (i == 4) {
            this.e = str2;
        } else if (i == 5) {
            this.f = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i));
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.d = arrayList;
            this.a.add(Integer.valueOf(i));
            return;
        }
        String canonicalName = arrayList.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not a known array of custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
