package com.google.android.gms.app.net;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Process;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.R;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NetworkUsageChimeraActivity extends bjs {
    public TabLayout a;
    public Map b;
    public ViewPager c;
    public dqg d;
    public Spinner e;
    private WeakReference f;

    public final boolean a(int i) {
        Map map = this.b;
        if (map == null || map.isEmpty()) {
            return false;
        }
        return this.b.values().contains(Integer.valueOf(i));
    }

    public final synchronized void e() {
        Future future;
        if (jkr.c()) {
            if (((Boolean) jcd.g.c()).booleanValue()) {
                long currentTimeMillis = System.currentTimeMillis();
                future = jdx.a().a(ihs.b(), Process.myUid(), jed.c(currentTimeMillis).longValue(), currentTimeMillis, false, true);
                new dqo(this.d, future).execute(new Void[0]);
            }
        }
        future = jdx.a().a(getContentResolver(), Process.myUid());
        new dqo(this.d, future).execute(new Void[0]);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.common_activity_network_usage);
        this.e = (Spinner) findViewById(R.id.network_spinner);
        awzx.c();
        dqn dqn = new dqn(this, new dqm(this));
        this.f = new WeakReference(dqn);
        dqn.execute(new Object[0]);
        if (aE() != null) {
            aE().b(true);
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.common_menu_network_usage, menu);
        if (jgu.b((Context) this) || axdd.a.a().a()) {
            menu.findItem(R.id.action_launch_advanced_item).setVisible(true);
        } else {
            menu.findItem(R.id.action_launch_advanced_item).setVisible(false);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_launch_advanced_item) {
            startActivity(new Intent().setClassName(this, "com.google.android.gms.app.net.NetworkUsageActivityAdvanced"));
        } else if (itemId == R.id.action_update) {
            e();
            Toast.makeText(this, R.string.common_network_usage_updating_report, 1).show();
            return true;
        } else if (itemId == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        getSharedPreferences("NetworkUsagePrefs", 0).unregisterOnSharedPreferenceChangeListener(this.d);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        AsyncTask.Status status;
        super.onStop();
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            dqn dqn = (dqn) weakReference.get();
            if (dqn != null && ((status = dqn.getStatus()) == AsyncTask.Status.RUNNING || status == AsyncTask.Status.PENDING)) {
                dqn.cancel(true);
            }
            this.f.clear();
        }
    }
}
