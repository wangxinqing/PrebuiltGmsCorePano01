package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.games.GameEntity;
import org.chromium.net.UrlRequest;

/* renamed from: nld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class nld implements Parcelable.Creator {
    /* renamed from: a */
    public GameEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 2:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    str6 = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    uri = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 8:
                    uri2 = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 9:
                    uri3 = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 10:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 11:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 12:
                    str7 = ivw.q(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    i = ivw.g(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 16:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 17:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case 18:
                    str8 = ivw.q(parcel2, readInt);
                    break;
                case 19:
                    str9 = ivw.q(parcel2, readInt);
                    break;
                case 20:
                    str10 = ivw.q(parcel2, readInt);
                    break;
                case 21:
                    z5 = ivw.c(parcel2, readInt);
                    break;
                case 22:
                    z6 = ivw.c(parcel2, readInt);
                    break;
                case 23:
                    z7 = ivw.c(parcel2, readInt);
                    break;
                case 24:
                    str11 = ivw.q(parcel2, readInt);
                    break;
                case 25:
                    z8 = ivw.c(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new GameEntity(str, str2, str3, str4, str5, str6, uri, uri2, uri3, z, z2, str7, i, i2, i3, z3, z4, str8, str9, str10, z5, z6, z7, str11, z8);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GameEntity[i];
    }
}
