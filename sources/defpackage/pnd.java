package defpackage;

import android.content.ContentValues;
import java.util.LinkedHashMap;

/* renamed from: pnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pnd {
    public final pmy a = new pmy();
    public final pna b = new pna();
    public final pmz c = new pmz();
    public final pnb d = new pnb();
    public final pnc e = new pnc();
    public long f = -1;

    public final void a() {
        pmy pmy = this.a;
        pmy.a.setLength(0);
        pmy.b.setLength(0);
        pmy.c.setLength(0);
        pmy.d.setLength(0);
        pmy.e.setLength(0);
        pmy.f.setLength(0);
        pmy.g.setLength(0);
        pmy.h = 0;
        pmy.i = null;
        pmy.k = null;
        pmy.j = null;
        pmy.m = 0;
        pna pna = this.b;
        pna.a = 0;
        pna.b = 0;
        this.c.a.clear();
        this.d.a.clear();
        this.e.a.clear();
        this.f = -1;
    }

    public final pms b() {
        pmy pmy = this.a;
        ContentValues a2 = pmw.a(pmy.h, pmy.i, pmy.j, pmy.k, pmy.a(pmy.a), pmy.m, pmy.a(pmy.b), pmy.a(pmy.d), pmy.a(pmy.e), pmy.a(pmy.f), pmy.a(pmy.c), pmy.a(pmy.g), pmy.l);
        pna pna = this.b;
        long j = pna.a;
        long j2 = pna.b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("TIMES_CONTACTED", Long.valueOf(j));
        contentValues.put("LAST_TIME_CONTACTED", Long.valueOf(j2));
        return new pms(a2, contentValues, new LinkedHashMap(this.c.a), new LinkedHashMap(this.d.a), new LinkedHashMap(this.e.a));
    }
}
