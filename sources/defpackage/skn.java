package defpackage;

import android.content.BroadcastReceiver;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: skn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class skn {
    public static final anij a = sjk.b();
    public final Set b;

    public skn(Set set) {
        this.b = set;
    }

    /* access modifiers changed from: package-private */
    public final void a(BroadcastReceiver broadcastReceiver, Intent intent) {
        if (intent == null) {
            a.d().a("skn", "a", 34, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Skipping push message handling due to null intent...");
            return;
        }
        BroadcastReceiver.PendingResult goAsync = broadcastReceiver.goAsync();
        amzt j = amzy.j();
        for (ska a2 : this.b) {
            j.c(a2.a(intent));
        }
        amzy a3 = j.a();
        aorl.a(aorl.b((Iterable) a3).a((Callable) new skl(a3), (Executor) aoqm.a), new skm(goAsync), aoqm.a);
    }
}
