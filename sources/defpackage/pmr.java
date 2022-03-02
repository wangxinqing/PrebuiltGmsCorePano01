package defpackage;

import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Pair;
import java.util.Collection;

/* renamed from: pmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface pmr {
    public static final /* synthetic */ int a = 0;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    Pair a(SQLiteDatabase sQLiteDatabase, Resources resources);

    Pair a(SQLiteDatabase sQLiteDatabase, Resources resources, Collection collection);

    Pair b(SQLiteDatabase sQLiteDatabase, Resources resources);
}
