package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kkb implements kqg {
    public static final ith a = new ith("DocListDatabase", "");
    public final kkc b;
    public final AtomicReference c = new AtomicReference();
    public final ThreadLocal d = new kjv();
    public volatile AtomicLong e;
    public final ThreadLocal f = new ThreadLocal();
    private final AtomicLong g = new AtomicLong(0);
    private final Executor h;
    private final ThreadLocal i = new kjx();
    private final ThreadLocal j = new ThreadLocal();

    private final void k() {
        l();
        a().beginTransaction();
    }

    private final void l() {
        boolean z;
        if (this.c.get() != null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        this.d.set(Long.valueOf(((Long) this.d.get()).longValue() + 1));
        this.g.incrementAndGet();
    }

    private final void m() {
        long longValue = ((Long) this.d.get()).longValue() - 1;
        this.d.set(Long.valueOf(longValue));
        if (longValue == 0) {
            this.d.remove();
        }
        this.g.decrementAndGet();
    }

    public final int a(kkh kkh, kql kql, kqy kqy) {
        String[] strArr;
        a(kkh);
        String str = null;
        if (kqy != null) {
            String str2 = kqy.a;
            strArr = kqy.a();
            if (strArr.length == 0) {
                strArr = null;
                str = str2;
            } else {
                str = str2;
            }
        } else {
            strArr = null;
        }
        l();
        try {
            return a().delete(kql.b(), str, strArr);
        } finally {
            m();
        }
    }

    public final Cursor b(String str, String[] strArr) {
        a((kkh) null);
        l();
        try {
            return a().rawQuery(str, strArr);
        } finally {
            m();
        }
    }

    public final kkh c() {
        boolean z;
        iva.a(((Stack) this.i.get()).isEmpty(), (Object) "Cannot be in savepoint state");
        if (((Long) this.d.get()).longValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "Cannot be already in a transaction");
        k();
        kkh kkh = new kkh(this, this.h);
        this.f.set(kkh);
        return kkh;
    }

    public final void d() {
        a((kkh) null);
        Stack stack = (Stack) this.i.get();
        if (!stack.empty()) {
            kjz kjz = (kjz) stack.peek();
            iva.a(!kjz.a.empty());
            kjz.b |= !((Boolean) kjz.a.pop()).booleanValue();
            return;
        }
        e();
    }

    public final void e() {
        a().endTransaction();
        m();
    }

    public final void f() {
        a((kkh) null);
        Stack stack = (Stack) this.i.get();
        if (!stack.empty()) {
            Stack stack2 = ((kjz) stack.peek()).a;
            iva.a(!stack2.empty());
            iva.a(!((Boolean) stack2.pop()).booleanValue());
            stack2.push(true);
            return;
        }
        a().setTransactionSuccessful();
    }

    public final long g() {
        a();
        kkc kkc = this.b;
        long j2 = kkc.b;
        if (j2 == -1) {
            lhy lhy = (lhy) kkc.a;
            SharedPreferences d2 = lhy.d();
            if (!d2.contains("databaseInstanceId")) {
                SharedPreferences c2 = lhy.c();
                if (c2.contains("databaseInstanceId")) {
                    lhy.a(c2.getLong("databaseInstanceId", 0));
                }
            }
            long j3 = d2.getLong("databaseInstanceId", 0);
            if (j3 == 0) {
                lhy.a.b("PreferencesImpl", "Database creation timestamp not found! Re-initing to current timestamp");
                j2 = lhy.b();
            } else {
                j2 = j3;
            }
            kkc.b = j2;
        }
        return j2;
    }

    public final void h() {
        a((kkh) null);
        boolean inTransaction = a().inTransaction();
        Stack stack = (Stack) this.i.get();
        int size = stack.size();
        a.a("Begin savepoint %d", Integer.valueOf(size));
        if (size == 0) {
            this.j.set(Boolean.valueOf(!inTransaction));
            if (!inTransaction) {
                k();
            }
        }
        a().execSQL(String.format(Locale.US, ";savepoint s%d", new Object[]{Integer.valueOf(size)}));
        stack.push(new kjz());
    }

    public final void i() {
        a((kkh) null);
        Stack stack = (Stack) this.i.get();
        iva.a(!stack.empty());
        kjz kjz = (kjz) stack.peek();
        boolean z = false;
        if (!kjz.c && kjz.a.empty()) {
            z = true;
        }
        iva.a(z);
        kjz.c = true;
    }

    public final void j() {
        a((kkh) null);
        Stack stack = (Stack) this.i.get();
        iva.a(!stack.empty());
        kjz kjz = (kjz) stack.pop();
        iva.a(kjz.a.empty());
        int size = stack.size();
        if (!kjz.c || kjz.b) {
            ith ith = a;
            Integer valueOf = Integer.valueOf(size);
            ith.a("Rollback savepoint %d", valueOf);
            a().execSQL(String.format(Locale.US, ";rollback to s%d", new Object[]{valueOf}));
        }
        ith ith2 = a;
        Integer valueOf2 = Integer.valueOf(size);
        ith2.a("Release savepoint %d", valueOf2);
        a().execSQL(String.format(Locale.US, ";release s%d", new Object[]{valueOf2}));
        if (size == 0 && ((Boolean) this.j.get()).booleanValue()) {
            f();
            e();
        }
    }

    public kkb(Context context, Executor executor, lhx lhx) {
        iva.a((Object) context);
        this.h = executor;
        this.b = new kkc(context, "DocList.db", lhx);
    }

    public final void b() {
        a((kkh) null);
        Stack stack = (Stack) this.i.get();
        if (!stack.empty()) {
            ((kjz) stack.peek()).a.push(false);
        } else {
            k();
        }
    }

    public final int a(kql kql, kqy kqy) {
        return a((kkh) null, kql, kqy);
    }

    public final long a(kkh kkh, kql kql, ContentValues contentValues) {
        a(kkh);
        l();
        try {
            return a().insertOrThrow(kql.b(), (String) null, contentValues);
        } finally {
            m();
        }
    }

    public final Cursor a(String str, String[] strArr) {
        return b(str, strArr);
    }

    public final Cursor a(String str, String[] strArr, kqy kqy, String str2) {
        return a((kkh) null, str, strArr, kqy, str2);
    }

    public final Cursor a(String str, String[] strArr, kqy kqy, String str2, String str3) {
        return a((kkh) null, str, strArr, kqy, (String) null, str2, str3);
    }

    public final Cursor a(kkh kkh, String str, String[] strArr, kqy kqy, String str2) {
        a(kkh);
        return a(kkh, str, strArr, kqy, (String) null, str2, (String) null);
    }

    public final Cursor a(kkh kkh, String str, String[] strArr, kqy kqy, String str2, String str3, String str4) {
        String str5;
        String[] strArr2;
        kqy kqy2 = kqy;
        a(kkh);
        if (kqy2 != null) {
            str5 = kqy2.a;
        } else {
            str5 = null;
        }
        if (kqy2 != null) {
            strArr2 = kqy.a();
        } else {
            strArr2 = null;
        }
        l();
        try {
            return a().query(str, strArr, str5, strArr2, str2, (String) null, str3, str4);
        } finally {
            m();
        }
    }

    public final SQLiteDatabase a() {
        lsb lsb = (lsb) this.c.get();
        iva.a(lsb != null);
        return (SQLiteDatabase) lsb.b();
    }

    public final void a(kkh kkh) {
        iva.a(kkh == this.f.get());
    }

    public final void a(kkh kkh, kql kql, kqy kqy, ContentValues contentValues) {
        String str;
        a(kkh);
        String[] strArr = null;
        if (kqy != null) {
            str = kqy.a;
        } else {
            str = null;
        }
        if (kqy != null) {
            strArr = kqy.a();
        }
        l();
        try {
            a().update(kql.b(), contentValues, str, strArr);
        } finally {
            m();
        }
    }
}
