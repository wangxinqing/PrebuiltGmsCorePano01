package defpackage;

import com.google.android.chimera.Fragment;

/* renamed from: fgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fgq {
    private final fgp a;
    private final String b;

    public fgq(Fragment fragment, String str) {
        iva.b(fragment instanceof aj, "Fragment must implement LifecycleOwner");
        iva.a((Object) str);
        this.b = str;
        this.a = (fgp) qck.a(fragment.getActivity()).a(fgp.class);
        ((aj) fragment).getLifecycle().a(new fgo(this.a, str));
    }

    public final boolean a() {
        return this.a.c.containsKey(this.b);
    }

    public final long b() {
        iva.b(a(), "Page not started yet");
        long currentTimeMillis = System.currentTimeMillis();
        iva.b(a(), "Page not started yet");
        return currentTimeMillis - ((Long) this.a.c.get(this.b)).longValue();
    }
}
