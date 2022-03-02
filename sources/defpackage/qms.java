package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: qms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qms extends qnh {
    public static final qfn a = new qfn("RestoreSupervisorFragment");

    public final void onActivityCreated(Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        this.d.a(R.string.common_restore, new qmq(this));
        Intent intent = (Intent) getArguments().getParcelable("browserIntent");
        boolean a2 = qfj.a(getActivity(), intent);
        qng qng = this.d;
        if (!a2) {
            i = R.string.common_cancel;
        } else {
            i = R.string.open_in_web_button;
        }
        qng.b(i, new qmr(this, a2, intent));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.setup_restore_supervisor_fragment, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.description)).setText(getString(R.string.restore_supervisor_description, getString(R.string.supervisor_title)));
        return inflate;
    }
}
