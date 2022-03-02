package defpackage;

import android.database.Cursor;
import java.io.Closeable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: kky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kky extends AbstractList implements List, Closeable {
    private boolean a = false;
    private final int b;
    private final kkb c;
    private Cursor d;
    private final kkp e;

    public kky(kkb kkb, Cursor cursor, kkp kkp) {
        int count = cursor.getCount();
        boolean z = false;
        iva.b(count >= 0 ? true : z, "Size must be nonnegative.");
        this.b = count;
        iva.a((Object) kkb);
        this.c = kkb;
        iva.a((Object) cursor);
        this.d = cursor;
        iva.a((Object) kkp);
        this.e = kkp;
    }

    private final void b() {
        if (this.a) {
            throw new IllegalStateException("Result list is closed.");
        }
    }

    public final List a() {
        b();
        try {
            return Collections.unmodifiableList(new ArrayList(this));
        } finally {
            close();
        }
    }

    public final void close() {
        if (!this.a) {
            this.a = true;
            this.d.close();
            this.d = null;
        }
    }

    public final Object get(int i) {
        b();
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        } else if (this.d.moveToPosition(i)) {
            Object a2 = this.e.a(this.c, this.d);
            iva.a(a2, (Object) "Result decoder returned null.");
            return a2;
        } else {
            throw new IllegalStateException("Failed to move delegate cursor.");
        }
    }

    public final int size() {
        b();
        return this.b;
    }
}
