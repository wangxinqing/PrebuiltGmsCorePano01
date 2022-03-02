package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: agus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agus implements agul {
    public final SQLiteDatabase a;
    private final Executor b;

    public agus(SQLiteDatabase sQLiteDatabase, Executor executor) {
        this.a = sQLiteDatabase;
        this.b = executor;
    }

    public final aorr a() {
        return aorl.a((Callable) new agun(this), this.b);
    }

    public final List b() {
        Cursor query;
        String[] strArr = {"_id", "data", "timestamp"};
        ArrayList arrayList = new ArrayList();
        try {
            query = this.a.query("queue", strArr, (String) null, (String[]) null, (String) null, (String) null, "_id", (String) null);
            while (query.moveToNext()) {
                aguq aguq = new aguq();
                aguq.c = Long.valueOf(query.getLong(0));
                auay a2 = auay.a(query.getBlob(1));
                if (a2 != null) {
                    aguq.a = a2;
                    aguq.b = Long.valueOf(query.getLong(2));
                    String str = "";
                    if (aguq.a == null) {
                        str = " data";
                    }
                    if (aguq.b == null) {
                        str = str.concat(" timestamp");
                    }
                    if (aguq.c == null) {
                        str = String.valueOf(str).concat(" id");
                    }
                    if (str.isEmpty()) {
                        arrayList.add(new agtg(aguq.a, aguq.b.longValue(), aguq.c));
                    } else {
                        String valueOf = String.valueOf(str);
                        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                    }
                } else {
                    throw new NullPointerException("Null data");
                }
            }
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (SQLException e) {
            throw new agog((Throwable) e);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final aorr a(long j, Iterable iterable) {
        return aorl.a((Callable) new agum(this, j, iterable), this.b);
    }

    public final void close() {
        try {
            this.a.close();
        } catch (SQLException e) {
            throw new agsx(e);
        }
    }

    public final aorr a(List list) {
        return aorl.a((Callable) new aguo(this, list), this.b);
    }

    public final void b(long j, Iterable iterable) {
        try {
            this.a.beginTransaction();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("data", ((auay) it.next()).k());
                contentValues.put("timestamp", Long.valueOf(j));
                if (this.a.insertOrThrow("queue", (String) null, contentValues) == -1) {
                    throw new agog("insertOrThrow returned -1");
                }
            }
            this.a.setTransactionSuccessful();
            this.a.endTransaction();
        } catch (SQLException e) {
            throw new agog((Throwable) e);
        } catch (Throwable th) {
            this.a.endTransaction();
            throw th;
        }
    }

    public final void b(List list) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((agur) ((aguk) it.next())).c());
            }
            String a2 = amre.a(',').a((Iterable) arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 9);
            sb.append("_id IN (");
            sb.append(a2);
            sb.append(")");
            String sb2 = sb.toString();
            this.a.beginTransaction();
            this.a.delete("queue", sb2, (String[]) null);
            this.a.setTransactionSuccessful();
            this.a.endTransaction();
        } catch (SQLException e) {
            throw new agog((Throwable) e);
        } catch (Throwable th) {
            this.a.endTransaction();
            throw th;
        }
    }
}
