package defpackage;

import android.location.LocationManager;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: aivq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aivq extends qvr {
    final /* synthetic */ aivu a;
    private final TelephonyManager b = ((TelephonyManager) this.a.a.getSystemService("phone"));
    private int c = -9999;
    private long d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aivq(aivu aivu, Looper looper) {
        super(looper);
        this.a = aivu;
    }

    public final void handleMessage(Message message) {
        boolean z;
        boolean z2;
        Object obj;
        Message message2 = message;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z3 = false;
        if (message2.arg2 == 4321) {
            z = true;
        } else if (message2.arg2 == 8534) {
            z = false;
        } else {
            int i = message2.what;
            StringBuilder sb = new StringBuilder(50);
            sb.append("No wakelock mode specified for command ");
            sb.append(i);
            throw new RuntimeException(sb.toString());
        }
        if (elapsedRealtime > this.d) {
            this.d = 120000 + elapsedRealtime;
            aivu aivu = this.a;
            aivu.a((ajcl) aivu.l);
        }
        try {
            int i2 = message2.what;
            if (i2 == 11) {
                z2 = z;
                if (this.a.k) {
                    aiwz aiwz = (aiwz) message2.obj;
                    aito.a(this.a.b, aiwz);
                    this.a.l.a(aiwz);
                }
            } else if (i2 == 13) {
                z2 = z;
                this.a.l.b((aqek) message2.obj);
            } else if (i2 == 15) {
                z2 = z;
                if (message2.arg1 != 0) {
                    z3 = true;
                }
                this.a.b.a(aico.FULL_COLLECTION_MODE_CHANGED, z3);
                this.a.l.h(z3);
            } else if (i2 == 24) {
                z2 = z;
                ((Runnable) message2.obj).run();
            } else if (i2 == 39) {
                z2 = z;
                aivi aivi = (aivi) message2.obj;
                this.a.l.a(aivi.a, aivi.b, aivi.c);
            } else if (i2 != 41) {
                switch (i2) {
                    case 1:
                        z2 = z;
                        this.a.b.a(aico.QUIT);
                        ajcm ajcm = this.a.l;
                        if (ajcm != null) {
                            if (message2.arg1 != 0) {
                                z3 = true;
                            }
                            ajcm.e(z3);
                        }
                        LocationManager locationManager = (LocationManager) this.a.a.getSystemService("location");
                        aivu aivu2 = this.a;
                        locationManager.removeUpdates((aivu2.k ? aivu2.d : aivu2.c).c);
                        locationManager.removeGpsStatusListener(this.a.e);
                        Looper myLooper = Looper.myLooper();
                        if (myLooper != null) {
                            myLooper.quit();
                        }
                        this.a.b();
                        this.a.l = new ajcm(new aivp());
                        break;
                    case 2:
                        z2 = z;
                        this.a.l.a();
                        break;
                    case 3:
                        if (message2.arg1 == 1) {
                            z3 = true;
                        }
                        aiat aiat = (aiat) message2.obj;
                        aicn aicn = this.a.b;
                        long j = aiat.b;
                        long j2 = aiat.c;
                        long j3 = aiat.d;
                        int min = (int) Math.min(j / 1000, 2147483647L);
                        int min2 = (int) Math.min(j2 / 1000, 2147483647L);
                        int min3 = (int) Math.min(j3 / 1000, 2147483647L);
                        aico aico = aico.SET_PERIOD;
                        long b2 = aicn.b();
                        if (!z3) {
                            obj = "0";
                        } else {
                            obj = "1";
                        }
                        z2 = z;
                        aitn aitn = r11;
                        try {
                            aitn aitn2 = new aitn(aico, b2, obj, min, min2, min3, j, j2, j3, z3);
                            aicn.a((aicl) aitn);
                            this.a.l.a(aiat, z3);
                            break;
                        } catch (Exception e) {
                            e = e;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                break;
                            }
                        }
                    case 4:
                        if (message2.arg1 == 1) {
                            this.c = -9999;
                        }
                        aiyk.g.a(this.b, this.c, elapsedRealtime, new aivo(this), (aizx) message2.obj, this.a.f.k.b());
                        z2 = z;
                        break;
                    case 5:
                        ajcm ajcm2 = this.a.l;
                        if (message2.arg1 != 0) {
                            z3 = true;
                        }
                        ajcm2.f(z3);
                        z2 = z;
                        break;
                    case 6:
                        aivj aivj = (aivj) message2.obj;
                        this.a.l.a(aivj.a, aivj.b, aivj.c);
                        z2 = z;
                        break;
                    case 7:
                        if (this.a.k) {
                            z2 = z;
                            break;
                        } else {
                            aiwz aiwz2 = (aiwz) message2.obj;
                            aito.a(this.a.b, aiwz2);
                            this.a.l.a(aiwz2);
                            z2 = z;
                            break;
                        }
                    case 8:
                        aivt aivt = (aivt) message2.obj;
                        this.a.l.a(aivt.a, aivt.b);
                        z2 = z;
                        break;
                    case 9:
                        aivk aivk = (aivk) message2.obj;
                        this.a.l.a(aivk.a, aivk.b);
                        z2 = z;
                        break;
                    default:
                        switch (i2) {
                            case 17:
                                this.a.l.a((aqek) message2.obj);
                                z2 = z;
                                break;
                            case 18:
                                ahqp ahqp = (ahqp) message2.obj;
                                this.a.b.a(aico.NLP_PARAMS_CHANGED);
                                aibs.j = ahqp.k();
                                this.a.l.a(ahqp);
                                z2 = z;
                                break;
                            case 19:
                                this.a.l.a((ActivityRecognitionResult) message2.obj);
                                z2 = z;
                                break;
                            case 20:
                                aivh aivh = (aivh) message2.obj;
                                this.a.l.a(aivh.a, aivh.b, aivh.c, aivh.d, aivh.e, aivh.f);
                                z2 = z;
                                break;
                            case 21:
                                this.a.l.a((aibl) message2.obj);
                                z2 = z;
                                break;
                            default:
                                int i3 = message2.what;
                                StringBuilder sb2 = new StringBuilder(30);
                                sb2.append("unexpected message ");
                                sb2.append(i3);
                                throw new RuntimeException(sb2.toString());
                        }
                }
            } else {
                z2 = z;
                this.a.l.f();
            }
            this.a.b.a();
            if (z2) {
                this.a.f.k.c(ajbe.CALLBACK_RUNNER);
            }
        } catch (Exception e2) {
            e = e2;
            z2 = z;
            throw e;
        } catch (Throwable th2) {
            th = th2;
            z2 = z;
            if (z2) {
                this.a.f.k.c(ajbe.CALLBACK_RUNNER);
            }
            throw th;
        }
    }
}
