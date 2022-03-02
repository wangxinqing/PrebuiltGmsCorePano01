package com.google.android.setupcompat.logging;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class CustomEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new algw();
    public final long a;
    public final MetricKey b;
    public final PersistableBundle c;
    public final PersistableBundle d;

    public CustomEvent(long j, MetricKey metricKey, PersistableBundle persistableBundle, PersistableBundle persistableBundle2) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        algm.a(z, "Timestamp cannot be negative.");
        algm.a((Object) metricKey, "MetricKey cannot be null.");
        algm.a((Object) persistableBundle, "Bundle cannot be null.");
        algm.a(!persistableBundle.isEmpty(), "Bundle cannot be empty.");
        algm.a((Object) persistableBundle2, "piiValues cannot be null.");
        for (String str : persistableBundle.keySet()) {
            algv.a(str, "bundle key", 3, 50);
            Object obj = persistableBundle.get(str);
            if (obj instanceof String) {
                algm.a(((String) obj).length() <= 50, String.format("Maximum length of string value for key='%s' cannot exceed %s.", new Object[]{str, 50}));
            }
        }
        this.a = j;
        this.b = metricKey;
        this.c = new PersistableBundle(persistableBundle);
        this.d = new PersistableBundle(persistableBundle2);
    }

    public static CustomEvent a(MetricKey metricKey, PersistableBundle persistableBundle) {
        boolean z;
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        } else {
            z = false;
        }
        algm.a(z, "The constructor only support on sdk Q or higher.");
        PersistableBundle persistableBundle2 = PersistableBundle.EMPTY;
        if (Build.VERSION.SDK_INT < 29) {
            z2 = false;
        }
        algm.a(z2, "The constructor only support on sdk Q or higher");
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        algl.b(persistableBundle);
        algl.b(persistableBundle2);
        return new CustomEvent(millis, metricKey, persistableBundle, persistableBundle2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CustomEvent) {
            CustomEvent customEvent = (CustomEvent) obj;
            return this.a == customEvent.a && alhl.a(this.b, customEvent.b) && algl.a(this.c, customEvent.c) && algl.a(this.d, customEvent.d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writePersistableBundle(this.c);
        parcel.writePersistableBundle(this.d);
    }
}
