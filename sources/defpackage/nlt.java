package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.appcontent.AppContentActionEntity;
import com.google.android.gms.games.appcontent.AppContentAnnotationEntity;
import com.google.android.gms.games.appcontent.AppContentConditionEntity;
import java.util.ArrayList;

/* renamed from: nlt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nlt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppContentActionEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        AppContentAnnotationEntity appContentAnnotationEntity = null;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    arrayList = ivw.c(parcel, readInt, AppContentConditionEntity.CREATOR);
                    break;
                case 2:
                    str = ivw.q(parcel, readInt);
                    break;
                case 3:
                    bundle = ivw.s(parcel, readInt);
                    break;
                case 6:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 7:
                    str3 = ivw.q(parcel, readInt);
                    break;
                case 8:
                    appContentAnnotationEntity = (AppContentAnnotationEntity) ivw.a(parcel, readInt, AppContentAnnotationEntity.CREATOR);
                    break;
                case 9:
                    str4 = ivw.q(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new AppContentActionEntity(arrayList, str, bundle, str2, str3, appContentAnnotationEntity, str4);
    }
}
