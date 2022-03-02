package com.google.android.gms.feedback;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ThemeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new mxv();
    public int a;
    public int b;

    public ThemeSettings() {
        this(3, 0);
    }

    public ThemeSettings(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static int a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return a(context, "android:colorPrimary");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }

    public static int a(Context context, String str) {
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{context.getResources().getIdentifier(str, "attr", context.getPackageName())});
        try {
            i = obtainStyledAttributes.getColor(0, 0);
        } catch (Exception e) {
            String valueOf = String.valueOf(context);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + str.length());
            sb.append("Could not get theme color for [context: ");
            sb.append(valueOf);
            sb.append(", attr: ");
            sb.append(str);
            Log.w("ThemeSettings", sb.toString());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
        obtainStyledAttributes.recycle();
        return i;
    }
}
