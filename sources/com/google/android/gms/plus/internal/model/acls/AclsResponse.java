package com.google.android.gms.plus.internal.model.acls;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AclsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ywn();
    public final int a;
    public final String b;
    public final String c;
    public final AppAclsEntity d;

    public AclsResponse(int i, String str, String str2, AppAclsEntity appAclsEntity) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = appAclsEntity;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AclsResponse) {
            AclsResponse aclsResponse = (AclsResponse) obj;
            if (this.a != aclsResponse.a || !ius.a(this.c, aclsResponse.c) || !ius.a(this.d, aclsResponse.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.c, this.d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        ivx.a(parcel, 2, this.c, false);
        ivx.a(parcel, 3, this.d, i, false);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }
}
