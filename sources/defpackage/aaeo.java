package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.util.Set;

/* renamed from: aaeo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaeo extends qvv {
    public final Set a = new ob();
    private final aaee b;
    private final qvz c;

    public aaeo(Handler handler, qvz qvz, aaee aaee) {
        super("scheduler", "UriTaskContentObserver", handler);
        this.b = aaee;
        this.c = qvz;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, Uri uri) {
        this.b.a(this.c, uri, 0);
    }
}
