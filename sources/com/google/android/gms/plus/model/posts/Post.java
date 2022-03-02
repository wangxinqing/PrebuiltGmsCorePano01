package com.google.android.gms.plus.model.posts;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.people.data.Audience;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Post extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yxp();
    public final int a;
    public final String b;
    public final List c;
    public final Uri d;
    public final String e;
    public final String f;
    public final String g;
    public final Bundle h;
    public final Bundle i;
    public final String j;
    public final String k;
    public final Audience l;
    private final Boolean m;

    public Post(int i2, String str, List list, Uri uri, String str2, String str3, String str4, Bundle bundle, Bundle bundle2, String str5, boolean z, String str6, Audience audience) {
        this.a = i2;
        this.b = str;
        this.c = list;
        this.d = uri;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = bundle;
        this.i = bundle2;
        this.j = str5;
        this.m = Boolean.valueOf(z);
        this.k = str6;
        this.l = audience;
    }

    public final boolean a() {
        Uri uri = this.d;
        return uri != null && !TextUtils.isEmpty(uri.toString());
    }

    public final boolean b() {
        return !TextUtils.isEmpty(this.e);
    }

    public final boolean c() {
        Bundle bundle = this.h;
        return bundle != null && !bundle.isEmpty();
    }

    public final boolean d() {
        return this.m.booleanValue();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof Post) {
            Post post = (Post) obj;
            if (this.a == post.a && ius.a(this.l, post.l) && ius.a(this.c, post.c) && ius.a(this.d, post.d) && ius.a(this.e, post.e) && ius.a(this.f, post.f) && ius.a(this.g, post.g) && ius.a(this.j, post.j)) {
                Boolean bool = this.m;
                if (!post.m.booleanValue() || !ius.a(this.k, post.k)) {
                    z = false;
                } else {
                    z = true;
                }
                if (ius.a(bool, Boolean.valueOf(z))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.l, this.c, this.d, this.e, this.f, this.g, this.j, this.m, this.k});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        ivx.c(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, i2, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g, false);
        ivx.a(parcel, 8, this.h, false);
        ivx.a(parcel, 9, this.i, false);
        ivx.a(parcel, 10, this.j, false);
        ivx.a(parcel, 11, Boolean.valueOf(d()));
        ivx.a(parcel, 12, this.k, false);
        ivx.a(parcel, 13, this.l, i2, false);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }

    public Post(String str, List list, Uri uri, String str2, String str3, String str4, Bundle bundle, Bundle bundle2, String str5, Boolean bool, String str6, Audience audience) {
        this(1, str, list, uri, str2, str3, str4, bundle, bundle2, str5, bool.booleanValue(), str6, audience);
    }
}
