package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: dqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dqe extends Fragment {
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.common_activity_display_network_usage_entry, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.network_usage_entry_header)).setText("Component|Tag|Interface|Type|Total|Total Bg|Total Fg|Bg Rx|Fg Rx|Bg Tx|Fg Tx");
        Bundle arguments = getArguments();
        amrl.a((Object) arguments);
        ((TextView) inflate.findViewById(R.id.network_usage_entry_text)).setText(arguments.getString("SUMMARY_KEY", ""));
        return inflate;
    }
}
