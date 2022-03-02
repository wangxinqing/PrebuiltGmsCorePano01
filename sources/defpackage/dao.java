package defpackage;

import com.google.android.chimera.Activity;

/* renamed from: dao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dao implements dat {
    private final dau a;

    public dao(dau dau) {
        this.a = dau;
    }

    public final void a() {
        Activity activity = this.a.getActivity();
        if (qud.b != null) {
            boolean booleanValue = qud.b.booleanValue();
            qud.b = null;
            if (booleanValue != qud.h()) {
                activity.recreate();
            }
        }
    }
}
