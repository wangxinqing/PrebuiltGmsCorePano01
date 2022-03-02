package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ScreenshotEntity extends GamesAbstractSafeParcelable implements Parcelable, ilq {
    public static final Parcelable.Creator CREATOR = new nmr();
    public final Uri a;
    public final int b;
    public final int c;

    public ScreenshotEntity(Uri uri, int i, int i2) {
        this.a = uri;
        this.b = i;
        this.c = i2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ScreenshotEntity) {
            if (this == obj) {
                return true;
            }
            ScreenshotEntity screenshotEntity = (ScreenshotEntity) obj;
            if (!ius.a(screenshotEntity.a, this.a) || !ius.a(Integer.valueOf(screenshotEntity.b), Integer.valueOf(this.b)) || !ius.a(Integer.valueOf(screenshotEntity.c), Integer.valueOf(this.c))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("Uri", this.a);
        a2.a("Width", Integer.valueOf(this.b));
        a2.a("Height", Integer.valueOf(this.c));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
