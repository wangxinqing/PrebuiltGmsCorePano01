package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;

/* renamed from: algy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class algy {
    public static void a(Context context, CustomEvent customEvent) {
        algm.a((Object) context, "Context cannot be null.");
        algm.a((Object) customEvent, "CustomEvent cannot be null.");
        algp a = algp.a(context);
        Bundle bundle = new Bundle();
        algm.a((Object) customEvent, "CustomEvent cannot be null");
        Bundle bundle2 = new Bundle();
        bundle2.putInt("CustomEvent_version", 1);
        bundle2.putLong("CustomEvent_timestamp", customEvent.a);
        bundle2.putBundle("CustomEvent_metricKey", MetricKey.a(customEvent.b));
        bundle2.putBundle("CustomEvent_bundleValues", algl.a(new PersistableBundle(customEvent.c)));
        bundle2.putBundle("CustomEvent_pii_bundleValues", algl.a(customEvent.d));
        bundle.putParcelable("CustomEvent_bundle", bundle2);
        a.a(1, bundle);
    }
}
