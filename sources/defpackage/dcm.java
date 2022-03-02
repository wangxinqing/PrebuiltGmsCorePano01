package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: dcm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dcm extends dex {
    public dgw a;
    public SwipeRefreshLayout b;
    public djk c;

    /* access modifiers changed from: protected */
    public final boolean a(aqpp aqpp) {
        return (aqpp.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
    }

    public final aqsr aC() {
        return ((dfh) this.a.a).a;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 9) {
            dgw dgw = this.a;
            dgw.b.a(((dfh) dgw.a).a);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        dgv a2 = dgv.a(csm.d(getArguments().getByteArray("screenKey")));
        did c2 = ((die) getActivity()).c();
        this.a = new dgw(a2, c2.a, c2.b);
        this.c = ((czx) activity).b().a();
        this.a.c.a(this, new dci(this));
        this.a.d.a(this, new dcj(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.as_message_screen_fragment, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_refresh_layout);
        this.b = swipeRefreshLayout;
        que.a(swipeRefreshLayout);
        SwipeRefreshLayout swipeRefreshLayout2 = this.b;
        dgw dgw = this.a;
        dgw.getClass();
        swipeRefreshLayout2.a = new dck(dgw);
        SwipeRefreshLayout swipeRefreshLayout3 = this.b;
        swipeRefreshLayout3.b(swipeRefreshLayout3.i);
        return inflate;
    }
}
