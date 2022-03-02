package com.google.android.gms.plus.internal.model.apps;

import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ApplicationEntity extends AbstractSafeParcelable implements ReflectedParcelable, yxi {
    public static final Parcelable.Creator CREATOR = new ywr();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final ApplicationInfo e;
    public final AppAclsEntity f;
    public final boolean g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final String l;

    public ApplicationEntity(int i2, String str, String str2, String str3, ApplicationInfo applicationInfo, AppAclsEntity appAclsEntity, boolean z, String str4, String str5, boolean z2, boolean z3, String str6) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = applicationInfo;
        this.f = appAclsEntity;
        this.g = z;
        this.h = str4;
        this.i = str5;
        this.j = z2;
        this.k = z3;
        this.l = str6;
    }

    public static ApplicationEntity a(yxi yxi) {
        if (yxi == null) {
            return null;
        }
        if (yxi instanceof ApplicationEntity) {
            return (ApplicationEntity) yxi;
        }
        return new ApplicationEntity(yxi.a(), yxi.b(), yxi.c(), yxi.d(), yxi.e(), yxi.g(), yxi.h(), yxi.j(), yxi.f(), yxi.i());
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final ApplicationInfo d() {
        return this.e;
    }

    public final boolean e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ApplicationEntity) {
            ApplicationEntity applicationEntity = (ApplicationEntity) obj;
            if (this.a != applicationEntity.a || !ius.a(this.b, applicationEntity.b) || !ius.a(this.c, applicationEntity.c) || !ius.a(this.d, applicationEntity.d) || !ius.a(this.f, applicationEntity.f) || this.g != applicationEntity.g || this.k != applicationEntity.k || !ius.a(this.h, applicationEntity.h) || !ius.a(this.i, applicationEntity.i) || !ius.a(this.l, applicationEntity.l)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.k;
    }

    public final String g() {
        return this.h;
    }

    public final String h() {
        return this.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.f, Boolean.valueOf(this.g), this.h, this.i, Boolean.valueOf(this.k), this.l});
    }

    public final String i() {
        return this.l;
    }

    public final boolean j() {
        return this.j;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public ApplicationEntity(String str, String str2, String str3) {
        this(3, str, str2, str3, (ApplicationInfo) null, (AppAclsEntity) null, true, (String) null, (String) null, false, false, (String) null);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        ivx.a(parcel, 2, this.c, false);
        ivx.a(parcel, 3, this.d, false);
        ivx.a(parcel, 4, this.e, i2, false);
        ivx.a(parcel, 5, this.f, i2, false);
        ivx.a(parcel, 6, this.g);
        ivx.a(parcel, 7, this.h, false);
        ivx.a(parcel, 8, this.i, false);
        ivx.a(parcel, 9, this.j);
        ivx.a(parcel, 10, this.k);
        ivx.a(parcel, 11, this.l, false);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }

    public ApplicationEntity(String str, String str2, String str3, ApplicationInfo applicationInfo, boolean z, String str4, String str5, boolean z2, boolean z3, String str6) {
        this(3, str, str2, str3, applicationInfo, (AppAclsEntity) null, z, str4, str5, z2, z3, str6);
    }
}
