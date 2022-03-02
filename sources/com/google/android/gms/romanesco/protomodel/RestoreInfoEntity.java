package com.google.android.gms.romanesco.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RestoreInfoEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zwd();
    public final String a;
    public final Long b;

    public RestoreInfoEntity(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RestoreInfoEntity)) {
            return false;
        }
        RestoreInfoEntity restoreInfoEntity = (RestoreInfoEntity) obj;
        if (this == restoreInfoEntity) {
            return true;
        }
        if (!ius.a(restoreInfoEntity.a, this.a) || !ius.a(restoreInfoEntity.b, this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
