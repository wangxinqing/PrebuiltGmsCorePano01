package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;
import java.util.ArrayList;

/* renamed from: ywp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ywp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppAclsEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        Audience audience = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        str = ivw.q(parcel2, readInt);
                        break;
                    case 2:
                        audience = (Audience) ivw.a(parcel2, readInt, Audience.CREATOR);
                        break;
                    case 3:
                        arrayList = ivw.c(parcel2, readInt, AudienceMember.CREATOR);
                        break;
                    case 4:
                        z = ivw.c(parcel2, readInt);
                        break;
                    case 5:
                        z2 = ivw.c(parcel2, readInt);
                        break;
                    case 6:
                        z3 = ivw.c(parcel2, readInt);
                        break;
                    case 7:
                        z4 = ivw.c(parcel2, readInt);
                        break;
                    case 8:
                        i2 = ivw.g(parcel2, readInt);
                        break;
                    case 9:
                        str2 = ivw.q(parcel2, readInt);
                        break;
                    case 10:
                        str3 = ivw.q(parcel2, readInt);
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
        return new AppAclsEntity(i, str, audience, arrayList, z, z2, z3, z4, i2, str2, str3);
    }
}
