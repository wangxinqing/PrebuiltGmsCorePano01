package com.google.android.gms.nearby.discovery.fastpair;

import android.accounts.Account;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HalfSheetChimeraActivity extends bjs {
    public tzf a;
    public Button b;
    public Button c;
    public TextView d;
    public Intent e;
    private String f;
    private final BroadcastReceiver g = new nla("HalfSheetStateChange") {
        public final void a(Context context, Intent intent) {
            if (!"com.google.android.gms.discovery.fastpair.ACTION_HALF_SHEET_STATUS_CHANGE".equals(intent.getAction())) {
                return;
            }
            if ("SUCCESS".equals(intent.getStringExtra("FINISHED_STATE"))) {
                HalfSheetChimeraActivity halfSheetChimeraActivity = HalfSheetChimeraActivity.this;
                halfSheetChimeraActivity.c.setVisibility(0);
                if (tvq.a(tvq.a(halfSheetChimeraActivity.a.h), (Context) halfSheetChimeraActivity)) {
                    halfSheetChimeraActivity.c.setText(halfSheetChimeraActivity.getString(R.string.fast_pair_setup_device));
                } else {
                    halfSheetChimeraActivity.c.setText(halfSheetChimeraActivity.getString(R.string.common_download));
                }
            } else if ("FAIL".equals(intent.getStringExtra("FINISHED_STATE"))) {
                ((anih) tsp.a.c()).a("HalfSheetActivity: halfsheet show fail connect info");
            } else if ("DISMISS".equals(intent.getStringExtra("FINISHED_STATE"))) {
                jjg jjg = tsp.a;
                HalfSheetChimeraActivity.this.finish();
            }
        }
    };

    public final Intent a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!tvq.a(str, (Context) this)) {
            return CompanionAppInstallChimeraActivity.a(this, str);
        }
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(str);
        if (aymw.e() && str2 != null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (!(launchIntentForPackage == null || defaultAdapter == null)) {
                launchIntentForPackage.putExtra("android.bluetooth.device.extra.DEVICE", defaultAdapter.getRemoteDevice(str2));
            }
        }
        return launchIntentForPackage;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("com.google.android.gms.nearby.discovery.HALF_SHEET");
        if (aymw.E() && byteArrayExtra != null) {
            boolean booleanExtra = getIntent().getBooleanExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_RETROACTIVE", false);
            jjg jjg = tsp.a;
            if (booleanExtra) {
                this.e = (Intent) getIntent().getParcelableExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_CLOUD_SYNC_INTENT");
                String stringExtra = getIntent().getStringExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_ACCOUNT_NAME");
                this.f = stringExtra;
                if (this.e == null || stringExtra == null) {
                    ((anih) tsp.a.d()).a("HalfSheetActivity: retroactive pair does not have required info");
                    finish();
                    return;
                }
            }
            setContentView((int) R.layout.fast_pair_half_sheet);
            this.b = (Button) findViewById(R.id.connect_btn);
            Button button = (Button) findViewById(R.id.setup_btn);
            this.c = button;
            button.setVisibility(4);
            TextView textView = (TextView) findViewById(R.id.toolbar_title);
            this.d = (TextView) findViewById(R.id.header_subtitle);
            a((Toolbar) findViewById(R.id.toolbar));
            aE().c(false);
            aE().b(false);
            ((Button) findViewById(R.id.cancel_btn)).setOnClickListener(new tvu(this));
            this.c.setOnClickListener(new tvv(this));
            ImageView imageView = (ImageView) findViewById(R.id.pairing_pic);
            findViewById(R.id.background).setOnClickListener(new tvw(this));
            try {
                this.a = (tzf) aucj.a((aucj) tzf.A, byteArrayExtra, aubs.c());
                this.d.setText(getString(R.string.common_download));
                if (booleanExtra) {
                    textView.setText(this.f);
                    this.b.setOnClickListener(new tvx(this));
                } else {
                    textView.setText(this.a.f);
                    this.b.setOnClickListener(new tvy(this));
                }
                imageView.setImageBitmap(tzb.a(this, this.a));
                ((anih) tsp.a.d()).a("HalfSheetActivity: Check the passing info %s", (Object) this.a.b);
            } catch (auda e2) {
                anih anih = (anih) tsp.a.c();
                anih.a((Throwable) e2);
                anih.a("HalfSheetActivity: error happens when pass info to half sheet");
            }
        } else {
            finish();
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.halfsheet_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.avatar);
        List d2 = jgu.d(this, getPackageName());
        if (d2.isEmpty()) {
            findItem.setVisible(false);
            return false;
        }
        Account account = (Account) d2.get(0);
        findItem.setVisible(true);
        findItem.setTitle(account.name);
        wlr wlr = new wlr();
        wlr.a = 80;
        wls a2 = wlr.a();
        if (tvq.a == null) {
            tvq.a = wlt.a(this, a2);
        }
        acws.a((Executor) new jfz(1, 9), (Callable) new tvp(account, this)).a((acvv) new tvz(findItem));
        return super.onPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.discovery.fastpair.ACTION_HALF_SHEET_STATUS_CHANGE");
        thp.a(this, this.g, intentFilter);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        thp.a((Context) this, this.g);
    }
}
