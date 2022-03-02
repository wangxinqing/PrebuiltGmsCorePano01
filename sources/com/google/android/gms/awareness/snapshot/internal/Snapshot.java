package com.google.android.gms.awareness.snapshot.internal;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.location.ActivityRecognitionResult;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Snapshot extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new grq();
    public final ActivityRecognitionResult a;
    public final BeaconStateImpl b;
    public final HeadphoneStateImpl c;
    public final Location d;
    public final NetworkStateImpl e;
    public final DataHolder f;
    public final PowerStateImpl g;
    public final ScreenStateImpl h;
    public final WeatherImpl i;
    public final TimeIntervalsImpl j;
    public final ContextData k;

    public Snapshot(ActivityRecognitionResult activityRecognitionResult, BeaconStateImpl beaconStateImpl, HeadphoneStateImpl headphoneStateImpl, Location location, NetworkStateImpl networkStateImpl, DataHolder dataHolder, PowerStateImpl powerStateImpl, ScreenStateImpl screenStateImpl, WeatherImpl weatherImpl, TimeIntervalsImpl timeIntervalsImpl, ContextData contextData) {
        this.a = activityRecognitionResult;
        this.b = beaconStateImpl;
        this.c = headphoneStateImpl;
        this.d = location;
        this.e = networkStateImpl;
        this.f = dataHolder;
        this.g = powerStateImpl;
        this.h = screenStateImpl;
        this.i = weatherImpl;
        this.j = timeIntervalsImpl;
        this.k = contextData;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i2, false);
        ivx.a(parcel, 3, this.b, i2, false);
        ivx.a(parcel, 4, this.c, i2, false);
        ivx.a(parcel, 5, this.d, i2, false);
        ivx.a(parcel, 6, this.e, i2, false);
        ivx.a(parcel, 7, this.f, i2, false);
        ivx.a(parcel, 8, this.g, i2, false);
        ivx.a(parcel, 9, this.h, i2, false);
        ivx.a(parcel, 10, this.i, i2, false);
        ivx.a(parcel, 11, this.j, i2, false);
        ivx.a(parcel, 12, this.k, i2, false);
        ivx.b(parcel, a2);
    }
}
