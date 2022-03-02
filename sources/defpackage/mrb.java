package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: mrb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mrb extends BaseAdapter {
    public String a;
    public int b;
    public int c = R.layout.fm_date_spinner_text;
    private final LayoutInflater d;
    private final int e;
    private final int f;
    private final int g = R.layout.fm_date_spinner_text;

    public mrb(Context context, String str) {
        this.d = (LayoutInflater) context.getSystemService("layout_inflater");
        this.a = str;
        this.e = 1;
        this.b = 31;
        this.f = 1;
    }

    /* renamed from: a */
    public final Integer getItem(int i) {
        if (i != 0) {
            return Integer.valueOf(this.e + ((i - 1) * this.f));
        }
        return null;
    }

    public final int getCount() {
        return ((this.b - this.e) / this.f) + 2;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (i == 0) {
            return new View(viewGroup.getContext());
        }
        if (!(view instanceof TextView)) {
            view = this.d.inflate(this.c, viewGroup, false);
        }
        ((TextView) view).setText(String.format(ihs.b().getResources().getConfiguration().locale, "%d", new Object[]{getItem(i)}));
        return view;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (!(view instanceof TextView)) {
            view = this.d.inflate(this.g, viewGroup, false);
        }
        TextView textView = (TextView) view;
        if (i == 0) {
            textView.setText((CharSequence) null);
            textView.setHint(this.a);
        } else {
            textView.setText(String.format(ihs.b().getResources().getConfiguration().locale, "%d", new Object[]{getItem(i)}));
        }
        return view;
    }
}
