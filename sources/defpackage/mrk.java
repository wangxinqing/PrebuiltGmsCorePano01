package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mrk extends acg {
    public final Context a;
    public final List e = new ArrayList();
    public View f;
    private RecyclerView g;

    public mrk(Context context) {
        this.a = context;
        a(true);
    }

    private static void a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    private final DiscoveryListItem f(int i) {
        return (DiscoveryListItem) this.e.get(i);
    }

    public final long J(int i) {
        return (long) f(i).a.hashCode();
    }

    public final void c() {
        if (this.f != null) {
            int i = 0;
            a((View) this.g, !this.e.isEmpty() ? 0 : 8);
            View view = this.f;
            if (!this.e.isEmpty()) {
                i = 8;
            }
            a(view, i);
        }
    }

    public final int a() {
        return this.e.size();
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        return new mrj(LayoutInflater.from(this.a).inflate(R.layout.devices_list_item_device, viewGroup, false));
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i) {
        mrj mrj = (mrj) adl;
        DiscoveryListItem f2 = f(i);
        if (mrj.a(f2)) {
            mrj.a(f2.b);
        } else {
            mrj.a(f2.e);
        }
        if (mrj.a(f2)) {
            mrj.b(mrj.a(R.string.common_tap_to_pair, new Object[0]));
        } else if (!arxk.a(mrj.v(), f2.f)) {
            mrj.b(mrj.a(R.string.common_tap_to_install_app, f2.e));
        } else {
            mrj.b(mrj.a(R.string.common_tap_to_open_app, f2.e));
        }
        mrj.s.setImageBitmap(f2.j);
        mrj.a.setOnClickListener(new mri(this, f2));
    }

    public final void a(RecyclerView recyclerView) {
        this.g = recyclerView;
        c();
    }
}
