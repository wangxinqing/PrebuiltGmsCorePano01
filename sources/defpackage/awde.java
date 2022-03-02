package defpackage;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Proxy;
import java.util.logging.Logger;

/* renamed from: awde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awde {
    public final avyj a;
    public final avys b;
    public awdc c;
    public awdk d;
    public boolean e;
    public boolean f;
    public awcu g;

    public awde(avys avys, avyj avyj) {
        this.b = avys;
        this.a = avyj;
    }

    private final void a(boolean z, boolean z2, boolean z3) {
        awdk awdk;
        awdk awdk2;
        synchronized (this.b) {
            awdk = null;
            if (z3) {
                this.g = null;
            }
            if (z2) {
                this.e = true;
            }
            awdk awdk3 = this.d;
            if (awdk3 != null) {
                if (z) {
                    awdk3.k = true;
                }
                if (this.g == null && (this.e || awdk3.k)) {
                    int size = awdk3.j.size();
                    int i = 0;
                    while (i < size) {
                        if (((Reference) awdk3.j.get(i)).get() == this) {
                            awdk3.j.remove(i);
                            awdk awdk4 = this.d;
                            if (awdk4.g > 0) {
                                this.c = null;
                            }
                            if (awdk4.j.isEmpty()) {
                                this.d.l = System.nanoTime();
                                Logger logger = awaa.a;
                                avys avys = this.b;
                                awdk awdk5 = this.d;
                                if (!awdk5.k) {
                                    if (avys.c != 0) {
                                        avys.notifyAll();
                                    }
                                }
                                avys.f.remove(awdk5);
                                awdk2 = this.d;
                                this.d = null;
                                awdk = awdk2;
                            }
                            awdk2 = null;
                            this.d = null;
                            awdk = awdk2;
                        } else {
                            i++;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        }
        if (awdk != null) {
            awaj.a(awdk.c);
        }
    }

    public final synchronized awdk b() {
        return this.d;
    }

    public final void c() {
        a(false, true, false);
    }

    public final void d() {
        a(true, false, false);
    }

    public final void e() {
        a(true, false, true);
    }

    public final String toString() {
        return this.a.toString();
    }

    public final awah a() {
        Logger logger = awaa.a;
        return this.b.g;
    }

    public final void a(awcu awcu) {
        synchronized (this.b) {
            if (awcu != null) {
                if (awcu == this.g) {
                }
            }
            String valueOf = String.valueOf(this.g);
            String valueOf2 = String.valueOf(awcu);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(valueOf2).length());
            sb.append("expected ");
            sb.append(valueOf);
            sb.append(" but was ");
            sb.append(valueOf2);
            throw new IllegalStateException(sb.toString());
        }
        a(false, false, true);
    }

    public final void a(awdk awdk) {
        awdk.j.add(new WeakReference(this));
    }

    public final void a(IOException iOException) {
        synchronized (this.b) {
            awdc awdc = this.c;
            if (awdc != null) {
                awdk awdk = this.d;
                if (awdk.g == 0) {
                    avzo avzo = awdk.a;
                    if (avzo.b.type() != Proxy.Type.DIRECT) {
                        avyj avyj = awdc.a;
                        avyj.f.connectFailed(avyj.a.b(), avzo.b.address(), iOException);
                    }
                    awdc.b.a(avzo);
                } else {
                    this.c = null;
                }
            }
        }
        e();
    }
}
