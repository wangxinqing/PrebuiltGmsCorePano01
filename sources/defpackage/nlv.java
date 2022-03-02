package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.appcontent.AppContentActionEntity;
import com.google.android.gms.games.appcontent.AppContentAnnotationEntity;
import com.google.android.gms.games.appcontent.AppContentCardEntity;
import com.google.android.gms.games.appcontent.AppContentConditionEntity;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: nlv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nlv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppContentCardEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    arrayList = ivw.c(parcel2, readInt, AppContentActionEntity.CREATOR);
                    break;
                case 2:
                    arrayList2 = ivw.c(parcel2, readInt, AppContentAnnotationEntity.CREATOR);
                    break;
                case 3:
                    arrayList3 = ivw.c(parcel2, readInt, AppContentConditionEntity.CREATOR);
                    break;
                case 4:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 6:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case 10:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 11:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 12:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    str6 = ivw.q(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new AppContentCardEntity(arrayList, arrayList2, arrayList3, str, i, str2, bundle, str3, str4, i2, str5, str6);
    }
}
