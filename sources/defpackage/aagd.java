package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import com.google.android.gms.search.administration.CorpusConfigParcelable;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;

/* renamed from: aagd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aagd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetAppIndexingPackageDetailsCall$Response[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Status status = null;
        CorpusConfigParcelable[] corpusConfigParcelableArr = null;
        AppIndexingErrorInfo[] appIndexingErrorInfoArr = null;
        AppIndexingUserActionInfo[] appIndexingUserActionInfoArr = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    status = (Status) ivw.a(parcel, readInt, Status.CREATOR);
                    break;
                case 2:
                    corpusConfigParcelableArr = (CorpusConfigParcelable[]) ivw.b(parcel, readInt, CorpusConfigParcelable.CREATOR);
                    break;
                case 3:
                    j = ivw.i(parcel, readInt);
                    break;
                case 4:
                    appIndexingErrorInfoArr = (AppIndexingErrorInfo[]) ivw.b(parcel, readInt, AppIndexingErrorInfo.CREATOR);
                    break;
                case 5:
                    appIndexingUserActionInfoArr = (AppIndexingUserActionInfo[]) ivw.b(parcel, readInt, AppIndexingUserActionInfo.CREATOR);
                    break;
                case 6:
                    z = ivw.c(parcel, readInt);
                    break;
                case 7:
                    z2 = ivw.c(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new GetAppIndexingPackageDetailsCall$Response(status, corpusConfigParcelableArr, j, appIndexingErrorInfoArr, appIndexingUserActionInfoArr, z, z2);
    }
}
