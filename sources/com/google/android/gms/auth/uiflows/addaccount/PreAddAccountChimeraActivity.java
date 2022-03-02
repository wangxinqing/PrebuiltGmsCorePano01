package com.google.android.gms.auth.uiflows.addaccount;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PreAddAccountChimeraActivity extends gnf implements LoaderManager.LoaderCallbacks, gay {
    public static final iwd a = ehv.a("AddAccount", "PreAddAccountActivity");
    public static final fzk b = fzk.a("is_frp_required");
    public static final fzk c = fzk.a("is_setup_wizard");
    public static yey d;
    public gmm e;
    gml f = new gml(this);
    Runnable g = new gmd(this);
    private Handler p;
    private final List q = new ArrayList();
    private final acvf r = new gmc(this);

    public static Intent a(Context context, boolean z, ijn ijn, boolean z2) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.PreAddAccountActivity");
        fzl a2 = gnf.a(ijn, z, R.string.auth_gls_name_checking_info_title);
        a2.b(c, Boolean.valueOf(z2));
        return className.putExtras(a2.a);
    }

    /* access modifiers changed from: protected */
    public final void aI() {
        if (ekh.a.b(this)) {
            ekh.a.a(this, (Intent) null);
        } else {
            super.aI();
        }
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "PreAddAccountActivity";
    }

    public final void c() {
        FrpSnapshot frpSnapshot = this.e.c;
        if (qub.a((Context) this).a("com.google").length > 0 || !frpSnapshot.d || !ent.R() || !jkr.f()) {
            int i = Build.VERSION.SDK_INT;
            if (!((KeyguardManager) getSystemService("keyguard")).isKeyguardSecure()) {
                this.e.b(true);
            } else {
                startActivityForResult(new Intent("android.app.action.CONFIRM_DEVICE_CREDENTIAL"), 1);
            }
        } else {
            CharSequence text = getResources().getText(R.string.auth_frp_preadd_lkscreen_fwd);
            awkh.c();
            Intent a2 = new gmk((KeyguardManager) getSystemService("keyguard"), text).a();
            if (a2 != null) {
                alht.a(getIntent(), a2);
                startActivityForResult(a2, 2);
            } else if (awmn.a.a().a()) {
                this.f.a(2);
            } else {
                this.e.b(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    iwd iwd = a;
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unrecognized request code: ");
                    sb.append(i);
                    iwd.d(sb.toString(), new Object[0]);
                } else if (i2 == -1) {
                    this.e.b(true);
                } else if (i2 == 1) {
                    c();
                } else if (i2 != 111) {
                    this.e.b(false);
                } else {
                    gmm gmm = this.e;
                    gmm.d = true;
                    gmm.b();
                }
            } else if (i2 == -1) {
                a(5);
                this.f.a(2);
            } else if (i2 != 1) {
                a(3);
                this.e.b(false);
            } else {
                a(4);
                this.e.b(true);
            }
        } else if (i2 == -1) {
            this.e.a(FrpSnapshot.b());
            this.e.b(true);
        } else {
            this.e.b(false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null && !extras.containsKey(gnf.h.a)) {
            intent.putExtra(gnf.h.a, R.string.auth_gls_name_checking_info_title);
        }
        super.onCreate(bundle);
        this.p = new qvr(Looper.getMainLooper());
        d = yef.a((Activity) this);
        gmm gmm = new gmm(bundle, this.g);
        this.e = gmm;
        if (gmm.e == null) {
            gmm.e = Long.valueOf(System.currentTimeMillis());
        }
        if (!getIntent().getBooleanExtra(c.a, false) || !ent.ay()) {
            this.e.a();
        } else {
            gmm gmm2 = this.e;
            long currentTimeMillis = System.currentTimeMillis();
            acws.b(a("com.google.android.gms.auth_account", new String[]{"ANDROID_AUTH"}, "Failed syncing auth configuration"), a("com.google.android.gms.smartdevice", new String[]{"SMART_DEVICE"}, "Failed syncing smartdevice configuration"), a("com.google.android.gms.enterprise", new String[0], "Failed syncing enterprise configuration")).a((acvp) new gmf(gmm2, currentTimeMillis));
        }
        if (ekh.a.b(this)) {
            ekh.a.a((gmz) this);
        }
        this.f.a(1);
        if (awmb.a.a().b()) {
            gvl a2 = gvl.a((Context) this);
            if (jhg.a((Context) this) != 0) {
                this.e.a(true);
                return;
            }
            gvt gvt = new gvt(this, this);
            gvt.b();
            acwa a3 = ijc.a(a2.a(gvt.a()), awmb.a.a().a(), TimeUnit.MILLISECONDS);
            a3.a((acvv) new gmh(this));
            a3.a((acvs) new gmg(this));
            return;
        }
        this.f.a(0);
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Loader loader;
        if (i == 0) {
            loader = new gln(this);
        } else if (i != 1) {
            loader = i != 2 ? null : new gmj(this, this, awjd.b());
        } else {
            loader = new gmi(this, this, awjd.b());
        }
        if (loader != null) {
            this.q.add(loader);
        }
        return loader;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        long j;
        Bundle bundle = (Bundle) obj;
        int id = loader.getId();
        if (id == 0) {
            this.e.a(bundle.getBoolean("checkin_loader_result", false));
        } else if (id == 1) {
            FrpSnapshot frpSnapshot = (FrpSnapshot) ivy.a(bundle.getByteArray("loader_result_frp"), FrpSnapshot.CREATOR);
            this.e.a(frpSnapshot);
            if (!frpSnapshot.b || !frpSnapshot.c) {
                this.e.b(true);
            } else if (!this.e.g) {
                long currentTimeMillis = System.currentTimeMillis() - this.e.e.longValue();
                Handler handler = this.p;
                gmb gmb = new gmb(this, frpSnapshot);
                if (currentTimeMillis < ent.ax()) {
                    j = ent.ax() - currentTimeMillis;
                } else {
                    j = 0;
                }
                handler.postDelayed(gmb, j);
            }
        } else if (id != 2) {
            a.f("Unrecognized LoaderId!!!", new Object[0]);
        } else {
            if (!bundle.getBoolean("loader_result_certified", false)) {
                a.d("Failed to clear FRP result. Just means that device is still FRP'd.", new Object[0]);
            }
            this.e.a(FrpSnapshot.b());
            this.e.b(true);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        gmm gmm = this.e;
        Long l = gmm.e;
        if (l != null) {
            bundle.putLong("state.create_time", l.longValue());
        }
        Boolean bool = gmm.a;
        if (bool != null) {
            bundle.putBoolean("state.checkin_result", bool.booleanValue());
        }
        Boolean bool2 = gmm.b;
        if (bool2 != null) {
            bundle.putBoolean("state.challenge_result", bool2.booleanValue());
        }
        FrpSnapshot frpSnapshot = gmm.c;
        if (frpSnapshot != null) {
            bundle.putByteArray("state.frp_snapshot", ivy.a(frpSnapshot));
        }
        bundle.putBoolean("state.is_fre_unlocked", gmm.d);
        bundle.putBoolean("state.phenotype_sync", gmm.f);
        bundle.putBoolean("state.is_challenge_started", gmm.g);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        List list = this.q;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Loader) list.get(i)).cancelLoad();
        }
    }

    /* access modifiers changed from: package-private */
    public final acwa a(String str, String[] strArr, String str2) {
        acwa a2 = ijc.a(d.a(str, 201216073, strArr, (byte[]) null, "").b(this.r), awlm.a.a().b(), TimeUnit.MILLISECONDS);
        a2.a((acvs) new gma(str2));
        return a2;
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        boolean z;
        if (ent.aw()) {
            aucd o = anou.k.o();
            if ((((anon) j().b).a & 32768) != 0) {
                anou anou = ((anon) j().b).l;
                if (anou == null) {
                    anou = anou.k;
                }
                aucd aucd = (aucd) anou.c(5);
                aucd.a((aucj) anou);
                o = aucd;
            }
            aucd o2 = anol.c.o();
            anou anou2 = (anou) o.b;
            if ((anou2.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                anol anol = anou2.j;
                if (anol == null) {
                    anol = anol.c;
                }
                aucd aucd2 = (aucd) anol.c(5);
                aucd2.a((aucj) anol);
                o2 = aucd2;
            }
            aucd o3 = anpc.d.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            anpc anpc = (anpc) o3.b;
            anpc.c = i - 1;
            int i2 = anpc.a | 2;
            anpc.a = i2;
            if (i == 5) {
                z = true;
            } else {
                z = false;
            }
            anpc.a = i2 | 1;
            anpc.b = z;
            anpc anpc2 = (anpc) o3.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anol anol2 = (anol) o2.b;
            anpc2.getClass();
            anol2.b = anpc2;
            anol2.a |= 2;
            if (o.c) {
                o.c();
                o.c = false;
            }
            anou anou3 = (anou) o.b;
            anol anol3 = (anol) o2.i();
            anol3.getClass();
            anou3.j = anol3;
            anou3.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            aucd j = j();
            anou anou4 = (anou) o.i();
            if (j.c) {
                j.c();
                j.c = false;
            }
            anon anon = (anon) j.b;
            anon anon2 = anon.v;
            anou4.getClass();
            anon.l = anou4;
            anon.a |= 32768;
        }
    }

    public final void a(int i, Intent intent) {
        long currentTimeMillis = System.currentTimeMillis() - this.e.e.longValue();
        if (currentTimeMillis < ent.ax()) {
            this.p.postDelayed(new gme(this, i, intent), ent.ax() - currentTimeMillis);
        } else {
            super.a(i, intent);
        }
    }

    public final void a(Intent intent) {
        if (intent != null) {
            a(3, intent);
        } else {
            a(true);
        }
    }

    public final void a(boolean z) {
        fzl fzl = new fzl();
        gmm gmm = this.e;
        hol hol = null;
        if (gmm.d) {
            a(111, (Intent) null);
        } else if (!gmm.a.booleanValue() || !this.e.b.booleanValue()) {
            if (!this.e.b.booleanValue()) {
                fzl.b(AddAccountController.a, true);
                a(0, new Intent().putExtras(fzl.a));
                return;
            }
            a(2, (Intent) null);
        } else if (axfl.b() && axfl.d() && !z) {
            if (gax.a == null) {
                if (!TextUtils.isEmpty(axfl.c())) {
                    hol = new hol(this, axfl.c(), (String) null);
                }
                gax.a = new gbb(new mdp(this), new gaw(ModuleManager.get(this)), hol);
            }
            gax.a.a(this);
        } else {
            fzl.b(b, Boolean.valueOf(this.e.c.c));
            a(-1, new Intent().putExtras(fzl.a));
        }
    }
}
