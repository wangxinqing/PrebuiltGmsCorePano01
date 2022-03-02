package defpackage;

import com.google.android.gms.R;

/* renamed from: czz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class czz implements ax {
    private final dac a;

    public czz(dac dac) {
        this.a = dac;
    }

    public final void a(Object obj) {
        dac dac = this.a;
        cso cso = (cso) obj;
        dau dau = (dau) dac.getChildFragmentManager().findFragmentByTag("bottom_drawer");
        if (dau != null) {
            dac.getChildFragmentManager().beginTransaction().remove(dau).commitNow();
            dez.b(dac.getView().findViewById(R.id.bottom_nav_ui_container));
        }
    }
}
