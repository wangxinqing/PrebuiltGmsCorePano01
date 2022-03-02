package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.accounts.Account;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.internal.AccountCredentialSettings;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CredentialsSettingsChimeraActivity extends bjs implements CompoundButton.OnCheckedChangeListener, AdapterView.OnItemSelectedListener, View.OnClickListener {
    public static final /* synthetic */ int i = 0;
    public SwitchCompat a;
    public SwitchCompat b;
    public ViewGroup c;
    public evb d;
    public View e;
    public View f;
    public AccountCredentialSettings g;
    public Account h;
    private jmf j;
    private View k;
    private View l;
    private TextView m;
    private qao n;
    private jgs o;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SettingsIntentOperation extends hea {
        public final GoogleSettingsItem b() {
            if (!((Boolean) fdg.a.c()).booleanValue()) {
                return null;
            }
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.settings.CREDENTIALS_SETTINGS"), 4, (int) R.string.common_google_settings_credentials_title, 19);
            googleSettingsItem.f = true;
            return googleSettingsItem;
        }
    }

    public static anox a(int i2) {
        aucd o2 = anox.h.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anox anox = (anox) o2.b;
        anox.b = i2 - 1;
        anox.a |= 1;
        return (anox) o2.i();
    }

    public final void b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
            return;
        }
        Log.e("CredentialsSettings", "Unable to find the browser.");
        Toast.makeText(getContainerActivity(), getResources().getString(R.string.common_no_browser_found), 1).show();
    }

    public final void e() {
        boolean a2 = jkf.a(this);
        this.l.setVisibility(!a2 ? 0 : 8);
        a(a2);
    }

    public final void f() {
        Account account = this.h;
        if (account != null) {
            aorl.a(this.n.b(1, new frm(this, account)), new frr(this), aoqm.a);
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i2;
        int i3;
        if (this.g == null) {
            return;
        }
        if (compoundButton.getId() != this.a.getId()) {
            if (compoundButton.getId() == this.b.getId() && this.g.b != z) {
                a(3, new frj(this, z), getString(R.string.credentials_pref_failed_save_auto_signin));
                if (!z) {
                    i3 = 503;
                } else {
                    i3 = 504;
                }
                fgm.a().a(a(i3));
            }
        } else if (this.g.a != z) {
            a(2, new fri(this, z), getString(R.string.credentials_pref_failed_save_storage_enabled));
            if (!z) {
                i2 = 501;
            } else {
                i2 = 502;
            }
            fgm.a().a(a(i2));
        }
    }

    public void onClick(View view) {
        amzy amzy;
        View view2 = this.k;
        if (view2 != null && view != null && view2.getId() == view.getId()) {
            List<ApplicationInfo> installedApplications = getPackageManager().getInstalledApplications(128);
            if (installedApplications == null) {
                Log.e("CredentialsSettings", "Unable to get any apps.");
                amzy = amzy.h();
            } else {
                Iterable a2 = anbs.a(anbs.a((Iterable) installedApplications, frk.a), frl.a);
                TreeSet treeSet = new TreeSet();
                anbs.a((Collection) treeSet, a2);
                treeSet.removeAll(this.g.c);
                amzy = amzy.a((Collection) treeSet);
            }
            new AlertDialog.Builder(this).setTitle(getResources().getString(R.string.credentials_add_never_save_app_dialog_title)).setAdapter(new frt(this, this, amzy), new frh(this, amzy)).setCancelable(true).show();
            fgm.a().a(a(505));
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(2132019149);
        setContentView((int) R.layout.credentials_settings);
        this.d = eul.a(this, ffx.a(qbw.a()).a());
        this.n = qao.a((FragmentActivity) this);
        this.l = findViewById(R.id.no_connection_snackbar);
        Button button = (Button) findViewById(R.id.retry_connection);
        this.m = button;
        button.setOnClickListener(new frc(this));
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.credentials_pref_storage_enabled);
        this.a = switchCompat;
        switchCompat.setOnCheckedChangeListener(this);
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R.id.credentials_pref_auto_signin);
        this.b = switchCompat2;
        switchCompat2.setOnCheckedChangeListener(this);
        this.c = (ViewGroup) findViewById(R.id.credentials_pref_never_save_list);
        View findViewById = findViewById(R.id.credentials_add_never_save_app);
        this.k = findViewById;
        findViewById.setOnClickListener(this);
        String string = getResources().getString(R.string.credentials_saved_passwords_link_prefix);
        String string2 = getResources().getString(R.string.credentials_saved_passwords_link_text);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(string2);
        spannableStringBuilder.setSpan(new DefensiveURLSpan((String) ((amsz) iks.p).a, true), length, spannableStringBuilder.length(), 33);
        if (!TextUtils.isEmpty((CharSequence) null)) {
            spannableStringBuilder.append((CharSequence) null);
        }
        TextView textView = (TextView) findViewById(R.id.saved_passwords_link);
        textView.setText(spannableStringBuilder);
        textView.setOnClickListener(new frf(this));
        this.f = findViewById(R.id.all_settings);
        this.e = findViewById(R.id.custom_passphrase_warning);
        e();
        Account account = (Account) ((Bundle) amrh.a(bundle, (Bundle) amrh.a(getIntent().getExtras(), Bundle.EMPTY))).getParcelable("EXTRA_ACCOUNT");
        sg aE = aE();
        iva.a((Object) aE);
        aE.a(4, 4);
        aE.b(true);
        jme jme = new jme(aE);
        jme.a(R.string.common_google_settings_credentials_title);
        jmf a2 = jme.a();
        this.j = a2;
        a2.a = this;
        if (account != null) {
            a2.a(a2.a(account.name));
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.credentials_settings_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        String b2 = this.j.getItem(i2);
        iva.a((Object) b2);
        a(new Account(b2, "com.google"));
    }

    public final void onNothingSelected(AdapterView adapterView) {
        a((Account) null);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_help_center) {
            b((String) fdj.e.c());
            fgm.a().a(a(508));
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("EXTRA_ACCOUNT", this.h);
        super.onSaveInstanceState(bundle);
    }

    private final void a(Account account) {
        if (!amqx.a(account, this.h)) {
            this.h = account;
            b(true);
            f();
        }
    }

    public final void b(boolean z) {
        int i2;
        View findViewById = findViewById(R.id.progress_indicator_container);
        if (!z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        findViewById.setVisibility(i2);
        ImageView imageView = (ImageView) findViewById(R.id.progress_indicator);
        this.f.setVisibility(8);
        if (this.o == null) {
            jgs jgs = new jgs(this, imageView);
            this.o = jgs;
            jgs.setAlpha(255);
            this.o.a(0);
            this.o.a(-12417548);
            imageView.setImageDrawable(this.o);
        }
        if (!z) {
            this.o.stop();
        } else {
            this.o.start();
        }
    }

    public final oq a(String str) {
        try {
            return jni.b(this).c(str);
        } catch (PackageManager.NameNotFoundException e2) {
            return oq.a(str, (Object) null);
        }
    }

    public final void a(int i2, amsv amsv, String str) {
        aorl.a(this.n.b(Integer.valueOf(i2), amsv), new frs(this, str), aoqm.a);
    }

    public final void a(View view, String str) {
        oq a2 = a(str);
        ImageView imageView = (ImageView) view.findViewById(R.id.credentials_app_image);
        imageView.setImageDrawable((Drawable) a2.b);
        CharSequence charSequence = (CharSequence) a2.a;
        imageView.setContentDescription(String.format(getString(R.string.credentials_pref_app_icon_description), new Object[]{charSequence}));
        ((TextView) view.findViewById(R.id.credentials_app_name)).setText(charSequence);
        view.findViewById(R.id.credentials_app_credential_name).setVisibility(8);
    }

    public final void a(boolean z) {
        this.a.setEnabled(z);
        this.b.setEnabled(z);
        this.c.setEnabled(z);
    }
}
