package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: yyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yyr extends ArrayAdapter {
    private int a = 2;
    private String b = null;
    private final CharSequence[] c;

    public yyr(Context context, Object[] objArr) {
        super(context, R.layout.plus_oob_gender_spinner_item, objArr);
        this.c = (CharSequence[]) objArr;
    }

    public final void a() {
        this.a = 1;
    }

    public final boolean b() {
        return this.a == 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        TextView textView = (TextView) view2;
        int i2 = this.a;
        if (i2 == 0) {
            textView.setText(this.b);
            textView.setContentDescription(this.b);
        } else if (i2 != 1) {
            textView.setText(this.c[i]);
            textView.setContentDescription(this.c[i]);
        } else {
            textView.setText(this.c[i]);
            textView.setContentDescription(this.c[i]);
            notifyDataSetChanged();
            this.a = 2;
        }
        return view2;
    }

    public final void a(CharSequence charSequence) {
        this.b = (String) charSequence;
        this.a = 0;
    }
}
