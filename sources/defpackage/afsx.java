package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: afsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afsx implements ahcq, afzz {
    public final aekn a;
    public final Executor b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    public afsx(aekn aekn, Executor executor) {
        this.a = aekn;
        this.b = aosd.a(executor);
    }

    public final ahcc a(Uri uri) {
        synchronized (afsx.class) {
            String str = (String) this.c.get(uri);
            if (str == null) {
                return null;
            }
            if (this.d.get(str) != null) {
                ahcc ahcc = (ahcc) this.d.get(str);
                return ahcc;
            }
            afsh.a("%s: Can't find file group for uri: %s", (Object) "DownloadProgressMonitor", (Object) uri);
            return null;
        }
    }

    public final ahcp a() {
        return null;
    }

    public final ahcc b(Uri uri) {
        return a(uri);
    }

    public final void c() {
        synchronized (afsx.class) {
            for (ahcc ahcc : this.d.values()) {
                afvf afvf = ((afsw) ahcc.a).c.a;
                synchronized (afvf.a) {
                    afvf.b = true;
                    aorr aorr = afvf.c;
                    if (aorr != null) {
                        aorr.cancel(true);
                    }
                }
            }
        }
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void a(String str) {
        synchronized (afsx.class) {
            this.d.remove(str);
        }
    }

    public final void a(String str, long j) {
        synchronized (afsx.class) {
            if (this.d.containsKey(str)) {
                ((ahcc) this.d.get(str)).a.a((int) j);
            }
        }
    }
}
