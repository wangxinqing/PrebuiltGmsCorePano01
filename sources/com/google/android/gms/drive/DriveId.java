package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DriveId extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new jzi();
    public final String a;
    public final long b;
    public final long c;
    public final int d;
    private volatile String e = null;
    private volatile String f = null;

    public DriveId(String str, long j, long j2, int i) {
        this.a = str;
        boolean z = true;
        iva.b(!"".equals(str));
        if (str == null && j == -1) {
            z = false;
        }
        iva.b(z);
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    public static DriveId a(String str) {
        iva.a((Object) str);
        return new DriveId(str, -1, -1, -1);
    }

    public static DriveId b(String str) {
        String str2;
        boolean startsWith = str.startsWith("DriveId:");
        String valueOf = String.valueOf(str);
        iva.b(startsWith, valueOf.length() == 0 ? new String("Invalid DriveId: ") : "Invalid DriveId: ".concat(valueOf));
        try {
            kwo kwo = (kwo) aucj.a((aucj) kwo.g, Base64.decode(str.substring(8), 10), aubs.c());
            if (!"".equals(kwo.c)) {
                str2 = kwo.c;
            } else {
                str2 = null;
            }
            return new DriveId(str2, kwo.d, kwo.e, kwo.f);
        } catch (auda e2) {
            throw new IllegalArgumentException();
        }
    }

    public final kvp c() {
        int i = this.d;
        if (i == 1) {
            return b();
        }
        if (i != 0) {
            return new kvp(this);
        }
        return new kvp(this);
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj != null && obj.getClass() == DriveId.class) {
            DriveId driveId = (DriveId) obj;
            if (driveId.c == this.c) {
                long j = driveId.b;
                if (j == -1 && this.b == -1) {
                    return driveId.a.equals(this.a);
                }
                String str2 = this.a;
                if (str2 == null || (str = driveId.a) == null) {
                    if (j == this.b) {
                        return true;
                    }
                    return false;
                } else if (j != this.b || !str.equals(str2)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.b == -1) {
            return this.a.hashCode();
        }
        String valueOf = String.valueOf(String.valueOf(this.c));
        String valueOf2 = String.valueOf(String.valueOf(this.b));
        return (valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2)).hashCode();
    }

    public final String toString() {
        return a();
    }

    public final String a() {
        if (this.e == null) {
            aucd o = kwo.g.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            kwo kwo = (kwo) o.b;
            int i = kwo.a | 1;
            kwo.a = i;
            kwo.b = 1;
            String str = this.a;
            if (str == null) {
                str = "";
            }
            str.getClass();
            int i2 = i | 2;
            kwo.a = i2;
            kwo.c = str;
            long j = this.b;
            int i3 = i2 | 4;
            kwo.a = i3;
            kwo.d = j;
            long j2 = this.c;
            int i4 = i3 | 8;
            kwo.a = i4;
            kwo.e = j2;
            int i5 = this.d;
            kwo.a = i4 | 16;
            kwo.f = i5;
            String valueOf = String.valueOf(Base64.encodeToString(((kwo) o.i()).k(), 10));
            this.e = valueOf.length() == 0 ? new String("DriveId:") : "DriveId:".concat(valueOf);
        }
        return this.e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c);
        ivx.b(parcel, 5, this.d);
        ivx.b(parcel, a2);
    }

    public final kvp b() {
        if (this.d != 0) {
            return new kvp(this);
        }
        throw new IllegalStateException("This DriveId corresponds to a file. Call asDriveFile instead.");
    }
}
