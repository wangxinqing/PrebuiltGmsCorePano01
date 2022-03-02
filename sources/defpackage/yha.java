package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.ArrayList;

/* renamed from: yha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yha extends ygu {
    private final ygj a;
    private final yhb b;
    private final String c;

    public yha(ygj ygj, String str, String str2) {
        super("GetCommittedConfigurationOperationCall", avtj.GET_COMMITTED_CONFIGURATION);
        iva.a((Object) ygj);
        this.a = ygj;
        this.b = new yhb(str, str2);
        this.c = str;
    }

    public final avst a() {
        yhb yhb = this.b;
        avss avss = (avss) avst.m.o();
        String str = yhb.a;
        if (str != null) {
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst = (avst) avss.b;
            str.getClass();
            avst.a |= 1;
            avst.b = str;
        }
        return (avst) avss.i();
    }

    public final void b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public final void b(Context context, yfw yfw) {
        Configurations configurations;
        String str;
        Cursor query;
        Throwable th;
        Context context2 = context;
        yfw yfw2 = yfw;
        try {
            yhb yhb = this.b;
            if (yhb.a != null) {
                SQLiteDatabase writableDatabase = yfw.getWritableDatabase();
                yfw.a(writableDatabase);
                try {
                    yhb.a = ygb.a(yhb.a, yhb.b);
                    if ("all".equals(yhb.a)) {
                        query = writableDatabase.query("Packages", new String[]{"packageName", "version", "androidPackageName"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                        ArrayList arrayList = new ArrayList();
                        while (query.moveToNext()) {
                            apgq apgq = (apgq) apgu.l.o();
                            String string = query.getString(0);
                            if (apgq.c) {
                                apgq.c();
                                apgq.c = false;
                            }
                            apgu apgu = (apgu) apgq.b;
                            string.getClass();
                            apgu.a |= 1;
                            apgu.d = string;
                            int i = query.getInt(1);
                            if (apgq.c) {
                                apgq.c();
                                apgq.c = false;
                            }
                            apgu apgu2 = (apgu) apgq.b;
                            apgu2.a |= 2;
                            apgu2.e = i;
                            String string2 = query.getString(2);
                            if (apgq.c) {
                                apgq.c();
                                apgq.c = false;
                            }
                            apgu apgu3 = (apgu) apgq.b;
                            string2.getClass();
                            apgu3.b = 7;
                            apgu3.c = string2;
                            apgu apgu4 = (apgu) apgq.i();
                            arrayList.add(new Flag(apgu4.d, apgu4.k(), 0));
                        }
                        configurations = new Configurations("", "", new Configuration[]{new Configuration(0, (Flag[]) arrayList.toArray(new Flag[0]), new String[0])}, false, (byte[]) null, 0);
                        if (query != null) {
                            query.close();
                        }
                    } else if (yhb.a(writableDatabase, yhb.a)) {
                        configurations = yhb.b(writableDatabase, yhb.a);
                    } else {
                        throw new yfy(29503);
                    }
                } catch (yfx e) {
                    if (e.a == 29512) {
                        Pair a2 = yfl.a(writableDatabase, yhb.a);
                        String str2 = yhb.a;
                        if (a2 != null) {
                            str = (String) a2.first;
                        } else {
                            str = "";
                        }
                        configurations = new yhe(str2, str, (String) null, yhb.a, yhb.b).a(context2, yfw2);
                        new ygx(configurations.a, yhb.b).a(context2, yfw2);
                    } else {
                        throw e;
                    }
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                this.a.b(Status.a, configurations);
                return;
            }
            throw new yfy(29500, "No package name");
            throw th;
        } catch (yfx e2) {
            if (e2.a == 29512 && yhs.a(this.c, 21)) {
                yij.a(context2, 21, this.c);
            }
            throw e2;
        }
    }

    public final void a(Status status) {
        this.a.b(status, (Configurations) null);
    }
}
