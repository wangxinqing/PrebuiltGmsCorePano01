package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: sup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sup extends sze {
    private String q;
    private long r = -1;
    private Set s;

    public sup(szf szf) {
        super(szf);
    }

    public final String a(String str, long j) {
        return a("com.google.android.gms.ads.social.GmsDoritosProvider", str, j);
    }

    /* access modifiers changed from: package-private */
    public final String a(String str, String str2, long j) {
        if (this.r < 0 || o().b() > this.r + 120000) {
            try {
                this.r = o().b();
                Class<?> cls = Class.forName(str);
                Object newInstance = cls.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{n()});
                this.q = (String) ((Future) cls.getMethod("getDoritosCookieAsynchronously", new Class[]{String.class}).invoke(newInstance, new Object[]{str2})).get(j, TimeUnit.MILLISECONDS);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | InterruptedException | NoSuchMethodException | InvocationTargetException | ExecutionException | TimeoutException e) {
                if (this.s == null) {
                    this.s = new HashSet();
                }
                if (!this.s.contains(str2)) {
                    this.s.add(str2);
                    E().f.a("Failed to get dsid. appId, exception type, exception", sut.a(str2), sut.a(e.getClass().getName()), e);
                }
            }
        }
        return this.q;
    }
}
