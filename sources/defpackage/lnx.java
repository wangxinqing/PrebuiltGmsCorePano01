package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: lnx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class lnx extends bjs implements ica, icb {
    private static final ith c = new ith("BaseActivity", "");
    public icc a;
    protected String b;

    public final void a(int i) {
        c.a("BaseActivity", "GoogleApiClient connections suspended");
    }

    /* access modifiers changed from: protected */
    public void e() {
    }

    public final void g(Bundle bundle) {
        c.a("BaseActivity", "GoogleApiClient connected");
        e();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = getIntent().getStringExtra("accountName");
        if (this.a == null) {
            ibz ibz = new ibz(this);
            ibz.a(jzf.c);
            ibz.a(jzf.a);
            ibz.a(jzf.b);
            ibz.a((ica) this);
            ibz.a((icb) this);
            ibz.a(this.b);
            this.a = ibz.b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        String str = this.b;
        if (str != null && lrg.a(lrg.a(this), str) == -1) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("BaseIsRestart", true);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        this.a.e();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        this.a.g();
        super.onStop();
    }

    public final void a(ConnectionResult connectionResult) {
        c.a("BaseActivity", "Connection failed: %d", Integer.valueOf(connectionResult.c));
        hxj.a.a(getContainerActivity(), connectionResult.c, 0).show();
    }
}
