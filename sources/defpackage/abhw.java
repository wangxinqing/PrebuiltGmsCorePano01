package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: abhw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abhw {
    public final Context a;
    public final View b;
    public final jsx c;
    public final avjd d;
    public final Resources e;
    public abhv f;
    public Button g;
    public Button h;
    public View i;
    public View j;
    public final abfj k;
    private final LayoutInflater l;

    public abhw(Context context, View view, jsx jsx, avjd avjd, abfj abfj) {
        this.a = context;
        this.b = view;
        this.c = jsx;
        this.d = avjd;
        this.k = abfj;
        this.e = context.getResources();
        this.l = LayoutInflater.from(context);
    }

    public final void a() {
        this.i.setVisibility(0);
        this.g.setEnabled(false);
        this.h.setEnabled(false);
    }

    public final void b() {
        this.i.setVisibility(8);
        this.g.setEnabled(true);
        this.h.setEnabled(true);
    }

    public final void c() {
        this.b.setVisibility(8);
    }

    public final void a(ViewGroup viewGroup, String str) {
        TextView textView;
        if (azim.b()) {
            textView = (TextView) this.l.inflate(R.layout.gm_merge_card_subentry, viewGroup, false);
        } else {
            textView = (TextView) this.l.inflate(R.layout.merge_card_subentry, viewGroup, false);
        }
        textView.setText(str);
        viewGroup.addView(textView);
    }
}
