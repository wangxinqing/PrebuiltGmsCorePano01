package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: anb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anb extends adl {
    public final Drawable s;
    public ColorStateList t;
    public boolean u;
    public boolean v;
    private final SparseArray w = new SparseArray(4);

    public anb(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(16908310);
        this.w.put(16908310, textView);
        this.w.put(16908304, view.findViewById(16908304));
        this.w.put(16908294, view.findViewById(16908294));
        this.w.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.w.put(16908350, view.findViewById(16908350));
        this.s = view.getBackground();
        if (textView != null) {
            this.t = textView.getTextColors();
        }
    }

    public final View c(int i) {
        View view = (View) this.w.get(i);
        if (view == null && (view = this.a.findViewById(i)) != null) {
            this.w.put(i, view);
        }
        return view;
    }
}
