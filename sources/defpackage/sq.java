package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: sq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sq {
    int A = -1;
    public final int B;
    public final int C;
    final int D;
    final int E;
    final int F;
    public final boolean G;
    final Handler H;
    public final View.OnClickListener I = new sh(this);
    public final Context a;
    final tp b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    ListView f;
    public View g;
    public int h;
    public boolean i = false;
    Button j;
    public CharSequence k;
    Message l;
    Button m;
    public CharSequence n;
    Message o;
    Button p;
    public CharSequence q;
    Message r;
    NestedScrollView s;
    public int t = 0;
    public Drawable u;
    public ImageView v;
    public TextView w;
    public TextView x;
    public View y;
    ListAdapter z;

    public sq(Context context, tp tpVar, Window window) {
        this.a = context;
        this.b = tpVar;
        this.c = window;
        this.H = new so(tpVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, uh.e, R.attr.alertDialogStyle, 0);
        this.B = obtainStyledAttributes.getResourceId(0, 0);
        this.C = obtainStyledAttributes.getResourceId(2, 0);
        this.D = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.E = obtainStyledAttributes.getResourceId(7, 0);
        this.F = obtainStyledAttributes.getResourceId(3, 0);
        this.G = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        tpVar.c();
    }

    public static final ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void b(View view) {
        this.g = view;
        this.h = 0;
        this.i = false;
    }

    public final void b(CharSequence charSequence) {
        this.e = charSequence;
        TextView textView = this.x;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public static void a(View view, View view2, View view3) {
        int i2;
        int i3 = 4;
        if (view2 != null) {
            if (!view.canScrollVertically(-1)) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            view2.setVisibility(i2);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i3 = 0;
            }
            view3.setVisibility(i3);
        }
    }

    public static final void a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.H.obtainMessage(i2, onClickListener) : null;
        if (i2 == -3) {
            this.q = charSequence;
            this.r = obtainMessage;
        } else if (i2 != -2) {
            this.k = charSequence;
            this.l = obtainMessage;
        } else {
            this.n = charSequence;
            this.o = obtainMessage;
        }
    }

    public final void a(CharSequence charSequence) {
        this.d = charSequence;
        TextView textView = this.w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
