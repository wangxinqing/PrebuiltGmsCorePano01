package defpackage;

import android.os.Build;
import com.google.android.gms.R;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;

/* renamed from: pno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pno {
    public static final pno a;
    public static final pno b = new pno(pnq.b);
    public static final pno c = new pno(pnq.c);
    public static final pno d;
    public static final anax e;
    public static final anaf f;
    private final pnq g;

    static {
        pnq pnq = pnq.a;
        new GlobalSearchApplicationInfo((String) null, (String) null, R.string.icing_contacts_corpus_label, R.string.icing_contacts_corpus_description, R.drawable.quantum_ic_contacts_grey600_48, "android.intent.action.VIEW", (String) null, (String) null);
        a = new pno(pnq);
        pno pno = new pno(pnq.d);
        d = pno;
        e = anax.a(a, b, c, pno);
        anab anab = new anab();
        anab.a(a.a(), "android.permission.READ_CONTACTS");
        anab.a(b.a(), "android.permission.READ_CONTACTS");
        anab.a("internal.3p:Event", "android.permission.READ_CALENDAR");
        anab.a("internal.3p:Message", "android.permission.READ_SMS");
        anab.a(c.a(), "android.permission.READ_CONTACTS");
        anab.a(d.a(), "android.permission.READ_CONTACTS");
        anab.a("sms", "android.permission.READ_SMS");
        int i = Build.VERSION.SDK_INT;
        anab.a("internal.3p:MusicAlbum", "android.permission.READ_EXTERNAL_STORAGE");
        anab.a("internal.3p:MusicGroup", "android.permission.READ_EXTERNAL_STORAGE");
        anab.a("internal.3p:MusicPlaylist", "android.permission.READ_EXTERNAL_STORAGE");
        anab.a("internal.3p:MusicRecording", "android.permission.READ_EXTERNAL_STORAGE");
        f = anab.a();
    }

    public pno(pnq pnq) {
        this.g = pnq;
    }

    public final String a() {
        return this.g.b();
    }

    public final dvj b() {
        return this.g.c();
    }

    public final String toString() {
        String a2 = a();
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 16);
        sb.append("InternalCorpus[");
        sb.append(a2);
        sb.append("]");
        return sb.toString();
    }
}
