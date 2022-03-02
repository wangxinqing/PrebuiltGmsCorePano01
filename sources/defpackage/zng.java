package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: zng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zng extends ArrayAdapter {
    public String a;
    private final LayoutInflater b;
    private final int c = R.id.spinner_title;

    public zng(Context context, Object[] objArr) {
        super(context, R.layout.plus_settings_account_spinner, R.id.account_name, objArr);
        this.b = LayoutInflater.from(context);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.inflate(17367050, viewGroup, false);
        }
        ((TextView) view).setText(getItem(i).toString());
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (this.a != null) {
            ((TextView) view2.findViewById(this.c)).setText(this.a);
        }
        return view2;
    }
}
