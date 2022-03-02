package defpackage;

import android.util.Log;
import com.google.android.gms.net.PlayServicesCronetProvider;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.impl.JavaCronetProvider;

/* renamed from: ogh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ogh implements amsv {
    private static final amsv a = amta.a((amsv) new ogh());
    private final CronetProvider b = new PlayServicesCronetProvider(ihs.b());
    private final CronetProvider c = new JavaCronetProvider(ihs.b());

    private static CronetEngine a(CronetProvider cronetProvider) {
        CronetEngine.Builder enableQuic = cronetProvider.createBuilder().enableHttp2(axmx.a.a().k()).enableQuic(axmx.a.a().l());
        for (String addQuicHint : ofx.a(axmx.a.a().e())) {
            enableQuic.addQuicHint(addQuicHint, 443, 443);
        }
        return enableQuic.build();
    }

    public static amsv b() {
        iva.b("Must be called from a worker thread.");
        return a;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        try {
            return a(this.b);
        } catch (RuntimeException e) {
            Log.w("gH_cronetEngSup", "Falling back to Java Cronet engine provider due to error: s", e);
            return a(this.c);
        }
    }
}
