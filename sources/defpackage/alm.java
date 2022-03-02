package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;

/* renamed from: alm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alm extends acg {
    final /* synthetic */ alo a;
    private final int e;
    private final int f;
    private final int g;
    private final alp h;

    public alm(alo alo, int i, int i2, int i3) {
        this.a = alo;
        this.e = i;
        this.f = i3;
        this.g = i2;
        this.h = (alp) alo.j.get(i3);
    }

    public final int a() {
        alp alp = this.h;
        if (alp != null) {
            return (alp.c - alp.b) + 1;
        }
        return 0;
    }

    public final /* bridge */ /* synthetic */ void b(adl adl) {
        ((aln) adl).a.setFocusable(this.a.isActivated());
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        TextView textView;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.e, viewGroup, false);
        int i2 = this.g;
        if (i2 != 0) {
            textView = (TextView) inflate.findViewById(i2);
        } else {
            textView = (TextView) inflate;
        }
        return new aln(inflate, textView);
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i) {
        alp alp;
        CharSequence charSequence;
        aln aln = (aln) adl;
        TextView textView = aln.s;
        boolean z = true;
        if (!(textView == null || (alp = this.h) == null)) {
            int i2 = alp.b + i;
            CharSequence[] charSequenceArr = alp.d;
            if (charSequenceArr == null) {
                charSequence = String.format(alp.e, new Object[]{Integer.valueOf(i2)});
            } else {
                charSequence = charSequenceArr[i2];
            }
            textView.setText(charSequence);
        }
        alo alo = this.a;
        View view = aln.a;
        if (((VerticalGridView) alo.i.get(this.f)).a() != i) {
            z = false;
        }
        alo.a(view, z, this.f, false);
    }
}
