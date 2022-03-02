package com.google.android.gms.smartdevice.directtransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DirectTransferConfigurations extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acem();
    public String a;
    public String b;
    public String c;

    public DirectTransferConfigurations() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DirectTransferConfigurations) {
            DirectTransferConfigurations directTransferConfigurations = (DirectTransferConfigurations) obj;
            if (this.a.equals(directTransferConfigurations.a) && this.b.equals(directTransferConfigurations.b)) {
                String str = this.c;
                if (str.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public DirectTransferConfigurations(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
