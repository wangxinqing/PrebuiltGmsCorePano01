package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: xvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class xvu {
    public static xvt r() {
        xvt xvt = new xvt();
        xvt.d(false);
        xvt.f(false);
        xvt.e(false);
        xvt.a(false);
        xvt.c(false);
        xvt.b(false);
        return xvt;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract Long g();

    public abstract Long h();

    public abstract Long i();

    public abstract String j();

    public abstract String k();

    public abstract String l();

    public abstract String m();

    public abstract String n();

    public abstract String o();

    public abstract String p();

    public abstract wvq q();

    public final ContentValues s() {
        String str;
        ContentValues contentValues = new ContentValues();
        contentValues.put("sourceid", j());
        contentValues.put("system_id", k());
        contentValues.put("group_is_read_only", Integer.valueOf(c() ? 1 : 0));
        contentValues.put("auto_add", Integer.valueOf(d() ? 1 : 0));
        contentValues.put("favorites", Integer.valueOf(a() ? 1 : 0));
        contentValues.put("title", l());
        contentValues.put("sync2", m());
        contentValues.put("sync3", i());
        if (aysc.a.a().c() && !TextUtils.isEmpty(l())) {
            if (TextUtils.isEmpty(k())) {
                str = l();
            } else {
                String valueOf = String.valueOf(l());
                str = valueOf.length() == 0 ? new String("System Group: ") : "System Group: ".concat(valueOf);
            }
            contentValues.put("notes", str);
        }
        return contentValues;
    }
}
