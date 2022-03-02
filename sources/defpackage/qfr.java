package defpackage;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.instantapps.internal.AtomInfo;
import com.google.android.gms.instantapps.internal.Route;
import com.google.android.gms.instantapps.internal.SharedLibInfo;
import java.util.ArrayList;

/* renamed from: qfr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qfr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        byte[] bArr = null;
        PackageInfo packageInfo = null;
        byte[] bArr2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel, readInt);
                    break;
                case 3:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 5:
                    arrayList = ivw.c(parcel, readInt, Route.CREATOR);
                    break;
                case 6:
                    arrayList2 = ivw.c(parcel, readInt, AtomInfo.CREATOR);
                    break;
                case 7:
                    i = ivw.g(parcel, readInt);
                    break;
                case 8:
                    bArr = ivw.t(parcel, readInt);
                    break;
                case 9:
                    packageInfo = (PackageInfo) ivw.a(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 11:
                    arrayList3 = ivw.c(parcel, readInt, SharedLibInfo.CREATOR);
                    break;
                case 12:
                    bArr2 = ivw.t(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new AppInfo(str, str2, arrayList, arrayList2, arrayList3, i, bArr, packageInfo, bArr2);
    }
}
