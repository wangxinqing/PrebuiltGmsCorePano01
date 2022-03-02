package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: jre  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jre implements ax {
    public int a;
    public final jtf b;
    public final jsx c;
    public final Activity d;
    public final String e;
    public final View f;
    private final ViewGroup g;
    private final ViewGroup h;
    private final List i = new ArrayList();

    public jre(View view, Activity activity, String str, jsx jsx, jtf jtf) {
        this.f = view;
        this.g = (ViewGroup) view.findViewById(R.id.row1);
        this.h = (ViewGroup) view.findViewById(R.id.row2);
        this.d = activity;
        this.e = str;
        this.c = jsx;
        this.b = jtf;
        view.setVisibility(8);
        ViewGroup[] viewGroupArr = {this.g, this.h};
        for (int i2 = 0; i2 < 2; i2++) {
            ViewGroup viewGroup = viewGroupArr[i2];
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                this.i.add(new jrd(this, viewGroup.getChildAt(i3)));
            }
        }
    }

    public final void a(amri amri) {
        if (!amri.a() || ((avjo) amri.b()).a.isEmpty()) {
            this.f.setVisibility(8);
            return;
        }
        this.a = 300;
        avjo avjo = (avjo) amri.b();
        Iterator it = avjo.a.iterator();
        List list = this.i;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            jrd jrd = (jrd) list.get(i2);
            if (it.hasNext()) {
                avjq avjq = (avjq) it.next();
                jre jre = jrd.c;
                String str = avjq.c;
                if (TextUtils.isEmpty(str)) {
                    str = avjq.d;
                }
                if (TextUtils.isEmpty(str)) {
                    str = azid.b();
                }
                String a2 = iqv.a(jpr.b(str), jre.f.getResources().getDimensionPixelSize(R.dimen.gm_card_avatar_diameter));
                jre jre2 = jrd.c;
                jsx jsx = jre2.c;
                int i3 = jre2.a;
                jre2.a = i3 + 1;
                jsx.a(a2, i3, new jrb(jrd));
                if (!avjq.a.isEmpty()) {
                    jrd.a.setText(avjq.a);
                }
                if (!avjq.b.isEmpty()) {
                    String str2 = avjq.b;
                    if (jrd.c.e != null) {
                        jrd.b.setOnClickListener(new jrc(jrd, str2));
                    }
                }
                jrd.a(0);
            } else {
                jrd.a(4);
            }
        }
        if (avjo.a.size() <= this.g.getChildCount()) {
            this.h.setVisibility(8);
        }
        this.f.setVisibility(0);
    }
}
