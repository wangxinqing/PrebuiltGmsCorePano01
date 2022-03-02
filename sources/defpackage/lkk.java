package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: lkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lkk {
    public final kpf a;
    public final boolean b = ((Boolean) jzq.as.c()).booleanValue();
    private final String c;
    private final lll d;
    private final Map e;
    private boolean f = false;
    private boolean g = false;
    private int h = 0;

    public lkk(String str, lll lll, kpf kpf, Map map) {
        this.c = str;
        this.d = lll;
        this.a = kpf;
        this.e = map;
    }

    public final synchronized boolean a() {
        if (!this.g) {
            if (lla.d.a(this.d.getReadableDatabase()) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Trying to interact with a closed cache.");
    }

    public final synchronized alns b() {
        SQLiteDatabase readableDatabase;
        alxk a2;
        Cursor query;
        int i;
        alrt alrt;
        ArrayList arrayList;
        Cursor query2;
        alyv alyv;
        if (!this.g) {
            readableDatabase = this.d.getReadableDatabase();
            try {
                lla lla = lla.d;
                a2 = lla.a(readableDatabase);
                if (a2 != null) {
                    llg llg = llg.d;
                    query = readableDatabase.query(llg.b(), llg.e, (String) null, (String[]) null, (String) null, (String) null, llg.a.a());
                    ArrayList arrayList2 = new ArrayList();
                    while (query.moveToNext()) {
                        arrayList2.add((alrr) lkg.a(query.getString(0)));
                    }
                    query.close();
                    String a3 = lla.a(readableDatabase, "revision");
                    if (a3 != null) {
                        i = Integer.parseInt(a3);
                    } else {
                        i = -1;
                    }
                    alrt = new alrt(i, a2.a, arrayList2);
                    arrayList = new ArrayList();
                    lld lld = lld.d;
                    query2 = readableDatabase.query(lld.b(), lld.e, (String) null, (String[]) null, (String) null, (String) null, lld.a.a());
                    while (query2.moveToNext()) {
                        arrayList.add((amiw) lkg.a(query2.getString(0)));
                    }
                    query2.close();
                    String a4 = lla.a(readableDatabase, "isReadOnly");
                    if (a4 != null) {
                        if (Boolean.parseBoolean(a4)) {
                            alyv = alyv.READ_ONLY;
                        }
                    }
                    alyv = alyv.READ_WRITE;
                } else {
                    throw new lkl("Missing session metadata.");
                }
            } catch (alry e2) {
                throw new lkl("Error parsing cached json", e2);
            } catch (Throwable th) {
                query2.close();
                throw th;
            }
        } else {
            throw new IllegalStateException("Trying to interact with a closed cache.");
        }
        return new alns(new alrs(alrt, alyv, arrayList, Collections.singletonList(a2), (String) null), new alsx(lkc.a(readableDatabase, 0), lkc.a(readableDatabase, 1), lkc.a(readableDatabase, 2)));
    }

    public final synchronized void c() {
        if (!this.f) {
            this.h++;
        } else {
            throw new IllegalStateException("Cannot add pending changes in the closing state.");
        }
    }

    public final synchronized void d() {
        int i = this.h - 1;
        this.h = i;
        if (i == 0) {
            notifyAll();
        }
    }

    public final synchronized boolean e() {
        return this.g;
    }

    public final synchronized void f() {
        this.f = true;
        while (this.h != 0) {
            try {
                wait();
            } catch (InterruptedException e2) {
            }
        }
        if (!this.g) {
            this.g = true;
            this.d.close();
            this.e.remove(this.c);
        }
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase g() {
        if (!this.g) {
            return this.d.getWritableDatabase();
        }
        throw new IllegalStateException("Trying to interact with a closed cache.");
    }

    /* access modifiers changed from: package-private */
    public final kpf h() {
        if (!this.g) {
            return this.a;
        }
        throw new IllegalStateException("Trying to interact with a closed cache.");
    }
}
