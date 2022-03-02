package defpackage;

import android.util.SparseArray;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: buc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class buc extends cbe implements cao, cja {
    public boolean a = false;
    public final SparseArray b = new SparseArray();
    public long c = cbi.i().a();
    public final Map d = new HashMap();
    public final bug e = new bug();
    public final List f = new ArrayList();
    public final SparseArray g = new SparseArray();

    public buc() {
        new buj().a(bvq.a("PushAnalyticsDataToServer"));
    }

    public final void a(int i) {
        bug bug = this.e;
        if (i == 1) {
            bug.a++;
        } else if (i == 2) {
            bug.b++;
        } else if (i != 3) {
            bug.d++;
        } else {
            bug.c++;
        }
        this.a = true;
    }

    public final void b(bsz bsz, atjv atjv) {
        long a2 = cbi.i().a();
        bui bui = (bui) this.b.get(atjv.bA);
        if (bui == null) {
            new Object[1][0] = Integer.valueOf(atjv.bA);
        } else if (bui.c) {
            int size = bui.b.size();
            if (size == 0) {
                ((anih) ((anih) bxk.a.d()).a("bui", "a", 179, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] removedExistingInterest: no producer active intervals");
                return;
            }
            int i = size - 1;
            if (!((buh) bui.b.get(i)).b) {
                ((anih) ((anih) bxk.a.d()).a("bui", "a", 183, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] removedExistingInterest: latest is not active");
                return;
            }
            buh buh = (buh) bui.b.get(i);
            if (buh.b) {
                for (HashMap values : buh.a.b()) {
                    Iterator it = values.values().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((bty) it.next()).b) {
                                return;
                            }
                        }
                    }
                }
                aucd aucd = buh.e;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                atos atos = (atos) aucd.b;
                atos atos2 = atos.d;
                atos.a |= 2;
                atos.c = a2;
                buh.b = false;
                bui.c = false;
                this.a = true;
            }
        }
    }

    public final void a(int i, boolean z, int i2) {
        if (i >= 0) {
            bud bud = (bud) this.g.get(i);
            if (bud == null) {
                bud = new bud(i);
                this.g.put(i, bud);
            }
            if (i2 != 1) {
                bud.b++;
                if (!z) {
                    bud.d++;
                }
            } else {
                bud.c++;
                if (!z) {
                    bud.e++;
                }
            }
            this.a = true;
        }
    }

    public final void a(atjv atjv, int i) {
        boolean z;
        bug bug = this.e;
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                buf a2 = bug.a(atjv);
                if (atjv == a2.a) {
                    z = true;
                } else {
                    z = false;
                }
                iva.b(z);
                switch (i) {
                    case 5:
                        a2.b++;
                        break;
                    case 6:
                        a2.c++;
                        break;
                    case 7:
                        a2.f++;
                        break;
                    case 8:
                        a2.g++;
                        break;
                    case 9:
                        a2.i++;
                        break;
                    case 10:
                        a2.h++;
                        break;
                    case 11:
                        a2.d++;
                        break;
                    case 12:
                        a2.e++;
                        break;
                    default:
                        ((anih) ((anih) bxk.a.b()).a("buf", "a", 251, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[GcmSyncStatisticsImpl] Context recd stats incorrect mode %d", i);
                        return;
                }
                this.a = true;
                return;
            default:
                ((anih) ((anih) bxk.a.b()).a("bug", "a", 136, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[GcmSyncStatisticsImpl] Context recd stats incorrect mode %d", i);
                return;
        }
    }

    public final void a(atjv atjv, int i, int i2) {
        boolean z;
        buf a2 = this.e.a(atjv);
        boolean z2 = false;
        if (atjv == a2.a) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        if (i2 >= 0) {
            z2 = true;
        }
        iva.b(z2);
        if (i == 7) {
            a2.k += i2;
        } else if (i == 8) {
            a2.l += i2;
        } else if (i != 13) {
            ((anih) ((anih) bxk.a.b()).a("buf", "a", 274, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[GcmSyncStatisticsImpl] Context recd stats incorrect mode %d", i);
            return;
        } else {
            a2.j += i2;
        }
        this.a = true;
    }

    public final void a(bsz bsz, atjv atjv) {
        long a2 = cbi.i().a();
        bui bui = (bui) this.b.get(atjv.bA);
        if (bui == null) {
            bui = new bui(atjv);
            this.b.put(atjv.bA, bui);
        }
        if (!bui.c) {
            int size = bui.b.size();
            if (size <= 0 || !((buh) bui.b.get(size - 1)).b) {
                if (bui.b.add(new buh(a2))) {
                    int at = (int) awuz.a.a().at();
                    if (bui.b.size() >= at) {
                        bui.b.subList(0, at / 2).clear();
                    }
                    bui.c = true;
                    this.a = true;
                }
            }
        }
    }

    public final void a(bsz bsz, cas cas) {
        long a2 = cbi.i().a();
        bui bui = (bui) this.b.get(cas.b().bA);
        if (bui == null) {
            new Object[1][0] = Integer.valueOf(cas.b().bA);
        } else if (bui.b(cas, a2)) {
            this.a = true;
        }
    }

    public final void a(bsz bsz, cas cas, cas cas2) {
        long a2 = cbi.i().a();
        bui bui = (bui) this.b.get(cas.b().bA);
        boolean z = false;
        if (bui != null) {
            if (cas.b() != bui.a) {
                ((anih) ((anih) bxk.a.d()).a("bui", "a", 212, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] addInterestRecord: context name mismatch: mContextName=%s, added=%s", bui.a.bA, (Object) cas);
            } else if (!bui.c) {
                ((anih) ((anih) bxk.a.d()).a("bui", "a", 221, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] addInterestRecord: not active: added=%s", (Object) cas);
            } else {
                int size = bui.b.size();
                if (size == 0) {
                    ((anih) ((anih) bxk.a.d()).a("bui", "a", 228, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] addInterestRecord: no elements: added=%s", (Object) cas);
                } else {
                    int i = size - 1;
                    if (!((buh) bui.b.get(i)).b) {
                        ((anih) ((anih) bxk.a.d()).a("bui", "a", 234, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] addInterestRecord: producer inactive, added=%s", (Object) cas);
                    } else {
                        buh buh = (buh) bui.b.get(i);
                        if (buh.b) {
                            bua bua = new bua(cas.b.a(), cas.b.b());
                            bty bty = new bty(cas, a2);
                            btz btz = buh.a;
                            if (!btz.a.containsKey(bua) || !((HashMap) btz.a.get(bua)).containsKey(bty.a)) {
                                z = buh.a.a(bua, bty);
                            } else {
                                Object[] objArr = {bua, bty, cas};
                            }
                        } else {
                            new Object[1][0] = cas;
                        }
                    }
                }
            }
            if (cas2 == null || cas2.b() != cas.b()) {
                if (!z) {
                    return;
                }
            } else if (!z || !bui.b(cas2, a2)) {
                return;
            }
            this.a = true;
            return;
        }
        new Object[1][0] = cas;
    }

    public final void a(ContextData contextData, ContextManagerClientInfo contextManagerClientInfo) {
        if (contextData.j().a() != 3) {
            bui bui = (bui) this.b.get(contextData.g());
            if (bui == null) {
                new Object[1][0] = Integer.valueOf(contextData.g());
                return;
            }
            atjv h = contextData.h();
            if (h != bui.a) {
                ((anih) ((anih) bxk.a.d()).a("bui", "a", 90, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] updateStateForNewContextData: mContextName=%s != contextName=%s", bui.a.bA, h.bA);
            } else if (!bui.c) {
                ((anih) ((anih) bxk.a.d()).a("bui", "a", 99, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] updateStateForNewContextData: inactive, contextName=%s", h.bA);
            } else {
                int size = bui.b.size();
                if (size == 0) {
                    ((anih) ((anih) bxk.a.d()).a("bui", "a", 108, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] updateStateForNewContextData: no elements, contextName=%s", h.bA);
                    return;
                }
                buh buh = (buh) bui.b.get(size - 1);
                if (!buh.b) {
                    ((anih) ((anih) bxk.a.d()).a("bui", "a", 118, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] updateStateForNewContextData: last not active, contextName=%s", h.bA);
                    buh.a();
                } else {
                    buh.c++;
                }
                this.a = true;
            }
        }
    }

    public final void a(String str, String str2, int i, int i2, int i3) {
        a(str, str2, i, i2, i3, -1);
    }

    public final void a(String str, String str2, int i, int i2, int i3, int i4) {
        int i5;
        if (str != null && str2 != null) {
            bua bua = new bua(str, str2);
            bub bub = (bub) this.d.get(bua);
            if (bub == null) {
                bub = new bub(bua);
                this.d.put(bua, bub);
            }
            if (i3 == 0) {
                i5 = 0;
            } else {
                i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            int i6 = i5 | i2;
            bue bue = (bue) bub.c.get(i6);
            if (bue == null) {
                bue = new bue(i6);
                bub.c.put(i6, bue);
            }
            if (i != 0) {
                if (i == 3) {
                    bue.b++;
                    bue.a(i4);
                } else if (i == 4) {
                    bue.c++;
                    bue.a(i4);
                } else if (i != 5) {
                    ((anih) ((anih) bxk.a.b()).a("bue", "a", 80, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceTriggerStatsImpl] Incorrect operation code %d", i);
                    return;
                }
                this.a = true;
            } else if (bue.a == 1) {
                bue.d++;
                this.a = true;
            }
            bue.e++;
            this.a = true;
        }
    }
}
