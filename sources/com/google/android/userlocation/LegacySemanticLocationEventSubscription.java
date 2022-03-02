package com.google.android.userlocation;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocation;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import com.google.android.places.Subscription;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LegacySemanticLocationEventSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR = new alld();
    public static final SemanticLocationEventRequest a;
    public final SemanticLocationEventRequest b;
    public final PlacesParams c;
    public final PendingIntent d;
    public final PendingIntent e;

    static {
        aduf aduf = new aduf();
        aduf.a("unused");
        aduf.a(1);
        aduf.a(2);
        a = aduf.a();
    }

    public LegacySemanticLocationEventSubscription(SemanticLocationEventRequest semanticLocationEventRequest, PlacesParams placesParams, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        this.b = semanticLocationEventRequest;
        this.c = placesParams;
        this.d = pendingIntent;
        this.e = pendingIntent2;
    }

    private static String a(PendingIntent pendingIntent) {
        int i = Build.VERSION.SDK_INT;
        String creatorPackage = pendingIntent.getCreatorPackage();
        StringBuilder sb = new StringBuilder(String.valueOf(creatorPackage).length() + 30);
        sb.append("PendingIntent{creatorPackage=");
        sb.append(creatorPackage);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LegacySemanticLocationEventSubscription) {
            return this.e.equals(((LegacySemanticLocationEventSubscription) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("request", this.b);
        a2.a("params", this.c);
        a2.a("callbackIntent", a(this.d));
        a2.a("keyIntent", a(this.e));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, i, false);
        ivx.a(parcel, 2, this.c, i, false);
        ivx.a(parcel, 3, this.d, i, false);
        ivx.a(parcel, 4, this.e, i, false);
        ivx.b(parcel, a2);
    }

    public final akhu a(Context context, akit akit, akhm akhm) {
        String str = this.c.b;
        return new allh(akhm.b, jhg.i(context, str), str, this.c.d, alll.a(this.b.b), azcr.b(), new akur(new allc(this, context, akit), this.b));
    }

    public final Status a(int i) {
        if (i < ((int) azcf.f())) {
            return ibt.f(0);
        }
        if (Log.isLoggable("Places", 6)) {
            StringBuilder sb = new StringBuilder(40);
            sb.append("Too many subscription added: ");
            sb.append(i);
            Log.e("Places", sb.toString());
        }
        return ibt.f(26002);
    }

    public final String a() {
        int i = Build.VERSION.SDK_INT;
        return this.e.getCreatorPackage();
    }

    public final /* synthetic */ void a(Context context, akit akit, akip akip) {
        Intent a2 = adue.a((SemanticLocation) null, alll.a(akip, this.b.c.b)).a();
        a2.putExtra("com.google.android.gms.userlocation.SemanticLocationEvent.LEGACY_CALL_INTENT_EXTRA", this.e);
        a2.putExtra("com.google.android.gms.userlocation.SemanticLocationEvent.LEGACY_CALL_USE_HIERARCHIES_EXTRA", this.b.c.b);
        try {
            akva.a(context, a2, this.d);
        } catch (PendingIntent.CanceledException e2) {
            ((akiy) akit).a((Subscription) this);
        }
    }

    public final boolean a(Subscription subscription) {
        if (this == subscription) {
            return true;
        }
        if (subscription instanceof LegacySemanticLocationEventSubscription) {
            LegacySemanticLocationEventSubscription legacySemanticLocationEventSubscription = (LegacySemanticLocationEventSubscription) subscription;
            return ius.a(this.e, legacySemanticLocationEventSubscription.e) && ius.a(this.b.c, legacySemanticLocationEventSubscription.b.c) && ius.a(Integer.valueOf(this.b.b), Integer.valueOf(legacySemanticLocationEventSubscription.b.b)) && ius.a(Integer.valueOf(this.b.d), Integer.valueOf(legacySemanticLocationEventSubscription.b.d)) && ius.a(this.c, legacySemanticLocationEventSubscription.c);
        }
    }
}
