package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: adqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adqg extends Fragment {
    public static final iwd a = adnt.i("OtaPanoSettingsContentFragment");
    public adqf b;
    public View c;
    public TextView d;
    public TextView e;

    public final ProgressBar a() {
        View view = getView();
        if (view != null) {
            return (ProgressBar) view.findViewById(R.id.progress);
        }
        return null;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.b = (adqf) activity;
        } catch (ClassCastException e2) {
            String valueOf = String.valueOf(activity);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
            sb.append(valueOf);
            sb.append(" must implement OtaPanoSettingsContentFragment.Listener.");
            throw new ClassCastException(sb.toString());
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.system_update_pano_settings_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.action_button_container);
        this.c = findViewById;
        findViewById.setOnClickListener(new adqe(this));
        this.d = (TextView) inflate.findViewById(R.id.action_title);
        this.e = (TextView) inflate.findViewById(R.id.action_description);
        return inflate;
    }

    public final void onDetach() {
        this.b = null;
        super.onDetach();
    }
}
