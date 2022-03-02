package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;

/* renamed from: agxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agxb implements amsv {
    private final String a;
    private final String b;
    private final Object c;
    private agwp d;
    private final Object e = new Object();
    private volatile Object f;

    public agxb(String str, String str2, Object obj, agwp agwp) {
        amrl.a(obj);
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = agwp;
    }

    public final Object a() {
        Object obj;
        amri amri;
        agvm.b = true;
        if (agvm.a != null) {
            agvm agvm = agvm.a;
            if (this.f != null) {
                return this.f;
            }
            synchronized (this.e) {
                if (this.f == null) {
                    agvm.c = true;
                    agwp agwp = this.d;
                    String str = this.a;
                    String str2 = this.b;
                    Context context = agvm.d;
                    amri amri2 = agwb.b;
                    if (amri2 == null) {
                        synchronized (agwb.class) {
                            if (agwb.b == null) {
                                agwb.b = agvh.a(context);
                            }
                            amri = agwb.b;
                        }
                        amri2 = amri;
                    }
                    if (amri2.a()) {
                        String a2 = ((agvg) amri2.b()).a(agvj.a(str), (String) null, (String) null, str2);
                        if (a2 != null) {
                            try {
                                agxc agxc = ((agwb) agwp).c;
                                obj = agxc.a(a2);
                            } catch (IOException | IllegalArgumentException e2) {
                                Log.e("ProcessStablePhenotypeFlag", str2.length() == 0 ? new String("Invalid Phenotype flag value for flag ") : "Invalid Phenotype flag value for flag ".concat(str2), e2);
                                obj = null;
                            }
                        } else {
                            obj = null;
                        }
                    } else {
                        Context context2 = agvm.d;
                        if (agwb.a == 0) {
                            synchronized (agwb.class) {
                                if (agwb.a == 0) {
                                    int i = hxk.c;
                                    agwb.a = hxz.j(context2);
                                }
                            }
                        }
                        int i2 = agwb.a;
                        if (i2 >= 13000000) {
                            agwj agwj = (agwj) agwj.b.get(str);
                            if (agwj == null) {
                                agwj = new agwj(agvm, str);
                                agwj agwj2 = (agwj) agwj.b.putIfAbsent(str, agwj);
                                if (agwj2 == null) {
                                    agwx.a(agvm.d, str, new agwd(agwj));
                                } else {
                                    agwj = agwj2;
                                }
                            }
                            boolean z = agwj.g;
                            amrl.a(true, "Package %s cannot be registered both with and without stickyAccountSupport", (Object) str);
                            String str3 = (String) agwj.h.a(str2);
                            if (str3 != null) {
                                try {
                                    agxc agxc2 = ((agwb) agwp).c;
                                    obj = agxc.a(str3);
                                } catch (IOException | IllegalArgumentException e3) {
                                    Log.e("ProcessStablePhenotypeFlag", str2.length() == 0 ? new String("Invalid Phenotype flag value for flag ") : "Invalid Phenotype flag value for flag ".concat(str2), e3);
                                    obj = null;
                                }
                            } else {
                                obj = null;
                            }
                        } else if (i2 > 0) {
                            agwo agwo = (agwo) agwo.a.get(str);
                            if (agwo == null) {
                                agwo = new agwo(agvm, str);
                                agwo agwo2 = (agwo) agwo.a.putIfAbsent(str, agwo);
                                if (agwo2 == null) {
                                    agwx.a(agvm.d, str, new agwl(agwo));
                                } else {
                                    agwo = agwo2;
                                }
                            }
                            boolean z2 = agwo.c;
                            amrl.a(true, "Package %s cannot be registered both with and without stickyAccountSupport", (Object) str);
                            Object a3 = agwo.d.a(str2);
                            if (a3 != null) {
                                try {
                                    obj = (Boolean) a3;
                                } catch (IOException | ClassCastException e4) {
                                    Log.e("ProcessStablePhenotypeFlag", str2.length() == 0 ? new String("Invalid Phenotype flag value for flag ") : "Invalid Phenotype flag value for flag ".concat(str2), e4);
                                    obj = null;
                                }
                            } else {
                                obj = null;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    this.d = null;
                    if (obj == null) {
                        obj = this.c;
                    }
                    this.f = obj;
                    return this.f;
                }
                Object obj2 = this.f;
                return obj2;
            }
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
