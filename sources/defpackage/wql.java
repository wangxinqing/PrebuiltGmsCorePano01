package defpackage;

import android.database.Cursor;
import android.util.Log;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: wql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wql implements Iterator, wqk {
    private Object a;
    private final Cursor b;
    private final wqh c;
    private final wqt d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private long m;
    private boolean n;

    wql() {
    }

    private final void c() {
        if (this.a == null) {
            wqj wqj = null;
            while (wqj == null) {
                boolean z = false;
                try {
                    if (!this.b.moveToNext()) {
                        break;
                    }
                    int i2 = wqv.a;
                    long j2 = this.b.getLong(this.e);
                    long j3 = this.m;
                    if (j2 != j3) {
                        if (j3 != -1) {
                            wqj = this.d.b();
                            this.d.a();
                        }
                        this.m = j2;
                        wqt wqt = this.d;
                        wqt.f = j2;
                        wqt.a.h = j2;
                        wqt.a.i = this.b.getLong(this.f);
                        this.d.a.j = this.b.getString(this.l);
                        this.d.a.k = this.b.getString(this.g);
                        this.d.a.l = this.b.getString(this.h);
                        this.d.a.m = this.b.getString(this.i);
                        long j4 = this.b.getLong(this.j);
                        wqt wqt2 = this.d;
                        wqt2.a.n = 1 + j4;
                        wqt2.b.a = j4;
                        wqt2.b.b = this.b.getLong(this.k);
                    }
                    wqh wqh = this.c;
                    wqt wqt3 = this.d;
                    if (wqh.c != null) {
                        z = true;
                    }
                    iva.a(z, (Object) "Cursor must be set");
                    wpy wpy = (wpy) wqh.a.get(wqh.c.getString(wqh.d));
                    if (wpy != null) {
                        wpy.a(wqt3, wqh.c);
                    }
                } catch (IllegalStateException e2) {
                    Log.e("ContactsProviderHelper", "moveToNext threw an exception", e2);
                    this.n = false;
                }
            }
            if (wqj == null && this.b.isAfterLast() && this.m != -1) {
                wqj = this.d.b();
                this.d.a();
                this.m = -1;
            }
            this.a = wqj;
        }
    }

    public final void a() {
        this.b.close();
    }

    public final boolean b() {
        return this.n;
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

    public wql(Cursor cursor, wqh wqh) {
        iva.a((Object) cursor);
        this.b = cursor;
        this.c = wqh;
        wqh.c = cursor;
        wqh.d = cursor.getColumnIndex("mimetype");
        this.d = new wqt();
        this.e = cursor.getColumnIndex("contact_id");
        this.f = cursor.getColumnIndex("raw_contact_id");
        this.l = cursor.getColumnIndex("lookup");
        this.g = cursor.getColumnIndex("photo_thumb_uri");
        this.h = cursor.getColumnIndex("display_name");
        this.i = cursor.getColumnIndex("phonetic_name");
        this.j = cursor.getColumnIndex("times_contacted");
        this.k = cursor.getColumnIndex("last_time_contacted");
        this.m = -1;
        this.n = true;
    }
}
