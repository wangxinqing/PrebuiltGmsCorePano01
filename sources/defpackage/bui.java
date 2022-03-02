package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: bui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bui {
    public final atjv a;
    public final ArrayList b;
    public boolean c = false;

    public bui(atjv atjv) {
        this.a = atjv;
        this.b = new ArrayList();
    }

    public final boolean a(long j) {
        if (!this.c) {
            return false;
        }
        int size = this.b.size();
        if (size == 0) {
            ((anih) ((anih) bxk.a.d()).a("bui", "a", 179, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] removedExistingInterest: no producer active intervals");
            return false;
        }
        int i = size - 1;
        if (!((buh) this.b.get(i)).b) {
            ((anih) ((anih) bxk.a.d()).a("bui", "a", 183, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] removedExistingInterest: latest is not active");
            return false;
        }
        buh buh = (buh) this.b.get(i);
        if (buh.b) {
            loop0:
            for (HashMap values : buh.a.b()) {
                Iterator it = values.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((bty) it.next()).b) {
                            break loop0;
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
            atos.c = j;
            buh.b = false;
            this.c = false;
            return true;
        }
        return false;
    }

    public final boolean b(cas cas, long j) {
        bty bty;
        if (cas.b() != this.a) {
            ((anih) ((anih) bxk.a.d()).a("bui", "b", 259, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] removeInterestRecord: contextName different, mContextName=%s, removed=%s", this.a.bA, (Object) cas);
            return false;
        } else if (!this.c) {
            ((anih) ((anih) bxk.a.d()).a("bui", "b", 270, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] removeInterestRecord: not active, removed=%s", (Object) cas);
            return false;
        } else {
            int size = this.b.size();
            if (size == 0) {
                ((anih) ((anih) bxk.a.d()).a("bui", "b", 277, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] removeInterestRecord: no producer active intervals, removed=%s", (Object) cas);
                return false;
            }
            int i = size - 1;
            if (!((buh) this.b.get(i)).b) {
                ((anih) ((anih) bxk.a.d()).a("bui", "b", 285, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] removeInterestRecord: last producer active interval inactive, removed=%s", (Object) cas);
                return false;
            }
            buh buh = (buh) this.b.get(i);
            if (!buh.b) {
                return false;
            }
            bua bua = new bua(cas.b.a(), cas.b.b());
            if (!buh.a.a(bua, cas)) {
                return false;
            }
            btz btz = buh.a;
            if (btz.a(bua, cas)) {
                bty = (bty) ((HashMap) btz.a.get(bua)).get(cas);
            } else {
                bty = null;
            }
            return bty.a(j);
        }
    }

    public final boolean a(atjv atjv) {
        if (atjv != this.a) {
            ((anih) ((anih) bxk.a.d()).a("bui", "a", 90, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] updateStateForNewContextData: mContextName=%s != contextName=%s", this.a.bA, atjv.bA);
            return false;
        } else if (!this.c) {
            ((anih) ((anih) bxk.a.d()).a("bui", "a", 99, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] updateStateForNewContextData: inactive, contextName=%s", atjv.bA);
            return false;
        } else {
            int size = this.b.size();
            if (size == 0) {
                ((anih) ((anih) bxk.a.d()).a("bui", "a", 108, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] updateStateForNewContextData: no elements, contextName=%s", atjv.bA);
                return false;
            }
            buh buh = (buh) this.b.get(size - 1);
            if (buh.b) {
                buh.c++;
                return true;
            }
            ((anih) ((anih) bxk.a.d()).a("bui", "a", 118, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] updateStateForNewContextData: last not active, contextName=%s", atjv.bA);
            buh.a();
            return true;
        }
    }

    public final boolean a(cas cas, long j) {
        if (cas.b() != this.a) {
            ((anih) ((anih) bxk.a.d()).a("bui", "a", 212, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] addInterestRecord: context name mismatch: mContextName=%s, added=%s", this.a.bA, (Object) cas);
            return false;
        } else if (!this.c) {
            ((anih) ((anih) bxk.a.d()).a("bui", "a", 221, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] addInterestRecord: not active: added=%s", (Object) cas);
            return false;
        } else {
            int size = this.b.size();
            if (size == 0) {
                ((anih) ((anih) bxk.a.d()).a("bui", "a", 228, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] addInterestRecord: no elements: added=%s", (Object) cas);
                return false;
            }
            int i = size - 1;
            if (!((buh) this.b.get(i)).b) {
                ((anih) ((anih) bxk.a.d()).a("bui", "a", 234, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerStatusImpl] addInterestRecord: producer inactive, added=%s", (Object) cas);
                return false;
            }
            buh buh = (buh) this.b.get(i);
            if (buh.b) {
                bua bua = new bua(cas.b.a(), cas.b.b());
                bty bty = new bty(cas, j);
                btz btz = buh.a;
                if (!btz.a.containsKey(bua) || !((HashMap) btz.a.get(bua)).containsKey(bty.a)) {
                    return buh.a.a(bua, bty);
                }
                Object[] objArr = {bua, bty, cas};
                return false;
            }
            new Object[1][0] = cas;
            return false;
        }
    }
}
