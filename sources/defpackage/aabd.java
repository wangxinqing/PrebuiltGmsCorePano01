package defpackage;

import android.content.Intent;

/* renamed from: aabd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aabd implements Runnable {
    private final Intent a;

    public aabd(Intent intent) {
        this.a = intent;
    }

    public final void run() {
        String str;
        Intent intent = this.a;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if ("com.google.android.gms.scheduler.intent.USER_UNLOCKED".equals(str) && aekv.a() && aabg.b()) {
            aabg.a().a(ihs.b(), jiu.a);
        }
    }
}
