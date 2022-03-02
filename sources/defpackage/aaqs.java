package defpackage;

import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.R;
import com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: aaqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaqs implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ VerifyAppsSettingsChimeraActivity b;

    public aaqs(VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity, boolean z) {
        this.b = verifyAppsSettingsChimeraActivity;
        this.a = z;
    }

    public final void run() {
        ArrayList arrayList;
        aanv a2 = new aany(this.b).a(this.a, 60, TimeUnit.SECONDS);
        VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity = this.b;
        verifyAppsSettingsChimeraActivity.o = false;
        if (verifyAppsSettingsChimeraActivity.f != null) {
            verifyAppsSettingsChimeraActivity.runOnUiThread(new aaqt(verifyAppsSettingsChimeraActivity));
            if (a2 != null) {
                long j = a2.a;
                Map h = verifyAppsSettingsChimeraActivity.h();
                if (h == null || h.isEmpty()) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry : h.entrySet()) {
                        if (((Long) entry.getKey()).longValue() <= j) {
                            for (PackageInfo packageInfo : (List) entry.getValue()) {
                                arrayList2.add(packageInfo.packageName);
                            }
                        }
                    }
                    arrayList = arrayList2;
                }
                verifyAppsSettingsChimeraActivity.runOnUiThread(new aaqv(verifyAppsSettingsChimeraActivity, j, arrayList, a2));
            } else {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) verifyAppsSettingsChimeraActivity.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    verifyAppsSettingsChimeraActivity.b(R.string.common_network_unavailable);
                } else {
                    verifyAppsSettingsChimeraActivity.b(R.string.play_protect_scan_timed_out);
                }
            }
        }
        synchronized (this.b) {
            this.b.n = false;
        }
    }
}
