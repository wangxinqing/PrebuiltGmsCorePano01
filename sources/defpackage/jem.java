package defpackage;

import com.google.android.gms.common.stats.radio.NetworkLatencyEvent;
import java.util.Comparator;

/* renamed from: jem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jem implements Comparator {
    static final Comparator a = new jem();

    private jem() {
    }

    public final int compare(Object obj, Object obj2) {
        String str = jeo.a;
        return (((NetworkLatencyEvent) obj).latencyMillis > ((NetworkLatencyEvent) obj2).latencyMillis ? 1 : (((NetworkLatencyEvent) obj).latencyMillis == ((NetworkLatencyEvent) obj2).latencyMillis ? 0 : -1));
    }
}
