package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Collection;

/* renamed from: inb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class inb {
    public final aogr a;
    public final Context b;
    public final inx c;
    public amzy d;
    public final amzy e;
    public final anaf f;
    public ilu g;
    public final imz h;
    public boolean i;
    public final boolean j;

    public inb(ina ina) {
        this.a = ina.a;
        Context context = ina.b;
        amrl.a((Object) context);
        this.b = context;
        inx inx = ina.c;
        amrl.a((Object) inx);
        this.c = inx;
        this.d = ina.d;
        this.e = ina.e;
        this.f = anaf.a(ina.f);
        this.g = ina.g;
        this.h = ina.h;
        this.i = ina.i;
        this.j = ina.j;
    }

    public static ina c() {
        return new ina();
    }

    private final void e() {
        ilw ilw;
        try {
            ilw = new ilw();
            this.g = ilw.c();
            this.d = amzy.a((Collection) ilw.a());
            this.i = true;
            ilw.close();
            return;
        } catch (SQLiteException e2) {
            Log.e("FixerContext", "Couldn't fetch crashData or recent fixes", e2);
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final ilu a() {
        if (this.g == null && !this.i) {
            e();
        }
        return this.g;
    }

    public final amzy b() {
        if (this.d == null && !this.i) {
            e();
        }
        amzy amzy = this.d;
        return amzy == null ? amzy.h() : amzy;
    }

    public final ina d() {
        return new ina(this);
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("entry_point", this.a);
        a2.a("context", this.b);
        a2.a("fixerLogger", this.c);
        a2.a("recentFixes", this.d);
        a2.a("fixesExecutedThisIteration", this.e);
        a2.a("fixStatusesExecutedThisIteration", this.f);
        a2.a("crashData", this.g);
        a2.a("currentFixer", this.h);
        return a2.toString();
    }

    public final imu a(String str) {
        imu imu = (imu) this.f.get(str);
        return imu == null ? new imu(str, 1) : imu;
    }
}
