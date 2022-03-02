package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.icing.appindexing.service.OneoffRebuildIndexChimeraService;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;

/* renamed from: oxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oxg extends ppr {
    private final osf a;

    public oxg(osf osf) {
        super(aonk.CLEAR_APP_INDEXING_SEQUENCE_TABLES_TASK, 1);
        this.a = osf;
    }

    /* JADX INFO: finally extract failed */
    public static void a(osf osf) {
        Context context = osf.b;
        ovw a2 = ovw.a(context);
        ozs a3 = osf.a();
        oyb b = oyb.b();
        if (axsm.b()) {
            osf.g.a(true);
        }
        SQLiteDatabase writableDatabase = a2.getWritableDatabase();
        anhk i = a3.c().listIterator();
        while (true) {
            boolean z = false;
            if (!i.hasNext()) {
                break;
            }
            osz osz = (osz) i.next();
            if (ozq.e(osz)) {
                long a4 = osf.n.a(osz.b, true);
                if (a4 > 0) {
                    oxe a5 = oxe.a(osz.c, osz.e, b);
                    writableDatabase.beginTransaction();
                    try {
                        if (dvk.c(writableDatabase, a5.a())) {
                            ovw.a(writableDatabase, a5, a4);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        String str = a5.b;
                        if (axsm.b()) {
                            ppp ppp = osf.c;
                            aaib aaib = new aaib(osf.b, osf, oyc.a(a5), osf.m.a(a5.b));
                            ppp.d(aaib);
                            boolean z2 = ((RegisterCorpusInfoCall$Response) aaib.h()).b;
                            if (z2) {
                                oyq oyq = osf.r;
                                aojc aojc = (aojc) aojd.b.o();
                                aucd o = aoks.i.o();
                                String str2 = osz.e;
                                if (o.c) {
                                    o.c();
                                    o.c = false;
                                }
                                aoks aoks = (aoks) o.b;
                                str2.getClass();
                                int i2 = aoks.a | 16;
                                aoks.a = i2;
                                aoks.f = str2;
                                String str3 = osz.c;
                                str3.getClass();
                                aoks.a = i2 | 32;
                                aoks.g = str3;
                                aojc.a(o);
                                oyq.a(6015, (aojd) aojc.i());
                            }
                            z = z2;
                        }
                        if (a2.a(osf, osf.m.a(str), b) || z) {
                            OneoffRebuildIndexChimeraService.a(context, str, aomb.ONE_OFF_REASON_REBUILD);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
            }
        }
        if (axsm.b()) {
            oyb.a(context, b, osf.r);
            osf.g.a(false);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        if (!((Boolean) ozx.aE.c()).booleanValue()) {
            return null;
        }
        try {
            a(this.a);
            return null;
        } catch (Exception e) {
            this.a.n().a("AppIndexingMaintenanceTask", e, axrp.f());
            return null;
        }
    }
}
