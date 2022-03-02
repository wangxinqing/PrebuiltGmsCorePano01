package defpackage;

import android.util.Log;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* renamed from: akur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akur implements akin {
    private static final Comparator d = akuq.a;
    private final SemanticLocationEventRequest a;
    private int b = 0;
    private List c = null;
    private final allc e;

    public akur(allc allc, SemanticLocationEventRequest semanticLocationEventRequest) {
        this.e = allc;
        this.a = semanticLocationEventRequest;
    }

    public final void a(akip akip) {
        boolean z;
        int i = akip.g;
        if (i != 0) {
            z = i == 18;
        } else {
            z = true;
        }
        int i2 = !z ? 13 : 0;
        List list = akip.c.b;
        if (azcu.a.a().a()) {
            if (Log.isLoggable("Places", 5)) {
                Log.w("Places", String.format(Locale.US, "Due to flag, forgoing Place Update for %d places, with status: %d.", new Object[]{Integer.valueOf(list.size()), Integer.valueOf(i2)}));
            }
        } else if (i2 == 0) {
            if (this.b != 0) {
                List list2 = this.c;
                int size = list.size();
                int size2 = list2.size();
                StringBuilder sb = new StringBuilder(55);
                sb.append("PlaceLikelihoods list sizes: ");
                sb.append(size);
                sb.append(" vs ");
                sb.append(size2);
                alfy.a(sb.toString());
                if (list.isEmpty() == list2.isEmpty()) {
                    if (!list.isEmpty() || !list2.isEmpty()) {
                        int c2 = (int) azcf.c();
                        if (list.size() == list2.size() || Math.min(list.size(), list2.size()) >= c2) {
                            ArrayList arrayList = new ArrayList(list);
                            ArrayList arrayList2 = new ArrayList(list2);
                            Collections.sort(arrayList, d);
                            Collections.sort(arrayList2, d);
                            int min = Math.min(c2, Math.min(arrayList2.size(), arrayList.size()));
                            int i3 = 0;
                            while (true) {
                                if (i3 >= min) {
                                    float f = ((akhx) arrayList.get(0)).e;
                                    float f2 = ((akhx) arrayList2.get(0)).e;
                                    StringBuilder sb2 = new StringBuilder(60);
                                    sb2.append("Likelihood: ");
                                    sb2.append(f);
                                    sb2.append(" other likelihood:");
                                    sb2.append(f2);
                                    alfy.a(sb2.toString());
                                    if (((double) Math.abs(f - f2)) <= azcf.h()) {
                                        return;
                                    }
                                } else if (!((akhx) arrayList.get(i3)).b.equals(((akhx) arrayList2.get(i3)).b)) {
                                    StringBuilder sb3 = new StringBuilder(63);
                                    sb3.append("Sorted PlaceLikelihoods lists are different at item ");
                                    sb3.append(i3);
                                    alfy.a(sb3.toString());
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            this.b++;
            this.c = list;
            allc allc = this.e;
            allc.a.a(allc.b, allc.c, akip);
        }
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("placeRequest", this.a);
        return a2.toString();
    }
}
