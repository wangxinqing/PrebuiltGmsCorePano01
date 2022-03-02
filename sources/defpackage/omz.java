package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.R;

/* renamed from: omz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class omz implements View.OnClickListener {
    private final onb a;
    private final omv b;

    public omz(onb onb, omv omv) {
        this.a = onb;
        this.b = omv;
    }

    public void onClick(View view) {
        onb onb = this.a;
        omv omv = this.b;
        String str = omv.c;
        if (!TextUtils.isEmpty(str)) {
            EditText editText = onb.a.s.i;
            editText.clearFocus();
            editText.setText(str);
            oay.a(view);
            onb.a.j.a();
            onb.a.findViewById(R.id.gh_open_search_view_progress_bar).setVisibility(0);
            onb.a.e(str);
            new ool(onb.a.l, new omv(str)).start();
        }
        onb.a(onb.e, omv);
    }
}
