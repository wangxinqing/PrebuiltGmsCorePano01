package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xwa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class xwa {
    public final Cursor a;

    protected xwa(Cursor cursor) {
        iva.a((Object) cursor);
        this.a = cursor;
    }

    /* access modifiers changed from: protected */
    public final String a(String str) {
        int columnIndex = this.a.getColumnIndex(str);
        if (columnIndex == -1 || this.a.isNull(columnIndex)) {
            return null;
        }
        return this.a.getString(columnIndex);
    }

    /* access modifiers changed from: protected */
    public final Long b(String str) {
        int columnIndex = this.a.getColumnIndex(str);
        if (columnIndex == -1 || this.a.isNull(columnIndex)) {
            return null;
        }
        return Long.valueOf(this.a.getLong(columnIndex));
    }

    public abstract Object b();

    public final int c() {
        return this.a.getCount();
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return this.a.moveToNext();
    }

    /* JADX INFO: finally extract failed */
    public final List e() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            try {
                Object b = b();
                if (b != null) {
                    arrayList.add(b);
                } else {
                    f();
                    arrayList.size();
                    return arrayList;
                }
            } catch (Throwable th) {
                f();
                throw th;
            }
        }
    }

    public final void f() {
        this.a.close();
    }

    /* access modifiers changed from: protected */
    public final byte[] c(String str) {
        int columnIndex = this.a.getColumnIndex(str);
        if (columnIndex == -1 || this.a.isNull(columnIndex)) {
            return null;
        }
        return this.a.getBlob(columnIndex);
    }

    /* access modifiers changed from: protected */
    public final boolean d(String str) {
        int columnIndex = this.a.getColumnIndex(str);
        if (columnIndex == -1 || this.a.isNull(columnIndex) || this.a.getLong(columnIndex) == 0) {
            return false;
        }
        return true;
    }
}
