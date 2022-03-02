package defpackage;

import com.google.android.chimera.Service;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* renamed from: aubt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aubt {
    static int a(Map.Entry entry) {
        return ((auch) entry.getKey()).a;
    }

    static aubx b(Object obj) {
        return ((aucg) obj).c();
    }

    static final void c(Object obj) {
        a(obj).b();
    }

    static aubx a(Object obj) {
        return ((aucg) obj).m;
    }

    static void a(aubl aubl, Map.Entry entry) {
        auch auch = (auch) entry.getKey();
        aufw aufw = aufw.DOUBLE;
        switch (auch.b.ordinal()) {
            case 0:
                aubl.a(auch.a, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                aubl.a(auch.a, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                aubl.a(auch.a, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                aubl.c(auch.a, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                aubl.c(auch.a, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                aubl.d(auch.a, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                aubl.d(auch.a, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                aubl.a(auch.a, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                aubl.a(auch.a, (String) entry.getValue());
                return;
            case 9:
                aubl.b(auch.a, entry.getValue(), aueh.a.a((Class) entry.getValue().getClass()));
                return;
            case 10:
                aubl.a(auch.a, entry.getValue(), aueh.a.a((Class) entry.getValue().getClass()));
                return;
            case 11:
                aubl.a(auch.a, (auay) entry.getValue());
                return;
            case 12:
                aubl.e(auch.a, ((Integer) entry.getValue()).intValue());
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                aubl.c(auch.a, ((Integer) entry.getValue()).intValue());
                return;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                aubl.a(auch.a, ((Integer) entry.getValue()).intValue());
                return;
            case Service.START_CONTINUATION_MASK:
                aubl.b(auch.a, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                aubl.f(auch.a, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                aubl.e(auch.a, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    static void a(auek auek, Object obj, aubs aubs, aubx aubx) {
        auci auci = (auci) obj;
        aubx.a(auci.d, auek.a((Class) auci.c.getClass(), aubs));
    }
}
