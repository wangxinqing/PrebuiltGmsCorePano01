package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.plus.sharebox.Circle;
import java.util.ArrayList;

/* renamed from: zkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zkx extends BaseAdapter implements SpinnerAdapter {
    public final ArrayList a;
    private final Context b;
    private final LayoutInflater c;

    public zkx(Context context, ArrayList arrayList) {
        this.b = context;
        this.c = LayoutInflater.from(context);
        if (arrayList == null) {
            this.a = new ArrayList();
        } else {
            this.a = arrayList;
        }
    }

    private final Circle a(int i) {
        if (this.a.isEmpty()) {
            return i != 0 ? Circle.a(this.b) : Circle.b;
        }
        if (a()) {
            return this.a.size() == i ? Circle.a(this.b) : (Circle) this.a.get(i);
        }
        if (i == 0) {
            return Circle.b;
        }
        if (i > this.a.size()) {
            return Circle.a(this.b);
        }
        return (Circle) this.a.get(i - 1);
    }

    public final int getCount() {
        if (this.a.isEmpty() || !a()) {
            return this.a.size() + 2;
        }
        return this.a.size() + 1;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        LinearLayout linearLayout;
        if (view == null) {
            linearLayout = (LinearLayout) this.c.inflate(R.layout.plus_sharebox_spinner_dropdown_item, viewGroup, false);
        } else {
            linearLayout = (LinearLayout) view;
        }
        a(linearLayout, a(i), true);
        return linearLayout;
    }

    public final Object getItem(int i) {
        return a(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        if (view == null) {
            textView = (TextView) this.c.inflate(17367048, viewGroup, false);
        } else {
            textView = (TextView) view;
        }
        a(textView, a(i), false);
        return textView;
    }

    private final void a(View view, Circle circle, boolean z) {
        if (z) {
            TextView textView = (TextView) view.findViewById(R.id.dropdown_item_text);
            ImageView imageView = (ImageView) view.findViewById(R.id.dropdown_item_icon);
            imageView.setVisibility(8);
            if (a(circle)) {
                textView.setText(circle.e);
                imageView.setImageDrawable(this.b.getResources().getDrawable(R.drawable.plus_iconic_ic_add_to_circles_darkgrey_16));
                imageView.setVisibility(0);
            } else {
                int i = circle.f;
                if (i > 0) {
                    textView.setText(this.b.getString(R.string.plus_sharebox_circles_option, new Object[]{circle.e, Integer.valueOf(i)}));
                } else {
                    textView.setText(circle.e);
                }
            }
            int i2 = Build.VERSION.SDK_INT;
        } else if (a(circle)) {
            ((TextView) view).setText("");
        } else {
            ((TextView) view).setText(circle.e);
        }
        view.setTag(circle);
    }

    private final boolean a(Circle circle) {
        return Circle.a(this.b) == circle;
    }

    public final boolean a() {
        String a2 = zkw.a(this.b);
        if (a2 != null) {
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                if (a2.equalsIgnoreCase(((Circle) this.a.get(i)).e)) {
                    return true;
                }
            }
        }
        return false;
    }
}
