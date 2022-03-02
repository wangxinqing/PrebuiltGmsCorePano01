package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: gmz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class gmz extends FragmentActivity implements gne, gob {
    public static final fzk i = fzk.a("ui_parameters");
    public static final fzk j = fzk.a("useImmersiveMode");
    public static final fzk k = fzk.a("theme");
    private fzl CN;
    private boolean CO;
    private ijn CP;
    public goc l;
    protected fzd m;

    /* access modifiers changed from: protected */
    public void a(int i2, Intent intent) {
        this.l.a(i2);
        setResult(i2, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void aI() {
        String str = this.CP.a;
        if (awku.c()) {
            ijm.a(this, str);
        } else {
            ijm.a((Activity) this, str, this.CO);
        }
    }

    public boolean aJ() {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract String b();

    public final fzl f() {
        fzl fzl = this.CN;
        if (fzl != null) {
            return fzl;
        }
        throw new IllegalStateException("Must not access state before fragment onCreate().");
    }

    public final ijn g() {
        ijn ijn = this.CP;
        if (ijn != null) {
            return ijn;
        }
        throw new IllegalStateException("Must not access ui parameters before they are initialized.");
    }

    /* access modifiers changed from: protected */
    public void h() {
        this.l.b();
    }

    public final anon i() {
        return (anon) this.l.a.i();
    }

    public final aucd j() {
        return this.l.a;
    }

    public final void onAttachedToWindow() {
        if (this.CP.c) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = this.CP.d;
            attributes.height = this.CP.e;
            if (this.CP.b) {
                window.addFlags(524288);
            }
            window.setAttributes(attributes);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        ijn ijn;
        super.onCreate(bundle);
        this.CN = gnj.a((Activity) this, bundle);
        goc a = goc.a(this, this, this);
        this.l = a;
        a.a(b());
        try {
            ModuleManager.ModuleInfo currentModule = ModuleManager.get(this).getCurrentModule();
            this.l.b(currentModule.moduleVersion);
            this.l.b(currentModule.moduleId);
        } catch (IllegalStateException e) {
        }
        Bundle bundle2 = (Bundle) f().a(i);
        if (bundle2 == null) {
            ijn = ijn.a((Bundle) null);
            ijn.a = (String) f().a(k);
        } else {
            ijn = ijn.a(bundle2);
        }
        this.CP = ijn;
        this.CO = ((Boolean) f().a(j, false)).booleanValue();
        if (awku.c()) {
            ijm.a((Activity) this, this.CO, (Context) this);
        }
        aI();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (isFinishing()) {
            h();
            this.l.c();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (awku.c()) {
            if (this.CO) {
                fzd fzd = this.m;
                if (fzd != null) {
                    fzd.b(getWindow());
                }
            } else {
                fzd fzd2 = this.m;
                if (fzd2 != null) {
                    fzd2.b(getWindow(), this);
                }
            }
        }
        this.l.a();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.l.b();
        gnj.a(this.CN, bundle);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (isFinishing()) {
            h();
            this.l.c();
        }
        super.onStop();
    }
}
