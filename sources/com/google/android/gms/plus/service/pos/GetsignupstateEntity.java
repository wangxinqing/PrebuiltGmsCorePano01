package com.google.android.gms.plus.service.pos;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GetsignupstateEntity extends FastSafeParcelableJsonResponse implements ilq {
    public static final Parcelable.Creator CREATOR = new zcm();
    private static final HashMap g;
    public final Set a;
    public final int b;
    public String c;
    public String d;
    public String e;
    public boolean f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("display_name", FastJsonResponse$Field.f("display_name", 2));
        g.put("email", FastJsonResponse$Field.f("email", 3));
        g.put("profile_image_url", FastJsonResponse$Field.f("profile_image_url", 5));
        g.put("signedUp", FastJsonResponse$Field.e("signedUp", 6));
    }

    public GetsignupstateEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return g;
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
        if (i == 5) {
            return this.e;
        }
        if (i == 6) {
            return Boolean.valueOf(this.f);
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetsignupstateEntity)) {
            return false;
        }
        if (this != obj) {
            GetsignupstateEntity getsignupstateEntity = (GetsignupstateEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!getsignupstateEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(getsignupstateEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (getsignupstateEntity.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
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
        } else if (i == 3) {
            this.d = str2;
        } else if (i == 5) {
            this.e = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i));
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
            ivx.a(parcel, 3, this.d, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.f);
        }
        ivx.b(parcel, a2);
    }

    public GetsignupstateEntity(Set set, int i, String str, String str2, String str3, boolean z) {
        this.a = set;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i == 6) {
            this.f = z;
            this.a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a boolean.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
