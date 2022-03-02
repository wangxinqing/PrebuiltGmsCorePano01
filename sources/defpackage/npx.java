package defpackage;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.util.HashMap;

/* renamed from: npx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class npx {
    private static final HashMap c = new HashMap();
    public npq a;
    public final Object b = new Object();
    private final Context d;
    private final nnt e;
    private final bhg f;

    public npx(Context context, bhg bhg, nnt nnt) {
        this.d = context;
        this.f = bhg;
        this.e = nnt;
    }

    private static long a(long j) {
        return System.currentTimeMillis() - j;
    }

    private final synchronized Class b(npr npr) {
        String str = npr.a.b;
        Class cls = (Class) c.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            File file = npr.c;
            if (!file.exists()) {
                file.mkdirs();
            }
            Class loadClass = new DexClassLoader(npr.b.getAbsolutePath(), file.getAbsolutePath(), (String) null, this.d.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
            c.put(str, loadClass);
            return loadClass;
        } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e2) {
            throw new npw(2008, e2);
        }
    }

    public final void a(npr npr) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Class b2 = b(npr);
            npq npq = new npq(b2.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE}).newInstance(new Object[]{this.d, "msa-r", npr.a(), null, new Bundle(), 2}), npr, this.f, this.e);
            if (npq.a()) {
                int c2 = npq.c();
                if (c2 == 0) {
                    synchronized (this.b) {
                        npq npq2 = this.a;
                        if (npq2 != null) {
                            try {
                                npq2.b();
                            } catch (npw e2) {
                                this.e.a(e2.a, -1, e2);
                            }
                        }
                        this.a = npq;
                    }
                    this.e.a(3000, a(currentTimeMillis));
                    return;
                }
                StringBuilder sb = new StringBuilder(15);
                sb.append("ci: ");
                sb.append(c2);
                throw new npw(4001, sb.toString());
            }
            throw new npw(4000, "init failed");
        } catch (Exception e3) {
            throw new npw(2004, (Throwable) e3);
        } catch (npw e4) {
            this.e.a(e4.a, a(currentTimeMillis), e4);
        } catch (Exception e5) {
            this.e.a(4010, a(currentTimeMillis), e5);
        }
    }
}
