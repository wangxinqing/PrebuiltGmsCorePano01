package defpackage;

import android.content.ComponentName;
import android.view.View;
import com.google.android.gms.auth.frp.FreUnlockChimeraActivity;

/* renamed from: gfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gfa implements View.OnClickListener {
    final /* synthetic */ FreUnlockChimeraActivity a;

    public gfa(FreUnlockChimeraActivity freUnlockChimeraActivity) {
        this.a = freUnlockChimeraActivity;
    }

    public void onClick(View view) {
        fzl f = this.a.f();
        if (((Boolean) f.a(FreUnlockChimeraActivity.d, false)).booleanValue()) {
            this.a.a((ComponentName) f.a(FreUnlockChimeraActivity.b), (String) f.a(FreUnlockChimeraActivity.c));
        } else {
            this.a.a();
        }
    }
}
