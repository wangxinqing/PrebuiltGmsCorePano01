package com.google.android.gms.common.people.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AudienceMember extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new iwy();
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    @Deprecated
    public final Bundle h;

    public AudienceMember(int i, int i2, int i3, String str, String str2, String str3, String str4, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = bundle == null ? new Bundle() : bundle;
    }

    public static AudienceMember a(String str, String str2) {
        return b(ycm.h(str), str2, (String) null);
    }

    public static AudienceMember b(String str, String str2) {
        return new AudienceMember(1, -1, str, (String) null, str2, (String) null);
    }

    public static AudienceMember c(String str, String str2) {
        Integer num = (Integer) ycm.a.get(str);
        if (num == null) {
            num = (Integer) ycm.a.get((Object) null);
        }
        return new AudienceMember(1, num.intValue(), str, (String) null, str2, (String) null);
    }

    public final boolean a() {
        return this.b == 1 && this.c == -1;
    }

    public final boolean b() {
        return this.b == 1 && this.c != -1;
    }

    public final boolean c() {
        return this.b == 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudienceMember) {
            AudienceMember audienceMember = (AudienceMember) obj;
            if (this.a == audienceMember.a && this.b == audienceMember.b && this.c == audienceMember.c && ius.a(this.d, audienceMember.d) && ius.a(this.e, audienceMember.e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        if (c()) {
            return String.format("Person [%s] %s", new Object[]{this.e, this.f});
        } else if (a()) {
            return String.format("Circle [%s] %s", new Object[]{this.d, this.f});
        } else {
            return String.format("Group [%s] %s", new Object[]{this.d, this.f});
        }
    }

    public static AudienceMember b(String str, String str2, String str3) {
        return new AudienceMember(2, 0, (String) null, str, str2, str3);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.b);
        ivx.b(parcel, 2, this.c);
        ivx.a(parcel, 3, this.d, false);
        ivx.a(parcel, 4, this.e, false);
        ivx.a(parcel, 5, this.f, false);
        ivx.a(parcel, 6, this.g, false);
        ivx.a(parcel, 7, this.h, false);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }

    private AudienceMember(int i, int i2, String str, String str2, String str3, String str4) {
        this(1, i, i2, str, str2, str3, str4, (Bundle) null);
    }

    public static AudienceMember a(String str, String str2, String str3) {
        iva.a(str, (Object) "Person ID must not be empty.");
        return b(ycm.f(str), str2, str3);
    }
}
