package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.R;

/* renamed from: xty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xty implements View.OnClickListener {
    private final xue a;

    public xty(xue xue) {
        this.a = xue;
    }

    public void onClick(View view) {
        xue xue = this.a;
        Intent a2 = xus.a(xue.a, xue.getActivity().getResources().getString(R.string.common_choose_account_label));
        xue.a(4);
        xue.startActivityForResult(a2, 1);
    }
}
