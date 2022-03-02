package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.feedback.Screenshot;

/* renamed from: oft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oft implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Screenshot screenshot = new Screenshot();
        screenshot.c = parcel.readString();
        try {
            screenshot.a = parcel.readInt();
            screenshot.b = parcel.readInt();
        } catch (Exception e) {
            screenshot.a = 0;
            screenshot.b = 0;
        }
        return screenshot;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Screenshot[i];
    }
}
