package defpackage;

import android.content.ContentValues;
import java.util.LinkedHashMap;

/* renamed from: zuv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zuv {
    public final zuq a = new zuq();
    public final zus b = new zus();
    public final zur c = new zur();
    public final zut d = new zut();
    public final zuu e = new zuu();
    public long f = -1;

    public final void a() {
        zuq zuq = this.a;
        zuq.a.setLength(0);
        zuq.b.setLength(0);
        zuq.c.setLength(0);
        zuq.d.setLength(0);
        zuq.e.setLength(0);
        zuq.f.setLength(0);
        zuq.g.setLength(0);
        zuq.h = 0;
        zuq.i = null;
        zuq.k = null;
        zuq.j = null;
        zuq.m = 0;
        zus zus = this.b;
        zus.a = 0;
        zus.b = 0;
        this.c.a.clear();
        this.d.a.clear();
        this.e.a.clear();
        this.f = -1;
    }

    public final zua b() {
        zua zua;
        zuq zuq = this.a;
        long j = zuq.h;
        String str = zuq.i;
        String str2 = zuq.j;
        String str3 = zuq.k;
        String a2 = zuq.a(zuq.a);
        long j2 = zuq.m;
        String a3 = zuq.a(zuq.b);
        String a4 = zuq.a(zuq.d);
        String a5 = zuq.a(zuq.e);
        String a6 = zuq.a(zuq.f);
        String a7 = zuq.a(zuq.c);
        String a8 = zuq.a(zuq.g);
        String str4 = zuq.l;
        ContentValues contentValues = new ContentValues();
        contentValues.clear();
        contentValues.put("contact_id", Long.valueOf(j));
        contentValues.put("lookup_key", str);
        contentValues.put("icon_uri", str2);
        contentValues.put("display_name", str3);
        contentValues.put("given_names", a2);
        contentValues.put("score", Long.valueOf(j2));
        contentValues.put("emails", a3);
        contentValues.put("nickname", a4);
        contentValues.put("note", a5);
        contentValues.put("organization", a6);
        contentValues.put("phone_numbers", a7);
        contentValues.put("postal_address", a8);
        contentValues.put("phonetic_name", str4);
        zus zus = this.b;
        long j3 = zus.a;
        long j4 = zus.b;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("TIMES_CONTACTED", Long.valueOf(j3));
        contentValues2.put("LAST_TIME_CONTACTED", Long.valueOf(j4));
        new zua(contentValues, contentValues2, new LinkedHashMap(this.c.a), new LinkedHashMap(this.d.a), new LinkedHashMap(this.e.a));
        return zua;
    }
}
