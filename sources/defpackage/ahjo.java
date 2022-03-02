package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: ahjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahjo implements aizr {
    private static final SimpleDateFormat a = new SimpleDateFormat("MM/dd/yyyy h:mm a", Locale.ENGLISH);
    private final aizl b;
    private final aicn c;

    public ahjo(aizl aizl, aicn aicn) {
        this.b = aizl;
        this.c = aicn;
    }

    private static String a(String str, String str2, String str3, String str4, String str5) {
        return str.replace("{datetime}", str2).replace("{timestamp}", str3).replace("{hash}", str4).replace("{version}", str5);
    }

    private final void a(String str, String str2, String str3, String str4, int i) {
        if (!str3.isEmpty()) {
            String l = Long.toString(System.currentTimeMillis());
            String format = a.format(new Date(System.currentTimeMillis()));
            String num = Integer.toString(i);
            String a2 = a(str3, format, l, str4, num);
            this.b.a(a(str, format, l, str4, num), a(str2, format, l, str4, num), a2, true, -1);
        }
    }

    public final void a(int i) {
        if (axyi.c() && axyi.a.a().chreCcHealthNotificationEnabled()) {
            String num = Integer.toString(i);
            this.b.a(axyi.a.a().chreCcHealthNotificationTitle().replace("{version}", num), axyi.a.a().chreCcHealthNotificationText().replace("{version}", num), (String) null, false, 60000);
        }
    }

    public final boolean a(aizq aizq) {
        boolean z;
        aizq aizq2 = aizq;
        String format = String.format(Locale.ENGLISH, "%08x%08x%08x%08x", new Object[]{Integer.valueOf(Float.floatToIntBits(aizq2.a)), Integer.valueOf(Float.floatToIntBits(aizq2.b)), Integer.valueOf(Float.floatToIntBits(aizq2.c)), Integer.valueOf(Float.floatToIntBits(aizq2.d))});
        if (axyi.c()) {
            if (aizq2.f) {
                if (!axyi.a.a().chreCcNotificationEnabled() || ((double) aizq2.a) < axyi.a.a().chreCcNotificationConfidenceThreshold()) {
                    z = false;
                } else {
                    a(axyi.a.a().chreCcNotificationTitle(), axyi.a.a().chreCcNotificationText(), axyi.a.a().chreCcNotificationUri(), format, aizq2.e);
                    z = true;
                }
            } else if (axyi.a.a().chreCcFalseNotificationEnabled() && ((double) aizq2.a) >= axyi.a.a().chreCcFalseNotificationConfidenceThreshold()) {
                a(axyi.a.a().chreCcFalseNotificationTitle(), axyi.a.a().chreCcFalseNotificationText(), axyi.a.a().chreCcFalseNotificationUri(), format, aizq2.e);
                z = true;
            }
            this.c.a(new aicl(aico.CAR_CRASH_DEBUG_EVENT, this.c.b(), (String) null, String.format(Locale.ENGLISH, "isCc=%b, conf=%f, veh_conf=%f, integ50=%s, integ75=%s, notif=%b, hash=%s", new Object[]{Boolean.valueOf(aizq2.f), Float.valueOf(aizq2.a), Float.valueOf(aizq2.b), Float.valueOf(aizq2.c), Float.valueOf(aizq2.d), Boolean.valueOf(z), format}), -1, -1, -1));
            return z;
        }
        z = false;
        this.c.a(new aicl(aico.CAR_CRASH_DEBUG_EVENT, this.c.b(), (String) null, String.format(Locale.ENGLISH, "isCc=%b, conf=%f, veh_conf=%f, integ50=%s, integ75=%s, notif=%b, hash=%s", new Object[]{Boolean.valueOf(aizq2.f), Float.valueOf(aizq2.a), Float.valueOf(aizq2.b), Float.valueOf(aizq2.c), Float.valueOf(aizq2.d), Boolean.valueOf(z), format}), -1, -1, -1));
        return z;
    }
}
