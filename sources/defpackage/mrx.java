package defpackage;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import java.util.List;

/* renamed from: mrx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mrx extends acg {
    public final mrm a;
    public List e;
    private final View.OnClickListener f;

    public mrx(Activity activity, RecyclerView recyclerView) {
        this.a = (mrm) activity;
        this.f = new mrv(this, recyclerView);
    }

    public final int a() {
        List list = this.e;
        if (list == null) {
            return 0;
        }
        if (list.isEmpty()) {
            return 1;
        }
        return this.e.size();
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater from = LayoutInflater.from(this.a);
        if (!aymw.U()) {
            i2 = R.layout.fast_pair_devices_list_item;
        } else {
            i2 = R.layout.devices_list_item_device;
        }
        View inflate = from.inflate(i2, viewGroup, false);
        inflate.setOnClickListener(this.f);
        return new mrw(inflate);
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i) {
        mrw mrw = (mrw) adl;
        amrl.a((Object) this.e, (Object) "Devices list should not be null - getItemCount() returns 0 for that case.");
        if (this.e.isEmpty()) {
            mrw.a(this.a.getString(R.string.fast_pair_no_devices));
            mrw.a((Bitmap) null);
            mrw.a.setClickable(false);
            return;
        }
        mrw.a.setClickable(aymw.U());
        try {
            uaj uaj = (uaj) aucj.a((aucj) uaj.K, ((tzj) this.e.get(i)).c.k(), aubs.c());
            mrw.a(uaj.h);
            mrw.a(mru.a(uaj));
        } catch (auda e2) {
            anih anih = (anih) mte.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("mrx", "a", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to parse discovery item.");
            mrw.a((String) null);
        }
    }

    public final void a(List list) {
        this.e = list;
        as();
    }

    public final void a(mrw mrw, int i) {
        amrl.a((Object) this.e, (Object) "Devices list should not be null - getItemCount() returns 0 for that case.");
        if (this.e.isEmpty()) {
            mrw.a(this.a.getString(R.string.fast_pair_no_devices));
            mrw.a((Bitmap) null);
            mrw.a.setClickable(false);
            return;
        }
        mrw.a.setClickable(aymw.U());
        try {
            uaj uaj = (uaj) aucj.a((aucj) uaj.K, ((tzj) this.e.get(i)).c.k(), aubs.c());
            mrw.a(uaj.h);
            mrw.a(mru.a(uaj));
        } catch (auda e2) {
            anih anih = (anih) mte.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("mrx", "a", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to parse discovery item.");
            mrw.a((String) null);
        }
    }
}
