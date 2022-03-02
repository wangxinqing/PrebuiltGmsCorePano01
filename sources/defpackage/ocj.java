package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ocj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ocj extends Spinner implements ocz, obm, obf {
    public oct a = null;
    private final boolean b;
    private obg c;
    private List d = null;

    public ocj(Context context, obg obg, avnj avnj) {
        super(context);
        this.c = obg;
        boolean z = avnj.d;
        this.b = z;
        if (z) {
            setOnItemSelectedListener(new och(this));
        }
        setTag(avnj.b);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        aucx aucx = avnj.f;
        int size = aucx.size();
        int i = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            avnl avnl = (avnl) aucx.get(i3);
            arrayList.add(avnl.b);
            arrayList2.add(jlh.a(avnl.c));
            if (avnl.d) {
                i = i2;
            }
            i2++;
        }
        setAdapter(new ocw(context, arrayList2, arrayList));
        if (i >= 0) {
            setSelection(i);
        }
        this.c.a(this);
    }

    public final void a(List list) {
        this.d = list;
        setOnItemSelectedListener(new oci(this));
    }

    public final void a(oct oct) {
        this.a = oct;
    }

    public final List aY() {
        if (this.b) {
            return Collections.singletonList(this);
        }
        return Collections.emptyList();
    }

    public final boolean b() {
        return this.c.getVisibility() == 0;
    }

    public final List c() {
        String d2 = d();
        if (d2 == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(oaq.a((String) getTag(), d2));
    }

    public final String d() {
        View selectedView = getSelectedView();
        if (selectedView != null) {
            return (String) selectedView.getTag();
        }
        return null;
    }

    public final void e() {
        List list = this.d;
        if (list != null) {
            ocv.a(list);
            oct oct = this.a;
            if (oct != null) {
                oct.a();
            }
        }
    }

    public final boolean a() {
        return getSelectedView() != null;
    }
}
