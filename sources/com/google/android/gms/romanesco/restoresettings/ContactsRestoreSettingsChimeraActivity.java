package com.google.android.gms.romanesco.restoresettings;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContactsRestoreSettingsChimeraActivity extends bjs {
    public zyg a;
    public zxg b;
    public akax c;
    public boolean d;
    public final zsg e = zsg.a("CRSBackupList");
    public byte[] f;
    zwl g;
    String h;
    private zxq i;
    private RecyclerView j;
    private SwipeRefreshLayout k;
    private String l;
    private aoru m;

    public final void a(int i2) {
        Toast.makeText(this, i2, 1).show();
    }

    public final void e() {
        this.a.b(this.i.b);
    }

    public final void f() {
        this.c.c();
    }

    public final void h() {
        this.c.d();
    }

    public final void i() {
        if (!zyq.a(getApplicationContext(), this.b.e, false)) {
            this.e.d("Could not reset restore from settings shared pref!");
        }
    }

    public final void j() {
        Toast.makeText(this, R.string.romanesco_restore_key_recovery_explanation_unknown_error, 0).show();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        String str;
        acwa acwa;
        if (azfh.c()) {
            if (i2 == 3) {
                a(true);
                new zrt(getApplicationContext()).a().a((acvv) new zxn(this));
            } else if (i2 == 4) {
                if (i3 == -1) {
                    zsi.a().b(3);
                    a(true);
                    a(gso.a(this), zrc.a(this), this.b.e);
                } else if (i3 == 0) {
                    zsi.a().b(4);
                } else if (i3 != 1) {
                    this.e.d("KeyRecoveryLockScreenActivity returned unknown result!");
                    zsi.a().b(6);
                    j();
                } else {
                    zsi.a().b(5);
                    Toast.makeText(this, R.string.romanesco_restore_key_recovery_explanation_permanent_error, 0).show();
                }
            }
        }
        if (i3 == -1 && intent != null) {
            if (i2 == 0) {
                String stringExtra = intent.getStringExtra("authAccount");
                if (!TextUtils.isEmpty(stringExtra)) {
                    zyg zyg = this.a;
                    if (!stringExtra.equals(zyg.b.b)) {
                        zyg.b.a(stringExtra);
                        zyg.a.a(zyg.b.b);
                        Map b2 = zyg.b.b(stringExtra);
                        if (b2 != null) {
                            zyg.a.a(zyg.a((List) new ArrayList(b2.values())));
                        } else if (zyk.a((Context) zyg.a)) {
                            zyg.b(stringExtra);
                        }
                        if (zyk.a((Context) zyg.a)) {
                            zyg.a.h();
                        } else {
                            zyg.a.f();
                        }
                        zsi.a().a(false, true, 2, false, false);
                    }
                }
            } else if (i2 == 2) {
                String stringExtra2 = intent.getStringExtra("account_name");
                String stringExtra3 = intent.getStringExtra("device_id");
                String stringExtra4 = intent.getStringExtra("device_name");
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("selected_contacts_account_types");
                boolean z = azfh.c() && intent.getBooleanExtra("is_android_backup", false);
                if (!TextUtils.isEmpty(stringExtra2) && !TextUtils.isEmpty(stringExtra3) && !TextUtils.isEmpty(stringExtra4) && stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
                    zyg zyg2 = this.a;
                    String str2 = this.l;
                    String[] strArr = new String[stringArrayListExtra.size()];
                    stringArrayListExtra.toArray(strArr);
                    try {
                        if (!TextUtils.isEmpty(str2)) {
                            str = str2;
                        } else {
                            str = "contacts_restore_settings";
                        }
                        if (azfh.c()) {
                            if (z) {
                                zrq a2 = zrc.a(zyg2.a);
                                iha b3 = ihb.b();
                                b3.b = new Feature[]{zrb.a};
                                b3.a = new zre(str, stringExtra2, stringExtra3, stringExtra4, strArr);
                                acwa = a2.b(b3.a());
                                acwa.a((acvv) new zyc(zyg2, stringExtra2, stringExtra3));
                                acwa.a((acvs) new zyd(zyg2));
                                zyg2.a.a((int) R.string.romanesco_restore_contacts_in_the_background);
                            }
                        }
                        acwa = zrc.a(zyg2.a).b((ihb) new zrn(str, stringExtra2, stringExtra3, stringExtra4, strArr));
                        acwa.a((acvv) new zyc(zyg2, stringExtra2, stringExtra3));
                        acwa.a((acvs) new zyd(zyg2));
                        zyg2.a.a((int) R.string.romanesco_restore_contacts_in_the_background);
                    } catch (RuntimeException e2) {
                        zyg.c.d("Error occurs when calling api to restore contacts!");
                        if (azfa.h()) {
                            zso.a(zyg2.a).a(e2, azfa.l());
                        }
                        zyg2.a((Exception) e2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.romanesco_contacts_restore_settings);
        this.d = azfh.a.a().h();
        RecyclerView recyclerView = (RecyclerView) findViewById(16908298);
        this.j = recyclerView;
        recyclerView.setLayoutManager(new abk());
        zxg zxg = new zxg(this);
        this.b = zxg;
        this.j.setAdapter(zxg);
        this.j.addItemDecoration(new zxp(this));
        sg aE = aE();
        aE.c((int) R.string.romanesco_contacts_restore_title);
        aE.a(4, 4);
        aE.b(true);
        this.g = zwl.a();
        String str = null;
        if (azfa.b()) {
            this.i = new zxq(getSharedPreferences("people_ui_contacts_backup_and_restore_settings", 0), new zsr(getApplicationContext()).a());
        } else {
            this.i = new zxq(getSharedPreferences("people_ui_contacts_backup_and_restore_settings", 0), (Set) null);
        }
        this.a = new zyg(this, this.i);
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.hasExtra("people_ui_contacts_restore_account_name")) {
                str = intent.getStringExtra("people_ui_contacts_restore_account_name");
            } else if (azfa.a.a().E()) {
                str = intent.getStringExtra("authAccount");
            }
            this.h = str;
            if (azfh.a.a().l() && intent.hasExtra("people_ui_contacts_restore_dialog_extras")) {
                this.l = "CONTACTS_APP_NOTIFICATION";
                Intent putExtras = new Intent("com.google.android.gms.romanesco.settings.RESTORE_CONTACTS").setPackage("com.google.android.gms").putExtras(intent.getBundleExtra("people_ui_contacts_restore_dialog_extras"));
                if (putExtras != null) {
                    startActivityForResult(putExtras, 2);
                }
            }
        }
        this.c = akax.a(findViewById(16908290), (int) R.string.common_no_network, -2);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.layout_container);
        this.k = swipeRefreshLayout;
        swipeRefreshLayout.a(R.color.material_google_blue_500);
        this.k.a = new zxo(this);
        zsi.a().a(true, false, 2, false, false);
        this.m = jfm.a(9);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        if (this.d) {
            menuInflater.inflate(R.menu.romanesco_restoresettings_menu_refresh, menu);
        } else {
            menuInflater.inflate(R.menu.romanesco_restoresettings_menu, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        GoogleHelp googleHelp;
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            this.g.b();
            finish();
            return true;
        } else if (itemId == R.id.settings_help) {
            Uri parse = Uri.parse("https://support.google.com/nexus?p=contacts_restore");
            ThemeSettings themeSettings = new ThemeSettings();
            themeSettings.a = 1;
            if (azfh.f()) {
                googleHelp = new GoogleHelp("contacts_restore");
                googleHelp.q = parse;
                mwc mwc = new mwc((Context) this);
                mwc.c = "com.google.android.gms.contacts_restore.USER_INITIATED_FEEDBACK_REPORT";
                mwc.b(iby.a(getContainerActivity()));
                googleHelp.a(mwc.a(), getCacheDir());
                googleHelp.s = themeSettings;
            } else {
                googleHelp = new GoogleHelp("contacts_restore");
                googleHelp.q = parse;
                googleHelp.s = themeSettings;
            }
            new nyw(this).a(googleHelp.a());
            return true;
        } else if (itemId != R.id.refresh) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (!this.d) {
                a(false);
            } else if (zyk.a((Context) this)) {
                if (this.c.e()) {
                    h();
                }
                e();
            } else {
                f();
                a(false);
            }
            return true;
        }
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f = bundle.getByteArray("Device");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putByteArray("Device", this.f);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        if (!TextUtils.isEmpty(this.h)) {
            zyg zyg = this.a;
            String str = this.h;
            if (!zyk.a(str) || !zyk.a((Context) zyg.a, str)) {
                str = zyg.a();
            }
            zyg.a(str);
            this.h = null;
        } else {
            zyg zyg2 = this.a;
            zyg2.a(zyg2.a());
        }
        if (zyk.a((Context) this)) {
            if (this.c.e()) {
                this.c.d();
            }
            if (this.b.h) {
                zyg zyg3 = this.a;
                String str2 = zyg3.b.b;
                if (!TextUtils.isEmpty(str2)) {
                    zyg3.b(str2);
                } else {
                    zsi.a().a("CRSP.skip_fetch_call_due_to_no_account");
                }
            }
        } else {
            this.c.c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        zxq zxq = this.a.b;
        if (zxq.b != null) {
            zxq.a.edit().putString("restore:restore_account_name", zxq.b).apply();
        } else {
            zxq.a.edit().clear().apply();
        }
    }

    public final void a(Account account) {
        int i2 = 1;
        String[] strArr = {"com.google"};
        if (azfa.a.a().s() && (getResources().getConfiguration().uiMode & 48) == 32) {
            i2 = 0;
        }
        startActivityForResult(hwy.a(account, (ArrayList) null, strArr, false, i2), 0);
    }

    public final void a(gst gst, zrq zrq, String str) {
        byte[] bArr = this.f;
        if (bArr != null) {
            try {
                gsj gsj = (gsj) aucj.a((aucj) gsj.g, bArr, aubs.c());
                acwa a2 = acws.a((Executor) this.m, (Callable) new zxh(this, str)).a((acvz) new zxi(gst, gsj)).a((acvz) new zxj(zrq, str, gsj));
                a2.a((acvv) new zxk(this, gsj));
                a2.a((acvs) new zxl(this));
            } catch (auda e2) {
                a(false);
                if (azfa.g()) {
                    this.e.a((Throwable) e2, "Exception while parsing device");
                } else {
                    this.e.e("Exception while parsing device ", e2);
                }
                a(false);
                j();
            }
        } else {
            this.e.d("Required selected device id not found.");
            a(false);
            j();
        }
    }

    public final void a(String str) {
        zxg zxg = this.b;
        if (!TextUtils.equals(zxg.e, str)) {
            zxg.e = str;
            zxg.h = !TextUtils.isEmpty(str);
            zxg.g.clear();
            zxg.as();
        }
    }

    public final void a(String str, zyi zyi) {
        zsi.a().a(false, false, 2, true, false);
        Bundle bundle = new Bundle();
        bundle.putString("account_name", str);
        String a2 = zyk.a(zyi);
        bundle.putString("device_id", a2);
        zwl a3 = zwl.a();
        if (!a2.equals(a3.f)) {
            a3.b();
            a3.f = a2;
        }
        bundle.putString("device_name", zyi.k);
        bundle.putLong("last_backup_time_millis", zyi.c);
        bundle.putLong("last_restore_time_millis", zyi.m);
        bundle.putInt("num_google_contacts", zyi.f);
        bundle.putInt("num_device_contacts", zyi.g);
        bundle.putInt("num_sim_contacts", zyi.h);
        bundle.putStringArrayList("device_contacts_account_types", zyi.i);
        bundle.putStringArrayList("sim_contacts_account_types", zyi.j);
        bundle.putBoolean("is_android_backup", zyi.a());
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.romanesco.settings.RESTORE_CONTACTS");
        intent.setPackage("com.google.android.gms");
        intent.putExtras(bundle);
        startActivityForResult(intent, 2);
    }

    public final void a(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                zyi zyi = (zyi) list.get(i2);
                if ((azfh.c() && zyi.a()) || zyi.e > 0) {
                    arrayList.add(zyi);
                }
            }
        }
        zxg zxg = this.b;
        Object[] objArr = {zxg.e, Integer.valueOf(arrayList.size())};
        zxg.h = false;
        zxg.g.clear();
        zxg.g.addAll(arrayList);
        zxg.as();
    }

    public final void a(boolean z) {
        this.k.a(z);
    }
}
