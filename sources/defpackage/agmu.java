package defpackage;

import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

/* renamed from: agmu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agmu implements amsv {
    public final Object a() {
        amri amri;
        amsv amsv = agmv.a;
        Long l = (Long) agmv.a().a((Object) 0L);
        if (l.longValue() <= 0) {
            return ampu.a;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            String a = anne.a(new File("/proc/self/stat"), Charset.defaultCharset()).a();
            if (!a.isEmpty()) {
                amri = agmv.a(a);
            } else {
                amri = ampu.a;
            }
        } catch (IOException e) {
            amri = ampu.a;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        Long l2 = (Long) amri.a((Object) 0L);
        return l2.longValue() > 0 ? amri.b(Long.valueOf(TimeUnit.SECONDS.toMillis(l2.longValue()) / l.longValue())) : ampu.a;
    }
}
