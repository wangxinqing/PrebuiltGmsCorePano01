package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: gmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class gmy extends bjs implements gne, gob {
    private fzl a;
    private goc b;

    public final boolean aJ() {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract String e();

    public final fzl f() {
        fzl fzl = this.a;
        if (fzl != null) {
            return fzl;
        }
        throw new IllegalStateException("Must not access state before fragment onCreate().");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = gnj.a((Activity) this, bundle);
        goc a2 = goc.a(this, this, this);
        this.b = a2;
        a2.a(e());
        try {
            ModuleManager.ModuleInfo currentModule = ModuleManager.get(this).getCurrentModule();
            this.b.b(currentModule.moduleVersion);
            this.b.b(currentModule.moduleId);
        } catch (IllegalStateException e) {
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        if (isFinishing()) {
            this.b.c();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.b.a();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        this.b.b();
        gnj.a(this.a, bundle);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        if (isFinishing()) {
            this.b.c();
        }
        super.onStop();
    }
}
