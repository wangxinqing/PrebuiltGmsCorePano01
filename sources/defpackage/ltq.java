package defpackage;

import android.app.AutomaticZenRule;
import android.content.ComponentName;
import android.util.Pair;
import java.util.Map;

/* renamed from: ltq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ltq {
    public static Pair a(iwq iwq, ComponentName componentName) {
        if (iwq != null) {
            for (Map.Entry entry : iwq.d().entrySet()) {
                if (entry.getValue() != null && componentName.equals(((AutomaticZenRule) entry.getValue()).getOwner())) {
                    return new Pair((String) entry.getKey(), (AutomaticZenRule) entry.getValue());
                }
            }
        }
        return null;
    }
}
