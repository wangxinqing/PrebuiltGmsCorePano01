package defpackage;

/* renamed from: aaem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaem extends nsg {
    final /* synthetic */ aaen a;

    public aaem(aaen aaen) {
        this.a = aaen;
    }

    public final void a(int i) {
        this.a.b(qyl.a(i));
    }

    public final void b(int i) {
        switch (i) {
            case 1:
                amkr a2 = amlv.a("trigger_EVENT_CODE_DEVICE_CHARGING");
                try {
                    aaen aaen = this.a;
                    if (!aaen.g) {
                        aaen.b(nxn.DEVICE_CHARGING);
                    } else {
                        aaen.g = false;
                        aaen.a(nxn.DEVICE_CHARGING);
                    }
                    if (a2 != null) {
                        a2.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    apev.a(th, th);
                    break;
                }
                break;
            case 2:
                amky b = this.a.f.b("trigger_EVENT_CODE_NETWORK_CONNECTED");
                try {
                    this.a.a(nxn.NETWORK_CONNECTED);
                    if (b != null) {
                        b.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    apev.a(th, th2);
                    break;
                }
                break;
            case 3:
                this.a.d.d();
                return;
            case 4:
                amky b2 = this.a.f.b("trigger_EVENT_CODE_DOZE_MODE_CHANGED");
                try {
                    if (!this.a.l.a()) {
                        this.a.a(nxn.DOZE_MAINTENANCE_WINDOW);
                        if (b2 != null) {
                            b2.close();
                            return;
                        }
                        return;
                    } else if (b2 != null) {
                        b2.close();
                        return;
                    } else {
                        return;
                    }
                } catch (Throwable th3) {
                    apev.a(th, th3);
                    break;
                }
                break;
            case 5:
                amky b3 = this.a.f.b("trigger_EVENT_CODE_DOZE_LIGHT_MODE_CHANGED");
                try {
                    if (!nqw.e()) {
                        this.a.a(nxn.DOZE_LIGHT_MAINTENANCE_WINDOW);
                        if (b3 != null) {
                            b3.close();
                            return;
                        }
                        return;
                    } else if (b3 != null) {
                        b3.close();
                        return;
                    } else {
                        return;
                    }
                } catch (Throwable th4) {
                    apev.a(th, th4);
                    break;
                }
                break;
            case 6:
                this.a.a(nxn.REACHABILITY_CHANGED);
                return;
            default:
                amky b4 = this.a.f.b("trigger_EVENT_CODE_DEVICE_IDLE");
                try {
                    if (axbn.f()) {
                        this.a.b(nxn.DEVICE_IDLE);
                    }
                    if (b4 != null) {
                        b4.close();
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    apev.a(th, th5);
                    break;
                }
                break;
        }
        throw th;
        throw th;
        throw th;
        throw th;
        throw th;
    }

    public final void a(ntx ntx) {
        aaen aaen = this.a;
        aaen.c.a((aabi) aaen, ntx);
    }

    public final void b(ntx ntx) {
        this.a.b(ntx.a());
    }
}
