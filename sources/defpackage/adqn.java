package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: adqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adqn extends Fragment {
    public static final iwd a = adnt.i("OtaPanoSetupUnableToDownloadFragment");
    public adqm b;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.b = (adqm) activity;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(activity);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append(valueOf);
            sb.append("must implement OtaPanoSetupUnableToDownloadFragment.CorrectionListener.");
            throw new ClassCastException(sb.toString());
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.system_update_actiontext_gs_fragment, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.guidance_title)).setText(getString(R.string.system_update_unable_to_download_title));
        ((TextView) inflate.findViewById(R.id.guidance_description)).setText(getString(R.string.system_update_unable_to_download_description));
        ((TextView) inflate.findViewById(R.id.action_text)).setText(getString(R.string.system_update_problem_downloading_action_text));
        TextView textView = (TextView) inflate.findViewById(R.id.action_button1);
        textView.setText(getString(R.string.common_try_again));
        textView.requestFocus();
        textView.setOnClickListener(new adqk(this));
        TextView textView2 = (TextView) inflate.findViewById(R.id.action_button2);
        textView2.setText(getString(R.string.system_update_network_settings_action_title));
        textView2.setOnClickListener(new adql(this));
        return inflate;
    }

    public final void onDetach() {
        this.b = null;
        super.onDetach();
    }
}
