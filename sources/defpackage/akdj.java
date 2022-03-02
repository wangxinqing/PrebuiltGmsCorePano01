package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.pano.chimera.Action;

/* renamed from: akdj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akdj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        akdk akdk = new akdk();
        akdk.a = parcel.readString();
        akdk.b = parcel.readString();
        akdk.c = parcel.readString();
        akdk.d = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        akdk.e = parcel.readString();
        akdk.f = parcel.readInt();
        akdk.g = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        boolean z = true;
        akdk.h = parcel.readInt() != 0;
        if (parcel.readInt() == 0) {
            z = false;
        }
        akdk.i = z;
        akdk.j = parcel.readInt();
        return akdk.a();
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Action[i];
    }
}
