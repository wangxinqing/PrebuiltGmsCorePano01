package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: adps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adps extends Fragment {
    private String a;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.a = arguments.getString("message");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.system_update_tv_settings_fragment, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.guidance_title)).setText(R.string.system_update_module_name);
        TextView textView = (TextView) inflate.findViewById(R.id.guidance_description);
        String str = this.a;
        textView.setText(str != null ? adpo.e(str) : null);
        inflate.findViewById(R.id.progressbar).setVisibility(8);
        inflate.findViewById(R.id.status_text).setVisibility(8);
        inflate.findViewById(R.id.size_text).setVisibility(8);
        inflate.findViewById(R.id.action_text).setVisibility(8);
        TextView textView2 = (TextView) inflate.findViewById(R.id.action_button);
        textView2.setText(getString(R.string.common_ok));
        textView2.requestFocus();
        textView2.setOnClickListener(new adpr(this));
        return inflate;
    }
}
