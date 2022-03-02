package defpackage;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.awareness.snapshot.internal.HeadphoneStateImpl;
import com.google.android.gms.awareness.snapshot.internal.NetworkStateImpl;
import com.google.android.gms.awareness.snapshot.internal.PowerStateImpl;
import com.google.android.gms.awareness.snapshot.internal.ScreenStateImpl;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.awareness.snapshot.internal.TimeIntervalsImpl;
import com.google.android.gms.awareness.snapshot.internal.WeatherImpl;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: grq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class grq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Snapshot[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ActivityRecognitionResult activityRecognitionResult = null;
        BeaconStateImpl beaconStateImpl = null;
        HeadphoneStateImpl headphoneStateImpl = null;
        Location location = null;
        NetworkStateImpl networkStateImpl = null;
        DataHolder dataHolder = null;
        PowerStateImpl powerStateImpl = null;
        ScreenStateImpl screenStateImpl = null;
        WeatherImpl weatherImpl = null;
        TimeIntervalsImpl timeIntervalsImpl = null;
        ContextData contextData = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    activityRecognitionResult = (ActivityRecognitionResult) ivw.a(parcel, readInt, ActivityRecognitionResult.CREATOR);
                    break;
                case 3:
                    beaconStateImpl = (BeaconStateImpl) ivw.a(parcel, readInt, BeaconStateImpl.CREATOR);
                    break;
                case 4:
                    headphoneStateImpl = (HeadphoneStateImpl) ivw.a(parcel, readInt, HeadphoneStateImpl.CREATOR);
                    break;
                case 5:
                    location = (Location) ivw.a(parcel, readInt, Location.CREATOR);
                    break;
                case 6:
                    networkStateImpl = (NetworkStateImpl) ivw.a(parcel, readInt, NetworkStateImpl.CREATOR);
                    break;
                case 7:
                    dataHolder = (DataHolder) ivw.a(parcel, readInt, DataHolder.CREATOR);
                    break;
                case 8:
                    powerStateImpl = (PowerStateImpl) ivw.a(parcel, readInt, PowerStateImpl.CREATOR);
                    break;
                case 9:
                    screenStateImpl = (ScreenStateImpl) ivw.a(parcel, readInt, ScreenStateImpl.CREATOR);
                    break;
                case 10:
                    weatherImpl = (WeatherImpl) ivw.a(parcel, readInt, WeatherImpl.CREATOR);
                    break;
                case 11:
                    timeIntervalsImpl = (TimeIntervalsImpl) ivw.a(parcel, readInt, TimeIntervalsImpl.CREATOR);
                    break;
                case 12:
                    contextData = (ContextData) ivw.a(parcel, readInt, ContextData.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new Snapshot(activityRecognitionResult, beaconStateImpl, headphoneStateImpl, location, networkStateImpl, dataHolder, powerStateImpl, screenStateImpl, weatherImpl, timeIntervalsImpl, contextData);
    }
}
