package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;

/* renamed from: gnf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class gnf extends gnx {
    protected static final fzk h = fzk.a("title_res_id");
    private fza a;

    protected static fzl a(ijn ijn, boolean z, int i) {
        Bundle bundle;
        fzl fzl = new fzl();
        fzk fzk = gmz.i;
        if (ijn != null) {
            bundle = ijn.a();
        } else {
            bundle = null;
        }
        fzl.b(fzk, bundle);
        fzl.b(gmz.j, Boolean.valueOf(z));
        fzl.b(h, Integer.valueOf(i));
        return fzl;
    }

    private final void c() {
        int i;
        boolean a2 = ijm.a(g().a);
        LayoutInflater from = LayoutInflater.from(this);
        if (!a2) {
            i = R.layout.auth_generic_suw_activity;
        } else {
            i = R.layout.auth_generic_suw_glif_activity;
        }
        this.a = (fza) from.inflate(i, (ViewGroup) null, false);
        awkh.c();
        this.a.b();
        this.a.a(jjd.a(awiw.b()));
        this.a.a();
        if (awku.c()) {
            this.m = (fzd) this.a;
        } else if (((Boolean) f().a(gmz.j, false)).booleanValue()) {
            this.a.a(getWindow());
        } else {
            this.a.a(getWindow(), this);
        }
        ijm.a((ViewGroup) this.a);
        Integer num = (Integer) f().a(h);
        if (!(num == null || num.intValue() == 0)) {
            this.a.a(getText(num.intValue()));
        }
        setContentView((View) this.a);
        alhs.a(getWindow(), ent.aB());
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c();
    }
}
