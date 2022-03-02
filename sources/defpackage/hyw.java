package defpackage;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.common.account.AccountTypePickerChimeraActivity;

/* renamed from: hyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hyw implements AdapterView.OnItemClickListener {
    final /* synthetic */ AccountTypePickerChimeraActivity a;

    public hyw(AccountTypePickerChimeraActivity accountTypePickerChimeraActivity) {
        this.a = accountTypePickerChimeraActivity;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AccountTypePickerChimeraActivity accountTypePickerChimeraActivity = this.a;
        accountTypePickerChimeraActivity.a(((hyy) accountTypePickerChimeraActivity.a.get(i)).a.type);
    }
}
