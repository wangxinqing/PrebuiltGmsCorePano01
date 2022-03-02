package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: xbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xbn implements xfj {
    final /* synthetic */ xbp a;
    private final int b;
    private boolean c;
    private ArrayList d;
    private ArrayList e;
    private ArrayList f;
    private xfg g;
    private final boolean h = (!TextUtils.isEmpty(b()));

    public xbn(xbp xbp, int i) {
        this.a = xbp;
        this.b = i;
    }

    private static final Iterable a(xfg xfg) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(xfg);
        return arrayList;
    }

    private final int i() {
        return this.a.e.b(this.b);
    }

    private final void j() {
        Cursor cursor;
        long j;
        if (!this.c) {
            this.c = true;
            int i = i();
            this.d = new ArrayList(i);
            this.e = new ArrayList();
            this.f = null;
            if (h()) {
                boolean z = this.a.j;
            }
            if (this.f == null) {
                this.f = new ArrayList();
            }
            this.g = null;
            String b2 = b();
            for (int i2 = 0; i2 < i; i2++) {
                if (this.a.c.moveToPosition(this.a.e.a(this.b, i2))) {
                    this.d.add(Long.valueOf(this.a.c.getLong(0)));
                    do {
                        String string = this.a.c.getString(2);
                        if ("vnd.android.cursor.item/email_v2".equals(string) && this.g == null) {
                            xbp xbp = this.a;
                            String a2 = a(xbp.c, xbp.h);
                            String string2 = this.a.c.getString(3);
                            if (!TextUtils.isEmpty(string2)) {
                                xbs xbs = new xbs(a2, string2);
                                if (!this.e.contains(xbs)) {
                                    if (b2 == null || !this.a.g.containsKey(xbs.a) || !b2.equals(this.a.g.get(xbs.a))) {
                                        this.e.add(xbs);
                                    } else {
                                        this.g = xbs;
                                        this.e.clear();
                                    }
                                }
                            }
                        } else if ("vnd.android.cursor.item/phone_v2".equals(string)) {
                            xbp xbp2 = this.a;
                            String a3 = a(xbp2.c, xbp2.i);
                            String string3 = this.a.c.getString(3);
                            if (!TextUtils.isEmpty(string3)) {
                                xcd xcd = new xcd(a3, string3);
                                if (!this.f.contains(xcd)) {
                                    this.f.add(xcd);
                                }
                            }
                        }
                        cursor = this.a.c;
                        String[] strArr = xbr.a;
                        iva.b(!cursor.isBeforeFirst());
                        if (cursor.isAfterLast()) {
                            break;
                        }
                        j = cursor.getLong(0);
                        if (!cursor.moveToNext()) {
                            break;
                        }
                    } while (j == cursor.getLong(0));
                }
            }
        }
    }

    public final String b() {
        this.a.d();
        return (String) this.a.f.get(this.b);
    }

    public final String c() {
        this.a.d();
        if (h()) {
            return a("name");
        }
        xbp xbp = this.a;
        xbp.c.moveToPosition(xbp.e.a(this.b, 0));
        return this.a.c.getString(1);
    }

    public final String d() {
        this.a.d();
        return ycb.a.a(a("avatar"));
    }

    public final String[] e() {
        this.a.d();
        return ycm.d(a("v_circle_ids"));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xbn) {
            xbn xbn = (xbn) obj;
            return this.b == xbn.b && this.a == xbn.a;
        }
    }

    public final Iterable f() {
        this.a.d();
        String g2 = ycm.g(a());
        if (!TextUtils.isEmpty(g2)) {
            return a((xfg) new xbs("", g2));
        }
        j();
        if (!this.h) {
            this.a.d();
            if (i() > 0) {
                return this.e;
            }
            a();
            return xfg.b;
        }
        xfg xfg = this.g;
        return xfg != null ? a(xfg) : xfg.b;
    }

    public final Iterable g() {
        this.a.d();
        if (ycm.i(a())) {
            return xfl.a;
        }
        j();
        return this.f;
    }

    public final boolean h() {
        this.a.d();
        return this.a.d.b(this.b) > 0;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    private final String a(Cursor cursor, xbo xbo) {
        int i = this.a.c.getInt(4);
        if (i == 0) {
            return cursor.getString(5);
        }
        if (i == 0) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = xbo.a;
        Integer valueOf = Integer.valueOf(i);
        String str = (String) concurrentHashMap.get(valueOf);
        if (str != null) {
            return str;
        }
        String a2 = xbo.a(xbo.b, i);
        xbo.a.put(valueOf, a2);
        return a2;
    }

    private final String a(String str) {
        if (!h()) {
            return null;
        }
        int a2 = this.a.d.a(this.b, 0);
        DataHolder dataHolder = this.a.b;
        return dataHolder.c(str, a2, dataHolder.a(a2));
    }

    public final String a() {
        this.a.d();
        return a("qualified_id");
    }
}
