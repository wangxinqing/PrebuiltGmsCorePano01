package defpackage;

import android.database.Cursor;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: zuc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zuc implements Iterator, zub {
    private Object a;
    private final Cursor b;
    private final ztx c;
    private final zuv d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private long l;
    private boolean m;

    zuc() {
    }

    private final void c() {
        if (this.a == null) {
            zua zua = null;
            while (zua == null) {
                boolean z = true;
                try {
                    if (!this.b.moveToNext()) {
                        break;
                    }
                    zsg zsg = zux.a;
                    long j2 = this.b.getLong(this.e);
                    long j3 = this.l;
                    if (j2 != j3) {
                        if (j3 != -1) {
                            zua = this.d.b();
                            this.d.a();
                        }
                        this.l = j2;
                        zuv zuv = this.d;
                        zuv.f = j2;
                        zuv.a.h = j2;
                        zuv.a.i = this.b.getString(this.k);
                        this.d.a.j = this.b.getString(this.f);
                        this.d.a.k = this.b.getString(this.g);
                        this.d.a.l = this.b.getString(this.h);
                        long j4 = this.b.getLong(this.i);
                        zuv zuv2 = this.d;
                        zuv2.a.m = 1 + j4;
                        zuv2.b.a = j4;
                        zuv2.b.b = this.b.getLong(this.j);
                    }
                    ztx ztx = this.c;
                    zuv zuv3 = this.d;
                    if (ztx.d == null) {
                        z = false;
                    }
                    iva.a(z, (Object) "Cursor must be set");
                    zto zto = (zto) ztx.b.get(ztx.d.getString(ztx.e));
                    if (zto != null) {
                        zto.a(zuv3, ztx.d);
                    }
                } catch (IllegalStateException e2) {
                    if (azfa.g()) {
                        zux.a.a((Throwable) e2, "moveToNext threw an exception");
                    } else {
                        zux.a.e("moveToNext threw an exception", e2);
                    }
                    this.m = false;
                }
            }
            if (zua == null && this.b.isAfterLast() && this.l != -1) {
                zua = this.d.b();
                this.d.a();
                this.l = -1;
            }
            this.a = zua;
        }
    }

    public final void a() {
        this.b.close();
    }

    public final boolean b() {
        return this.m;
    }

    public final boolean hasNext() {
        c();
        return this.a != null;
    }

    public final Object next() {
        c();
        Object obj = this.a;
        if (obj != null) {
            this.a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public zuc(Cursor cursor, ztx ztx) {
        iva.a((Object) cursor);
        this.b = cursor;
        this.c = ztx;
        ztx.d = cursor;
        ztx.e = cursor.getColumnIndex("mimetype");
        this.d = new zuv();
        this.e = cursor.getColumnIndex("contact_id");
        this.k = cursor.getColumnIndex("lookup");
        this.f = cursor.getColumnIndex("photo_thumb_uri");
        this.g = cursor.getColumnIndex("display_name");
        this.h = cursor.getColumnIndex("phonetic_name");
        this.i = cursor.getColumnIndex("times_contacted");
        this.j = cursor.getColumnIndex("last_time_contacted");
        this.l = -1;
        this.m = true;
    }
}
