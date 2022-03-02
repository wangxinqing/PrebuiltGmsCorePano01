package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.LinkedList;
import java.util.List;

/* renamed from: uwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uwr implements vac {
    public final Context a;
    public final arwg b;
    public final vae c;
    public final uyt d;
    public final vel e;
    public boolean f;
    private final uyj g;
    private final uyz h;
    private final vav i;

    public uwr(Context context) {
        vae vae = new vae();
        this.a = context;
        this.b = (arwg) thl.a(context, arwg.class);
        this.c = vae;
        this.d = (uyt) thl.a(context, uyt.class);
        this.g = (uyj) thl.a(context, uyj.class);
        this.e = (vel) thl.a(context, vel.class);
        this.h = (uyz) thl.a(context, uyz.class);
        this.i = (vav) thl.a(context, vav.class);
        jjg jjg = tgc.a;
    }

    private static int a(Context context, vdo vdo) {
        int i2 = vdo.a;
        if (i2 == 1) {
            return vdo.b.b.b() ? 4 : 0;
        }
        if (i2 == 2) {
            String str = vdo.c.a;
            uyg uyg = ((uyj) thl.a(context, uyj.class)).f;
            return (uyg == null || !uyg.a.equals(str)) ? 0 : 4;
        } else if (i2 != 3) {
            if (i2 == 4) {
                return 4;
            }
            ((anih) ((anih) tgc.a.b()).a("uwr", "a", 321, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unknown operation type: %d", vdo.a);
            return 4;
        } else if (vdo.d.c.b()) {
            return 5;
        } else {
            return 4;
        }
    }

    private static final IBinder a(vcf vcf) {
        if (vcf != null) {
            return vcf.asBinder();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a(ClientAppIdentifier clientAppIdentifier, vdo vdo) {
        List<vdo> list;
        int i2;
        vdv vdv;
        this.b.b();
        iva.a((Object) clientAppIdentifier);
        iva.a((Object) vdo);
        if (vdo.d == null) {
            list = amzy.a((Object) vdo);
        } else {
            LinkedList linkedList = new LinkedList();
            linkedList.add(vdo);
            if (vdo.a == 3) {
                uyq uyq = vdo.d;
                uyq a2 = this.d.a(uyq.b);
                if (a2 != null) {
                    if (ius.a(a2.c, uyq.c) && ius.a(a2.d, uyq.d) && vds.a(a2.d.e)) {
                        ((vbf) thl.a(this.a, vbf.class)).c();
                        linkedList.clear();
                    } else {
                        uyp uyp = a2.b;
                        vcf vcf = uyp.a;
                        if (vcf == null) {
                            vdv = vdv.a(uyp.b);
                        } else {
                            vdv = vdv.a(vcf);
                        }
                        linkedList.addFirst(vdo.a(vdv, (icm) null));
                    }
                }
            }
            if (!linkedList.isEmpty()) {
                list = linkedList;
            } else {
                vdo.b(0);
                return;
            }
        }
        for (vdo vdo2 : list) {
            Context context = this.a;
            int i3 = vdo2.a;
            if (i3 == 1) {
                i2 = !vdo2.b.b.b() ? 0 : 4;
            } else if (i3 == 2) {
                String str = vdo2.c.a;
                uyg uyg = ((uyj) thl.a(context, uyj.class)).f;
                i2 = (uyg == null || !uyg.a.equals(str)) ? 0 : 4;
            } else if (i3 == 3) {
                i2 = !vdo2.d.c.b() ? 4 : 5;
            } else if (i3 != 4) {
                ((anih) ((anih) tgc.a.b()).a("uwr", "a", 321, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unknown operation type: %d", vdo2.a);
                i2 = 4;
            } else {
                i2 = 4;
            }
            vdo2.a(i2, 13);
            int i4 = vdo2.a;
            if (i4 == 1) {
                uyg uyg2 = vdo2.b;
                iva.a(uyg2.equals(uyg2));
                uyg2.f = vdo2;
                uyj uyj = this.g;
                uyg uyg3 = vdo2.b;
                uyj.d.b();
                uyj.a(uyg3.a);
                boolean add = uyj.c.add(uyg3);
                if (uyg3.b.b()) {
                    uyj.f = uyg3;
                }
                if (add) {
                    uyj.d();
                }
                jjg jjg = tgc.a;
                uyj.c.size();
                ((vel) thl.a(uyj.a, vel.class)).a();
            } else if (i4 == 2) {
                uyj uyj2 = this.g;
                uyj2.d.b();
                uyj2.a(vdo2.c.a);
                uyj2.b.put(vdo2.c.a, vdo2);
                ((vel) thl.a(uyj2.a, vel.class)).a();
            } else if (i4 == 3) {
                uyq uyq2 = vdo2.d;
                iva.a(uyq2.equals(uyq2));
                uyq2.f = vdo2;
                uyt uyt = this.d;
                uyq uyq3 = vdo2.d;
                uyt.g.b();
                uyt.b(uyq3.b);
                uyt.e.put(uyq3.b, uyq3);
                uyt.d.a((Object) clientAppIdentifier, (Object) uyq3);
                uyt.f.put(uyq3.a, uyq3);
                uyt.a();
                for (uys a3 : uyt.b) {
                    a3.a(uyq3);
                }
                jjg jjg2 = tgc.a;
                if (uyq3.c.a()) {
                    uyt.h = uyq3;
                }
                if (uyq3.c.b()) {
                    ((vel) uyt.a.a(vel.class)).a();
                }
            } else if (i4 != 4) {
                ((anih) ((anih) tgc.a.b()).a("uwr", "a", 226, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Unexpected operation code %d", (Object) "CopresenceHelper: ", vdo2.a);
            } else {
                uyt uyt2 = this.d;
                vdv vdv2 = vdo2.e;
                uyt2.g.b();
                uyt2.g.b();
                vcf vcf2 = vdv2.a;
                uyt2.b(vcf2 == null ? uyt2.a(vdv2.b) : uyt2.a(vcf2));
            }
        }
    }

    public final void a(String str) {
        this.b.c(new uwp(this, "onClientAppDied.wipePackage", str));
    }

    public final void a(vdo vdo, IBinder iBinder, ClientAppIdentifier clientAppIdentifier) {
        Object obj;
        int i2;
        List<vdo> list;
        int i3;
        vdv vdv;
        jjg jjg = tgc.a;
        auyy auyy = this.i.f.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        if (auyy.b) {
            this.b.b();
            int i4 = vdo.a;
            if (i4 == 1) {
                obj = vdo.b.a;
            } else if (i4 == 2) {
                obj = vdo.c.a;
            } else if (i4 == 3) {
                obj = a(vdo.d.b.a);
            } else if (i4 != 4) {
                obj = null;
            } else {
                obj = a(vdo.e.a);
            }
            if (obj != null) {
                int i5 = vdo.a;
                if (i5 == 1 || i5 == 3) {
                    vae vae = this.c;
                    String str = clientAppIdentifier.d;
                    vad vad = (vad) vae.a.get(str);
                    if (vad == null) {
                        vad = new vad(vae, str);
                        vae.a.put(str, vad);
                    }
                    try {
                        if (!vad.b.containsKey(obj)) {
                            iBinder.linkToDeath(vad, 0);
                            vad.b.put(obj, iBinder);
                        }
                    } catch (RemoteException e2) {
                        vad = null;
                    }
                    if (vad == null) {
                        return;
                    }
                } else {
                    vae vae2 = this.c;
                    String str2 = clientAppIdentifier.d;
                    vad vad2 = (vad) vae2.a.get(str2);
                    if (vad2 != null) {
                        IBinder iBinder2 = (IBinder) vad2.b.remove(obj);
                        if (iBinder2 != null) {
                            iBinder2.unlinkToDeath(vad2, 0);
                        }
                        if (vad2.b.isEmpty()) {
                            vae2.a(str2);
                        }
                    }
                }
            }
            int i6 = vdo.a;
            if (i6 != 1) {
                i2 = i6 != 2 ? i6 != 3 ? i6 != 4 ? 0 : 13 : 12 : 11;
            } else {
                i2 = 10;
            }
            if (i2 != 0) {
                this.h.a(this.a, clientAppIdentifier.c.b, i2);
            }
            this.b.b();
            iva.a((Object) clientAppIdentifier);
            iva.a((Object) vdo);
            if (vdo.d == null) {
                list = amzy.a((Object) vdo);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(vdo);
                if (vdo.a == 3) {
                    uyq uyq = vdo.d;
                    uyq a2 = this.d.a(uyq.b);
                    if (a2 != null) {
                        if (ius.a(a2.c, uyq.c) && ius.a(a2.d, uyq.d) && vds.a(a2.d.e)) {
                            ((vbf) thl.a(this.a, vbf.class)).c();
                            linkedList.clear();
                        } else {
                            uyp uyp = a2.b;
                            vcf vcf = uyp.a;
                            if (vcf == null) {
                                vdv = vdv.a(uyp.b);
                            } else {
                                vdv = vdv.a(vcf);
                            }
                            linkedList.addFirst(vdo.a(vdv, (icm) null));
                        }
                    }
                }
                if (!linkedList.isEmpty()) {
                    list = linkedList;
                } else {
                    vdo.b(0);
                    return;
                }
            }
            for (vdo vdo2 : list) {
                Context context = this.a;
                int i7 = vdo2.a;
                if (i7 == 1) {
                    i3 = !vdo2.b.b.b() ? 0 : 4;
                } else if (i7 == 2) {
                    String str3 = vdo2.c.a;
                    uyg uyg = ((uyj) thl.a(context, uyj.class)).f;
                    i3 = (uyg == null || !uyg.a.equals(str3)) ? 0 : 4;
                } else if (i7 == 3) {
                    i3 = !vdo2.d.c.b() ? 4 : 5;
                } else if (i7 != 4) {
                    ((anih) ((anih) tgc.a.b()).a("uwr", "a", 321, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unknown operation type: %d", vdo2.a);
                    i3 = 4;
                } else {
                    i3 = 4;
                }
                vdo2.a(i3, 13);
                int i8 = vdo2.a;
                if (i8 == 1) {
                    uyg uyg2 = vdo2.b;
                    iva.a(uyg2.equals(uyg2));
                    uyg2.f = vdo2;
                    uyj uyj = this.g;
                    uyg uyg3 = vdo2.b;
                    uyj.d.b();
                    uyj.a(uyg3.a);
                    boolean add = uyj.c.add(uyg3);
                    if (uyg3.b.b()) {
                        uyj.f = uyg3;
                    }
                    if (add) {
                        uyj.d();
                    }
                    uyj.c.size();
                    ((vel) thl.a(uyj.a, vel.class)).a();
                } else if (i8 == 2) {
                    uyj uyj2 = this.g;
                    uyj2.d.b();
                    uyj2.a(vdo2.c.a);
                    uyj2.b.put(vdo2.c.a, vdo2);
                    ((vel) thl.a(uyj2.a, vel.class)).a();
                } else if (i8 == 3) {
                    uyq uyq2 = vdo2.d;
                    iva.a(uyq2.equals(uyq2));
                    uyq2.f = vdo2;
                    uyt uyt = this.d;
                    uyq uyq3 = vdo2.d;
                    uyt.g.b();
                    uyt.b(uyq3.b);
                    uyt.e.put(uyq3.b, uyq3);
                    uyt.d.a((Object) clientAppIdentifier, (Object) uyq3);
                    uyt.f.put(uyq3.a, uyq3);
                    uyt.a();
                    for (uys a3 : uyt.b) {
                        a3.a(uyq3);
                    }
                    if (uyq3.c.a()) {
                        uyt.h = uyq3;
                    }
                    if (uyq3.c.b()) {
                        ((vel) uyt.a.a(vel.class)).a();
                    }
                } else if (i8 != 4) {
                    ((anih) ((anih) tgc.a.b()).a("uwr", "a", 226, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Unexpected operation code %d", (Object) "CopresenceHelper: ", vdo2.a);
                } else {
                    uyt uyt2 = this.d;
                    vdv vdv2 = vdo2.e;
                    uyt2.g.b();
                    uyt2.g.b();
                    vcf vcf2 = vdv2.a;
                    uyt2.b(vcf2 == null ? uyt2.a(vdv2.b) : uyt2.a(vcf2));
                }
            }
            return;
        }
        vdo.b(8);
    }
}
