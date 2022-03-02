package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Collection;

/* renamed from: qko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qko {
    public static final /* synthetic */ int a = 0;

    static {
        new qfn("SecondPhaseIntentFilterFetcher");
    }

    public static final void a(Collection collection, Collection collection2, qjt qjt) {
        if (axvw.b()) {
            Object[] objArr = {TextUtils.join(",", collection), TextUtils.join(",", collection2)};
            qjt.a(collection, collection2);
            if (!collection.isEmpty()) {
                qwq a2 = qwq.a((Context) ihs.b());
                int hashCode = collection.hashCode();
                int hashCode2 = collection2.hashCode();
                StringBuilder sb = new StringBuilder(58);
                sb.append("instantapps.ScheduleGetIntentFilters");
                sb.append(hashCode);
                sb.append(hashCode2);
                String sb2 = sb.toString();
                long d = axvw.a.a().d();
                long c = axvw.a.a().c();
                qxf qxf = new qxf();
                qxf.i = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
                qxf.k = sb2;
                qxf.a(0);
                qxf.a(d, c + d);
                qxf.n = true;
                qxf.b(0);
                a2.a((qxx) qxf.b());
            }
        }
    }
}
