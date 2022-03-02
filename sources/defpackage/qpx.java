package defpackage;

import android.database.Cursor;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: qpx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qpx extends awem {
    private final awef b;
    private final awef c;
    private final awef d;
    private final awef e;
    private final awef f;

    public qpx(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3, awef awef4, awef awef5) {
        super(bapu2, awey.a(qpx.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
        this.e = aweu.a(awef4);
        this.f = aweu.a(awef5);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b(), this.e.b(), this.f.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        aorr a;
        List list = (List) obj;
        Cursor cursor = (Cursor) list.get(0);
        Cursor cursor2 = (Cursor) list.get(1);
        aplf aplf = (aplf) list.get(2);
        Executor executor = (Executor) list.get(3);
        qsx qsx = (qsx) list.get(4);
        if (cursor == null || cursor2 == null) {
            return aorl.a((Object) false);
        }
        qrd qrd = new qrd(4);
        qrd.c();
        try {
            if (cursor.isClosed()) {
                a = aorl.a((Object) true);
            } else {
                if (!cursor2.isClosed()) {
                    if (cursor.getCount() != 0 || cursor2.getCount() != 0) {
                        int columnIndex = cursor2.getColumnIndex("_ID");
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor2.getColumnIndex("MEDIA_TYPE");
                        qry qry = new qry(aplf, executor, qsx, qrd);
                        if (cursor.getCount() != 0 || cursor2.getCount() <= 0) {
                            if (cursor.getCount() > 0) {
                                cursor2.getCount();
                            }
                            cursor.moveToFirst();
                            cursor2.moveToFirst();
                            while (true) {
                                if (cursor.isAfterLast() || cursor2.isAfterLast()) {
                                    break;
                                }
                                long j = cursor.getLong(columnIndex2);
                                long j2 = cursor2.getLong(columnIndex);
                                qro qro = new qro(Long.valueOf(j2), Integer.valueOf(cursor2.getInt(columnIndex3)));
                                if (j == j2) {
                                    cursor.moveToNext();
                                    cursor2.moveToNext();
                                } else if (j < j2) {
                                    qry.a(qro);
                                    cursor2.moveToNext();
                                } else {
                                    cursor.moveToNext();
                                }
                                if (cursor.isAfterLast()) {
                                    if (!cursor2.isAfterLast()) {
                                        qpw.a(cursor2, columnIndex, columnIndex3, qry);
                                        break;
                                    }
                                }
                                if (!cursor.isAfterLast() && cursor2.isAfterLast()) {
                                    break;
                                }
                            }
                            a = qry.a();
                        } else {
                            cursor2.moveToFirst();
                            qpw.a(cursor2, columnIndex, columnIndex3, qry);
                            a = qry.a();
                        }
                    }
                }
                a = aorl.a((Object) true);
            }
            cursor2.close();
            cursor.close();
            return a;
        } catch (Throwable th) {
            try {
                cursor.close();
            } catch (Throwable th2) {
                apev.a(th, th2);
            }
            throw th;
        }
        throw th;
    }
}
