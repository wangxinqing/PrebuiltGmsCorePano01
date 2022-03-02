package defpackage;

import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ProgressBar;
import com.google.android.gms.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: lvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lvr extends lvi {
    public luu a;
    private lvq b;
    private ProgressBar c;

    public final void a() {
        Log.i("CAR.DRIVINGMODE", "DrivingModeFrxDownloadFragment#onInstallError");
        m().b(new lvs());
        this.g.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_GEARHEAD_INSTALL_FAILURE);
    }

    public final anxx b() {
        return anxx.DRIVING_MODE_FRX_DOWNLOAD;
    }

    public final CharSequence c() {
        return getString(R.string.car_driving_mode_frx_loading_screen_header);
    }

    public final CharSequence h() {
        return getString(R.string.car_driving_mode_frx_download_body);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder sb = new StringBuilder(80);
        sb.append("DrivingModeFrxDownloadFragment#onActivityResult: ");
        sb.append(i);
        sb.append(" rescode:");
        sb.append(i2);
        Log.i("CAR.DRIVINGMODE", sb.toString());
        if (i == 1 && i2 == 0) {
            a();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lww.a();
        luu f = lww.f(getContext());
        this.a = f;
        f.k();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ProgressBar progressBar = (ProgressBar) ((ViewStub) onCreateView.findViewById(R.id.layout_progress_stub)).inflate();
        this.c = progressBar;
        progressBar.setIndeterminate(false);
        this.c.setMax(100);
        return onCreateView;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.a.n();
    }

    public final void onStart() {
        super.onStart();
        lvq lvq = new lvq(this, getActivity());
        this.b = lvq;
        lww.a();
        lvq.b = lvq.a.getPackageManager();
        lvq.c = lvq.b.getPackageInstaller();
        try {
            if (((long) lvq.b.getPackageInfo("com.google.android.projection.gearhead", 0).versionCode) >= awqy.d()) {
                lvq.e = 1;
            } else {
                lvq.e = 2;
            }
        } catch (PackageManager.NameNotFoundException e) {
            lvq.e = 3;
        }
        lvq.c.registerSessionCallback(lvq);
        List<PackageInstaller.SessionInfo> allSessions = lvq.c.getAllSessions();
        if (allSessions != null) {
            Iterator<PackageInstaller.SessionInfo> it = allSessions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PackageInstaller.SessionInfo next = it.next();
                if ("com.google.android.projection.gearhead".equals(next.getAppPackageName())) {
                    lvq.d = next.getSessionId();
                    lvq.e = 4;
                    lvq.f = next.getProgress();
                    break;
                }
            }
        }
        int i = this.b.e;
        StringBuilder sb = new StringBuilder(39);
        sb.append("Android Auto package state: ");
        sb.append(i);
        Log.i("CAR.DRIVINGMODE", sb.toString());
        if (i == 2 || i == 3) {
            lvq lvq2 = this.b;
            Intent intent = new Intent("com.android.vending.billing.PURCHASE");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setPackage("com.android.vending");
            intent.putExtra("backend", 3);
            intent.putExtra("document_type", 1);
            intent.putExtra("full_docid", "com.google.android.projection.gearhead");
            intent.putExtra("backend_docid", "com.google.android.projection.gearhead");
            intent.putExtra("offer_type", 1);
            lvq2.g.startActivityForResult(intent, 1);
            lvq2.g.g.a(anxu.DRIVING_MODE, lvq2.e == 2 ? anxt.DRIVING_MODE_GEARHEAD_INSTALL_START_UPDATE : anxt.DRIVING_MODE_GEARHEAD_INSTALL_START);
        } else if (i == 1) {
            m().c(new lvt());
        } else if (i == 4) {
            a(this.b.f);
        }
    }

    public final void onStop() {
        super.onStop();
        lvq lvq = this.b;
        lvq.c.unregisterSessionCallback(lvq);
        this.b = null;
    }

    public final void a(float f) {
        this.c.setProgress((int) (f * 100.0f));
    }
}
