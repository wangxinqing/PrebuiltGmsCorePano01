package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;

/* renamed from: oju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oju implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OverflowMenuItem[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        Intent intent = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a == 3) {
                str = ivw.q(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                intent = (Intent) ivw.a(parcel, readInt, Intent.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new OverflowMenuItem(i, str, intent);
    }
}
