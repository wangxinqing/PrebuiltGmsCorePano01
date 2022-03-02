package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gjx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class gjx extends gnx implements aljq {
    public static final fzk a = fzk.a("theme");
    public static final fzk b = fzk.a("useImmersiveMode");
    public final AtomicBoolean c = new AtomicBoolean(true);
    public alkh d;

    /* access modifiers changed from: protected */
    public final void aI() {
        if (awku.c()) {
            ijm.a(this, (String) f().a(a));
            ijm.a((Activity) this, false, (Context) this);
            return;
        }
        ijm.a((Activity) this, (String) f().a(a), ((Boolean) f().a(b, false)).booleanValue());
    }

    public final boolean aJ() {
        return this.c.get();
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "TargetActivity";
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.d.a();
        a(1, (Intent) null);
    }

    public final void onBackPressed() {
        this.d.a.overridePendingTransition(R.anim.sud_slide_back_in, R.anim.sud_slide_back_out);
        a(0, (Intent) null);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = new alkh(getContainerActivity());
    }
}
