package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ConnectionOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tio();
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public byte[] i;
    public boolean j;

    public ConnectionOptions() {
        this.a = false;
        this.b = true;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = true;
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectionOptions) {
            ConnectionOptions connectionOptions = (ConnectionOptions) obj;
            return ius.a(Boolean.valueOf(this.a), Boolean.valueOf(connectionOptions.a)) && ius.a(Boolean.valueOf(this.b), Boolean.valueOf(connectionOptions.b)) && ius.a(Boolean.valueOf(this.c), Boolean.valueOf(connectionOptions.c)) && ius.a(Boolean.valueOf(this.d), Boolean.valueOf(connectionOptions.d)) && ius.a(Boolean.valueOf(this.e), Boolean.valueOf(connectionOptions.e)) && ius.a(Boolean.valueOf(this.f), Boolean.valueOf(connectionOptions.f)) && ius.a(Boolean.valueOf(this.g), Boolean.valueOf(connectionOptions.g)) && ius.a(Boolean.valueOf(this.h), Boolean.valueOf(connectionOptions.h)) && Arrays.equals(this.i, connectionOptions.i) && ius.a(Boolean.valueOf(this.j), Boolean.valueOf(connectionOptions.j));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Integer.valueOf(Arrays.hashCode(this.i)), Boolean.valueOf(this.j)});
    }

    public ConnectionOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, byte[] bArr, boolean z9) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = bArr;
        this.j = z9;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h);
        ivx.a(parcel, 9, this.i, false);
        ivx.a(parcel, 10, this.j);
        ivx.b(parcel, a2);
    }
}
