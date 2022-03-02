package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: zmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zmt extends ArrayAdapter {
    private final LayoutInflater a;

    public zmt(Context context, String[] strArr) {
        super(context, R.layout.plus_sharebox_account_spinner, R.id.account_name, strArr);
        this.a = LayoutInflater.from(context);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.inflate(17367050, viewGroup, false);
        }
        TextView textView = (TextView) view;
        if (textView != null) {
            textView.setText((CharSequence) getItem(i));
        }
        return textView;
    }
}
