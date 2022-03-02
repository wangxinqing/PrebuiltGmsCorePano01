package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.yolo.ui.AccountChipView;
import java.util.List;

/* renamed from: frb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class frb extends ArrayAdapter {
    public frb(Context context, List list) {
        super(context, R.layout.account_chip_view, R.id.credential_primary_label, list);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return getView(i, view, viewGroup);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = new AccountChipView(getContext());
        }
        AccountChipView accountChipView = (AccountChipView) view;
        Account account = (Account) getItem(i);
        iva.a((Object) account);
        fqf fqf = new fqf();
        fqf.a(2);
        fqf.d = account.name;
        accountChipView.a(fqf.a());
        return accountChipView;
    }
}
