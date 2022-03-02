package com.google.android.gms.plus.model.posts;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Comment extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yxn();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public Comment(int i, String str, String str2, String str3, String str4, String str5) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Comment) {
            Comment comment = (Comment) obj;
            if (this.a != comment.a || !ius.a(this.c, comment.c) || !ius.a(this.d, comment.d) || !ius.a(this.e, comment.e) || !ius.a(this.f, comment.f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.c, this.d, this.e, this.f});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        ivx.a(parcel, 2, this.c, false);
        ivx.a(parcel, 3, this.d, false);
        ivx.a(parcel, 4, this.e, false);
        ivx.a(parcel, 5, this.f, false);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }
}
