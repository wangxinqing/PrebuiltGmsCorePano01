package com.google.android.gms.app.net;

import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import java.io.File;
import java.util.concurrent.Future;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NetworkUsageChimeraActivityAdvanced extends bjs implements dqj, dqa, drd {
    public drb a;
    private dqd b;

    public final void a(int i, int i2, int i3) {
        ((Button) this.a.d.findViewById(i)).setText(drb.a(i2, i3));
    }

    public final void e() {
        if (this.b == null) {
            this.b = new dqd();
        }
        a((Fragment) this.b);
        this.b.a.f = this;
    }

    public final void onBackPressed() {
        drb drb;
        if (this.b.isVisible() || ((drb = this.a) != null && drb.isVisible())) {
            super.onBackPressed();
            return;
        }
        e();
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.common_activity_network_usage_advanced);
        e();
        if (awym.a.a().d()) {
            Spinner spinner = (Spinner) findViewById(R.id.network_stats_spinner);
            findViewById(R.id.spinner_linear_layout).setVisibility(0);
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, new String[]{"Data Usage", "Share Wireless Radio Activity Summary"});
            arrayAdapter.setDropDownViewResource(17367049);
            spinner.setAdapter(arrayAdapter);
            spinner.setOnItemSelectedListener(new dqp(this));
            spinner.setVisibility(0);
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.common_menu_network_usage_advanced, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "WirelessRadioActivitySummary.txt").delete();
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        drb drb;
        Future future;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_update) {
            if (!jkr.c() || !((Boolean) jcd.g.c()).booleanValue()) {
                future = jdx.a().a(getContentResolver(), Process.myUid());
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                future = jdx.a().a(ihs.b(), Process.myUid(), jed.c(currentTimeMillis).longValue(), currentTimeMillis, false, true);
            }
            new dqq(this.b, future).execute(new Void[0]);
            Toast.makeText(this, "Refreshing network usage report.", 1).show();
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (this.b.isVisible() || ((drb = this.a) != null && drb.isVisible())) {
                iz.a(getContainerActivity());
            } else {
                e();
                invalidateOptionsMenu();
            }
            return true;
        }
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.action_update);
        if (this.b.isVisible()) {
            findItem.setVisible(true);
        } else {
            findItem.setVisible(false);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public final void a(int i, int i2, int i3, int i4) {
        ((Button) this.a.d.findViewById(i)).setText(drb.a(i4, i3, i2));
    }

    public final void a(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.network_usage_activity_advanced_content, fragment);
        beginTransaction.commit();
        getSupportFragmentManager().executePendingTransactions();
    }

    public final void a(jef jef) {
        String jef2 = jef.toString();
        dqe dqe = new dqe();
        Bundle bundle = new Bundle();
        bundle.putString("SUMMARY_KEY", jef2);
        dqe.setArguments(bundle);
        a((Fragment) dqe);
    }
}
