package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: fzj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fzj {
    private static WeakReference a = null;

    public static synchronized fzj a() {
        fzj fzj;
        synchronized (fzj.class) {
            if (a != null) {
                fzj = (fzj) a.get();
            } else {
                fzj = null;
            }
            if (fzj == null) {
                fzj = new fzj();
                a = new WeakReference(fzj);
            }
        }
        return fzj;
    }
}
