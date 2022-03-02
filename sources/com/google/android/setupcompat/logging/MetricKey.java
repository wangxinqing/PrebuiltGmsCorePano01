package com.google.android.setupcompat.logging;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class MetricKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = new algx();
    private static final Pattern c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]+");
    private final String a;
    private final String b;

    public MetricKey(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static Bundle a(MetricKey metricKey) {
        algm.a((Object) metricKey, "MetricKey cannot be null.");
        Bundle bundle = new Bundle();
        bundle.putInt("MetricKey_version", 1);
        bundle.putString("MetricKey_name", metricKey.a);
        bundle.putString("MetricKey_screenName", metricKey.b);
        return bundle;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MetricKey) {
            MetricKey metricKey = (MetricKey) obj;
            return alhl.a(this.a, metricKey.a) && alhl.a(this.b, metricKey.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public static MetricKey a(String str, Activity activity) {
        String className = activity.getComponentName().getClassName();
        algv.a(str, "MetricKey.name", 5, 30);
        algm.a(c.matcher(str).matches(), "Invalid MetricKey, only alpha numeric characters are allowed.");
        return new MetricKey(str, className);
    }
}
