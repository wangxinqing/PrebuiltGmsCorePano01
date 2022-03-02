package defpackage;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ainy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ainy extends qvr {
    public static final Object b = new Object();
    public boolean a = false;
    public final ainu c = new ainu();
    public ainx[] d;
    public int f = -1;
    public ainx[] g;
    public int h;
    public aioa i;
    public final HashMap j = new HashMap();
    public ains k;
    public ains l;
    public final ArrayList m = new ArrayList();
    private boolean n = false;
    private Message o;
    private boolean p;
    private final ainv q = new ainv();
    private final ainw r = new ainw();

    public ainy(Looper looper, aioa aioa) {
        super(looper);
        this.i = aioa;
        a((ains) this.q);
        a((ains) this.r);
    }

    private final void a(int i2) {
        while (i2 <= this.f) {
            this.d[i2].a.k();
            this.d[i2].c = true;
            i2++;
        }
    }

    public final void handleMessage(Message message) {
        ains ains;
        ainx ainx;
        if (!this.n) {
            aioa aioa = this.i;
            if (message.what != -3) {
                if (message.what == -4) {
                    Message message2 = (Message) message.obj;
                    handleMessage(message2);
                    if (aioa != null) {
                        synchronized (aioa.I) {
                            int i2 = aioa.H - 1;
                            aioa.H = i2;
                            if (i2 == 0) {
                                this.i.b(aioa.J);
                                if (aioa.b()) {
                                    this.i.G.c();
                                }
                            }
                        }
                    }
                    message2.recycle();
                    return;
                }
                this.o = message;
                if (this.p) {
                    ainx ainx2 = this.d[this.f];
                    if (message.what == -1 && message.obj == b) {
                        this.l = this.r;
                    } else if (!ainx2.a.a(message)) {
                        ainx ainx3 = ainx2.b;
                        boolean z = this.i.K.a;
                        ainx2 = null;
                    }
                    if (ainx2 != null) {
                        ains = ainx2.a;
                    } else {
                        ains = null;
                    }
                } else if (message.what == -2 && this.o.obj == b) {
                    this.p = true;
                    a(0);
                    ains = null;
                } else {
                    String valueOf = String.valueOf(message);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
                    sb.append("StateMachine.handleMessage: The start method not called, received msg: ");
                    sb.append(valueOf);
                    throw new RuntimeException(sb.toString());
                }
                ains ains2 = this.d[this.f].a;
                if (message.obj != b) {
                    this.c.a(this.i, this.o, "", ains, ains2, this.l);
                }
                ains ains3 = this.l;
                if (ains3 != null) {
                    while (true) {
                        this.h = 0;
                        ainx ainx4 = (ainx) this.j.get(ains3);
                        ainx[] ainxArr = this.g;
                        int i3 = this.h;
                        this.h = i3 + 1;
                        ainxArr[i3] = ainx4;
                        ainx ainx5 = ainx4.b;
                        while (true) {
                            int i4 = this.f;
                            if (i4 >= 0 && (ainx = this.d[i4]) != null) {
                                ainx.a.l();
                                ainx[] ainxArr2 = this.d;
                                int i5 = this.f;
                                ainxArr2[i5].c = false;
                                this.f = i5 - 1;
                            }
                        }
                        a(a());
                        for (int size = this.m.size() - 1; size >= 0; size--) {
                            this.i.c((Message) this.m.get(size));
                        }
                        this.m.clear();
                        ains ains4 = this.l;
                        if (ains3 == ains4) {
                            break;
                        }
                        ains3 = ains4;
                    }
                    this.l = null;
                }
                if (ains3 != null && ains3 == this.r) {
                    this.i.a();
                    if (this.i.L != null) {
                        getLooper().quit();
                        this.i.L = null;
                    }
                    if (this.i.b()) {
                        this.i.G.c();
                    }
                    this.i.b(Integer.MAX_VALUE);
                    this.i.K = null;
                    this.i = null;
                    this.o = null;
                    this.c.c();
                    this.d = null;
                    this.g = null;
                    this.j.clear();
                    this.k = null;
                    this.l = null;
                    this.m.clear();
                    this.n = true;
                }
            } else if (aioa != null) {
                aioa.J++;
            }
        }
    }

    public final int a() {
        int i2 = this.f + 1;
        int i3 = i2;
        for (int i4 = this.h - 1; i4 >= 0; i4--) {
            this.d[i3] = this.g[i4];
            i3++;
        }
        this.f = i3 - 1;
        return i2;
    }

    public final void a(ains ains) {
        ainx ainx = (ainx) this.j.get(ains);
        if (ainx == null) {
            ainx = new ainx();
            this.j.put(ains, ainx);
        }
        ainx.a = ains;
        ainx.b = null;
        ainx.c = false;
    }
}
