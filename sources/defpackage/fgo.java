package defpackage;

import com.google.android.chimera.Fragment;

/* renamed from: fgo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fgo implements z {
    private final fgp a;
    private final String b;

    public fgo(fgp fgp, String str) {
        this.a = fgp;
        this.b = str;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c() {
        if (!this.a.c.containsKey(this.b)) {
            this.a.c.put(this.b, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void a(aj ajVar) {
        Fragment fragment = (Fragment) ajVar;
        if (!fragment.getActivity().isChangingConfigurations() && fragment.isRemoving()) {
            this.a.c.remove(this.b);
        }
    }
}
