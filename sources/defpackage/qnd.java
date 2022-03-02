package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: qnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qnd extends qnh {
    public static final qfn a = new qfn("SetupFailureFragment");

    public final void onActivityCreated(Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        this.d.a(R.string.common_try_again, new qnb(this));
        Intent intent = (Intent) getArguments().getParcelable("browserIntent");
        boolean a2 = qfj.a(getActivity(), intent);
        qng qng = this.d;
        if (!a2) {
            i = R.string.common_cancel;
        } else {
            i = R.string.open_in_web_button;
        }
        qng.b(i, new qnc(this, a2, intent));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.setup_failure_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.description);
        String a2 = qmc.a("https://support.google.com/googleplay/?p=instant_apps", getResources().getString(R.string.common_learn_more));
        textView.setText(Html.fromHtml(getResources().getString(R.string.setup_failure_description, new Object[]{a2})));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return inflate;
    }
}
