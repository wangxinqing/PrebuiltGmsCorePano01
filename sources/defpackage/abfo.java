package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abfo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abfo {
    public final View a;
    private final ViewGroup b;
    private final jtf c;
    private final Map d;
    private boolean e;

    public abfo(Context context, ViewGroup viewGroup, jtf jtf) {
        LayoutInflater from = LayoutInflater.from(context);
        if (!azim.b()) {
            this.a = from.inflate(R.layout.cards_section, viewGroup, false);
        } else if (!azhl.a.a().j()) {
            this.a = from.inflate(R.layout.gm_cards_section, viewGroup, false);
        } else if (!azhr.a.a().e()) {
            this.a = from.inflate(R.layout.gm_cards_section_bugfix, viewGroup, false);
        } else {
            this.a = from.inflate(R.layout.gm_cards_section_bugfix_and_font_bugfix, viewGroup, false);
        }
        this.b = (ViewGroup) this.a.findViewById(R.id.cards_container);
        this.d = new HashMap();
        this.c = jtf;
    }

    public final void a() {
        this.b.removeAllViews();
        this.d.clear();
    }

    public final void b() {
        for (int i = 0; i < this.b.getChildCount(); i++) {
            View childAt = this.b.getChildAt(i);
            if (this.d.containsKey(childAt) && childAt.getGlobalVisibleRect(new Rect())) {
                this.c.a((jtg) this.d.get(childAt), new jth[0]);
            }
        }
    }

    public final void c() {
        this.a.setVisibility(0);
    }

    public final void d() {
        this.a.setVisibility(8);
    }

    public final boolean e() {
        if (!azim.b()) {
            return this.e;
        }
        for (int i = 0; i < this.b.getChildCount(); i++) {
            if (this.b.getChildAt(i).getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a(View view, int i, jtg jtg) {
        if (azim.b()) {
            this.b.addView(view, i);
            this.d.put(view, jtg);
            this.e = true;
        } else if (view.getVisibility() == 0) {
            this.b.addView(view, i);
            this.d.put(view, jtg);
            this.e = true;
        }
    }

    public final void a(View view, jtg jtg) {
        a(view, this.b.getChildCount(), jtg);
    }

    public final void a(String str) {
        TextView textView = (TextView) this.a.findViewById(R.id.title);
        textView.setText(str);
        if (azim.b()) {
            textView.setVisibility(0);
        } else {
            this.a.findViewById(R.id.title_container).setVisibility(0);
        }
    }
}
