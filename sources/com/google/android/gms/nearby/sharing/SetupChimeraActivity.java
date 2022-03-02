package com.google.android.gms.nearby.sharing;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.sharing.view.GoogleAccountAvatar;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SetupChimeraActivity extends vhg {
    public TextView h;
    public TextView i;
    public TextView j;
    public ImageView k;
    public int l;
    public GoogleAccountAvatar m;
    private Button n;
    private final BroadcastReceiver o = new nla("nearby") {
        public final void a(Context context, Intent intent) {
            if ("com.google.android.gms.nearby.sharing.STATE_CHANGED".equals(intent.getAction())) {
                SetupChimeraActivity.this.i();
            }
        }
    };

    public static Intent a(Context context) {
        return new Intent().addFlags(131072).setClassName(context, "com.google.android.gms.nearby.sharing.SetupActivity");
    }

    private final void j() {
        this.b.s().a((acvv) new vqt(this));
    }

    public final void h() {
        vts vts = this.b;
        iha b = ihb.b();
        b.a = vtc.a;
        b.b = new Feature[]{tcm.a};
        vts.b(b.a());
        this.b.b(true);
        setResult(-1);
        finishAfterTransition();
    }

    public final void i() {
        if (!ayni.k() || !jix.b(this)) {
            j();
            this.b.t().a((acvv) new vqu(this));
            this.b.r().a((acvv) new vqv(this));
            return;
        }
        j();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        Account a;
        if (i2 != 1001) {
            if (i2 != 1002) {
                if (i2 != 1004) {
                    super.onActivityResult(i2, i3, intent);
                } else if (i3 != -1) {
                    jjg jjg = vvj.a;
                    this.b.a(0);
                } else {
                    jjg jjg2 = vvj.a;
                    h();
                }
            } else if (i3 == -1) {
                jjg jjg3 = vvj.a;
            }
        } else if (i3 == -1 && (a = who.a(intent)) != null) {
            this.b.b(a);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!ayni.p()) {
            finish();
            return;
        }
        setContentView((int) R.layout.sharing_activity_setup);
        a((Toolbar) findViewById(R.id.toolbar));
        aE().c(false);
        findViewById(R.id.device_name_btn).setOnClickListener(new vqe(this));
        this.h = (TextView) findViewById(R.id.device_name);
        this.m = (GoogleAccountAvatar) findViewById(R.id.change_account);
        View findViewById = findViewById(R.id.visibility);
        this.i = (TextView) findViewById.findViewById(R.id.visibility_label);
        this.j = (TextView) findViewById.findViewById(R.id.visibility_sublabel);
        this.k = (ImageView) findViewById.findViewById(R.id.visibility_icon);
        if (!ayni.k() || !jix.b(this)) {
            findViewById.setOnClickListener(new vqp(this));
        } else {
            findViewById.setVisibility(8);
            this.m.setVisibility(8);
        }
        findViewById(R.id.cancel).setOnClickListener(new vqq(this));
        Button button = (Button) findViewById(R.id.enable);
        this.n = button;
        button.setOnClickListener(new vqr(this));
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        thp.a(this, this.o, new IntentFilter("com.google.android.gms.nearby.sharing.STATE_CHANGED"));
        i();
        ((anih) vvj.a.d()).a("SetupActivity has started");
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        thp.a((Context) this, this.o);
        ((anih) vvj.a.d()).a("SetupActivity has stopped");
        super.onStop();
    }

    public static Drawable a(Context context, int i2) {
        return new vwt(new vt(context, i2));
    }

    public final void a(CharSequence charSequence) {
        this.b.a(charSequence).a((acvp) new vqj(this));
    }
}
