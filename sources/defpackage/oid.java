package defpackage;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oid implements TextView.OnEditorActionListener {
    private final HelpChimeraActivity a;
    private final EditText b;

    public oid(HelpChimeraActivity helpChimeraActivity, EditText editText) {
        this.a = helpChimeraActivity;
        this.b = editText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        HelpChimeraActivity helpChimeraActivity = this.a;
        EditText editText = this.b;
        String trim = editText.getText().toString().trim();
        if (!TextUtils.isEmpty(trim)) {
            editText.clearFocus();
            oay.a((View) editText);
            helpChimeraActivity.j.a();
            helpChimeraActivity.findViewById(R.id.gh_open_search_view_progress_bar).setVisibility(0);
            helpChimeraActivity.e(trim);
            helpChimeraActivity.b(trim);
        }
        return false;
    }
}
