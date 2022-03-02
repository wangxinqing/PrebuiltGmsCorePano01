package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.model.posts.Post;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: yxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yxp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Post[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        Boolean bool = null;
        String str = null;
        ArrayList arrayList = null;
        Uri uri = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        Bundle bundle2 = null;
        String str5 = null;
        String str6 = null;
        Audience audience = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel2, readInt);
            } else if (a != 1000) {
                switch (a) {
                    case 3:
                        arrayList = ivw.c(parcel2, readInt, Uri.CREATOR);
                        break;
                    case 4:
                        uri = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                        break;
                    case 5:
                        str2 = ivw.q(parcel2, readInt);
                        break;
                    case 6:
                        str3 = ivw.q(parcel2, readInt);
                        break;
                    case 7:
                        str4 = ivw.q(parcel2, readInt);
                        break;
                    case 8:
                        bundle = ivw.s(parcel2, readInt);
                        break;
                    case 9:
                        bundle2 = ivw.s(parcel2, readInt);
                        break;
                    case 10:
                        str5 = ivw.q(parcel2, readInt);
                        break;
                    case 11:
                        bool = ivw.d(parcel2, readInt);
                        break;
                    case 12:
                        str6 = ivw.q(parcel2, readInt);
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                        audience = (Audience) ivw.a(parcel2, readInt, Audience.CREATOR);
                        break;
                    default:
                        ivw.b(parcel2, readInt);
                        break;
                }
            } else {
                i = ivw.g(parcel2, readInt);
            }
        }
        ivw.E(parcel2, b);
        return new Post(i, str, arrayList, uri, str2, str3, str4, bundle, bundle2, str5, bool.booleanValue(), str6, audience);
    }
}
