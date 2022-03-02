package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveFileRange;
import com.google.android.gms.drive.internal.OnDownloadProgressResponse;
import java.util.ArrayList;

/* renamed from: kws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kws implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OnDownloadProgressResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                j = ivw.i(parcel, readInt);
            } else if (a == 3) {
                j2 = ivw.i(parcel, readInt);
            } else if (a == 4) {
                i = ivw.g(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                arrayList = ivw.c(parcel, readInt, DriveFileRange.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new OnDownloadProgressResponse(j, j2, i, arrayList);
    }
}
