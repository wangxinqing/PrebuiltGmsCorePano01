package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;

/* renamed from: dbi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dbi extends dew {
    public dfx a;
    public SwipeRefreshLayout b;
    private djk c;

    public static dbi a(dfw dfw) {
        dbi dbi = new dbi();
        Bundle bundle = new Bundle();
        bundle.putByteArray("screenKey", csm.b(((dff) dfw).a));
        dbi.setArguments(bundle);
        return dbi;
    }

    public final boolean a(aqpp aqpp) {
        return (aqpp.a & 32) != 0;
    }

    public final aqsr aC() {
        return this.a.a();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 9) {
            dfx dfx = this.a;
            dfx.b.a(((dff) dfx.a).a);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.c = ((czx) activity).b().a();
        dfw a2 = dfw.a(csm.d(getArguments().getByteArray("screenKey")));
        did c2 = ((die) activity).c();
        dfx dfx = new dfx(a2, c2.a, c2.b);
        this.a = dfx;
        dfx.d.a(this, new daz(this));
        this.a.b.d.a(this, new dba(this));
        this.a.g.a(this, new dbb(this));
        this.a.e.a(this, new dbc(this));
        this.a.f.a(this, new dbd(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.as_card_screen_fragment, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_refresh_layout);
        this.b = swipeRefreshLayout;
        que.a(swipeRefreshLayout);
        SwipeRefreshLayout swipeRefreshLayout2 = this.b;
        dfx dfx = this.a;
        dfx.getClass();
        swipeRefreshLayout2.a = new dbe(dfx);
        SwipeRefreshLayout swipeRefreshLayout3 = this.b;
        swipeRefreshLayout3.b(swipeRefreshLayout3.i);
        this.j = (cye) inflate.findViewById(R.id.cards_list);
        ((CardDeckView) this.j).a = new dbf(this);
        ((CardDeckView) this.j).c = new dbg(this);
        CardDeckView cardDeckView = (CardDeckView) this.j;
        djk djk = this.c;
        agcf a2 = ((cxx) getActivity()).a();
        if (cardDeckView.f == null && cardDeckView.g == null) {
            z = true;
        }
        amrl.b(z, (Object) "initialize() should be called exactly once.");
        cardDeckView.f = djk;
        cardDeckView.g = a2;
        a(bundle);
        return inflate;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return ((CardDeckView) this.j).getResources().getDimensionPixelSize(R.dimen.as_card_deck_vertical_padding);
    }
}
