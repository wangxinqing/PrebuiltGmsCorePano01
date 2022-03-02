package defpackage;

import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;

/* renamed from: ywr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ywr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ApplicationEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ApplicationInfo applicationInfo = null;
        AppAclsEntity appAclsEntity = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        str = ivw.q(parcel2, readInt);
                        break;
                    case 2:
                        str2 = ivw.q(parcel2, readInt);
                        break;
                    case 3:
                        str3 = ivw.q(parcel2, readInt);
                        break;
                    case 4:
                        applicationInfo = (ApplicationInfo) ivw.a(parcel2, readInt, ApplicationInfo.CREATOR);
                        break;
                    case 5:
                        appAclsEntity = (AppAclsEntity) ivw.a(parcel2, readInt, AppAclsEntity.CREATOR);
                        break;
                    case 6:
                        z = ivw.c(parcel2, readInt);
                        break;
                    case 7:
                        str4 = ivw.q(parcel2, readInt);
                        break;
                    case 8:
                        str5 = ivw.q(parcel2, readInt);
                        break;
                    case 9:
                        z2 = ivw.c(parcel2, readInt);
                        break;
                    case 10:
                        z3 = ivw.c(parcel2, readInt);
                        break;
                    case 11:
                        str6 = ivw.q(parcel2, readInt);
                        break;
                    default:
                        ivw.b(parcel2, readInt);
                        break;
                }
            } else {
                i = ivw.g(parcel2, readInt);
            }
        }
        ivw.E(parcel2, b);
        return new ApplicationEntity(i, str, str2, str3, applicationInfo, appAclsEntity, z, str4, str5, z2, z3, str6);
    }
}
