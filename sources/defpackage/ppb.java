package defpackage;

/* renamed from: ppb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ppb implements Comparable {
    final ppa a;
    final int b;

    public ppb(String str, String str2, int i, int i2) {
        ppa ppa = new ppa();
        this.a = ppa;
        ppa.a = str;
        ppa.b = str2;
        int i3 = 4;
        ppa.c = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "none" : "tentative" : "invited" : "declined" : "accepted";
        i3 = i != 1 ? i != 2 ? 2 : 0 : i3;
        this.b = i2 == 1 ? i3 + 1 : i3;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ppb ppb = (ppb) obj;
        int i = this.b - ppb.b;
        return i == 0 ? ppb.a.compareTo(this.a) : i;
    }
}
