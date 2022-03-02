package defpackage;

import android.content.ContentValues;
import com.google.android.gms.common.stats.radio.NetworkActivityContract;
import com.google.android.gms.common.stats.radio.NetworkActivityEvent;

/* renamed from: jei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jei implements jic {
    static final jic a = new jei();

    private jei() {
    }

    public final void a(Object obj, ContentValues contentValues) {
        NetworkActivityEvent networkActivityEvent = (NetworkActivityEvent) obj;
        contentValues.put("event_time_ms", Long.valueOf(networkActivityEvent.eventTimeMillis));
        contentValues.put("network_type", Integer.valueOf(networkActivityEvent.networkType));
        contentValues.put("tag", Integer.valueOf(networkActivityEvent.tag));
        contentValues.put("device_state", Integer.valueOf(networkActivityEvent.deviceState));
        contentValues.put(NetworkActivityContract.NetworkActivityColumns.IS_NETWORK_ACTIVE, Boolean.valueOf(networkActivityEvent.isNetworkActive));
    }
}
