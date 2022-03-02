package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Set;

/* renamed from: ahdn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahdn extends BroadcastReceiver {
    public final aosh a = aosh.f();
    public final Set b;

    public ahdn(Set set) {
        Set b2 = angm.b();
        this.b = b2;
        b2.addAll(set);
        a();
    }

    private final void a() {
        if (this.b.isEmpty()) {
            this.a.b((Object) null);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.b.remove(amrk.b(intent.getPackage()));
        a();
    }
}
