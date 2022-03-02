package defpackage;

import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: ahqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahqu implements ajpi {
    public final ahqs a;
    public final aizy b;
    public final aibh c;
    private final ahqv d;

    public ahqu(aizy aizy, ajaa ajaa, aizz aizz) {
        File file;
        if (ajaa.a() != null) {
            file = new File(ajaa.a(), "nlp_devices");
        } else {
            file = null;
        }
        this.b = aizy;
        this.c = new aibh(2, aizz.a(), 3, aizz.b(), ajck.bT, file, ahqr.a);
        this.d = new ahqv();
        this.a = new ahqs(this.d);
    }

    public final ahqt a(long j, long j2) {
        ahqt a2 = this.a.a(j);
        if (a2 == null) {
            a2 = new ahqt(j);
            this.a.a(a2);
            this.d.c();
        }
        a2.b = ahqt.a(j2);
        return a2;
    }

    public final void b() {
        long c2 = this.b.c() - 604800000;
        Iterator c3 = c();
        while (c3.hasNext()) {
            ahqt ahqt = (ahqt) c3.next();
            short s = ahqt.b;
            if (s == Short.MAX_VALUE) {
                c3.remove();
            } else if (((long) s) * 86400000 < c2) {
                c3.remove();
                this.d.b();
                Locale locale = Locale.ENGLISH;
                new Object[1][0] = Long.valueOf(ahqt.a);
            }
        }
    }

    public final Iterator c() {
        return this.a.a.values().iterator();
    }

    public final void a() {
        this.d.d();
    }

    public final void a(aqek aqek, long j) {
        aqek.b(11, (Object) this.d.a(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a.a()));
    }

    public final void a(aucd aucd, long j) {
        arti b2 = this.d.b(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a.a());
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        artq artq = (artq) aucd.b;
        artq artq2 = artq.i;
        b2.getClass();
        artq.d = b2;
        artq.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }
}
