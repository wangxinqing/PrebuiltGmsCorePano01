package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class StockProfileImageEntity extends GamesAbstractSafeParcelable implements StockProfileImage {
    public static final Parcelable.Creator CREATOR = new nmu();
    public final String a;
    public final Uri b;

    public StockProfileImageEntity(String str, Uri uri) {
        this.a = str;
        this.b = uri;
    }

    public final String a() {
        return this.a;
    }

    public final Uri b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StockProfileImage)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        StockProfileImage stockProfileImage = (StockProfileImage) obj;
        return ius.a(this.a, stockProfileImage.a()) && ius.a(this.b, stockProfileImage.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("ImageId", this.a);
        a2.a("ImageUri", this.b);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
