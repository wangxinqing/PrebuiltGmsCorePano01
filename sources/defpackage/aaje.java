package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource;

/* renamed from: aaje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaje implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetGlobalSearchSourcesCall$GlobalSearchSource[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        GetGlobalSearchSourcesCall$CorpusInfo[] getGlobalSearchSourcesCall$CorpusInfoArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel, readInt);
                    break;
                case 2:
                    i = ivw.g(parcel, readInt);
                    break;
                case 3:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 4:
                    i3 = ivw.g(parcel, readInt);
                    break;
                case 5:
                    str3 = ivw.q(parcel, readInt);
                    break;
                case 6:
                    str4 = ivw.q(parcel, readInt);
                    break;
                case 7:
                    str5 = ivw.q(parcel, readInt);
                    break;
                case 8:
                    getGlobalSearchSourcesCall$CorpusInfoArr = (GetGlobalSearchSourcesCall$CorpusInfo[]) ivw.b(parcel, readInt, GetGlobalSearchSourcesCall$CorpusInfo.CREATOR);
                    break;
                case 9:
                    z = ivw.c(parcel, readInt);
                    break;
                case 10:
                    str2 = ivw.q(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new GetGlobalSearchSourcesCall$GlobalSearchSource(str, str2, i, i2, i3, str3, str4, str5, getGlobalSearchSourcesCall$CorpusInfoArr, z);
    }
}
