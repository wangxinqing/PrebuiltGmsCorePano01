package defpackage;

import android.content.Intent;
import java.util.List;

/* renamed from: nvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nvd extends ntr {
    final /* synthetic */ List a;
    final /* synthetic */ nvh b;

    public nvd(nvh nvh, List list) {
        this.b = nvh;
        this.a = list;
    }

    public final void a(long j, amnc amnc) {
        if (this.a.contains(Long.toString(j))) {
            nrj nrj = this.b.r;
            Intent intent = new Intent(nrj.b());
            intent.setPackage(amnc.e);
            intent.putExtra("event", "sent");
            intent.putExtra("message_type", "send_event");
            intent.putExtra("google.message_id", amnc.b);
            nrj.a(intent, amnc, nvr.a(amnc));
        }
    }
}
