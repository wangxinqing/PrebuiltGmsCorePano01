package com.google.android.gms.plus.sharebox;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Circle extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new zky();
    public static int a = -1;
    public static Circle b = new Circle("", "", a);
    private static Circle g;
    private static String h = "create_circle";
    public final int c;
    public final String d;
    public final String e;
    public final int f;

    public Circle(int i, String str, String str2, int i2) {
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = i2;
    }

    public static Circle a(Context context) {
        if (g == null) {
            g = new Circle(h, context.getString(R.string.plus_sharebox_circles_create_option), a);
        }
        return g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Circle.class.getSimpleName());
        sb.append("<");
        sb.append(this.e);
        if (this.f > 0) {
            sb.append(" (");
            sb.append(this.f);
            sb.append(") ");
        }
        sb.append(">");
        return sb.toString();
    }

    private Circle(String str, String str2, int i) {
        this(1, str, str2, i);
    }

    public static boolean a(Circle circle) {
        return circle != null && h.equals(circle.d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.d, false);
        ivx.a(parcel, 2, this.e, false);
        ivx.b(parcel, 3, this.f);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.c);
        ivx.b(parcel, a2);
    }
}
