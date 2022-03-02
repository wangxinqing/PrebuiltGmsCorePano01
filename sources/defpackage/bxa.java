package defpackage;

/* renamed from: bxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bxa extends bva {
    final /* synthetic */ bxd a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bxa(bxd bxd, String str, Object... objArr) {
        super(str, objArr);
        this.a = bxd;
    }

    public final void a(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            new Object[1][0] = this.a.c;
        } else {
            ((anih) ((anih) bxk.a.c()).a("bxa", "a", 112, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[RegisterContextListenerOperation] fetchAliases failed for %s", (Object) this.a.c);
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            ((anih) ((anih) bxk.a.c()).a("bxa", "a", 112, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[RegisterContextListenerOperation] fetchAliases failed for %s", (Object) this.a.c);
        } else {
            new Object[1][0] = this.a.c;
        }
    }
}
