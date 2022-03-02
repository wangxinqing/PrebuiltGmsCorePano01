package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;
import java.util.List;
import java.util.Random;

/* renamed from: gkc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gkc implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ String b;
    final /* synthetic */ SourceChimeraActivity c;

    public gkc(SourceChimeraActivity sourceChimeraActivity, List list, String str) {
        this.c = sourceChimeraActivity;
        this.a = list;
        this.b = str;
    }

    public final void run() {
        SourceChimeraActivity sourceChimeraActivity = this.c;
        List list = this.a;
        String str = this.b;
        String string = sourceChimeraActivity.getString(R.string.auth_d2d_source_notification_title);
        CharSequence expandTemplate = TextUtils.expandTemplate(sourceChimeraActivity.getResources().getQuantityString(R.plurals.auth_d2d_source_notification_text, list.size()), new CharSequence[]{str});
        gqg.a(iwq.a((Context) sourceChimeraActivity), sourceChimeraActivity, "com.google.android.gms.auth.base.Notifications.AuthGroup.AccountReauth");
        gkx gkx = new gkx(sourceChimeraActivity);
        gkx.a(1800000);
        gkx.a(expandTemplate);
        gkx.c(expandTemplate);
        gkx.d(string);
        gkx.a(Uri.parse(ent.x()));
        gkx.b(true);
        gkx.a(17301642);
        gkx.e(string);
        gkx.b((CharSequence) "com.google.android.gms.auth.base.Notifications.AuthGroup.AccountReauth");
        gkw gkw = new gkw(iwq.a((Context) sourceChimeraActivity), new jbs(sourceChimeraActivity));
        int nextInt = new Random().nextInt();
        if (gkx.c() <= 86400000) {
            gkx a2 = gkx.a((Context) ihs.b(), gkx);
            if (a2.c() <= 0) {
                a2.a(300000);
                a2.a(true);
            }
            a2.b(System.currentTimeMillis());
            gkw.a("d2d", nextInt, a2);
            return;
        }
        throw new IllegalArgumentException("Notification cannot have max duration exceeding 1 day.");
    }
}
