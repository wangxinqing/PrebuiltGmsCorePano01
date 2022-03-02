package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: sov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sov implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppMetadata[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str8 = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 7:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 8:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case 9:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 10:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 11:
                    j6 = ivw.i(parcel2, readInt);
                    break;
                case 12:
                    str6 = ivw.q(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    j3 = ivw.i(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    j4 = ivw.i(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 16:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 17:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case 18:
                    z5 = ivw.c(parcel2, readInt);
                    break;
                case 19:
                    str7 = ivw.q(parcel2, readInt);
                    break;
                case 21:
                    bool = ivw.d(parcel2, readInt);
                    break;
                case 22:
                    j5 = ivw.i(parcel2, readInt);
                    break;
                case 23:
                    arrayList = ivw.C(parcel2, readInt);
                    break;
                case 24:
                    str8 = ivw.q(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new AppMetadata(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, z5, str7, bool, j5, arrayList, str8);
    }
}
