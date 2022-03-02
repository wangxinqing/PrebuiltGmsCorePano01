package defpackage;

import android.content.Context;
import com.google.android.gms.net.PlayServicesCronetProvider;
import java.io.File;
import java.util.List;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* renamed from: div  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class div implements amsv {
    private static final iwd a = dit.a("CronetEngineSupplier");
    private static final amsv c = amta.a((amsv) new div());
    private final CronetProvider b = new PlayServicesCronetProvider(ihs.b());

    private div() {
    }

    public static amri b() {
        return (amri) c.a();
    }

    public final /* bridge */ /* synthetic */ Object a() {
        ihs b2 = ihs.b();
        if (this.b.isEnabled()) {
            ExperimentalCronetEngine.Builder builder = (ExperimentalCronetEngine.Builder) this.b.createBuilder();
            builder.enableBrotli(true);
            builder.enableQuic(true);
            if (awgv.a.a().b()) {
                builder.setThreadPriority(-2);
            }
            List<String> c2 = amsk.a(',').a().b().c(awgv.a.a().a());
            if (!c2.isEmpty()) {
                File file = new File(b2.getCacheDir(), "id_as_cronet_cache");
                try {
                    if (!file.exists()) {
                        if (!file.exists()) {
                            if (!file.mkdirs()) {
                            }
                        }
                    }
                    builder.setStoragePath(file.getAbsolutePath());
                    builder.enableHttpCache(2, 1000);
                    for (String addQuicHint : c2) {
                        builder.addQuicHint(addQuicHint, 443, 443);
                    }
                } catch (SecurityException e) {
                    a.e("Exception occurred in enabling cronet cache", e, new Object[0]);
                }
            }
            return amri.b(builder.build());
        }
        dis a2 = dis.a((Context) b2, dih.b);
        aucf aucf = (aucf) aqmz.l.o();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        aqmz aqmz = (aqmz) aucf.b;
        aqmz.b = 5;
        int i = aqmz.a | 1;
        aqmz.a = i;
        aqmz.c = 2024;
        int i2 = 2 | i;
        aqmz.a = i2;
        aqmz.a = i2 | 16;
        aqmz.f = true;
        aqlq a3 = a2.a();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        aqmz aqmz2 = (aqmz) aucf.b;
        a3.getClass();
        aqmz2.h = a3;
        aqmz2.a |= 64;
        if (!jlh.d("DISABLED")) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            aqmz aqmz3 = (aqmz) aucf.b;
            "DISABLED".getClass();
            aqmz3.a |= 4;
            aqmz3.d = "DISABLED";
        }
        aucd o = aqna.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqna aqna = (aqna) o.b;
        aqmz aqmz4 = (aqmz) aucf.i();
        aqmz4.getClass();
        aqna.b = aqmz4;
        aqna.a |= 1;
        a2.a((aqna) o.i());
        return ampu.a;
    }
}
