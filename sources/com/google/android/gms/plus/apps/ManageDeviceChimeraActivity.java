package com.google.android.gms.plus.apps;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;
import com.google.android.gms.fitness.data.BleDevice;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ManageDeviceChimeraActivity extends bjs implements ymz {
    public DialogFragment a;
    private String b;
    private String c;

    public final void a() {
        Intent intent = new Intent();
        intent.putExtra("deviceAddress", this.c);
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BleDevice bleDevice = (BleDevice) getIntent().getParcelableExtra("device");
        this.b = bleDevice.b;
        this.c = bleDevice.a;
        yna yna = new yna();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("device", bleDevice);
        yna.setArguments(bundle2);
        this.a = yna;
        setContentView((int) R.layout.plus_manage_device_activity);
        aE().b(true);
        Resources resources = getResources();
        TextView textView = (TextView) findViewById(R.id.plus_manage_app_device);
        ((TextView) findViewById(R.id.device_name)).setText(this.b);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml(String.format(resources.getString(R.string.fitness_settings_device_description), new Object[]{this.b})));
        findViewById(R.id.disconnect_layout).setOnClickListener(new ynm(this));
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
