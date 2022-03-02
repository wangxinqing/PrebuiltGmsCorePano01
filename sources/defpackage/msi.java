package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.List;

/* renamed from: msi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class msi extends ArrayAdapter {
    public msi(Context context, List list) {
        super(context, R.layout.fast_pair_account_settings_list_item, list);
        setDropDownViewResource(R.layout.fast_pair_account_settings_list_item_dropdown);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getDropDownView(i, view, viewGroup);
        textView.setText(((Account) getItem(i)).name);
        return textView;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getView(i, view, viewGroup);
        textView.setTextColor(-1);
        textView.setText(((Account) getItem(i)).name);
        return textView;
    }
}
