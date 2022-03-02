package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.icing.proxy.UpdateIcingCorporaIntentOperation;

/* renamed from: pnm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pnm {
    private static boolean a;

    public static synchronized void a(Context context) {
        synchronized (pnm.class) {
            if (a()) {
                context.startService(UpdateIcingCorporaIntentOperation.a(context, "FORCE_ALL"));
            }
            if (poo.a(context)) {
                SharedPreferences e = poo.e(context);
                if (!e.getBoolean("enable_sms_corpus_with_appdatasearchhelper", false)) {
                    pnz.d("Clearing legacy SMS Corpus");
                    e.edit().clear().apply();
                    context.deleteFile("icing_sms_corpus.bin");
                    context.deleteFile("icing_sms_corpus.docs");
                    context.deleteFile("icing_sms_corpus.bin");
                }
            }
        }
    }

    public static synchronized void b(Context context) {
        synchronized (pnm.class) {
            pnz.d("Calling IcingInternalCorpora.initializeUponIndexServiceRestart");
            poo.c(context);
            if (pmb.a(context)) {
                context.startService(UpdateIcingCorporaIntentOperation.c(context));
            }
        }
    }

    public static void c(Context context) {
        oyq oyq = new oyq(context);
        pnz.a("IcingInternalCorpora.onMaintenance");
        poi.a().a(poi.a("IcingInternalCorpusMaintenanceRunnable", new pnl(context, oyq)));
    }

    static synchronized boolean b() {
        boolean z;
        synchronized (pnm.class) {
            if (!a) {
                boolean z2 = true;
                if (jkr.b() && kr.a(ihs.b(), "android.permission.READ_CONTACTS") != 0) {
                    z2 = false;
                }
                a = z2;
            }
            z = a;
        }
        return z;
    }

    public static boolean a() {
        if (((Boolean) ozx.ag.c()).booleanValue()) {
            pnz.d("Contacts corpus is disabled by Gservices flag");
            return false;
        } else if (b()) {
            return true;
        } else {
            pnz.d("Contacts corpus is disabled because indexing is not permitted");
            return false;
        }
    }
}
