package defpackage;

import android.app.AlertDialog;
import android.net.wifi.WifiConfiguration;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* renamed from: acnm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acnm implements AdapterView.OnItemClickListener {
    final /* synthetic */ acnt a;

    public acnm(acnt acnt) {
        this.a = acnt;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (adapterView.getItemAtPosition(i) != null) {
            acov acov = (acov) adapterView.getItemAtPosition(i);
            acnt acnt = this.a;
            int i2 = acov.c;
            if (i2 == 2 || i2 == 0) {
                String str = acov.a;
                int i3 = acov.d;
                if (i2 == 0) {
                    acnt.c.a(str, (String) null, 2, i3, acnt.b.getCount());
                    return;
                }
                WifiConfiguration a2 = acnt.e.a(str);
                if (a2 == null || acqo.a(a2)) {
                    Activity activity = acnt.getActivity();
                    if (activity == null) {
                        return;
                    }
                    if (acpp.a(activity)) {
                        acnt.a(str);
                    } else {
                        new acoy(activity).a(str, (acox) new acnr(acnt, str, i3));
                    }
                } else {
                    acnt.c.a(str, acqc.b(a2.preSharedKey), 3, i3, acnt.b.getCount());
                }
            } else {
                Activity activity2 = acnt.getActivity();
                if (activity2 != null) {
                    new AlertDialog.Builder(activity2).setTitle(R.string.smartdevice_wifi_cannot_connect_title).setMessage(R.string.smartdevice_wifi_cannot_connect_description).setPositiveButton(R.string.common_ok, new acno()).create().show();
                }
            }
        }
    }
}
