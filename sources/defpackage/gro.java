package defpackage;

import android.location.Location;
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

/* renamed from: gro  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gro {
    public ActivityRecognitionResult a;
    public BeaconStateImpl b;
    public DataHolder c;
    public HeadphoneStateImpl d;
    public Location e;
    public WeatherImpl f;
    public TimeIntervalsImpl g;
    private ContextData h;
    private boolean i = false;

    public final Snapshot a() {
        return new Snapshot(this.a, this.b, this.d, this.e, (NetworkStateImpl) null, this.c, (PowerStateImpl) null, (ScreenStateImpl) null, this.f, this.g, this.h);
    }

    public final void a(ContextData contextData) {
        if (this.h != null) {
            bxl.a("Snapshot", "overwriting context data");
        }
        this.h = contextData;
    }

    public final boolean a(Object obj) {
        boolean z = this.i;
        if (z) {
            bxl.a("Snapshot", "Failed to set %s", obj);
        }
        this.i = true;
        return z;
    }
}
