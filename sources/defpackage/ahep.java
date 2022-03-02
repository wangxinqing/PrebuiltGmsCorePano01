package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Future;

/* renamed from: ahep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahep implements aoqa {
    private final ahey a;

    public ahep(ahey ahey) {
        this.a = ahey;
    }

    public final aorr a() {
        ahey ahey = this.a;
        Uri uri = (Uri) aorl.a((Future) ahey.b);
        try {
            return aorl.a(ahey.b(uri));
        } catch (IOException e) {
            return aopr.a(ahey.a(e), amll.a((aoqb) new ahew(ahey, uri)), ahey.d);
        }
    }
}
