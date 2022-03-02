package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: jtd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jtd implements jte {
    private static final anaf a;
    private static final anaf b;
    private final hol c;
    private final jth d;
    private final avko e;

    static {
        anab anab = new anab();
        anab.a(avko.BABEL, jth.HANGOUTS_CONTACT_SHEET_PAGE);
        anab.a(avko.BIGTOP, jth.INBOX_CONTACT_SHEET_PAGE);
        anab.a(avko.CALENDAR, jth.CALENDAR_CONTACT_SHEET_PAGE);
        anab.a(avko.DOCS, jth.DOCS_CONTACT_SHEET_PAGE);
        anab.a(avko.DRIVE, jth.DRIVE_CONTACT_SHEET_PAGE);
        anab.a(avko.DYNAMITE, jth.DYNAMITE_CONTACT_SHEET_PAGE);
        anab.a(avko.GMAIL, jth.GMAIL_CONTACT_SHEET_PAGE);
        anab.a(avko.GOOGLE_QUICK_SEARCH_BOX, jth.SEARCH_CONTACT_SHEET_PAGE);
        anab.a(avko.GOOGLE_VOICE, jth.VOICE_CONTACT_SHEET_PAGE);
        anab.a(avko.GPLUS, jth.TAU_CONTACT_SHEET_PAGE);
        anab.a(avko.MAPS, jth.MAPS_CONTACT_SHEET_PAGE);
        anab.a(avko.TEST_APPLICATION, jth.TEST_CONTACT_SHEET_PAGE);
        anab.a(avko.PLAY_STORE, jth.PLAY_STORE_CONTACT_SHEET_PAGE);
        a = anab.a();
        anab anab2 = new anab();
        anab2.a(auuv.BABEL, avko.BABEL);
        anab2.a(auuv.BIGTOP, avko.BIGTOP);
        anab2.a(auuv.CALENDAR, avko.CALENDAR);
        anab2.a(auuv.DOCS, avko.DOCS);
        anab2.a(auuv.DRIVE, avko.DRIVE);
        anab2.a(auuv.DYNAMITE, avko.DYNAMITE);
        anab2.a(auuv.GMAIL, avko.GMAIL);
        anab2.a(auuv.GOOGLE_QUICK_SEARCH_BOX, avko.GOOGLE_QUICK_SEARCH_BOX);
        anab2.a(auuv.GOOGLE_VOICE, avko.GOOGLE_VOICE);
        anab2.a(auuv.GPLUS, avko.GPLUS);
        anab2.a(auuv.MAPS, avko.MAPS);
        anab2.a(auuv.TEST_APPLICATION, avko.TEST_APPLICATION);
        anab2.a(auuv.PLAY_STORE, avko.PLAY_STORE);
        b = anab2.a();
    }

    public jtd(hol hol, auuv auuv) {
        this.c = hol;
        avko avko = (avko) b.getOrDefault(auuv, avko.UNKNOWN_APPLICATION);
        this.e = avko;
        this.d = (jth) a.getOrDefault(avko, jth.SMART_PROFILE_PAGE);
    }

    public static final aucd a(jtg jtg, jth... jthArr) {
        aucd o = anod.f.o();
        int intValue = jtg.a().intValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anod anod = (anod) o.b;
        anod.a |= 1;
        anod.b = intValue;
        if (jtg.b() != null) {
            int intValue2 = jtg.b().intValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anod anod2 = (anod) o.b;
            anod2.a |= 2;
            anod2.c = intValue2;
        }
        if (r5 > 0) {
            ArrayList arrayList = new ArrayList();
            for (jth jth : jthArr) {
                arrayList.add(Integer.valueOf(jth.ag));
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            anod anod3 = (anod) o.b;
            if (!anod3.d.a()) {
                anod3.d = aucj.a(anod3.d);
            }
            auab.a((Iterable) arrayList, (List) anod3.d);
        }
        return o;
    }

    public final void a(aujr aujr) {
        aucd o = atfk.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atfk atfk = (atfk) o.b;
        aujr.getClass();
        atfk.b = aujr;
        atfk.a |= 1;
        aucd o2 = atfj.d.o();
        aucd o3 = atfm.c.o();
        avko avko = this.e;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        atfm atfm = (atfm) o3.b;
        atfm.b = avko.S;
        atfm.a |= 1;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atfj atfj = (atfj) o2.b;
        atfm atfm2 = (atfm) o3.i();
        atfm2.getClass();
        atfj.b = atfm2;
        atfj.a |= 1;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atfj atfj2 = (atfj) o2.b;
        atfj2.c = 2;
        atfj2.a |= 2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atfk atfk2 = (atfk) o.b;
        atfj atfj3 = (atfj) o2.i();
        atfj3.getClass();
        atfk2.c = atfj3;
        atfk2.a |= 2;
        this.c.a((hok) new jtc((atfk) o.i())).b();
    }

    public final jth[] a(jth... jthArr) {
        int length = jthArr.length;
        if (length != 0) {
            jth[] jthArr2 = (jth[]) Arrays.copyOf(jthArr, length + 1);
            jthArr2[length] = this.d;
            return jthArr2;
        }
        return new jth[]{this.d};
    }
}
