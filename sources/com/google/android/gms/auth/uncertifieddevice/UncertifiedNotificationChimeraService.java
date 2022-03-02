package com.google.android.gms.auth.uncertifieddevice;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UncertifiedNotificationChimeraService extends qwf {
    private static final iwd a = ehv.a("UncertifiedDevice", "UncertifiedNotificationChimeraService");
    private iwq b;

    static qxg a(long j, long j2) {
        qxf qxf = new qxf();
        qxf.a(j, j2);
        qxf.k = "UncertifiedNotificationTask";
        qxf.i = "com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationService";
        qxf.a(2);
        qxf.n = true;
        qxf.b(1);
        return qxf.b();
    }

    private final iwq b() {
        if (this.b == null) {
            this.b = iwq.a((Context) this);
        }
        return this.b;
    }

    public static void b(Context context) {
        qwq a2 = qwq.a(context);
        iwq a3 = iwq.a(context);
        if (!axdg.b() || ent.ai() != 2 || ent.aj() - System.currentTimeMillis() > 604800000) {
            a2.a("UncertifiedNotificationTask", "com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationService");
            a3.a("UncertifiedNotificationChimeraService", 1);
        }
    }

    public static void a(Context context) {
        qwq a2 = qwq.a(context);
        long j = 0;
        long max = Math.max(0, ent.aj() - System.currentTimeMillis()) - 604800000;
        if (max > 0) {
            j = max;
        }
        long j2 = j / 1000;
        a2.a((qxx) a(j2, ent.ad() + j2));
    }

    public final int a(qxz qxz) {
        b().a("UncertifiedNotificationChimeraService", 1);
        long aj = ent.aj() - System.currentTimeMillis();
        if (aj <= 0) {
            a(0);
        } else if (aj <= 604800000) {
            a(aj);
            long j = (aj % 86400000) / 1000;
            qwq.a((Context) this).a((qxx) a(j, ent.ad() + j));
        } else {
            a.e("UncertifiedNotificationChimeraService should not be triggered when remaining days to expire registration is 7 or more days.", new Object[0]);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        String str;
        String str2;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse((String) ent.C.c()));
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 134217728);
        if (j <= 0) {
            str2 = getResources().getString(R.string.uncertified_notification_expired_title);
            str = getResources().getString(R.string.uncertified_notification_expired_content);
        } else {
            int i = ((int) (j / 86400000)) + (j % 86400000 > 0 ? 1 : 0);
            str2 = getResources().getString(R.string.uncertified_notification_expiring_title);
            str = getResources().getQuantityString(R.plurals.uncertified_notification_expiring_content, i, new Object[]{Integer.valueOf(i)});
        }
        je jeVar = new je(this);
        jeVar.e(str2);
        jeVar.b((CharSequence) str);
        jeVar.b(hdg.a(this, R.drawable.quantum_ic_warning_googred_24));
        jeVar.b(true);
        jd jdVar = new jd();
        jdVar.a((CharSequence) str);
        jeVar.a((jh) jdVar);
        jeVar.j = 2;
        jeVar.f = activity;
        b().a("UncertifiedNotificationChimeraService", 1, jeVar.b());
    }
}
