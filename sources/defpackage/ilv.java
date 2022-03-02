package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.util.Collections;
import java.util.Set;

/* renamed from: ilv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ilv implements Closeable {
    public static final Set a = jir.b();
    private static ilv c = null;
    private static int d;
    private final ilw b = new ilw();

    protected ilv() {
    }

    public static long a(Context context) {
        return yfb.a(context, "direct_boot:gms_chimera_phenotype_flags").getLong("__dd_sp_version_key", -1);
    }

    public static Set b() {
        Set b2 = jir.b();
        b2.addAll(amsk.a(',').a().b().c(awyw.a.a().f()));
        return b2;
    }

    public final Set c() {
        Set unmodifiableSet;
        synchronized (ilv.class) {
            unmodifiableSet = Collections.unmodifiableSet(a);
        }
        return unmodifiableSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r2 = this;
            java.lang.Class<ilv> r0 = defpackage.ilv.class
            monitor-enter(r0)
            ilv r1 = c     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x001c
            int r1 = d     // Catch:{ all -> 0x001e }
            int r1 = r1 + -1
            d = r1     // Catch:{ all -> 0x001e }
            if (r1 > 0) goto L_0x001a
            r1 = 0
            d = r1     // Catch:{ all -> 0x001e }
            ilw r1 = r2.b     // Catch:{ all -> 0x001e }
            r1.close()     // Catch:{ all -> 0x001e }
            r1 = 0
            c = r1     // Catch:{ all -> 0x001e }
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilv.close():void");
    }

    public static synchronized ilv a() {
        ilv ilv;
        synchronized (ilv.class) {
            if (c == null) {
                c = new ilv();
            }
            d++;
            ilv = c;
        }
        return ilv;
    }
}
