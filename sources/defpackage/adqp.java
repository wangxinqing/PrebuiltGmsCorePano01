package defpackage;

import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: adqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adqp extends Fragment {
    private static final iwd a = adnt.i("OtaPanoSetupVerifyingFragment");

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.system_update_actiontext_fragment, viewGroup, false);
        a.b("onCreateView(). Verifying.", new Object[0]);
        String g = adjk.g();
        if (TextUtils.isEmpty(g)) {
            g = getString(R.string.system_update_default_title);
        }
        String i = adjk.i();
        if (!TextUtils.isEmpty(i)) {
            str = Html.fromHtml(i).toString();
        } else {
            str = getString(R.string.system_update_default_verifying_description);
        }
        ((TextView) inflate.findViewById(R.id.guidance_title)).setText(g);
        ((TextView) inflate.findViewById(R.id.guidance_description)).setText(str);
        ((TextView) inflate.findViewById(R.id.action_text)).setText(getString(R.string.system_update_verifying_status_text));
        return inflate;
    }
}
