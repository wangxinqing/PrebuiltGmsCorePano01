package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DriveSpace extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new jzm();
    public static final DriveSpace a = new DriveSpace("DRIVE");
    public static final DriveSpace b = new DriveSpace("APP_DATA_FOLDER");
    public static final DriveSpace c;
    public static final Set d;
    public static final String e;
    private static final Pattern g = Pattern.compile("[A-Z0-9_]*");
    public final String f;

    static {
        DriveSpace driveSpace = new DriveSpace("PHOTOS");
        c = driveSpace;
        Set a2 = jir.a((Object) a, (Object) b, (Object) driveSpace);
        d = a2;
        e = TextUtils.join(",", a2.toArray());
    }

    public DriveSpace(String str) {
        iva.a((Object) str);
        this.f = str;
    }

    public static DriveSpace a(String str) {
        if (!g.matcher(str).matches()) {
            str = str.replaceAll("([A-Z])", "_$1").toUpperCase(Locale.US);
        }
        for (DriveSpace driveSpace : d) {
            if (driveSpace.f.equals(str)) {
                return driveSpace;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != DriveSpace.class) {
            return false;
        }
        return this.f.equals(((DriveSpace) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode() ^ 1247068382;
    }

    public final String toString() {
        return this.f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.f, false);
        ivx.b(parcel, a2);
    }
}
