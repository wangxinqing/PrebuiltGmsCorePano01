package com.google.android.gms.auth.firstparty.shared;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LatencyTracker extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ged();
    final int a;
    final String b;
    final long c;
    public final LatencyTracker d;

    public LatencyTracker(int i, String str, long j, LatencyTracker latencyTracker) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = latencyTracker;
    }

    public static LatencyTracker a(String str) {
        return new LatencyTracker(1, str, SystemClock.elapsedRealtime(), (LatencyTracker) null);
    }

    public final LatencyTracker b(String str) {
        return new LatencyTracker(1, str, SystemClock.elapsedRealtime(), this);
    }

    public final void a(Intent intent) {
        intent.putExtra("latency.tracker", this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.b(parcel, a2);
    }
}
