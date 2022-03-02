package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.EditTextPreference;

/* renamed from: amb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new EditTextPreference.SavedState(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new EditTextPreference.SavedState[i];
    }
}
