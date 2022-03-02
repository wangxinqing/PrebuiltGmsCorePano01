package defpackage;

import android.net.wifi.ScanResult;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: aizf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aizf extends aizg implements arnb, arne {
    final arnd a;
    final aixt b;
    final aicn c;
    final Handler d;
    long e;
    long f;
    arnh g;

    public aizf(arnd arnd, aixt aixt, aicn aicn, Handler handler) {
        this.a = arnd;
        this.b = aixt;
        this.c = aicn;
        this.d = handler;
    }

    private final void a(boolean z) {
        aicn aicn = this.c;
        aicn.a((aicl) new aicm(aico.CHRE_WIFI_NEW_CLIENT, aicn.b(), "nanoAppState=%2$d", (Object) null, z ? 1 : 0, -1, -1));
        ((aixb) this.b).a.c.a(5, z ? 1 : 0, (Object) null, false);
    }

    private final void b(long j, long j2) {
        arnh arnh = this.g;
        if (arnh != null) {
            aucd o = aroy.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aroy aroy = (aroy) o.b;
            int i = aroy.a | 1;
            aroy.a = i;
            aroy.b = j;
            aroy.a = i | 2;
            aroy.c = j2;
            byte[] k = ((aroy) o.i()).k();
            int length = k.length;
            StringBuilder sb = new StringBuilder(48);
            sb.append("sending client-request msg of length ");
            sb.append(length);
            sb.toString();
            arnh.a(1, 1, k);
        }
    }

    private final arnh f() {
        return this.a.a(5147455389092024338L);
    }

    public final boolean a() {
        return this.g != null;
    }

    public final void b(int i) {
    }

    public final boolean b() {
        return (this.e == -1 || this.f == -1) ? false : true;
    }

    public final void be() {
        boolean z;
        arnh f2 = f();
        this.g = f2;
        if (f2 != null) {
            z = true;
        } else {
            z = false;
        }
        a(z);
        if (this.g != null && b()) {
            b(this.e, this.f);
        }
    }

    public final void d() {
        b(0, 0);
        this.e = -1;
        this.f = -1;
    }

    public final void e() {
        boolean z;
        arnh f2 = f();
        if (f2 != null) {
            f2.a(this, this.d);
            this.a.a(5147455389092024338L, this, new qvr(Looper.myLooper()));
        }
        this.g = f2;
        if (f2 != null) {
            z = true;
        } else {
            z = false;
        }
        a(z);
        this.e = -1;
        this.f = -1;
    }

    public final void a(int i) {
        if (i != 1) {
            this.g = null;
            a(false);
            this.e = -1;
            this.f = -1;
        }
    }

    public final void a(long j, long j2) {
        int i;
        long j3 = j;
        long j4 = j2;
        if (a()) {
            if (this.g != null) {
                b(j, j2);
                this.e = j3;
                this.f = j4;
                i = 1;
                aicn aicn = this.c;
                aicn.a((aicl) new aicm(aico.CHRE_WIFI_NEW_CLIENT, aicn.b(), "intervalSec=%2$d, durationSec=%3$d, appAvail=%4$d", (Object) null, (int) (j3 / 1000), (int) (j4 / 1000), i));
            }
            this.e = -1;
            this.f = -1;
        }
        i = 0;
        aicn aicn2 = this.c;
        aicn2.a((aicl) new aicm(aico.CHRE_WIFI_NEW_CLIENT, aicn2.b(), "intervalSec=%2$d, durationSec=%3$d, appAvail=%4$d", (Object) null, (int) (j3 / 1000), (int) (j4 / 1000), i));
    }

    public final void a(arnd arnd, arnh arnh, arnt arnt) {
        long j;
        int i;
        arnt arnt2 = arnt;
        if (arnh == this.g) {
            int i2 = arnt2.a;
            int i3 = arnt2.b;
            byte[] bArr = arnt2.c;
            StringBuilder sb = new StringBuilder(110);
            sb.append("onMessageReceived(), message type is  ");
            sb.append(i2);
            sb.append(" and version is ");
            sb.append(i3);
            sb.append(" and payload length is ");
            sb.append(bArr.length);
            sb.toString();
            int i4 = 1;
            if (i2 == 2) {
                int a2 = arpa.a(((arpb) arnt2.a((auef) arpb.b.c(7))).a);
                if (a2 != 0) {
                    i4 = a2;
                }
                int i5 = i4 - 1;
                StringBuilder sb2 = new StringBuilder(43);
                sb2.append("parsing BATCH_RESPONSE, code is ");
                sb2.append(i5);
                sb2.toString();
                if (i5 != 0) {
                    StringBuilder sb3 = new StringBuilder(31);
                    sb3.append("handle this case -- ");
                    sb3.append(i5);
                    sb3.toString();
                }
            } else if (i2 == 3) {
                arox arox = (arox) arnt2.a((auef) arox.d.c(7));
                int a3 = arow.a(arox.c);
                if (a3 == 0) {
                    a3 = 1;
                }
                boolean z = arox.a;
                StringBuilder sb4 = new StringBuilder(75);
                sb4.append("smartbatching batch-event with status ");
                sb4.append(a3 - 1);
                sb4.append(" and lastFragment is ");
                sb4.append(z);
                sb4.toString();
                try {
                    aucx aucx = arox.b;
                    int size = aucx.size();
                    StringBuilder sb5 = new StringBuilder(26);
                    sb5.append("received ");
                    sb5.append(size);
                    sb5.append(" scans");
                    sb5.toString();
                    ArrayList<aixs[]> arrayList = new ArrayList<>();
                    Iterator it = aucx.iterator();
                    while (true) {
                        int i6 = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        arpc arpc = (arpc) it.next();
                        aucx<arou> aucx2 = arpc.b;
                        long j2 = arpc.a;
                        int size2 = aucx2.size();
                        StringBuilder sb6 = new StringBuilder(81);
                        sb6.append(" Scan #");
                        sb6.append(i4);
                        sb6.append(" timestamp is ");
                        sb6.append(j2);
                        sb6.append(" and has ");
                        sb6.append(size2);
                        sb6.append(" entries.");
                        sb6.toString();
                        aixs[] aixsArr = new aixs[aucx2.size()];
                        for (arou arou : aucx2) {
                            long j3 = arou.a;
                            int i7 = arou.b;
                            StringBuilder sb7 = new StringBuilder(55);
                            sb7.append("  AP is bssid ");
                            sb7.append(j3);
                            sb7.append(" and rssi ");
                            sb7.append(i7);
                            sb7.toString();
                            aixsArr[i6] = new aixs(arpc.a, arou.a, "", (String) null, -1, false, -1, arou.b, -1, -1, (ScanResult) null);
                            i6++;
                        }
                        arrayList.add(aixsArr);
                        i4++;
                    }
                    for (aixs[] aixsArr2 : arrayList) {
                        int length = aixsArr2.length;
                        if (length != 0) {
                            j = aixsArr2[0].a;
                        } else {
                            j = 0;
                        }
                        aicn aicn = this.c;
                        long b2 = aicn.b();
                        if (j != 0) {
                            i = (int) (b2 - j);
                        } else {
                            i = -1;
                        }
                        aicn.a((aicl) new aicm(aico.CHRE_WIFI_SCAN_SET, b2, "apCount=%2$d, ageMs=%3$d", (Object) null, length, i, -1));
                    }
                    this.b.a(arrayList, (aibv[]) null);
                } catch (ClassNotFoundException e2) {
                } catch (InstantiationException e3) {
                } catch (IllegalAccessException e4) {
                } catch (NoSuchMethodException e5) {
                } catch (InvocationTargetException e6) {
                }
            }
        }
    }
}
