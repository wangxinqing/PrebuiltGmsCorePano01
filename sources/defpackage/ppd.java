package defpackage;

import android.content.ContentUris;
import android.provider.CalendarContract;
import java.util.Date;

/* renamed from: ppd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ppd {
    public long a;
    public String b;
    public String c;
    public String d;
    public Boolean e;
    public ppl[] f;
    public ppa[] g;

    public static String a(long j) {
        return ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, j).toString();
    }

    /* access modifiers changed from: package-private */
    public final aply a() {
        aply aply = new aply("Event");
        aply.b(a(this.a));
        aply.c(this.b);
        String str = this.c;
        if (str != null) {
            iva.a((Object) str);
            aply.a("description", str);
        }
        String str2 = this.d;
        if (str2 != null) {
            iva.a((Object) str2);
            aply.a("location", str2);
        }
        Boolean bool = this.e;
        if (bool != null) {
            aply.a("allDay", bool.booleanValue());
        }
        int length = this.f.length;
        if (length > 0) {
            Date[] dateArr = new Date[length];
            Date[] dateArr2 = new Date[length];
            int i = 0;
            while (true) {
                ppl[] pplArr = this.f;
                if (i >= pplArr.length) {
                    break;
                }
                dateArr[i] = new Date(pplArr[i].a);
                dateArr2[i] = new Date(this.f[i].b);
                i++;
            }
            aply.a("startDate", aply.a(dateArr));
            aply.a("endDate", aply.a(dateArr2));
        }
        int length2 = this.g.length;
        if (length2 > 0) {
            aply[] aplyArr = new aply[length2];
            int i2 = 0;
            while (true) {
                ppa[] ppaArr = this.g;
                if (i2 >= ppaArr.length) {
                    break;
                }
                ppa ppa = ppaArr[i2];
                aply aply2 = new aply("Attendee");
                aply2.c(ppa.a);
                String str3 = ppa.b;
                if (str3 != null) {
                    aply2.a("email", str3);
                }
                String str4 = ppa.c;
                if (str4 != null) {
                    aply2.a("attendeeStatus", str4);
                }
                aplyArr[i2] = aply2;
                i2++;
            }
            iva.a((Object) aplyArr);
            aply.a("attendee", aplyArr);
        }
        aplt aplt = new aplt();
        aplt.b();
        aply.a(aplt);
        return aply;
    }
}
