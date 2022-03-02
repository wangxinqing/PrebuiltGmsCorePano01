package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: elf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class elf implements eio {
    public static final elf a = new elf();

    private elf() {
    }

    public final void a(Context context) {
    }

    public final void b(Context context) {
    }

    public final void c(Context context) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.account.be.accountstate.LoginAccountsChangedIntentService");
        className.setAction("BootOrGmsUpdated");
        acsb.b(context, className);
    }
}
