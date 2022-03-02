package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchAppCorpusFeatures;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;

/* renamed from: dsv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dsv implements Parcelable.Creator {
    public static void a(GlobalSearchApplication globalSearchApplication, Parcel parcel, int i) {
        int a = ivx.a(parcel);
        ivx.a(parcel, 1, globalSearchApplication.a, i, false);
        ivx.a(parcel, 2, (Parcelable[]) globalSearchApplication.b, i);
        ivx.a(parcel, 3, globalSearchApplication.c);
        ivx.b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        GlobalSearchApplicationInfo globalSearchApplicationInfo = null;
        GlobalSearchAppCorpusFeatures[] globalSearchAppCorpusFeaturesArr = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                globalSearchApplicationInfo = (GlobalSearchApplicationInfo) ivw.a(parcel, readInt, GlobalSearchApplicationInfo.CREATOR);
            } else if (a == 2) {
                globalSearchAppCorpusFeaturesArr = (GlobalSearchAppCorpusFeatures[]) ivw.b(parcel, readInt, GlobalSearchAppCorpusFeatures.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                z = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new GlobalSearchApplication(globalSearchApplicationInfo, globalSearchAppCorpusFeaturesArr, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GlobalSearchApplication[i];
    }
}
