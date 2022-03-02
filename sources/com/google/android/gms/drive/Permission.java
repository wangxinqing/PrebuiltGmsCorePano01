package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Permission extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jzw();
    public String a;
    public String b;
    public boolean c;
    private String d;
    private int e;
    private int f;

    public Permission(String str, int i, String str2, String str3, int i2, boolean z) {
        this.d = str;
        this.e = i;
        this.a = str2;
        this.b = str3;
        this.f = i2;
        this.c = z;
    }

    public static boolean a(int i) {
        switch (i) {
            case PSKKeyManager.MAX_KEY_LENGTH_BYTES /*256*/:
            case 257:
            case 258:
                return true;
            default:
                return false;
        }
    }

    public static boolean b(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    public final int c() {
        if (b(this.f)) {
            return this.f;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Permission permission = (Permission) obj;
        return ius.a(this.d, permission.d) && this.e == permission.e && this.f == permission.f && this.c == permission.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, Integer.valueOf(this.e), Integer.valueOf(this.f), Boolean.valueOf(this.c)});
    }

    public final String a() {
        if (a(this.e)) {
            return this.d;
        }
        return null;
    }

    public final int b() {
        if (a(this.e)) {
            return this.e;
        }
        return -1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, a(), false);
        ivx.b(parcel, 3, b());
        ivx.a(parcel, 4, this.a, false);
        ivx.a(parcel, 5, this.b, false);
        ivx.b(parcel, 6, c());
        ivx.a(parcel, 7, this.c);
        ivx.b(parcel, a2);
    }
}
