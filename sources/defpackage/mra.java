package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.List;

/* renamed from: mra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mra extends ArrayAdapter {
    public String a;
    private final LayoutInflater b;
    private final int c = R.layout.fm_date_spinner_text;

    public mra(Context context, String str, List list) {
        super(context, R.layout.fm_date_spinner_text, list);
        this.b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.a = str;
    }

    public final int getCount() {
        return super.getCount() + 1;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (i == 0) {
            return new View(viewGroup.getContext());
        }
        if (view instanceof TextView) {
            return super.getDropDownView(i, view, viewGroup);
        }
        return super.getDropDownView(i, (View) null, viewGroup);
    }

    public final Object getItem(int i) {
        if (i != 0) {
            return super.getItem(i - 1);
        }
        return null;
    }

    public final int getPosition(Object obj) {
        return super.getPosition(obj) + 1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (i != 0) {
            return super.getView(i, view, viewGroup);
        }
        if (!(view instanceof TextView)) {
            view = this.b.inflate(this.c, viewGroup, false);
        }
        TextView textView = (TextView) view;
        textView.setText((CharSequence) null);
        textView.setHint(this.a);
        return view;
    }
}
