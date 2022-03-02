package defpackage;

import java.util.ArrayList;

/* renamed from: baer  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baer {
    private ArrayList a = new ArrayList();
    private volatile azxz b = azxz.IDLE;

    /* access modifiers changed from: package-private */
    public final void a(azxz azxz) {
        amrl.a((Object) azxz, (Object) "newState");
        if (this.b != azxz && this.b != azxz.SHUTDOWN) {
            this.b = azxz;
            if (!this.a.isEmpty()) {
                ArrayList arrayList = this.a;
                this.a = new ArrayList();
                if (arrayList.size() > 0) {
                    baeq baeq = (baeq) arrayList.get(0);
                    throw null;
                }
            }
        }
    }
}
