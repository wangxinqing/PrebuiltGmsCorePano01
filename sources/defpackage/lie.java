package defpackage;

import com.android.volley.VolleyError;
import java.util.List;

/* renamed from: lie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lie implements Runnable {
    final /* synthetic */ lih a;

    public lie(lih lih) {
        this.a = lih;
    }

    public final void run() {
        khq khq;
        try {
            lih lih = this.a;
            lih.h.clear();
            boolean z = false;
            while (true) {
                if (lih.m.b()) {
                    if (z) {
                        break;
                    }
                    kkf kkf = lih.b;
                    String a2 = kld.LAST_SYNC_SEQUENCE_NUMBER.l.a();
                    String b = kle.a.b();
                    String a3 = kle.a.a.a();
                    String a4 = kmj.ACCOUNT_ID.c.a();
                    int length = String.valueOf(a2).length();
                    StringBuilder sb = new StringBuilder(length + 23 + String.valueOf(b).length() + String.valueOf(a3).length() + String.valueOf(a4).length());
                    sb.append("(SELECT ");
                    sb.append(a2);
                    sb.append(" FROM ");
                    sb.append(b);
                    sb.append(" WHERE ");
                    sb.append(a3);
                    sb.append("=");
                    sb.append(a4);
                    sb.append(")");
                    String sb2 = sb.toString();
                    String a5 = kne.LAST_SYNC_SEQUENCE_NUMBER.aB.a();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(a5).length() + 1 + String.valueOf(sb2).length());
                    sb3.append(a5);
                    sb3.append("<");
                    sb3.append(sb2);
                    kqy a6 = kqz.a(sb3.toString());
                    kqh kqh = kne.PINNED.aB;
                    long j = kpd.UNPINNED.d;
                    kqh.b(1);
                    for (kmp kmp : ((kjp) kkf).a((kkz) null, "EntryView", kqz.a(kqz.b(kqh.a(), j), a6), (String) null).a()) {
                        lih.a.a("Stale pinned entry %s %s", kmp.g(), kmp.P());
                        if (!kmp.ab()) {
                            if (!kmp.ai()) {
                                khq = khq.a(lih.b.c(kmp.ac()));
                            } else {
                                khq = lih.b(kmp);
                                if (khq == null) {
                                }
                            }
                            try {
                                lih.i.a(khq, kmp.i(), lnk.a);
                            } catch (VolleyError | eif e) {
                                lih.a.a("%s sync failed", kmp);
                            }
                        }
                    }
                    List<kmp> a7 = ((kjp) lih.b).a((kkz) null, "PinnedDownloadRequiredView", kqz.a, (String) null).a();
                    synchronized (lih.g) {
                        for (kmp kmp2 : a7) {
                            if (lih.g.size() >= ((Integer) jzq.aa.c()).intValue()) {
                                break;
                            } else if (!lih.g.containsKey(kmp2.a())) {
                                kkz c = lih.b.c(kmp2.ac());
                                lhi a8 = lih.l.a(true, (khq) null);
                                a8.c((jzy) null);
                                int a9 = lih.a(kmp2, (lht) a8);
                                if (a9 == 1) {
                                    lih.a.a("PinnedContentDownloader", "Queueing download of file (%s of %s): %s", Integer.valueOf(lih.g.size() + 1), jzq.aa.c(), kmp2.a());
                                    knc a10 = kmp2.a();
                                    lif lif = new lif(lih, c, a10, a8);
                                    lih.g.put(a10, lif);
                                    ((jfz) lih.f).submit((Runnable) lif);
                                } else {
                                    lih.a(kmp2, a9);
                                    a8.f();
                                }
                            }
                        }
                        z = lih.g.isEmpty();
                        if (!z) {
                            lih.g.wait();
                        }
                    }
                } else {
                    break;
                }
            }
            lih.a.a("PinnedContentDownloader", !z ? "Stopped downloading pinned content because the device is offline." : "Finished downloading pinned content.");
        } catch (InterruptedException e2) {
        } catch (Exception e3) {
            lih.a.c("PinnedContentDownloader", "Pinned content download task failed.", e3);
        }
    }
}
