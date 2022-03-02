package defpackage;

import java.io.IOException;

/* renamed from: athk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class athk implements Runnable {
    private final athn a;
    private final athq b;
    private final atih[] c;
    private final int d;

    public athk(athn athn, athq athq, atih[] atihArr, int i) {
        this.a = athn;
        this.b = athq;
        this.c = atihArr;
        this.d = i;
    }

    public final void run() {
        IOException iOException;
        atii atii;
        atig g;
        athn athn = this.a;
        athq athq = this.b;
        atih[] atihArr = this.c;
        int i = this.d;
        int i2 = 0;
        if (athq.f()) {
            synchronized (athn.f) {
                int length = atihArr.length;
                while (i2 < length) {
                    atih atih = atihArr[i2];
                    long j = ((athr) athq).d;
                    atih.b = 3000 + j;
                    atih.c = j + 5000;
                    i2++;
                }
                athn.b();
            }
        } else if (athq.g()) {
            try {
                if (!athq.d()) {
                    int a2 = athq.a();
                    String h = athq.h();
                    if (a2 != 200) {
                        athn.a(atihArr, new athf(a2));
                    } else {
                        if (h != null) {
                            if (h.equals("application/binary")) {
                                try {
                                    athn.h += (int) athq.e();
                                    atif atif = new atif(athq.j());
                                    int i3 = 0;
                                    while (true) {
                                        atih atih2 = null;
                                        if (i3 >= atihArr.length) {
                                            break;
                                        }
                                        athg athg = atif.b;
                                        if (athg != null) {
                                            synchronized (athg.d) {
                                                while (!athg.e) {
                                                    try {
                                                        athg.d.wait();
                                                    } catch (InterruptedException e) {
                                                    }
                                                }
                                            }
                                            atif.b = null;
                                        }
                                        int readInt = atif.a.readInt();
                                        int readUnsignedShort = atif.a.readUnsignedShort();
                                        if (readUnsignedShort == 33024) {
                                            atif.b = new athg(atif.a, readInt);
                                            atii = new atie(atif.b);
                                        } else if (readUnsignedShort == 33025) {
                                            atif.b = new athg(atif.a, readInt);
                                            atii = new atib(atif.b);
                                        } else {
                                            atif.a.skipBytes(readInt);
                                            atii = null;
                                        }
                                        if (atii == null) {
                                            break;
                                        }
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= atihArr.length) {
                                                break;
                                            }
                                            atih atih3 = atihArr[i4];
                                            if (atih3 != null) {
                                                if (atih3.c() == atii.c()) {
                                                    atihArr[i4] = null;
                                                    atih2 = atih3;
                                                    break;
                                                }
                                            }
                                            i4++;
                                        }
                                        if (atih2 == null) {
                                            try {
                                                atii.b().read(new byte[atii.a()]);
                                            } catch (IOException e2) {
                                            }
                                            atii.d();
                                        } else {
                                            if (atih2.j() && (g = atih2.g()) != null) {
                                                g.a(atih2, atii);
                                            }
                                            atii.d();
                                        }
                                        i3++;
                                    }
                                    if (atif.b != null) {
                                        atif.b = null;
                                    }
                                    atif.a.close();
                                    atif.a = null;
                                    iOException = new IOException("Request didn't complete");
                                } catch (Exception e3) {
                                } catch (Exception e4) {
                                    iOException = new IOException("Request didn't complete");
                                } catch (Throwable th) {
                                    athn.a(atihArr, new IOException("Request didn't complete"));
                                    throw th;
                                }
                                athn.a(atihArr, iOException);
                            }
                        }
                        athn.a(atihArr, new IOException("Bad content-type"));
                    }
                } else {
                    athn.a(atihArr, athq.c());
                }
                while (i2 < atihArr.length) {
                    atih atih4 = atihArr[i2];
                    if (atih4 != null) {
                        atih4.d();
                    }
                    i2++;
                }
                athn.g += i;
            } finally {
                athn.b();
                athq.b();
            }
        }
    }
}
