package com.google.android.gms.plus.internal.model.apps;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.people.data.Audience;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppAclsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ywp();
    public final int a;
    public final String b;
    public final Audience c;
    public final ArrayList d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final String j;
    public final String k;

    public AppAclsEntity(int i2, String str, Audience audience, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, int i3, String str2, String str3) {
        this.a = i2;
        this.b = str;
        this.c = audience;
        this.d = arrayList;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = i3;
        this.j = str2;
        this.k = str3;
    }

    public final boolean a() {
        return this.e || this.d != null || this.f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AppAclsEntity) {
            AppAclsEntity appAclsEntity = (AppAclsEntity) obj;
            if (this.a == appAclsEntity.a && ius.a(this.b, appAclsEntity.b) && ius.a(this.c, appAclsEntity.c) && ius.a(this.d, appAclsEntity.d) && this.e == appAclsEntity.e && this.f == appAclsEntity.f && this.g == appAclsEntity.g && this.h == appAclsEntity.h && this.i == appAclsEntity.i && ius.a(this.j, appAclsEntity.j) && ius.a(this.k, appAclsEntity.k)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        ivx.a(parcel, 2, this.c, i2, false);
        ivx.c(parcel, 3, this.d, false);
        ivx.a(parcel, 4, this.e);
        ivx.a(parcel, 5, this.f);
        ivx.a(parcel, 6, this.g);
        ivx.a(parcel, 7, this.h);
        ivx.b(parcel, 8, this.i);
        ivx.a(parcel, 9, this.j, false);
        ivx.a(parcel, 10, this.k, false);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }
}
