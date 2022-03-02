package defpackage;

import android.content.ContentValues;
import com.google.android.gms.common.stats.radio.NetworkLatencyContract;
import com.google.android.gms.common.stats.radio.NetworkLatencyEvent;

/* renamed from: jek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jek implements jic {
    static final jic a = new jek();

    private jek() {
    }

    public final void a(Object obj, ContentValues contentValues) {
        NetworkLatencyEvent networkLatencyEvent = (NetworkLatencyEvent) obj;
        contentValues.put("event_time_ms", Long.valueOf(networkLatencyEvent.eventTimeMillis));
        contentValues.put(NetworkLatencyContract.NetworkLatencyColumns.LATENCY, Long.valueOf(networkLatencyEvent.latencyMillis));
        contentValues.put("network_type", Integer.valueOf(networkLatencyEvent.networkType));
        contentValues.put("tag", Integer.valueOf(networkLatencyEvent.tag));
        contentValues.put("device_state", Integer.valueOf(networkLatencyEvent.deviceState));
        contentValues.put(NetworkLatencyContract.NetworkLatencyColumns.SUCCESSFUL, Boolean.valueOf(networkLatencyEvent.successful));
    }
}
