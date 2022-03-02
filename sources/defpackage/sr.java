package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;

/* renamed from: sr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class sr {
    public final sn a;
    private final int b;

    public sr(Context context) {
        this(context, ss.a(context, 0));
    }

    public final Context a() {
        return this.a.a;
    }

    public final void a(DialogInterface.OnDismissListener onDismissListener) {
        this.a.n = onDismissListener;
    }

    public final void a(DialogInterface.OnKeyListener onKeyListener) {
        this.a.o = onKeyListener;
    }

    public final void a(Drawable drawable) {
        this.a.d = drawable;
    }

    public final void a(View view) {
        this.a.f = view;
    }

    public void a(CharSequence charSequence) {
        this.a.g = charSequence;
    }

    public final void a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        sn snVar = this.a;
        snVar.j = charSequence;
        snVar.k = onClickListener;
    }

    public final void a(boolean z) {
        this.a.l = z;
    }

    public final void a(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        sn snVar = this.a;
        snVar.p = charSequenceArr;
        snVar.r = onClickListener;
        snVar.w = i;
        snVar.v = true;
    }

    public ss b() {
        int i;
        ss ssVar = new ss(this.a.a, this.b);
        sn snVar = this.a;
        sq sqVar = ssVar.a;
        View view = snVar.f;
        if (view == null) {
            CharSequence charSequence = snVar.e;
            if (charSequence != null) {
                sqVar.a(charSequence);
            }
            Drawable drawable = snVar.d;
            if (drawable != null) {
                sqVar.u = drawable;
                sqVar.t = 0;
                ImageView imageView = sqVar.v;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    sqVar.v.setImageDrawable(drawable);
                }
            }
            int i2 = snVar.c;
            if (i2 != 0) {
                sqVar.u = null;
                sqVar.t = i2;
                ImageView imageView2 = sqVar.v;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    sqVar.v.setImageResource(sqVar.t);
                }
            }
        } else {
            sqVar.y = view;
        }
        CharSequence charSequence2 = snVar.g;
        if (charSequence2 != null) {
            sqVar.b(charSequence2);
        }
        CharSequence charSequence3 = snVar.h;
        if (charSequence3 != null) {
            sqVar.a(-1, charSequence3, snVar.i);
        }
        CharSequence charSequence4 = snVar.j;
        if (charSequence4 != null) {
            sqVar.a(-2, charSequence4, snVar.k);
        }
        if (!(snVar.p == null && snVar.q == null)) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) snVar.b.inflate(sqVar.D, (ViewGroup) null);
            if (snVar.v) {
                i = sqVar.E;
            } else {
                i = sqVar.F;
            }
            ListAdapter listAdapter = snVar.q;
            if (listAdapter == null) {
                listAdapter = new sp(snVar.a, i, snVar.p);
            }
            sqVar.z = listAdapter;
            sqVar.A = snVar.w;
            if (snVar.r != null) {
                alertController$RecycleListView.setOnItemClickListener(new sm(snVar, sqVar));
            }
            if (snVar.v) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            sqVar.f = alertController$RecycleListView;
        }
        View view2 = snVar.t;
        if (view2 == null) {
            int i3 = snVar.s;
            if (i3 != 0) {
                sqVar.g = null;
                sqVar.h = i3;
                sqVar.i = false;
            }
        } else {
            sqVar.b(view2);
        }
        ssVar.setCancelable(this.a.l);
        if (this.a.l) {
            ssVar.setCanceledOnTouchOutside(true);
        }
        ssVar.setOnCancelListener(this.a.m);
        ssVar.setOnDismissListener(this.a.n);
        DialogInterface.OnKeyListener onKeyListener = this.a.o;
        if (onKeyListener != null) {
            ssVar.setOnKeyListener(onKeyListener);
        }
        return ssVar;
    }

    public final void b(View view) {
        sn snVar = this.a;
        snVar.t = view;
        snVar.s = 0;
        snVar.u = false;
    }

    public final void b(CharSequence charSequence) {
        this.a.e = charSequence;
    }

    public final void b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        sn snVar = this.a;
        snVar.h = charSequence;
        snVar.i = onClickListener;
    }

    public final ss c() {
        ss b2 = b();
        b2.show();
        return b2;
    }

    public sr(Context context, int i) {
        this.a = new sn(new ContextThemeWrapper(context, ss.a(context, i)));
        this.b = i;
    }

    public final void a(int i) {
        sn snVar = this.a;
        snVar.e = snVar.a.getText(i);
    }

    public final void a(int i, DialogInterface.OnClickListener onClickListener) {
        sn snVar = this.a;
        snVar.j = snVar.a.getText(i);
        this.a.k = onClickListener;
    }

    public void b(int i) {
        sn snVar = this.a;
        snVar.g = snVar.a.getText(i);
    }

    public final void b(int i, DialogInterface.OnClickListener onClickListener) {
        sn snVar = this.a;
        snVar.h = snVar.a.getText(i);
        this.a.i = onClickListener;
    }
}
