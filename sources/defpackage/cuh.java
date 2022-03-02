package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cuh implements cub {
    private final eb a;
    private final dr b;
    private final eg c;
    private final eg d;

    public cuh(eb ebVar) {
        this.a = ebVar;
        this.b = new cuc(ebVar);
        new cud(ebVar);
        new cue(ebVar);
        this.c = new cuf(ebVar);
        this.d = new cug(ebVar);
    }

    public final cui a(String str, String str2, aqsr aqsr, boolean z, String str3) {
        boolean z2;
        csl csl;
        String str4 = str;
        String str5 = str2;
        ee a2 = ee.a("SELECT * FROM resource_info WHERE accountName LIKE ? AND language LIKE ? AND resourceKey LIKE ? AND darkModeEnabled LIKE ? AND callingAndroidApp LIKE ? ", 5);
        if (str4 == null) {
            a2.a(1);
        } else {
            a2.a(1, str4);
        }
        if (str5 != null) {
            a2.a(2, str5);
        } else {
            a2.a(2);
        }
        byte[] a3 = csk.a(aqsr);
        if (a3 == null) {
            a2.a(3);
        } else {
            a2.e[3] = 5;
            a2.d[3] = a3;
        }
        a2.e[4] = 2;
        a2.a[4] = z ? 1 : 0;
        a2.a(5, str3);
        this.a.e();
        Cursor a4 = this.a.a((dg) a2);
        try {
            int a5 = ek.a(a4, "accountName");
            int a6 = ek.a(a4, "language");
            int a7 = ek.a(a4, "resourceKey");
            int a8 = ek.a(a4, "darkModeEnabled");
            int a9 = ek.a(a4, "callingAndroidApp");
            int a10 = ek.a(a4, "resource");
            int a11 = ek.a(a4, "lastUpdatedMs");
            cui cui = null;
            if (a4.moveToFirst()) {
                String string = a4.getString(a5);
                String string2 = a4.getString(a6);
                aqsr a12 = csk.a(a4.getBlob(a7));
                if (a4.getInt(a8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String string3 = a4.getString(a9);
                if (a4.isNull(a10) && a4.isNull(a11)) {
                    csl = null;
                } else {
                    csl = new csl(csk.b(a4.getBlob(a10)), a4.getLong(a11));
                }
                cui = new cui(string, string2, a12, z2, string3, csl);
            }
            return cui;
        } finally {
            a4.close();
            a2.b();
        }
    }

    public final void b() {
        this.a.e();
        C0000do b2 = this.d.b();
        this.a.f();
        try {
            b2.b();
            this.a.h();
        } finally {
            this.a.g();
            this.d.a(b2);
        }
    }

    public final void b(List list) {
        this.a.e();
        StringBuilder a2 = el.a();
        a2.append("DELETE FROM resource_info WHERE accountName NOT IN (");
        el.a(a2, list.size());
        a2.append(")");
        C0000do a3 = this.a.a(a2.toString());
        int size = list.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) list.get(i2);
            if (str == null) {
                a3.a(i);
            } else {
                a3.a(i, str);
            }
            i++;
        }
        this.a.f();
        try {
            a3.b();
            this.a.h();
        } finally {
            this.a.g();
        }
    }

    public final List a() {
        ee eeVar;
        boolean z;
        csl csl;
        ee a2 = ee.a("SELECT * FROM resource_info", 0);
        this.a.e();
        Cursor a3 = this.a.a((dg) a2);
        try {
            int a4 = ek.a(a3, "accountName");
            int a5 = ek.a(a3, "language");
            int a6 = ek.a(a3, "resourceKey");
            int a7 = ek.a(a3, "darkModeEnabled");
            int a8 = ek.a(a3, "callingAndroidApp");
            int a9 = ek.a(a3, "resource");
            int a10 = ek.a(a3, "lastUpdatedMs");
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                String string = a3.getString(a4);
                String string2 = a3.getString(a5);
                aqsr a11 = csk.a(a3.getBlob(a6));
                if (a3.getInt(a7) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                String string3 = a3.getString(a8);
                if (a3.isNull(a9) && a3.isNull(a10)) {
                    eeVar = a2;
                    csl = null;
                } else {
                    eeVar = a2;
                    try {
                        csl = new csl(csk.b(a3.getBlob(a9)), a3.getLong(a10));
                    } catch (Throwable th) {
                        th = th;
                        a3.close();
                        eeVar.b();
                        throw th;
                    }
                }
                arrayList.add(new cui(string, string2, a11, z, string3, csl));
                a2 = eeVar;
            }
            a3.close();
            a2.b();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            eeVar = a2;
            a3.close();
            eeVar.b();
            throw th;
        }
    }

    public final void a(long j) {
        this.a.e();
        C0000do b2 = this.c.b();
        b2.a(1, j);
        this.a.f();
        try {
            b2.b();
            this.a.h();
        } finally {
            this.a.g();
            this.c.a(b2);
        }
    }

    public final void a(List list) {
        dr drVar;
        C0000do b2;
        this.a.e();
        this.a.f();
        try {
            drVar = this.b;
            b2 = drVar.b();
            for (Object a2 : list) {
                drVar.a(b2, a2);
                b2.a();
            }
            drVar.a(b2);
            this.a.h();
            this.a.g();
        } catch (Throwable th) {
            this.a.g();
            throw th;
        }
    }
}
