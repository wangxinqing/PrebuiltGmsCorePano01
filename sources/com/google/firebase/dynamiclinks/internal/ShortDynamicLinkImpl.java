package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ShortDynamicLinkImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apwm();
    public final Uri a;
    public final Uri b;
    public final List c;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class WarningImpl extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new apwn();
        public final String a;

        public WarningImpl(String str) {
            this.a = str;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.a(parcel, 2, this.a, false);
            ivx.b(parcel, a2);
        }
    }

    public ShortDynamicLinkImpl(Uri uri, Uri uri2, List list) {
        this.a = uri;
        this.b = uri2;
        this.c = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.c(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
