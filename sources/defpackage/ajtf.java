package defpackage;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* renamed from: ajtf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajtf implements wr {
    final /* synthetic */ BottomNavigationView a;

    public ajtf(BottomNavigationView bottomNavigationView) {
        this.a = bottomNavigationView;
    }

    public final void a(wt wtVar) {
    }

    public final boolean a(wt wtVar, MenuItem menuItem) {
        daa daa = this.a.d;
        if (daa == null) {
            return false;
        }
        dac dac = daa.a;
        if (dac.f) {
            return false;
        }
        int b = dac.b(((ww) menuItem).a);
        if (b < 0 || b >= dac.e.size()) {
            return true;
        }
        aqpz aqpz = (aqpz) dac.e.get(b);
        int i = aqpz.b;
        if (i == 2) {
            dac.a.a(dac.aC(), (aqsr) aqpz.c, 3);
            return true;
        } else if (i != 3) {
            return true;
        } else {
            dez.a(dac.getView().findViewById(R.id.bottom_nav_ui_container));
            aqsr aC = dac.aC();
            aqsr a2 = dac.a.a();
            dau dau = new dau();
            Bundle bundle = new Bundle();
            bundle.putByteArray("bottomNavKey", csm.b(a2));
            bundle.putInt("selectedTabKey", b);
            bundle.putByteArray("selectedViewKey", csm.b(aC));
            dau.setArguments(bundle);
            dac.a.e.a(dac.aC().b, 10203, 3);
            dac.getChildFragmentManager().beginTransaction().add(R.id.menu_drawer_container, dau, "bottom_drawer").commitNow();
            return true;
        }
    }
}
