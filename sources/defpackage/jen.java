package defpackage;

import com.google.android.gms.common.stats.radio.NetworkActivityEvent;
import java.util.Comparator;

/* renamed from: jen  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jen implements Comparator {
    static final Comparator a = new jen();

    private jen() {
    }

    public final int compare(Object obj, Object obj2) {
        String str = jeo.a;
        return (((NetworkActivityEvent) obj).eventTimeMillis > ((NetworkActivityEvent) obj2).eventTimeMillis ? 1 : (((NetworkActivityEvent) obj).eventTimeMillis == ((NetworkActivityEvent) obj2).eventTimeMillis ? 0 : -1));
    }
}
