package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.internal.model.acls.AclsResponse;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;

/* renamed from: ywn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ywn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AclsResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        AppAclsEntity appAclsEntity = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                str2 = ivw.q(parcel, readInt);
            } else if (a == 3) {
                appAclsEntity = (AppAclsEntity) ivw.a(parcel, readInt, AppAclsEntity.CREATOR);
            } else if (a != 1000) {
                ivw.b(parcel, readInt);
            } else {
                i = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new AclsResponse(i, str, str2, appAclsEntity);
    }
}
