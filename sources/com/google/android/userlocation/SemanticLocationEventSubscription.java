package com.google.android.userlocation;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import com.google.android.places.Subscription;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SemanticLocationEventSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR = new allg();
    public final SemanticLocationEventRequest a;
    public final PlacesParams b;
    public final PendingIntent c;

    public SemanticLocationEventSubscription(SemanticLocationEventRequest semanticLocationEventRequest, PlacesParams placesParams, PendingIntent pendingIntent) {
        this.a = semanticLocationEventRequest;
        this.b = placesParams;
        this.c = pendingIntent;
    }

    public final akhu a(Context context, akit akit, akhm akhm) {
        String str = this.b.b;
        return new allh(akhm.b, jhg.i(context, str), str, this.b.d, alll.a(this.a.b), azcr.b(), new akjw(new alle(this.c, this.a, new allf(this, akit), context), this.a.d, azcr.a.a().b()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SemanticLocationEventSubscription) {
            SemanticLocationEventSubscription semanticLocationEventSubscription = (SemanticLocationEventSubscription) obj;
            return this.a.a.equals(semanticLocationEventSubscription.a.a) && this.b.b.equals(semanticLocationEventSubscription.b.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.a, this.b.b});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("request", this.a);
        a2.a("params", this.b);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, i, false);
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
        if (subscription instanceof SemanticLocationEventSubscription) {
            SemanticLocationEventSubscription semanticLocationEventSubscription = (SemanticLocationEventSubscription) subscription;
            return ius.a(this.c, semanticLocationEventSubscription.c) && ius.a(this.b, semanticLocationEventSubscription.b) && ius.a(this.a.c, semanticLocationEventSubscription.a.c) && ius.a(Integer.valueOf(this.a.d), Integer.valueOf(semanticLocationEventSubscription.a.d)) && ius.a(Integer.valueOf(this.a.b), Integer.valueOf(semanticLocationEventSubscription.a.b));
        }
    }
}
