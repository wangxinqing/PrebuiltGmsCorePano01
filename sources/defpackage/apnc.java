package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: apnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apnc implements Parcelable.Creator {
    public static void a(Thing thing, Parcel parcel, int i) {
        int a = ivx.a(parcel);
        ivx.a(parcel, 1, thing.b, false);
        ivx.a(parcel, 2, thing.c, i, false);
        ivx.a(parcel, 3, thing.d, false);
        ivx.a(parcel, 4, thing.e, false);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, thing.a);
        ivx.b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Bundle bundle = null;
        Thing.Metadata metadata = null;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                bundle = ivw.s(parcel, readInt);
            } else if (a == 2) {
                metadata = (Thing.Metadata) ivw.a(parcel, readInt, Thing.Metadata.CREATOR);
            } else if (a == 3) {
                str = ivw.q(parcel, readInt);
            } else if (a == 4) {
                str2 = ivw.q(parcel, readInt);
            } else if (a != 1000) {
                ivw.b(parcel, readInt);
            } else {
                i = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new Thing(i, bundle, metadata, str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Thing[i];
    }
}
