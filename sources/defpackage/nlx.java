package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.appcontent.AppContentActionEntity;
import com.google.android.gms.games.appcontent.AppContentAnnotationEntity;
import com.google.android.gms.games.appcontent.AppContentCardEntity;
import com.google.android.gms.games.appcontent.AppContentSectionEntity;
import java.util.ArrayList;

/* renamed from: nlx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nlx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppContentSectionEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                arrayList = ivw.c(parcel, readInt, AppContentActionEntity.CREATOR);
            } else if (a != 14) {
                switch (a) {
                    case 3:
                        arrayList2 = ivw.c(parcel, readInt, AppContentCardEntity.CREATOR);
                        break;
                    case 4:
                        str = ivw.q(parcel, readInt);
                        break;
                    case 5:
                        bundle = ivw.s(parcel, readInt);
                        break;
                    case 6:
                        str2 = ivw.q(parcel, readInt);
                        break;
                    case 7:
                        str3 = ivw.q(parcel, readInt);
                        break;
                    case 8:
                        str4 = ivw.q(parcel, readInt);
                        break;
                    case 9:
                        str5 = ivw.q(parcel, readInt);
                        break;
                    case 10:
                        str6 = ivw.q(parcel, readInt);
                        break;
                    default:
                        ivw.b(parcel, readInt);
                        break;
                }
            } else {
                arrayList3 = ivw.c(parcel, readInt, AppContentAnnotationEntity.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new AppContentSectionEntity(arrayList, arrayList2, str, bundle, str2, str3, str4, str5, str6, arrayList3);
    }
}
