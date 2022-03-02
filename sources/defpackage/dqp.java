package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.app.net.NetworkUsageChimeraActivityAdvanced;

/* renamed from: dqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dqp implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ NetworkUsageChimeraActivityAdvanced a;

    public dqp(NetworkUsageChimeraActivityAdvanced networkUsageChimeraActivityAdvanced) {
        this.a = networkUsageChimeraActivityAdvanced;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ((TextView) adapterView.getChildAt(0)).setTextColor(-1);
        if (i == 0) {
            this.a.e();
        } else if (i == 1) {
            NetworkUsageChimeraActivityAdvanced networkUsageChimeraActivityAdvanced = this.a;
            if (networkUsageChimeraActivityAdvanced.a == null) {
                networkUsageChimeraActivityAdvanced.a = new drb();
            }
            networkUsageChimeraActivityAdvanced.a((Fragment) networkUsageChimeraActivityAdvanced.a);
        }
        this.a.invalidateOptionsMenu();
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
