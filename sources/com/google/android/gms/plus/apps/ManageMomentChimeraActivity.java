package com.google.android.gms.plus.apps;

import android.accounts.Account;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ItemScope;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentEntity;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ManageMomentChimeraActivity extends bjs implements View.OnClickListener, DialogInterface.OnClickListener, DialogInterface.OnCancelListener, ica, icb, yuo, ymr, ymt, yns, ynk, ynw {
    private Account a;
    private MomentEntity b;
    private ApplicationEntity c;
    private String d;
    private String e;
    private boolean f;
    private boolean g;
    private ymu h;
    private ynt i;
    private ynl j;
    private AlertDialog k;
    private final yui l;
    private yuv m;
    private ynx n;

    public ManageMomentChimeraActivity() {
        this(yuv.a);
    }

    private final void e() {
        ((TextView) findViewById(R.id.acl)).setText(String.format(getString(R.string.plus_manage_moment_acl), new Object[]{this.d}));
        int i2 = Build.VERSION.SDK_INT;
        if (this.b.i()) {
            Account account = this.a;
            MomentEntity momentEntity = this.b;
            String a2 = jhg.a((Activity) this);
            String str = this.d;
            yms a3 = yms.a(account, momentEntity, a2);
            Bundle arguments = a3.getArguments();
            arguments.putString("acl_text", str);
            a3.setArguments(arguments);
            a3.show(getSupportFragmentManager(), "delete_moment_dialog");
        }
    }

    private final void f() {
        Toast.makeText(this, R.string.plus_manage_moment_acl_error, 1).show();
    }

    public final void a(int i2) {
    }

    public final void g(Bundle bundle) {
        this.m.a((yuo) this, this.b.g);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f = false;
        this.k = null;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f = false;
        dialogInterface.dismiss();
        this.k = null;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (jgu.e(this)) {
            Log.w("AppSettings", "This activity is not available for restricted profile.");
            setResult(0);
            finish();
        } else if (!hya.a((Context) this).b(jhg.a((Activity) this))) {
            setResult(0);
            finish();
        } else {
            if (bundle != null) {
                this.a = (Account) bundle.getParcelable("account");
                this.b = (MomentEntity) bundle.getParcelable("moment");
                this.c = (ApplicationEntity) bundle.getParcelable("application");
                this.d = bundle.getString("moment_acl");
                this.f = bundle.getBoolean("manage_error");
            }
            if (this.a == null || this.b == null) {
                this.a = (Account) getIntent().getParcelableExtra("account");
                this.b = (MomentEntity) getIntent().getParcelableExtra("app_activity");
                this.c = (ApplicationEntity) getIntent().getParcelableExtra("application");
            }
            if (this.a == null || this.b == null) {
                if (Log.isLoggable("AppSettings", 5)) {
                    Log.w("AppSettings", String.format("Missing required extra(s): account=%s moment=%s", new Object[]{this.a, this.b}));
                }
                setResult(1);
                finish();
                return;
            }
            setContentView((int) R.layout.plus_manage_moment_activity);
            int i2 = Build.VERSION.SDK_INT;
            aE().e();
            ((TextView) findViewById(R.id.action)).setVisibility(8);
            ((TextView) findViewById(R.id.target)).setText(this.b.f);
            if (this.b.g()) {
                try {
                    ((TextView) findViewById(R.id.time)).setText(ymq.a((Context) this, ymp.a(this.b.h).a));
                } catch (NumberFormatException e2) {
                }
            }
            String str = null;
            if (this.b.i()) {
                TextView textView = (TextView) findViewById(R.id.delete);
                textView.setOnClickListener(this);
                textView.setText(R.string.plus_manage_moment_delete_label);
            } else {
                findViewById(R.id.manage_divider).setVisibility(8);
                findViewById(R.id.manage_layout).setVisibility(8);
                if (this.f) {
                    View inflate = getLayoutInflater().inflate(R.layout.plus_delete_moment_dialog_contents, (ViewGroup) null);
                    TextView textView2 = (TextView) inflate.findViewById(R.id.message);
                    textView2.setText(yng.a(getText(R.string.plus_manage_moment_no_in_app_delete), (String) ysu.x.c()));
                    textView2.setMovementMethod(LinkMovementMethod.getInstance());
                    this.k = new AlertDialog.Builder(this).setPositiveButton(R.string.plus_done, this).setOnCancelListener(this).setView(inflate).setInverseBackgroundForced(true).show();
                }
            }
            if (this.d == null) {
                this.m = ymb.a(this.l, this, this, this, this.a.name);
            } else {
                e();
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            ymu ymu = (ymu) supportFragmentManager.findFragmentByTag("delete_moment_fragment");
            this.h = ymu;
            if (ymu == null) {
                Account account = this.a;
                yui yui = yuv.a;
                ymu ymu2 = new ymu();
                ymu2.a = yui;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("account", account);
                ymu2.setArguments(bundle2);
                this.h = ymu2;
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                beginTransaction.add((Fragment) this.h, "delete_moment_fragment");
                beginTransaction.commit();
            }
            ItemScope itemScope = this.b.i;
            if (itemScope != null) {
                str = itemScope.c;
            }
            Drawable a2 = ynq.a((Context) this).a(str);
            ImageView imageView = (ImageView) findViewById(R.id.image);
            imageView.setOnClickListener(this);
            imageView.setClickable(true);
            if (a2 != null) {
                ((ImageView) findViewById(R.id.image)).setImageDrawable(a2);
                return;
            }
            ((ImageView) findViewById(R.id.image)).setImageResource(R.drawable.plus_icon_red_32);
            if (str != null) {
                this.e = str;
                ynt a3 = ynt.a((Context) this);
                this.i = a3;
                a3.a((yns) this);
                this.i.a(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        ynl ynl = this.j;
        if (ynl != null) {
            ynl.b(this);
            this.j = null;
        }
        ynt ynt = this.i;
        if (ynt != null) {
            ynt.b(this);
            this.i = null;
        }
        AlertDialog alertDialog = this.k;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.k = null;
        }
    }

    public final void onPause() {
        super.onPause();
        yuv yuv = this.m;
        if (yuv != null && (yuv.l() || this.m.m())) {
            this.m.j();
        }
        ynx ynx = this.n;
        if (ynx != null) {
            ynx.a((ynw) this);
            this.n = null;
        }
        this.g = false;
    }

    public final void onResumeFragments() {
        yuv yuv;
        super.onResumeFragments();
        if (this.d == null && (yuv = this.m) != null && !yuv.l() && !this.m.m()) {
            this.m.t();
        }
        ApplicationEntity applicationEntity = this.c;
        if (applicationEntity == null || applicationEntity.b == null) {
            ynx a2 = ynx.a((Context) this);
            this.n = a2;
            a2.a((ynw) this, this.b.d, this.a.name);
        }
        this.g = true;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("account", this.a);
        bundle.putParcelable("moment", this.b);
        bundle.putParcelable("application", this.c);
        bundle.putString("moment_acl", this.d);
        bundle.putBoolean("manage_error", this.f);
    }

    public ManageMomentChimeraActivity(yui yui) {
        this.f = true;
        this.l = yui;
    }

    public final void a(ConnectionResult connectionResult) {
        f();
    }

    public final boolean aF() {
        setResult(0);
        finish();
        return true;
    }

    public void onClick(View view) {
        String str;
        int id = view.getId();
        if (id == R.id.delete) {
            if (this.b.i() && this.g) {
                yms.a(this.a, this.b, jhg.a((Activity) this)).show(getSupportFragmentManager(), "delete_moment_dialog");
            }
        } else if (id == R.id.image) {
            ItemScope itemScope = this.b.i;
            if (itemScope != null) {
                str = itemScope.d;
            } else {
                str = null;
            }
            izr.a((Context) this, this.a.name, (String) null, !yng.a(str, this, this) ? iak.l : iak.k, ial.h, getPackageName());
        }
    }

    public final void a(String str) {
        ymu ymu = this.h;
        if (!ymu.e) {
            ymu.e = true;
            ymu.f = str;
            if (ymu.b.l()) {
                ymu.g(Bundle.EMPTY);
            } else if (!ymu.c) {
                ymu.b.t();
                ymu.c = true;
            }
            znf a2 = znf.a((CharSequence) getString(R.string.plus_delete_moment_progress_dialog_message));
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add((Fragment) a2, "progress_dialog");
            beginTransaction.commitAllowingStateLoss();
            return;
        }
        if (Log.isLoggable("DeleteMomentFragment", 5)) {
            Log.w("DeleteMomentFragment", "Can only delete one app activity at a time.");
        }
        znd.a(getString(R.string.plus_delete_moment_failed_dialog_message)).show(getSupportFragmentManager(), "error_dialog");
    }

    public final void a(String str, Drawable drawable) {
        if (this.e.equals(str) && drawable != null) {
            ((ImageView) findViewById(R.id.image)).setImageDrawable(drawable);
            ynq.a((Context) this).a(str, drawable);
        }
    }

    public final void a(String str, boolean z) {
        znf znf = (znf) getSupportFragmentManager().findFragmentByTag("progress_dialog");
        if (znf != null) {
            znf.dismissAllowingStateLoss();
        }
        if (z) {
            znd a2 = znd.a(getString(R.string.plus_delete_moment_failed_dialog_message));
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add((Fragment) a2, "error_dialog");
            beginTransaction.commitAllowingStateLoss();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("deleted_moment_id", str);
        setResult(-1, intent);
        finish();
    }

    public final void a(List list) {
        if (list != null) {
            if (list.isEmpty()) {
                this.d = getString(R.string.plus_manage_app_only_you_label);
            } else {
                String string = getString(R.string.plus_manage_moment_acl_separator);
                StringBuilder sb = new StringBuilder();
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AudienceMember audienceMember = (AudienceMember) list.get(i2);
                    if (sb.length() > 0) {
                        sb.append(string);
                    }
                    sb.append(audienceMember.f);
                }
                this.d = sb.toString();
            }
            e();
            return;
        }
        f();
    }

    public final void a(ynv ynv) {
        String str;
        if (ynv.a.equals(this.b.d)) {
            this.c = new ApplicationEntity(ynv.b, ynv.c, ynv.a);
            sg aE = aE();
            ApplicationEntity applicationEntity = this.c;
            if (applicationEntity == null || (str = applicationEntity.b) == null) {
                aE.c((int) R.string.plus_manage_moment_label);
            } else {
                aE.a((CharSequence) str);
            }
            aE.b(true);
            if (this.c != null) {
                yls a2 = ylt.a((Context) this).a((yxi) this.c);
                aE.a(a2.b);
                String str2 = this.c.c;
                if (a2.c && str2 != null) {
                    ynl a3 = ynl.a((Context) this);
                    this.j = a3;
                    a3.a((ynk) this);
                    this.j.a(this.c, str2);
                }
            }
        }
    }

    public final void a(yxi yxi, Drawable drawable) {
        if (this.c.d.equals(yxi.c()) && drawable != null) {
            aE().a(drawable);
            ylt.a((Context) this).a(yxi, drawable);
        }
    }
}
