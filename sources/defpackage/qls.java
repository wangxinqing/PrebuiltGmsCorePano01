package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.instantapps.shared.PatternMatcher;

/* renamed from: qls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qls implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PatternMatcher(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PatternMatcher[i];
    }
}
