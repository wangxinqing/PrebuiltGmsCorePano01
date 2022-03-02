package defpackage;

import com.google.android.gms.drive.DriveId;
import java.text.ParseException;
import java.util.Date;

/* renamed from: lfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lfa extends lec {
    private static final ith a = new ith("UpdatedDateMonitorProce", "");
    private Date b;

    public lfa(ldz ldz, long j) {
        super(ldz);
        this.b = new Date(j);
    }

    public final DriveId a(krk krk, lnj lnj, boolean z) {
        String o = lnj.o();
        if (o != null) {
            try {
                Date a2 = kju.a(o);
                if (a2.before(this.b)) {
                    this.b = a2;
                }
            } catch (ParseException e) {
                a.c("UpdatedDateMonitorProce", String.format("Error parsing date %s", new Object[]{o}), e);
            }
        }
        return super.a(krk, lnj, z);
    }

    public final Date a() {
        Date date = this.b;
        if (date != null) {
            return new Date(date.getTime());
        }
        return null;
    }

    public final void a(String str) {
        if (str == null) {
            this.b = null;
        }
        super.a(str);
    }
}
