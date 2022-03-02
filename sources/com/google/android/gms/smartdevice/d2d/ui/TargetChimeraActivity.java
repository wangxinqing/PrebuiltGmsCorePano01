package com.google.android.gms.smartdevice.d2d.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TargetChimeraActivity extends bjs implements ackg, accj {
    public static final iwd a = acqa.a("D2D", "UI", "TargetChimeraActivity");
    public String b;
    ExecutorService c = jfm.b(9);
    public final Queue d = new ArrayDeque();
    int e = 1;
    public boolean f;
    public volatile Future g = null;
    public abzt h;
    public boolean i = false;
    public BootstrapCompletionResult j;
    private Bundle k;
    private acdr l;
    private acac m;
    private boolean n = false;
    private acco o;
    private acco p;
    private D2dOptions q;

    public static Intent a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.smartdevice.d2d.ui.TargetActivity");
    }

    private final void i() {
        int i2;
        this.m.a();
        BootstrapCompletionResult bootstrapCompletionResult = this.j;
        if (bootstrapCompletionResult != null) {
            i2 = bootstrapCompletionResult.a;
        } else {
            i2 = 0;
        }
        int i3 = 1;
        if (i2 == 1) {
            i3 = 103;
        } else if (i2 == 2) {
            i3 = 102;
        }
        a(i3, new Intent());
    }

    private final void j() {
        anpa a2;
        acdr acdr = this.l;
        if (acdr != null && (a2 = acdr.i.a(getApplicationContext(), acdr.m)) != null) {
            acdr.a.a("Sent D2DEvent\n%s", a2);
        }
    }

    public final void b(int i2, Bundle bundle) {
        int i3;
        iwd iwd = a;
        Integer valueOf = Integer.valueOf(i2);
        iwd.b("onAction %d", valueOf);
        acco acco = this.p;
        if (acco != null && acco.a(i2)) {
            this.p.b(i2, bundle);
        } else if (this.o.a(i2)) {
            this.o.b(i2, bundle);
        } else {
            a.a("Handling action %d", valueOf);
            switch (i2) {
                case 108:
                case 118:
                    f();
                    return;
                case 111:
                    if (this.e == 8) {
                        a.d("Already connected", new Object[0]);
                        return;
                    }
                    if (this.p == null) {
                        i3 = anoz.a(this.o.a());
                    } else {
                        i3 = anoz.a(3);
                    }
                    aucd aucd = this.m.c;
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    anpa anpa = (anpa) aucd.b;
                    int i4 = i3 - 1;
                    anpa anpa2 = anpa.u;
                    if (i3 != 0) {
                        anpa.s = i4;
                        anpa.a |= 524288;
                        acdf acdf = new acdf();
                        acdf.a = R.drawable.quantum_gm_ic_compare_arrows_gm_blue_36;
                        acdf.b = getString(R.string.smartdevice_d2d_target_continue_description);
                        a((Fragment) acdf.a());
                        this.e = 8;
                        return;
                    }
                    throw null;
                case 112:
                    if (!this.i) {
                        acdb acdb = new acdb(this);
                        sr srVar = new sr(this);
                        srVar.a((int) R.string.common_something_went_wrong);
                        srVar.b((int) R.string.common_try_again, (DialogInterface.OnClickListener) acdb);
                        srVar.a((int) R.string.common_skip, (DialogInterface.OnClickListener) acdb);
                        srVar.a(false);
                        srVar.c();
                        this.i = true;
                        return;
                    }
                    return;
                case 113:
                    String string = bundle.getString("pin.code");
                    if (this.e != 7) {
                        a((Fragment) acny.a(!azlf.n() ? anxm.DEFAULT : acbr.a((Context) this), string, false, false, abov.UNKNOWN));
                        this.e = 7;
                        return;
                    }
                    return;
                case 115:
                    e();
                    return;
                case 117:
                    this.p = new accn((Context) this, (accj) this, getSupportFragmentManager(), bundle.getString("deviceName"));
                    return;
                default:
                    a.d("Unknown action %d", valueOf);
                    return;
            }
        }
    }

    public final void e() {
        this.l.a(getApplicationContext());
        if (this.e != 1) {
            acco acco = this.o;
            if (azjn.a.a().b() && !acco.a.popBackStackImmediate("instruction", 0)) {
                acco.a.popBackStack((String) null, 1);
            } else {
                acco.a.popBackStack("instruction", 0);
            }
            this.e = 1;
        }
    }

    public final void f() {
        this.l.i.a(15);
        a(1, new Intent());
    }

    public final boolean h() {
        D2dOptions d2dOptions = this.q;
        return d2dOptions != null && d2dOptions.a;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 2) {
            iwd iwd = a;
            StringBuilder sb = new StringBuilder(46);
            sb.append("DM_START_REQUEST_CODE result code: ");
            sb.append(i3);
            iwd.a(sb.toString(), new Object[0]);
            if (!a(true)) {
                a(this.k);
            }
        }
    }

    public final void onBackPressed() {
        if (this.e != 1) {
            sr srVar = new sr(this);
            srVar.a((int) R.string.smartdevice_alert_exit_setup_title);
            srVar.b((int) R.string.smartdevice_alert_quit_button, (DialogInterface.OnClickListener) new acda(this));
            srVar.a((int) R.string.common_cancel, (DialogInterface.OnClickListener) null);
            srVar.c();
            return;
        }
        acco acco = this.p;
        if (acco == null) {
            if (this.o.c()) {
                this.o.b();
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("intentionally_canceled", true);
            a(0, intent);
        } else if (acco.c()) {
            this.p.b();
        } else {
            this.p.b();
            this.p = null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            boolean r0 = defpackage.jkr.c()
            r1 = 0
            if (r0 != 0) goto L_0x0017
            iwd r7 = a
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Unsupported platform version"
            r7.d(r1, r0)
            r6.finish()
            return
        L_0x0017:
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r2 = "smartdevice.theme"
            java.lang.String r2 = r0.getStringExtra(r2)
            r6.b = r2
            android.os.Bundle r2 = r0.getExtras()
            com.google.android.gms.auth.firstparty.shared.D2dOptions r2 = com.google.android.gms.auth.firstparty.shared.D2dOptions.a((android.os.Bundle) r2)
            r6.q = r2
            abzt r2 = defpackage.acec.c(r6)
            r6.h = r2
            aljk r2 = new aljk
            aljl r3 = defpackage.aljl.a()
            r2.<init>(r3)
            r3 = 2132018089(0x7f1403a9, float:1.9674475E38)
            r2.a = r3
            r2.b = r1
            aljl r2 = r2.a()
            java.lang.String r3 = r6.b
            int r2 = r2.a((java.lang.String) r3)
            r6.setTheme(r2)
            r2 = 2131624895(0x7f0e03bf, float:1.8876983E38)
            r6.setContentView((int) r2)
            if (r7 != 0) goto L_0x005b
            android.os.Bundle r2 = android.os.Bundle.EMPTY
            goto L_0x005c
        L_0x005b:
            r2 = r7
        L_0x005c:
            java.lang.String r3 = "smartdevice.results"
            android.os.Parcelable r3 = r2.getParcelable(r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            if (r3 != 0) goto L_0x006c
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
        L_0x006c:
            r6.k = r3
            java.lang.String r3 = "smartdevice.managed_intents"
            java.util.ArrayList r2 = r2.getParcelableArrayList(r3)
            if (r2 == 0) goto L_0x007b
            java.util.Queue r3 = r6.d
            r3.addAll(r2)
        L_0x007b:
            com.google.android.chimera.FragmentManager r2 = r6.getSupportFragmentManager()
            java.lang.String r3 = "resources_fragment"
            com.google.android.chimera.Fragment r4 = r2.findFragmentByTag(r3)
            acdr r4 = (defpackage.acdr) r4
            if (r4 != 0) goto L_0x0099
            acdr r4 = new acdr
            r4.<init>()
            com.google.android.chimera.FragmentTransaction r2 = r2.beginTransaction()
            com.google.android.chimera.FragmentTransaction r2 = r2.add((com.google.android.chimera.Fragment) r4, (java.lang.String) r3)
            r2.commit()
        L_0x0099:
            r6.l = r4
            acac r2 = r4.i
            r6.m = r2
            java.lang.String r3 = "callerIdentity"
            java.lang.String r0 = r0.getStringExtra(r3)
            java.lang.String r3 = "suw"
            boolean r3 = r3.equals(r0)
            r4 = 1048576(0x100000, float:1.469368E-39)
            r5 = 1
            if (r3 == 0) goto L_0x00ca
            aucd r0 = r2.c
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x00b7
            goto L_0x00bc
        L_0x00b7:
            r0.c()
            r0.c = r1
        L_0x00bc:
            aucj r0 = r0.b
            anpa r0 = (defpackage.anpa) r0
            anpa r2 = defpackage.anpa.u
            r0.t = r5
            int r2 = r0.a
            r2 = r2 | r4
            r0.a = r2
            goto L_0x00ed
        L_0x00ca:
            java.lang.String r3 = "auth"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00ed
            aucd r0 = r2.c
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x00da
            goto L_0x00df
        L_0x00da:
            r0.c()
            r0.c = r1
        L_0x00df:
            aucj r0 = r0.b
            anpa r0 = (defpackage.anpa) r0
            anpa r2 = defpackage.anpa.u
            r2 = 3
            r0.t = r2
            int r2 = r0.a
            r2 = r2 | r4
            r0.a = r2
        L_0x00ed:
            acac r0 = r6.m
            azlf r2 = defpackage.azlf.a
            azlg r2 = r2.a()
            boolean r2 = r2.Z()
            if (r2 != 0) goto L_0x014a
            r2 = 2131954094(0x7f1309ae, float:1.9544678E38)
            java.lang.String r2 = r6.getString(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x012a
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            mq r0 = defpackage.mp.a(r0)
            int r2 = r0.a()
            if (r2 <= 0) goto L_0x014a
            iwd r2 = a
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.util.Locale r0 = r0.c()
            r3[r1] = r0
            java.lang.String r0 = "Using legacy instructions for %s"
            r2.c(r0, r3)
            goto L_0x014a
        L_0x012a:
            azli r2 = defpackage.azli.a
            azlj r2 = r2.a()
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x0140
            acct r2 = new acct
            com.google.android.chimera.FragmentManager r3 = r6.getFragmentManager()
            r2.<init>(r6, r3, r7, r0)
            goto L_0x0153
        L_0x0140:
            accr r2 = new accr
            com.google.android.chimera.FragmentManager r3 = r6.getFragmentManager()
            r2.<init>(r6, r3, r7, r0)
            goto L_0x0153
        L_0x014a:
            accn r2 = new accn
            com.google.android.chimera.FragmentManager r0 = r6.getFragmentManager()
            r2.<init>((android.content.Context) r6, (defpackage.accj) r6, (com.google.android.chimera.FragmentManager) r0, (android.os.Bundle) r7)
        L_0x0153:
            r6.o = r2
            acac r0 = r6.m
            int r2 = r2.a()
            int r2 = defpackage.anoz.a(r2)
            aucd r0 = r0.c
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0166
            goto L_0x016b
        L_0x0166:
            r0.c()
            r0.c = r1
        L_0x016b:
            aucj r0 = r0.b
            anpa r0 = (defpackage.anpa) r0
            int r1 = r2 + -1
            anpa r3 = defpackage.anpa.u
            if (r2 == 0) goto L_0x019c
            r0.e = r1
            int r1 = r0.a
            r1 = r1 | 32
            r0.a = r1
            if (r7 == 0) goto L_0x019b
            java.lang.String r0 = "secondaryInstrState"
            android.os.Bundle r0 = r7.getBundle(r0)
            if (r0 == 0) goto L_0x0192
            accn r1 = new accn
            com.google.android.chimera.FragmentManager r2 = r6.getSupportFragmentManager()
            r1.<init>((android.content.Context) r6, (defpackage.accj) r6, (com.google.android.chimera.FragmentManager) r2, (android.os.Bundle) r0)
            r6.p = r1
        L_0x0192:
            java.lang.String r0 = "smartdevice.savedState"
            int r7 = r7.getInt(r0, r5)
            r6.e = r7
        L_0x019b:
            return
        L_0x019c:
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            j();
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        if (this.g != null && !this.g.isCancelled()) {
            this.g.cancel(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (this.n && this.g != null) {
            this.n = false;
            this.g = null;
            this.d.clear();
            a(this.k, (List) null);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("smartdevice.savedState", this.e);
        bundle.putParcelable("smartdevice.results", this.k);
        this.o.a(bundle);
        if (this.p != null) {
            Bundle bundle2 = new Bundle();
            this.p.a(bundle2);
            bundle.putBundle("secondaryInstrState", bundle2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.d);
        bundle.putParcelableArrayList("smartdevice.managed_intents", arrayList);
    }

    private final void a(Bundle bundle, List list) {
        this.n = true;
        if (!azlf.l()) {
            a(bundle);
        } else if (list != null) {
            this.g = this.c.submit(new accy(this, list, bundle));
        } else {
            a(bundle);
        }
    }

    private final void a(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.setCustomAnimations(R.anim.slide_next_in, R.anim.slide_next_out, R.anim.slide_back_in, R.anim.slide_back_out);
        beginTransaction.replace(R.id.fragment_container, fragment).addToBackStack((String) null).commit();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, Intent intent) {
        j();
        setResult(i2, intent);
        finish();
    }

    public final void a(Bundle bundle) {
        int i2;
        int i3;
        this.m.a();
        int i4 = 0;
        if (bundle.containsKey("restoreToken")) {
            aucd aucd = this.m.c;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            anpa anpa = (anpa) aucd.b;
            anpa anpa2 = anpa.u;
            anpa.a |= 16384;
            anpa.n = true;
        }
        Intent intent = new Intent();
        BootstrapCompletionResult bootstrapCompletionResult = this.j;
        if (bootstrapCompletionResult != null) {
            i4 = bootstrapCompletionResult.a;
        }
        if (i4 == 1) {
            i3 = 103;
        } else if (i4 != 2) {
            i3 = -1;
        } else {
            i2 = 102;
            a(i2, intent);
        }
        intent.putExtras(bundle);
        i2 = i3;
        a(i2, intent);
    }

    public final void a(Bundle bundle, boolean z, BootstrapCompletionResult bootstrapCompletionResult) {
        boolean z2;
        this.k = bundle;
        this.j = bootstrapCompletionResult;
        if (bootstrapCompletionResult.f == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f = z2;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("accounts");
        if (z && parcelableArrayList != null) {
            a((Fragment) ackh.a(parcelableArrayList, bundle.getString("restoreAccount")));
            this.e = 9;
        } else if (h() && parcelableArrayList == null) {
            i();
        } else {
            a(parcelableArrayList);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: android.accounts.Account} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.ArrayList r10) {
        /*
            r9 = this;
            android.os.Bundle r0 = r9.k
            java.lang.String r1 = "restoreAccount"
            java.lang.String r0 = r0.getString(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r10.size()
            r1.<init>(r2)
            int r2 = r10.size()
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0018:
            if (r5 >= r2) goto L_0x0041
            java.lang.Object r6 = r10.get(r5)
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.lang.String r7 = "name"
            java.lang.String r6 = r6.getString(r7)
            android.accounts.Account r7 = new android.accounts.Account
            java.lang.String r8 = "com.google"
            r7.<init>(r6, r8)
            java.lang.String r6 = r7.name
            if (r6 == 0) goto L_0x003b
            java.lang.String r6 = r7.name
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r4 = r7
        L_0x003b:
            r1.add(r7)
            int r5 = r5 + 1
            goto L_0x0018
        L_0x0041:
            if (r4 != 0) goto L_0x0051
            int r10 = r1.size()
            if (r10 <= 0) goto L_0x0051
            java.lang.Object r10 = r1.get(r3)
            r4 = r10
            android.accounts.Account r4 = (android.accounts.Account) r4
            goto L_0x0052
        L_0x0051:
        L_0x0052:
            oq r10 = defpackage.oq.a(r4, r1)
            java.lang.Object r0 = r10.a
            android.accounts.Account r0 = (android.accounts.Account) r0
            java.lang.Object r10 = r10.b
            java.util.List r10 = (java.util.List) r10
            if (r0 != 0) goto L_0x0061
            goto L_0x0088
        L_0x0061:
            if (r10 == 0) goto L_0x0088
            int r1 = r10.size()
            acdr r2 = r9.l
            acac r2 = r2.i
            r3 = 10
            r2.a((int) r3, (int) r1)
            android.os.Bundle r1 = r9.k
            java.lang.String r2 = r0.name
            java.lang.String r3 = "authAccount"
            r1.putString(r3, r2)
            android.os.Bundle r1 = r9.k
            java.lang.String r0 = r0.type
            java.lang.String r2 = "accountType"
            r1.putString(r2, r0)
            android.os.Bundle r0 = r9.k
            r9.a((android.os.Bundle) r0, (java.util.List) r10)
            return
        L_0x0088:
            boolean r10 = r9.h()
            if (r10 == 0) goto L_0x0092
            r9.i()
            return
        L_0x0092:
            r9.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity.a(java.util.ArrayList):void");
    }

    public final boolean a(boolean z) {
        if (z) {
            this.d.poll();
        }
        Intent intent = (Intent) this.d.peek();
        if (intent == null) {
            return false;
        }
        startActivityForResult(intent, 2);
        return true;
    }
}
