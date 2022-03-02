package defpackage;

import android.app.Notification;
import android.os.Build;

/* renamed from: jd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jd extends jh {
    private CharSequence c;

    public final void a(ja jaVar) {
        int i = Build.VERSION.SDK_INT;
        new Notification.BigTextStyle(((jj) jaVar).a).setBigContentTitle(this.b).bigText(this.c);
    }

    public final void b(CharSequence charSequence) {
        this.b = je.a(charSequence);
    }

    public final void a(CharSequence charSequence) {
        this.c = je.a(charSequence);
    }
}
