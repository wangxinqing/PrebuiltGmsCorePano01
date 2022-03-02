package defpackage;

import com.google.android.pano.chimera.Action;

/* renamed from: akdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akdt extends akeb implements akdo, akdp, akdq {
    public final akef a;
    public akdr b;
    public boolean c;
    public final boolean d;
    public int e;
    public akdo f = null;

    public akdt(akef akef) {
        super(akef);
        this.a = akef;
        this.e = -1;
        this.d = true;
    }

    public final void a(Action action) {
        if (action.k) {
            akdo akdo = this.f;
            if (akdo != null) {
                akdo.a(action);
            } else if (this.a.getActivity() instanceof akdo) {
                ((akdo) this.a.getActivity()).a(action);
            }
        }
    }

    public final void b(Action action) {
        if (this.a.getActivity() instanceof akdp) {
            ((akdp) this.a.getActivity()).b(action);
        }
    }

    public final void c(Action action) {
        if (this.a.getActivity() instanceof akdq) {
            ((akdq) this.a.getActivity()).c(action);
        }
    }

    public final void d(Action action) {
        if (this.a.getActivity() instanceof akdq) {
            ((akdq) this.a.getActivity()).d(action);
        }
    }
}
