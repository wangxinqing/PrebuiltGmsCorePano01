package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.analytics.internal.Command;

/* renamed from: dmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dmw implements Parcelable.Creator {
    @Deprecated
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Command(parcel);
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Command[i];
    }
}
