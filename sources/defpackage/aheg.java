package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* renamed from: aheg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aheg implements aoqb {
    private final ahfl a;

    public aheg(ahfl ahfl) {
        this.a = ahfl;
    }

    public final aorr a(Object obj) {
        ahfl ahfl = this.a;
        return aopr.a(ahfl.b.a(), (amqy) new ahfk(ahfl, (Uri) obj), (Executor) aoqm.a);
    }
}
