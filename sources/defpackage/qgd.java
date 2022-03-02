package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo;
import com.google.android.gms.instantapps.internal.Route;
import org.chromium.net.UrlRequest;

/* renamed from: qgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qgd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new InstantAppPreLaunchInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        Intent intent = null;
        Intent intent2 = null;
        AppInfo appInfo = null;
        Route route = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        byte[] bArr2 = null;
        Bundle bundle = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 3:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 5:
                    intent = (Intent) ivw.a(parcel2, readInt, Intent.CREATOR);
                    break;
                case 6:
                    intent2 = (Intent) ivw.a(parcel2, readInt, Intent.CREATOR);
                    break;
                case 8:
                    appInfo = (AppInfo) ivw.a(parcel2, readInt, AppInfo.CREATOR);
                    break;
                case 9:
                    route = (Route) ivw.a(parcel2, readInt, Route.CREATOR);
                    break;
                case 10:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 11:
                    bArr = ivw.t(parcel2, readInt);
                    break;
                case 12:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case 16:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 17:
                    bArr2 = ivw.t(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new InstantAppPreLaunchInfo(i, str, z, intent, intent2, appInfo, route, z2, bArr, str2, i2, i3, str3, bArr2, bundle);
    }
}
