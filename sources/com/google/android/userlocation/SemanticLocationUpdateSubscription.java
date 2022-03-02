package com.google.android.userlocation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocationUpdateRequest;
import com.google.android.places.Subscription;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SemanticLocationUpdateSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR = new allj();
    public final SemanticLocationUpdateRequest a;
    public final PlacesParams b;
    private akit c = null;
    private final advg d;

    public SemanticLocationUpdateSubscription(SemanticLocationUpdateRequest semanticLocationUpdateRequest, PlacesParams placesParams, advg advg) {
        this.a = semanticLocationUpdateRequest;
        this.b = placesParams;
        this.d = advg;
    }

    public final akhu a(Context context, akit akit, akhm akhm) {
        this.c = akit;
        String str = this.b.b;
        return new allh(akhm.b, jhg.i(context, str), str, this.b.d, alll.a(this.a.b), azcr.a.a().e(), new alli(this.d, this.a, this));
    }

    public final void b() {
        akit akit = this.c;
        if (akit != null) {
            ((akiy) akit).a((Subscription) this);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SemanticLocationUpdateSubscription) {
            SemanticLocationUpdateSubscription semanticLocationUpdateSubscription = (SemanticLocationUpdateSubscription) obj;
            return this.a.a.equals(semanticLocationUpdateSubscription.a.a) && this.b.b.equals(semanticLocationUpdateSubscription.b.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.a, this.b.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.b(parcel, a2);
    }

    public final Status a(int i) {
        if (i < 10) {
            return ibt.f(0);
        }
        String format = String.format(Locale.US, "%d subscriptions already added for package %s, max is %d", new Object[]{Integer.valueOf(i), this.b.b, 10});
        if (Log.isLoggable("Places", 6)) {
            Log.e("Places", format);
        }
        return ibt.a(26002, format);
    }

    public final String a() {
        return this.b.b;
    }

    public final boolean a(Subscription subscription) {
        if (this == subscription) {
            return true;
        }
        if (subscription instanceof SemanticLocationUpdateSubscription) {
            SemanticLocationUpdateSubscription semanticLocationUpdateSubscription = (SemanticLocationUpdateSubscription) subscription;
            return ius.a(this.d, semanticLocationUpdateSubscription.d) && ius.a(this.b, semanticLocationUpdateSubscription.b) && ius.a(this.a.c, semanticLocationUpdateSubscription.a.c) && ius.a(Integer.valueOf(this.a.b), Integer.valueOf(semanticLocationUpdateSubscription.a.b));
        }
    }
}
