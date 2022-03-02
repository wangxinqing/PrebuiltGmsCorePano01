package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;

/* renamed from: wpn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wpn {
    public static wpc a(Context context, String str, int i, wmq wmq, String str2, long j, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        wpc b = b(context, str, i, wmq, str2, parcelableLoadImageOptions);
        if (b != null) {
            return b;
        }
        return new wpm(str, i, wmq, j, !parcelableLoadImageOptions.c);
    }

    static wpc b(Context context, String str, int i, wmq wmq, String str2, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        int i2;
        if (wtw.a(context).a(str2, (String) null) == -1) {
            return null;
        }
        if (parcelableLoadImageOptions.c) {
            i2 = parcelableLoadImageOptions.a;
        } else {
            i2 = 4;
        }
        return new wpo(str, i, wmq, str2, (String) null, i2, 1);
    }

    public static wpc a(Context context, String str, int i, wmq wmq, String str2, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        wow wow;
        xip.a();
        if (((Boolean) xib.a.a()).booleanValue()) {
            wow = wow.a(context);
        } else {
            wow = null;
        }
        return new wpl(context, str, i, wow, wmq, str2, parcelableLoadImageOptions.a, parcelableLoadImageOptions.b);
    }

    public static wpc b(Context context, String str, int i, wmq wmq, String str2, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        wpc b = b(context, str, i, wmq, str2, parcelableLoadImageOptions);
        if (b != null) {
            return b;
        }
        return new wpj(str, i, (ConnectivityManager) context.getSystemService("connectivity"), wow.a(context), wmq, avatarReference, parcelableLoadImageOptions);
    }

    public static wpc a(Context context, String str, int i, wmq wmq, String str2, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        wpc b = b(context, str, i, wmq, str2, parcelableLoadImageOptions);
        return b == null ? new wpi(str, i, wmq, avatarReference, parcelableLoadImageOptions) : b;
    }

    public static wpc a(String str, int i, wmq wmq, long j, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        return new wpq(str, i, wmq, j, !parcelableLoadImageOptions.c);
    }

    public static wpc a(String str, int i, wmq wmq, String str2, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        boolean z;
        if ((parcelableLoadImageOptions.b & 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        return new woy(str, i, str2, wmq, z, "BaseLoadRemoteImage");
    }
}
