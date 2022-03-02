package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.ExecutorService;

/* renamed from: kim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kim {
    public static final ith a = new ith("ContentDownloadManager", "");
    private static final String k = String.valueOf((String) jzq.K.c()).concat("%sfiles/%s?alt=media");
    public final Context b;
    public final kix c;
    public final khx d;
    public final kij e = new kij(this);
    public final kij f = new kij(this);
    public final kkf g;
    public final khw h;
    public final kht i;
    public final ExecutorService j = jfb.a(((Integer) jzq.Z.c()).intValue(), 9);

    public kim(Context context, kix kix, khx khx, kkf kkf, khw khw) {
        iva.a((Object) context);
        this.b = context;
        iva.a((Object) kix);
        this.c = kix;
        iva.a((Object) khx);
        this.d = khx;
        iva.a((Object) kkf);
        this.g = kkf;
        iva.a((Object) khw);
        this.h = khw;
        this.i = new kht();
    }

    public final kis a(khq khq, kmp kmp, lht lht) {
        String i2 = kmp.i();
        String l = kmp.l();
        Uri.Builder buildUpon = Uri.parse(String.format(k, new Object[]{!((Boolean) jzq.bb.c()).booleanValue() ? "/drive/v2beta/" : lnp.b(), i2})).buildUpon();
        if (l != null) {
            buildUpon.appendQueryParameter("revisionId", l);
        }
        if (kmp.ai()) {
            buildUpon.appendQueryParameter("fileScopeAppIds", kmp.z());
        }
        lnp.a(buildUpon);
        String uri = buildUpon.build().toString();
        khq a2 = ((Boolean) jzq.bb.c()).booleanValue() ? khq.a(khq.a) : khq;
        knc a3 = kmp.a();
        if (this.d.a(kmp)) {
            a.a("ContentDownloadManager", "Up-to-date file is already available locally: %s", kmp.a());
            return new kis(3);
        } else if (!kmp.ad()) {
            throw new nja(10, "No content is available for this file.");
        } else if (!kmp.ab()) {
            return this.e.a(a3, new kig(this, a2, uri, kmp, lht));
        } else {
            throw new AssertionError("Local document not available locally. This should not happen");
        }
    }
}
