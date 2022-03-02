package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.LaunchData;

/* renamed from: qea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qea implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LaunchData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Intent intent = null;
        String str = null;
        String str2 = null;
        BitmapTeleporter bitmapTeleporter = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                intent = (Intent) ivw.a(parcel, readInt, Intent.CREATOR);
            } else if (a == 3) {
                str = ivw.q(parcel, readInt);
            } else if (a == 4) {
                str2 = ivw.q(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                bitmapTeleporter = (BitmapTeleporter) ivw.a(parcel, readInt, BitmapTeleporter.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new LaunchData(intent, str, str2, bitmapTeleporter);
    }
}
