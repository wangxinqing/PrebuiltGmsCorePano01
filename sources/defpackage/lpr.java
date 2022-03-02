package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.ui.select.SelectFilePreferences;

/* renamed from: lpr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lpr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        SelectFilePreferences selectFilePreferences = new SelectFilePreferences();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            selectFilePreferences.a(lqu.a(parcel.readString()), lqt.a(parcel.readString()));
        }
        return selectFilePreferences;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SelectFilePreferences[i];
    }
}
