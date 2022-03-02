package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* renamed from: sn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sn {
    public final Context a;
    public final LayoutInflater b;
    public int c = 0;
    public Drawable d;
    public CharSequence e;
    public View f;
    public CharSequence g;
    public CharSequence h;
    public DialogInterface.OnClickListener i;
    public CharSequence j;
    public DialogInterface.OnClickListener k;
    public boolean l;
    public DialogInterface.OnCancelListener m;
    public DialogInterface.OnDismissListener n;
    public DialogInterface.OnKeyListener o;
    public CharSequence[] p;
    public ListAdapter q;
    public DialogInterface.OnClickListener r;
    public int s;
    public View t;
    public boolean u = false;
    public boolean v;
    public int w = -1;

    public sn(Context context) {
        this.a = context;
        this.l = true;
        this.b = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
