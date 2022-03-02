package defpackage;

import android.content.ContentValues;
import java.util.Locale;

/* renamed from: kqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kqi {
    private static final ith a = new ith("DatabaseRow", "");
    public final kqg am;
    public final kql an;
    public boolean ao;

    protected kqi(kqg kqg, kql kql, boolean z) {
        this.am = kqg;
        iva.a((Object) kql);
        this.an = kql;
        this.ao = z;
    }

    public abstract kqy a();

    /* access modifiers changed from: protected */
    public abstract void b(ContentValues contentValues);

    public void c(long j) {
        this.ao = true;
    }

    public final ContentValues r() {
        String str;
        ContentValues contentValues = new ContentValues();
        try {
            b(contentValues);
            return contentValues;
        } catch (RuntimeException e) {
            try {
                str = toString();
            } catch (RuntimeException e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("[additional RuntimeException thrown by toString(): ");
                sb.append(message);
                sb.append("]");
                str = sb.toString();
            }
            a.c("DatabaseRow", "Error in fillContentValues()", e);
            a.a("Error in fillContentValues() on %s; partial result: %s", str, contentValues);
            throw e;
        }
    }

    public void s() {
        this.ao = false;
    }

    public final void t() {
        if (this.ao) {
            ((kkb) this.am).a((kkh) null, this.an, a(), r());
            return;
        }
        c(((kkb) this.am).a((kkh) null, this.an, r()));
    }

    public String toString() {
        return String.format(Locale.US, "DatabaseRow[%s, values=%s]", new Object[]{this.an, r()});
    }

    public final void u() {
        iva.a(this.ao);
        this.am.a(this.an, a());
        s();
    }
}
