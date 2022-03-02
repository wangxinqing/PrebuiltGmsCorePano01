package defpackage;

import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;

/* renamed from: aayz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aayz {
    static long a(LevelDb levelDb) {
        try {
            return aook.a(levelDb.get(aoog.a(1)));
        } catch (LevelDbException | RuntimeException e) {
            return Long.MAX_VALUE;
        }
    }

    static void a(LevelDb levelDb, long j) {
        try {
            levelDb.put(aoog.a(1), aook.b(j));
        } catch (LevelDbException | RuntimeException e) {
        }
    }
}
