package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.RemoteException;
import android.os.WorkSource;
import android.util.SparseArray;
import com.google.android.gms.beacon.BleFilter;
import com.google.location.nearby.direct.client.internal.OperationRequest;
import com.google.location.nearby.direct.client.internal.OperationResponse;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: askc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class askc extends asgy {
    public final SparseArray a = new SparseArray();
    public final Handler b;
    public final arwg c;
    public final ExecutorService d;
    public final asjn e;
    public final CountDownLatch f;
    public long g;
    public final AtomicBoolean h;
    public final AtomicBoolean i;
    public final arwm j = new asjy(this, "ShutDownNearbyDirect");
    private final Handler.Callback k = new asjx(this);

    public askc(Context context, Handler handler) {
        this.b = new qvr(handler.getLooper(), this.k);
        this.c = (arwg) thl.a(context, arwg.class);
        this.d = qvj.b.a();
        this.e = new asjn(context, this.d);
        this.f = new CountDownLatch(1);
        this.h = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
    }

    private static OperationResponse a(String str, asgb asgb) {
        aucd o = asfz.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfz asfz = (asfz) o.b;
        str.getClass();
        int i2 = asfz.a | 1;
        asfz.a = i2;
        asfz.b = str;
        asfz.c = asgb.j;
        asfz.a = i2 | 2;
        return new OperationResponse((asfz) o.i());
    }

    private static final Integer c(String str) {
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e2) {
            return null;
        }
    }

    public final asis b(String str) {
        return a(c(str));
    }

    public final boolean d(OperationRequest operationRequest) {
        asjn asjn = this.e;
        asha asha = operationRequest.b;
        try {
            int a2 = ashd.a(asha.b);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 == 2) {
                asfj asfj = asha.c;
                if (asfj == null) {
                    asfj = asfj.e;
                }
                if ((asfj.a & 1) != 0) {
                    asfs asfs = asfj.b;
                    if (asfs == null) {
                        asfs = asfs.f;
                    }
                    int a3 = asfy.a(asfs.b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    if (a3 == 1) {
                        ascb.a(asjn.b, asfj);
                        return true;
                    }
                    throw new asji("WiFi is no longer supported");
                }
                String valueOf = String.valueOf(asfj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                sb.append("Unrecognized connect request: ");
                sb.append(valueOf);
                throw new asji(sb.toString());
            } else if (i2 == 3) {
                return true;
            } else {
                if (i2 == 4) {
                    asep asep = asha.e;
                    if (asep == null) {
                        asep = asep.f;
                    }
                    int a4 = ases.a(asep.b);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    int i3 = a4 - 1;
                    if (i3 == 2) {
                        asbv.a(asjn.b, asep);
                        return true;
                    } else if (i3 == 3) {
                        asba.a(asjn.b, asep);
                        return true;
                    } else if (i3 != 4) {
                        String valueOf2 = String.valueOf(asep);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                        sb2.append("Unrecognized advertise request: ");
                        sb2.append(valueOf2);
                        throw new asji(sb2.toString());
                    } else {
                        throw new asji("WiFi is no longer supported");
                    }
                } else if (i2 == 5) {
                    asgc asgc = asha.f;
                    if (asgc == null) {
                        asgc = asgc.e;
                    }
                    int a5 = asgj.a(asgc.b);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    int i4 = a5 - 1;
                    if (i4 == 3) {
                        asbx.a(asjn.b, asgc);
                        return true;
                    } else if (i4 == 4) {
                        asbt.a(asjn.b, asgc);
                        return true;
                    } else {
                        String valueOf3 = String.valueOf(asgc);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 27);
                        sb3.append("Unrecognized scan request: ");
                        sb3.append(valueOf3);
                        throw new asji(sb3.toString());
                    }
                } else if (i2 == 8) {
                    asel asel = asha.i;
                    if (asel == null) {
                        asel = asel.c;
                    }
                    int a6 = aseo.a(asel.b);
                    if (a6 == 0) {
                        a6 = 1;
                    }
                    int i5 = a6 - 1;
                    if (i5 == 1) {
                        asbz.a(asjn.b);
                        return true;
                    } else if (i5 == 2) {
                        asbg.a(asjn.b);
                        return true;
                    } else {
                        String valueOf4 = String.valueOf(asel);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 29);
                        sb4.append("Unrecognized accept request: ");
                        sb4.append(valueOf4);
                        throw new asji(sb4.toString());
                    }
                } else {
                    String valueOf5 = String.valueOf(asha);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 22);
                    sb5.append("Unrecognized request: ");
                    sb5.append(valueOf5);
                    throw new asji(sb5.toString());
                }
            }
        } catch (asji e2) {
            jjg jjg = asil.a;
            e2.getMessage();
            return false;
        } catch (asjj e3) {
            jjg jjg2 = asil.a;
            e3.getMessage();
            return false;
        }
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        synchronized (this.a) {
            printWriter.printf("%d operations:\n", new Object[]{Integer.valueOf(this.a.size())});
            String valueOf = String.valueOf(this.a.toString());
            printWriter.println(valueOf.length() == 0 ? new String("  ") : "  ".concat(valueOf));
        }
    }

    public final OperationResponse b(OperationRequest operationRequest) {
        asjl asjl;
        asis asis;
        asha asha = operationRequest.b;
        ashe ashe = asha.g;
        if (ashe == null) {
            ashe = ashe.d;
        }
        String str = ashe.c;
        Integer c2 = c(str);
        synchronized (this.a) {
            asjl = null;
            if (c2 != null) {
                if (!b()) {
                    asis = (asis) this.a.get(c2.intValue());
                }
            }
            asis = null;
        }
        if (asis == null) {
            ((anih) ((anih) asil.a.c()).a("askc", "b", 207, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Invalid operation id specified to update: %s", (Object) str);
            return a(str, asgb.OPERATION_STATUS_MISSING);
        }
        jjg jjg = asil.a;
        try {
            if ((asha.a & 32) != 0) {
                ashe ashe2 = asha.g;
                if (ashe2 == null) {
                    ashe2 = ashe.d;
                }
                int a2 = asgr.a(ashe2.b);
                if (a2 != 0 && a2 == 2 && (asis instanceof asjh)) {
                    asjb asjb = ((asjh) asis).a;
                    if (asjb instanceof ascb) {
                        asjl = new asjl((ascb) asjb);
                    } else if (asjb instanceof asbh) {
                        asjl = new asjm((asbh) asjb);
                    }
                }
                if (asjl == null) {
                    throw new asji("Invalid update operation request");
                }
            }
            this.b.obtainMessage(4, asjl).sendToTarget();
            return a(str, asgb.OPERATION_STATUS_STARTING);
        } catch (asji e2) {
            anih anih = (anih) asil.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("askc", "b", 218, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unsupported operation request specified to start.");
            return a(str, asgb.OPERATION_STATUS_UPDATE_FAILED);
        }
    }

    public final boolean c(OperationRequest operationRequest) {
        asha asha = operationRequest.b;
        asjn asjn = this.e;
        if ((asha.a & 64) == 0) {
            return false;
        }
        asgm asgm = asha.h;
        if (asgm == null) {
            asgm = asgm.d;
        }
        int a2 = asgo.a(asgm.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i2 = a2 - 1;
        if (i2 == 1) {
            asht asht = asjn.a;
            asgm asgm2 = asha.h;
            if (asgm2 == null) {
                asgm2 = asgm.d;
            }
            auyt auyt = asgm2.c;
            if (auyt == null) {
                auyt = auyt.p;
            }
            jjg jjg = asil.a;
            asht.b(auyt);
            asht.a(auyt);
            return true;
        } else if (i2 == 2) {
            asht asht2 = asjn.a;
            asgm asgm3 = asha.h;
            if (asgm3 == null) {
                asgm3 = asgm.d;
            }
            auyt auyt2 = asgm3.c;
            if (auyt2 == null) {
                auyt2 = auyt.p;
            }
            jjg jjg2 = asil.a;
            asht2.b(auyt2);
            return true;
        } else if (i2 != 3) {
            return false;
        } else {
            asht asht3 = asjn.a;
            jjg jjg3 = asil.a;
            asht3.b = asht3.a;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.asis a(java.lang.Integer r4) {
        /*
            r3 = this;
            android.util.SparseArray r0 = r3.a
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0022
            boolean r1 = r3.b()     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x0022
            android.util.SparseArray r1 = r3.a     // Catch:{ all -> 0x0025 }
            int r2 = r4.intValue()     // Catch:{ all -> 0x0025 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0025 }
            asis r1 = (defpackage.asis) r1     // Catch:{ all -> 0x0025 }
            android.util.SparseArray r2 = r3.a     // Catch:{ all -> 0x0025 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0025 }
            r2.delete(r4)     // Catch:{ all -> 0x0025 }
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return r1
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            r4 = 0
            return r4
        L_0x0025:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.askc.a(java.lang.Integer):asis");
    }

    public final OperationResponse a(OperationRequest operationRequest) {
        try {
            asjn asjn = this.e;
            asha asha = operationRequest.b;
            WorkSource workSource = operationRequest.d;
            BleFilter[] bleFilterArr = operationRequest.e;
            int a2 = ashd.a(asha.b);
            int i2 = 1;
            if (a2 == 0) {
                a2 = 1;
            }
            int i3 = a2 - 1;
            asis asis = null;
            if (i3 != 0) {
                switch (i3) {
                    case 2:
                        asfj asfj = asha.c;
                        if (asfj == null) {
                            asfj = asfj.e;
                        }
                        if ((asfj.a & 1) != 0) {
                            asfs asfs = asfj.b;
                            if (asfs == null) {
                                asfs = asfs.f;
                            }
                            int a3 = asfy.a(asfs.b);
                            if (a3 == 0) {
                                a3 = 1;
                            }
                            if (a3 == 1) {
                                ascb.a(asjn.b, asfj);
                                asis = asjn.a((asjb) new ascb(asjn.b, asfj));
                                break;
                            } else if (a3 != 2) {
                                Context context = asjn.b;
                                int i4 = Build.VERSION.SDK_INT;
                                asda asda = (asda) thl.b(context, asda.class);
                                if (asda != null && asda.c()) {
                                    asis = asjn.a((asjb) new asbh(asjn.b, asfj));
                                    break;
                                } else {
                                    throw new asjk(asda.class, asbh.class);
                                }
                            } else {
                                throw new asji("WiFi is no longer supported");
                            }
                        }
                        break;
                    case 3:
                        asgk asgk = asha.d;
                        if (asgk == null) {
                            asgk = asgk.d;
                        }
                        if ((asgk.a & 1) != 0) {
                            asis = asjn.a((asjb) new asjp(asjn.b, asgk));
                        }
                        break;
                    case 4:
                        asep asep = asha.e;
                        if (asep == null) {
                            asep = asep.f;
                        }
                        int a4 = ases.a(asep.b);
                        if (a4 != 0) {
                            i2 = a4;
                        }
                        int i5 = i2 - 1;
                        if (i5 != 2) {
                            if (i5 == 3) {
                                asba.a(asjn.b, asep);
                                Context context2 = asjn.b;
                                asfp asfp = asep.c;
                                if (asfp == null) {
                                    asfp = asfp.c;
                                }
                                asew asew = asep.e;
                                if (asew == null) {
                                    asew = asew.d;
                                }
                                asis = asjn.a((ashj) new asba(context2, asfp, asew));
                                break;
                            } else if (i5 != 4) {
                                break;
                            } else {
                                throw new asji("WiFi is no longer supported");
                            }
                        } else {
                            asbv.a(asjn.b, asep);
                            Context context3 = asjn.b;
                            asfg asfg = asep.d;
                            if (asfg == null) {
                                asfg = asfg.c;
                            }
                            asfp asfp2 = asep.c;
                            if (asfp2 == null) {
                                asfp2 = asfp.c;
                            }
                            asis = asjn.a((ashj) new asbv(context3, asfg, asfp2));
                            break;
                        }
                    case 5:
                        asgc asgc = asha.f;
                        if (asgc == null) {
                            asgc = asgc.e;
                        }
                        int a5 = asgj.a(asgc.b);
                        if (a5 != 0) {
                            i2 = a5;
                        }
                        int i6 = i2 - 1;
                        if (i6 != 3) {
                            if (i6 == 4) {
                                asbt.a(asjn.b, asgc);
                                Context context4 = asjn.b;
                                asfa asfa = asgc.d;
                                if (asfa == null) {
                                    asfa = asfa.f;
                                }
                                asis = asjn.a((ashj) new asbt(context4, asfa, workSource, bleFilterArr));
                                break;
                            } else {
                                break;
                            }
                        } else {
                            asbx.a(asjn.b, asgc);
                            Context context5 = asjn.b;
                            asfi asfi = asgc.c;
                            if (asfi == null) {
                                asfi = asfi.c;
                            }
                            asis = asjn.a((ashj) new asbx(context5, asfi));
                            break;
                        }
                    case 6:
                    case 7:
                        break;
                    case 8:
                        asel asel = asha.i;
                        if (asel == null) {
                            asel = asel.c;
                        }
                        int a6 = aseo.a(asel.b);
                        if (a6 == 0) {
                            a6 = 1;
                        }
                        int i7 = a6 - 1;
                        if (i7 != 1) {
                            if (i7 == 2) {
                                asbg.a(asjn.b);
                                asis = asjn.a((asjb) new asbg(asjn.b));
                                break;
                            } else {
                                break;
                            }
                        } else {
                            asbz.a(asjn.b);
                            asis = asjn.a((asjb) new asbz(asjn.b));
                            break;
                        }
                }
            }
            if (asis != null) {
                asfz d2 = asis.d();
                try {
                    asis.m = new askb(this, d2.b, operationRequest.c);
                    synchronized (this.a) {
                        if (!b()) {
                            this.a.put(asis.k, asis);
                        }
                    }
                    jjg jjg = asil.a;
                    String str = d2.b;
                    this.b.obtainMessage(2, asis).sendToTarget();
                    return new OperationResponse(d2);
                } catch (NullPointerException e2) {
                    ((anih) ((anih) asil.a.c()).a("askc", "a", 168, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received null callback from binder when starting operation '%s'", (Object) d2.b);
                    return a(d2.b, asgb.OPERATION_STATUS_FAILED);
                } catch (RemoteException e3) {
                    ((anih) ((anih) asil.a.c()).a("askc", "a", 172, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received dead callback from binder when starting operation '%s'", (Object) d2.b);
                    return a(d2.b, asgb.OPERATION_STATUS_FAILED);
                }
            } else {
                String valueOf = String.valueOf(asha);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Unrecognized request: ");
                sb.append(valueOf);
                throw new asji(sb.toString());
            }
        } catch (asji e4) {
            anih anih = (anih) asil.a.c();
            anih.a((Throwable) e4);
            ((anih) anih.a("askc", "a", 150, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unsupported operation request specified to start.");
            return a(Integer.toString(((asij) asis.j).a().intValue()), asgb.OPERATION_STATUS_FAILED);
        } catch (asjj e5) {
            anih anih2 = (anih) asil.a.c();
            anih2.a((Throwable) e5);
            ((anih) anih2.a("askc", "a", 155, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Invalid device status to start operation.");
            return a(Integer.toString(((asij) asis.j).a().intValue()), asgb.OPERATION_STATUS_FAILED);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        boolean z = false;
        if (!this.d.isShutdown()) {
            return false;
        }
        synchronized (this.a) {
            if (this.a.size() == 0) {
                z = true;
            }
        }
        return z;
    }

    public final OperationResponse a(String str) {
        asis b2 = b(str);
        if (b2 == null) {
            ((anih) ((anih) asil.a.c()).a("askc", "a", 190, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Invalid operation id specified to cancel: %s", (Object) str);
            return a(str, asgb.OPERATION_STATUS_MISSING);
        }
        jjg jjg = asil.a;
        this.b.obtainMessage(3, b2).sendToTarget();
        return new OperationResponse(b2.d());
    }

    public final void a() {
        this.e.a((asiz) new asjz(this));
    }
}
