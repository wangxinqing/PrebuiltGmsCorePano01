package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: dqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dqk extends acg implements LoaderManager.LoaderCallbacks {
    public long a;
    public List e = new ArrayList();
    public dqj f;
    public WeakReference g;
    private final Context h;

    public dqk(Context context, long j) {
        this.h = context;
        this.a = j;
    }

    public final int a() {
        return this.e.size();
    }

    public final void c() {
        WeakReference weakReference = this.g;
        if (weakReference == null || weakReference.get() == null || ((RecyclerView) this.g.get()).isComputingLayout()) {
            dqh dqh = new dqh(this);
            WeakReference weakReference2 = this.g;
            if (weakReference2 != null && weakReference2.get() != null) {
                ((RecyclerView) this.g.get()).post(dqh);
                return;
            }
            return;
        }
        as();
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        if (i != 0) {
            return null;
        }
        return new dqr(this.h, this.a, jed.d(System.currentTimeMillis()));
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        this.e = arrayList;
        Collections.sort(arrayList, Collections.reverseOrder());
        c();
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(17367044, viewGroup, false);
        dqi dqi = new dqi(this, inflate);
        inflate.setOnClickListener(dqi);
        return dqi;
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i) {
        String str;
        String str2;
        dqi dqi = (dqi) adl;
        jef jef = (jef) this.e.get(i);
        jee b = jef.b(-1);
        String f2 = b.f();
        String a2 = izi.a(b.l);
        if (a2 == null) {
            a2 = "Unknown";
        }
        if (!jkr.c() || !((Boolean) jcd.g.c()).booleanValue() || !(jef instanceof jef)) {
            jdy a3 = ((jdz) jef).b(-1);
            str2 = a3.b;
            str = String.format("Background: %s\nForeground: %s\nTotal: %s", new Object[]{jee.a(a3.a()), jee.a(a3.b()), jee.a(a3.e())});
        } else {
            str = String.format("Total: %s", new Object[]{jee.a(jef.b(-1).e())});
            str2 = "N/A";
        }
        dqi.t.setText(str);
        dqi.s.setText(String.format("%s (%s, %s)", new Object[]{a2, str2, f2}));
    }
}
