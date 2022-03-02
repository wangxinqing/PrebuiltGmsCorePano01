package defpackage;

/* renamed from: rbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rbo {
    public final anaf a;
    private final anaf b;
    private final afuk c;

    public rbo(anaf anaf, anaf anaf2, auco auco) {
        this.a = anaf;
        this.b = anaf2;
        this.c = afuk.a(auco, 1);
    }

    public final afuk a(String str) {
        afuk afuk = (afuk) this.b.get(str);
        return afuk == null ? this.c : afuk;
    }
}
