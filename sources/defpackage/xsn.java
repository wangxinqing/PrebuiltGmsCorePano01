package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.R;

/* renamed from: xsn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xsn implements View.OnClickListener {
    private final xst a;

    public xsn(xst xst) {
        this.a = xst;
    }

    public void onClick(View view) {
        xst xst = this.a;
        Intent a2 = xus.a(xst.a, xst.getActivity().getResources().getString(R.string.common_choose_account_label));
        xst.a(4);
        xst.startActivityForResult(a2, 1);
    }
}
