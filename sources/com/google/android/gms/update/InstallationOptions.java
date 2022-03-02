package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InstallationOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adip();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public InstallationOptions(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InstallationOptions) {
            InstallationOptions installationOptions = (InstallationOptions) obj;
            if (this.a == installationOptions.a && this.b == installationOptions.b && this.c == installationOptions.c && this.d == installationOptions.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("ignoreDeviceIdleCondition", Boolean.valueOf(this.a));
        a2.a("ignoreMaintenanceWindow", Boolean.valueOf(this.b));
        a2.a("ignoreServerPostponeAbInstallationConfig", Boolean.valueOf(this.c));
        a2.a("ignoreOptionalPostInstall", Boolean.valueOf(this.d));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.b(parcel, a2);
    }
}
