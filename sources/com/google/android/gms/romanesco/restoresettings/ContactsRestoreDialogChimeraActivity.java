package com.google.android.gms.romanesco.restoresettings;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContactsRestoreDialogChimeraActivity extends bjs {
    zxc a;
    zxc b;
    public Button c;
    public akax d;
    long e;
    zsl f;
    private TextView g;
    private View h;
    private String i;
    private String j;
    private String k;
    private long l;
    private int m;
    private int n;
    private int o;
    private ArrayList p;
    private ArrayList q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;

    private final String b(int i2) {
        Resources resources = getResources();
        Integer valueOf = Integer.valueOf(i2);
        return resources.getString(R.string.romanesco_contacts_count_viewable, new Object[]{valueOf, valueOf});
    }

    public final void a(int i2) {
        ArrayList arrayList = new ArrayList();
        if (this.a != null && i2 == 3) {
            arrayList.addAll(this.p);
        } else if (this.b != null && i2 == 4) {
            arrayList.addAll(this.q);
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        Intent className = new Intent().setClassName(getApplicationContext(), "com.google.android.gms.romanesco.settings.ContactsRestoreContactsActivity");
        className.putExtra("account_name", this.i);
        className.putExtra("device_id", this.j);
        className.putExtra("sources", strArr);
        className.putExtra("type", avec.a(i2));
        className.putExtra("is_android_backup", this.s);
        startActivity(className);
        if (i2 == 3) {
            zsi.a().f(3);
            if (this.u) {
                this.f.a("DEVICE_STORAGE_CONTACT_TYPE");
                return;
            }
            return;
        }
        zsi.a().f(4);
        if (this.u) {
            this.f.a("SIM_CARD_CONTACT_TYPE");
        }
    }

    public final void e() {
        boolean z = false;
        if (!zyk.a((Context) this)) {
            this.c.setEnabled(false);
            this.d.c();
            return;
        }
        if (this.d.e()) {
            this.d.d();
        }
        zxc zxc = this.a;
        if (zxc == null) {
            z = true;
        } else if (!zxc.e.isChecked()) {
            z = true;
        }
        zxc zxc2 = this.b;
        if (zxc2 != null) {
            z &= !zxc2.e.isChecked();
        }
        this.c.setEnabled(!z);
    }

    public final void f() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        zxc zxc = this.a;
        boolean z2 = true;
        if (zxc == null || !zxc.e.isChecked()) {
            z = false;
        } else {
            arrayList.addAll(this.p);
            z = true;
        }
        zxc zxc2 = this.b;
        if (zxc2 == null || !zxc2.e.isChecked()) {
            z2 = false;
        } else {
            arrayList.addAll(this.q);
        }
        if (z && z2) {
            zsi.a().a(6);
        } else if (z) {
            zsi.a().a(7);
        } else if (z2) {
            zsi.a().a(8);
        } else {
            zsi.a().a(5);
            return;
        }
        arrayList.toArray(new String[arrayList.size()]);
        Intent intent = new Intent();
        intent.putExtra("account_name", this.i);
        intent.putExtra("device_id", this.j);
        intent.putExtra("device_name", this.k);
        intent.putStringArrayListExtra("selected_contacts_account_types", arrayList);
        if (azfh.c()) {
            intent.putExtra("is_android_backup", this.s);
        }
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.romanesco_restore_contacts_dialog);
        Intent intent = getIntent();
        zsi a2 = zsi.a();
        if (bundle == null && (intent == null || intent.getExtras() == null)) {
            a2.a("error:restore_contacts_activity:no_data");
        } else {
            if (bundle == null) {
                bundle = intent.getExtras();
            }
            this.i = bundle.getString("account_name");
            this.j = bundle.getString("device_id");
            this.k = bundle.getString("device_name");
            this.l = bundle.getLong("last_backup_time_millis");
            this.e = bundle.getLong("last_restore_time_millis");
            this.m = bundle.getInt("num_google_contacts", 0);
            this.n = bundle.getInt("num_device_contacts", 0);
            this.o = bundle.getInt("num_sim_contacts", 0);
            this.p = bundle.getStringArrayList("device_contacts_account_types");
            this.q = bundle.getStringArrayList("sim_contacts_account_types");
            this.s = bundle.getBoolean("is_android_backup");
            if (TextUtils.isEmpty(this.i)) {
                a2.a("error:restore_contacts_activity:no_account_name");
            } else if (TextUtils.isEmpty(this.j)) {
                a2.a("error:restore_contacts_activity:no_device_id");
            } else if (TextUtils.isEmpty(this.k)) {
                a2.a("error:restore_contacts_activity:no_device_name");
            } else if (this.m <= 0 && this.n <= 0 && this.o <= 0) {
                a2.a("error:restore_contacts_activity:no_contacts");
            } else if (this.n <= 0 && this.o <= 0) {
                a2.a("error:restore_contacts_activity:no_contacts_can_be_restored");
            } else if (this.p == null || this.q == null) {
                a2.a("error:restore_contacts_activity:no_contacts_account_types");
            } else {
                if (this.l < 0) {
                    a2.a("error:restore_contacts_activity:invalid_last_backup_time");
                } else if (this.e < 0) {
                    a2.a("error:restore_contacts_activity:invalid_last_restore_time");
                }
                this.r = azfh.a.a().j();
                this.u = azfa.c();
                sg aE = aE();
                aE.c((int) R.string.romanesco_contacts_restore_dialog_title);
                aE.a(4, 4);
                aE.b(true);
                String str = this.k;
                long j2 = this.l;
                long j3 = this.e;
                ((TextView) findViewById(R.id.dialog_title)).setText(getResources().getString(R.string.romanesco_from_device_label, new Object[]{str}));
                TextView textView = (TextView) findViewById(R.id.dialog_subtitle);
                if (j3 > 0) {
                    textView.setText(zyk.b(this, j3));
                } else if (j2 > 0) {
                    textView.setText(zyk.a((Context) this, j2));
                } else {
                    textView.setVisibility(8);
                }
                int i2 = this.m;
                int i3 = this.n;
                int i4 = this.o;
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.contacts_info_container);
                if (i3 > 0) {
                    zxc zxc = new zxc(this, viewGroup);
                    this.a = zxc;
                    zxc.b.setText(R.string.romanesco_device_contacts_settings_title);
                    this.a.c.setText(b(i3));
                    this.a.e.setOnCheckedChangeListener(new zwv(this));
                    if (this.r) {
                        this.a.a.setOnClickListener(new zww(this));
                    }
                }
                if (i4 > 0) {
                    zxc zxc2 = new zxc(this, viewGroup);
                    this.b = zxc2;
                    zxc2.b.setText(R.string.romanesco_sim_contacts_settings_title);
                    this.b.c.setText(b(i4));
                    this.b.e.setOnCheckedChangeListener(new zwx(this));
                    if (this.r) {
                        this.b.a.setOnClickListener(new zwy(this));
                    }
                }
                if (i2 > 0) {
                    Resources resources = getResources();
                    Integer valueOf = Integer.valueOf(i2);
                    ((TextView) findViewById(R.id.google_contacts_summary)).setText(resources.getString(R.string.romanesco_contacts_count, new Object[]{valueOf, valueOf}));
                } else {
                    ((ViewGroup) findViewById(R.id.google_contacts_info)).setVisibility(8);
                }
                this.g = (TextView) findViewById(R.id.disclaimer);
                this.g.setText(getResources().getString(R.string.romanesco_contacts_restore_dialog_disclaimer, new Object[]{this.i}));
                View findViewById = findViewById(R.id.learn_more_link_wrapper);
                this.h = findViewById;
                findViewById.setOnClickListener(new zwz(this));
                TextView textView2 = (TextView) findViewById(R.id.learn_more_link);
                textView2.setPaintFlags(textView2.getPaintFlags() | 8);
                Button button = (Button) findViewById(R.id.restore_button);
                this.c = button;
                button.setOnClickListener(new zxa(this));
                this.d = akax.a(findViewById(16908290), (int) R.string.common_no_network, -2);
                zsi.a().a(false, false, 2, false, true);
                if (!this.u) {
                    return;
                }
                if (azfa.e()) {
                    this.f = zsj.a(getApplicationContext(), getApplication());
                    return;
                } else {
                    this.f = zsk.a(getApplicationContext(), getApplication());
                    return;
                }
            }
        }
        finish();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 == 0 && iArr.length > 0 && iArr[0] == 0) {
            f();
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        boolean z;
        super.onRestoreInstanceState(bundle);
        boolean z2 = true;
        if (bundle != null) {
            boolean z3 = bundle.getBoolean("device_contacts_selected", true);
            z = bundle.getBoolean("sim_contacts_selected", true);
            z2 = z3;
        } else {
            z = true;
        }
        zxc zxc = this.a;
        if (zxc != null) {
            zxc.e.setChecked(z2);
        }
        zxc zxc2 = this.b;
        if (zxc2 != null) {
            zxc2.e.setChecked(z);
        }
        boolean z4 = bundle.getBoolean("last_restore_time_updated");
        this.t = z4;
        if (z4) {
            Intent intent = new Intent();
            intent.putExtra("account_name", this.i);
            intent.putExtra("device_id", this.j);
            intent.putExtra("last_restore_time_millis", this.e);
            setResult(-1, intent);
        }
        this.s = bundle.getBoolean("is_android_backup");
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        e();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        boolean z;
        super.onSaveInstanceState(bundle);
        bundle.putString("account_name", this.i);
        bundle.putString("device_id", this.j);
        bundle.putString("device_name", this.k);
        bundle.putLong("last_backup_time_millis", this.l);
        bundle.putLong("last_restore_time_millis", this.e);
        bundle.putInt("num_google_contacts", this.m);
        bundle.putInt("num_device_contacts", this.n);
        bundle.putInt("num_sim_contacts", this.o);
        bundle.putStringArrayList("device_contacts_account_types", this.p);
        bundle.putStringArrayList("sim_contacts_account_types", this.q);
        bundle.putBoolean("last_restore_time_updated", this.t);
        bundle.putBoolean("is_android_backup", this.s);
        zxc zxc = this.a;
        boolean z2 = true;
        if (zxc == null || !zxc.e.isChecked()) {
            z = false;
        } else {
            z = true;
        }
        bundle.putBoolean("device_contacts_selected", z);
        zxc zxc2 = this.b;
        if (zxc2 == null || !zxc2.e.isChecked()) {
            z2 = false;
        }
        bundle.putBoolean("sim_contacts_selected", z2);
    }
}
