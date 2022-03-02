package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oiq implements TextWatcher {
    final /* synthetic */ EditText a;
    final /* synthetic */ HelpChimeraActivity b;

    public oiq(HelpChimeraActivity helpChimeraActivity, EditText editText) {
        this.b = helpChimeraActivity;
        this.a = editText;
    }

    public final void afterTextChanged(Editable editable) {
        if (this.b.findViewById(R.id.gh_open_search_view_progress_bar).getVisibility() != 0) {
            onc onc = this.b.t;
            if (onc != null) {
                onc.c();
            }
            String trim = this.a.getText().toString().trim();
            if (TextUtils.isEmpty(trim)) {
                this.b.j.a();
            } else if (this.b.getCurrentFocus() == this.a) {
                try {
                    HelpChimeraActivity helpChimeraActivity = this.b;
                    helpChimeraActivity.t = new onc(helpChimeraActivity, trim);
                    HelpChimeraActivity helpChimeraActivity2 = this.b;
                    helpChimeraActivity2.t.executeOnExecutor(helpChimeraActivity2.d, new Void[0]);
                } catch (RuntimeException e) {
                    Log.w("gH_HelpActivity", "Fetching autocomplete suggestions failed:", e);
                }
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
