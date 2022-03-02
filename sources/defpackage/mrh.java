package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mrh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mrh extends acg {
    public final aoe a;
    public final Uri e;
    public final List f = new ArrayList();
    private final Context g;

    public mrh(Context context, aoe aoe, Uri uri) {
        this.g = context;
        this.a = aoe;
        this.e = uri;
    }

    public final int a() {
        return this.f.size();
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f.clear();
        try {
            this.a.a(this.e);
            this.f.addAll(mty.a(this.a.c(this.e)));
        } catch (IllegalArgumentException e2) {
            anih anih = (anih) mte.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("mrh", "c", 48, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetailsSliceItemAdapter.updateSliceItem meet exception, optional module might not be installed.");
        }
        ((anih) ((anih) mte.a.d()).a("mrh", "c", 52, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("updateSliceItem called, Get slice items %d", this.f.size());
        as();
    }

    public final void d() {
        try {
            this.a.b(this.e);
        } catch (IllegalStateException | NullPointerException e2) {
            anih anih = (anih) mte.a.c();
            anih.a(e2);
            ((anih) anih.a("mrh", "d", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetailsSliceItemAdapter.unpinSlice meet exception!");
        }
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        return new mrg(LayoutInflater.from(this.g).inflate(R.layout.fast_pair_device_details_slice_item, viewGroup, false));
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i) {
        mrg mrg = (mrg) adl;
        mtx mtx = (mtx) this.f.get(i);
        mrg.s.setText(mtx.a());
        mrg.t.setText(mtx.b());
        mrg.u.setImageIcon(mtx.c().e());
        mrg.a.setOnClickListener(new mrf(this, mtx));
    }

    public final void a(mtx mtx) {
        try {
            mtx.d().send(this.g, 0, (Intent) null);
        } catch (PendingIntent.CanceledException e2) {
            anih anih = (anih) mte.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("mrh", "a", 93, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetailsSliceItemAdapter.onItemClicked failed with item:%s", (Object) mtx.a());
        }
    }
}
