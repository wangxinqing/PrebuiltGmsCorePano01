package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hte  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hte implements htg {
    private final Context a;
    private final hph b;
    private final hol c;
    private final Map d = new HashMap();
    private hpf e;

    public hte(Context context, hol hol, hph hph) {
        this.a = context;
        this.c = hol;
        this.b = hph;
        hph.a();
    }

    private static void a(aucd aucd, avtn avtn) {
        if ((avtn.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            avrp avrp = (avrp) amri.c(avrp.a(avtn.d)).a((Object) avrp.UNKNOWN);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            anuk anuk = (anuk) aucd.b;
            anuk anuk2 = anuk.j;
            anuk.c = avrp.yv;
            anuk.a |= 2;
            return;
        }
        String str = avtn.i;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anuk anuk3 = (anuk) aucd.b;
        anuk anuk4 = anuk.j;
        str.getClass();
        anuk3.a |= 1;
        anuk3.b = str;
    }

    public final void b(avtn avtn, int i) {
        hph hph = this.b;
        aucd o = anuk.j.o();
        a(o, avtn);
        boolean a2 = hwr.a(this.a);
        if (o.c) {
            o.c();
            o.c = false;
        }
        anuk anuk = (anuk) o.b;
        anuk.a |= 4;
        anuk.d = a2;
        boolean b2 = hwr.b(this.a);
        if (o.c) {
            o.c();
            o.c = false;
        }
        anuk anuk2 = (anuk) o.b;
        anuk2.a |= 8;
        anuk2.e = b2;
        if ((avtn.a & 1024) != 0) {
            avsd avsd = (avsd) amri.c(avsd.a(avtn.k)).a((Object) avsd.DEFAULT);
            if (o.c) {
                o.c();
                o.c = false;
            }
            anuk anuk3 = (anuk) o.b;
            anuk3.f = avsd.f;
            anuk3.a |= 16;
        }
        anuk anuk4 = (anuk) o.b;
        anuk4.h = i - 1;
        anuk4.a |= 64;
        hph.a(a((anuk) o.i()));
        this.b.c("HttpRequest").a();
    }

    public final void c(avtn avtn, long j) {
        this.b.a(b(avtn));
        this.b.e("RequestUploadDelay").a(j);
    }

    public final void close() {
        this.b.d();
    }

    private final byte[] a(anuk anuk) {
        if (!this.d.containsKey(anuk)) {
            this.d.put(anuk, anuk.k());
        }
        return (byte[]) this.d.get(anuk);
    }

    public final void a() {
        this.b.a((byte[]) null);
        this.b.c("PseudonymousIdFailures").a();
    }

    public final void a(int i) {
        this.b.a((byte[]) null);
        hpf hpf = this.e;
        if (hpf != null) {
            hpg hpg = hpf.b;
            jiq jiq = hpf.c.e.d;
            hpg.a(SystemClock.elapsedRealtime() - hpf.a, hph.b);
        }
        hph hph = this.b;
        aucd o = anuk.j.o();
        boolean a2 = hwr.a(this.a);
        if (o.c) {
            o.c();
            o.c = false;
        }
        anuk anuk = (anuk) o.b;
        anuk.a |= 4;
        anuk.d = a2;
        boolean b2 = hwr.b(this.a);
        if (o.c) {
            o.c();
            o.c = false;
        }
        anuk anuk2 = (anuk) o.b;
        anuk2.a |= 8;
        anuk2.e = b2;
        hph.a(a((anuk) o.i()));
        this.b.d("ResponseStatus").a(i);
        StringBuilder sb = new StringBuilder(34);
        sb.append("ResponseStatus of code ");
        sb.append(i);
        sb.toString();
    }

    public final void b(avtn avtn, long j) {
        this.b.a(b(avtn));
        if (j > -1) {
            this.b.e("RequestHeaderSize").a(j);
            StringBuilder sb = new StringBuilder(38);
            sb.append("RequestHeaderSize=");
            sb.append(j);
            sb.toString();
        }
    }

    /* access modifiers changed from: package-private */
    public final byte[] b(avtn avtn) {
        aucd o = anuk.j.o();
        a(o, avtn);
        boolean a2 = hwr.a(this.a);
        if (o.c) {
            o.c();
            o.c = false;
        }
        anuk anuk = (anuk) o.b;
        anuk.a |= 4;
        anuk.d = a2;
        boolean b2 = hwr.b(this.a);
        if (o.c) {
            o.c();
            o.c = false;
        }
        anuk anuk2 = (anuk) o.b;
        anuk2.a |= 8;
        anuk2.e = b2;
        if ((avtn.a & 1024) != 0) {
            avsd avsd = (avsd) amri.c(avsd.a(avtn.k)).a((Object) avsd.DEFAULT);
            if (o.c) {
                o.c();
                o.c = false;
            }
            anuk anuk3 = (anuk) o.b;
            anuk3.f = avsd.f;
            anuk3.a |= 16;
        }
        return a((anuk) o.i());
    }

    public final void a(int i, String str) {
        if (awtj.a.a().b()) {
            if (str != null) {
                this.b.a(b(str));
            } else {
                this.b.a((byte[]) null);
            }
            this.b.d("GetAuthToken").a(i);
        }
    }

    public final void a(int i, byte[] bArr) {
        this.b.a((byte[]) null);
        this.b.c("LogResponseParseError").a();
        aucd o = anum.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anum anum = (anum) o.b;
        anum.a |= 1;
        anum.b = i;
        auay a2 = auay.a(bArr);
        if (o.c) {
            o.c();
            o.c = false;
        }
        anum anum2 = (anum) o.b;
        a2.getClass();
        anum2.a |= 2;
        anum2.c = a2;
        anum anum3 = (anum) o.i();
        aucd o2 = anul.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anul anul = (anul) o2.b;
        anum3.getClass();
        anul.b = anum3;
        anul.a |= 2;
        hoi a3 = this.c.a((audx) (anul) o2.i());
        a3.d = "METALOG";
        a3.b();
    }

    /* access modifiers changed from: package-private */
    public final byte[] b(String str) {
        aucd o = anuk.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anuk anuk = (anuk) o.b;
        str.getClass();
        anuk.a |= 1;
        anuk.b = str;
        return a((anuk) o.i());
    }

    public final void a(avtn avtn) {
        this.b.a(b(avtn));
        hpg f = this.b.f("RequestLatency");
        this.e = new hpf(f, f);
    }

    public final void a(avtn avtn, int i) {
        this.b.a(b(avtn));
        this.b.d("OversizeBatchedLogRequests").a(i);
    }

    public final void a(avtn avtn, long j) {
        this.b.a(b(avtn));
        if (j > -1) {
            this.b.e("RequestSize").a(j);
            StringBuilder sb = new StringBuilder(32);
            sb.append("RequestSize=");
            sb.append(j);
            sb.toString();
        }
    }

    public final void a(hva hva) {
        this.b.a((byte[]) null);
        if (hva == null) {
            return;
        }
        if (hva.b != 0 || hva.d != 0 || hva.f != 0 || hva.h != 0 || hva.a != 0 || hva.e != 0 || hva.g != 0 || hva.c != 0 || hva.i != 0 || !hva.j.isEmpty()) {
            hva.toString();
            this.b.c("CleanupOccurrence").a();
            if (hva.b != 0) {
                this.b.e("CleanupNumBytesDeletedOverSize").a(hva.b);
            }
            if (hva.d != 0) {
                this.b.e("CleanupNumCorruptContextsDeleted").a(hva.d);
            }
            if (hva.f != 0) {
                this.b.e("CleanupNumEventsDeletedOversize").a(hva.f);
            }
            if (hva.h != 0) {
                this.b.e("CleanupNumContextsRecycled").a(hva.h);
            }
            if (hva.a != 0) {
                this.b.e("CleanupNumBytesDeletedTooOld").a(hva.a);
            }
            if (hva.e != 0) {
                this.b.e("CleanupNumEventsDeletedTooOld").a(hva.e);
            }
            if (hva.g != 0) {
                this.b.e("CleanupNumEventsDeletedCorruptPLC").a(hva.g);
            }
            if (hva.c != 0) {
                this.b.e("CleanupNumBytesDeletedCorruptPLC").a(hva.c);
            }
            if (!hva.j.isEmpty()) {
                for (Map.Entry entry : hva.j.entrySet()) {
                    hph hph = this.b;
                    hve hve = (hve) entry.getKey();
                    aucd o = anuj.e.o();
                    long j = hve.b;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    anuj anuj = (anuj) o.b;
                    int i = anuj.a | 1;
                    anuj.a = i;
                    anuj.b = j;
                    long j2 = hve.c;
                    int i2 = i | 2;
                    anuj.a = i2;
                    anuj.c = j2;
                    long j3 = hve.d;
                    anuj.a = i2 | 4;
                    anuj.d = j3;
                    anuj anuj2 = (anuj) o.i();
                    aucd o2 = anuk.j.o();
                    String str = hve.a;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anuk anuk = (anuk) o2.b;
                    str.getClass();
                    int i3 = anuk.a | 1;
                    anuk.a = i3;
                    anuk.b = str;
                    anuj2.getClass();
                    anuk.i = anuj2;
                    anuk.a = i3 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    hph.a(a((anuk) o2.i()));
                    this.b.c("LogFilesDeletedDueToTTL").a(((Long) entry.getValue()).longValue());
                }
            }
        }
    }

    public final void a(hvg hvg) {
        this.b.a((byte[]) null);
        String k = hvg.k();
        try {
            long b2 = hvg.b();
            this.b.e(String.valueOf(k).concat("TotalStorage")).a(b2);
            StringBuilder sb = new StringBuilder(41);
            sb.append("TotalStorage of size ");
            sb.append(b2);
            sb.toString();
        } catch (SQLiteException | IOException e2) {
            Log.e("CountersMetaLogger", "Couldn't log total storage size.", e2);
        }
        try {
            long e3 = hvg.e();
            this.b.e(String.valueOf(k).concat("PlayLoggerContextNum")).a(e3);
            StringBuilder sb2 = new StringBuilder(47);
            sb2.append("Num of PlayLoggerContexts: ");
            sb2.append(e3);
            sb2.toString();
        } catch (SQLiteException | IOException e4) {
            Log.e("CountersMetaLogger", "Couldn't log play logger context num.", e4);
        }
        try {
            if (!hvg.d()) {
                Map c2 = hvg.c();
                if (c2 != null) {
                    for (Map.Entry entry : c2.entrySet()) {
                        huy huy = (huy) entry.getValue();
                        this.b.a(b((String) entry.getKey()));
                        if (huy.b != 0) {
                            this.b.e(String.valueOf(k).concat("PlcNumPerLogSource")).a(huy.b);
                        }
                        if (huy.a != 0) {
                            this.b.e(String.valueOf(k).concat("SizePerLogSource")).a(huy.a);
                        }
                        if (huy.c != 0) {
                            this.b.e(String.valueOf(k).concat("NumFilesPerLogSource")).a(huy.c);
                        }
                    }
                }
                try {
                    String k2 = hvg.k();
                    for (Map.Entry entry2 : hvg.j().entrySet()) {
                        hph hph = this.b;
                        hvf hvf = (hvf) entry2.getKey();
                        aucd o = anuk.j.o();
                        String str = hvf.a;
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        anuk anuk = (anuk) o.b;
                        str.getClass();
                        int i = anuk.a | 1;
                        anuk.a = i;
                        anuk.b = str;
                        String str2 = hvf.b;
                        str2.getClass();
                        anuk.a = i | 32;
                        anuk.g = str2;
                        hph.a(a((anuk) o.i()));
                        this.b.c(String.valueOf(k2).concat("LogDropCount")).a((long) ((Integer) entry2.getValue()).intValue());
                    }
                } catch (IOException e5) {
                    Log.i("CountersMetaLogger", "Could not retrieve the number of dropped logs.", e5);
                }
            } else {
                Log.i("CountersMetaLogger", "Storage is overflowing - bailing on size by log source");
            }
        } catch (SQLiteException | IOException e6) {
            Log.e("CountersMetaLogger", "Couldn't read database - bailing on size by log source", e6);
        }
    }

    public final void a(String str) {
        this.b.c(str).a();
    }
}
