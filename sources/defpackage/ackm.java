package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: ackm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ackm extends Fragment {
    public ackl a;
    private String b;
    private GlifLayout c;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.a = (ackl) activity;
        } catch (ClassCastException e) {
            throw new RuntimeException("Containing activity must implement InstallAppFragment.Listener", e);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = getArguments().getString("smartdevice.message");
        iva.a((Object) string);
        this.b = string;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate(R.layout.smartdevice_app_install_confirm, viewGroup, false);
        this.c = glifLayout;
        alhe alhe = (alhe) glifLayout.a(alhe.class);
        alhf alhf = new alhf(getActivity());
        alhf.a(R.string.common_install);
        alhf.c = 5;
        alhf.d = 2132018060;
        alhg a2 = alhf.a();
        alhf alhf2 = new alhf(getActivity());
        alhf2.a(R.string.common_no_thanks);
        alhf2.c = 7;
        alhf2.d = 2132018061;
        alhg a3 = alhf2.a();
        alhe.a(a2);
        alhe.b(a3);
        return this.c;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.c.c(R.string.smartdevice_install_app);
        ((TextView) this.c.findViewById(R.id.message)).setText(this.b);
        alhe alhe = (alhe) this.c.a(alhe.class);
        alhe.c.f = new ackj(this);
        alhe.d.f = new ackk(this);
    }
}
