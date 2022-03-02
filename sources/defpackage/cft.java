package defpackage;

import android.content.Context;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/* renamed from: cft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cft extends ccv {
    public static final ccj b = new ccj(new cfr(), "UserVelocityProducer", new int[]{48}, new int[]{1});
    private LinkedList j;

    public cft(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
    }

    private final ContextData c() {
        boolean z;
        double d;
        double d2;
        new Object[1][0] = Integer.valueOf(this.j.size());
        if (this.j.size() < 2) {
            return null;
        }
        ContextData contextData = (ContextData) this.j.peekLast();
        LinkedList linkedList = this.j;
        ContextData contextData2 = (ContextData) linkedList.get(linkedList.size() - 2);
        atus atus = (atus) contextData2.a((aubq) atus.j);
        atus atus2 = (atus) contextData.a((aubq) atus.j);
        if (atus == null || atus2 == null) {
            ((anih) ((anih) bxk.a.c()).a("cft", "c", 161, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[UserVelocityProducer] No UserLocation data.");
            return null;
        }
        double a = aell.a(atus.b, atus.c, atus2.b, atus2.c);
        new Object[1][0] = Double.valueOf(a);
        float f = atus.g;
        if (f == 0.0f || atus2.g == 0.0f) {
            z = false;
        } else {
            z = true;
        }
        double hypot = Math.hypot((double) f, (double) atus2.g);
        double c = (double) (contextData.j().c() - contextData2.j().c());
        Double.isNaN(c);
        double d3 = (a / c) * 1000.0d;
        if (z) {
            Double.isNaN(c);
            d = (hypot / c) * 1000.0d;
        } else {
            d = 0.0d;
        }
        double b2 = aell.b(atus.b, atus.c, atus2.b, atus2.c);
        if (z) {
            float f2 = atus.g;
            double d4 = (double) atus2.g;
            double d5 = (double) f2;
            Double.isNaN(d5);
            Double.isNaN(d4);
            double d6 = d5 + d4;
            if (a < d6) {
                Double.isNaN(d4);
                Double.isNaN(d4);
                d2 = Math.asin(d4 / ((a * d4) / d6));
            } else {
                d2 = 3.141592653589793d;
            }
        } else {
            d2 = 0.0d;
        }
        long c2 = contextData2.j().c();
        long c3 = contextData.j().c();
        aucd o = atut.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atut atut = (atut) o.b;
        int i = atut.a | 1;
        atut.a = i;
        atut.b = d3;
        int i2 = i | 2;
        atut.a = i2;
        atut.c = b2;
        if (d != 0.0d) {
            i2 |= 4;
            atut.a = i2;
            atut.d = d;
        }
        if (d2 != 0.0d) {
            atut.a = i2 | 8;
            atut.e = d2;
        }
        jti jti = new jti(3, 48, 2);
        jti.a(jut.a(c2, c3));
        jti.a(atut.g, (atut) o.i());
        return jti.a();
    }

    private final void e(ContextData contextData) {
        boolean z;
        double d;
        double d2;
        double d3;
        ContextData contextData2 = contextData;
        if (contextData.g() != 1) {
            ((anih) ((anih) bxk.a.c()).a("cft", "e", 82, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[UserVelocityProducer] Received unexpected context %s", (Object) Integer.toString(contextData.g()));
        } else if (contextData2.a((aubq) atus.j) == null) {
            ((anih) ((anih) bxk.a.c()).a("cft", "e", 90, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[UserVelocityProducer] Received location context data without user location info.");
        } else if (contextData.j() == null) {
        } else {
            if (this.j.isEmpty() || contextData.j().c() >= ((ContextData) this.j.peekLast()).j().c()) {
                long c = !this.j.isEmpty() ? contextData.j().c() - ((ContextData) this.j.peekLast()).j().c() : Long.MAX_VALUE;
                if (c >= 20000) {
                    this.j.offer(contextData2);
                    while (this.j.size() > 10) {
                        this.j.poll();
                    }
                    new Object[1][0] = Integer.valueOf(this.j.size());
                    ContextData contextData3 = null;
                    if (this.j.size() >= 2) {
                        ContextData contextData4 = (ContextData) this.j.peekLast();
                        LinkedList linkedList = this.j;
                        ContextData contextData5 = (ContextData) linkedList.get(linkedList.size() - 2);
                        atus atus = (atus) contextData5.a((aubq) atus.j);
                        atus atus2 = (atus) contextData4.a((aubq) atus.j);
                        if (atus == null || atus2 == null) {
                            ((anih) ((anih) bxk.a.c()).a("cft", "c", 161, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[UserVelocityProducer] No UserLocation data.");
                        } else {
                            double a = aell.a(atus.b, atus.c, atus2.b, atus2.c);
                            new Object[1][0] = Double.valueOf(a);
                            float f = atus.g;
                            if (f == 0.0f || atus2.g == 0.0f) {
                                z = false;
                            } else {
                                z = true;
                            }
                            double hypot = Math.hypot((double) f, (double) atus2.g);
                            double c2 = (double) (contextData4.j().c() - contextData5.j().c());
                            Double.isNaN(c2);
                            double d4 = (a / c2) * 1000.0d;
                            if (z) {
                                Double.isNaN(c2);
                                d = (hypot / c2) * 1000.0d;
                            } else {
                                d = 0.0d;
                            }
                            double b2 = aell.b(atus.b, atus.c, atus2.b, atus2.c);
                            if (z) {
                                float f2 = atus.g;
                                double d5 = (double) atus2.g;
                                d2 = d;
                                double d6 = (double) f2;
                                Double.isNaN(d6);
                                Double.isNaN(d5);
                                double d7 = d6 + d5;
                                if (a < d7) {
                                    Double.isNaN(d5);
                                    Double.isNaN(d5);
                                    d3 = Math.asin(d5 / ((a * d5) / d7));
                                } else {
                                    d3 = 3.141592653589793d;
                                }
                            } else {
                                d2 = d;
                                d3 = 0.0d;
                            }
                            long c3 = contextData5.j().c();
                            long c4 = contextData4.j().c();
                            aucd o = atut.f.o();
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            atut atut = (atut) o.b;
                            int i = atut.a | 1;
                            atut.a = i;
                            atut.b = d4;
                            int i2 = i | 2;
                            atut.a = i2;
                            atut.c = b2;
                            if (d2 != 0.0d) {
                                i2 |= 4;
                                atut.a = i2;
                                atut.d = d2;
                            }
                            if (d3 != 0.0d) {
                                atut.a = i2 | 8;
                                atut.e = d3;
                            }
                            jti jti = new jti(3, 48, 2);
                            jti.a(jut.a(c3, c4));
                            jti.a(atut.g, (atut) o.i());
                            contextData3 = jti.a();
                        }
                    }
                    if (contextData3 != null) {
                        c(contextData3);
                        return;
                    }
                    return;
                }
                new Object[1][0] = Long.valueOf(c);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        ArrayList arrayList;
        this.j = new LinkedList();
        ContextManagerClientInfo a = cbi.a(this.e, "UserVelocityProducer");
        jtm jtm = new jtm();
        jtm.a(1);
        jtm.b(10);
        cjb a2 = cbi.p().a((ContextDataFilterImpl) jtm.a(), a);
        if (a2.a == 0 && (arrayList = a2.b) != null) {
            Collections.sort(arrayList, new cfs());
            ArrayList arrayList2 = a2.b;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ContextData contextData = (ContextData) arrayList2.get(i);
                if (contextData.a((aubq) atus.j) != null) {
                    e(contextData);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }

    public final void b(ContextData contextData) {
        e(contextData);
    }
}
