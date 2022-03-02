package defpackage;

/* renamed from: baml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baml extends bacz {
    public static final batd a = new batd();
    public final baaj b;
    public final String c;
    public final balm d;
    public final String e;
    public Object f;
    public volatile int g = -1;
    public final bamk h;
    public final boolean i = false;
    private final bamj j = new bamj(this);
    private final azxa k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public baml(baaj baaj, baaf baaf, bamd bamd, bamt bamt, banf banf, Object obj, int i2, int i3, String str, String str2, balm balm, balu balu, azxh azxh) {
        super(new banc(), balm, balu, baaf, azxh);
        balm balm2 = balm;
        amrl.a((Object) balm2, (Object) "statsTraceCtx");
        this.d = balm2;
        this.b = baaj;
        this.e = str;
        this.c = str2;
        bamt bamt2 = bamt;
        this.k = bamt2.o;
        this.h = new bamk(this, i2, balm, obj, bamd, banf, bamt2, i3);
    }

    public final azxa a() {
        return this.k;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ bacx b() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ bade c() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ bade d() {
        return this.h;
    }

    public final baai h() {
        return this.b.a;
    }
}
