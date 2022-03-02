package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;

/* renamed from: gme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gme implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ Intent b;
    final /* synthetic */ PreAddAccountChimeraActivity c;

    public gme(PreAddAccountChimeraActivity preAddAccountChimeraActivity, int i, Intent intent) {
        this.c = preAddAccountChimeraActivity;
        this.a = i;
        this.b = intent;
    }

    public final void run() {
        gme.super.a(this.a, this.b);
    }
}
