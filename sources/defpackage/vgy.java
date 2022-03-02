package defpackage;

import android.content.Context;
import android.os.WorkSource;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.Set;

/* renamed from: vgy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vgy {
    public static WorkSource a(Context context) {
        WorkSource workSource = null;
        for (ClientAppIdentifier clientAppIdentifier : b(context)) {
            if (clientAppIdentifier != null) {
                if (workSource == null) {
                    workSource = new WorkSource();
                }
                WorkSource a = jlr.a(context, clientAppIdentifier.a());
                if (a == null) {
                    return null;
                }
                workSource.add(a);
            }
        }
        return workSource;
    }

    public static Set b(Context context) {
        Set a = ((uyj) thl.a(context, uyj.class)).a();
        a.addAll(((uyt) thl.a(context, uyt.class)).c());
        return a;
    }
}
