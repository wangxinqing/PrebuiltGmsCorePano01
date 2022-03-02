package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.auth.firstparty.shared.ScopeData;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: geg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class geg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ScopeData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
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
                    z = ivw.c(parcel2, readInt);
                    break;
                case 7:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    str6 = ivw.q(parcel2, readInt);
                    break;
                case 9:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 10:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 11:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case 12:
                    z5 = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    z6 = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    z7 = ivw.c(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    arrayList = ivw.C(parcel2, readInt);
                    break;
                case 16:
                    str7 = ivw.q(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new ScopeData(i, str, str2, str3, str4, z, str5, str6, z2, z3, z4, z5, z6, z7, arrayList, str7);
    }
}
