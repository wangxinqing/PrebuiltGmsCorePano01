package defpackage;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import java.util.Set;

/* renamed from: rau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rau {
    public final auop a;

    public rau(auop auop) {
        this.a = auop;
    }

    static amsv a(amsv amsv) {
        return new rat(amsv);
    }

    public static void a(auoh auoh, qxw qxw) {
        int a2 = auoe.a(auoh.b);
        if (a2 == 0) {
            a2 = 1;
        }
        Integer c = c(a2);
        int a3 = auoe.a(auoh.j);
        if (a3 == 0) {
            a3 = 1;
        }
        Integer c2 = c(a3);
        if (c != null && c2 != null) {
            qxw.b(c.intValue(), c2.intValue());
        } else if (c != null) {
            qxw.a(c.intValue());
        }
        int a4 = auoc.a(auoh.c);
        if (a4 == 0) {
            a4 = 1;
        }
        Integer d = d(a4);
        int a5 = auoc.a(auoh.k);
        if (a5 == 0) {
            a5 = 1;
        }
        Integer d2 = d(a5);
        if (d != null && d2 != null) {
            qxw.a(d.intValue(), d2.intValue());
        } else if (d != null) {
            qxw.a(d.intValue(), d.intValue());
        }
        int a6 = auog.a(auoh.f);
        if (a6 == 0) {
            a6 = 4;
        }
        int i = a6 - 1;
        if (i == 1) {
            qxw.b(0);
        } else if (i == 2) {
            qxw.b(1);
        } else if (i == 3) {
            qxw.b(2);
        }
        if ((auoh.a & 16) != 0) {
            qxw.n = auoh.g;
        }
        if (auoh.e.size() != 0) {
            anav j = anax.j();
            aucx aucx = auoh.e;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                j.b(Uri.parse((String) aucx.get(i2)));
            }
            qxw.a((Set) j.a());
        }
        if ((auoh.a & 4) != 0) {
            qxw.a(auoh.d);
        }
        if ((auoh.a & 32) != 0) {
            qxk qxk = new qxk();
            aunt aunt = auoh.h;
            if (aunt == null) {
                aunt = aunt.e;
            }
            if ((aunt.a & 1) != 0) {
                int a7 = auns.a(aunt.b);
                if (a7 == 0) {
                    a7 = 1;
                }
                int i3 = a7 - 1;
                if (i3 == 0 || i3 == 1) {
                    qxk.a = 0;
                } else {
                    qxk.a = 1;
                }
            }
            if ((aunt.a & 2) != 0) {
                aubn aubn = aunt.c;
                if (aubn == null) {
                    aubn = aubn.c;
                }
                qxk.b = (int) augi.a(aubn);
            }
            if ((aunt.a & 4) != 0) {
                aubn aubn2 = aunt.d;
                if (aubn2 == null) {
                    aubn2 = aubn.c;
                }
                qxk.c = (int) augi.a(aubn2);
            }
            qxw.r = qxk.a();
        }
    }

    private static Integer c(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 0;
        }
        if (i2 != 2) {
            return i2 != 3 ? null : 2;
        }
        return 1;
    }

    private static Integer d(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 2 ? null : 1;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final auoa b(int i) {
        auop auop = this.a;
        if (auop == null) {
            return null;
        }
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            auoi auoi = auop.b;
            if (auoi == null) {
                auoi = auoi.d;
            }
            aunn aunn = auoi.b;
            if (aunn == null) {
                aunn = aunn.c;
            }
            auoh auoh = aunn.a;
            if (auoh == null) {
                auoh = auoh.l;
            }
            auoa auoa = auoh.i;
            if (auoa == null) {
                return auoa.b;
            }
            return auoa;
        } else if (i2 != 2) {
            return null;
        } else {
            auoi auoi2 = auop.b;
            if (auoi2 == null) {
                auoi2 = auoi.d;
            }
            aunp aunp = auoi2.c;
            if (aunp == null) {
                aunp = aunp.c;
            }
            auoh auoh2 = aunp.a;
            if (auoh2 == null) {
                auoh2 = auoh.l;
            }
            auoa auoa2 = auoh2.i;
            if (auoa2 == null) {
                return auoa.b;
            }
            return auoa2;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i) {
        auop auop = this.a;
        if (auop == null) {
            return false;
        }
        auoi auoi = auop.b;
        if (auoi == null) {
            auoi = auoi.d;
        }
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? i2 != 1 ? i2 == 2 && (2 & auoi.a) != 0 : (auoi.a & 1) != 0 : (2 & this.a.a) != 0;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(aftv aftv) {
        char c;
        int intExtra;
        auop auop = this.a;
        if (auop != null) {
            auoo auoo = auop.c;
            if (auoo == null) {
                auoo = auoo.e;
            }
            int a2 = auol.a(auoo.c);
            if (a2 == 0) {
                a2 = 1;
            }
            boolean z = auoo.d;
            if (a2 - 1 == 2) {
                Intent registerReceiver = aftv.a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (!(registerReceiver == null || (intExtra = registerReceiver.getIntExtra("status", 1)) == 1)) {
                    if (intExtra == 2) {
                        c = 3;
                    } else if (intExtra == 5) {
                        c = 3;
                    } else if (intExtra == 3 || intExtra == 4) {
                        c = 2;
                    }
                    if (c != 3 && (c != 1 || !z)) {
                        return false;
                    }
                }
                c = 1;
                return false;
            }
            int a3 = auon.a(auoo.a);
            if (a3 == 0) {
                a3 = 1;
            }
            boolean z2 = auoo.b;
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) aftv.b.a()).getActiveNetworkInfo();
            int i = a3 - 1;
            if (i != 2) {
                if (i == 3) {
                    if (activeNetworkInfo != null) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (!activeNetworkInfo.isConnected() || ((ConnectivityManager) aftv.b.a()).isActiveNetworkMetered()) {
                            return false;
                        }
                    }
                }
                return true;
            } else if (activeNetworkInfo != null) {
                z2 = activeNetworkInfo.isConnected();
            }
            if (!z2) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("Unscheduled sync policy is not enabled");
    }
}
