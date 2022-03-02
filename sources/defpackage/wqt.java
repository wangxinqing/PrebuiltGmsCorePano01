package defpackage;

import android.content.ContentValues;
import java.util.LinkedHashMap;

/* renamed from: wqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wqt {
    public final wqo a = new wqo();
    public final wqq b = new wqq();
    public final wqp c = new wqp();
    public final wqr d = new wqr();
    public final wqs e = new wqs();
    public long f = -1;

    public final void a() {
        wqo wqo = this.a;
        wqo.a.setLength(0);
        wqo.b.setLength(0);
        wqo.c.setLength(0);
        wqo.d.setLength(0);
        wqo.e.setLength(0);
        wqo.f.setLength(0);
        wqo.g.setLength(0);
        wqo.h = 0;
        wqo.i = 0;
        wqo.j = null;
        wqo.l = null;
        wqo.k = null;
        wqo.n = 0;
        wqq wqq = this.b;
        wqq.a = 0;
        wqq.b = 0;
        this.c.a.clear();
        this.d.a.clear();
        this.e.a.clear();
        this.f = -1;
    }

    public final wqj b() {
        wqj wqj;
        wqo wqo = this.a;
        long j = wqo.h;
        long j2 = wqo.i;
        String str = wqo.j;
        String str2 = wqo.k;
        String str3 = wqo.l;
        String a2 = wqo.a(wqo.a);
        long j3 = wqo.n;
        String a3 = wqo.a(wqo.b);
        String a4 = wqo.a(wqo.d);
        String a5 = wqo.a(wqo.e);
        String a6 = wqo.a(wqo.f);
        String a7 = wqo.a(wqo.c);
        String a8 = wqo.a(wqo.g);
        String str4 = wqo.m;
        ContentValues contentValues = new ContentValues();
        contentValues.clear();
        contentValues.put("contact_id", Long.valueOf(j));
        contentValues.put("raw_contact_id", Long.valueOf(j2));
        contentValues.put("lookup_key", str);
        contentValues.put("icon_uri", str2);
        contentValues.put("display_name", str3);
        contentValues.put("given_names", a2);
        contentValues.put("score", Long.valueOf(j3));
        contentValues.put("emails", a3);
        contentValues.put("nickname", a4);
        contentValues.put("note", a5);
        contentValues.put("organization", a6);
        contentValues.put("phone_numbers", a7);
        contentValues.put("postal_address", a8);
        contentValues.put("phonetic_name", str4);
        wqq wqq = this.b;
        long j4 = wqq.a;
        long j5 = wqq.b;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("TIMES_CONTACTED", Long.valueOf(j4));
        contentValues2.put("LAST_TIME_CONTACTED", Long.valueOf(j5));
        new wqj(contentValues, contentValues2, new LinkedHashMap(this.c.a), new LinkedHashMap(this.d.a), new LinkedHashMap(this.e.a));
        return wqj;
    }
}
