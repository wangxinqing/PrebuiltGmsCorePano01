package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.internal.ContentRating;
import com.google.android.gms.instantapps.internal.VisitedApplication;
import java.util.ArrayList;

/* renamed from: qgv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qgv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new VisitedApplication[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        BitmapTeleporter bitmapTeleporter = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList = null;
        ContentRating contentRating = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    bitmapTeleporter = (BitmapTeleporter) ivw.a(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 3:
                    str = ivw.q(parcel, readInt);
                    break;
                case 4:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 5:
                    str3 = ivw.q(parcel, readInt);
                    break;
                case 6:
                    str4 = ivw.q(parcel, readInt);
                    break;
                case 7:
                    arrayList = ivw.C(parcel, readInt);
                    break;
                case 8:
                    contentRating = (ContentRating) ivw.a(parcel, readInt, ContentRating.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new VisitedApplication(bitmapTeleporter, str, str2, str3, str4, arrayList, contentRating);
    }
}
