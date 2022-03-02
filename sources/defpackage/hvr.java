package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: hvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hvr implements huz {
    private static final String[] a = {"_id", "LENGTH(log_event)"};
    private final jjj b;
    private final hvq c;

    public hvr(jjj jjj, hvs hvs) {
        iva.a((Object) jjj);
        this.b = jjj;
        this.c = new hvq(jjj, hvs);
    }

    /* JADX INFO: finally extract failed */
    private final hux a(Cursor cursor, long j, hvl hvl) {
        Cursor cursor2 = cursor;
        LinkedList linkedList = new LinkedList();
        long j2 = j;
        while (true) {
            try {
                if (!cursor.moveToNext()) {
                    break;
                }
                long j3 = cursor2.getLong(0);
                long j4 = cursor2.getLong(1);
                if (j4 <= 1048576) {
                    j2 -= j4;
                    if (j2 <= 0) {
                        if (!linkedList.isEmpty()) {
                            cursor.moveToPrevious();
                            break;
                        }
                    }
                    linkedList.add(Long.valueOf(j3));
                    if (linkedList.size() == 512) {
                        break;
                    }
                }
            } catch (Throwable th) {
                th = th;
                cursor.close();
                throw th;
            }
        }
        if (!linkedList.isEmpty()) {
            cursor.close();
            hvq hvq = this.c;
            if (linkedList.size() <= 512) {
                long[] a2 = hvq.a((List) linkedList);
                String[] strArr = hvq.a;
                hvp a3 = hvq.a("_id", a2);
                Cursor query = hvq.c.getWritableDatabase().query(false, "log_event", strArr, a3.a, a3.b, (String) null, (String) null, "_id ASC", (String) null);
                linkedList.clear();
                ArrayList arrayList = new ArrayList();
                while (query.moveToNext()) {
                    try {
                        long j5 = query.getLong(0);
                        int i = query.getInt(1);
                        long j6 = query.getLong(2);
                        byte[] blob = query.getBlob(3);
                        if (!hvq.a(j6, blob, i)) {
                            StringBuilder sb = new StringBuilder(100);
                            sb.append("LogEvent is corrupted: id=");
                            sb.append(j5);
                            sb.append(" loggerContextId=");
                            sb.append(j6);
                            sb.append(" hash=");
                            sb.append(i);
                            Log.e("SqliteLogReader", sb.toString());
                        } else {
                            linkedList.add(Long.valueOf(j5));
                            arrayList.add(auay.a(blob));
                        }
                    } catch (Throwable th2) {
                        query.close();
                        throw th2;
                    }
                }
                query.close();
                if (linkedList.isEmpty()) {
                    return a(cursor, j, hvl);
                }
                return new hux(hvl.a, arrayList, linkedList);
            }
            int size = linkedList.size();
            StringBuilder sb2 = new StringBuilder(35);
            sb2.append("ids.length exceeds 512: ");
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        try {
            hux hux = hux.a;
            cursor.close();
            return hux;
        } catch (Throwable th3) {
            th = th3;
            cursor.close();
            throw th;
        }
    }

    public final hux a(long j, hvl hvl) {
        hux hux;
        Cursor query;
        int length;
        Cursor query2;
        hvl hvl2 = hvl;
        String valueOf = String.valueOf(hvl);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("Read data for ");
        sb.append(valueOf);
        sb.toString();
        SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        writableDatabase.beginTransactionNonExclusive();
        try {
            int i = 0;
            int i2 = 1;
            if (!awtf.a.a().o()) {
                hvq hvq = this.c;
                long j2 = hvl2.b;
                String[] strArr = a;
                String valueOf2 = String.valueOf(hvq.c(writableDatabase));
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                sb2.append("allPlayLoggerContextIds=");
                sb2.append(valueOf2);
                sb2.toString();
                StringBuilder sb3 = new StringBuilder(55);
                sb3.append("getByPlayLoggerContextIdAsc for id=");
                sb3.append(j2);
                sb3.toString();
                query2 = writableDatabase.query(false, "log_event", strArr, "play_logger_context_id= ?", new String[]{Long.toString(j2)}, (String) null, (String) null, "_id ASC", (String) null);
                hux = a(query2, j, hvl2);
                query2.close();
            } else {
                long j3 = j;
                String[] strArr2 = {Long.toString(hvl2.b)};
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                query = writableDatabase.query("log_event", new String[]{"_id", "log_event", "hash"}, "play_logger_context_id=?", strArr2, (String) null, (String) null, "_id");
                while (query.moveToNext() && j3 > 0) {
                    long j4 = query.getLong(i);
                    byte[] blob = query.getBlob(i2);
                    int i3 = query.getInt(2);
                    if (blob == null || (length = blob.length) >= 1048576 || !hvq.a(hvl2.b, blob, i3)) {
                        arrayList2 = arrayList2;
                        i = 0;
                        i2 = 1;
                    } else {
                        j3 -= (long) length;
                        arrayList.add(Long.valueOf(j4));
                        ArrayList arrayList3 = arrayList2;
                        arrayList3.add(auay.a(blob));
                        arrayList2 = arrayList3;
                        i = 0;
                        i2 = 1;
                    }
                }
                ArrayList arrayList4 = arrayList2;
                query.close();
                hux = new hux(hvl2.a, arrayList4, arrayList);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            return hux;
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }
}
