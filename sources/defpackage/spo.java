package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.EventParams;
import java.util.Iterator;

/* renamed from: spo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class spo {
    final String a;
    final String b;
    final String c;
    final long d;
    final long e;
    final EventParams f;

    public spo(svv svv, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        EventParams eventParams;
        iva.c(str2);
        iva.c(str3);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            svv.E().f.a("Event created with reverse previous/current timestamps. appId", sut.a(str2));
        }
        if (!bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    svv.E().c.a("Param name can't be null");
                    it.remove();
                } else {
                    Object a2 = svv.f().a(str4, bundle2.get(str4));
                    if (a2 == null) {
                        svv.E().f.a("Param value can't be null", svv.g().b(str4));
                        it.remove();
                    } else {
                        svv.f().a(bundle2, str4, a2);
                    }
                }
            }
            eventParams = new EventParams(bundle2);
        } else {
            eventParams = new EventParams(new Bundle());
        }
        this.f = eventParams;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public spo(svv svv, String str, String str2, String str3, long j, long j2, EventParams eventParams) {
        iva.c(str2);
        iva.c(str3);
        iva.a((Object) eventParams);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            svv.E().f.a("Event created with reverse previous/current timestamps. appId, name", sut.a(str2), sut.a(str3));
        }
        this.f = eventParams;
    }
}
