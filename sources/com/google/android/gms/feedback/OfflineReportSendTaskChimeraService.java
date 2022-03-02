package com.google.android.gms.feedback;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OfflineReportSendTaskChimeraService extends qwf {
    private aoru a;

    public static void a(Context context) {
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.feedback.OfflineReportSendTaskService";
        qxf.a(0, TimeUnit.DAYS.toSeconds(axgy.a.a().s()));
        int i = 1;
        qxf.n = true;
        boolean j = axgy.j();
        if (!axcc.b() && !axgy.j()) {
            i = 0;
        }
        qxf.a(j ? 1 : 0, i);
        qxf.k = "gF_OfflineUpload";
        qxf.a(0);
        qwq.a(context).a((qxx) qxf.b());
    }

    public final int a(qxz qxz) {
        File[] listFiles = new File(getFilesDir(), "reports").listFiles();
        if (listFiles == null) {
            return 2;
        }
        for (File file : listFiles) {
            if (file.getName().endsWith(".proto.gz")) {
                try {
                    aucd o = auoy.e.o();
                    auot auot = auot.h;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    auoy auoy = (auoy) o.b;
                    auot.getClass();
                    auoy.b = auot;
                    auoy.a |= 1;
                    aucd o2 = auoz.p.o();
                    aucd o3 = aupi.j.o();
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    aupi aupi = (aupi) o3.b;
                    aupi.a |= 1;
                    aupi.b = 1;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    auoz auoz = (auoz) o2.b;
                    aupi aupi2 = (aupi) o3.i();
                    aupi2.getClass();
                    auoz.b = aupi2;
                    auoz.a |= 1;
                    aucd o4 = auos.n.o();
                    if (o4.c) {
                        o4.c();
                        o4.c = false;
                    }
                    auos auos = (auos) o4.b;
                    "".getClass();
                    int i = auos.a | 1;
                    auos.a = i;
                    auos.b = "";
                    "".getClass();
                    int i2 = i | 2;
                    auos.a = i2;
                    auos.c = "";
                    "".getClass();
                    int i3 = i2 | 4;
                    auos.a = i3;
                    auos.d = "";
                    "".getClass();
                    int i4 = i3 | 8;
                    auos.a = i4;
                    auos.e = "";
                    "".getClass();
                    auos.a = i4 | 16;
                    auos.f = "";
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    auoz auoz2 = (auoz) o2.b;
                    auos auos2 = (auos) o4.i();
                    auos2.getClass();
                    auoz2.d = auos2;
                    auoz2.a |= 4;
                    aucd o5 = aupa.i.o();
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    aupa aupa = (aupa) o5.b;
                    "".getClass();
                    int i5 = aupa.a | 2;
                    aupa.a = i5;
                    aupa.c = "";
                    "".getClass();
                    int i6 = i5 | 4;
                    aupa.a = i6;
                    aupa.d = "";
                    "".getClass();
                    int i7 = i6 | 64;
                    aupa.a = i7;
                    aupa.h = "";
                    "".getClass();
                    aupa.a = i7 | 1;
                    aupa.b = "";
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    auoz auoz3 = (auoz) o2.b;
                    aupa aupa2 = (aupa) o5.i();
                    aupa2.getClass();
                    auoz3.c = aupa2;
                    auoz3.a |= 2;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    auoy auoy2 = (auoy) o.b;
                    auoz auoz4 = (auoz) o2.i();
                    auoz4.getClass();
                    auoy2.c = auoz4;
                    auoy2.a |= 2;
                    auoy auoy3 = (auoy) oaq.a(file, (audx) (auoy) o.i());
                    if (auoy3 != null) {
                        mwo mwo = new mwo(this);
                        auoz auoz5 = auoy3.c;
                        if (auoz5 == null) {
                            auoz5 = auoz.p;
                        }
                        String a2 = mwo.a(auoz5);
                        auoz auoz6 = auoy3.c;
                        if (auoz6 == null) {
                            auoz6 = auoz.p;
                        }
                        if (!mwo.a(a2, mwo.b(auoz6))) {
                            GoogleHelp googleHelp = new GoogleHelp("gms:feedback:suggestions");
                            auot auot2 = auoy3.b;
                            if (auot2 == null) {
                                auot2 = auot.h;
                            }
                            if (!auot2.d.isEmpty()) {
                                auot auot3 = auoy3.b;
                                if (auot3 == null) {
                                    auot3 = auot.h;
                                }
                                googleHelp.c = new Account(auot3.d, "com.google");
                            }
                            auot auot4 = auoy3.b;
                            if (auot4 == null) {
                                auot4 = auot.h;
                            }
                            if (!auot4.g.isEmpty()) {
                                nyt nyt = new nyt(googleHelp);
                                auot auot5 = auoy3.b;
                                if (auot5 == null) {
                                    auot5 = auot.h;
                                }
                                nyt.a(auot5.g);
                            }
                            HelpConfig a3 = HelpConfig.a(googleHelp, (Context) this);
                            auoz auoz7 = auoy3.c;
                            if (auoz7 == null) {
                                auoz7 = auoz.p;
                            }
                            if ((auoz7.a & 2) != 0) {
                                auoz auoz8 = auoy3.c;
                                if (auoz8 == null) {
                                    auoz8 = auoz.p;
                                }
                                aupa aupa3 = auoz8.c;
                                if (aupa3 == null) {
                                    aupa3 = aupa.i;
                                }
                                if (!aupa3.h.isEmpty()) {
                                    auoz auoz9 = auoy3.c;
                                    if (auoz9 == null) {
                                        auoz9 = auoz.p;
                                    }
                                    aupa aupa4 = auoz9.c;
                                    if (aupa4 == null) {
                                        aupa4 = aupa.i;
                                    }
                                    a3.b = aupa4.h;
                                } else {
                                    auoz auoz10 = auoy3.c;
                                    if (auoz10 == null) {
                                        auoz10 = auoz.p;
                                    }
                                    aupa aupa5 = auoz10.c;
                                    if (aupa5 == null) {
                                        aupa5 = aupa.i;
                                    }
                                    if (!aupa5.b.isEmpty()) {
                                        auoz auoz11 = auoy3.c;
                                        if (auoz11 == null) {
                                            auoz11 = auoz.p;
                                        }
                                        aupa aupa6 = auoz11.c;
                                        if (aupa6 == null) {
                                            aupa6 = aupa.i;
                                        }
                                        a3.b = aupa6.b;
                                    }
                                }
                            }
                            if (this.a == null) {
                                this.a = jfm.a(10);
                            }
                            aoru aoru = this.a;
                            iva.b("Must be called from a worker thread.");
                            auoz auoz12 = auoy3.c;
                            if (auoz12 == null) {
                                auoz12 = auoz.p;
                            }
                            if (mwh.a(mwh.a(this, a3, aoru, mwo.a(auoz12.j, auoy3.d, mwo.a(auoz12), mwo.b(auoz12)), mwn.a(file), false))) {
                            }
                        } else {
                            Log.w("gF_SendGcmTask", "Dropped report.");
                        }
                    } else {
                        Log.w("gF_SendGcmTask", "Can't parse the report.");
                    }
                    file.delete();
                } catch (IOException e) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
