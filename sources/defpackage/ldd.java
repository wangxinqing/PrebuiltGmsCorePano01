package defpackage;

import android.text.TextUtils;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.SortOrder;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: ldd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ldd {
    private static final ith d = new ith("SyncMoreFactory", "");
    public final lsm a;
    public final kkf b;
    public final kkz c;
    private final khq e;

    public ldd(lsm lsm, khq khq) {
        iva.a((Object) lsm);
        this.a = lsm;
        this.b = lsm.d;
        iva.a((Object) khq);
        this.e = khq;
        this.c = khq.a;
    }

    private static final Date a(Date date, Date date2) {
        if (date != null) {
            return (date2 == null || date.getTime() > date2.getTime()) ? date : date2;
        }
        return date2;
    }

    public final Date a(Query query) {
        Date date;
        Date date2;
        Set a2 = query.a();
        iva.a((Object) a2, (Object) "Query can't have null spaces (have you validated them?)");
        boolean z = true;
        iva.b(!a2.isEmpty(), "Query can't have empty spaces (have you validated them?)");
        boolean contains = a2.contains(DriveSpace.a);
        boolean contains2 = a2.contains(DriveSpace.c);
        boolean contains3 = a2.contains(DriveSpace.b);
        if (!contains3 && !contains && !contains2) {
            z = false;
        }
        iva.a(z, (Object) "Not querying any space?");
        Date date3 = null;
        if (contains) {
            LogicalFilter logicalFilter = query.a;
            if (logicalFilter == null || !((Boolean) logicalFilter.a(new lip())).booleanValue()) {
                List<koa> a3 = this.b.a(this.c, lcr.DRIVE);
                if (a3.isEmpty()) {
                    date = new Date(Long.MAX_VALUE);
                } else {
                    Date date4 = null;
                    for (koa koa : a3) {
                        Long l = koa.b;
                        date4 = a(date4, l != null ? new Date(l.longValue()) : null);
                    }
                    date = date4;
                }
            } else {
                date = new Date(Long.MAX_VALUE);
            }
        } else {
            date = null;
        }
        if (contains3) {
            Iterator it = this.b.a(this.c, lcr.APPDATA).iterator();
            while (true) {
                if (!it.hasNext()) {
                    date2 = new Date(Long.MAX_VALUE);
                    break;
                }
                koa koa2 = (koa) it.next();
                if (((lcm) koa2.b()).a.contains(this.e.b)) {
                    Long l2 = koa2.b;
                    if (l2 != null) {
                        date2 = new Date(l2.longValue());
                    } else {
                        date2 = null;
                    }
                }
            }
            date = a(date, date2);
        }
        if (!contains2) {
            return date;
        }
        koa b2 = this.b.b(this.c);
        if (b2 == null) {
            date3 = new Date(Long.MAX_VALUE);
        } else {
            Long l3 = b2.b;
            if (l3 != null) {
                date3 = new Date(l3.longValue());
            }
        }
        return a(date, date3);
    }

    public final lcl a(Query query, Date date) {
        iva.a((Object) query.a(), (Object) "Query can't have null spaces (have you validated them?)");
        iva.b(!query.a().isEmpty(), "Query can't have empty spaces (have you validated them?)");
        lck a2 = new lij(this.e.b).a(query);
        String str = null;
        if (!query.a().contains(DriveSpace.b)) {
            SortOrder sortOrder = query.c;
            ArrayList arrayList = new ArrayList();
            if (sortOrder != null) {
                if (sortOrder.b) {
                    arrayList.add(lcw.j.a);
                }
                if (!sortOrder.a.isEmpty()) {
                    List list = sortOrder.a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        FieldWithSortOrder fieldWithSortOrder = (FieldWithSortOrder) list.get(i);
                        kyq a3 = lbm.a(fieldWithSortOrder.a);
                        if (a3 == null) {
                            d.b("SyncMoreFactory", "Bad sort order field: %s", fieldWithSortOrder.a);
                        } else {
                            lcv lcv = lap.a(a3).c;
                            if (lcv != null && lcv.c) {
                                String str2 = lcv.a;
                                String str3 = !fieldWithSortOrder.b ? " desc" : "";
                                arrayList.add(str3.length() == 0 ? new String(str2) : str2.concat(str3));
                            }
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                str = TextUtils.join(",", arrayList);
            }
        }
        return new lcl(lck.a(Arrays.asList(new lck[]{a2, lck.a(date)})), query.a(), str);
    }
}
