package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.widget.ArrayAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.R;
import com.google.android.gms.app.net.NetworkUsageChimeraActivity;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;

/* renamed from: dqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dqn extends AsyncTask {
    final /* synthetic */ NetworkUsageChimeraActivity a;
    private final dqm b;

    public dqn(NetworkUsageChimeraActivity networkUsageChimeraActivity, dqm dqm) {
        this.a = networkUsageChimeraActivity;
        this.b = dqm;
    }

    /* access modifiers changed from: protected */
    public final Object doInBackground(Object... objArr) {
        this.a.b = jcm.a();
        NetworkUsageChimeraActivity networkUsageChimeraActivity = this.a;
        SharedPreferences.Editor edit = networkUsageChimeraActivity.getSharedPreferences("NetworkUsagePrefs", 0).edit();
        if (jkf.a((Context) networkUsageChimeraActivity, 1) || networkUsageChimeraActivity.a(0)) {
            edit.putBoolean("CELLULAR_TAB_ENABLE", true);
            edit.apply();
        }
        if (jkf.a((Context) networkUsageChimeraActivity, 2) || networkUsageChimeraActivity.a(1)) {
            edit.putBoolean("WIFI_TAB_ENABLE", true);
            edit.apply();
        }
        if (!jkf.a((Context) networkUsageChimeraActivity, 3) && !networkUsageChimeraActivity.a(3)) {
            return null;
        }
        edit.putBoolean("ETHERNET_TAB_ENABLE", true);
        edit.apply();
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onPostExecute(Object obj) {
        dqg dqg;
        dqv dqv;
        dqm dqm = this.b;
        NetworkUsageChimeraActivity networkUsageChimeraActivity = dqm.a;
        networkUsageChimeraActivity.c = (ViewPager) networkUsageChimeraActivity.findViewById(R.id.tab_content);
        NetworkUsageChimeraActivity networkUsageChimeraActivity2 = dqm.a;
        networkUsageChimeraActivity2.d = new dqg(networkUsageChimeraActivity2.getSupportFragmentManager(), dqm.a);
        SharedPreferences sharedPreferences = dqm.a.getSharedPreferences("NetworkUsagePrefs", 0);
        sharedPreferences.registerOnSharedPreferenceChangeListener(dqm.a.d);
        NetworkUsageChimeraActivity networkUsageChimeraActivity3 = dqm.a;
        networkUsageChimeraActivity3.c.a((atr) networkUsageChimeraActivity3.d);
        ArrayList arrayList = new ArrayList();
        NetworkUsageChimeraActivity networkUsageChimeraActivity4 = dqm.a;
        networkUsageChimeraActivity4.a = (TabLayout) networkUsageChimeraActivity4.findViewById(R.id.network_tabs);
        if (sharedPreferences.getBoolean("CELLULAR_TAB_ENABLE", false)) {
            arrayList.add(dqm.a.getString(R.string.data_usage_tab_mobile));
        }
        if (sharedPreferences.getBoolean("WIFI_TAB_ENABLE", false)) {
            arrayList.add(dqm.a.getString(R.string.data_usage_tab_wifi));
        }
        if (sharedPreferences.getBoolean("ETHERNET_TAB_ENABLE", false)) {
            arrayList.add(dqm.a.getString(R.string.data_usage_tab_ethernet));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(dqm.a, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        dqm.a.e.setAdapter(arrayAdapter);
        dqm.a.e.setOnItemSelectedListener(new dql(dqm));
        dqm.a.findViewById(R.id.spinner_linear_layout).setVisibility(0);
        dqm.a.a.setVisibility(8);
        dqm.a.e();
        if (sharedPreferences.getBoolean("ETHERNET_TAB_ENABLE", false) && (dqg = dqm.a.d) != null && dqg.b.get(3) != null && (dqv = ((dqf) dqg.b.get(3)).b) != null && !dqv.f.isEmpty() && !dqv.a.isEmpty()) {
            if (((dqt) dqv.a.get(Integer.valueOf(((Integer) dqv.f.get(0)).intValue()))).b.e() != 0) {
                arrayList.add(dqm.a.getString(R.string.data_usage_tab_ethernet));
                arrayAdapter.setDropDownViewResource(17367049);
                dqm.a.e.setAdapter(arrayAdapter);
            }
        }
    }
}
