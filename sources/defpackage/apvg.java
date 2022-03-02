package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
import org.chromium.net.UrlRequest;

/* renamed from: apvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apvg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new VerifyAssertionRequest[i];
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
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
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
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    str6 = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    str7 = ivw.q(parcel2, readInt);
                    break;
                case 9:
                    str8 = ivw.q(parcel2, readInt);
                    break;
                case 10:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 11:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 12:
                    str9 = ivw.q(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    str10 = ivw.q(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    str11 = ivw.q(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    str12 = ivw.q(parcel2, readInt);
                    break;
                case 16:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 17:
                    str13 = ivw.q(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new VerifyAssertionRequest(str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, str10, str11, str12, z3, str13);
    }
}
